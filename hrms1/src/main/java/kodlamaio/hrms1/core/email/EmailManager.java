package kodlamaio.hrms1.core.email;

import org.springframework.stereotype.Service;

import kodlamaio.hrms1.core.utilities.results.Result;
import kodlamaio.hrms1.core.utilities.results.SuccessResult;

@Service
public class EmailManager implements EmailService {

	 @Override
	public Result send(String to, String title, String Message) {
			return new SuccessResult("E-Mail Gönderildi.");
	 }
}
