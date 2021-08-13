package ro.toyapp.frontend.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import ro.toyapp.frontend.util.ApiCallsUtil;

@Route("login")
public class Login extends VerticalLayout{
private ApiCallsUtil apiCallsUtil;
	
	@Autowired
	public Login(ApiCallsUtil apiCallsUtil) {
		this.apiCallsUtil= apiCallsUtil;
		addForm();
	}
	
	
	
	public void addForm() {
		HorizontalLayout formLayout = new HorizontalLayout();
		formLayout.setWidth("80%");
		

        TextField taskField = new TextField();
        taskField.focus();
        
        PasswordField passwordField= new PasswordField();
        Button loginButton = new Button("Login");
        
        formLayout.add(taskField);
        formLayout.add(passwordField);
        formLayout.add(loginButton);
	}
}
