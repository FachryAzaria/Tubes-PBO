package Form;

import event.EventItem;
import com.Produk;
import java.awt.Cursor;
import java.text.DecimalFormat;
import java.util.ArrayList;



public class FormProduk extends javax.swing.JPanel {
    Produk produk;
    
    public ArrayList<String> arr;
    
    public FormProduk() {
        initComponents();
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }
      
    private Produk data;
    
    public void setData(Produk data) {
        this.data = data;
        pic.setImage(data.getImage());
        lbNamaProduk.setText(data.getNama_produk());

        DecimalFormat df = new DecimalFormat("$#,##0.00");
        lbHargaProduk.setText(df.format(data.getHarga_produk()));
    }
    
    public Produk getData(){
        return data;
    }
    
    private EventItem event;
    
    public void setEvent(EventItem event){
        this.event = event;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNamaProduk = new javax.swing.JLabel();
        pic = new com.PictureBox();
        lbHargaProduk = new javax.swing.JLabel();
        btnKeranjang = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 180, 180), 2, true));
        setForeground(new java.awt.Color(255, 255, 255));

        lbNamaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNamaProduk.setText("nama");

        pic.setBackground(new java.awt.Color(255, 255, 255));
        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/res/ItemImage/img1.png"))); // NOI18N

        lbHargaProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHargaProduk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbHargaProduk.setText("harga");

        btnKeranjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/shopping-cart-empty-side-view (1).png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Keranjang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNamaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnKeranjang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addComponent(pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHargaProduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbNamaProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHargaProduk)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(btnKeranjang, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnKeranjang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbHargaProduk;
    private javax.swing.JLabel lbNamaProduk;
    private com.PictureBox pic;
    // End of variables declaration//GEN-END:variables
}
