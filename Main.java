package ecole;

public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Ben Ali", "Sami", "sami@isg.tn", "E001");
        e1.ajouterNote(12);
        e1.ajouterNote(15);
        e1.ajouterNote(14);
        Etudiant e2 = new Etudiant("Trabelsi", "Rim", "rim@isg.tn", "E002");
        e2.ajouterNote(17);
        e2.ajouterNote(16);
        Enseignant p1 = new Enseignant("Hajji", "Ahmed", "hajji@isg.tn", "Bases de données", 40);
        Enseignant p2 = new Enseignant("Gharbi", "Leila", "leila@isg.tn", "Java", 35);
        Personne[] personnes = { e1, e2, p1, p2 };

        for (Personne p : personnes) {
            p.afficherInfos();

        }
    }
}