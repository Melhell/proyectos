
public class SuperClasemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta_1 = new Cuenta("Lola");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 dolares
        System.out.println(cuenta_2); // 600 dolares
	}

}
