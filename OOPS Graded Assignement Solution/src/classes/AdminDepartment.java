package classes;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String depart = "Admin Department";
		return depart;	
	}
	
	public String getTodaysWork(){
		String work = "Complete your documents submission";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public void AdminDeptData() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday()+"\n");
	}
	
	
}


