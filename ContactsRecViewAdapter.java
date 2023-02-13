package com.example.biodata;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder> {

    private ArrayList id, name, email, url, dateOfBirth, positionDesired, cellphoneNo, gender, religion, civilStatus,
            height, weight, father, fatherOccupation, mother, motherOccupation, elementary, yearGraduatedE, highSchool, yearGraduatedH,
            college, yearGraduatedC, degreeReceived, specialSkills, companyName1, position1, from1, to1, companyName2, position2,
            from2, to2, referenceName1, referenceContact1, referenceCompany1, referencePosition1, referenceName2, referenceContact2, referenceCompany2, referencePosition2,
            resCertNo, issuedAt, issuedOn, SSS, TIN, NBINo, passportNo;
    Activity activity;
    private Context context;

    public ContactsRecViewAdapter(Activity activity, Context context, ArrayList id, ArrayList name, ArrayList email, ArrayList url,
                                  ArrayList dateOfBirth, ArrayList positionDesired, ArrayList cellphoneNo, ArrayList gender, ArrayList religion, ArrayList civilStatus,
                                  ArrayList height, ArrayList weight, ArrayList father, ArrayList fatherOccupation, ArrayList mother, ArrayList motherOccupation,
                                  ArrayList elementary, ArrayList yearGraduatedE, ArrayList highSchool, ArrayList yearGraduatedH, ArrayList college, ArrayList yearGraduatedC,
                                  ArrayList degreeReceived, ArrayList specialSkills, ArrayList companyName1, ArrayList position1, ArrayList from1, ArrayList to1,
                                  ArrayList companyName2, ArrayList position2, ArrayList from2, ArrayList to2, ArrayList referenceName1, ArrayList referenceContact1,
                                  ArrayList referenceCompany1, ArrayList referencePosition1, ArrayList referenceName2, ArrayList referenceContact2, ArrayList referenceCompany2, ArrayList referencePosition2,
                                  ArrayList resCertNo, ArrayList issuedAt, ArrayList issuedOn, ArrayList SSS, ArrayList TIN, ArrayList NBINo, ArrayList passportNo) {
        this.activity = activity;
        this.context = context;
        this.id = id;
        this.name = name;
        this.email = email;
        this.url = url;
        this.dateOfBirth = dateOfBirth;
        this.positionDesired = positionDesired;
        this.cellphoneNo = cellphoneNo;
        this.gender = gender;
        this.religion = religion;
        this.civilStatus = civilStatus;
        this.height = height;
        this.weight = weight;
        this.father = father;
        this.fatherOccupation = fatherOccupation;
        this.mother = mother;
        this.motherOccupation = motherOccupation;
        this.elementary = elementary;
        this.yearGraduatedE = yearGraduatedE;
        this.highSchool = highSchool;
        this.yearGraduatedH = yearGraduatedH;
        this.college = college;
        this.yearGraduatedC = yearGraduatedC;
        this.degreeReceived = degreeReceived;
        this.specialSkills = specialSkills;
        this.companyName1 = companyName1;
        this.position1 = position1;
        this.from1 = from1;
        this.to1 = to1;
        this.companyName2 = companyName2;
        this.position2 = position2;
        this.from2 = from2;
        this.to2 = to2;
        this.referenceName1 = referenceName1;
        this.referenceContact1 = referenceContact1;
        this.referenceCompany1 = referenceCompany1;
        this.referencePosition1 = referencePosition1;
        this.referenceName2 = referenceName2;
        this.referenceContact2 = referenceContact2;
        this.referenceCompany2 = referenceCompany2;
        this.referencePosition2 = referencePosition2;
        this.resCertNo = resCertNo;
        this.issuedAt = issuedAt;
        this.issuedOn = issuedOn;
        this.SSS = SSS;
        this.TIN = TIN;
        this.NBINo = NBINo;
        this.passportNo = passportNo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.contact_list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtName.setText(String.valueOf(name.get(position)));
        holder.txtEmail.setText(String.valueOf(email.get(position)));
        Glide.with(context)
                .asBitmap()
                .load(String.valueOf(url.get(position)))
                .into(holder.imgvImage);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ViewUserBioData.class);
                intent.putExtra("VID", String.valueOf(id.get(position)));
                intent.putExtra("VUIDName", String.valueOf(name.get(position)));
                intent.putExtra("VUIDEmail", String.valueOf(email.get(position)));
                intent.putExtra("VUIDImageUrl", String.valueOf(url.get(position)));
                intent.putExtra("VUIDDateOfBirth", String.valueOf(dateOfBirth.get(position)));
                intent.putExtra("VUIDPositionDesired", String.valueOf(positionDesired.get(position)));
                intent.putExtra("VUIDCellphoneNo", String.valueOf(cellphoneNo.get(position)));
                intent.putExtra("VUIDGender", String.valueOf(gender.get(position)));
                intent.putExtra("VUIDReligion", String.valueOf(religion.get(position)));
                intent.putExtra("VUIDCivilStatus", String.valueOf(civilStatus.get(position)));
                intent.putExtra("VUIDHeight", String.valueOf(height.get(position)));
                intent.putExtra("VUIDWeight", String.valueOf(weight.get(position)));
                intent.putExtra("VUIDFather", String.valueOf(father.get(position)));
                intent.putExtra("VUIDFatherOccupation", String.valueOf(fatherOccupation.get(position)));
                intent.putExtra("VUIDMother", String.valueOf(mother.get(position)));
                intent.putExtra("VUIDMotherOccupation", String.valueOf(motherOccupation.get(position)));
                intent.putExtra("VUIDElementary", String.valueOf(elementary.get(position)));
                intent.putExtra("VUIDYearGraduatedE", String.valueOf(yearGraduatedE.get(position)));
                intent.putExtra("VUIDHighSchool", String.valueOf(highSchool.get(position)));
                intent.putExtra("VUIDYearGraduatedH", String.valueOf(yearGraduatedH.get(position)));
                intent.putExtra("VUIDCollege", String.valueOf(college.get(position)));
                intent.putExtra("VUIDYearGraduatedC", String.valueOf(yearGraduatedC.get(position)));
                intent.putExtra("VUIDDegreeReceived", String.valueOf(degreeReceived.get(position)));
                intent.putExtra("VUIDSpecialSkills", String.valueOf(specialSkills.get(position)));
                intent.putExtra("VUIDCompanyName1", String.valueOf(companyName1.get(position)));
                intent.putExtra("VUIDPosition1", String.valueOf(position1.get(position)));
                intent.putExtra("VUIDFrom1", String.valueOf(from1.get(position)));
                intent.putExtra("VUIDTo1", String.valueOf(to1.get(position)));
                intent.putExtra("VUIDCompanyName2", String.valueOf(companyName2.get(position)));
                intent.putExtra("VUIDPosition2", String.valueOf(position2.get(position)));
                intent.putExtra("VUIDFrom2", String.valueOf(from2.get(position)));
                intent.putExtra("VUIDTo2", String.valueOf(to2.get(position)));
                intent.putExtra("VUIDReferenceName1", String.valueOf(referenceName1.get(position)));
                intent.putExtra("VUIDReferenceContact1", String.valueOf(referenceContact1.get(position)));
                intent.putExtra("VUIDReferenceCompany1", String.valueOf(referenceCompany1.get(position)));
                intent.putExtra("VUIDReferencePosition1", String.valueOf(referencePosition1.get(position)));
                intent.putExtra("VUIDReferenceName2", String.valueOf(referenceName2.get(position)));
                intent.putExtra("VUIDReferenceContact2", String.valueOf(referenceContact2.get(position)));
                intent.putExtra("VUIDReferenceCompany2", String.valueOf(referenceCompany2.get(position)));
                intent.putExtra("VUIDReferencePosition2", String.valueOf(referencePosition2.get(position)));
                intent.putExtra("VUIDResCertNo", String.valueOf(resCertNo.get(position)));
                intent.putExtra("VUIDIssuedAt", String.valueOf(issuedAt.get(position)));
                intent.putExtra("VUIDIssuedOn", String.valueOf(issuedOn.get(position)));
                intent.putExtra("VUIDSSS", String.valueOf(SSS.get(position)));
                intent.putExtra("VUIDTIN", String.valueOf(TIN.get(position)));
                intent.putExtra("VUIDNBINo", String.valueOf(NBINo.get(position)));
                intent.putExtra("VUIDPassportNo", String.valueOf(passportNo.get(position)));
                activity.startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtName, txtEmail;
        private CardView parent;
        private ImageView imgvImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtEmail = itemView.findViewById(R.id.txtEmail);
            imgvImage = itemView.findViewById(R.id.imgvImage);
            parent = itemView.findViewById(R.id.parent);
        }
    }

}
