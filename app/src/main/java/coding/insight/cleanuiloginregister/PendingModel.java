package coding.insight.cleanuiloginregister;

public class PendingModel {

    String UserID,HospitalID,Problem,ProblemDescription,Time,Date,DoctorType;

    PendingModel(){}

    public PendingModel(String userID, String hospitalID, String problem, String problemDescription, String time, String date, String doctorType) {
        UserID = userID;
        HospitalID = hospitalID;
        Problem = problem;
        ProblemDescription = problemDescription;
        Time = time;
        Date = date;
        DoctorType = doctorType;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(String hospitalID) {
        HospitalID = hospitalID;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String problem) {
        Problem = problem;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        ProblemDescription = problemDescription;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDoctorType() {
        return DoctorType;
    }

    public void setDoctorType(String doctorType) {
        DoctorType = doctorType;
    }
}
