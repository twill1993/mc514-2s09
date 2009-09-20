package osp.Tasks;

import java.util.Vector;
import osp.IFLModules.*;
import osp.Threads.*;
import osp.Ports.*;
import osp.Memory.*;
import osp.FileSys.*;
import osp.Utilities.*;
import osp.Hardware.*;

/**
    The student module dealing with the creation and killing of
    tasks.  A task acts primarily as a container for threads and as
    a holder of resources.  Execution is associated entirely with
    threads.  The primary methods that the student will implement
    are do_create(TaskCB) and do_kill(TaskCB).  The student can choose
    how to keep track of which threads are part of a task.  In this
    implementation, an array is used.

    @OSPProject Tasks
*/
public class TaskCB extends IflTaskCB
{

	int threadCounter;
	OpenFile fileTable[];
	ThreadCB threadTable[];
	
	/**
	The task constructor. Must have

		super();

	as its first statement.

	@OSPProject Tasks
	*/
	public TaskCB()
	{
		super();
		

	}

	/**
	This method is called once at the beginning of the
	simulation. Can be used to initialize static variables.

	@OSPProject Tasks
	*/
	public static void init()
	{
		threadCounter = 0;  //Inicializes Thread Counter with 0.

	}

	/** 
	Sets the properties of a new task, passed as an argument. 

	Creates a new thread list, sets TaskLive status and creation time,
	creates and opens the task's swap file of the size equal to the size
	(in bytes) of the addressable virtual memory.

	@return task or null

	@OSPProject Tasks
	*/
	static public TaskCB do_create(String newOwner)
	{
	/* 1.Creation of Task object
		2.Resource Allocation
		3.Initializations
		4.Create PageTable
		5.Keep track of threads, communications ports, and files.
		5.1 create file object
		6.set task-creation time HClock
		7. set Task status
		8. set priority
		9. create swap file
		10. return Task object
		*/


		TaskCB newTask = new TaskCB();

		PageTable newPageTable = new PageTable(newOwner);  // Creates PageTable object
		TaskCB.setPageTable(newPageTable);                 // Associates Task with PageTable object

		ThreadCB newThread = new ThreadCB.create(newTask); //Creates new thread for the task
		ThreadCB.addThread(newThread);                     //adds created thread to the ThreadCb's thread list
		threadCount++;                                     //increment thread counter
		
		
		
		









		return theTask;

	}

	/**
	Kills the specified task and all of it threads. 

	Sets the status TaskTerm, frees all memory frames 
	(reserved frames may not be unreserved, but must be marked 
	free), deletes the task's swap file.

	@OSPProject Tasks
	*/
	public void do_kill()
	{
	// your code goes here

	}

	/** 
	Returns a count of the number of threads in this task. 

	@OSPProject Tasks
	*/
	public int do_getThreadCount()
	{
		return threadCounter;
	}

	/**
	Adds the specified thread to this task. 
	@return FAILURE, if the number of threads exceeds MaxThreadsPerTask;
	SUCCESS otherwise.

	@OSPProject Tasks
	*/
	public int do_addThread(ThreadCB thread)
	{
	// your code goes here

	}

	/**
	Removes the specified thread from this task. 		

	@OSPProject Tasks
	*/
	public int do_removeThread(ThreadCB thread)
	{
	// your code goes here

	}

	/**
	Return number of ports currently owned by this task. 

	@OSPProject Tasks
	*/
	public int do_getPortCount()
	{
	// your code goes here

	}

	/**
	Add the port to the list of ports owned by this task.

	@OSPProject Tasks 
	*/ 
	public int do_addPort(PortCB newPort)
	{
	// your code goes here

	}

	/**
	Remove the port from the list of ports owned by this task.

	@OSPProject Tasks 
	*/ 
	public int do_removePort(PortCB oldPort)
	{
	// your code goes here

	}

	/**
	Insert file into the open files table of the task.

	@OSPProject Tasks
	*/
	public void do_addFile(OpenFile file)
	{
	// your code goes here

	}

	/** 
	Remove file from the task's open files table.

	@OSPProject Tasks
	*/
	public int do_removeFile(OpenFile file)
	{
	// your code goes here

	}

	/**
	Called by OSP after printing an error message. The student can
	insert code here to print various tables and data structures
	in their state just after the error happened.  The body can be
	left empty, if this feature is not used.

	@OSPProject Tasks
	*/
	public static void atError()
	{
	// your code goes here

	}

	/**
	Called by OSP after printing a warning message. The student
	can insert code here to print various tables and data
	structures in their state just after the warning happened.
	The body can be left empty, if this feature is not used.

	@OSPProject Tasks
	*/
	public static void atWarning()
	{
	// your code goes here

	}


	/*
	Feel free to add methods/fields to improve the readability of your code
	*/

	}

	/*
	Feel free to add local classes to improve the readability of your code
	*/
