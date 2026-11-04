package com.google.android.material.datepicker;

import androidx.annotation.p0;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f112510c = new u(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Long f112511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final TimeZone f112512b;

    private u(@p0 Long l10, @p0 TimeZone timeZone) {
        this.f112511a = l10;
        this.f112512b = timeZone;
    }

    static u a(long j10) {
        return new u(Long.valueOf(j10), null);
    }

    static u b(long j10, @p0 TimeZone timeZone) {
        return new u(Long.valueOf(j10), timeZone);
    }

    static u e() {
        return f112510c;
    }

    Calendar c() {
        return d(this.f112512b);
    }

    Calendar d(@p0 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f112511a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
