package shopandinfluence;

//import com.sessiondemo.String;

public class User {

		String email;
		String password;
		String mobile;
		String address;
		String name;

		public User(String email,String password,String name,String mobile,String address) 
		{
			this.name=name;
			this.address=address;
			this.mobile=mobile;
			this.password=password;
			this.email=email;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		}


