/**
 * Progettare e realizzare una classe Employee (dipendente).
 * Ciascun dipendente ha un nome (di tipo Stringa) e uno stipendio (di tipo double).
 * Scrivere un costruttore senza parametri e uno con due parametri (nome e stipendio)
 * e i metodi per conoscere nome e stipendio.
 * Scrivere un breve programma per collaudare la classe.
 * Sviluppare la classe, aggiungendo un metodo raiseSalary (double byPercent) che incrementi lo stipendio
 * del dipendente secondo una certa percentuale a nostra discrezione.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Stipendio dipendente");


        // Creo nuovo dipendente passando i valori
        Employee dipendente1 = new Employee("Emanuele Belfiori", 1500.0);
        // Ritorno i valori immessi sopra
        System.out.println("Nome: " + dipendente1.getName() + "- Stipendio: " + dipendente1.getSalary());

        // Calcolo di quanto verrà aumentato lo stipendio del dipendente
        dipendente1.raiseSalary(15);
        // Ritorno il nuovo stipendio
        System.out.println("Nuovo stipendio: " + dipendente1.getSalary());

        Employee dipendente2 = new Employee("Jose Monella", 1800.0);
        System.out.println("Nome: " + dipendente2.getName() + "- Stipendio: " + dipendente2.getSalary());
        dipendente1.raiseSalary(20);
        System.out.println("Nuovo stipendio: " + dipendente2.getSalary());

    }
}
