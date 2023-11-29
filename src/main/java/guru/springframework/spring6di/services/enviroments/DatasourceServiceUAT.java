package guru.springframework.spring6di.services.enviroments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("Environment")
public class DatasourceServiceUAT implements DatasourceService {
    @Override
    public String getDatasource() {

        return "UAT datasource";
    }
}
