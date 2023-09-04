package empresa;

public class Empresa {
	
	Empleado [] empleados;
	int cantEmpleados = 0;
	
	public Empresa(int empleados) {
		this.empleados = new Empleado[empleados];
	}
	
	public void agregarEmpleado(Empleado e) {
		empleados[cantEmpleados] = e;
		cantEmpleados++;
	}
	
	public double getMontoTotal() {
		double total = 0;
		for (Empleado empleado : empleados) {
			total+= empleado.getSalario();
		}
		return total;
	}

	public static void main(String[] args) {
		
		Empresa acme = new Empresa(3);
				
		Empleado cacho = new EmpleadoDePlantaTemporaria(false, 1, 80);
		Empleado luis = new EmpleadoDePlantaPermanente(false, 1, 80, 2);
		Empleado ana = new Gerente(true, 3, 100, 10);
		
		acme.agregarEmpleado(ana);
		System.out.println(ana.getSalario());
		acme.agregarEmpleado(luis);
		System.out.println(luis.getSalario());
		acme.agregarEmpleado(cacho);
		System.out.println(cacho.getSalario());
		
		System.out.println(acme.getMontoTotal());
		
	}
}
