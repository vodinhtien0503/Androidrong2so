package com.example.administrator.tong2socach3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
        Button btntong;
        EditText edita,editb;
        TextView kq;
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntong=(Button)findViewById(R.id.btntong2so);
        btntong.setOnClickListener(this);
        edita=(EditText)findViewById(R.id.editsoa);
        editb=(EditText)findViewById(R.id.editsob);
        kq=(TextView)findViewById(R.id.txtkq);
    }


    @Override
    public void onClick(View arg0) {
        int a=Integer.parseInt(edita.getText()+"");
        int b=Integer.parseInt(editb.getText()+"");
        kq.setText((a+b)+"");
    }
}
