package com.example.exemplofragmento;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;

public class Fragmento2 extends Fragment {
    static  View frgto2;
    ViewGroup c;
    private Button Botao4;
    private Button Botao5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        frgto2 = inflater.inflate(R.layout.fragmento2, container, false);

        Botao4 = (Button) frgto2.findViewById(R.id.button1);
        Botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txt = (TextView) Fragmento2.frgto2.findViewById(R.id.texto_frg2);
                txt.setText("");
            }
        });

        Botao5 = (Button) frgto2.findViewById(R.id.button2);
        Botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment fragmentoData = new FragmentoAddDatePicker();
                fragmentoData.show(getParentFragmentManager(), "datePicker");
            }
        });

        return frgto2;
    }
}