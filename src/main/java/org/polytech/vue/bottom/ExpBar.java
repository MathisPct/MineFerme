package org.polytech.vue.bottom;

import org.polytech.model.JoueurModel;
import org.polytech.utils.ExtensionImage;
import org.polytech.utils.Utils;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class ExpBar extends JPanel implements Observer {

    ImageIcon backgroundImage;
    private JLabel lblArgent;
    private JLabel suffixeArgent;

    public ExpBar()
    {
        backgroundImage= Utils.getImageIconFromResources("barExp", ExtensionImage.PNG);
        //Label de l'argent
        this.lblArgent = new JLabel("XXXX");
        lblArgent.setHorizontalAlignment(JLabel.LEFT);
        lblArgent.setFont(new Font("Arial", Font.PLAIN,20 ));
        lblArgent.setForeground(Color.black);
        lblArgent.setOpaque(false);
        lblArgent.setForeground(Color.white);

        this.suffixeArgent = new JLabel("€");
        suffixeArgent.setHorizontalAlignment(JLabel.LEFT);
        suffixeArgent.setFont(new Font("Arial", Font.PLAIN,20 ));
        suffixeArgent.setForeground(Color.white);
        suffixeArgent.setOpaque(false);

        this.add(lblArgent);
        this.add(suffixeArgent);

        Font minecraftFont = Utils.getFontFromResources("Minecraft");
        lblArgent.setFont(minecraftFont.deriveFont(Font.PLAIN, 40));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage.getImage(), 0,this.getHeight()/2,  this.getWidth(), 15, this);
    }

    public void updateArgentLabel(String value) {
        this.lblArgent.setText(value);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof JoueurModel joueurModel) {
            double solde = joueurModel.getSolde();
            updateArgentLabel(String.valueOf(solde));
        }
    }
}
