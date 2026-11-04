package org.commonmark.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f337659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f337660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f337661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f337662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StringBuilder f337663h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f337656a = b.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f337657b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<org.commonmark.node.s> f337658c = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f337664i = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f337665a;

        static {
            int[] iArr = new int[b.values().length];
            f337665a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f337665a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f337665a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f337665a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f337665a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f337665a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private int a(CharSequence charSequence, int i10) {
        int iM = org.commonmark.internal.util.d.m(charSequence, i10, charSequence.length());
        int iA = org.commonmark.internal.util.c.a(charSequence, iM);
        int i11 = 7 & (-1);
        if (iA == -1) {
            return -1;
        }
        this.f337661f = charSequence.charAt(iM) == '<' ? charSequence.subSequence(iM + 1, iA - 1).toString() : charSequence.subSequence(iM, iA).toString();
        int iM2 = org.commonmark.internal.util.d.m(charSequence, iA, charSequence.length());
        if (iM2 >= charSequence.length()) {
            this.f337664i = true;
            this.f337657b.setLength(0);
        } else if (iM2 == iA) {
            return -1;
        }
        this.f337656a = b.START_TITLE;
        return iM2;
    }

    private void b() {
        if (this.f337664i) {
            String strG = org.commonmark.internal.util.a.g(this.f337661f);
            StringBuilder sb2 = this.f337663h;
            this.f337658c.add(new org.commonmark.node.s(this.f337660e, strG, sb2 != null ? org.commonmark.internal.util.a.g(sb2.toString()) : null));
            this.f337659d = null;
            this.f337664i = false;
            this.f337660e = null;
            this.f337661f = null;
            this.f337663h = null;
        }
    }

    private int f(CharSequence charSequence, int i10) {
        int i11;
        int iC = org.commonmark.internal.util.c.c(charSequence, i10);
        if (iC == -1) {
            return -1;
        }
        this.f337659d.append(charSequence, i10, iC);
        if (iC >= charSequence.length()) {
            this.f337659d.append('\n');
            return iC;
        }
        if (charSequence.charAt(iC) != ']' || (i11 = iC + 1) >= charSequence.length() || charSequence.charAt(i11) != ':' || this.f337659d.length() > 999) {
            return -1;
        }
        String strC = org.commonmark.internal.util.a.c(this.f337659d.toString());
        if (strC.isEmpty()) {
            return -1;
        }
        this.f337660e = strC;
        this.f337656a = b.DESTINATION;
        return org.commonmark.internal.util.d.m(charSequence, iC + 2, charSequence.length());
    }

    private int h(CharSequence charSequence, int i10) {
        int iM = org.commonmark.internal.util.d.m(charSequence, i10, charSequence.length());
        if (iM >= charSequence.length() || charSequence.charAt(iM) != '[') {
            return -1;
        }
        this.f337656a = b.LABEL;
        this.f337659d = new StringBuilder();
        int i11 = iM + 1;
        if (i11 >= charSequence.length()) {
            this.f337659d.append('\n');
        }
        return i11;
    }

    private int i(CharSequence charSequence, int i10) {
        int iM = org.commonmark.internal.util.d.m(charSequence, i10, charSequence.length());
        if (iM >= charSequence.length()) {
            this.f337656a = b.START_DEFINITION;
            return iM;
        }
        this.f337662g = (char) 0;
        char cCharAt = charSequence.charAt(iM);
        if (cCharAt == '\"' || cCharAt == '\'') {
            this.f337662g = cCharAt;
        } else if (cCharAt == '(') {
            this.f337662g = ')';
        }
        if (this.f337662g == 0) {
            b();
            this.f337656a = b.START_DEFINITION;
            return iM;
        }
        this.f337656a = b.TITLE;
        this.f337663h = new StringBuilder();
        int i11 = iM + 1;
        if (i11 == charSequence.length()) {
            this.f337663h.append('\n');
        }
        return i11;
    }

    private int j(CharSequence charSequence, int i10) {
        int iE = org.commonmark.internal.util.c.e(charSequence, i10, this.f337662g);
        if (iE == -1) {
            return -1;
        }
        this.f337663h.append(charSequence.subSequence(i10, iE));
        if (iE >= charSequence.length()) {
            this.f337663h.append('\n');
            return iE;
        }
        int iM = org.commonmark.internal.util.d.m(charSequence, iE + 1, charSequence.length());
        if (iM != charSequence.length()) {
            return -1;
        }
        this.f337664i = true;
        b();
        this.f337657b.setLength(0);
        this.f337656a = b.START_DEFINITION;
        return iM;
    }

    List<org.commonmark.node.s> c() {
        b();
        return this.f337658c;
    }

    CharSequence d() {
        return this.f337657b;
    }

    b e() {
        return this.f337656a;
    }

    public void g(CharSequence charSequence) {
        if (this.f337657b.length() != 0) {
            this.f337657b.append('\n');
        }
        this.f337657b.append(charSequence);
        int iH = 0;
        while (iH < charSequence.length()) {
            switch (a.f337665a[this.f337656a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    iH = h(charSequence, iH);
                    break;
                case 3:
                    iH = f(charSequence, iH);
                    break;
                case 4:
                    iH = a(charSequence, iH);
                    break;
                case 5:
                    iH = i(charSequence, iH);
                    break;
                case 6:
                    iH = j(charSequence, iH);
                    break;
            }
            if (iH == -1) {
                this.f337656a = b.PARAGRAPH;
                return;
            }
        }
    }
}
