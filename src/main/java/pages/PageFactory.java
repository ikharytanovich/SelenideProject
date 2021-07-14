package pages;

import pages.uipages.*;

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
}
