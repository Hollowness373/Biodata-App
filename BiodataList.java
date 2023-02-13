package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class BiodataList extends AppCompatActivity {

    RecyclerView recycleContacts;
    FloatingActionButton fabAdd;
    DatabaseHelper myDB;
    ArrayList<String> id, name, email, url, dateOfBirth, positionDesired, cellphoneNo, gender, religion, civilStatus,
            height, weight, father, fatherOccupation, mother, motherOccupation, elementary, yearGraduatedE, highSchool, yearGraduatedH,
            college, yearGraduatedC, degreeReceived, specialSkills, companyName1, position1, from1, to1, companyName2, position2,
            from2, to2, referenceName1, referenceContact1, referenceCompany1, referencePosition1, referenceName2, referenceContact2, referenceCompany2, referencePosition2,
            resCertNo, issuedAt, issuedOn, SSS, TIN, NBINo, passportNo;
    ContactsRecViewAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_list);

        fabAdd = findViewById(R.id.fabAdd);

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BiodataList.this, PersonalData.class);
                startActivity(i);
            }
        });

        recycleContacts = findViewById(R.id.recycleContacts);

        myDB = new DatabaseHelper(BiodataList.this);
        id = new ArrayList<>();
        name = new ArrayList<>();
        email = new ArrayList<>();
        url = new ArrayList<>();
        dateOfBirth = new ArrayList<>();
        positionDesired = new ArrayList<>();
        cellphoneNo = new ArrayList<>();
        gender = new ArrayList<>();
        religion = new ArrayList<>();
        civilStatus = new ArrayList<>();
        height = new ArrayList<>();
        weight = new ArrayList<>();
        father = new ArrayList<>();
        fatherOccupation = new ArrayList<>();
        mother = new ArrayList<>();
        motherOccupation = new ArrayList<>();
        elementary = new ArrayList<>();
        yearGraduatedE = new ArrayList<>();
        highSchool = new ArrayList<>();
        yearGraduatedH = new ArrayList<>();
        college = new ArrayList<>();
        yearGraduatedC = new ArrayList<>();
        degreeReceived = new ArrayList<>();
        specialSkills = new ArrayList<>();
        companyName1 = new ArrayList<>();
        position1 = new ArrayList<>();
        from1 = new ArrayList<>();
        to1 = new ArrayList<>();
        companyName2 = new ArrayList<>();
        position2 = new ArrayList<>();
        from2 = new ArrayList<>();
        to2 = new ArrayList<>();
        referenceName1 = new ArrayList<>();
        referenceContact1 = new ArrayList<>();
        referenceCompany1 = new ArrayList<>();
        referencePosition1 = new ArrayList<>();
        referenceName2 = new ArrayList<>();
        referenceContact2 = new ArrayList<>();
        referenceCompany2 = new ArrayList<>();
        referencePosition2 = new ArrayList<>();
        resCertNo = new ArrayList<>();
        issuedAt = new ArrayList<>();
        issuedOn = new ArrayList<>();
        SSS = new ArrayList<>();
        TIN = new ArrayList<>();
        NBINo = new ArrayList<>();
        passportNo = new ArrayList<>();

        storeDataArray();

        customAdapter = new ContactsRecViewAdapter(BiodataList.this, this, id, name, email, url, dateOfBirth, positionDesired, cellphoneNo, gender, religion, civilStatus,
                height, weight, father, fatherOccupation, mother, motherOccupation, elementary, yearGraduatedE, highSchool, yearGraduatedH,
                college, yearGraduatedC, degreeReceived, specialSkills, companyName1, position1, from1, to1, companyName2, position2,
                from2, to2, referenceName1, referenceContact1, referenceCompany1, referencePosition1, referenceName2, referenceContact2, referenceCompany2, referencePosition2,
                resCertNo, issuedAt, issuedOn, SSS, TIN, NBINo, passportNo);
        recycleContacts.setAdapter(customAdapter);
        recycleContacts.setLayoutManager(new GridLayoutManager(this, 2));
    }
    void storeDataArray() {
        Cursor cursor = myDB.readAllData();
        if (cursor.getCount() == 0) {
            Toast.makeText(BiodataList.this, "No Data!", Toast.LENGTH_SHORT).show();
        }else {
            while (cursor.moveToNext()) {
                id.add(cursor.getString(0));
                name.add(cursor.getString(1));
                email.add(cursor.getString(2));
                url.add(cursor.getString(3));
                dateOfBirth.add(cursor.getString(4));
                positionDesired.add(cursor.getString(5));
                cellphoneNo.add(cursor.getString(6));
                gender.add(cursor.getString(7));
                religion.add(cursor.getString(8));
                civilStatus.add(cursor.getString(9));
                height.add(cursor.getString(10));
                weight.add(cursor.getString(11));
                father.add(cursor.getString(12));
                fatherOccupation.add(cursor.getString(13));
                mother.add(cursor.getString(14));
                motherOccupation.add(cursor.getString(15));
                elementary.add(cursor.getString(16));
                yearGraduatedE.add(cursor.getString(17));
                highSchool.add(cursor.getString(18));
                yearGraduatedH.add(cursor.getString(19));
                college.add(cursor.getString(20));
                yearGraduatedC.add(cursor.getString(21));
                degreeReceived.add(cursor.getString(22));
                specialSkills.add(cursor.getString(23));
                companyName1.add(cursor.getString(24));
                position1.add(cursor.getString(25));
                from1.add(cursor.getString(26));
                to1.add(cursor.getString(27));
                companyName2.add(cursor.getString(28));
                position2.add(cursor.getString(29));
                from2.add(cursor.getString(30));
                to2.add(cursor.getString(31));
                referenceName1.add(cursor.getString(32));
                referenceContact1.add(cursor.getString(33));
                referenceCompany1.add(cursor.getString(34));
                referencePosition1.add(cursor.getString(35));
                referenceName2.add(cursor.getString(36));
                referenceContact2.add(cursor.getString(37));
                referenceCompany2.add(cursor.getString(38));
                referencePosition2.add(cursor.getString(39));
                resCertNo.add(cursor.getString(40));
                issuedAt.add(cursor.getString(41));
                issuedOn.add(cursor.getString(42));
                SSS.add(cursor.getString(43));
                TIN.add(cursor.getString(44));
                NBINo.add(cursor.getString(45));
                passportNo.add(cursor.getString(46));
            }
        }
    }
}