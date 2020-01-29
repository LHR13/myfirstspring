package com.LHR13.autowrit;

public class AutoWritingService {
    private AutoWritingDAO autoWritingDAO;

    public void setAutoWritingDAO(AutoWritingDAO autoWritingDAO) {
        this.autoWritingDAO = autoWritingDAO;
    }

    public void say(String word) {
        this.autoWritingDAO.say(word);
    }
}
