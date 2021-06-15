package com.care.root.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class Mailer {
   @Autowired JavaMailSender sender;
   public void sendMail(String email) {
      MimeMessage msg = sender.createMimeMessage(); 
      MimeMessageHelper helper; // 메일 속성값을 넣기 위한 변수
      try {
         helper = new MimeMessageHelper(msg);
         helper.setTo(email); // 전송 목적지
         helper.setSubject("test email"); // 제목
         helper.setText("<h1>가입을 축하합니다</h1>",true); // 내용
         sender.send(msg);  // 설정한 값 보내기
      } catch (MessagingException e) {
         e.printStackTrace();
      }
   }
}
