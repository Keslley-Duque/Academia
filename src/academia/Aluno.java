package academia;

public class Aluno {
    // atributos
    private String nome;
    private float peso;
    private float altura;

    // metodos de acesso (set e get)
    public void setNome(String nomeAluno) {
        nome = nomeAluno;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float imc() {
        return peso / (altura * altura);
    }

    public String situacao() {
        float imc = imc();

        if (imc < 18.6) {
            return "Abaixo do peso!";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 30) {
            return "Excesso de peso!";
        } else {
            return "Obesidade!";
        }
    }

    public String resultado() {
        return "Ficha avaliativa de " + nome + "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + imc()
                + "\nSituação: " + situacao();
    }

}// fim da classe