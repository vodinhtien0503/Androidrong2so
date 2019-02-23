package com.example.administrator.tong2socach2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntong=(Button)findViewById(R.id.btntong2so);
        btntong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                EditText edita=(EditText)findViewById(R.id.editsoa);
                int a =Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText)findViewById(R.id.editsob);
                int b=Integer.parseInt(editb.getText()+"");
                TextView kq=(TextView)findViewById(R.id.txtkq);
                kq.setText((a+b)+"");
            }

            });
    }
}
