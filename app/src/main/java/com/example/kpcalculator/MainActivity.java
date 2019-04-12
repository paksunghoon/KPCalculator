package com.example.kpcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math.*;

import static java.lang.Math.round;
import static java.lang.Math.toIntExact;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
        button10, buttonSub, buttonAdd, buttonMult, buttonEq, buttonDec, buttonClr, buttonDiv;
    TextView txtView;
    CharSequence numOne;
    CharSequence numTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonSub = (Button) findViewById(R.id.button11);
        buttonAdd = (Button) findViewById(R.id.button12);
        buttonMult = (Button) findViewById(R.id.button13);
        buttonEq = (Button) findViewById(R.id.button14);
        buttonDec = (Button) findViewById(R.id.button15);
        buttonClr = (Button) findViewById(R.id.button16);
        buttonDiv = (Button) findViewById(R.id.button17);
        txtView = (TextView) findViewById(R.id.textView);

        //Display number on text view
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(txtView.getText() + "0");
            }
        });
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimal = txtView.getText().toString();
                //Checks to see if there is a decimal already in textview
                boolean hasDec = false;
                for (int i = 0; i < decimal.length(); i++){
                    char c = decimal.charAt(i);
                    if (c == '.'){
                        hasDec = true;
                    }
                }
                if (hasDec == true){
                    txtView.setText(txtView.getText());
                } else{
                    txtView.setText(txtView.getText() + ".");
                }
            }
        });
        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("");
                numOne = null;
                numTwo = null;
            }
        });

        /*Checks to see if a number is not stored for operation
         */
        if (numOne == null) {

            //Addition operation
            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numOne = txtView.getText();
                    txtView.setText("");
                    if (numOne != null) {
                        buttonEq.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                numTwo = txtView.getText();
                                Double one = Double.parseDouble(numOne.toString());
                                Double two = Double.parseDouble(numTwo.toString());
                                if ((one%1) != 0 || (two%1) != 0) {
                                    Double result = one + two;
                                    txtView.setText(Double.toString(result));
                                } else {
                                    int result = toIntExact(round(one) + round(two));
                                    txtView.setText(Integer.toString(result));
                                }
                            }
                        });
                    }
                }
            });

            //Subtraction operation
            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numOne = txtView.getText();
                    txtView.setText("");
                    if (numOne != null) {
                        buttonEq.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                numTwo = txtView.getText();
                                Double one = Double.parseDouble(numOne.toString());
                                Double two = Double.parseDouble(numTwo.toString());
                                if ((one%1) != 0 || (two%1) != 0) {
                                    Double result = one - two;
                                    txtView.setText(Double.toString(result));
                                } else {
                                    int result = toIntExact(round(one) - round(two));
                                    txtView.setText(Integer.toString(result));
                                }
                            }
                        });
                    }
                }
            });

            //Multiplication operation
            buttonMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    numOne = txtView.getText();
                    txtView.setText("");
                    if (numOne != null) {
                        buttonEq.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                numTwo = txtView.getText();
                                Double one = Double.parseDouble(numOne.toString());
                                Double two = Double.parseDouble(numTwo.toString());
                                if ((one%1) != 0 || (two%1) != 0) {
                                    Double result = one * two;
                                    txtView.setText(Double.toString(result));
                                } else {
                                    int result = toIntExact(round(one) * round(two));
                                    txtView.setText(Integer.toString(result));
                                }
                            }
                        });
                    }
                }
            });

            //Division operation
            buttonDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    numOne = txtView.getText();
                    txtView.setText("");
                    if (numOne != null) {
                        buttonEq.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                numTwo = txtView.getText();
                                Double one = Double.parseDouble(numOne.toString());
                                Double two = Double.parseDouble(numTwo.toString());
                                Double result = one / two;
                                if ((result%1) != 0) {
                                    txtView.setText(Double.toString(result));
                                } else {
                                    int intResult = toIntExact(round(result));
                                    txtView.setText(Integer.toString(intResult));
                                }
                            }
                        });
                    }
                }
            });
        }// end of if
    }
}
//public class addNum(){
//    buttonAdd.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            var numOne = txtView.getText();
//            txtView.setText("");
//            buttonEq.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View v) {
//                    numTwo = txtView.getText();
//                    Double result = Double.parseDouble(numOne.toString()) + Double.parseDouble(numTwo.toString());
//                    txtView.setText(Double.toString(result));
//                }
//            });
//
//        }
//    });
//}
