package org.threeten.bp.format;

import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes14.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f340161e = new i(org.locationtech.jts.geom.l.f338160j, '+', org.apache.commons.codec.language.l.f335457d, '.');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap<Locale, i> f340162f = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f340163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f340164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f340165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f340166d;

    private i(char c10, char c11, char c12, char c13) {
        this.f340163a = c10;
        this.f340164b = c11;
        this.f340165c = c12;
        this.f340166d = c13;
    }

    private static i c(Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        return (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? f340161e : new i(zeroDigit, '+', minusSign, decimalSeparator);
    }

    public static Set<Locale> d() {
        return new HashSet(Arrays.asList(DecimalFormatSymbols.getAvailableLocales()));
    }

    public static i i(Locale locale) {
        cn.d.j(locale, "locale");
        ConcurrentMap<Locale, i> concurrentMap = f340162f;
        i iVar = concurrentMap.get(locale);
        if (iVar != null) {
            return iVar;
        }
        concurrentMap.putIfAbsent(locale, c(locale));
        return concurrentMap.get(locale);
    }

    public static i j() {
        return i(Locale.getDefault());
    }

    String a(String str) {
        char c10 = this.f340163a;
        if (c10 == '0') {
            return str;
        }
        int i10 = c10 - org.locationtech.jts.geom.l.f338160j;
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            charArray[i11] = (char) (charArray[i11] + i10);
        }
        return new String(charArray);
    }

    int b(char c10) {
        int i10 = c10 - this.f340163a;
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public char e() {
        return this.f340166d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f340163a == iVar.f340163a && this.f340164b == iVar.f340164b && this.f340165c == iVar.f340165c && this.f340166d == iVar.f340166d) {
                return true;
            }
        }
        return false;
    }

    public char f() {
        return this.f340165c;
    }

    public char g() {
        return this.f340164b;
    }

    public char h() {
        return this.f340163a;
    }

    public int hashCode() {
        return this.f340163a + this.f340164b + this.f340165c + this.f340166d;
    }

    public i k(char c10) {
        return c10 == this.f340166d ? this : new i(this.f340163a, this.f340164b, this.f340165c, c10);
    }

    public i l(char c10) {
        return c10 == this.f340165c ? this : new i(this.f340163a, this.f340164b, c10, this.f340166d);
    }

    public i m(char c10) {
        return c10 == this.f340164b ? this : new i(this.f340163a, c10, this.f340165c, this.f340166d);
    }

    public i n(char c10) {
        return c10 == this.f340163a ? this : new i(c10, this.f340164b, this.f340165c, this.f340166d);
    }

    public String toString() {
        return "DecimalStyle[" + this.f340163a + this.f340164b + this.f340165c + this.f340166d + "]";
    }
}
