package io.github.bael.xml;

import com.sun.security.ntlm.Client;
import java.math.BigDecimal;

public class ServiceAntiPattern {
    private BigDecimal debtSum;
    private DebtService debtService;
    private InterestService interestService;
    public BigDecimal CalculateDebtOnToday(Client client) {
        loadCurrentDebt(client);
        calculateInterest();
        return debtSum;
    }

    public void loadCurrentDebt(Client client) {
        debtSum = debtService.loadDebt(client);
    }

    public void calculateInterest(Client client) {
        debtSum = interestService.calculateInterestOnToday(client, debtSum);
    }
}

private class ServiceAntiPatternState {
    private CreateObjectDetails createObjectDetails;

    public void initName(String name) {
        createObjectDetails.name = name;
    }

    public void createObject(Long id) {
        createObjectDetails.id = id;
        return save(createObjectDetails);
    }
}
