package ecole;

public class Etudiant extends Personne {

    private String matricule;
    private double[] notes = new double[20];
    private int nbNotes = 0;

    public Etudiant(String nom, String prenom, String email, String matricule) {
        super(nom, prenom, email);
        this.matricule = matricule;
    }

    public void ajouterNote(double note) {
        if (nbNotes < notes.length) {
            notes[nbNotes] = note;
            nbNotes++;
        }
    }

    public double calculerMoyenne() {
        if (nbNotes == 0) {
            return 0;
        }
        double somme = 0;
        for (int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }
        return somme / nbNotes;
    }

    @Override
    public String getRole() {
        return "Etudiant";
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Matricule: " + matricule);
        System.out.println("Moyenne  : " + calculerMoyenne());
    }
}