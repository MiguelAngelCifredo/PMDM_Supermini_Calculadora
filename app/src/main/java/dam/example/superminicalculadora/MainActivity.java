package dam.example.superminicalculadora;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    
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
        try{
            double numero1 = Double.parseDouble(etNumero1.getText().toString());
            double numero2 = Double.parseDouble(etNumero2.getText().toString());
            double resultado = numero1 + numero2;
            tvResultado.setText(String.valueOf(resultado));
        }catch(Exception e){
            tvResultado.setText("Error");
        }
    }

    // Restar dos números
    private void restar() {
        try{
            double numero1 = Double.parseDouble(etNumero1.getText().toString());
            double numero2 = Double.parseDouble(etNumero2.getText().toString());
            double resultado = numero1 - numero2;
            tvResultado.setText(String.valueOf(resultado));
        }catch(Exception e){
            tvResultado.setText("Error");
        }
    }

    // Multiplicar dos números
    private void multiplicar() {
        try{
            double numero1 = Double.parseDouble(etNumero1.getText().toString());
            double numero2 = Double.parseDouble(etNumero2.getText().toString());
            double resultado = numero1 * numero2;
            tvResultado.setText(String.valueOf(resultado));
        }catch(Exception e){
            tvResultado.setText("Error");
        }
    }

    // Dividir dos números
    private void dividir() {
        try{
            double numero1 = Double.parseDouble(etNumero1.getText().toString());
            double numero2 = Double.parseDouble(etNumero2.getText().toString());
            double resultado = numero1 / numero2;
            tvResultado.setText(String.valueOf(resultado));
        }catch(Exception e){
            tvResultado.setText("Error");
        }
    }

    // Borrar los números y el resultado
    private void borrar() {
        etNumero1.setText("");
        etNumero2.setText("");
        tvResultado.setText("0.0");
    }

}