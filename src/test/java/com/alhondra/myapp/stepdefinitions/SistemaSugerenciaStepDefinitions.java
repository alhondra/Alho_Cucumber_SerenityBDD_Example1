package com.alhondra.myapp.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SistemaSugerenciaStepDefinitions {

    @Given("^[a-zA-Z]{1,50} quiere encargar un lote de cajas$")
    public void prepararSugerencia() {
        System.out.println("GIVEN");
    }

    @When("^solicita la sugerencia de una caja para un objeto que (.*) con unas medidas de (\\d+) cm largo, (\\d+) cm de ancho y (\\d+) cm de alto$")
    public void solicitarSugerencia(String fragilidad,int largo, int ancho, int alto) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When"+ fragilidad + " - "+ largo);
    }


    @Then("^la recomendacion deberia ser una caja con las medidas (\\d+) cm de largo, (\\d+) cm de ancho y (\\d+) cm de alto$")
    public void verificarSugerencia(int largo, int ancho, int alto) {
        System.out.println("Then");
    }





}


