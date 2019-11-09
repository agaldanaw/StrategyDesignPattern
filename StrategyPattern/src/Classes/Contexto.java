package Classes;

import Interfaces.Teacher;

public class Contexto {
	/*
	 *  clase que decide el comportamiento 
	 *   tenemos profesores de educacion fisica
	 * sociales, artes, ciencias, etc
	 * esta clase va a enseñar ( ejecutar el mètodo y explicar dependiendo el tipo de profesor)
	 * para este ejemplo se usara un profesor de matemàticas y otro de educaciòn fisica
	 */
	
	private Teacher teacher;
	
	public Contexto()
	{}
	
	public void SetTeacher( Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	public void Teach() {
		teacher.Teach();
	}
	
	
}
