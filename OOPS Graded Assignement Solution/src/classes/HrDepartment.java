package classes;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String depart = "Hr Department";
		return depart;	
	}
	
	public String getTodaysWork(){
		String work = "Fill today's worksheet and mark your attendance";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String doActivity() {
		String activity ="Team lunch";
		return activity;
	}
	
	public void HrDeptData() {
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(doActivity());
		System.out.println(isTodayAHoliday()+"\n");
	}
	
	

}
