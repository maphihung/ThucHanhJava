/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanh1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author Admin
 */
public class BaiThucHanh1 extends Frame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame fr= new Frame();
        // TODO code application logic here
        fr.setSize(400,400);
        fr.setTitle("awt");
        fr.setLayout(null);//---sử dụng null cho panel
        //fr.setLayout(new FlowLayout());//---tắt khi sử dụng lần lượt
        //------------------------------
        
        lb_a = new Label("a: ");
        txt_a = new TextField(20);
        lb_b = new Label("b: ");
        txt_b = new TextField(20);
        btn_tong = new Button("+");
        btn_hieu = new Button("-");
        btn_tich = new Button("x");
        btn_thuong = new Button("/");
        lb_kq = new Label("Ket qua: ");
        txt_kq = new TextField(20);
        
        // Chỉ sử dụng panel
        Panel pn1 = new Panel();
        pn1.setSize(399,40);
        pn1.setLocation(-50,30);
        fr.add(pn1);//---------------------
        Panel pn2 = new Panel();
        pn2.setSize(399,30);
        pn2.setLocation(-50,80);
        fr.add(pn2);//--------------------
        Panel pn3 = new Panel();
        pn3.setSize(399,30);
        pn3.setLocation(-50,120);
        fr.add(pn3);//------------------------
        Panel pn4 = new Panel();
        pn4.setSize(399,30);
        pn4.setLocation(-70,160);
        fr.add(pn4);//--------------------;
        pn1.add(lb_a);
        pn1.add(txt_a);
        pn2.add(lb_b);
        pn2.add(txt_b);
        pn3.add(btn_tong);
        pn3.add(btn_hieu);
        pn3.add(btn_tich);
        pn3.add(btn_thuong);
        pn4.add(lb_kq);
        pn4.add(txt_kq);
        
        //-----------Sử dụng grid layout
        /**
        GridLayout layout = new GridLayout(4,2);
        Panel pn = new Panel();
        fr.add(pn);
        pn.setLayout(new FlowLayout());
        pn.add(lb_a);
        */
        //-----------------------------
        btn_tong.addActionListener(new LangNgheTong());
        btn_hieu.addActionListener(new LangNgheHieu());
        btn_tich.addActionListener(new LangNgheTich());
        btn_thuong.addActionListener(new LangNgheThuong());
        XuLySuKienWin boLangNghe = new XuLySuKienWin();
        fr.addWindowListener(boLangNghe);
        //--------------------------------
        fr.setVisible(true);
        
        //-------------------------
    }
    //---Bo lang nghe
    public static class LangNgheTong implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
               int a = Integer.parseInt(txt_a.getText());
               int b = Integer.parseInt(txt_b.getText());
               int Tong = a+b;
               txt_kq.setText(String.valueOf(Tong));
        }        
    }
    public static class LangNgheHieu implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent ae) {
               int a = Integer.parseInt(txt_a.getText());
               int b = Integer.parseInt(txt_b.getText());
               int Hieu = a -b;
               txt_kq.setText(String.valueOf(Hieu));
            }
            
        }
    public static class LangNgheTich implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent ae) {
               int a = Integer.parseInt(txt_a.getText());
               int b = Integer.parseInt(txt_b.getText());
               int Hieu = a*b;
               txt_kq.setText(String.valueOf(Hieu));
            }
            
        }
    public static class LangNgheThuong implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent ae) {
               float a = Float.parseFloat(txt_a.getText());
               float b = Float.parseFloat(txt_b.getText());
               float Hieu;
               if (a!=0) {
                  Hieu = a/b;
                  txt_kq.setText(String.valueOf(Hieu));
               } else {
                   txt_kq.setText("Phép tính không hợp lệ");
               }
            }
            
        }
    public static class XuLySuKienWin implements WindowListener {
        @Override
        public void windowOpened(WindowEvent we) {}

        @Override
        public void windowClosing(WindowEvent we) {System.exit(0);}
            
        @Override
        public void windowClosed(WindowEvent we) {}

        @Override
        public void windowIconified(WindowEvent we) {}

        @Override
        public void windowDeiconified(WindowEvent we) {}

        @Override
        public void windowActivated(WindowEvent we) {}

        @Override
        public void windowDeactivated(WindowEvent we) {}
       
    }
    //-----Khai bao
    static Button btn_tong, btn_tich, btn_hieu, btn_thuong;
    static Label lb_a, lb_b, lb_kq;
    static TextField txt_a, txt_b, txt_kq;
}
