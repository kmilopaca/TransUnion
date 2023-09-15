package com.everis.ct.web.page;

import org.springframework.stereotype.Component;

@Component
public class StepPages {

    public GoogleSearchPage searchPage() {
        return new GoogleSearchPage();
    }

    public GoogleResultsPage resultsPage() {
        return new GoogleResultsPage();
    }

    public GoogleSettinsPage settinsPage() {
        return new GoogleSettinsPage();
    }

    }


