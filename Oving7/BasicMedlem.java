import java.time.*;

class BasicMedlem extends BonusMedlem {
  public BasicMedlem(int medlNr, Personalia pers, LocalDate innmeldtDato) {
    super(medlNr, pers, innmeldtDato, 0);
  }
}
