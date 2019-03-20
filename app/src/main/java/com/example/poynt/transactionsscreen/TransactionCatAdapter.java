package com.example.poynt.transactionsscreen;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.poynt.R;
import com.example.poynt.transactionsscreen.model.TransactionCategory;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TransactionCatAdapter extends RecyclerView.Adapter<TransactionCatAdapter.TransactionCatViewHolder> {

    private List<TransactionCategory> mCategories;


    TransactionCatAdapter(List<TransactionCategory> mCategories) {
        this.mCategories = mCategories;
    }

    @NonNull
    @Override
    public TransactionCatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TransactionCatViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_transaction_cat, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionCatViewHolder holder, int position) {

        final TransactionCategory elem = mCategories.get(position);

        holder.title.setText(elem.getCategory());

        holder.adapter.updateData(mCategories.get(position).getTransactions());

    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    void updateData(List<TransactionCategory> newData) {
        mCategories  = newData;
        notifyDataSetChanged();
    }

    static class TransactionCatViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.rvTransactions)
        RecyclerView transactionsList;
        @BindView(R.id.tvTitle)
        TextView title;

        TransactionAdapter adapter;

        TransactionCatViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            adapter = new TransactionAdapter(new ArrayList<>());
            transactionsList.setAdapter(adapter);
            transactionsList.setLayoutManager(new LinearLayoutManager(itemView.getContext(), RecyclerView.VERTICAL, false));
        }
    }
}
