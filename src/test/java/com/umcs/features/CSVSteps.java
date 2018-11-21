package com.umcs.features;

import com.umcs.Kalendarz;
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

    @Given("^current month is (.*)$")
    public void a_file_with_CSV_values(int month) {
        this.month = month;
    }

    @When("^i get the next month$")
    public void we_parse_the_file() {
        nextMonth = Kalendarz.getNextMonth(month);
    }

    @Then("^the current month is (.*)$")
    public void an_array_with_values_is_returned(int monthThatShouldBe) {
        assertEquals(nextMonth, monthThatShouldBe);
    }


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
        assertEquals(price, (price.pievious + price.next) / 2);
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
    public void cumulateAllRecords() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
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

