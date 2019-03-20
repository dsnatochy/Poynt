package com.example.poynt.transactionsscreen;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.poynt.R;
import com.example.poynt.transactionsscreen.model.Transaction;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {


    private List<Transaction> mTransactions;

    public TransactionAdapter(List<Transaction> mTransactions) {
        this.mTransactions = mTransactions;
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        Log.d("Debug", "The data is: " + mTransactions);
        holder.data.setText(mTransactions.get(position).toString());
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TransactionAdapter.TransactionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_transaction, parent, false));
    }


    @Override
    public int getItemCount() {
        return mTransactions.size();
    }

    public void updateData(List<Transaction> newData) {
        mTransactions = newData;
        notifyDataSetChanged();
    }

    static class TransactionViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvData)
        TextView data;

        public TransactionViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }


}
