

public class CelularBuilder {

    private Celular celular;

    public CelularBuilder(){
        celular = new Celular();
    }

    public Celular build(){
        if (celular.getCodigo() == 0){
            throw new IllegalArgumentException("Código inválido");
        }
        if(celular.getMarca().equals("")){
            throw new IllegalArgumentException("Marca inválida");
        }
        return celular;
    }

    public CelularBuilder setCodigo(int codigo){
        celular.setCodigo(codigo);
        return this;
    }

    public CelularBuilder setMarca(String marca){
        celular.setMarca(marca);
        return this;
    }

    public CelularBuilder setCriador(String criador){
        celular.setCriador(criador);
        return this;
    }

    public CelularBuilder setAno(int ano){
        celular.setAno(ano);
        return this;
    }


}