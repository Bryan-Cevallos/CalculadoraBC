package com.facci.calculadorabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivityBC extends AppCompatActivity {

    double operando1=0, operando2=0, resultado=0;
    int operacion=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_bc);


        Button btn= (Button) findViewById(R.id.buttonAcerca);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Acercade.class);
                startActivityForResult(i,0);
            }
        });

        Button Button0 = (Button) findViewById(R.id.num0);
        Button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_cero();
            }
        });

        Button ButtonMostrar = (Button) findViewById(R.id.Mostrar);
        ButtonMostrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_mostrar();
            }


        });

        Button ButtonPunto = (Button) findViewById(R.id.Punto);
        ButtonPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_punto();
            }
        });

        Button Button1 = (Button) findViewById(R.id.num1);
        Button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_uno();
            }
        });

        Button Button2 = (Button) findViewById(R.id.num2);
        Button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_dos();
            }
        });

        Button Button3 = (Button) findViewById(R.id.num3);
        Button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_tres();
            }
        });

        Button Button4 = (Button) findViewById(R.id.num4);
        Button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_cuatro();
            }
        });

        Button Button5 = (Button) findViewById(R.id.num5);
        Button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_cinco();
            }
        });

        Button Button6 = (Button) findViewById(R.id.num6);
        Button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_seis();
            }
        });

        Button Button7 = (Button) findViewById(R.id.num7);
        Button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_siete();
            }
        });

        Button Button8 = (Button) findViewById(R.id.num8);
        Button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_ocho();
            }
        });

        Button Button9 = (Button) findViewById(R.id.num9);
        Button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_nueve();
            }
        });

        Button ButtonC = (Button) findViewById(R.id.Borrar);
        ButtonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_C();
            }
        });

        Button ButtonSuma = (Button) findViewById(R.id.Sumar);
        ButtonSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_suma();
            }
        });

        Button ButtonResta = (Button) findViewById(R.id.Restar);
        ButtonResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_resta();
            }
        });

        Button ButtonMultiplicacion = (Button) findViewById(R.id.Multiplicar);
        ButtonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_multiplicacion();
            }
        });

        Button ButtonDivision = (Button) findViewById(R.id.Dividir);
        ButtonDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_division();
            }
        });


        Button ButtonIgual = (Button) findViewById(R.id.Igual);
        ButtonIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                boton_igual();
            }
        });
    }

    public void boton_cero() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == false)
            {
                calculadoraEditTextString = calculadoraEditTextString + "0";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void boton_punto() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.contains(".") == false)
            {
                calculadoraEditTextString = calculadoraEditTextString + ".";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_uno() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "1";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "1";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_dos() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "2";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "2";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_tres() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "3";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "3";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_cuatro() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "4";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "4";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_cinco() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "5";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "5";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_seis() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "6";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "6";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_siete() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "7";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "7";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_ocho() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "8";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "8";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_nueve() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
            {
                calculadoraEditTextString = "9";
            }
            else
            {
                calculadoraEditTextString = calculadoraEditTextString + "9";
            }
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_C() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            calculadoraEditTextString = "0";
            operando1 = 0;
            operando2 = 0;
            operacion = 0;
            resultado = 0;
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_suma() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            operando1 = Double.parseDouble(calculadoraEditTextString);
            operacion = 1;
            calculadoraEditTextString = "";
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_resta() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            operando1 = Double.parseDouble(calculadoraEditTextString);
            operacion = 2;
            calculadoraEditTextString = "";
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_multiplicacion() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            operando1 = Double.parseDouble(calculadoraEditTextString);
            operacion = 3;
            calculadoraEditTextString = "";
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_division() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            operando1 = Double.parseDouble(calculadoraEditTextString);
            operacion = 4;
            calculadoraEditTextString = "";
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton_mostrar(){


    }

    public void boton_igual() {
        try {
            EditText calculadoraEditText = (EditText) findViewById(R.id.txtresultado);
            String calculadoraEditTextString = calculadoraEditText.getText().toString();
            operando2 = Double.parseDouble(calculadoraEditTextString);
            switch (operacion)
            {
                case 1:
                    resultado = (operando1 + operando2);
                    break;
                case 2:
                    resultado = (operando1 - operando2);
                    break;
                case 3:
                    resultado = (operando1 * operando2);
                    break;
                case 4:
                    resultado = (operando1 / operando2);
                    break;

            }
            calculadoraEditTextString = String.valueOf(resultado);
            operacion = 0;
            calculadoraEditText.setText(calculadoraEditTextString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
