package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DisplayBioData extends AppCompatActivity {


    ImageView imgImage1;
    private EditText intImahe;
    private ImageButton imgButton;
    private Button btnReturnHome;
    private TextView txtNameOfUser, txtEmailOfUser, txtCPOfUser, txtPositionOfUser, txtReligionOfUser, txtHeightOfUser, txtWeightOfUser, txtFatherName, txtMotherName, txtOccupation1, txtOccupation2,
    txtGenderOfUser, txtCivilStatusOfUser, txtDateOfBirthOfUser, txtElementaryOfUser, txtHighSchoolOfUser, txtCollegeOfUser, txtYearGraduatedEOfUser, txtYearGraduatedHOfUser, txtYearGraduatedCOfUser,
    txtDegreeReceivedOfUser, txtSpecialSkillsOfUser, txtCompanyName1OfUser, txtCompanyName2OfUser, txtPosition1OfUser, txtPosition2OfUser, txtFrom1OfUser, txtFrom2OfUser,
    txtTo1OfUser, txtTo2OfUser, txtChrName1OfUser, txtChrName2OfUser, txtCpEmail1OfUser, txtCpEmail2OfUser, txtChrCompany1OfUser, txtChrCompany2OfUser, txtChrPosition1OfUser, txtChrPosition2OfUser,
    txtResCertOfUser, txtIssuedAtOfUser, txtIssuedOnOfUser, txtSSSOfUser, txtTINOfUser, txtNbiNoOfUser, txtPassportNoOfUser;


    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_bio_data);

        databaseHelper = new DatabaseHelper(getApplicationContext());

        btnReturnHome = findViewById(R.id.btnReturnHome);
        btnReturnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper myDB = new DatabaseHelper(DisplayBioData.this);
                myDB.registerForm(txtNameOfUser.getText().toString().trim(), txtEmailOfUser.getText().toString().trim(),
                        intImahe.getText().toString().trim(), txtDateOfBirthOfUser.getText().toString().trim(),
                        txtPositionOfUser.getText().toString().trim(), txtCPOfUser.getText().toString().trim(), txtGenderOfUser.getText().toString().trim(),
                        txtReligionOfUser.getText().toString().trim(), txtCivilStatusOfUser.getText().toString().trim(), txtHeightOfUser.getText().toString().trim(),
                        txtWeightOfUser.getText().toString().trim(), txtFatherName.getText().toString().trim(), txtOccupation1.getText().toString().trim(),
                        txtMotherName.getText().toString().trim(), txtOccupation2.getText().toString().trim(), txtElementaryOfUser.getText().toString().trim(),
                        txtYearGraduatedEOfUser.getText().toString().trim(), txtHighSchoolOfUser.getText().toString().trim(), txtYearGraduatedHOfUser.getText().toString().trim(),
                        txtCollegeOfUser.getText().toString().trim(), txtYearGraduatedCOfUser.getText().toString().trim(), txtDegreeReceivedOfUser.getText().toString().trim(),
                        txtSpecialSkillsOfUser.getText().toString().trim(), txtCompanyName1OfUser.getText().toString().trim(), txtPosition1OfUser.getText().toString().trim(),
                        txtFrom1OfUser.getText().toString().trim(), txtTo1OfUser.getText().toString().trim(), txtCompanyName2OfUser.getText().toString().trim(),
                        txtPosition2OfUser.getText().toString().trim(), txtFrom2OfUser.getText().toString().trim(), txtTo2OfUser.getText().toString().trim(),
                        txtChrName1OfUser.getText().toString().trim(), txtCpEmail1OfUser.getText().toString().trim(), txtChrCompany1OfUser.getText().toString().trim(),
                        txtChrPosition1OfUser.getText().toString().trim(), txtChrName2OfUser.getText().toString().trim(), txtCpEmail2OfUser.getText().toString().trim(),
                        txtChrCompany2OfUser.getText().toString().trim(), txtChrPosition2OfUser.getText().toString().trim(), txtResCertOfUser.getText().toString().trim(),
                        txtIssuedAtOfUser.getText().toString().trim(), txtIssuedOnOfUser.getText().toString().trim(), txtSSSOfUser.getText().toString().trim(),
                        txtTINOfUser.getText().toString().trim(), txtNbiNoOfUser.getText().toString().trim(), txtPassportNoOfUser.getText().toString().trim());
                Intent home = new Intent(DisplayBioData.this, BiodataList.class);
                startActivity(home);
            }
        });


        imgButton = findViewById(R.id.imgButton);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intImahe = findViewById(R.id.intImahe);
                imgImage1 = findViewById(R.id.imgImage1);
                Glide.with(DisplayBioData.this).load(intImahe.getText().toString()).into(imgImage1);
            }
        });

        intImahe = findViewById(R.id.intImahe);
        imgImage1 = findViewById(R.id.imgImage1);
        Glide.with(this).load(intImahe.getText().toString()).into(imgImage1);

        intImahe = findViewById(R.id.intImahe);

        txtNameOfUser = findViewById(R.id.txtNameOfUser);
        txtEmailOfUser = findViewById(R.id.txtEmailOfUser);
        txtCPOfUser = findViewById(R.id.txtCPOfUser);
        txtPositionOfUser = findViewById(R.id.txtPositionDOfUser);
        txtReligionOfUser = findViewById(R.id.txtReligionOfUser);
        txtHeightOfUser = findViewById(R.id.txtHeightOfUser);
        txtWeightOfUser = findViewById(R.id.txtWeightOfUser);
        txtFatherName = findViewById(R.id.txtFatherNameOfUser);
        txtMotherName = findViewById(R.id.txtMotherNameOfUser);
        txtOccupation1 = findViewById(R.id.txtOccupation1ans);
        txtOccupation2 = findViewById(R.id.txtOccupation2ans);
        txtGenderOfUser = findViewById(R.id.txtGenderOfUser);
        txtCivilStatusOfUser = findViewById(R.id.txtCivilStatusOfUser);
        txtDateOfBirthOfUser = findViewById(R.id.txtDateOfBirthOfUser);
        txtElementaryOfUser = findViewById(R.id.txtElementaryOfUser);
        txtHighSchoolOfUser = findViewById(R.id.txtHighSchoolOfUser);
        txtCollegeOfUser = findViewById(R.id.txtCollegeOfUser);
        txtYearGraduatedEOfUser = findViewById(R.id.txtYearGraduatedEOfUser);
        txtYearGraduatedHOfUser = findViewById(R.id.txtYearGraduatedHOfUser);
        txtYearGraduatedCOfUser = findViewById(R.id.txtYearGraduatedCOfUser);
        txtDegreeReceivedOfUser = findViewById(R.id.txtDegreeReceivedOfUser);
        txtSpecialSkillsOfUser = findViewById(R.id.txtSpecialSkillsOfUser);
        txtCompanyName1OfUser = findViewById(R.id.txtCompanyName1OfUser);
        txtCompanyName2OfUser = findViewById(R.id.txtCompanyName2OfUser);
        txtPosition1OfUser = findViewById(R.id.txtPosition1OfUser);
        txtPosition2OfUser = findViewById(R.id.txtPosition2OfUser);
        txtFrom1OfUser = findViewById(R.id.txtFrom1OfUser);
        txtFrom2OfUser = findViewById(R.id.txtFrom2OfUser);
        txtTo1OfUser = findViewById(R.id.txtTo1OfUser);
        txtTo2OfUser = findViewById(R.id.txtTo2OfUser);
        txtChrName1OfUser = findViewById(R.id.txtChrName1OfUser);
        txtChrName2OfUser = findViewById(R.id.txtChrName2OfUser);
        txtCpEmail1OfUser = findViewById(R.id.txtCpEmail1OfUser);
        txtCpEmail2OfUser = findViewById(R.id.txtCpEmail2OfUser);
        txtChrCompany1OfUser = findViewById(R.id.txtChrCompanyNames1OfUser);
        txtChrCompany2OfUser = findViewById(R.id.txtChrCompanyNames2OfUser);
        txtChrPosition1OfUser = findViewById(R.id.txtChrPosition1OfUser);
        txtChrPosition2OfUser = findViewById(R.id.txtChrPosition2OfUser);
        txtResCertOfUser = findViewById(R.id.txtResCertOfUser);
        txtIssuedAtOfUser = findViewById(R.id.txtIssuedAtOfUser);
        txtIssuedOnOfUser = findViewById(R.id.txtIssuedOnOfUser);
        txtSSSOfUser = findViewById(R.id.txtSSS);
        txtTINOfUser = findViewById(R.id.txtTINOfUser);
        txtNbiNoOfUser = findViewById(R.id.txtNbiNoOfUser);
        txtPassportNoOfUser = findViewById(R.id.txtPassportNoOfUser);

