package org.apache.commons.lang3.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public interface b {
    TimeZone U();

    String a();

    Date c(String str, ParsePosition parsePosition);

    Locale getLocale();

    boolean i(String str, ParsePosition parsePosition, Calendar calendar);

    Date parse(String str) throws ParseException;

    Object parseObject(String str) throws ParseException;

    Object parseObject(String str, ParsePosition parsePosition);
}
