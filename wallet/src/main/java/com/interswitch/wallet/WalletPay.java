package com.interswitch.wallet;

import android.content.Context;
import android.widget.Toast;

public class WalletPay {

    public static void pay(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
