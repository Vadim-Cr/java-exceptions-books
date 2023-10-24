public class Book {
//    ATTRIBUTI

    String titolo;
    int numeroPagine;
    String autore;
    String editore;

    public Book(String titolo, int numeroPagine, String autore, String editore) throws IllegalArgumentException {
        // verifico che base e altezza non siano <=0
        if (titolo == null || titolo.isEmpty() ||
                autore == null || autore.isEmpty() ||
                editore == null || editore.isEmpty() ||
                numeroPagine <= 0) {
            throw new IllegalArgumentException("dati non validi, ricorda di mettere un numero valido di pagine, un Autore, Nome ed Editore che siano validi");
        }
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.editore = editore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }
    @Override
    public String toString() {
        return "Title: " + titolo + ", Pages: " + numeroPagine + ", Author: " + autore + ", Publisher: " + editore;
    }
}
