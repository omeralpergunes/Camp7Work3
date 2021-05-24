package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.WorkerService;
import kodlamaio.hrms1.core.utilities.results.DataResult;
import kodlamaio.hrms1.core.utilities.results.Result;
import kodlamaio.hrms1.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms1.core.utilities.results.SuccessResult;
import kodlamaio.hrms1.dataAccess.abstracts.WorkerDao;
import kodlamaio.hrms1.entities.concretes.Worker;

@Service
public class WorkerManager implements WorkerService {

	
	private WorkerDao workerDao;
	@Autowired
	public WorkerManager(WorkerDao workerDao) {
		super();
		this.workerDao = workerDao;
	}
	
	
	@Override
	public DataResult<List<Worker>> getAll() {
	    return new SuccessDataResult<List<Worker>>(this.workerDao.findAll(),"Listelendi");
	    
		
	}
	
	
	@Override
	public Result add(Worker worker) {
		this.workerDao.save(worker);
		return new SuccessResult("İşveren Kişi Sisteme Eklendi");
	}

	
	
}
