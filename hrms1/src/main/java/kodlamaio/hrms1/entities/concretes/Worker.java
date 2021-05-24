package kodlamaio.hrms1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="workers")
public class Worker {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Worker_id")
		private int Worker_id;
		
		@Column(name="Workerid")
		private String Workerid;
		
		
		public Worker() {}
		
		public Worker(int worker_id, String workerid) {
			super();
			Worker_id = worker_id;
			Workerid = workerid;
		}
		public int getWorker_id() {
			return Worker_id;
		}
		public void setWorker_id(int worker_id) {
			Worker_id = worker_id;
		}
		public String getWorkerid() {
			return Workerid;
		}
		public void setWorkerid(String workerid) {
			Workerid = workerid;
		}
}
