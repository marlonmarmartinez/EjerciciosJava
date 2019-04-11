//clase para las funciones basicas de una lavadora
package lfunciones;


public class LLFunciones {
    private int kilos=0, llenadocomp=0, tiporopa=0,lavadocomp=0,secadocomp=0;
    public LLFunciones(int kilos,int tiporopa){
       this.kilos=kilos;
       this.tiporopa=tiporopa;
    }
    
    private void llenado(){
        
        if(kilos<=12){
            llenadocomp=1;
            System.out.println("llenando...");
            System.out.println("llenado completo");
        }else{
            System.out.println("la carga de ropa es muy pesada reduce la carga");
            
        }
    }
    private void lavado(){
        llenado();
        
        if(llenadocomp==1){
            if(tiporopa==1){
                System.out.println("ropa blanca / lavado suave");
                System.out.println("lavando...");
                lavadocomp=1;
            }else if(tiporopa==2){
                System.out.println("ropa de color / lavado intenseo");
                System.out.println("lavando...");
                lavadocomp=1;
            }else{
                System.out.println("el tipo de ropa no esta disponible");
                System.out.println("se lavara como ropa de color / lavado intenso");
                lavadocomp=1;
            }
        }else{
            
        }
    }
    private void secado(){
        lavado();
        if(lavadocomp==1){
            System.out.println("secando...");
            secadocomp=1;
        }
    }
    public void cicloFinalizado(){
        secado();
        if(secadocomp==1){
            System.out.println("tu ropa esta lista");
            
        }
    }

    public int getTiporopa() {
        return tiporopa;
    }

    public void setTiporopa(int tiporopa) {
        this.tiporopa = tiporopa;
    }

}
