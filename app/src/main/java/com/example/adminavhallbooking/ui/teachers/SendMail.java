package com.example.adminavhallbooking.ui.teachers;

import android.util.Log;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {
    String senderEmail = "bookavhall@gmail.com";
    String username = "bookavhall";
    String senderPassword = "duubqeshaspakclh";

    String reciverEmail = "";
    public SendMail(){

    }

    public void sendmailToGmail(String reciverEmail){

        this.reciverEmail = reciverEmail;
        Properties properties =new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, senderPassword);
            }
        });
        Log.i("yes","Entering");


        Thread thread = new Thread(() -> {
            try {
                MimeMessage mimeMessage = new MimeMessage(session);
                mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(reciverEmail));
                mimeMessage.setFrom(new InternetAddress(senderEmail));
                mimeMessage.setSubject("Login Credential for AV Hall Booking Application");
                mimeMessage.setText("Login Credentials:\n" + "Username : "+reciverEmail +"\n"+"Password : " +"abcdefghi");
                Transport.send(mimeMessage);
                Log.i("send","successful");
            } catch (MessagingException e) {
                Log.i("unsuccess","yes");
                e.printStackTrace();
            }
        });
        thread.start();

    }
}
