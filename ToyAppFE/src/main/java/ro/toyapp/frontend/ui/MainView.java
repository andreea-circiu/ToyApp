package ro.toyapp.frontend.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import ro.toyapp.frontend.model.DealerDTO;
import ro.toyapp.frontend.util.ApiCallsUtil;

@Route("")
public class MainView extends VerticalLayout{
	
	private ApiCallsUtil apiCallsUtil = new ApiCallsUtil();
	
	
	public MainView() {
		Grid<DealerDTO> grid = new Grid<>(DealerDTO.class);
		grid.setItems(apiCallsUtil.getDealers());
		add(grid);
	}
}
