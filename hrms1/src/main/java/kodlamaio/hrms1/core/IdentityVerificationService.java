package kodlamaio.hrms1.core;

import kodlamaio.hrms1.core.utilities.results.Result;

public interface IdentityVerificationService {

	Result validate(String tckn, String firstName, String lastName, int dateyear);
}
