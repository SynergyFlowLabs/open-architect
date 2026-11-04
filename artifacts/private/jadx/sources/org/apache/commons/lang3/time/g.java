package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class g implements org.apache.commons.lang3.time.b, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f337414g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f337430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f337431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Locale f337432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f337433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f337434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient List<m> f337435f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final Locale f337415h = new Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<String> f337416i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ConcurrentMap<Locale, l>[] f337417j = new ConcurrentMap[17];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l f337418k = new b(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final l f337419l = new c(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final l f337420m = new j(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final l f337421n = new j(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final l f337422o = new j(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final l f337426s = new j(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final l f337427t = new j(5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final l f337428v = new d(7);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final l f337429w = new j(8);
    private static final l X = new j(11);
    private static final l Y = new e(11);
    private static final l Z = new f(10);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final l f337423p0 = new j(10);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final l f337424p1 = new j(12);
    private static final l H1 = new j(13);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final l f337425p2 = new j(14);

    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    static class b extends j {
        b(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.lang3.time.g.j
        int c(g gVar, int i10) {
            return i10 < 100 ? gVar.k(i10) : i10;
        }
    }

    static class c extends j {
        c(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.lang3.time.g.j
        int c(g gVar, int i10) {
            return i10 - 1;
        }
    }

    static class d extends j {
        d(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.lang3.time.g.j
        int c(g gVar, int i10) {
            if (i10 != 7) {
                return i10 + 1;
            }
            return 1;
        }
    }

    static class e extends j {
        e(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.lang3.time.g.j
        int c(g gVar, int i10) {
            if (i10 == 24) {
                return 0;
            }
            return i10;
        }
    }

    static class f extends j {
        f(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.lang3.time.g.j
        int c(g gVar, int i10) {
            if (i10 == 12) {
                return 0;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.lang3.time.g$g, reason: collision with other inner class name */
    private static class C2410g extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f337436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Locale f337437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f337438d;

        C2410g(int i10, Calendar calendar, Locale locale) {
            super(null);
            this.f337436b = i10;
            this.f337437c = locale;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("((?iu)");
            this.f337438d = g.l(calendar, locale, i10, sb2);
            sb2.setLength(sb2.length() - 1);
            sb2.append(")");
            d(sb2);
        }

        @Override // org.apache.commons.lang3.time.g.k
        void e(g gVar, Calendar calendar, String str) {
            calendar.set(this.f337436b, this.f337438d.get(str.toLowerCase(this.f337437c)).intValue());
        }
    }

    private static class h extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f337439a;

        h(String str) {
            super(null);
            this.f337439a = str;
        }

        @Override // org.apache.commons.lang3.time.g.l
        boolean a() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.g.l
        boolean b(g gVar, Calendar calendar, String str, ParsePosition parsePosition, int i10) {
            for (int i11 = 0; i11 < this.f337439a.length(); i11++) {
                int index = parsePosition.getIndex() + i11;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.f337439a.charAt(i11) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.f337439a.length() + parsePosition.getIndex());
            return true;
        }
    }

    private static class i extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final l f337440b = new i("(Z|(?:[+-]\\d{2}))");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final l f337441c = new i("(Z|(?:[+-]\\d{2}\\d{2}))");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final l f337442d = new i("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        i(String str) {
            super(null);
            c(str);
        }

        static l g(int i10) {
            if (i10 == 1) {
                return f337440b;
            }
            if (i10 == 2) {
                return f337441c;
            }
            if (i10 == 3) {
                return f337442d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // org.apache.commons.lang3.time.g.k
        void e(g gVar, Calendar calendar, String str) {
            calendar.setTimeZone(org.apache.commons.lang3.time.i.b(str));
        }
    }

    private static class j extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f337443a;

        j(int i10) {
            super(null);
            this.f337443a = i10;
        }

        @Override // org.apache.commons.lang3.time.g.l
        boolean a() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.g.l
        boolean b(g gVar, Calendar calendar, String str, ParsePosition parsePosition, int i10) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i10 == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i11 = i10 + index;
                if (length > i11) {
                    length = i11;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int i12 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f337443a, c(gVar, i12));
            return true;
        }

        int c(g gVar, int i10) {
            return i10;
        }
    }

    private static abstract class k extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Pattern f337444a;

        private k() {
            super(null);
        }

        @Override // org.apache.commons.lang3.time.g.l
        boolean a() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.g.l
        boolean b(g gVar, Calendar calendar, String str, ParsePosition parsePosition, int i10) {
            Matcher matcher = this.f337444a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            e(gVar, calendar, matcher.group(1));
            return true;
        }

        void c(String str) {
            this.f337444a = Pattern.compile(str);
        }

        void d(StringBuilder sb2) {
            c(sb2.toString());
        }

        abstract void e(g gVar, Calendar calendar, String str);

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    private static abstract class l {
        private l() {
        }

        boolean a() {
            return false;
        }

        abstract boolean b(g gVar, Calendar calendar, String str, ParsePosition parsePosition, int i10);

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    private static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final l f337445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f337446b;

        m(l lVar, int i10) {
            this.f337445a = lVar;
            this.f337446b = i10;
        }

        int a(ListIterator<m> listIterator) {
            if (this.f337445a.a() && listIterator.hasNext()) {
                l lVar = listIterator.next().f337445a;
                listIterator.previous();
                if (lVar.a()) {
                    return this.f337446b;
                }
            }
            return 0;
        }
    }

    private class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f337447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f337448b;

        n(Calendar calendar) {
            this.f337447a = calendar;
        }

        private m b(char c10) {
            int i10 = this.f337448b;
            do {
                int i11 = this.f337448b + 1;
                this.f337448b = i11;
                if (i11 >= g.this.f337430a.length()) {
                    break;
                }
            } while (g.this.f337430a.charAt(this.f337448b) == c10);
            int i12 = this.f337448b - i10;
            return new m(g.this.o(c10, i12, this.f337447a), i12);
        }

        private m c() {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            while (this.f337448b < g.this.f337430a.length()) {
                char cCharAt = g.this.f337430a.charAt(this.f337448b);
                if (!z10 && g.q(cCharAt)) {
                    break;
                }
                if (cCharAt == '\'') {
                    int i10 = this.f337448b + 1;
                    this.f337448b = i10;
                    if (i10 == g.this.f337430a.length() || g.this.f337430a.charAt(this.f337448b) != '\'') {
                        z10 = !z10;
                    }
                }
                this.f337448b++;
                sb2.append(cCharAt);
            }
            if (z10) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String string = sb2.toString();
            return new m(new h(string), string.length());
        }

        m a() {
            if (this.f337448b >= g.this.f337430a.length()) {
                return null;
            }
            char cCharAt = g.this.f337430a.charAt(this.f337448b);
            return g.q(cCharAt) ? b(cCharAt) : c();
        }
    }

    static class o extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f337450d = "[+-]\\d{4}";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f337451e = "GMT[+-]\\d{1,2}:\\d{2}";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f337452f = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Locale f337453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, a> f337454c;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            TimeZone f337455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f337456b;

            a(TimeZone timeZone, boolean z10) {
                this.f337455a = timeZone;
                this.f337456b = z10 ? timeZone.getDSTSavings() : 0;
            }
        }

        o(Locale locale) {
            super(null);
            this.f337454c = new HashMap();
            this.f337453b = locale;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(g.f337416i);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase(org.apache.commons.lang3.time.m.f337525a)) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i10 = 1; i10 < strArr.length; i10++) {
                        if (i10 == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i10 == 5) {
                            aVar2 = aVar;
                        }
                        String str2 = strArr[i10];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.f337454c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str3 : treeSet) {
                sb2.append('|');
                g.r(sb2, str3);
            }
            sb2.append(")");
            d(sb2);
        }

        @Override // org.apache.commons.lang3.time.g.k
        void e(g gVar, Calendar calendar, String str) {
            TimeZone timeZoneB = org.apache.commons.lang3.time.i.b(str);
            if (timeZoneB != null) {
                calendar.setTimeZone(timeZoneB);
                return;
            }
            a aVar = this.f337454c.get(str.toLowerCase(this.f337453b));
            calendar.set(16, aVar.f337456b);
            calendar.set(15, aVar.f337455a.getRawOffset());
        }
    }

    protected g(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(int i10) {
        int i11 = this.f337433d + i10;
        return i10 >= this.f337434e ? i11 : i11 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> l(Calendar calendar, Locale locale, int i10, StringBuilder sb2) {
        HashMap map = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i10, 0, locale);
        TreeSet treeSet = new TreeSet(f337416i);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            r(sb2, (String) it.next()).append('|');
        }
        return map;
    }

    private static ConcurrentMap<Locale, l> m(int i10) {
        ConcurrentMap<Locale, l> concurrentMap;
        ConcurrentMap<Locale, l>[] concurrentMapArr = f337417j;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i10] == null) {
                    concurrentMapArr[i10] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i10];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return concurrentMap;
    }

    private l n(int i10, Calendar calendar) {
        ConcurrentMap<Locale, l> concurrentMapM = m(i10);
        l lVar = concurrentMapM.get(this.f337432c);
        if (lVar != null) {
            return lVar;
        }
        l oVar = i10 == 15 ? new o(this.f337432c) : new C2410g(i10, calendar, this.f337432c);
        l lVarPutIfAbsent = concurrentMapM.putIfAbsent(this.f337432c, oVar);
        return lVarPutIfAbsent != null ? lVarPutIfAbsent : oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l o(char c10, int i10, Calendar calendar) {
        if (c10 != 'y') {
            if (c10 != 'z') {
                switch (c10) {
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        return f337426s;
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        return n(7, calendar);
                    case 'F':
                        return f337429w;
                    case 'G':
                        return n(0, calendar);
                    case 'H':
                        return X;
                    default:
                        switch (c10) {
                            case 'K':
                                return f337423p0;
                            case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                                return i10 >= 3 ? n(2, calendar) : f337419l;
                            case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                                return f337425p2;
                            case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                                return n(9, calendar);
                            case 'd':
                                return f337427t;
                            case 'h':
                                return Z;
                            case com.planner5d.library.engine.input.f.b.f160745y1 /* 107 */:
                                return Y;
                            case 'm':
                                return f337424p1;
                            case 's':
                                return H1;
                            case me.relex.circleindicator.a.f332619e /* 117 */:
                                return f337428v;
                            case 'w':
                                return f337421n;
                            default:
                                switch (c10) {
                                    case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                                        return f337422o;
                                    case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                                        return i.g(i10);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i10 == 2) {
                                            return i.f337442d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c10 + "' not supported");
                                }
                                break;
                        }
                        break;
                }
            }
            return n(15, calendar);
        }
        return i10 > 2 ? f337420m : f337418k;
    }

    private void p(Calendar calendar) {
        this.f337435f = new ArrayList();
        n nVar = new n(calendar);
        while (true) {
            m mVarA = nVar.a();
            if (mVarA == null) {
                return;
            } else {
                this.f337435f.add(mVarA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(char c10) {
        return (c10 >= 'A' && c10 <= 'Z') || (c10 >= 'a' && c10 <= 'z');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    public static StringBuilder r(StringBuilder sb2, String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '$' && cCharAt != '.' && cCharAt != '?' && cCharAt != '^' && cCharAt != '[' && cCharAt != '\\' && cCharAt != '{' && cCharAt != '|') {
                switch (cCharAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        sb2.append('\\');
                        break;
                }
            } else {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        return sb2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        p(Calendar.getInstance(this.f337431b, this.f337432c));
    }

    @Override // org.apache.commons.lang3.time.b, org.apache.commons.lang3.time.c
    public TimeZone U() {
        return this.f337431b;
    }

    @Override // org.apache.commons.lang3.time.b, org.apache.commons.lang3.time.c
    public String a() {
        return this.f337430a;
    }

    @Override // org.apache.commons.lang3.time.b
    public Date c(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.f337431b, this.f337432c);
        calendar.clear();
        if (i(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f337430a.equals(gVar.f337430a) && this.f337431b.equals(gVar.f337431b) && this.f337432c.equals(gVar.f337432c);
    }

    @Override // org.apache.commons.lang3.time.b, org.apache.commons.lang3.time.c
    public Locale getLocale() {
        return this.f337432c;
    }

    public int hashCode() {
        return this.f337430a.hashCode() + ((this.f337431b.hashCode() + (this.f337432c.hashCode() * 13)) * 13);
    }

    @Override // org.apache.commons.lang3.time.b
    public boolean i(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<m> listIterator = this.f337435f.listIterator();
        while (listIterator.hasNext()) {
            m next = listIterator.next();
            g gVar = this;
            String str2 = str;
            ParsePosition parsePosition2 = parsePosition;
            Calendar calendar2 = calendar;
            if (!next.f337445a.b(gVar, calendar2, str2, parsePosition2, next.a(listIterator))) {
                return false;
            }
            this = gVar;
            calendar = calendar2;
            str = str2;
            parsePosition = parsePosition2;
        }
        return true;
    }

    @Override // org.apache.commons.lang3.time.b
    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateC = c(str, parsePosition);
        if (dateC != null) {
            return dateC;
        }
        if (!this.f337432c.equals(f337415h)) {
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + this.f337432c + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    @Override // org.apache.commons.lang3.time.b
    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.f337430a + "," + this.f337432c + "," + this.f337431b.getID() + "]";
    }

    protected g(String str, TimeZone timeZone, Locale locale, Date date) {
        int i10;
        this.f337430a = str;
        this.f337431b = timeZone;
        this.f337432c = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i10 = calendar.get(1);
        } else if (locale.equals(f337415h)) {
            i10 = 0;
        } else {
            calendar.setTime(new Date());
            i10 = calendar.get(1) - 80;
        }
        int i11 = (i10 / 100) * 100;
        this.f337433d = i11;
        this.f337434e = i10 - i11;
        p(calendar);
    }

    @Override // org.apache.commons.lang3.time.b
    public Object parseObject(String str, ParsePosition parsePosition) {
        return c(str, parsePosition);
    }
}
