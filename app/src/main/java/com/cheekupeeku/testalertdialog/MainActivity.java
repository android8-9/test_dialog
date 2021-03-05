package com.cheekupeeku.testalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.cheekupeeku.testalertdialog.databinding.ActivityMainBinding;
import com.cheekupeeku.testalertdialog.databinding.RateBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RateBinding rateBinding  = RateBinding.inflate(LayoutInflater.from(MainActivity.this));
                AlertDialog ab = new AlertDialog.Builder(MainActivity.this).create();
                ab.setView(rateBinding.getRoot());
                rateBinding.tvTitle.setText("Rating");
                rateBinding.tvMessage.setText("Do you want to rate this app ?");
                rateBinding.btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                        ab.dismiss();
                    }
                });
                rateBinding.btnLater.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Later Clciked", Toast.LENGTH_SHORT).show();
                        ab.dismiss();
                    }
                });
                rateBinding.btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "No clicked", Toast.LENGTH_SHORT).show();
                        ab.dismiss();
                    }
                });
                ab.show();
                /*
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Rating");
                ab.setMessage("Do you want rate this app ?");
                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Positive clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Negative Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                ab.setNeutralButton("Later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Neutral clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                ab.show();

                 */
            }
        });
    }
}