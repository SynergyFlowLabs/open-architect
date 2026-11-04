package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public interface c {
    TimeZone U();

    String a();

    <B extends Appendable> B b(Calendar calendar, B b10);

    String d(Date date);

    <B extends Appendable> B e(Date date, B b10);

    String f(Calendar calendar);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    @Deprecated
    StringBuffer g(long j10, StringBuffer stringBuffer);

    Locale getLocale();

    @Deprecated
    StringBuffer h(Date date, StringBuffer stringBuffer);

    @Deprecated
    StringBuffer j(Calendar calendar, StringBuffer stringBuffer);

    String k(long j10);

    <B extends Appendable> B l(long j10, B b10);
}
