package com.example.seizuremonitoringsystemepilepsy;

public class Seizures {
    private int severity_status;
    private String date;
    private String month;
    private String time_from;
    private String time_to;
    private String message;

    public Seizures(int severity_status, String date, String month, String time_from, String time_to, String message){
        this.severity_status = severity_status;
        this.date = date;
        this.month = month;
        this.time_from = time_from;
        this.time_to = time_to;
        this.message = message;
    }

    public int getSeverity_status() {
        return severity_status;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getMonth() {
        return month;
    }

    public String getTime_from() {
        return time_from;
    }

    public String getTime_to() {
        return time_to;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setSeverity_status(int severity_status) {
        this.severity_status = severity_status;
    }

    public void setTime_from(String time_from) {
        this.time_from = time_from;
    }

    public void setTime_to(String time_to) {
        this.time_to = time_to;
    }
}
