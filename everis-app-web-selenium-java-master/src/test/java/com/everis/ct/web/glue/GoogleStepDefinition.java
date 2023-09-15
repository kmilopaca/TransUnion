package com.everis.ct.web.glue;

import com.everis.ct.web.WebAutomationApplication;
import com.everis.ct.web.lib.WebDriverManager;
import com.everis.ct.web.step.GoogleSearchStep;
import com.everis.ct.web.step.GoogleSettingsStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = WebAutomationApplication.class)
public class GoogleStepDefinition {

    @Value("${url.google}")
    private String urlGoogle;
    @Value("${url.settings}")
    private String urlGoogleSettings;

    @Autowired
    private WebDriverManager manager;
    @Autowired
    private GoogleSearchStep searchStep;
    @Autowired
    private GoogleSettingsStep settingsStep; //demo shadowRoot

    @Given("que abro la pagina de google")
    public void queAbroLaPaginaDeGoogle() {
        manager.navigateTo(urlGoogle);
    }

    @Given("que abro la pagina de configuracio de google")
    public void queAbroLaPaginaDeConfiguracioDeGoogle() {
        manager.navigateTo(urlGoogleSettings);
    }

    //@When("escribo la busqueda de")
    //public void escriboLaBusquedaDe() {searchStep.searchData();
    //}

    @When("busco la opcion {string}")
    public void buscoLaOpcion(String option) {
        settingsStep.searchSettings(option);
    }

    @Then("valido que el resultado sea {string}")
    public void validoQueElResultadoSea(String result) {
        settingsStep.validateValueResult(result);
    }

    @Cuando("Selecciono Registro")
    public void seleccionoRegistro() {searchStep.searchData();
        
    }
    @Y("Nombre{string}, Apellido{string}, Telefono{string}, Correo {string}")
    public void nombreApellidoTelefonoCorreo(String arg0, String arg1, String arg2, String arg3) {searchStep.searchData1(arg0,arg1,arg2,arg3);

    }

    @Y("Direcccion {string}, Ciudad{string}")
    public void direcccionCiudad(String arg0, String arg1) {searchStep.searchData2(arg0,arg1);
    }

    @Cuando("nombre de usuario {string}, Contraseña {string} ,Confirmar {string}")
    public void nombreDeUsuarioContraseñaConfirmar(String arg0, String arg1, String arg2) {searchStep.searchData3(arg0, arg1, arg2);
    }

    @Y("se guardan los cambios")
    public void seGuardanLosCambios() {searchStep.Submit();
    }
}