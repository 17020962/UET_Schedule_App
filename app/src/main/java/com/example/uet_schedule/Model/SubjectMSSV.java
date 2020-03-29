package com.example.uet_schedule.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubjectMSSV {

    @SerializedName ("stt")
    @Expose
    private String stt;

    @SerializedName ("mssv")
    @Expose
    private String mssv;

    @SerializedName ("name")
    @Expose
    private String name;

    @SerializedName ("dateOfbirth")
    @Expose
    private String dateOfbirth;

    @SerializedName ("classUniversity")
    @Expose
    private String classUniversity;

    @SerializedName ("codeFull")
    @Expose
    private String codeFull;

    @SerializedName ("subject")
    @Expose
    private String subject;

    @SerializedName ("group")
    @Expose
    private String group;

    @SerializedName ("credits")
    @Expose
    private String credits;

    @SerializedName ("status")
    @Expose
    private String status;

    @SerializedName ("nullChar")
    @Expose
    private String nullChar;

    public SubjectMSSV(String mssv) {
       this.mssv = mssv;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getClassUniversity() {
        return classUniversity;
    }

    public void setClassUniversity(String classUniversity) {
        this.classUniversity = classUniversity;
    }

    public String getCodeFull() {
        return codeFull;
    }

    public void setCodeFull(String codeFull) {
        this.codeFull = codeFull;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNullChar() {
        return nullChar;
    }

    public void setNullChar(String nullChar) {
        this.nullChar = nullChar;
    }
}
