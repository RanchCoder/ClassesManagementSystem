package com.ProjectClassFiles;
public class Tution{
	
	  // getter and setter for administrator.
    	
	

 	
		
		
		
	
//------------------------ getter and setter for Administrator.---------------------------------------------------
      String adminName;
        int adminId;
         String adminUserId,adminPassword;

   public String getAdminUserId(){return adminUserId;}
   public void setAdminUserId(String adminUserId){this.adminUserId = adminUserId;} 


   
   public String getAdminPassword(){return adminPassword;}
   public void setAdminPassword(String adminPassword){this.adminPassword = adminPassword;}   

   public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    
	
	
	 
//----------------------------------- getter and setter for manager.--------------------------------------
   


    
	// getter and setter for manager.
    	String managerName,managerUserId,managerPassword;
        int managerId;

   
  
   public String getManagerUserId() {
        return managerUserId;
    }

    public void setManagerUserId(String managerUserId) {
        this.managerUserId = managerUserId;
    }
    
	 
   public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

   public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
    
	
	//-------------------------------getter and setter for teacher.------------------------------------------
	

	  //getter and setter for teacher.
	    String teacherName,teacherSubject;
        int teacherId,teacherBatchId;
	


	public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }
      
	  public int getTeacherBatchId() {
        return teacherBatchId;
    }

    public void setTeacherBatchId(int teacherBatchId) {
        this.teacherBatchId = teacherBatchId;
    } 
	  
	  
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    
	//-----------------------------getter and setter for student.--------------------------------------------
	
	 String studentName,studentSubject;
  int studentId, studentFeesId,studentContact,studentBatchId;
  
  float feesAmountS,feesPaidS,feesPendingS; 

    public float getFeesAmountS() {
        return feesAmountS;
    }

    public void setFeesAmountS(float feesAmountS) {
        this.feesAmountS = feesAmountS;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public int getStudentFeesId() {
        return studentFeesId;
    }

    public void setStudentFeesId(int studentFeesId) {
        this.studentFeesId = studentFeesId;
    }

    public float getFeesPaidS() {
        return feesPaidS;
    }

    public void setFeesPaidS(float feesPaidS) {
        this.feesPaidS = feesPaidS;
    }

    public float getFeesPendingS() {
        return feesPendingS;
    }

    public void setFeesPendingS(float feesPendingS) {
        this.feesPendingS = feesPendingS;
    }

    
    
    
    
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(String studentSubject) {
        this.studentSubject = studentSubject;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(int studentContact) {
        this.studentContact = studentContact;
    }

	  
	  public int getStudentBatchId() {
        return studentBatchId;
    }

    public void setStudentBatchId(int studentBatchId) {
        this.studentBatchId = studentBatchId;
    }

	// ---------------------------------get details about the batch.---------------------------------
    int batchId; 
   String batchName,batchTiming,batchSubject;

    public String getBatchSubject() {
        return batchSubject;
    }

    public void setBatchSubject(String batchSubject) {
        this.batchSubject = batchSubject;
    }
  

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchTiming() {
        return batchTiming;
    }

    public void setBatchTiming(String batchTiming) {
        this.batchTiming = batchTiming;
    }
 
 // ---------------------------------get details about the subject.---------------------------------
 
 
    String subjectName;
    int subjectId;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
// ---------------------------------get details about the fees.---------------------------------
    int feesId;
    float feesAmount,feesAmountPaid,feesAmountPending;
    
    
    public int getFeesId() {
        return feesId;
    }

    public void setFeesId(int feesId) {
        this.feesId = feesId;
    }

    public float getFeesAmount() {
        return feesAmount;
    }

    public void setFeesAmount(float feesAmount) {
        this.feesAmount = feesAmount;
    }

    public float getFeesAmountPaid() {
        return feesAmountPaid;
    }

    public void setFeesAmountPaid(float feesAmountPaid) {
        this.feesAmountPaid = feesAmountPaid;
    }

    public float getFeesAmountPending() {
        return feesAmountPending;
    }

    public void setFeesAmountPending(float feesAmountPending) {
        this.feesAmountPending = feesAmountPending;
    }
    
    
    

}