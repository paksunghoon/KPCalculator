package com.example.kpcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                txtView.setText(txtView.getText() + ".");
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
        if (numOne == null) {
            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numOne = txtView.getText();
                    txtView.setText("");
                    buttonEq.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            numTwo = txtView.getText();
                            Double result = Double.parseDouble(numOne.toString()) + Double.parseDouble(numTwo.toString());
                            txtView.setText(Double.toString(result));
                        }
                    });

                }
            });
            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numOne = txtView.getText();
                    txtView.setText("");
                    buttonEq.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            numTwo = txtView.getText();
                            Double result = Double.parseDouble(numOne.toString()) - Double.parseDouble(numTwo.toString());
                            txtView.setText(Double.toString(result));
                        }
                    });
                }
            });
            buttonMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    numOne = txtView.getText();
                    txtView.setText("");
                    buttonEq.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            numTwo = txtView.getText();
                            Double result = Double.parseDouble(numOne.toString()) * Double.parseDouble(numTwo.toString());
                            txtView.setText(Double.toString(result));
                        }
                    });
                }
            });
            buttonDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    numOne = txtView.getText();
                    txtView.setText("");
                    buttonEq.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            numTwo = txtView.getText();
                            Double result = Double.parseDouble(numOne.toString()) / Double.parseDouble(numTwo.toString());
                            txtView.setText(Double.toString(result));
                        }
                    });
                }
            });
        }
    }


}
