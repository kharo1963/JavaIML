package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ImlBean imlBean = context.getBean("ImlBean", ImlBean.class);
        String srcCode = System.getProperty("user.dir") + System.getProperty("file.separator") + imlBean.getName();
        context.close();
        try {
            System.out.println("Hello");
	        Interpretator I = new Interpretator (srcCode);
            I.interpretation();
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
