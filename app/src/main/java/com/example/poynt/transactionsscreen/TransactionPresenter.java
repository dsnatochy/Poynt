package com.example.poynt.transactionsscreen;

import com.example.poynt.data.DataUtils;

import java.lang.ref.WeakReference;

public class TransactionPresenter implements TransactionsInterface.Presenter {


    private WeakReference<TransactionView> mView;

    TransactionPresenter(TransactionView mView) {
        this.mView = new WeakReference<>(mView);
    }

    @Override
    public void loadData() {
        if(mView.get() != null) {
            mView.get().showTransactionCats(DataUtils.CATEGORY_LIST);
        }
    }

    @Override
    public void clickAddNewTransaction() {

    }
}
