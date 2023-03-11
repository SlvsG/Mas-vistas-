package com.example.a_548_e22masvistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void fnbutton1(View view){
        Intent lanzarbus = new Intent (this, MainActivity2.class);
        startActivity(lanzarbus);



    }

    public void fnbutton2(View view) {
        Intent lanzarlis = new Intent (this, MainActivity3.class);
        startActivity(lanzarlis);
    }

    public void fnbutton3(View view) {
        Intent lanzarRatingBar = new Intent (this, MainActivity4.class);
        startActivity(lanzarRatingBar);

    }

    public void fnbutton4(View view) {
        Intent lanzarTextclock = new Intent (this, MainActivity5.class);
        startActivity(lanzarTextclock);

    }

    public void fnbutton5(View view) {
        Intent lanzar= new Intent (this, MainActivity6.class);
        startActivity(lanzar);

    }

    public void fnbutton6(View view) {
        Intent lanzar6= new Intent (this, MainActivity7.class);
        startActivity(lanzar6);

    }

    public void fnbutton7(View view) {
        Intent lanzar7= new Intent (this, MainActivity8.class);
        startActivity(lanzar7);

    }

    public void fnbutton8(View view) {
        Intent lanzar8= new Intent (this, MainActivity9.class);
        startActivity(lanzar8);

    }

    public void fnbutton9(View view) {
        Intent lanzar9= new Intent (this, MainActivity10.class);
        startActivity(lanzar9);

    }

    public void fnbutton10(View view) {
        Intent lanzar10= new Intent (this, MainActivity11.class);
        startActivity(lanzar10);

    }

}

