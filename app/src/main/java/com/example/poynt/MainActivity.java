package com.example.poynt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.poynt.transactionsscreen.TransactionView;

public class MainActivity extends AppCompatActivity implements TransactionView.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TransactionView frag = TransactionView.newInstance();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentHolder, frag).commit();
    }
}
