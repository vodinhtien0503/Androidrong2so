package com.example.administrator.tong2so;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View ;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_tong2so(View view) {
        EditText edita =(EditText)findViewById(R.id.editsoa);
        int a=Integer.parseInt(edita.getText()+"");
        EditText editb=(EditText)findViewById(R.id.editsob);
        int b= Integer.parseInt(editb.getText()+"");
        TextView kq=(TextView)findViewById(R.id.txtkq);
        kq.setText((a+b)+"");
    }
}
