/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Aldy
 */
import Database.*;
import View.*;
import Model.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Controller_Petugas_Menu extends MouseAdapter implements ActionListener {
    Petugas_Menu view;
    Application model;
    Database db;
    Pemilihan pemilihan= null;
  
    public Controller_Petugas_Menu(Petugas p){
        db = new Database();
        view = new Petugas_Menu(p);
        model = new Application();
        model.loadKandidat();
        model.loadPemilih();
        model.loadPetugas();
        view.resetView(p.getNama(),p.getTPS());
        view.Listener(this);
        view.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object src = ae.getSource();
        
        if (src.equals(view.getVerifikasi())){
            try{
               Kandidat k = model.getKandidatbyNoUrut(view.getSelectedPilihan());
               Pemilih p = model.getPemilih(view.getSelectedPemilih());
               Pemilihan pm = new Pemilihan(p,k);
               model.addPemilihanTerverifikasi(pm);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Klik tabel terlebih dahulu");
                System.out.println("Verifikasi Error");
                view.setVisible(true);
            }
        }else if(src.equals(view.getBack())){
            new Controller_Home();
            view.dispose();
        }
        
    }
    
}
