package recap;

import java.util.ArrayList;
import java.util.HashSet;

public class CurrencySet extends HashSet<Currency> {

    private static CurrencySet instance;

    private CurrencySet() {
        super();
    }

    public static CurrencySet getInstance() {
        if (instance == null)
            instance = new CurrencySet();
        return instance;
    }

    public Currency get(String code) {
        for (Currency currency : this)
            if (currency.getCode().equalsIgnoreCase(code))
                return currency;
        return null;
    }

    public Currency[] search(String token) {
        ArrayList<Currency> list = new ArrayList<>();
        return list.toArray(new Currency[0]);
    }
}
