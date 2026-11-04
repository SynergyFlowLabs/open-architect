package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public class f extends Format implements b, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f337406c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f337407d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f337408e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f337409f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f337410g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j<f> f337411h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f337412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f337413b;

    static class a extends j<f> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.apache.commons.lang3.time.j
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public f a(String str, TimeZone timeZone, Locale locale) {
            return new f(str, timeZone, locale);
        }
    }

    protected f(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static f A(String str, TimeZone timeZone) {
        return (f) f337411h.f(str, timeZone, null);
    }

    public static f B(String str, TimeZone timeZone, Locale locale) {
        return (f) f337411h.f(str, timeZone, locale);
    }

    public static f D(int i10) {
        return (f) f337411h.h(i10, null, null);
    }

    public static f E(int i10, Locale locale) {
        return (f) f337411h.h(i10, null, locale);
    }

    public static f F(int i10, TimeZone timeZone) {
        boolean z10 = false;
        return (f) f337411h.h(i10, timeZone, null);
    }

    public static f G(int i10, TimeZone timeZone, Locale locale) {
        return (f) f337411h.h(i10, timeZone, locale);
    }

    public static f o(int i10) {
        return (f) f337411h.b(i10, null, null);
    }

    public static f p(int i10, Locale locale) {
        return (f) f337411h.b(i10, null, locale);
    }

    public static f q(int i10, TimeZone timeZone) {
        return (f) f337411h.b(i10, timeZone, null);
    }

    public static f r(int i10, TimeZone timeZone, Locale locale) {
        return (f) f337411h.b(i10, timeZone, locale);
    }

    public static f s(int i10, int i11) {
        return (f) f337411h.c(i10, i11, null, null);
    }

    public static f t(int i10, int i11, Locale locale) {
        return (f) f337411h.c(i10, i11, null, locale);
    }

    public static f u(int i10, int i11, TimeZone timeZone) {
        return v(i10, i11, timeZone, null);
    }

    public static f v(int i10, int i11, TimeZone timeZone, Locale locale) {
        return (f) f337411h.c(i10, i11, timeZone, locale);
    }

    public static f w() {
        return (f) f337411h.e();
    }

    public static f x(String str) {
        return (f) f337411h.f(str, null, null);
    }

    public static f z(String str, Locale locale) {
        return (f) f337411h.f(str, null, locale);
    }

    public int C() {
        return this.f337412a.s();
    }

    @Override // org.apache.commons.lang3.time.b, org.apache.commons.lang3.time.c
    public TimeZone U() {
        return this.f337412a.U();
    }

    @Override // org.apache.commons.lang3.time.b, org.apache.commons.lang3.time.c
    public String a() {
        return this.f337412a.a();
    }

    @Override // org.apache.commons.lang3.time.c
    public <B extends Appendable> B b(Calendar calendar, B b10) {
        return (B) this.f337412a.b(calendar, b10);
    }

    @Override // org.apache.commons.lang3.time.b
    public Date c(String str, ParsePosition parsePosition) {
        return this.f337413b.c(str, parsePosition);
    }

    @Override // org.apache.commons.lang3.time.c
    public String d(Date date) {
        return this.f337412a.d(date);
    }

    @Override // org.apache.commons.lang3.time.c
    public <B extends Appendable> B e(Date date, B b10) {
        return (B) this.f337412a.e(date, b10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f337412a.equals(((f) obj).f337412a);
        }
        return false;
    }

    @Override // org.apache.commons.lang3.time.c
    public String f(Calendar calendar) {
        return this.f337412a.f(calendar);
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.c
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.f337412a.r(obj));
        return stringBuffer;
    }

    @Override // org.apache.commons.lang3.time.c
    @Deprecated
    public StringBuffer g(long j10, StringBuffer stringBuffer) {
        return this.f337412a.g(j10, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.b, org.apache.commons.lang3.time.c
    public Locale getLocale() {
        return this.f337412a.getLocale();
    }

    @Override // org.apache.commons.lang3.time.c
    @Deprecated
    public StringBuffer h(Date date, StringBuffer stringBuffer) {
        return this.f337412a.h(date, stringBuffer);
    }

    public int hashCode() {
        return this.f337412a.hashCode();
    }

    @Override // org.apache.commons.lang3.time.b
    public boolean i(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.f337413b.i(str, parsePosition, calendar);
    }

    @Override // org.apache.commons.lang3.time.c
    @Deprecated
    public StringBuffer j(Calendar calendar, StringBuffer stringBuffer) {
        return this.f337412a.j(calendar, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.c
    public String k(long j10) {
        return this.f337412a.k(j10);
    }

    @Override // org.apache.commons.lang3.time.c
    public <B extends Appendable> B l(long j10, B b10) {
        return (B) this.f337412a.l(j10, b10);
    }

    @Deprecated
    protected StringBuffer n(Calendar calendar, StringBuffer stringBuffer) {
        return this.f337412a.p(calendar, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.b
    public Date parse(String str) throws ParseException {
        return this.f337413b.parse(str);
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.b
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f337413b.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.f337412a.a() + "," + this.f337412a.getLocale() + "," + this.f337412a.U().getID() + "]";
    }

    protected f(String str, TimeZone timeZone, Locale locale, Date date) {
        this.f337412a = new h(str, timeZone, locale);
        this.f337413b = new g(str, timeZone, locale, date);
    }
}
