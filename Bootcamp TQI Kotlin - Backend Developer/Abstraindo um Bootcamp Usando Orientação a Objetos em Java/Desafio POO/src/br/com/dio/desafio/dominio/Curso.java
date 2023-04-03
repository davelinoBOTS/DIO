package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 50d;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", XP=" + calcularXp() +
                '}';
    }
}
