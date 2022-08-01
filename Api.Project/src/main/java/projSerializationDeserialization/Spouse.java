package projSerializationDeserialization;

public class Spouse {
String Name;
int Sphone;
 String SCompany;
public Spouse(String name, int sphone, String sCompany) {
	Name = name;
	Sphone = sphone;
	SCompany = sCompany;
}
public String getName() {
	return Name;
}
public int getSphone() {
	return Sphone;
}
public String getSCompany() {
	return SCompany;
}
public void setName(String name) {
	Name = name;
}
public void setSphone(int sphone) {
	Sphone = sphone;
}
public void setSCompany(String sCompany) {
	SCompany = sCompany;
}


	
	
}
