public class Principal {
    public static void main(String[] args) {
        Componente motor = new ComponenteIndividual("Rolls Royce V8");
        Componente chasis = new ComponenteIndividual("Acero fundido");
        Componente llanta1 = new ComponenteIndividual("Goodyear R17");
        Componente llanta2 = new ComponenteIndividual("Goodyear R17");
        Componente llanta3 = new ComponenteIndividual("Goodyear R17");
        Componente llanta4 = new ComponenteIndividual("Goodyear R17");
        Componente carroceria = new ComponenteIndividual("carroceria deportiva");

        GrupoComponentes luces = new GrupoComponentes("Luces");
        luces.agregar(new ComponenteIndividual("Exploradoras"));
        luces.agregar(new ComponenteIndividual("Stops"));
        luces.agregar(new ComponenteIndividual("Altas"));

        GrupoComponentes ventanas = new GrupoComponentes("ventanas");
        ventanas.agregar(new ComponenteIndividual("Parabrisas"));
        ventanas.agregar(new ComponenteIndividual("laterales delanteras"));
        ventanas.agregar(new ComponenteIndividual("laterales traseras"));
        ventanas.agregar(new ComponenteIndividual("Trasera"));

        GrupoComponentes carro = new GrupoComponentes("carro");
        carro.agregar(motor);
        carro.agregar(chasis);
        carro.agregar(llanta1);
        carro.agregar(llanta2);
        carro.agregar(llanta3);
        carro.agregar(llanta4);
        carro.agregar(carroceria);
        carro.agregar(luces);
        carro.agregar(ventanas);
        carro.caracteristicas();
    }
}
