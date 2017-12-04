package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Currency;

public class MainXml {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        CurrencyConvertor currencyConvertor = (CurrencyConvertor) context.getBean("currencyConvertor");

        BigDecimal result = currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"),
                BigDecimal.valueOf(1));

        System.out.println(result.toString());
    }
}
