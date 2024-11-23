import interface_adapterss.viewmodel;
import views.ForgetPasswordView;
import views.LoginView;
import views.MainView;
import views.SignUpView;

import javax.swing.*;
import java.awt.*;

public class FinalMain {
    public static void main(String[] args) {

        viewmodel viewmodel = new viewmodel();
        MainView mainView = new MainView(new LoginView(), new SignUpView(), new ForgetPasswordView());
        viewmodel.addPropertyChangeListener(mainView);
        mainView.setBackground(Color.blue);
        mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainView.setSize(800, 600);
        //mainView.setIconImage();
        mainView.setVisible(true);
    }
}
