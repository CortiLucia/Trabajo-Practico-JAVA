//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Policia policia1 = new Policia("Juan", "García", 123456);

        ArmaCorta armaCorta1 = new ArmaCorta(policia1, 50, 150, "Marca2", 8.0, "en uso", true);

        ArmaLarga armaLarga1 = new ArmaLarga(policia1, 200, 500, "Marca3", 10.0, "en uso", true, "Descripción del arma larga", 4);

        System.out.println("El arma corta está en condiciones de ser usada: " + armaCorta1.estaEnCondiciones());
        System.out.println("El arma larga está en condiciones de ser usada: " + armaLarga1.estaEnCondiciones());

        ArmaLarga otraArmaLarga = new ArmaLarga(policia1, 150, 450, "Marca4", 9.5, "en uso", true, "Descripción de otra arma larga", 3);
        System.out.println("El nivel del arma larga 1 es mayor: " + armaLarga1.esMayor(otraArmaLarga));
    }
}

