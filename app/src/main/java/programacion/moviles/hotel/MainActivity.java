package programacion.moviles.hotel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button iniciarSesionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarSesionButton = (Button) findViewById(R.id.iniciar_sesion);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.iniciar_sesion) {
            // Inflar el layout "menu.xml"
            View menuLayout = getLayoutInflater().inflate(R.layout.menu, null);

            // Obtener el contenedor principal (FrameLayout)
            FrameLayout frameLayout = findViewById(R.id.frameLayout);

            // Limpiar el contenedor principal antes de agregar el nuevo layout
            frameLayout.removeAllViews();

            // Agregar el nuevo layout "menu.xml" al contenedor principal
            frameLayout.addView(menuLayout);
        }
    }

}