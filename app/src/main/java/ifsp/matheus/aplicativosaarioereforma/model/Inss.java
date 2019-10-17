package ifsp.matheus.aplicativosaarioereforma.model;


public class Inss {


    private double salarioBrutoMin;
    private double salarioBrutoMax;
    private double aliquota;
    private double deducao;


    public Inss(double salarioBrutoMin, double salarioBrutoMax, double aliquota) {
        this.salarioBrutoMin = salarioBrutoMin;
        this.salarioBrutoMax = salarioBrutoMax;
        this.aliquota = aliquota;

    }

    public Inss(double salarioBrutoMin, double salarioBrutoMax, double aliquota, double deducao) {
        this.salarioBrutoMin = salarioBrutoMin;
        this.salarioBrutoMax = salarioBrutoMax;
        this.aliquota = aliquota;
        this.deducao = deducao;


    }


    public double getSalarioBrutoMin() {
        return salarioBrutoMin;
    }


    public double getSalarioBrutoMax() {
        return salarioBrutoMax;
    }


    public double getAliquota() {
        return aliquota;
    }


    public double getDeducao() {
        return deducao;
    }


}