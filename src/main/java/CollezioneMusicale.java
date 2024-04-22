import java.util.ArrayList;

public class CollezioneMusicale {
  ArrayList<Supporto> supporti = new ArrayList<Supporto>();

  public void aggiungiSupporto(Supporto supporto) {
    supporti.add(supporto);
  }

  public void rimuoviSupporto(Supporto supporto) {
    supporti.remove(supporto);
  }

  public ArrayList<Canzone> cercaCanzonePerAutore(String autore) {
    ArrayList<Canzone> result = new ArrayList<Canzone>();
    for (Supporto s : supporti) {
      result.addAll(s.cercaCanzonePerAutore(autore));
    }
    return result;
  }
}