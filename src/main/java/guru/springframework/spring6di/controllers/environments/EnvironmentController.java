package guru.springframework.spring6di.controllers.environments;

import guru.springframework.spring6di.services.enviroments.DatasourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final DatasourceService datasourceService;

    public EnvironmentController(@Qualifier("Environment") DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getData(){
        return datasourceService.getDatasource();
    }
}
