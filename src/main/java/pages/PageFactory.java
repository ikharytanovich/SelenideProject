package pages;

import pages.playgroundpages.*;

public interface PageFactory {
    MainPage mainPage = new MainPage();
    AJAXDataPage ajaxDataPage = new AJAXDataPage();
    ClassAttributePage classAttributePage = new ClassAttributePage();
    ClickPage clickPage = new ClickPage();
    ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage();
    DynamicIdPage dynamicIdPage = new DynamicIdPage();
    DynamicTablePage dynamicTablePage = new DynamicTablePage();
    HiddenLayers hiddenLayers = new HiddenLayers();
    LoadDelayPage loadDelayPage = new LoadDelayPage();
    MouseOverPage mouseOverPage = new MouseOverPage();
    NonBrakingSpacePage nonBrakingSpacePage = new NonBrakingSpacePage();
    ProgressBarPage progressBarPage = new ProgressBarPage();
    SampleAppPage sampleAppPage = new SampleAppPage();
    ScrollbarsPage scrollbarsPage = new ScrollbarsPage();
    TextInputPage textInputPage = new TextInputPage();
    VerifyTextPage verifyText = new VerifyTextPage();
}
