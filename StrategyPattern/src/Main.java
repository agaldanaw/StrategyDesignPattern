import Classes.Contexto;
import Classes.MathTeacher;
import Classes.PhysicalEducationTeacher;

// clase principal para pruebas y ejecuci�n del ejemplo del patr�n
// de dise�o strategia
public class Main {

	public static void main(String[] args) {
		// se va a ense�ar mateimaticas con una probabilidad del 60%, 
		// y del 40% se hara la materia de educacion fisica
		// se generan numeros aleatorios y dependiendo este numero
		// se ense�a, se realizaran 5 ense�anzas distintas
		// el n�mero random sirve para simular los horarios o las peticiones
		// que realiza el estudiante, quiero aprender matematicas, o quiero hacer deporte
		
		Contexto c = new Contexto(); // instanciar la clase que manejara como se ense;a
		
		MathTeacher _mathTeacher = new MathTeacher();
		PhysicalEducationTeacher _physicalEducationTeacher = new PhysicalEducationTeacher();
		
		for(int i = 0; i < 5 ; i++ )
		{
			double rnd = Math.random();

			if(Double.compare(0.6, rnd) >= 0 )
			{
				c.SetTeacher(_mathTeacher);
				c.Teach();
			}
			else
			{
				c.SetTeacher(_physicalEducationTeacher);
				c.Teach();
			}
		}

	}

}
