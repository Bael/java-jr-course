package io.github.bael.unit7;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;


public class AccountTest {

    @Test
    public void testValidClientWithdraw() {
        Account a = new Account(false, BigDecimal.valueOf(1000),
            BigDecimal.ZERO, "regular", BigDecimal.ZERO);
        assertEquals(true, a.withdraw(BigDecimal.valueOf(999)));
        System.out.println(a);
        assertEquals(true, a.withdraw(BigDecimal.valueOf(1)));
        // no money
        assertEquals(false, a.withdraw(BigDecimal.valueOf(1)));
    }

    @Test
    public void testValidClientWithdrawWithLimit() {
        Account a = new Account(false, BigDecimal.valueOf(1000),
            BigDecimal.ZERO, "regular", BigDecimal.valueOf(1));
        assertEquals(true, a.withdraw(BigDecimal.valueOf(999)));

        // no money
        assertEquals(false, a.withdraw(BigDecimal.valueOf(1)));


    }

    @Test
    public void testPremierClientWithOverdraft() {
        Account a = new Account(false, BigDecimal.valueOf(1000),
            BigDecimal.valueOf(500), "premier", BigDecimal.valueOf(0));
        assertEquals(true, a.withdraw(BigDecimal.valueOf(1000)));

        System.out.println(a);
        // no money?
        assertEquals(true, a.withdraw(BigDecimal.valueOf(500)));

        // no money!
        assertEquals(false, a.withdraw(BigDecimal.valueOf(1)));

        System.out.println(a);

    }



    @Test
    public void predicateAndStreams() {

        List<Account> customers = prepareList();

        assertEquals(3,
            customers.stream()
                     .filter(account -> Account.isPremier()
                                               .test(account))
                     .count());
        assertEquals(1, customers.stream().
            filter(account -> Account.isAccountable()
                                     .negate()
                                     .test(account))
                                 .count());

        assertEquals(2, customers.stream()
                                 .filter(account ->
                                     account.getAmount().compareTo(BigDecimal.valueOf(10000)) >= 0).count());

        long result = customers.stream()
                               .filter(account -> Account.isAccountable().test(account))


                               .map(account -> account.getAmount().longValueExact())
                               .reduce((aLong, aLong2) -> aLong + aLong2).orElse(0L);

        assertEquals(1016000L, result);


    }

    @Test
    public void predicateAndStreams2() {

        List<Account> customers = prepareList();

        // sorting customers
        List<Account> sortedCustomers = customers.stream()
                                                 .sorted(
                                                     Comparator.comparing(Account::getAmount))
                                                 .collect(Collectors.toList());
        System.out.println(sortedCustomers);

        List<Account> sortedCustomers2 = customers.stream().sorted(Comparator.comparing(Account::getAmount))
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        assertArrayEquals(sortedCustomers.toArray(), sortedCustomers2.toArray());

        System.out.println(sortedCustomers2);

    }

    @Test
    public void predicateAndStreams3() {

        List<Account> customers = prepareList();

        // partition by
        System.out.println(customers.stream().collect(
            Collectors.partitioningBy(account -> Account.isPremier().test(account))));


    }

    private List<Account> prepareList() {
        List<Account> customers = Arrays.asList(
            new Account(false, BigDecimal.valueOf(1000), BigDecimal.valueOf(500), "premier", BigDecimal.valueOf(0)),
            new Account(true, BigDecimal.valueOf(2000), BigDecimal.valueOf(500), "regular", BigDecimal.valueOf(0)),
            new Account(false, BigDecimal.valueOf(5000), BigDecimal.valueOf(500), "premier", BigDecimal.valueOf(50)),
            new Account(false, BigDecimal.valueOf(10000), BigDecimal.valueOf(0), "regular", BigDecimal.valueOf(0)),
            new Account(false, BigDecimal.valueOf(1000000), BigDecimal.valueOf(5000000), "premier", BigDecimal.valueOf(0))
        );
        return customers;
    }
}