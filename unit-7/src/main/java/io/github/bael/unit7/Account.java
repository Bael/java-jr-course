package io.github.bael.unit7;

import java.math.BigDecimal;
import java.util.function.Predicate;
// имитация логики работы со счетом
public class Account {

    private boolean isFrozen;

    public BigDecimal getAmount() {
        return amount;
    }

    // Сумма на счете
    private BigDecimal amount;
    // Овердрафт
    private BigDecimal overdraftAmount;
    // Неснижаемый остаток
    private BigDecimal leftoverLimit;
    private String clientStatus;

    public Account(boolean isFrozen, BigDecimal amount, BigDecimal overdraftAmount, String clientStatus, BigDecimal leftoverLimit) {
        this.isFrozen = isFrozen;
        this.amount = amount;
        this.overdraftAmount = overdraftAmount;
        this.clientStatus = clientStatus;
        this.leftoverLimit = leftoverLimit;
    }

    public static Predicate<Account> isAccountable() {
        return account -> !account.isFrozen;
    }

    public static Predicate<Account> isRegular() {
        return account -> account.clientStatus.equals("regular");
    }

    public static Predicate<Account> isPremier() {
        return account -> account.clientStatus.equals("premier");
    }

    public static Predicate<Account> hasPositiveBalance() {
        return account -> account.amount.compareTo(account.leftoverLimit) >= 0;
    }

    public static Predicate<Account> isOverdraftOverflowed() {
        return hasPositiveBalance().or(account -> account.amount.abs().compareTo(account.overdraftAmount) > 0);
    }

    public boolean withdraw(BigDecimal amount) {

        this.amount = this.amount.add(amount.negate());
        if (isAccountable()
            .and(hasPositiveBalance()
                .or(
                    isOverdraftOverflowed().negate()
                        .and(isPremier())))
            .test(this)) {

            return true;
        } else {
            this.amount = this.amount.add(amount);
            return false;
        }
    }


    @Override
    public String toString() {
        return "Account{" +
            "isFrozen=" + isFrozen +
            ", amount=" + amount +
            ", overdraftAmount=" + overdraftAmount +
            ", clientStatus='" + clientStatus + '\'' +
            '}';
    }
}
