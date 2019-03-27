package com.yardox.spring.lang.impl;

import com.yardox.spring.lang.Language;

public class Vietnamese implements Language {
    @Override
    public String getGreeting() {
        return "Xin Chao";
    }

    @Override
    public String getBye() {
        return "Tam Biet";
    }
}
