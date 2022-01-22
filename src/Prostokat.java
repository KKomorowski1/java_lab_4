public class Prostokat extends Figura{
    @Override
    double pole(double bok, double bok2) {
        return bok*bok2;
    }

    @Override
    double obwod(double bok, double bok2) {
        return 2*bok + 2*bok2;
    }
}
