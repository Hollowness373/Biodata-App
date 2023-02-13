package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EducationalBackground extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnToEmploymentRecord:
                String name = intName.getText().toString();
                String email = intEmail.getText().toString();
                String cellphoneNumber = intCpNumber.getText().toString();
                String positionDesired = intPositionDesired.getText().toString();
                String religion = intReligion.getText().toString();
                String height = intHeight.getText().toString();
                String weight = intWeight.getText().toString();
                String fatherName = intFatherName.getText().toString();
                String motherName = intMotherName.getText().toString();
                String occupation1 = intOccupation1.getText().toString();
                String occupation2 = intOccupation2.getText().toString();
                String imageUrl = intImageUrl.getText().toString();
                String gender = intRGroup.getText().toString();
                String dateOfBirth = intDateOfBirth.getText().toString();
                String civilStatus = intCivilStatus.getText().toString();
                String elementary = edtElementary.getText().toString();
                String highSchool = edtHighSchool.getText().toString();
                String college = edtCollege.getText().toString();
                String yrGraduatedE = edtYrGraduatedE.getText().toString();
                String yrGraduatedH = edtYrGraduatedH.getText().toString();
                String yrGraduatedC = edtYrGraduatedC.getText().toString();
                String degree = edtDegree.getText().toString();
                String specialSkills = edtSpecialSkills.getText().toString();


                Intent intent = new Intent(this, EmploymentRecord.class);
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
                intent.putExtra("UIDDateOfBirth", dateOfBirth);
                intent.putExtra("UIDCivilStatus", civilStatus);
                intent.putExtra("UIDElementary", elementary);
                intent.putExtra("UIDHighSchool", highSchool);
                intent.putExtra("UIDCollege", college);
                intent.putExtra("UIDYrGraduatedE", yrGraduatedE);
                intent.putExtra("UIDYrGraduatedH", yrGraduatedH);
                intent.putExtra("UIDYrGraduatedC", yrGraduatedC);
                intent.putExtra("UIDDegree", degree);
                intent.putExtra("UIDSpecialSkills", specialSkills);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    //***Intent Text notVisible
    private TextView intName, intEmail,intCpNumber, intPositionDesired, intReligion, intHeight, intWeight, intFatherName, intMotherName, intOccupation1, intOccupation2, intImageUrl, intRGroup,
    intDateOfBirth, intCivilStatus;

    private EditText edtElementary, edtHighSchool, edtCollege, edtDegree, edtSpecialSkills, edtYrGraduatedE, edtYrGraduatedH, edtYrGraduatedC;

    private Button btnToEmploymentRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_background);
        getSupportActionBar().hide();

        edtElementary = findViewById(R.id.edtElementary);
        edtHighSchool = findViewById(R.id.edtHighSchool);
        edtCollege = findViewById(R.id.edtCollege);
        edtDegree = findViewById(R.id.edtDegree);
        edtSpecialSkills = findViewById(R.id.edtSpecialSkills);
        edtYrGraduatedE = findViewById(R.id.edtYrGraduatedE);
        edtYrGraduatedH = findViewById(R.id.edtYrGraduatedH);
        edtYrGraduatedC = findViewById(R.id.edtYrGraduatedC);

        btnToEmploymentRecord = findViewById(R.id.btnToEmploymentRecord);
        btnToEmploymentRecord.setOnClickListener(this);


        //******Intent
        intName = findViewById(R.id.intName);
        intEmail = findViewById(R.id.intCpNumber);
        intCpNumber = findViewById(R.id.intEmail);
        intReligion = findViewById(R.id.intReligion);
        intPositionDesired = findViewById(R.id.intPositionDesired);
        intHeight = findViewById(R.id.intHeight);
        intWeight = findViewById(R.id.intWeight);
        intFatherName = findViewById(R.id.intFatherName);
        intMotherName = findViewById(R.id.intMotherName);
        intOccupation1 = findViewById(R.id.intOccupation1);
        intOccupation2 = findViewById(R.id.intOccupation2);
        intImageUrl = findViewById(R.id.intImageUrl);
        intRGroup = findViewById(R.id.intRGroup);
        intCivilStatus = findViewById(R.id.intCivilStatus);
        intDateOfBirth = findViewById(R.id.intDateOfBirth);

        String name = getIntent().getStringExtra("UIDName");
        String email = getIntent().getStringExtra("UIDEmail");
        String positionDesired = getIntent().getStringExtra("UIDPositionDesired");
        String cellphoneNumber = getIntent().getStringExtra("UIDCellphoneNumber");
        String religion = getIntent().getStringExtra("UIDReligion");
        String height = getIntent().getStringExtra("UIDHeight");
        String weight = getIntent().getStringExtra("UIDWeight");
        String fatherName = getIntent().getStringExtra("UIDFatherName");
        String motherName = getIntent().getStringExtra("UIDMotherName");
        String occupation1 = getIntent().getStringExtra("UIDOccupation1");
        String occupation2 = getIntent().getStringExtra("UIDOccupation2");
        String imageUrl = getIntent().getStringExtra("UIDImageUrl");
        String gender = getIntent().getStringExtra("UIDGender");
        String dateOfBirth = getIntent().getStringExtra("UIDDateOfBirth");
        String civilStatus = getIntent().getStringExtra("UIDCivilStatus");

        intName.setText(name);
        intEmail.setText(email);
        intCpNumber.setText(cellphoneNumber);
        intPositionDesired.setText(positionDesired);
        intReligion.setText(religion);
        intHeight.setText(height);
        intWeight.setText(weight);
        intFatherName.setText(fatherName);
        intMotherName.setText(motherName);
        intOccupation1.setText(occupation1);
        intOccupation2.setText(occupation2);
        intImageUrl.setText(imageUrl);
        intRGroup.setText(gender);
        intDateOfBirth.setText(dateOfBirth);
        intCivilStatus.setText(civilStatus);





        //*********Intent/>
    }
}