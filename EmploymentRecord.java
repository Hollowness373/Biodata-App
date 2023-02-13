package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EmploymentRecord extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnToCharacterReference:
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
                String elementary = intElementary.getText().toString();
                String highSchool = intHighSchool.getText().toString();
                String college = intCollege.getText().toString();
                String yrGraduatedE = intYrGraduatedE.getText().toString();
                String yrGraduatedH = intYrGraduatedH.getText().toString();
                String yrGraduatedC = intYrGraduatedC.getText().toString();
                String degree = intDegree.getText().toString();
                String specialSkills = intSpecialSkills.getText().toString();
                String companyName1 = edtCompanyName1.getText().toString();
                String companyName2 = edtCompanyName2.getText().toString();
                String position1 = edtPosition1.getText().toString();
                String position2 = edtPosition2.getText().toString();
                String from1 = edtFrom1.getText().toString();
                String from2 = edtFrom2.getText().toString();
                String to1 = edtTo1.getText().toString();
                String to2 = edtTo2.getText().toString();

                Intent intent = new Intent(this, CharacterReference.class);
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
                intent.putExtra("UIDCompanyName1", companyName1);
                intent.putExtra("UIDCompanyName2", companyName2);
                intent.putExtra("UIDPosition1", position1);
                intent.putExtra("UIDPosition2", position2);
                intent.putExtra("UIDFrom1", from1);
                intent.putExtra("UIDFrom2", from2);
                intent.putExtra("UIDTo1", to1);
                intent.putExtra("UIDTo2", to2);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    //***Intent Text notVisible
    private TextView intName, intEmail,intCpNumber, intPositionDesired, intReligion, intHeight, intWeight, intFatherName, intMotherName, intOccupation1, intOccupation2, intImageUrl, intRGroup,
    intDateOfBirth, intCivilStatus, intElementary, intHighSchool, intCollege, intYrGraduatedE, intYrGraduatedH, intYrGraduatedC, intDegree, intSpecialSkills;

    private EditText edtCompanyName1, edtPosition1, edtFrom1, edtTo1, edtCompanyName2, edtPosition2, edtFrom2, edtTo2;



    private Button btnToCharacterReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employment_record);
        getSupportActionBar().hide();

        edtCompanyName1 = findViewById(R.id.edtCompanyName1);
        edtCompanyName2 = findViewById(R.id.edtCompanyName2);
        edtPosition1 = findViewById(R.id.edtPosition1);
        edtPosition2 = findViewById(R.id.edtPosition2);
        edtFrom1 = findViewById(R.id.edtFrom1);
        edtFrom2 = findViewById(R.id.edtFrom2);
        edtTo1 = findViewById(R.id.edtTo1);
        edtTo2 = findViewById(R.id.edtTo2);

        btnToCharacterReference = findViewById(R.id.btnToCharacterReference);
        btnToCharacterReference.setOnClickListener(this);



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
        intDateOfBirth = findViewById(R.id.intDateOfBirth);
        intCivilStatus = findViewById(R.id.intCivilStatus);
        intElementary = findViewById(R.id.intElementary);
        intHighSchool = findViewById(R.id.intHighSchool);
        intCollege = findViewById(R.id.intCollege);
        intYrGraduatedE = findViewById(R.id.intYrGraduatedE);
        intYrGraduatedH = findViewById(R.id.intYrGraduatedH);
        intYrGraduatedC = findViewById(R.id.intYrGraduatedC);
        intDegree = findViewById(R.id.intDegree);
        intSpecialSkills = findViewById(R.id.intSpecialSkills);

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
        String elementary = getIntent().getStringExtra("UIDElementary");
        String highSchool = getIntent().getStringExtra("UIDHighSchool");
        String college = getIntent().getStringExtra("UIDCollege");
        String yrGraduatedE = getIntent().getStringExtra("UIDYrGraduatedE");
        String yrGraduatedH = getIntent().getStringExtra("UIDYrGraduatedH");
        String yrGraduatedC = getIntent().getStringExtra("UIDYrGraduatedC");
        String degree = getIntent().getStringExtra("UIDDegree");
        String specialSkills = getIntent().getStringExtra("UIDSpecialSkills");

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
        intElementary.setText(elementary);
        intHighSchool.setText(highSchool);
        intCollege.setText(college);
        intYrGraduatedE.setText(yrGraduatedE);
        intYrGraduatedH.setText(yrGraduatedH);
        intYrGraduatedC.setText(yrGraduatedC);
        intDegree.setText(degree);
        intSpecialSkills.setText(specialSkills);




        //*********Intent/>

    }
}