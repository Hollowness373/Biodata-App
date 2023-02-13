package com.example.biodata;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ViewUserBioData extends AppCompatActivity {

    ImageView imgImage2;
    private EditText intImahe;
    private ImageButton imgButton;
    private Button btnDeleteInfo;
    private TextView txtIDOfUser;
    private TextView txtNameOfUser, txtEmailOfUser, txtCPOfUser, txtPositionOfUser, txtReligionOfUser, txtHeightOfUser, txtWeightOfUser, txtFatherName, txtMotherName, txtOccupation1, txtOccupation2,
            txtGenderOfUser, txtCivilStatusOfUser, txtDateOfBirthOfUser, txtElementaryOfUser, txtHighSchoolOfUser, txtCollegeOfUser, txtYearGraduatedEOfUser, txtYearGraduatedHOfUser, txtYearGraduatedCOfUser,
            txtDegreeReceivedOfUser, txtSpecialSkillsOfUser, txtCompanyName1OfUser, txtCompanyName2OfUser, txtPosition1OfUser, txtPosition2OfUser, txtFrom1OfUser, txtFrom2OfUser,
            txtTo1OfUser, txtTo2OfUser, txtChrName1OfUser, txtChrName2OfUser, txtCpEmail1OfUser, txtCpEmail2OfUser, txtChrCompany1OfUser, txtChrCompany2OfUser, txtChrPosition1OfUser, txtChrPosition2OfUser,
            txtResCertOfUser, txtIssuedAtOfUser, txtIssuedOnOfUser, txtSSSOfUser, txtTINOfUser, txtNbiNoOfUser, txtPassportNoOfUser;


    DatabaseHelper databaseHelper1;
    String intID, intName, intEmail, intUrl, intDateOfBirth, intPositionDesired, intCellphoneNo, intGender, intReligion, intCivilStatus,
            intHeight, intWeight, intFather, intFatherOccupation, intMother, intMotherOccupation, intElementary, intYearGraduatedE, intHighSchool, intYearGraduatedH,
            intCollege, intYearGraduatedC, intDegreeReceived, intSpecialSkills, intCompanyName1, intPosition1, intFrom1, intTo1, intCompanyName2, intPosition2,
            intFrom2, intTo2, intReferenceName1, intReferenceContact1, intReferenceCompany1, intReferencePosition1, intReferenceName2, intReferenceContact2, intReferenceCompany2, intReferencePosition2,
            intResCertNo, intIssuedAt, intIssuedOn, intSSS, intTIN, intNBINo, intPassportNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_user_bio_data);

        databaseHelper1 = new DatabaseHelper(getApplicationContext());

        btnDeleteInfo = findViewById(R.id.btnDeleteInfo);
        imgButton = findViewById(R.id.imgButton);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intImahe = findViewById(R.id.intImahe);
                imgImage2 = findViewById(R.id.imgImage2);
                Glide.with(ViewUserBioData.this).load(intImahe.getText().toString()).into(imgImage2);
            }
        });

        intImahe = findViewById(R.id.intImahe);
        imgImage2 = findViewById(R.id.imgImage2);
        Glide.with(this).load(intImahe.getText().toString()).into(imgImage2);

        txtIDOfUser = findViewById(R.id.txtIDOfUser);
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

        intentData();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(intName + "'s BioData");

        btnDeleteInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmMessageDialog();
            }
        });

    }

    void intentData(){
        if (getIntent().hasExtra("VID") && getIntent().hasExtra("VUIDName") && getIntent().hasExtra("VUIDEmail") && getIntent().hasExtra("VUIDImageUrl")){
            intID = getIntent().getStringExtra("VID");
            intName = getIntent().getStringExtra("VUIDName");
            intEmail = getIntent().getStringExtra("VUIDEmail");
            intUrl = getIntent().getStringExtra("VUIDImageUrl");
            intDateOfBirth = getIntent().getStringExtra("VUIDDateOfBirth");
            intPositionDesired = getIntent().getStringExtra("VUIDPositionDesired");
            intCellphoneNo = getIntent().getStringExtra("VUIDCellphoneNo");
            intGender = getIntent().getStringExtra("VUIDGender");
            intReligion = getIntent().getStringExtra("VUIDReligion");
            intCivilStatus = getIntent().getStringExtra("VUIDCivilStatus");
            intHeight = getIntent().getStringExtra("VUIDHeight");
            intWeight = getIntent().getStringExtra("VUIDWeight");
            intFather = getIntent().getStringExtra("VUIDFather");
            intFatherOccupation = getIntent().getStringExtra("VUIDFatherOccupation");
            intMother = getIntent().getStringExtra("VUIDMother");
            intMotherOccupation = getIntent().getStringExtra("VUIDMotherOccupation");
            intElementary = getIntent().getStringExtra("VUIDElementary");
            intYearGraduatedE = getIntent().getStringExtra("VUIDYearGraduatedE");
            intHighSchool = getIntent().getStringExtra("VUIDHighSchool");
            intYearGraduatedH = getIntent().getStringExtra("VUIDYearGraduatedH");
            intCollege = getIntent().getStringExtra("VUIDCollege");
            intYearGraduatedC = getIntent().getStringExtra("VUIDYearGraduatedC");
            intDegreeReceived = getIntent().getStringExtra("VUIDDegreeReceived");
            intSpecialSkills = getIntent().getStringExtra("VUIDSpecialSkills");
            intCompanyName1 = getIntent().getStringExtra("VUIDCompanyName1");
            intPosition1 = getIntent().getStringExtra("VUIDPosition1");
            intFrom1 = getIntent().getStringExtra("VUIDFrom1");
            intTo1 = getIntent().getStringExtra("VUIDTo1");
            intCompanyName2 = getIntent().getStringExtra("VUIDCompanyName2");
            intPosition2 = getIntent().getStringExtra("VUIDPosition2");
            intFrom2 = getIntent().getStringExtra("VUIDFrom2");
            intTo2 = getIntent().getStringExtra("VUIDTo2");
            intReferenceName1 = getIntent().getStringExtra("VUIDReferenceName1");
            intReferenceContact1 = getIntent().getStringExtra("VUIDReferenceContact1");
            intReferenceCompany1 = getIntent().getStringExtra("VUIDReferenceCompany1");
            intReferencePosition1 = getIntent().getStringExtra("VUIDReferencePosition1");
            intReferenceName2 = getIntent().getStringExtra("VUIDReferenceName2");
            intReferenceContact2 = getIntent().getStringExtra("VUIDReferenceContact2");
            intReferenceCompany2 = getIntent().getStringExtra("VUIDReferenceCompany2");
            intReferencePosition2 = getIntent().getStringExtra("VUIDReferencePosition2");
            intResCertNo = getIntent().getStringExtra("VUIDResCertNo");
            intIssuedAt = getIntent().getStringExtra("VUIDIssuedAt");
            intIssuedOn = getIntent().getStringExtra("VUIDIssuedOn");
            intSSS = getIntent().getStringExtra("VUIDSSS");
            intTIN = getIntent().getStringExtra("VUIDTIN");
            intNBINo = getIntent().getStringExtra("VUIDNBINo");
            intPassportNo = getIntent().getStringExtra("VUIDPassportNo");

            txtIDOfUser.setText(intID);
            txtNameOfUser.setText(intName);
            txtEmailOfUser.setText(intEmail);
            intImahe.setText(intUrl);
            txtDateOfBirthOfUser.setText(intDateOfBirth);
            txtPositionOfUser.setText(intPositionDesired);
            txtCPOfUser.setText(intCellphoneNo);
            txtGenderOfUser.setText(intGender);
            txtReligionOfUser.setText(intReligion);
            txtCivilStatusOfUser.setText(intCivilStatus);
            txtHeightOfUser.setText(intHeight);
            txtWeightOfUser.setText(intWeight);
            txtFatherName.setText(intFather);
            txtOccupation1.setText(intFatherOccupation);
            txtMotherName.setText(intMother);
            txtOccupation2.setText(intMotherOccupation);
            txtElementaryOfUser.setText(intElementary);
            txtYearGraduatedEOfUser.setText(intYearGraduatedE);
            txtHighSchoolOfUser.setText(intHighSchool);
            txtYearGraduatedHOfUser.setText(intYearGraduatedH);
            txtCollegeOfUser.setText(intCollege);
            txtYearGraduatedCOfUser.setText(intYearGraduatedC);
            txtDegreeReceivedOfUser.setText(intDegreeReceived);
            txtSpecialSkillsOfUser.setText(intSpecialSkills);
            txtCompanyName1OfUser.setText(intCompanyName1);
            txtPosition1OfUser.setText(intPosition1);
            txtFrom1OfUser.setText(intFrom1);
            txtTo1OfUser.setText(intTo1);
            txtCompanyName2OfUser.setText(intCompanyName2);
            txtPosition2OfUser.setText(intPosition2);
            txtFrom2OfUser.setText(intFrom2);
            txtTo2OfUser.setText(intTo2);
            txtChrName1OfUser.setText(intReferenceName1);
            txtCpEmail1OfUser.setText(intReferenceContact1);
            txtChrCompany1OfUser.setText(intReferenceCompany1);
            txtChrPosition1OfUser.setText(intReferencePosition1);
            txtChrName2OfUser.setText(intReferenceName2);
            txtCpEmail2OfUser.setText(intReferenceContact2);
            txtChrCompany2OfUser.setText(intReferenceCompany2);
            txtChrPosition2OfUser.setText(intReferencePosition2);
            txtResCertOfUser.setText(intResCertNo);
            txtIssuedAtOfUser.setText(intIssuedAt);
            txtIssuedOnOfUser.setText(intIssuedOn);
            txtSSSOfUser.setText(intSSS);
            txtTINOfUser.setText(intTIN);
            txtNbiNoOfUser.setText(intNBINo);
            txtPassportNoOfUser.setText(intPassportNo);
        }else {
            Toast.makeText(this, "No Data!", Toast.LENGTH_SHORT).show();
        }
    }

    void confirmMessageDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete " + intName + "'s BioData?");
        builder.setMessage("All data will be deleted once you click *Yes*");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                DatabaseHelper myDb = new DatabaseHelper(ViewUserBioData.this);
                myDb.deleteInfoRow(intID);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
//        builder.create().show();
        AlertDialog alert11 = builder.create();
        alert11.show();

        Button buttonBackground = alert11.getButton(DialogInterface.BUTTON_NEGATIVE);
        buttonBackground.setTextColor(Color.WHITE);

        Button buttonBackground1 = alert11.getButton(DialogInterface.BUTTON_POSITIVE);
        buttonBackground1.setTextColor(Color.rgb(242, 141, 141));
    }
}