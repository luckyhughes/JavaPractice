package oopsExamples.banking;

public class Profile {
	
	String profileId;
	String name;
	String address;
	String phone;
	String dob;
	String pic;
	Friend friends;
	
	
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Profile [name=" + name + ", address=" + address + ", phone=" + phone + ", dob=" + dob + ", pic=" + pic
				+ "]";
	}
	
		
}
