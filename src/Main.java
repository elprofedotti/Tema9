public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Matias");
        cliente.setEdad(43);
        cliente.setTelefono("15647896");
        cliente.setCredito(150000);
        System.out.println("***************CLIENTE******************");
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Telefono: "+cliente.getTelefono());
        System.out.println("Credito: "+cliente.getCredito());
        System.out.println("");
        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Federico");
        trabajador.setEdad(45);
        trabajador.setTelefono("15789865");
        trabajador.setSalario(450000);
        System.out.println("***************TRABAJADOR******************");
        System.out.println("Nombre: "+trabajador.getNombre());
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Telefono: "+trabajador.getTelefono());
        System.out.println("Salario: "+trabajador.getSalario());

    }
}