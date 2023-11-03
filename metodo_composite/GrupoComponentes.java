import java.util.ArrayList;
import java.util.List;

public class GrupoComponentes implements Componente {
    private List<Componente> componentes = new ArrayList<>();
    private String parte;
    public GrupoComponentes(String parte){
        this.parte = parte;
    }
    public void agregar(Componente componente){
        componentes.add(componente);
    }
    public void caracteristicas(){
        System.out.println("Grupo de componentes: "+parte);
        for (Componente componente : componentes){
            componente.caracteristicas();
        }
    }
}
