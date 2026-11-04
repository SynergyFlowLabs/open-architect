package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final l f48207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f48208e = 8234;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f48209f = 8235;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f48210g = 8236;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f48211h = 8206;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f48212i = 8207;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f48214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f48215l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f48216m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f48217n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final a f48218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final a f48219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f48220q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f48221r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f48222s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f48225c;

    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f48229f = 1792;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final byte[] f48230g = new byte[f48229f];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f48231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f48232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f48233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f48235e;

        static {
            for (int i10 = 0; i10 < f48229f; i10++) {
                f48230g[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f48231a = charSequence;
            this.f48232b = z10;
            this.f48233c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < f48229f ? f48230g[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f48234d;
            do {
                int i11 = this.f48234d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f48231a;
                int i12 = i11 - 1;
                this.f48234d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f48235e = cCharAt;
                if (cCharAt == '&') {
                    return com.google.common.base.c.f116461n;
                }
            } while (cCharAt != ';');
            this.f48234d = i10;
            this.f48235e = ';';
            return com.google.common.base.c.f116462o;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f48234d;
                if (i10 >= this.f48233c) {
                    break;
                }
                CharSequence charSequence = this.f48231a;
                this.f48234d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f48235e = cCharAt;
            } while (cCharAt != ';');
            return com.google.common.base.c.f116461n;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f48234d;
            while (true) {
                int i11 = this.f48234d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f48231a;
                int i12 = i11 - 1;
                this.f48234d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f48235e = cCharAt2;
                if (cCharAt2 == '<') {
                    return com.google.common.base.c.f116461n;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f48234d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f48231a;
                        int i14 = i13 - 1;
                        this.f48234d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f48235e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f48234d = i10;
            this.f48235e = b0.f313281f;
            return com.google.common.base.c.f116462o;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f48234d;
            while (true) {
                int i11 = this.f48234d;
                if (i11 >= this.f48233c) {
                    this.f48234d = i10;
                    this.f48235e = b0.f313280e;
                    return com.google.common.base.c.f116462o;
                }
                CharSequence charSequence = this.f48231a;
                this.f48234d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f48235e = cCharAt2;
                if (cCharAt2 == '>') {
                    return com.google.common.base.c.f116461n;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f48234d;
                        if (i12 >= this.f48233c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f48231a;
                        this.f48234d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f48235e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f48231a.charAt(this.f48234d - 1);
            this.f48235e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f48231a, this.f48234d);
                this.f48234d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f48234d--;
            byte bC = c(this.f48235e);
            if (this.f48232b) {
                char c10 = this.f48235e;
                if (c10 == '>') {
                    return h();
                }
                if (c10 == ';') {
                    return f();
                }
            }
            return bC;
        }

        byte b() {
            char cCharAt = this.f48231a.charAt(this.f48234d);
            this.f48235e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f48231a, this.f48234d);
                this.f48234d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f48234d++;
            byte bC = c(this.f48235e);
            if (this.f48232b) {
                char c10 = this.f48235e;
                if (c10 == '<') {
                    return i();
                }
                if (c10 == '&') {
                    return g();
                }
            }
            return bC;
        }

        int d() {
            this.f48234d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f48234d < this.f48233c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f48234d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f48234d = this.f48233c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f48234d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        int i12 = 6 << 1;
                        if (bA == 1 || bA == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        l lVar = m.f48270c;
        f48207d = lVar;
        f48213j = Character.toString(f48211h);
        f48214k = Character.toString(f48212i);
        f48218o = new a(false, 2, lVar);
        f48219p = new a(true, 2, lVar);
    }

    a(boolean z10, int i10, l lVar) {
        this.f48223a = z10;
        this.f48224b = i10;
        this.f48225c = lVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0405a().a();
    }

    public static a d(Locale locale) {
        return new C0405a(locale).a();
    }

    public static a e(boolean z10) {
        return new C0405a(z10).a();
    }

    static boolean j(Locale locale) {
        return n.a(locale) == 1;
    }

    private String k(CharSequence charSequence, l lVar) {
        boolean zIsRtl = lVar.isRtl(charSequence, 0, charSequence.length());
        if (this.f48223a || !(zIsRtl || b(charSequence) == 1)) {
            return (!this.f48223a || (zIsRtl && b(charSequence) != -1)) ? "" : f48214k;
        }
        return f48213j;
    }

    private String l(CharSequence charSequence, l lVar) {
        boolean zIsRtl = lVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f48223a && (zIsRtl || a(charSequence) == 1)) {
            return f48213j;
        }
        if (this.f48223a) {
            return (!zIsRtl || a(charSequence) == -1) ? f48214k : "";
        }
        return "";
    }

    public boolean f() {
        if ((this.f48224b & 2) == 0) {
            return false;
        }
        boolean z10 = true | true;
        return true;
    }

    public boolean g(CharSequence charSequence) {
        return this.f48225c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f48223a;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f48225c, true);
    }

    public CharSequence n(CharSequence charSequence, l lVar) {
        return o(charSequence, lVar, true);
    }

    public CharSequence o(CharSequence charSequence, l lVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = lVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z10) {
            spannableStringBuilder.append((CharSequence) l(charSequence, zIsRtl ? m.f48269b : m.f48268a));
        }
        if (zIsRtl != this.f48223a) {
            spannableStringBuilder.append(zIsRtl ? f48209f : f48208e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f48210g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) k(charSequence, zIsRtl ? m.f48269b : m.f48268a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z10) {
        return o(charSequence, this.f48225c, z10);
    }

    public String q(String str) {
        return s(str, this.f48225c, true);
    }

    public String r(String str, l lVar) {
        return s(str, lVar, true);
    }

    public String s(String str, l lVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return o(str, lVar, z10).toString();
    }

    public String t(String str, boolean z10) {
        return s(str, this.f48225c, z10);
    }

    /* JADX INFO: renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0405a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f48226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l f48228c;

        public C0405a() {
            c(a.j(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f48219p : a.f48218o;
        }

        private void c(boolean z10) {
            this.f48226a = z10;
            this.f48228c = a.f48207d;
            this.f48227b = 2;
        }

        public a a() {
            return (this.f48227b == 2 && this.f48228c == a.f48207d) ? b(this.f48226a) : new a(this.f48226a, this.f48227b, this.f48228c);
        }

        public C0405a d(l lVar) {
            this.f48228c = lVar;
            return this;
        }

        public C0405a e(boolean z10) {
            if (z10) {
                this.f48227b |= 2;
                return this;
            }
            this.f48227b &= -3;
            return this;
        }

        public C0405a(boolean z10) {
            c(z10);
        }

        public C0405a(Locale locale) {
            c(a.j(locale));
        }
    }
}
