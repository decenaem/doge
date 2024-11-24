import interface_adapterss.ViewModel;
import views.ForgetPasswordView;
import views.LoginView;
import views.MainView;
import views.SignUpView;

import javax.swing.*;
import java.awt.*;

public class FinalMain {
    public static void main(String[] args) {

        ViewModel viewmodel = new ViewModel();

        MainView mainView = new MainView(new LoginView(viewmodel), new SignUpView(viewmodel),
                new ForgetPasswordView(viewmodel));
        viewmodel.addPropertyChangeListener(viewmodel.CURRENT_STATE, mainView);
        mainView.setBackground(Color.blue);
        mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainView.setSize(800, 600);
        //mainView.setIconImage();
        mainView.setVisible(true);
    }
}