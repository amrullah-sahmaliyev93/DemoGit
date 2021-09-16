package metod;

public class Util {

	public String []nameMetod (String name,String surname,String address,Integer age) {
		String [] str  = new String [4];
		str[0] = name;
		str[1] =surname;
		str[2]=address;
		str[3] = String.valueOf(age);
		return str ;
	}
}
