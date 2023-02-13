package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PersonalData extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.edtName:
                Toast.makeText(this, "Juan Delacruz", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtEmail:
                Toast.makeText(this, "ex: name.surname@gmail.com", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtCpNumber:
                Toast.makeText(this, "ex: 09123456789", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtReligion:
                Toast.makeText(this, "ex: Catholic", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtHeight:
                Toast.makeText(this, "ex: Feet'Inches(5'7)", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtWeight:
                Toast.makeText(this, "ex: 65kg", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtFatherName:
                Toast.makeText(this, "ex: Father's Name", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtMotherName:
                Toast.makeText(this, "ex: Mother's Name", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtOccupation1:
            case R.id.edtOccupation2:
                Toast.makeText(this, "ex: Occupation", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtURL:
                Toast.makeText(this, "ex: http://smile.com/smileyface.png", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    private static final  String TAG = "PesonalData";

   // DatabaseHelper mDatabaseHelper;
    DatabaseHelper databaseHelper;

    private Spinner spinnerCivilStatus, spinnerMonth, spinnerDay, spinnerYear;
    private EditText edtName, edtEmail, edtCpNumber, edtReligion, edtHeight, edtWeight, edtFatherName, edtMotherName, edtOccupation1, edtOccupation2, edtURL, edtPositionDesired;
    private RadioGroup rgGender;
    private Button btnToEducationalBackground;

    //intent
    private TextView intRGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);
        getSupportActionBar().hide();

//        databaseHelper = new DatabaseHelper(getApplicationContext());

        btnToEducationalBackground = findViewById(R.id.btnToEducationalBackground);
        btnToEducationalBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                intRGroup = findViewById(R.id.intRGroup);
//                DatabaseHelper myDB = new DatabaseHelper(PersonalData.this);
//                myDB.registerForm(edtName.getText().toString().trim(),
//                        edtEmail.getText().toString().trim(),
//                        edtURL.getText().toString().trim());
            //****sendIntent
                String name = edtName.getText().toString();
                String positionDesired = edtPositionDesired.getText().toString();
                String email = edtEmail.getText().toString();
                String cellphoneNumber = edtCpNumber.getText().toString();
                String religion = edtReligion.getText().toString();
                String height = edtHeight.getText().toString();
                String weight = edtWeight.getText().toString();
                String fatherName = edtFatherName.getText().toString();
                String motherName = edtMotherName.getText().toString();
                String occupation1 = edtOccupation1.getText().toString();
                String occupation2 = edtOccupation2.getText().toString();
                String gender = intRGroup.getText().toString();
                String imageUrl = edtURL.getText().toString();
                String civilStatus = spinnerCivilStatus.getSelectedItem().toString();
                String dateOfBirth = spinnerMonth.getSelectedItem().toString() + "-" + spinnerDay.getSelectedItem().toString() + "-" + spinnerYear.getSelectedItem().toString();

                Intent intent = new Intent(PersonalData.this, EducationalBackground.class);
                intent.putExtra("UIDName", name);
                intent.putExtra("UIDEmail", email);
                intent.putExtra("UIDCellphoneNumber", cellphoneNumber);
                intent.putExtra("UIDPositionDesired", positionDesired);
                intent.putExtra("UIDReligion", religion);
                intent.putExtra("UIDHeight", height);
                intent.putExtra("UIDWeight", weight);
                intent.putExtra("UIDFatherName", fatherName);
                intent.putExtra("UIDMotherName", motherName);
                intent.putExtra("UIDOccupation1", occupation1);
                intent.putExtra("UIDOccupation2", occupation2);
                intent.putExtra("UIDImageUrl", imageUrl);
                intent.putExtra("UIDGender", gender);
                intent.putExtra("UIDCivilStatus", civilStatus);
                intent.putExtra("UIDDateOfBirth", dateOfBirth);
                startActivity(intent);
//                String newEntry = edtName.getText().toString();
//                if (edtName.length() != 0) {
//                    AddData(newEntry);
//                    edtName.setText("");
//                } else {
//                    toastMessage("You must put something in the text field!");
//                }
            }
        });
        edtPositionDesired = findViewById(R.id.edtPositionDesired);
        edtName = findViewById(R.id.edtName);
        edtName.setOnClickListener(this);
        edtEmail = findViewById(R.id.edtEmail);
        edtEmail.setOnClickListener(this);
        edtReligion = findViewById(R.id.edtReligion);
        edtReligion.setOnClickListener(this);
        edtCpNumber = findViewById(R.id.edtCpNumber);
        edtCpNumber.setOnClickListener(this);
        edtHeight = findViewById(R.id.edtHeight);
        edtHeight.setOnClickListener(this);
        edtWeight = findViewById(R.id.edtWeight);
        edtWeight.setOnClickListener(this);
        edtFatherName = findViewById(R.id.edtFatherName);
        edtFatherName.setOnClickListener(this);
        edtMotherName = findViewById(R.id.edtMotherName);
        edtMotherName.setOnClickListener(this);
        edtOccupation1 = findViewById(R.id.edtOccupation1);
        edtOccupation1.setOnClickListener(this);
        edtOccupation2 = findViewById(R.id.edtOccupation2);
        edtOccupation2.setOnClickListener(this);
        edtURL = findViewById(R.id.edtURL);
        edtURL.setOnClickListener(this);

        spinnerCivilStatus = findViewById(R.id.spinnnerCivilStatus);
        ArrayList<String> civilStatus = new ArrayList<>();
        civilStatus.add("--Select--");
        civilStatus.add("Single");
        civilStatus.add("Married");
        civilStatus.add("Divorced");
        civilStatus.add("Widowed");
        ArrayAdapter<String> statusAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                civilStatus
        );
        spinnerCivilStatus.setAdapter(statusAdapter);
        spinnerCivilStatus.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinnerCivilStatus.getSelectedItem().toString()=="--Select--"){

                }
                else {
                    Toast.makeText(PersonalData.this, spinnerCivilStatus.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //********Spinner Month
        spinnerMonth = findViewById(R.id.spinnerMonth);
        ArrayList<String> month = new ArrayList<>();
        month.add("Month");
        month.add("01");month.add("02");month.add("03");month.add("04");month.add("05");month.add("06");
        month.add("07");month.add("08");month.add("09");month.add("10");month.add("11");month.add("12");
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                month
        );
        spinnerMonth.setAdapter(monthAdapter);
        spinnerMonth.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinnerMonth.getSelectedItem().toString()=="Month"){

                }
                else {
                    Toast.makeText(PersonalData.this, spinnerMonth.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //********Spinner Day
        spinnerDay = findViewById(R.id.spinnerDay);
        ArrayList<String> day = new ArrayList<>();
        day.add("Day");day.add("01");day.add("02");day.add("03");day.add("04");day.add("05");day.add("06");day.add("07");day.add("08");day.add("09");day.add("10");
        day.add("11");day.add("12");day.add("13");day.add("14");day.add("15");day.add("16");day.add("17");day.add("18");day.add("19");day.add("20");
        day.add("21");day.add("22");day.add("23");day.add("24");day.add("25");day.add("26");day.add("27");day.add("28");day.add("29");day.add("30");day.add("31");
        ArrayAdapter<String> dayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                day
        );
        spinnerDay.setAdapter(dayAdapter);
        spinnerDay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinnerDay.getSelectedItem()=="Day"){

                }
                else {
                    Toast.makeText(PersonalData.this, spinnerDay.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //********Spinner Year
        spinnerYear = findViewById(R.id.spinnerYear);
        ArrayList<String> year = new ArrayList<>();
        year.add("Year");year.add("1980");year.add("1981");year.add("1982");year.add("1983");year.add("1984");year.add("1985");year.add("1986");year.add("1987");year.add("1988");year.add("1989");year.add("1990");
        year.add("1991");year.add("1992");year.add("1993");year.add("1994");year.add("1995");year.add("1996");year.add("1997");year.add("1998");year.add("1999");year.add("2000");
        year.add("2001");year.add("2002");year.add("2003");year.add("2004");year.add("2005");year.add("2006");year.add("2007");year.add("2008");year.add("2009");year.add("2010");
        year.add("2011");year.add("2012");year.add("2013");year.add("2014");year.add("2015");year.add("2016");year.add("2017");year.add("2018");year.add("2019");year.add("2020");
        year.add("2021");
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                year
        );
        spinnerYear.setAdapter(yearAdapter);
        spinnerYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinnerYear.getSelectedItem().toString() == "Year"){
                    
                }
                else {
                    Toast.makeText(PersonalData.this, spinnerYear.getSelectedItem().toString() + " Selected", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        rgGender = findViewById(R.id.rgGender);
        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.rbMale:
                        intRGroup = findViewById(R.id.intRGroup);
                        Toast.makeText(PersonalData.this, "Male Selected", Toast.LENGTH_SHORT).show();
                        intRGroup.setText("Male");
                        break;
                    case R.id.rbFemale:
                        intRGroup = findViewById(R.id.intRGroup);
                        Toast.makeText(PersonalData.this, "Female Selected", Toast.LENGTH_SHORT).show();
                        intRGroup.setText("Female");
                        break;
                    default:
                        break;
                }
            }
        });

        //start

      //  mDatabaseHelper = new DatabaseHelper(this);
    }
//    public void AddData(String newEntry){
//        boolean insertData = mDatabaseHelper.addData(newEntry);
//        if (insertData) {
//            toastMessage("Data Successfully Inserted!");
//        } else {
//            toastMessage("Something went wrong");
//        }
//    }


    private void toastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}