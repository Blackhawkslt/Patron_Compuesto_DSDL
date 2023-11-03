public class ComponenteIndividual implements Componente {
    private String descripcion;
    public ComponenteIndividual(String descripcion){
        this.descripcion = descripcion;
    }
    public void caracteristicas(){
        System.out.println("Componente individual: "+descripcion);
        
    }
}
