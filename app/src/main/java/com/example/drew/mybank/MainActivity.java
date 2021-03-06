package com.example.drew.mybank;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MainActivity";

    EditText mAmountInput;
    Button mWithdrawButton;
    Button mDepositButton;
    TextView mAmountDisplay;
    BankAccount mCurrentBankAccount;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] array = new int[5];
        array[0] = 200;
        array[1] = 300;
        array[2] = 400;
        array[3] = 500;
        array[4] = 600;

        Log.d(TAG, "Position 0 is "+array[0]);




        mCurrentBankAccount = new BankAccount();
        mAmountInput = (EditText) findViewById(R.id.amount_input);
        mWithdrawButton = (Button) findViewById(R.id.withdraw_button);
        mDepositButton = (Button) findViewById(R.id.deposit_button);
        mAmountDisplay = (TextView) findViewById(R.id.balance_display);

        mWithdrawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = mAmountInput.getText().toString();
                mCurrentBankAccount.withdraw(Double.parseDouble(amount));
                mAmountDisplay.setText("Balance is " + mCurrentBankAccount.getBalance());
            }
        });


        mDepositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = mAmountInput.getText().toString();
                mCurrentBankAccount.deposit(Double.parseDouble(amount));
                mAmountDisplay.setText("Balance is " + mCurrentBankAccount.getBalance());
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
