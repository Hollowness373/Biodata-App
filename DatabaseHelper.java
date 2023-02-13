package com.example.biodata;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;
//    private static final String DATABASE_NAME = "BioDataApp.db";
    private static final String DATABASE_NAME = "BioDataApp.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "userlist";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_NAME = "Name";
    private static final String COLUMN_EMAIL = "Email";
    private static final String COLUMN_URL = "ImageUrl";
    private static final String COLUMN_DateOfBirth = "DateOfBirth";
    private static final String COLUMN_PositionDesired = "PositionDesired";
    private static final String COLUMN_CellphoneNo = "CellphoneNo";
    private static final String COLUMN_Gender = "Gender";
    private static final String COLUMN_Religion = "Religion";
    private static final String COLUMN_CivilStatus = "CivilStatus";
    private static final String COLUMN_Height = "Height";
    private static final String COLUMN_Weight = "Weight";
    private static final String COLUMN_Father = "Father";
    private static final String COLUMN_FatherOccupation = "FatherOccupation";
    private static final String COLUMN_Mother = "Mother";
    private static final String COLUMN_MotherOccupation = "MotherOccupation";
    private static final String COLUMN_Elementary = "Elementary";
    private static final String COLUMN_YearGraduatedE = "YearGraduatedE";
    private static final String COLUMN_HighSchool = "HighSchool";
    private static final String COLUMN_YearGraduatedH = "YearGraduatedH";
    private static final String COLUMN_College = "College";
    private static final String COLUMN_YearGraduatedC = "YearGraduatedC";
    private static final String COLUMN_DegreeReceived = "DegreeReceived";
    private static final String COLUMN_SpecialSkills = "SpecialSkills";
    private static final String COLUMN_CompanyName1 = "CompanyName1";
    private static final String COLUMN_Position1 = "Position1";
    private static final String COLUMN_From1 = "From1";
    private static final String COLUMN_To1 = "To1";
    private static final String COLUMN_CompanyName2 = "CompanyName2";
    private static final String COLUMN_Position2 = "Position2";
    private static final String COLUMN_From2 = "From2";
    private static final String COLUMN_To2 = "To2";
    private static final String COLUMN_ReferenceName1 = "ReferenceName1";
    private static final String COLUMN_ReferenceContact1 = "ReferenceContact1";
    private static final String COLUMN_ReferenceCompany1 = "ReferenceCompany1";
    private static final String COLUMN_ReferencePosition1 = "ReferencePosition1";
    private static final String COLUMN_ReferenceName2 = "ReferenceName2";
    private static final String COLUMN_ReferenceContact2 = "ReferenceContact2";
    private static final String COLUMN_ReferenceCompany2 = "ReferenceCompany2";
    private static final String COLUMN_ReferencePosition2 = "ReferencePosition2";
    private static final String COLUMN_ResCertNo = "ResCertNo";
    private static final String COLUMN_IssuedAt = "IssuedAt";
    private static final String COLUMN_IssuedOn = "IssuedOn";
    private static final String COLUMN_SSS = "SSS";
    private static final String COLUMN_TIN = "TIN";
    private static final String COLUMN_NBINo = "NBINo";
    private static final String COLUMN_PassportNo = "PassportNo";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_URL + " TEXT, " +
                COLUMN_DateOfBirth + " TEXT, " +
                COLUMN_PositionDesired + " TEXT, " +
                COLUMN_CellphoneNo + " TEXT, " +
                COLUMN_Gender + " TEXT, " +
                COLUMN_Religion + " TEXT, " +
                COLUMN_CivilStatus + " TEXT, " +
                COLUMN_Height + " TEXT, " +
                COLUMN_Weight + " TEXT, " +
                COLUMN_Father + " TEXT, " +
                COLUMN_FatherOccupation + " TEXT, " +
                COLUMN_Mother + " TEXT, " +
                COLUMN_MotherOccupation + " TEXT, " +
                COLUMN_Elementary + " TEXT, " +
                COLUMN_YearGraduatedE + " TEXT, " +
                COLUMN_HighSchool + " TEXT, " +
                COLUMN_YearGraduatedH + " TEXT, " +
                COLUMN_College + " TEXT, " +
                COLUMN_YearGraduatedC + " TEXT, " +
                COLUMN_DegreeReceived + " TEXT, " +
                COLUMN_SpecialSkills + " TEXT, " +
                COLUMN_CompanyName1 + " TEXT, " +
                COLUMN_Position1 + " TEXT, " +
                COLUMN_From1 + " TEXT, " +
                COLUMN_To1 + " TEXT, " +
                COLUMN_CompanyName2 + " TEXT, " +
                COLUMN_Position2 + " TEXT, " +
                COLUMN_From2 + " TEXT, " +
                COLUMN_To2 + " TEXT, " +
                COLUMN_ReferenceName1 + " TEXT, " +
                COLUMN_ReferenceContact1 + " TEXT, " +
                COLUMN_ReferenceCompany1 + " TEXT, " +
                COLUMN_ReferencePosition1 + " TEXT, " +
                COLUMN_ReferenceName2 + " TEXT, " +
                COLUMN_ReferenceContact2 + " TEXT, " +
                COLUMN_ReferenceCompany2 + " TEXT, " +
                COLUMN_ReferencePosition2 + " TEXT, " +
                COLUMN_ResCertNo + " TEXT, " +
                COLUMN_IssuedAt + " TEXT, " +
                COLUMN_IssuedOn + " TEXT, " +
                COLUMN_SSS + " TEXT, " +
                COLUMN_TIN + " TEXT, " +
                COLUMN_NBINo + " TEXT, " +
                COLUMN_PassportNo + " TEXT);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void registerForm(String name, String email, String url, String dateOfBirth, String positionDesired, String cellphoneNo, String gender, String religion, String civilStatus, String height,
                      String weight, String father, String fatherOccupation, String mother, String motherOccupation, String elementary, String yearGraduatedE, String highSchool, String yearGraduatedH, String college,
                      String yearGraduatedC, String degreeReceived, String specialSkills, String companyName1, String position1, String from1, String to1, String companyName2, String position2, String from2,
                      String to2, String referenceName1, String referenceContact1, String referenceCompany1, String referencePosition1, String referenceName2, String referenceContact2, String referenceCompany2, String referencePosition2, String resCertNo,
                      String issuedAt, String issuedOn, String SSS, String TIN, String nbiNo, String passportNo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, name);
        cv.put(COLUMN_EMAIL, email);
        cv.put(COLUMN_URL, url);
        cv.put(COLUMN_DateOfBirth, dateOfBirth);
        cv.put(COLUMN_PositionDesired, positionDesired);
        cv.put(COLUMN_CellphoneNo, cellphoneNo);
        cv.put(COLUMN_Gender, gender);
        cv.put(COLUMN_Religion, religion);
        cv.put(COLUMN_CivilStatus, civilStatus);
        cv.put(COLUMN_Height, height);
        cv.put(COLUMN_Weight, weight);
        cv.put(COLUMN_Father, father);
        cv.put(COLUMN_FatherOccupation, fatherOccupation);
        cv.put(COLUMN_Mother, mother);
        cv.put(COLUMN_MotherOccupation, motherOccupation);
        cv.put(COLUMN_Elementary, elementary);
        cv.put(COLUMN_YearGraduatedE, yearGraduatedE);
        cv.put(COLUMN_HighSchool, highSchool);
        cv.put(COLUMN_YearGraduatedH, yearGraduatedH);
        cv.put(COLUMN_College, college);
        cv.put(COLUMN_YearGraduatedC, yearGraduatedC);
        cv.put(COLUMN_DegreeReceived, degreeReceived);
        cv.put(COLUMN_SpecialSkills, specialSkills);
        cv.put(COLUMN_CompanyName1, companyName1);
        cv.put(COLUMN_Position1, position1);
        cv.put(COLUMN_From1, from1);
        cv.put(COLUMN_To1, to1);
        cv.put(COLUMN_CompanyName2, companyName2);
        cv.put(COLUMN_Position2, position2);
        cv.put(COLUMN_From2, from2);
        cv.put(COLUMN_To2, to2);
        cv.put(COLUMN_ReferenceName1, referenceName1);
        cv.put(COLUMN_ReferenceContact1, referenceContact1);
        cv.put(COLUMN_ReferenceCompany1, referenceCompany1);
        cv.put(COLUMN_ReferencePosition1, referencePosition1);
        cv.put(COLUMN_ReferenceName2, referenceName2);
        cv.put(COLUMN_ReferenceContact2, referenceContact2);
        cv.put(COLUMN_ReferenceCompany2, referenceCompany2);
        cv.put(COLUMN_ReferencePosition2, referencePosition2);
        cv.put(COLUMN_ResCertNo, resCertNo);
        cv.put(COLUMN_IssuedAt, issuedAt);
        cv.put(COLUMN_IssuedOn, issuedOn);
        cv.put(COLUMN_SSS, SSS);
        cv.put(COLUMN_TIN, TIN);
        cv.put(COLUMN_NBINo, nbiNo);
        cv.put(COLUMN_PassportNo, passportNo);
        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Registered Successfully!", Toast.LENGTH_SHORT).show();
        }
    }

    Cursor readAllData() {
        String query = "SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    void deleteInfoRow(String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_NAME, "ID=?", new String[]{row_id});
        if (result == -1){
            Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Successfully Deleted.", Toast.LENGTH_SHORT).show();
        }
    }

}