//        intImageUrl = findViewById(R.id.intImageUrl);


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
        String gender = getIntent().getStringExtra("UIDGender");
        String imageUrl = getIntent().getStringExtra("UIDImageUrl");
        String civilStatus = getIntent().getStringExtra("UIDCivilStatus");
        String dateOfBirth = getIntent().getStringExtra("UIDDateOfBirth");
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
        String chrName1 = getIntent().getStringExtra("UIDChrName1");
        String chrName2 = getIntent().getStringExtra("UIDChrName2");
        String cpEmail1 = getIntent().getStringExtra("UIDCpEmail1");
        String cpEmail2 = getIntent().getStringExtra("UIDCpEmail2");
        String chrCompany1 = getIntent().getStringExtra("UIDChrCompany1");
        String chrCompany2 = getIntent().getStringExtra("UIDChrCompany2");
        String chrPosition1 = getIntent().getStringExtra("UIDChrPosition1");
        String chrPosition2 = getIntent().getStringExtra("UIDChrPosition2");
        String resCert = getIntent().getStringExtra("UIDResCert");
        String issuedAt = getIntent().getStringExtra("UIDIssuedAt");
        String issuedOn = getIntent().getStringExtra("UIDIssuedOn");
        String SSS = getIntent().getStringExtra("UIDSSS");
        String TIN = getIntent().getStringExtra("UIDTIN");
        String nbiNO = getIntent().getStringExtra("UIDNbiNo");
        String passportNo = getIntent().getStringExtra("UIDPassportNo");


        txtNameOfUser.setText(name);
        txtEmailOfUser.setText(email);
        txtCPOfUser.setText(cellphoneNumber);
        txtPositionOfUser.setText(positionDesired);
        txtReligionOfUser.setText(religion);
        txtHeightOfUser.setText(height);
        txtWeightOfUser.setText(weight);
        txtFatherName.setText(fatherName);
        txtMotherName.setText(motherName);
        txtOccupation1.setText(occupation1);
        txtOccupation2.setText(occupation2);
        txtGenderOfUser.setText(gender);
        intImahe.setText(imageUrl);
        txtCivilStatusOfUser.setText(civilStatus);
        txtDateOfBirthOfUser.setText(dateOfBirth);
        txtElementaryOfUser.setText(elementary);
        txtHighSchoolOfUser.setText(highSchool);
        txtCollegeOfUser.setText(college);
        txtYearGraduatedEOfUser.setText(yrGraduatedE);
        txtYearGraduatedHOfUser.setText(yrGraduatedH);
        txtYearGraduatedCOfUser.setText(yrGraduatedC);
        txtDegreeReceivedOfUser.setText(degree);
        txtSpecialSkillsOfUser.setText(specialSkills);
        txtCompanyName1OfUser.setText(companyName1);
        txtCompanyName2OfUser.setText(companyName2);
        txtPosition1OfUser.setText(position1);
        txtPosition2OfUser.setText(position2);
        txtFrom1OfUser.setText(from1);
        txtFrom2OfUser.setText(from2);
        txtTo1OfUser.setText(to1);
        txtTo2OfUser.setText(to2);
        txtChrName1OfUser.setText(chrName1);
        txtChrName2OfUser.setText(chrName2);
        txtCpEmail1OfUser.setText(cpEmail1);
        txtCpEmail2OfUser.setText(cpEmail2);
        txtChrCompany1OfUser.setText(chrCompany1);
        txtChrCompany2OfUser.setText(chrCompany2);
        txtChrPosition1OfUser.setText(chrPosition1);
        txtChrPosition2OfUser.setText(chrPosition2);
        txtResCertOfUser.setText(resCert);
        txtIssuedAtOfUser.setText(issuedAt);
        txtIssuedOnOfUser.setText(issuedOn);
        txtSSSOfUser.setText(SSS);
        txtTINOfUser.setText(TIN);
        txtNbiNoOfUser.setText(nbiNO);
        txtPassportNoOfUser.setText(passportNo);




    }
}