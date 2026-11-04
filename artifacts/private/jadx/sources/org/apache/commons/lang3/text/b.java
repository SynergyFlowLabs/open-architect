package org.apache.commons.lang3.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.s;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class b extends MessageFormat {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f337277c = -2362048321261811743L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f337278d = 31;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f337279e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f337280f = ',';

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f337281g = '}';

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f337282h = '{';

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f337283i = '\'';

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f337284j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f337285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, ? extends c> f337286b;

    public b(String str) {
        this(str, Locale.getDefault());
    }

    private StringBuilder a(String str, ParsePosition parsePosition, StringBuilder sb2) {
        if (sb2 != null) {
            sb2.append(f337283i);
        }
        f(parsePosition);
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        for (int index2 = parsePosition.getIndex(); index2 < str.length(); index2++) {
            if (charArray[parsePosition.getIndex()] == '\'') {
                f(parsePosition);
                if (sb2 == null) {
                    return null;
                }
                sb2.append(charArray, index, parsePosition.getIndex() - index);
                return sb2;
            }
            f(parsePosition);
        }
        throw new IllegalArgumentException("Unterminated quoted string at position " + index);
    }

    private boolean b(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private Format c(String str) {
        String strTrim;
        if (this.f337286b != null) {
            int iIndexOf = str.indexOf(44);
            if (iIndexOf > 0) {
                String strTrim2 = str.substring(0, iIndexOf).trim();
                strTrim = str.substring(iIndexOf + 1).trim();
                str = strTrim2;
            } else {
                strTrim = null;
            }
            c cVar = this.f337286b.get(str);
            if (cVar != null) {
                return cVar.a(str, strTrim, getLocale());
            }
        }
        return null;
    }

    private void d(String str, ParsePosition parsePosition) {
        a(str, parsePosition, null);
    }

    private String e(String str, ArrayList<String> arrayList) {
        String str2;
        if (!b(arrayList)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() * 2);
        int i10 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        int i11 = -1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                a(str, parsePosition, sb2);
            } else if (cCharAt != '{') {
                if (cCharAt == '}') {
                    i10--;
                }
                sb2.append(cCharAt);
                f(parsePosition);
            } else {
                i10++;
                sb2.append('{');
                sb2.append(h(str, f(parsePosition)));
                if (i10 == 1 && (str2 = arrayList.get((i11 = i11 + 1))) != null) {
                    sb2.append(',');
                    sb2.append(str2);
                }
            }
        }
        return sb2.toString();
    }

    private ParsePosition f(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private String g(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        i(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i10 = 1;
        while (parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (cCharAt == '\'') {
                d(str, parsePosition);
            } else if (cCharAt == '{') {
                i10++;
            } else if (cCharAt == '}' && (i10 = i10 - 1) == 0) {
                return str.substring(index2, parsePosition.getIndex());
            }
            f(parsePosition);
        }
        throw new IllegalArgumentException("Unterminated format element at position " + index);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048 A[PHI: r2
      0x0048: PHI (r2v7 char) = (r2v6 char), (r2v12 char), (r2v12 char) binds: [B:8:0x0031, B:10:0x0041, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    private int h(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        i(str, parsePosition);
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (!z10 && parsePosition.getIndex() < str.length()) {
            char cCharAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(cCharAt)) {
                this.i(str, parsePosition);
                cCharAt = str.charAt(parsePosition.getIndex());
                if (cCharAt == ',' || cCharAt == '}') {
                    if ((cCharAt != ',' || cCharAt == '}') && sb2.length() > 0) {
                    }
                    boolean z11 = !Character.isDigit(cCharAt);
                    sb2.append(cCharAt);
                    z10 = z11;
                } else {
                    z10 = true;
                }
            } else {
                return cCharAt != ',' ? Integer.parseInt(sb2.toString()) : Integer.parseInt(sb2.toString());
                boolean z12 = !Character.isDigit(cCharAt);
                sb2.append(cCharAt);
                z10 = z12;
            }
            this.f(parsePosition);
        }
        if (!z10) {
            throw new IllegalArgumentException("Unterminated format element at position " + index);
        }
        throw new IllegalArgumentException("Invalid format argument index at position " + index + ": " + str.substring(index, parsePosition.getIndex()));
    }

    private void i(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int iF = g.l().f(charArray, parsePosition.getIndex());
            parsePosition.setIndex(parsePosition.getIndex() + iF);
            if (iF <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String strG;
        Format formatC;
        if (this.f337286b == null) {
            super.applyPattern(str);
            this.f337285a = super.toPattern();
            return;
        }
        ArrayList<Format> arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        StringBuilder sb2 = new StringBuilder(str.length());
        int i10 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i11 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c10 = charArray[parsePosition.getIndex()];
            if (c10 != '\'') {
                if (c10 == '{') {
                    i11++;
                    i(str, parsePosition);
                    int index = parsePosition.getIndex();
                    int iH = h(str, f(parsePosition));
                    sb2.append('{');
                    sb2.append(iH);
                    i(str, parsePosition);
                    String str2 = null;
                    if (charArray[parsePosition.getIndex()] == ',') {
                        strG = g(str, f(parsePosition));
                        formatC = c(strG);
                        if (formatC == null) {
                            sb2.append(',');
                            sb2.append(strG);
                        }
                    } else {
                        strG = null;
                        formatC = null;
                    }
                    arrayList.add(formatC);
                    if (formatC != null) {
                        str2 = strG;
                    }
                    arrayList2.add(str2);
                    boolean z10 = true;
                    c0.s(arrayList.size() == i11);
                    if (arrayList2.size() != i11) {
                        z10 = false;
                    }
                    c0.s(z10);
                    if (charArray[parsePosition.getIndex()] != '}') {
                        throw new IllegalArgumentException("Unreadable format element at position " + index);
                    }
                }
                sb2.append(charArray[parsePosition.getIndex()]);
                f(parsePosition);
            } else {
                a(str, parsePosition, sb2);
            }
        }
        super.applyPattern(sb2.toString());
        this.f337285a = e(super.toPattern(), arrayList2);
        if (b(arrayList)) {
            Format[] formats = getFormats();
            for (Format format : arrayList) {
                if (format != null) {
                    formats[i10] = format;
                }
                i10++;
            }
            super.setFormats(formats);
        }
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !super.equals(obj) || s.G(getClass(), obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (s.G(this.f337285a, bVar.f337285a)) {
            return false;
        }
        return !s.G(this.f337286b, bVar.f337286b);
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return (((super.hashCode() * 31) + Objects.hashCode(this.f337286b)) * 31) + Objects.hashCode(this.f337285a);
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i10, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i10, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormats(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public String toPattern() {
        return this.f337285a;
    }

    public b(String str, Locale locale) {
        this(str, locale, null);
    }

    public b(String str, Map<String, ? extends c> map) {
        this(str, Locale.getDefault(), map);
    }

    public b(String str, Locale locale, Map<String, ? extends c> map) {
        super("");
        setLocale(locale);
        this.f337286b = map;
        applyPattern(str);
    }
}
