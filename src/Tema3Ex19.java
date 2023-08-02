import java.util.Scanner;

public class Tema3Ex19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Cursantii se pot inscrie la un curs daca indeplinesc toate urmatoarele 3 conditii: Au platit costul cursului sau au o bursa pentru curs
        // Exista locuri disponibile in curs Perioada de inscrieri este deschisa, sau au un cont premium
        //De asemenea, vor primi un discount la urmatorul curs daca indeplinesc cel putin una dintre urmatoarele 3 conditii:
        // au completat cel putin 2 cursuri in trecut si au un rating mediu mai mare decat 8 din 10 de la instructori au recomandat plaftorma la cel putin 3 prieteni in trecut.
        //Citeste de la tastatura urmatoarele informatii:
        //Daca studentul a platit costul cursului sau nu
        //Daca studentul are bursa sau nu
        //Numarul de locuri disponibile la curs
        //Daca perioada de inscrieri este deschisa sau nu
        //Daca studentul are cont premium sau nu
        //Numarul de cursuri completate in trecut de catre sutdent
        //Rating-ul mediu obtinut de student
        //Numarul de prieteni recomandati de student

        boolean costPaid = scanner.nextBoolean();
        boolean scolarshipApproved = scanner.nextBoolean();
        int nrSeats = scanner.nextInt();
        boolean regOpen = scanner.nextBoolean();
        boolean premiumAccount = scanner.nextBoolean();
        int nrCourses = scanner.nextInt();
        int mediumRating = scanner.nextInt();
        int nrOfFriends = scanner.nextInt();

        if ((costPaid || scolarshipApproved) && (nrSeats < 10) && (regOpen || premiumAccount)) {
            System.out.println("Inscrierea e aprobata");
        } else {
            System.out.println("Nu se poate aproba inscrierea");
        }
        if ((nrCourses >= 2 && mediumRating >= 8) || nrOfFriends >= 3) {
            System.out.println("Studentul are discount la urmatorul curs");
        } else
            System.out.println("Mai trebuie sa munceasca");
    }
}
