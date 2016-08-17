package com;

import com.task_pool.ITask;
import com.task_pool.TaskPool;

public class How2Use extends Activity {


@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	//设置最大的线程数量  
	TaskPool.setMaxThreadCount(5);
	TaskPool.getInstance().addTask(new ITask() {

		@Override
		public void executeBackground() {
			//do_something_background();
		}
	});

	TaskPool.getInstance().addTask(new ITask() {

		@Override
		public void executeBackground() {
			//do_something_background();
		}
	});


}



}
