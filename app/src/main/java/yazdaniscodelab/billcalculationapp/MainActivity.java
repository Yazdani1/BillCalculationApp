package yazdaniscodelab.billcalculationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberOfMember;
    private EditText totalBill;
    private TextView result;
    private Button btnCalculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculation();
    }

    private void calculation(){

        numberOfMember=findViewById(R.id.edt_numberOfMember);
        totalBill=findViewById(R.id.edt_totalBill);
        result=findViewById(R.id.result_txt);
        btnCalculation=findViewById(R.id.Calculate_btn);


        btnCalculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String member=numberOfMember.getText().toString();

                int mMember=Integer.parseInt(member);

                String bill=totalBill.getText().toString();
                int mBill=Integer.parseInt(bill);

                int mresult=mBill/mMember;

                String finalresult=String.valueOf(mresult);

                result.setText("Each person bill is: "+finalresult);


            }
        });



    }


}
