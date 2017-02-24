import java.util.Scanner;

/**
 * @author: Robert
 * @version: 2/24/17
 * @assign.ment: Create Classes
 * @descrip.tion: This program creates a Fire Alarm class. A fire alarm has multiple states and behaviors that can be gotten or changed(mutated).
 */
public class FireAlarm {
	boolean hasPower;
	boolean isRinging;
	boolean isFlashing;
	String color;
//constructor
	public FireAlarm(){
		hasPower = false;
		isRinging = false;
		isFlashing = false;
		String color = "red";
	}
//getters
	public boolean getHasPower(){return hasPower;}
	public boolean getRinging(){return isRinging;}
	public boolean getFlashing(){return isFlashing;}
	public String getColor(){return color;}
//setters
	public void setFire(boolean isFire){
		if (isFire && hasPower){
			hasPower = isFire;
			isRinging = isFire;
			isFlashing = isFire;
		}

	}
	public void setPower(boolean newPower){
		hasPower = newPower;
	}
//test
	public static void main(String[] args) {
		FireAlarm fA1 = new FireAlarm();
		FireAlarm fA2 = new FireAlarm();
		String hasFire;;
		String hasPower;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fire Alarm 1 is colored "+fA1.getColor());
		System.out.println("Fire Alarm 2 is "+fA2.getHasPower()+" Do you want to turn it on? Y or N.");
		hasPower = scanner.nextLine();
		if (hasPower.equals("Y")){
			fA2.setPower(true);
		}
		if (hasPower.equals("N")){
			System.out.println("Power is still off");
		}
		hasPower = null;
		System.out.println("Fire Alarm 1 is "+fA1.getHasPower()+" Do you want to turn it on? Y or N.");
		hasPower = scanner.nextLine();
		if (hasPower.equals("Y")){
			fA1.setPower(true);
		}
		if (hasPower.equals("N")){
			System.out.println("Power is still off");
		}
		System.out.println("Is there fire? Y or N.");
		hasFire = scanner.nextLine();
		boolean bothOn = fA2.getHasPower() && fA1.getHasPower();
        boolean oneOn = fA1.getHasPower() ^ fA2.getHasPower();
		if (hasFire.equals("Y") && bothOn){
			fA2.setFire(true);
			fA1.setFire(true);
			System.out.println("Both fire alarms are flashing:"+ fA1.getFlashing()+ ". Also, both are ringing:"+fA2.getRinging());
        }
        if (hasFire.equals("Y") && oneOn){
            System.out.println("Only one fire alarm is on!");
            System.out.println("Things are burning!");
        }
		if (hasFire.equals("N")){
			System.out.println("Everything is A-Okay");
		}


	}
}
