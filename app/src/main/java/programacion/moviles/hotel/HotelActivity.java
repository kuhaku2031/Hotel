package programacion.moviles.hotel;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HotelActivity extends AppCompatActivity{
    private Spinner spinnerRoom;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel);

        spinnerRoom = findViewById(R.id.spinner_room);
        btnConfirm = findViewById(R.id.btn_confirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showConfirmationDialog();
            }
        });
    }

    public void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¡Listo!")
                .setPositiveButton("Aceptar", null); // No action needed when button is clicked, just dismiss dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
