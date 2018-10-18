/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanke2;

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.event.*;

public class PendaftaranPraktikum extends JFrame{
     JLabel lblemail=new JLabel("Email Addres ");
 JTextField txemail=new JTextField(20);
 JLabel lblnama=new JLabel("Nama Lengkap");
 JTextField txnama=new JTextField(20);
  JLabel lblnpm=new JLabel("Npm ");
 JTextField txnpm=new JTextField(20);
 JLabel lblwhatsapp=new JLabel("Whatsapp");
 JTextField txwhatsapp=new JTextField(20);
 
 JLabel lblkelas=new JLabel("Kelas ");
 JRadioButton Pagi=new JRadioButton("Reg Pagi BJB");
 JRadioButton Malam=new JRadioButton("Reg Malam BJB");
 JRadioButton Non=new JRadioButton("Non Reg ");
 ButtonGroup grupkelas=new ButtonGroup();
 
    JLabel lblMateriPraktikum=new JLabel("Kelompok");
    String[] jenis={"Java","DEsaign grafis","Visual Basic","Micro Kontroler"};
    JComboBox cbjenis=new JComboBox(jenis);
 
    JButton tblsubmit=new JButton("submit");
 
    JButton cetak=new JButton("Cetak");
    JTextArea hasil=new JTextArea();
    
    JLabel lblhobi=new JLabel("Hobi");
    JCheckBox belanja=new JCheckBox("Belanja");
    JCheckBox liburan=new JCheckBox("Liburan");
    JCheckBox makan=new JCheckBox("Makan");
    
 PendaftaranPraktikum()
 {
 setTitle("Formulir Pendaftaran");
 setLocation(300,100);
 setSize(500,550);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void formulirpendaftaran(){
     getContentPane().setLayout(null);
 getContentPane().add(lblemail);
 lblemail.setBounds(10,10,100,20);
 getContentPane().add(txemail);
 txemail.setBounds(100,10,100,20);
 getContentPane().add(lblnama);
 lblnama.setBounds(10,40,100,20);
 getContentPane().add(txnama);
 txnama.setBounds(100,40,100,20);
 getContentPane().add(lblnpm);
 lblnpm.setBounds(10,70,70,20);
 getContentPane().add(txnpm);
 txnpm.setBounds(100,70,100,20);
 getContentPane().add(lblwhatsapp);
 lblwhatsapp.setBounds(10,100,70,20);
 getContentPane().add(txwhatsapp);
 txwhatsapp.setBounds(100,100,100,20);
  getContentPane().add(lblkelas);
 lblkelas.setBounds(10,130,100,20);
 getContentPane().add(Pagi);
 Pagi.setBounds(75,160,200,20);
 getContentPane().add(Malam);
 Malam.setBounds(75,190,200,20);
 getContentPane().add(Non);
 Non.setBounds(75,220,200,20);
 
 grupkelas.add(Pagi);
 grupkelas.add(Malam);
 grupkelas.add(Non);
 
 getContentPane().add(lblMateriPraktikum);
 lblMateriPraktikum.setBounds(10,250,200,20);
 getContentPane().add(cbjenis);
 cbjenis.setBounds(75,250,200,20);
 getContentPane().add(tblsubmit);
 tblsubmit.setBounds(180,280,95,20);
 
    getContentPane().add(cetak);
    cetak.setBounds(10,310,270,20);
    getContentPane().add(hasil);
    hasil.setBounds(10,330,270,150);
 
    getContentPane().add(lblhobi);
    lblhobi.setBounds(220,10,80,20);
    getContentPane().add(belanja);
    belanja.setBounds(250,10,100,20);
    getContentPane().add(liburan);
    liburan.setBounds(250,40,100,20);
    getContentPane().add(makan);
    makan.setBounds(250,70,100,20);
    
    setVisible(true);
 }
 void AksiReaksi()
{
cetak.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
hasil.append(txnama.getText()+"\n");
hasil.append(txemail.getText()+"\n");
hasil.append(txwhatsapp.getText()+"\n");
hasil.append(txnpm.getText()+"\n");
if(Pagi.isSelected()==true)
    {
hasil.append(Pagi.getText()+"\n");
}
else
{String jenis = (String)
        cbjenis.getSelectedItem();
hasil.append(jenis+"\n");
}
{
hasil.append(Malam.getText()+"\n");
}
if(belanja.isSelected()==true)
{
hasil.append(belanja.getText()+"\n");
}
if(liburan.isSelected()==true)
{
hasil.append(liburan.getText()+"\n");
}
if(makan.isSelected()==true)
{
hasil.append(makan.getText()+"\n");
}

}
});
 }
  public static void main(String args[]){
 PendaftaranPraktikum ap=new PendaftaranPraktikum();
 ap.formulirpendaftaran();
 ap.AksiReaksi();
 

 }
 }

