
package Form;

import event.EventItem;
import com.Produk;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FormHome extends javax.swing.JPanel {
    private EventItem event;
    
    public FormHome() {
        initComponents();
    }
    
    //method untuk menambahkan item produk dari class produk
    public void addItem(Produk data) {
        FormProduk item = new FormProduk();
        item.setData(data);
        item.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                event.itemClick(item, data);
            }
        });
        
        PanelItem.add(item);
        PanelItem.repaint();
        PanelItem.revalidate();
    }
    
    //method untuk mengatur event
    public void setEvent(EventItem event){
        this.event = event;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        PanelItem = new swing.PanelItem();

        scroll.setViewportView(PanelItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PanelItem PanelItem;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    
}
