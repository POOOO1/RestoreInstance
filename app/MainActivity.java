import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
 
public class MainActivity extends AppCompatActivity {
 
    String name ="undefined";
     
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setContentView(R.layout.activity_main);
    }
    public void saveName(View view) {
 
        // получаем введенное имя
        EditText nameBox = (EditText) findViewById(R.id.nameBox);
        name = nameBox.getText().toString();
    }
    public void getName(View view) {
 
        // получаем сохраненное имя
        TextView nameView = (TextView) findViewById(R.id.nameView);
        nameView.setText(name);
    }
}