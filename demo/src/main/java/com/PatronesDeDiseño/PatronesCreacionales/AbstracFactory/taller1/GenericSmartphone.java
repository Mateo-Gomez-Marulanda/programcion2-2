
package com.PatronesDeDiseño.PatronesCreacionales.AbstracFactory.taller1;
public class GenericSmartphone implements ISmartphone{

    private String model;
    private String storage;
    private String ram;
    private String os;
    private String resolucion;

    public GenericSmartphone(String model, String storage, String ram, String os, String resolucion) {
        this.model = model;
        this.storage = storage;
        this.ram = ram;
        this.os = os;
        this.resolucion = resolucion;
    }

    public void call() {
        System.out.println("calling");
    }

    public GenericSmartphone clonar(){
        return new GenericSmartphone(this.model, this.storage, this.ram, this.os, this.resolucion);
    }

    @Override
    public String toString() {
        return "GenericSmartphone [model=" + model + ", storage=" + storage + ", ram=" + ram + ", os=" + os
                + ", resolucion=" + resolucion + "]";
    }


}
