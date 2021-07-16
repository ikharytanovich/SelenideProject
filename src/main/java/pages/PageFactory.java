package pages;

import pages.playgroundpages.*;

public interface PageFactory {
    MainPage mainPage = new MainPage();
    DynamicIdPage dynamicIdPage = new DynamicIdPage();
    ClassAttributePage classAttributePage = new ClassAttributePage();
    HiddenLayers hiddenLayers = new HiddenLayers();
    LoadDelayPage loadDelayPage = new LoadDelayPage();
    AJAXDataPage ajaxDataPage = new AJAXDataPage();
    ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage();
    ClickPage clickPage = new ClickPage();
    TextInputPage textInputPage = new TextInputPage();
    ScrollbarsPage scrollbarsPage = new ScrollbarsPage();
    DynamicTablePage dynamicTablePage = new DynamicTablePage();
    VerifyTextPage verifyText = new VerifyTextPage();
    ProgressBarPage progressBarPage = new ProgressBarPage();
    MouseOverPage mouseOverPage = new MouseOverPage();
    SampleAppPage sampleAppPage = new SampleAppPage();
    NonBrakingSpacePage nonBrakingSpacePage = new NonBrakingSpacePage();
}
