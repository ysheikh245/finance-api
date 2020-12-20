package com.yusuf.finance;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.util.Calendar;
import java.util.Map;

public class StockFinance {

    public static void main(String[] args) throws Exception {

        String[] symbols = {"AAPL", "BA", "CCL"};

        while(true) {
            Calendar calendar = Calendar.getInstance();
            Map<String, Stock> stocks = YahooFinance.get(symbols);
            System.out.println(calendar.get(Calendar.HOUR) + " " + calendar.get(Calendar.MINUTE) + "  " + appleStock.getQuote().getPrice());
            Thread.sleep(5000);
        }


    }

}
