package ro.toyapp.frontend.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import ro.toyapp.frontend.util.ApiCallsUtil;

@Route("login")
@PageTitle("Login")
public class Login extends VerticalLayout{
private ApiCallsUtil apiCallsUtil;
	
	@Autowired
	public Login(ApiCallsUtil apiCallsUtil) {
		this.apiCallsUtil= apiCallsUtil;
		addForm();
	}
	
	
	
	public void addForm() {
		 TextField userNameTextField = new TextField();
	     userNameTextField.getElement().setAttribute("name", "dealerCode"); // 
	     PasswordField passwordField = new PasswordField();
	     passwordField.getElement().setAttribute("name", "password"); // 
	     Button submitButton = new Button("Login");
	     submitButton.setId("submitbutton");
	     submitButton.addClickListener(click-> {
	    	 apiCallsUtil.login(userNameTextField.getValue(), passwordField.getValue());
	     });
	     FormLayout formLayout = new FormLayout(); // 
	     formLayout.add(userNameTextField, passwordField, submitButton);

	}
}

