public class Kwadrat extends Figura{
    @Override
    double pole(double bok, double bok2) {
        return bok * bok;
    }

    @Override
    double obwod(double bok1, double bok2) {
        return bok1 * 4;
    }
}
