package ro.toyapp.frontend.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
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
		LoginOverlay component = new LoginOverlay();
		component.addLoginListener(e -> component.close());
		Button open = new Button("Open login overlay",
		    e -> component.setOpened(true));

		LoginI18n i18n = LoginI18n.createDefault();
		i18n.setAdditionalInformation("To close the login form submit non-empty username and password");
		component.setI18n(i18n);

		add(component, open);
	}
}
