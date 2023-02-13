package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CharacterReference extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSubmit:
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
                String companyName1 = intCompanyName1.getText().toString();
                String companyName2 = intCompanyName2.getText().toString();
                String position1 = intPosition1.getText().toString();
                String position2 = intPosition2.getText().toString();
                String from1 = intFrom1.getText().toString();
                String from2 = intFrom2.getText().toString();
                String to1 = intTo1.getText().toString();
                String to2 = intTo2.getText().toString();
                String chrName1 = edtChrName1.getText().toString();
                String chrName2 = edtChrName2.getText().toString();
                String cpEmail1 = edtCpEmail1.getText().toString();
                String cpEmail2 = edtCpEmail2.getText().toString();
                String chrCompany1 = edtChrCompany1.getText().toString();
                String chrCompany2 = edtChrCompany2.getText().toString();
                String chrPosition1 = edtChrPosition1.getText().toString();
                String chrPosition2 = edtChrPosition2.getText().toString();
                String resCert = edtResCert.getText().toString();
                String issuedAt = edtIssuedAt.getText().toString();
                String issuedOn = edtIssuedOn.getText().toString();
                String SSS = edtSSS.getText().toString();
                String TIN = edtTIN.getText().toString();
                String nbiNo = edtNbiNo.getText().toString();
                String passportNo = edtPassportNo.getText().toString();

                Intent intent = new Intent(this, DisplayBioData.class);
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
                intent.putExtra("UIDChrName1", chrName1);
                intent.putExtra("UIDChrName2", chrName2);
                intent.putExtra("UIDCpEmail1", cpEmail1);
                intent.putExtra("UIDCpEmail2", cpEmail2);
                intent.putExtra("UIDChrCompany1", chrCompany1);
                intent.putExtra("UIDChrCompany2", chrCompany2);
                intent.putExtra("UIDChrPosition1", chrPosition1);
                intent.putExtra("UIDChrPosition2", chrPosition2);
                intent.putExtra("UIDResCert", resCert);
                intent.putExtra("UIDIssuedAt", issuedAt);
                intent.putExtra("UIDIssuedOn", issuedOn);
                intent.putExtra("UIDSSS", SSS);
                intent.putExtra("UIDTIN", TIN);
                intent.putExtra("UIDNbiNo", nbiNo);
                intent.putExtra("UIDPassportNo", passportNo);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    //***Intent Text notVisible
    private TextView intName, intEmail,intCpNumber, intPositionDesired, intReligion, intHeight, intWeight, intFatherName, intMotherName, intOccupation1, intOccupation2, intImageUrl,
    intRGroup, intDateOfBirth, intCivilStatus, intElementary, intHighSchool, intCollege, intYrGraduatedE, intYrGraduatedH, intYrGraduatedC, intDegree, intSpecialSkills,
    intCompanyName1, intCompanyName2, intPosition1, intPosition2, intFrom1, intFrom2, intTo1, intTo2;

    private EditText edtChrName1, edtCpEmail1, edtChrCompany1, edtChrPosition1, edtChrName2, edtCpEmail2, edtChrCompany2,
            edtChrPosition2, edtResCert, edtIssuedAt, edtIssuedOn, edtSSS, edtTIN, edtNbiNo, edtPassportNo;

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_reference);
        getSupportActionBar().hide();

        edtChrName1 = findViewById(R.id.edtChrName1);
        edtChrName2 = findViewById(R.id.edtChrName2);
        edtChrCompany1 = findViewById(R.id.edtChrCompany1);
        edtChrCompany2 = findViewById(R.id.edtChrCompany2);
        edtCpEmail1 = findViewById(R.id.edtCpEmail1);
        edtCpEmail2 = findViewById(R.id.edtCpEmail2);
        edtChrPosition1 = findViewById(R.id.edtChrPosition1);
        edtChrPosition2 = findViewById(R.id.edtChrPosition2);
        edtResCert = findViewById(R.id.edtResCert);
        edtIssuedAt = findViewById(R.id.edtIssuedAt);
        edtIssuedOn = findViewById(R.id.edtIssuedOn);
        edtSSS = findViewById(R.id.edtSSS);
        edtTIN = findViewById(R.id.edtTIN);
        edtNbiNo = findViewById(R.id.edtNbiNo);
        edtPassportNo = findViewById(R.id.edtPassportNo);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);


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
        intCompanyName1 = findViewById(R.id.intCompanyName1);
        intCompanyName2 = findViewById(R.id.intCompanyName2);
        intPosition1 = findViewById(R.id.intPosition1);
        intPosition2 = findViewById(R.id.intPosition2);
        intFrom1 = findViewById(R.id.intFrom1);
        intFrom2 = findViewById(R.id.intFrom2);
        intTo1 = findViewById(R.id.intTo1);
        intTo2 = findViewById(R.id.intTo2);

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
        String companyName1 = getIntent().getStringExtra("UIDCompanyName1");
        String companyName2 = getIntent().getStringExtra("UIDCompanyName2");
        String position1 = getIntent().getStringExtra("UIDPosition1");
        String position2 = getIntent().getStringExtra("UIDPosition2");
        String from1 = getIntent().getStringExtra("UIDFrom1");
        String from2 = getIntent().getStringExtra("UIDFrom2");
        String to1 = getIntent().getStringExtra("UIDTo1");
        String to2 = getIntent().getStringExtra("UIDTo2");

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
        intCompanyName1.setText(companyName1);
        intCompanyName2.setText(companyName2);
        intPosition1.setText(position1);
        intPosition2.setText(position2);
        intFrom1.setText(from1);
        intFrom2.setText(from2);
        intTo1.setText(to1);
        intTo2.setText(to2);





        //*********Intent/>

    }
}