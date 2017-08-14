package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static com.example.user.myapplication.R.id.result;

public class FirstFragment extends Fragment implements  View.OnClickListener
{
    ArrayList calist = new ArrayList();
    TextView result1;

    int count=0;

    public FirstFragment()
    {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_first, container, false);
        View v1 = inflater.inflate(R.layout.activity_main, container, false);

        result1=(TextView) v1.findViewById(R.id.result);




        Button btn_0 = (Button) v.findViewById(R.id.btn_0);
        Button btn_1 = (Button) v.findViewById(R.id.btn_1);
        Button btn_2 = (Button) v.findViewById(R.id.btn_2);
        Button btn_3 = (Button) v.findViewById(R.id.btn_3);
        Button btn_4 = (Button) v.findViewById(R.id.btn_4);
        Button btn_5 = (Button) v.findViewById(R.id.btn_5);
        Button btn_6 = (Button) v.findViewById(R.id.btn_6);
        Button btn_7 = (Button) v.findViewById(R.id.btn_7);
        Button btn_8 = (Button) v.findViewById(R.id.btn_8);
        Button btn_9 = (Button) v.findViewById(R.id.btn_9);
        Button dot = (Button) v.findViewById(R.id.dot);
        Button equal = (Button) v.findViewById(R.id.equal);
        Button btn_clear = (Button) v.findViewById(R.id.btn_clear);
        Button btn_slash = (Button) v.findViewById(R.id.btn_slash);
        Button btn_x = (Button) v.findViewById(R.id.btn_x);
        Button btn_minus = (Button) v.findViewById(R.id.btn_minus);
        Button btn_plus = (Button) v.findViewById(R.id.btn_plus);


        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_slash.setOnClickListener(this);
        btn_x.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        result1.setOnClickListener(this);


        return v;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_clear:

                calist.clear();
                result1.setText("");

                break;
            case R.id.btn_0:
                result1.setText(result1.getText().toString()+"0");
                break;
            case R.id.btn_1:
                result1.setText(result1.getText().toString()+"1");
                break;
            case R.id.btn_2:
                result1.setText(result1.getText().toString()+"2");
                break;
            case R.id.btn_3:
                result1.setText(result1.getText().toString()+"3");
                break;
            case R.id.btn_4:
                result1.setText(result1.getText().toString()+"4");
                break;
            case R.id.btn_5:
                result1.setText(result1.getText().toString()+"5");
                break;
            case R.id.btn_6:
                result1.setText(result1.getText().toString()+"6");
                break;
            case R.id.btn_7:
                result1.setText(result1.getText().toString()+"7");
                break;
            case R.id.btn_8:
                result1.setText(result1.getText().toString()+"8");
                break;
            case R.id.btn_9:
                result1.setText(result1.getText().toString()+"9");
                break;

            case R.id.btn_plus:
                calist.add(result1.getText().toString());
                result1.setText("");
                count=1;
                break;
            case R.id.btn_minus:
                calist.add(result1.getText().toString());
                result1.setText("");
                count=2;
                break;
            case R.id.btn_x:
                calist.add(result1.getText());
                result1.setText("");
                count=3;
                break;
            case R.id.btn_slash:
                result1.setText("");
                count=4;
                break;

            case R.id.equal:
                int sum1=0,sum2=0,total,chk=0;
                double fsum1=0,fsum2=0,ftotal;
                String val="";

                if(calist.isEmpty()){
                    result1.setText("");
                }else{
                    Object obj=calist.get(0);
                    String num1 = (String) obj;
                    String num2 = result1.getText().toString();

                    if (num1.contains(".")||num2.contains(".")){
                        chk=1;
                        fsum1=Float.parseFloat(num1);
                        fsum2=Float.parseFloat(num2);
                    }else{
                        sum1= Integer.parseInt(num1);
                        sum2= Integer.parseInt(num2);
                    }
                    switch(count){
                        case 0:

                            result1.setText("");
                            break;
                        case 1:
                            if(chk==1){
                                ftotal=fsum1+fsum2;
                                val=String.valueOf(ftotal);

                            }else{
                                total=sum1+sum2;
                                val=String.valueOf(total);
                            }
                            result1.setText(val);
                            calist.clear();

                            break;
                        case 2:
                            if(chk==1){
                                ftotal=fsum1-fsum2;
                                val=String.valueOf(ftotal);
                            }else{
                                total=sum1-sum2;
                                val=String.valueOf(total);
                            }
                            result1.setText(val);
                            calist.clear();

                            break;
                        case 3:
                            if(chk==1){
                                ftotal=fsum1*fsum2;
                                val=String.valueOf(ftotal);
                            }else{
                                total=sum1*sum2;
                                val=String.valueOf(total);
                            }
                            result1.setText(val);
                            calist.clear();

                            break;
                        case 4:
                            if(chk==1){
                                ftotal=fsum1/fsum2;
                                val=String.valueOf(ftotal);
                            }else{
                                total=sum1/sum2;
                                val=String.valueOf(total);
                            }
                            result1.setText(val);
                            calist.clear();

                            break;

                    }
                }


        }


    }
}


