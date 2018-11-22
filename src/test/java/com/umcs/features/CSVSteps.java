package com.umcs.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

/**
 * testy = Steps
 * scenariusze = Feature
 */
public class CSVSteps {
    int month = 0;
    int nextMonth = 0;
    String filename;
    int price = 0;
    int currentPrice = 0;
    int previousPrice = 0;
    int nextPrice = 0;
    float summary;
    String record;

    @Given("^a list of records from file (.*)$")
    public void aListOfRecords(String filename) {
        this.filename = filename;
    }

    @When("^I process the records$")
    public void iReadTheEmptyPrice(Double price) throws Throwable {
        price = null;
    }

    @Then("^the price is calculated using previous and next day prices to be (.*)$")
    public void thePriceIsCalculatedUsingPreviousAndNextDayPrices(double price) throws Throwable {
        assertEquals(currentPrice, previousPrice + nextPrice / 2);
    }

    @Then("^only the (.^) price is taken into account$")
    public void onlyThePriceIsTakenIntoAccount(int price, int previousPrice) throws Throwable {
        this.price = previousPrice;
        throw new PendingException();
    }

    @Then("^getRaportMSG \"([^\"]*)\"$")
    public void getraportmsg(String arg0) throws Throwable {
        System.out.println("Error");
        throw new PendingException();
    }

    @Given("^Continous records have empty price$")
    public void continousRecordsHaveEmptyPrice(String record) throws Throwable {
        record = wczytajDaneZPliku(filename);
        record = null;
        throw new PendingException();
    }

    @Then("^set price as average price from known prices$")
    public void setPriceAsAveragePriceFromKnownPrices(Double price) throws Throwable {
        assertEquals(currentPrice, previousPrice + nextPrice / 2);
        throw new PendingException();
    }

    @Then("^Change the format to mainFormat$")
    public void changeTheFormatToMainFormat(String Format, String oldFormat) throws Throwable {
        assertEquals(oldFormat, Format);
        throw new PendingException();
    }

    @Given("^Records from entire year$")
    public void recordsFromEntireYear() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Making year summary$")
    public void makingYearSummary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Cumulate all records$")
    public float cumulateAllRecords() throws Throwable {
        for (int i = 0; i < month; i++) {
            summary = makingMonthlySummary();
        }
        throw new PendingException();
    }

    @When("^Analysing trends$")
    public void analysingTrends() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Get 3 companies with highest percentage increase of their prices$")
    public void getCompaniesWithHighestPercentageIncreaseOfTheirPrices(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^only the (\\d+)\.(\\d+) price is taken into account$")
    public void onlyThePriceIsTakenIntoAccount(int arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Records from entire month$")
    public void recordsFromEntireMonth() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^multiple files including same company$")
    public void multipleFilesIncludingSameCompany() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Making monthly summary$")
    public float makingMonthlySummary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Add multiple records and get average price$")
    public void addMultipleRecordsAndGetAveragePrice() throws Throwable {
        throw new PendingException();
    }

    @Given("^a list of not-ordered records$")
    public void aListOfNotOrderedRecords() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^List records in correct order$")
    public void listRecordsInCorrectOrder() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^finding the highest price$")
    public void findingTheHighestPrice() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Tag price as highest$")
    public void tagPriceAsHighest() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^finding the lowest price$")
    public void findingTheLowestPrice() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Tag price as lowest$")
    public void tagPriceAsLowest() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Getting new data$")
    public void gettingNewData() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^repeat the process on next day$")
    public void repeatTheProcessOnNextDay() throws Throwable {

        throw new PendingException();
    }
}
// Nie skonoczone, ale nie widzialem, co dalej :(

