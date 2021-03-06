package com.sky.calendar;

import java.util.Date;

public class DayInfo {

    // 阳历日期
    private Date solarDate;

    // 阴历年份
    private int lunarYear;
    // 阴历月份
    private int lunarMonth;
    // 阴历日期
    private int lunarDay;
    // 特殊节假日
    private String specailDay;
    //中文名称
    private String lunarChinaDay;
    private String lunarChinaMonth;

    //是否润年
    private boolean isLeapYear;
    //是否润月
    private boolean isLeapMonth;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return lunarYear + "年" + (isLeapMonth ? "闰" : "") + lunarMonth + "月" + lunarDay + "日" + "特殊节日：" + specailDay;
    }

    public Date getSolarDate() {
        return solarDate;
    }

    public void setSolarDate(Date solarDate) {
        this.solarDate = solarDate;
    }

    public int getLunarYear() {
        return lunarYear;
    }

    public void setLunarYear(int lunarYear) {
        this.lunarYear = lunarYear;
    }

    public int getLunarMonth() {
        return lunarMonth;
    }

    public void setLunarMonth(int lunarMonth) {
        this.lunarMonth = lunarMonth;
    }

    public int getLunarDay() {
        return lunarDay;
    }

    public void setLunarDay(int lunarDay) {
        this.lunarDay = lunarDay;
    }

    public String getSpecailDay() {
        return specailDay;
    }

    public void setSpecailDay(String specailDay) {
        this.specailDay = specailDay;
    }

    public boolean isLeapYear() {
        return isLeapYear;
    }

    public void setLeapYear(boolean isLeapYear) {
        this.isLeapYear = isLeapYear;
    }

    public boolean isLeapMonth() {
        return isLeapMonth;
    }

    public void setLeapMonth(boolean isLeapMonth) {
        this.isLeapMonth = isLeapMonth;
    }

    public String getLunarChinaDay() {
        return lunarChinaDay;
    }

    public void setLunarChinaDay(String lunarChinaDay) {
        this.lunarChinaDay = lunarChinaDay;
    }

    public String getLunarChinaMonth() {
        return lunarChinaMonth;
    }

    public void setLunarChinaMonth(String lunarChinaMonth) {
        this.lunarChinaMonth = lunarChinaMonth;
    }
}
