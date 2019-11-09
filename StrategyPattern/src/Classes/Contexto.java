package Classes;

import Interfaces.Teacher;

public class Contexto {
	/*
	 *  clase que decide el comportamiento 
	 *   tenemos profesores de educacion fisica
	 * sociales, artes, ciencias, etc
	 * esta clase va a ense�ar ( ejecutar el m�todo y explicar dependiendo el tipo de profesor)
	 * para este ejemplo se usara un profesor de matem�ticas y otro de educaci�n fisica
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
