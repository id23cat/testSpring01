package com.tutorialspoint;

import java.util.List;

public class StudCollection {

	List<Student> profileList;

	public List<Student> getProfileList() {
		return profileList;
	}

	public void setProfileList(List<Student> profileList) {
		this.profileList = profileList;
	}

	@Override
	public String toString() {
		return "StudCollection [profileList=" + profileList + "]";
	}
}
