package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class h implements org.apache.commons.lang3.time.c, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f337457f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f337458g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f337459h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f337460i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f337461j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f337462k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ConcurrentMap<i, String> f337463l = new ConcurrentHashMap(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f337464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f337465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Locale f337466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient f[] f337467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f337468e;

    private static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f337469a;

        a(char c10) {
            this.f337469a = c10;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 1;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f337469a);
        }
    }

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f337470a;

        b(d dVar) {
            this.f337470a = dVar;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public void a(Appendable appendable, int i10) throws IOException {
            this.f337470a.a(appendable, i10);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337470a.b();
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i10 = calendar.get(7);
            this.f337470a.a(appendable, i10 != 1 ? i10 - 1 : 7);
        }
    }

    private static class c implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final c f337471b = new c(3);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f337472c = new c(5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f337473d = new c(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f337474a;

        c(int i10) {
            this.f337474a = i10;
        }

        static c d(int i10) {
            if (i10 == 1) {
                return f337471b;
            }
            if (i10 == 2) {
                return f337472c;
            }
            if (i10 == 3) {
                return f337473d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337474a;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i10 = calendar.get(15) + calendar.get(16);
            if (i10 == 0) {
                appendable.append(org.locationtech.jts.io.gml2.a.f338505w);
                return;
            }
            if (i10 < 0) {
                appendable.append(org.apache.commons.codec.language.l.f335457d);
                i10 = -i10;
            } else {
                appendable.append('+');
            }
            int i11 = i10 / 3600000;
            h.m(appendable, i11);
            int i12 = this.f337474a;
            if (i12 < 5) {
                return;
            }
            if (i12 == 6) {
                appendable.append(AbstractJsonLexerKt.COLON);
            }
            h.m(appendable, (i10 / 60000) - (i11 * 60));
        }
    }

    private interface d extends f {
        void a(Appendable appendable, int i10) throws IOException;
    }

    private static class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f337475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f337476b;

        e(int i10, int i11) {
            if (i11 < 3) {
                throw new IllegalArgumentException();
            }
            this.f337475a = i10;
            this.f337476b = i11;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public final void a(Appendable appendable, int i10) throws IOException {
            h.n(appendable, i10, this.f337476b);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337476b;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            a(appendable, calendar.get(this.f337475a));
        }
    }

    private interface f {
        int b();

        void c(Appendable appendable, Calendar calendar) throws IOException;
    }

    private static class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f337477a;

        g(String str) {
            this.f337477a = str;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337477a.length();
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f337477a);
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.lang3.time.h$h, reason: collision with other inner class name */
    private static class C2411h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f337478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f337479b;

        C2411h(int i10, String[] strArr) {
            this.f337478a = i10;
            this.f337479b = strArr;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            int length = this.f337479b.length;
            int i10 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i10;
                }
                int length2 = this.f337479b[length].length();
                if (length2 > i10) {
                    i10 = length2;
                }
            }
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f337479b[calendar.get(this.f337478a)]);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TimeZone f337480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f337481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Locale f337482c;

        i(TimeZone timeZone, boolean z10, int i10, Locale locale) {
            this.f337480a = timeZone;
            if (z10) {
                this.f337481b = Integer.MIN_VALUE | i10;
            } else {
                this.f337481b = i10;
            }
            this.f337482c = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f337480a.equals(iVar.f337480a) && this.f337481b == iVar.f337481b && this.f337482c.equals(iVar.f337482c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f337481b * 31) + this.f337482c.hashCode()) * 31) + this.f337480a.hashCode();
        }
    }

    private static class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Locale f337483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f337484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f337485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f337486d;

        j(TimeZone timeZone, Locale locale, int i10) {
            this.f337483a = locale;
            this.f337484b = i10;
            this.f337485c = h.t(timeZone, false, i10, locale);
            this.f337486d = h.t(timeZone, true, i10, locale);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return Math.max(this.f337485c.length(), this.f337486d.length());
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != 0) {
                appendable.append(h.t(timeZone, true, this.f337484b, this.f337483a));
            } else {
                appendable.append(h.t(timeZone, false, this.f337484b, this.f337483a));
            }
        }
    }

    private static class k implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final k f337487b = new k(true);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final k f337488c = new k(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f337489a;

        k(boolean z10) {
            this.f337489a = z10;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 5;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i10 = calendar.get(15) + calendar.get(16);
            if (i10 < 0) {
                appendable.append(org.apache.commons.codec.language.l.f335457d);
                i10 = -i10;
            } else {
                appendable.append('+');
            }
            int i11 = i10 / 3600000;
            h.m(appendable, i11);
            if (this.f337489a) {
                appendable.append(AbstractJsonLexerKt.COLON);
            }
            h.m(appendable, (i10 / 60000) - (i11 * 60));
        }
    }

    private static class l implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f337490a;

        l(d dVar) {
            this.f337490a = dVar;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public void a(Appendable appendable, int i10) throws IOException {
            this.f337490a.a(appendable, i10);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337490a.b();
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f337490a.a(appendable, leastMaximum);
        }
    }

    private static class m implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f337491a;

        m(d dVar) {
            this.f337491a = dVar;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public void a(Appendable appendable, int i10) throws IOException {
            this.f337491a.a(appendable, i10);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337491a.b();
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f337491a.a(appendable, maximum);
        }
    }

    private static class n implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final n f337492a = new n();

        n() {
        }

        @Override // org.apache.commons.lang3.time.h.d
        public final void a(Appendable appendable, int i10) throws IOException {
            h.m(appendable, i10);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            a(appendable, calendar.get(2) + 1);
        }
    }

    private static class o implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f337493a;

        o(int i10) {
            this.f337493a = i10;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public final void a(Appendable appendable, int i10) throws IOException {
            if (i10 < 100) {
                h.m(appendable, i10);
            } else {
                h.n(appendable, i10, 2);
            }
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            a(appendable, calendar.get(this.f337493a));
        }
    }

    private static class p implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final p f337494a = new p();

        p() {
        }

        @Override // org.apache.commons.lang3.time.h.d
        public final void a(Appendable appendable, int i10) throws IOException {
            h.m(appendable, i10);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            a(appendable, calendar.get(1) % 100);
        }
    }

    private static class q implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f337495a = new q();

        q() {
        }

        @Override // org.apache.commons.lang3.time.h.d
        public final void a(Appendable appendable, int i10) throws IOException {
            if (i10 < 10) {
                appendable.append((char) (i10 + 48));
            } else {
                h.m(appendable, i10);
            }
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            a(appendable, calendar.get(2) + 1);
        }
    }

    private static class r implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f337496a;

        r(int i10) {
            this.f337496a = i10;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public final void a(Appendable appendable, int i10) throws IOException {
            if (i10 < 10) {
                appendable.append((char) (i10 + 48));
            } else if (i10 < 100) {
                h.m(appendable, i10);
            } else {
                h.n(appendable, i10, 1);
            }
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            a(appendable, calendar.get(this.f337496a));
        }
    }

    private static class s implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f337497a;

        s(d dVar) {
            this.f337497a = dVar;
        }

        @Override // org.apache.commons.lang3.time.h.d
        public void a(Appendable appendable, int i10) throws IOException {
            this.f337497a.a(appendable, i10);
        }

        @Override // org.apache.commons.lang3.time.h.f
        public int b() {
            return this.f337497a.b();
        }

        @Override // org.apache.commons.lang3.time.h.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            this.f337497a.a(appendable, calendar.getWeekYear());
        }
    }

    protected h(String str, TimeZone timeZone, Locale locale) {
        this.f337464a = str;
        this.f337465b = timeZone;
        this.f337466c = locale;
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Appendable appendable, int i10) throws IOException {
        appendable.append((char) ((i10 / 10) + 48));
        appendable.append((char) ((i10 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Appendable appendable, int i10, int i11) throws IOException {
        int i12;
        if (i10 >= 10000) {
            char[] cArr = new char[10];
            int i13 = 0;
            while (i10 != 0) {
                cArr[i13] = (char) ((i10 % 10) + 48);
                i10 /= 10;
                i13++;
            }
            while (i13 < i11) {
                appendable.append(org.locationtech.jts.geom.l.f338160j);
                i11--;
            }
            while (true) {
                i13--;
                if (i13 < 0) {
                    break;
                } else {
                    appendable.append(cArr[i13]);
                }
            }
        } else {
            if (i10 >= 1000) {
                i12 = 4;
            } else if (i10 < 100) {
                i12 = i10 < 10 ? 1 : 2;
            } else {
                i12 = 3;
            }
            for (int i14 = i11 - i12; i14 > 0; i14--) {
                appendable.append(org.locationtech.jts.geom.l.f338160j);
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            appendable.append((char) ((i10 / 1000) + 48));
                            i10 %= 1000;
                        }
                    }
                    if (i10 >= 100) {
                        appendable.append((char) ((i10 / 100) + 48));
                        i10 %= 100;
                    } else {
                        appendable.append(org.locationtech.jts.geom.l.f338160j);
                    }
                }
                if (i10 >= 10) {
                    appendable.append((char) ((i10 / 10) + 48));
                    i10 %= 10;
                } else {
                    appendable.append(org.locationtech.jts.geom.l.f338160j);
                }
            }
            appendable.append((char) (i10 + 48));
        }
    }

    private <B extends Appendable> B o(Calendar calendar, B b10) {
        try {
            for (f fVar : this.f337467d) {
                fVar.c(b10, calendar);
            }
            return b10;
        } catch (IOException e10) {
            org.apache.commons.lang3.exception.f.z(e10);
            return b10;
        }
    }

    private String q(Calendar calendar) {
        return ((StringBuilder) o(calendar, new StringBuilder(this.f337468e))).toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        u();
    }

    static String t(TimeZone timeZone, boolean z10, int i10, Locale locale) {
        i iVar = new i(timeZone, z10, i10, locale);
        ConcurrentMap<i, String> concurrentMap = f337463l;
        String str = concurrentMap.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z10, i10, locale);
        String strPutIfAbsent = concurrentMap.putIfAbsent(iVar, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    private void u() {
        List<f> listW = w();
        f[] fVarArr = (f[]) listW.toArray(new f[listW.size()]);
        this.f337467d = fVarArr;
        int length = fVarArr.length;
        int iB = 0;
        int i10 = 4 >> 0;
        while (true) {
            length--;
            if (length < 0) {
                this.f337468e = iB;
                return;
            }
            iB += this.f337467d[length].b();
        }
    }

    private Calendar v() {
        return Calendar.getInstance(this.f337465b, this.f337466c);
    }

    @Override // org.apache.commons.lang3.time.c
    public TimeZone U() {
        return this.f337465b;
    }

    @Override // org.apache.commons.lang3.time.c
    public String a() {
        return this.f337464a;
    }

    @Override // org.apache.commons.lang3.time.c
    public <B extends Appendable> B b(Calendar calendar, B b10) {
        if (!calendar.getTimeZone().equals(this.f337465b)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.f337465b);
        }
        return (B) o(calendar, b10);
    }

    @Override // org.apache.commons.lang3.time.c
    public String d(Date date) {
        Calendar calendarV = v();
        calendarV.setTime(date);
        return q(calendarV);
    }

    @Override // org.apache.commons.lang3.time.c
    public <B extends Appendable> B e(Date date, B b10) {
        Calendar calendarV = v();
        calendarV.setTime(date);
        return (B) o(calendarV, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f337464a.equals(hVar.f337464a) && this.f337465b.equals(hVar.f337465b) && this.f337466c.equals(hVar.f337466c);
    }

    @Override // org.apache.commons.lang3.time.c
    public String f(Calendar calendar) {
        return ((StringBuilder) b(calendar, new StringBuilder(this.f337468e))).toString();
    }

    @Override // org.apache.commons.lang3.time.c
    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return h((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return j((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return g(((Long) obj).longValue(), stringBuffer);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unknown class: ");
        sb2.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // org.apache.commons.lang3.time.c
    public StringBuffer g(long j10, StringBuffer stringBuffer) {
        Calendar calendarV = v();
        calendarV.setTimeInMillis(j10);
        return (StringBuffer) o(calendarV, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.c
    public Locale getLocale() {
        return this.f337466c;
    }

    @Override // org.apache.commons.lang3.time.c
    public StringBuffer h(Date date, StringBuffer stringBuffer) {
        Calendar calendarV = v();
        calendarV.setTime(date);
        return (StringBuffer) o(calendarV, stringBuffer);
    }

    public int hashCode() {
        return this.f337464a.hashCode() + ((this.f337465b.hashCode() + (this.f337466c.hashCode() * 13)) * 13);
    }

    @Override // org.apache.commons.lang3.time.c
    public StringBuffer j(Calendar calendar, StringBuffer stringBuffer) {
        return h(calendar.getTime(), stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.c
    public String k(long j10) {
        Calendar calendarV = v();
        calendarV.setTimeInMillis(j10);
        return q(calendarV);
    }

    @Override // org.apache.commons.lang3.time.c
    public <B extends Appendable> B l(long j10, B b10) {
        Calendar calendarV = v();
        calendarV.setTimeInMillis(j10);
        return (B) o(calendarV, b10);
    }

    @Deprecated
    protected StringBuffer p(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) o(calendar, stringBuffer);
    }

    String r(Object obj) {
        if (obj instanceof Date) {
            return d((Date) obj);
        }
        if (obj instanceof Calendar) {
            return f((Calendar) obj);
        }
        if (obj instanceof Long) {
            return k(((Long) obj).longValue());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unknown class: ");
        sb2.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public int s() {
        return this.f337468e;
    }

    public String toString() {
        return "FastDatePrinter[" + this.f337464a + "," + this.f337466c + "," + this.f337465b.getID() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v39, types: [org.apache.commons.lang3.time.h$h] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5, types: [org.apache.commons.lang3.time.h$d] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [org.apache.commons.lang3.time.h$j] */
    protected List<f> w() {
        int i10;
        int i11;
        ?? sVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.f337466c);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.f337464a.length();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            int[] iArr = {i13};
            String strX = x(this.f337464a, iArr);
            int i14 = iArr[i12];
            int length2 = strX.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = strX.charAt(i12);
            if (cCharAt != 'y') {
                if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case '\'':
                            String strSubstring = strX.substring(1);
                            sVar = strSubstring.length() == 1 ? new a(strSubstring.charAt(0)) : new g(strSubstring);
                            i10 = 0;
                            break;
                        case 'K':
                            sVar = y(10, length2);
                            i10 = 0;
                            break;
                        case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                            if (length2 >= 4) {
                                sVar = new C2411h(2, months);
                            } else if (length2 == 3) {
                                sVar = new C2411h(2, shortMonths);
                            } else {
                                sVar = length2 == 2 ? n.f337492a : q.f337495a;
                            }
                            i10 = 0;
                            break;
                        case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                            sVar = y(14, length2);
                            i10 = 0;
                            break;
                        case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                            sVar = new C2411h(9, amPmStrings);
                            i10 = 0;
                            break;
                        case 'd':
                            sVar = y(5, length2);
                            i10 = 0;
                            break;
                        case 'h':
                            sVar = new l(y(10, length2));
                            i10 = 0;
                            break;
                        case com.planner5d.library.engine.input.f.b.f160745y1 /* 107 */:
                            sVar = new m(y(11, length2));
                            i10 = 0;
                            break;
                        case 'm':
                            sVar = y(12, length2);
                            i10 = 0;
                            break;
                        case 's':
                            sVar = y(13, length2);
                            i10 = 0;
                            break;
                        case me.relex.circleindicator.a.f332619e /* 117 */:
                            sVar = new b(y(7, length2));
                            i10 = 0;
                            break;
                        case 'w':
                            sVar = y(3, length2);
                            i10 = 0;
                            break;
                        default:
                            switch (cCharAt) {
                                case com.planner5d.library.engine.input.f.b.V /* 68 */:
                                    sVar = y(6, length2);
                                    i10 = 0;
                                    break;
                                case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                                    sVar = new C2411h(7, length2 < 4 ? shortWeekdays : weekdays);
                                    i10 = 0;
                                    break;
                                case 'F':
                                    sVar = y(8, length2);
                                    i10 = 0;
                                    break;
                                case 'G':
                                    sVar = new C2411h(0, eras);
                                    i10 = 0;
                                    break;
                                case 'H':
                                    sVar = y(11, length2);
                                    i10 = 0;
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                                            sVar = y(4, length2);
                                            i10 = 0;
                                            break;
                                        case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                                            sVar = c.d(length2);
                                            i10 = 0;
                                            break;
                                        case 'Y':
                                            i11 = 2;
                                            i10 = 0;
                                            break;
                                        case 'Z':
                                            if (length2 == 1) {
                                                sVar = k.f337488c;
                                            } else {
                                                sVar = length2 == 2 ? c.f337473d : k.f337487b;
                                            }
                                            i10 = 0;
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + strX);
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (length2 >= 4) {
                    sVar = new j(this.f337465b, this.f337466c, 1);
                    i10 = 0;
                } else {
                    i10 = 0;
                    sVar = new j(this.f337465b, this.f337466c, 0);
                }
                arrayList.add(sVar);
                i13 = i14 + 1;
                i12 = i10;
            } else {
                i10 = 0;
                i11 = 2;
            }
            if (length2 == i11) {
                sVar = p.f337494a;
            } else {
                if (length2 < 4) {
                    length2 = 4;
                }
                sVar = y(1, length2);
            }
            if (cCharAt == 'Y') {
                sVar = new s(sVar);
            }
            arrayList.add(sVar);
            i13 = i14 + 1;
            i12 = i10;
        }
        return arrayList;
    }

    protected String x(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i10);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb2.append('\'');
            boolean z10 = false;
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '\'') {
                    if (!z10 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i10--;
                        break;
                    }
                    sb2.append(cCharAt2);
                } else {
                    int i11 = i10 + 1;
                    if (i11 >= length || str.charAt(i11) != '\'') {
                        z10 = !z10;
                    } else {
                        sb2.append(cCharAt2);
                        i10 = i11;
                    }
                }
                i10++;
            }
        } else {
            sb2.append(cCharAt);
            while (true) {
                int i12 = i10 + 1;
                if (i12 >= length || str.charAt(i12) != cCharAt) {
                    break;
                }
                sb2.append(cCharAt);
                i10 = i12;
            }
        }
        iArr[0] = i10;
        return sb2.toString();
    }

    protected d y(int i10, int i11) {
        if (i11 != 1) {
            return i11 != 2 ? new e(i10, i11) : new o(i10);
        }
        return new r(i10);
    }
}
