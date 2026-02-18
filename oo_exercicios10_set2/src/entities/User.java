package entities;

import java.util.Objects;

public class User {
	
	private Integer userCode;

	public User(Integer userCode) {
		this.userCode = userCode;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userCode, other.userCode);
	}

	@Override
	public String toString() {
		return "User [userCode=" + userCode + "]";
	}	
}
