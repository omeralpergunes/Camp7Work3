 package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.WorkerService;
import kodlamaio.hrms1.core.utilities.results.DataResult;
import kodlamaio.hrms1.core.utilities.results.Result;
import kodlamaio.hrms1.entities.concretes.Worker;

@RestController
@RequestMapping("/api/workers/")
public class WorkerControllers {

	private WorkerService workerService;
	
	@Autowired
	public WorkerControllers(WorkerService workerService) {
		super();
		this.workerService=workerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Worker>> getAll(){
		return this.workerService.getAll();
		
}
	@PostMapping("/add")
	public Result add(Worker worker) {
		return this.workerService.add(worker);
	}
	
}
