import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionRH {
    private List<Personne> personnes;

    public GestionRH() {
        this.personnes = new ArrayList<>();
        this.personnes.add(new Patron("the", "boss", 100000));
        this.personnes.add(new Employe("the", "lead dev", 80000));
        this.personnes.add(new Stagiaire("the", "stagiaire", 1500));
    }

    public static void sauvegarderEmploye(Employe employe, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employe);
        }
    }

    public static Employe restaurerEmploye(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Employe) ois.readObject();
        }
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("===== Les patrons\n");
        for (Personne p : personnes) {
            if (p instanceof Patron) {
                buf.append(p.getNom()).append(" ").append(p.getPrenom()).append("\n");
            }
        }
        buf.append("===== Les employes\n");
        for (Personne p : personnes) {
            if (p instanceof Employe && !(p instanceof Patron)) {
                buf.append(p.getNom()).append(" ").append(p.getPrenom()).append("\n");
            }
        }
        buf.append("===== Les stagiaires\n");
        for (Personne p : personnes) {
            if (p instanceof Stagiaire) {
                buf.append(p.getNom()).append(" ").append(p.getPrenom()).append("\n");
            }
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            GestionRH rh = new GestionRH();
            Employe employe = new Employe("the", "lead dev", 80000);
            
            sauvegarderEmploye(employe, "employe.ser");

            Employe employeRestored = restaurerEmploye("employe.ser");

            System.out.println("Employé original: " + employe);
            System.out.println("Employé restauré: " + employeRestored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
