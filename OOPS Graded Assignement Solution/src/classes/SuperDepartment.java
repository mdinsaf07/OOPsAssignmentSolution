package classes;
public class SuperDepartment {
		
		public String departmentName() {
			String depart = "Super Department";
			return depart;	
		}
		
		public String getTodaysWork(){
			String work = "No work as of now";
			return work;
		}
		
		public String getWorkDeadline() {
			String deadline = "Nil";
			return deadline;
		}
		
		public String isTodayAHoliday() {
			String holiday = "Today is not a holiday \n";
			return holiday;
			
		}
		
		public void SuperDeptData() {
			System.out.println("Welcome to "+departmentName());
			System.out.println(getTodaysWork());
			System.out.println(getWorkDeadline());
			System.out.println(isTodayAHoliday()+"\n");
		}
		
			
	}
		
	
