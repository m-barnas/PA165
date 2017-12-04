package cz.muni.fi.pa165.currency;

import javax.inject.Named;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

@Named
public class ExchangeRateTableImpl implements ExchangeRateTable {

    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) throws ExternalServiceFailureException {
        return sourceCurrency != null
                && targetCurrency != null
                && Objects.equals(sourceCurrency.getCurrencyCode(), "EUR")
                && Objects.equals(sourceCurrency.getCurrencyCode(), "CZK")
                ? new BigDecimal("27") : null;
    }
}
