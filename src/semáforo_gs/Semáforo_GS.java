/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semáforo_gs;

/**
 *
 * @author 59399
 */
public class Semáforo_GS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Random random = new Random();
        int estado = random.nextInt(3) + 1;
        lblGrafico.setText(String.valueOf(estado));
        
        
        switch (estado) {
            case 1: 
            //if(estado==3){
                estado=1;
                ImageIcon a=new ImageIcon("C:\\Users\\Sarita\\Documents\\NetBeansProjects\\HolaMundoVisual\\src\\resources\\SemaforoRojo.jpg");
                lblGrafico.setIcon(a);
                ImageIcon b=new ImageIcon("C:\\Users\\Sarita\\Documents\\NetBeansProjects\\HolaMundoVisual\\src\\resources\\ROJO.jpg");
                lblRojo.setIcon(b);
                lblAmarillo.setIcon(null);  // Desactivar amarillo
                lblVerde.setIcon(null);     // Desactivar verde
                lblMensaje.setText("DETENGASE");
            //}else{
               // estado++;
            //}
              break;
              
            case 2:
            //if(estado==1){
                //estado=2;
            
            ImageIcon c=new ImageIcon("C:\\Users\\Sarita\\Documents\\NetBeansProjects\\HolaMundoVisual\\src\\resources\\SemaforoAmarillo.jpg");
            lblGrafico.setIcon(c);
            ImageIcon d=new ImageIcon("C:\\Users\\Sarita\\Documents\\NetBeansProjects\\HolaMundoVisual\\src\\resources\\AMARILLO.jpg");
            lblAmarillo.setIcon(d);
            lblRojo.setIcon(null);      // Desactivar rojo
            lblVerde.setIcon(null);     // Desactivar verde
            lblMensaje.setText("TENGA PRECAUCION REBAJE LA VELOCIDAD");
            //}else{
               // estado++;
            //}
               break;
               
            case 3:
            //if(estado==2){
                //estado=2;
   
            ImageIcon e=new ImageIcon("C:\\Users\\Sarita\\Documents\\NetBeansProjects\\HolaMundoVisual\\src\\resources\\SemaforoVerde.jpg");
            lblGrafico.setIcon(e);    
            ImageIcon f=new ImageIcon("C:\\Users\\Sarita\\Documents\\NetBeansProjects\\HolaMundoVisual\\src\\resources\\VERDE.jpg"); 
            lblVerde.setIcon(f);
            lblRojo.setIcon(null);      // Desactivar rojo
            lblAmarillo.setIcon(null);  // Desactivar amarillo
            lblMensaje.setText("INICIE MARCHA Y SIGA");
            //}else{
               // estado++;
            //}
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "No se puede realizar lo solisitado");
      }
}
