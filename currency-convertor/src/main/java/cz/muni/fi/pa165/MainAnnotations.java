package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

public class MainAnnotations {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cz.muni.fi.pa165.currency");

        CurrencyConvertor currencyConvertor = (CurrencyConvertor) context.getBean("currencyConvertorImpl");

        BigDecimal result = currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"),
                BigDecimal.valueOf(1));

        System.out.println(result.toString());
    }
}
