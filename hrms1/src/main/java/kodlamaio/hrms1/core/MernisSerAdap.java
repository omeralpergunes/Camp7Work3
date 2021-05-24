package kodlamaio.hrms1.core;

import kodlamaio.hrms1.core.utilities.results.Result;
import kodlamaio.hrms1.core.utilities.results.SuccessResult;

public class MernisSerAdap implements IdentityVerificationService{

	@Override
	public Result validate(String tckn, String firstName, String lastName, int dateyear) {
		return new SuccessResult("Sistem doğrulaması başarılı oldu.");
	}

	
}
