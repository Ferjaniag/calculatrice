package mpdam.iset.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button plus,moins,div,mult,calc,reset ;
    EditText num1,num2 ;
    TextView op,result ;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus=findViewById(R.id.plus) ;
        moins=findViewById(R.id.moins) ;
        div=findViewById(R.id.div) ;
        mult=findViewById(R.id.multiple) ;
        calc=findViewById(R.id.calc) ;

        num1=findViewById(R.id.number1) ;
        num2=findViewById(R.id.number2) ;

        op=findViewById(R.id.operation) ;
        result=findViewById(R.id.result) ;
        reset=findViewById(R.id.reset) ;
    //    String n1=num1.getText().toString() ;
    //    String n2=num2.getText().toString() ;

reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        num1.setText("");
        num2.setText("");
    }
});
// Button plus
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1=num1.getText().toString() ;
                String n2=num2.getText().toString() ;

                Log.i("n1",n1) ;
                if (n1.equals("") ) {
                    Toast.makeText(getApplicationContext(),"Format invalid",Toast.LENGTH_LONG).show();
                } else {
                    op.setText("+");
                    operation = "+";
                }
            }
        });

        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=num1.getText().toString() ;
                String n2=num2.getText().toString() ;
                if (n1.equals("") ) {
                    Toast.makeText(getApplicationContext(),"Format invalid",Toast.LENGTH_LONG).show();
                } else {
                    op.setText("-");
                    operation = "-";
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=num1.getText().toString() ;
                String n2=num2.getText().toString() ;
                if (n1.equals("") ) {
                    Toast.makeText(getApplicationContext(),"Format invalid",Toast.LENGTH_LONG).show();
                } else {
                    op.setText("/");
                    operation = "/";
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=num1.getText().toString() ;
                String n2=num2.getText().toString() ;
                if (n1.equals("") ) {
                    Toast.makeText(getApplicationContext(),"Format invalid",Toast.LENGTH_LONG).show();
                } else {
                    op.setText("*");
                    operation = "*";
                }
            }
        });

        // Calcul
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=num1.getText().toString() ;
                String n2=num2.getText().toString() ;
                if (n1.equals("") || n2.equals("")) {
                    Toast.makeText(getApplicationContext(),"Zone de text vide",Toast.LENGTH_LONG).show();
                } else {
                    int nb1=Integer.parseInt(n1) ;
                    int nb2=Integer.parseInt(n2) ;
                    if (operation.equals("+")) {
                        int res=nb1+nb2 ;
                        result.setText(String.valueOf(res));
                    }

                    switch (operation) {
                        case "+" : {
                            int res = nb1 + nb2;
                            String resu=String.valueOf(res) ;
                            result.setText("= " + resu);
                        } break;
                        case "-" : {
                            int res = nb1 - nb2;
                            String resu=String.valueOf(res) ;
                            result.setText("= " + resu);

                        } break ;
                        case "/" : {
                            int res=nb1/nb2 ;
                            String resu=String.valueOf(res) ;
                            result.setText("= " + resu);
                        } break ;
                        case "*" : {
                            int res=nb1*nb2 ;
                            String resu=String.valueOf(res) ;
                            result.setText("= " + resu);
                        } break ;
                    }
                }
            }
        });


    }

}