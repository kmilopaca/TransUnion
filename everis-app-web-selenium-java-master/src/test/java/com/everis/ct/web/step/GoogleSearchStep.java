package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class GoogleSearchStep {

    @Autowired
    private StepPages page;

    public void searchData1(String data, String data1, String data2, String data3) {
        page.searchPage().search(data, data1,data2,data3);
    }
    public void searchData(){page.searchPage().writeSearch();}

    public void searchData2(String data, String data1) {page.searchPage().mailing(data, data1);
    }

    public void searchData3(String data, String data1, String data2) {page.searchPage().UserInfo(data, data1, data2);
    }

    public void Submit(){page.searchPage().submit();}
}


