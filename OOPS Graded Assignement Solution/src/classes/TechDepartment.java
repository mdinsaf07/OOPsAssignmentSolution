package classes;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String depart = "Tech Department";
		return depart;	
	}
	
	public String getTodaysWork(){
		String work = "Complete coding of module 1";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String getTechStackInformation() {
		String stackInfo = "Core Java";
		return stackInfo;
	}
	
	public void TechDeptData() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday()+"\n");
	}
	
}
