package dam.example.superminicalculadora;

import android.os.Bundle;
import android.util.Pair;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityV2 extends AppCompatActivity {

    EditText etNumero1; // Primer número
    EditText etNumero2; // Segundo número
    TextView tvResultado; // Resultado

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        tvResultado = findViewById(R.id.tvResultado);

        findViewById(R.id.btnSumar).setOnClickListener(v -> sumar());
        findViewById(R.id.btnRestar).setOnClickListener(v -> restar());
        findViewById(R.id.btnMultiplicar).setOnClickListener(v -> multiplicar());
        findViewById(R.id.btnDividir).setOnClickListener(v -> dividir());
        findViewById(R.id.btnBorrar).setOnClickListener(v -> borrar());
    }

    // Sumar dos números
    private void sumar() {
        String resultado;
        try{
            Pair<Double, Double> numeros = obtenerNumeros();
            double calculo = numeros.first + numeros.second;
            resultado = String.valueOf(calculo);
        }catch(Exception e){
            resultado = "Error";
        }
        tvResultado.setText(resultado);
    }

    // Restar dos números
    private void restar() {
        String resultado;
        try{
            Pair<Double, Double> numeros = obtenerNumeros();
            double calculo = numeros.first - numeros.second;
            resultado = String.valueOf(calculo);
        }catch(Exception e){
            resultado = "Error";
        }
        tvResultado.setText(resultado);
    }

    // Multiplicar dos números
    private void multiplicar() {
        String resultado;
        try{
            Pair<Double, Double> numeros = obtenerNumeros();
            double calculo = numeros.first * numeros.second;
            resultado = String.valueOf(calculo);
        }catch(Exception e){
            resultado = "Error";
        }
        tvResultado.setText(resultado);
    }

    // Dividir dos números
    private void dividir() {
        String resultado;
        try{
            Pair<Double, Double> numeros = obtenerNumeros();
            double calculo = numeros.first / numeros.second;
            resultado = String.valueOf(calculo);
        }catch(Exception e){
            resultado = "Error";
        }
        tvResultado.setText(resultado);
    }

    // Borrar los números y el resultado
    private void borrar() {
        etNumero1.setText("");
        etNumero2.setText("");
        tvResultado.setText("0.0");
    }

    private Pair<Double, Double> obtenerNumeros() {
        String txt1 = etNumero1.getText().toString().trim();
        String txt2 = etNumero2.getText().toString().trim();

        if (txt1.isEmpty() || txt2.isEmpty()) {
            tvResultado.setText("Debe introducir ambos números");
            return null;
        }

        try {
            double num1 = Double.parseDouble(txt1);
            double num2 = Double.parseDouble(txt2);
            return new Pair<>(num1, num2);
        } catch (NumberFormatException e) {
            tvResultado.setText("Formato numérico inválido");
            return null;
        }
    }


}
