package thisisnobody.enums.basic;

import static thisisnobody.enums.basic.Shrubbery.*;

public class ImportEnum {
	Shrubbery s;

	ImportEnum(Shrubbery s) {
		this.s = s;
	}

	public static void main(String[] args) {

		new ImportEnum(HANGING);
	}
}
