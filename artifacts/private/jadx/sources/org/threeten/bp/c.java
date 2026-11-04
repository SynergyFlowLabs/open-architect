package org.threeten.bp;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public final class c {
    private c() {
    }

    public static Date a(f fVar) {
        try {
            return new Date(fVar.l0());
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static GregorianCalendar b(u uVar) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(m(uVar.H()));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setFirstDayOfWeek(2);
        gregorianCalendar.setMinimalDaysInFirstWeek(4);
        try {
            gregorianCalendar.setTimeInMillis(uVar.U().l0());
            return gregorianCalendar;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static f c(Timestamp timestamp) {
        return f.a0(timestamp.getTime() / 1000, timestamp.getNanos());
    }

    public static f d(Calendar calendar) {
        return f.Y(calendar.getTimeInMillis());
    }

    public static f e(Date date) {
        return f.Y(date.getTime());
    }

    public static g f(java.sql.Date date) {
        return g.C0(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
    }

    public static h g(Timestamp timestamp) {
        return h.D0(timestamp.getYear() + 1900, timestamp.getMonth() + 1, timestamp.getDate(), timestamp.getHours(), timestamp.getMinutes(), timestamp.getSeconds(), timestamp.getNanos());
    }

    public static i h(Time time) {
        return i.f0(time.getHours(), time.getMinutes(), time.getSeconds());
    }

    public static java.sql.Date i(g gVar) {
        return new java.sql.Date(gVar.r0() - 1900, gVar.p0() - 1, gVar.l0());
    }

    public static Time j(i iVar) {
        return new Time(iVar.L(), iVar.M(), iVar.O());
    }

    public static Timestamp k(f fVar) {
        try {
            Timestamp timestamp = new Timestamp(fVar.H() * 1000);
            timestamp.setNanos(fVar.I());
            return timestamp;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Timestamp l(h hVar) {
        return new Timestamp(hVar.n0() - 1900, hVar.k0() - 1, hVar.e0(), hVar.h0(), hVar.i0(), hVar.m0(), hVar.l0());
    }

    public static TimeZone m(r rVar) {
        String id2 = rVar.getId();
        if (id2.startsWith(org.slf4j.h.f339615a3) || id2.startsWith("-")) {
            id2 = org.apache.commons.lang3.time.m.f337525a + id2;
        } else if (id2.equals(org.locationtech.jts.io.gml2.a.f338505w)) {
            id2 = "UTC";
        }
        return TimeZone.getTimeZone(id2);
    }

    public static r n(TimeZone timeZone) {
        return r.H(timeZone.getID(), r.f340309b);
    }

    public static u o(Calendar calendar) {
        return u.H0(f.Y(calendar.getTimeInMillis()), n(calendar.getTimeZone()));
    }
}
