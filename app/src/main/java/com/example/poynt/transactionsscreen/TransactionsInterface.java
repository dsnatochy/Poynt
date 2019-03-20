package com.example.poynt.transactionsscreen;

import com.example.poynt.transactionsscreen.model.TransactionCategory;

import java.util.List;

public interface TransactionsInterface {

    interface View {

        void showTransactionCats(List<TransactionCategory> list);

    }

    interface Presenter {

        void loadData();

        void clickAddNewTransaction();

    }
}
