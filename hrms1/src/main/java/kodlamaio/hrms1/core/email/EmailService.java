package kodlamaio.hrms1.core.email;

import kodlamaio.hrms1.core.utilities.results.Result;

public interface EmailService {

	Result send(String to, String title, String message);

}	
