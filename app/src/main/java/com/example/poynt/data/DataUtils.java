package com.example.poynt.data;

import com.example.poynt.transactionsscreen.model.Transaction;
import com.example.poynt.transactionsscreen.model.TransactionCategory;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {


    public static List<TransactionCategory> CATEGORY_LIST;

    static {
        CATEGORY_LIST = new ArrayList<>();


        // Category 1
        TransactionCategory c1 = new TransactionCategory();
        c1.setCategory("Food");

        List<Transaction> list = new ArrayList<>();
        Transaction t1 = new Transaction();
        t1.setAmount(20);
        t1.setCategory("Food");
        t1.setDate(System.currentTimeMillis());
        t1.setSummary("Pizza");
        list.add(t1);

        Transaction t2 = new Transaction();
        t2.setAmount(100);
        t2.setCategory("Food");
        t2.setDate(System.currentTimeMillis());
        t2.setSummary("Dinner at xyz");
        list.add(t2);

        c1.setTransactions(list);

        CATEGORY_LIST.add(c1);


        // Category 1
        TransactionCategory c2 = new TransactionCategory();
        c2.setCategory("Grocery");

        list = new ArrayList<>();
        t1 = new Transaction();
        t1.setAmount(20);
        t1.setCategory("Grocery");
        t1.setDate(System.currentTimeMillis());
        t1.setSummary("Safeway");
        list.add(t1);

        t2 = new Transaction();
        t2.setAmount(100);
        t2.setCategory("Grocery");
        t2.setDate(System.currentTimeMillis());
        t2.setSummary("Millets");
        list.add(t2);

        c2.setTransactions(list);


        CATEGORY_LIST.add(c2);

    }
}
