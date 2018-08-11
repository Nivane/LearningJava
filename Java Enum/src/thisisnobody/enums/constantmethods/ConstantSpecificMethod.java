package thisisnobody.enums.constantmethods;

public enum ConstantSpecificMethod {
	HELLO {
		String getInfo() {
			return "hello";
		}
	},

	BYE {
		String getInfo() {
			return "bye";
		}
	};

	abstract String getInfo();

	public static void main(String[] args) {
		for (ConstantSpecificMethod c : values()) {
			System.out.println(c.getInfo());
		}

	}

}
