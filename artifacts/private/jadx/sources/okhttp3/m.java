package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b f334715j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f334716k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f334717l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f334718m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f334719n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f334720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f334721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f334722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f334723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f334724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f334725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f334726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f334727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f334728i;

    @SourceDebugExtension({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f334729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String f334730b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f334732d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f334734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f334735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f334736h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f334737i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f334731c = okhttp3.internal.http.c.f334175a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private String f334733e = "/";

        private final a c(String str, boolean z10) {
            String strE = jk.a.e(str);
            if (strE != null) {
                this.f334732d = strE;
                this.f334737i = z10;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        @NotNull
        public final m a() {
            String str = this.f334729a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f334730b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.f334731c;
            String str3 = this.f334732d;
            if (str3 != null) {
                return new m(str, str2, j10, str3, this.f334733e, this.f334734f, this.f334735g, this.f334736h, this.f334737i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @NotNull
        public final a b(@NotNull String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return c(domain, false);
        }

        @NotNull
        public final a d(long j10) {
            if (j10 <= 0) {
                j10 = Long.MIN_VALUE;
            }
            if (j10 > okhttp3.internal.http.c.f334175a) {
                j10 = 253402300799999L;
            }
            this.f334731c = j10;
            this.f334736h = true;
            return this;
        }

        @NotNull
        public final a e(@NotNull String domain) {
            Intrinsics.checkNotNullParameter(domain, "domain");
            return c(domain, true);
        }

        @NotNull
        public final a f() {
            this.f334735g = true;
            return this;
        }

        @NotNull
        public final a g(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (!Intrinsics.areEqual(StringsKt.E5(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f334729a = name;
            return this;
        }

        @NotNull
        public final a h(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            if (!StringsKt.u2(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.f334733e = path;
            return this;
        }

        @NotNull
        public final a i() {
            this.f334734f = true;
            return this;
        }

        @NotNull
        public final a j(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!Intrinsics.areEqual(StringsKt.E5(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f334730b = value;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int c(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.M1(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !jk.f.k(str);
        }

        private final String h(String str) {
            if (StringsKt.M1(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = jk.a.e(StringsKt.d4(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long i(String str, int i10, int i11) {
            int iC = c(str, i10, i11, false);
            Matcher matcher = m.f334719n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iR3 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iC < i11) {
                int iC2 = c(str, iC + 1, i11, true);
                matcher.region(iC, iC2);
                if (i13 == -1 && matcher.usePattern(m.f334719n).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(m.f334718m).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iR3 == -1 && matcher.usePattern(m.f334717l).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f334717l.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iR3 = StringsKt.r3(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f334716k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iC = c(str, iC2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iR3 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(jk.f.f307488f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iR3 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long j(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").k(str)) {
                    return StringsKt.u2(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(v vVar, String str) {
            String strX = vVar.x();
            if (Intrinsics.areEqual(strX, str)) {
                return true;
            }
            return StringsKt.u2(strX, str, false, 2, null) && (StringsKt.M1(str, "/", false, 2, null) || strX.charAt(str.length()) == '/');
        }

        @oj.n
        @Nullable
        public final m e(@NotNull v url, @NotNull String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return f(System.currentTimeMillis(), url, setCookie);
        }

        @Nullable
        public final m f(long j10, @NotNull v url, @NotNull String setCookie) {
            long j11;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int iU = jk.f.u(setCookie, ';', 0, 0, 6, null);
            int iU2 = jk.f.u(setCookie, '=', 0, iU, 2, null);
            m mVar = null;
            if (iU2 == iU) {
                return null;
            }
            String strM0 = jk.f.m0(setCookie, 0, iU2, 1, null);
            if (strM0.length() == 0 || jk.f.E(strM0) != -1) {
                return null;
            }
            String strL0 = jk.f.l0(setCookie, iU2 + 1, iU);
            if (jk.f.E(strL0) != -1) {
                return null;
            }
            int i10 = iU + 1;
            int length = setCookie.length();
            String strH = null;
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long j12 = -1;
            long jI = okhttp3.internal.http.c.f334175a;
            while (i10 < length) {
                int iS = jk.f.s(setCookie, ';', i10, length);
                int iS2 = jk.f.s(setCookie, '=', i10, iS);
                String strL1 = jk.f.l0(setCookie, i10, iS2);
                String strL2 = iS2 < iS ? jk.f.l0(setCookie, iS2 + 1, iS) : "";
                m mVar2 = mVar;
                if (StringsKt.N1(strL1, "expires", true)) {
                    try {
                        jI = i(strL2, 0, strL2.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.N1(strL1, io.ktor.client.utils.d.f295388b, true)) {
                    j12 = j(strL2);
                    z11 = true;
                } else if (StringsKt.N1(strL1, "domain", true)) {
                    strH = h(strL2);
                    z13 = false;
                } else if (StringsKt.N1(strL1, "path", true)) {
                    str = strL2;
                } else if (StringsKt.N1(strL1, "secure", true)) {
                    z12 = true;
                } else if (StringsKt.N1(strL1, "httponly", true)) {
                    z10 = true;
                }
                i10 = iS + 1;
                mVar = mVar2;
            }
            m mVar3 = mVar;
            if (j12 == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (j12 != -1) {
                long j13 = j10 + (j12 <= 9223372036854775L ? j12 * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j13 < j10 || j13 > okhttp3.internal.http.c.f334175a) ? 253402300799999L : j13;
            } else {
                j11 = jI;
            }
            String strF = url.F();
            if (strH == null) {
                strH = strF;
            } else if (!d(strF, strH)) {
                return mVar3;
            }
            if (strF.length() != strH.length() && PublicSuffixDatabase.f334565e.c().c(strH) == null) {
                return mVar3;
            }
            String strSubstring = "/";
            if (str == null || !StringsKt.u2(str, "/", false, 2, mVar3)) {
                String strX = url.x();
                int iF3 = StringsKt.F3(strX, '/', 0, false, 6, null);
                if (iF3 != 0) {
                    strSubstring = strX.substring(0, iF3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = strSubstring;
            }
            return new m(strM0, strL0, j11, strH, str, z12, z10, z11, z13, null);
        }

        @oj.n
        @NotNull
        public final List<m> g(@NotNull v url, @NotNull u headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listA = headers.A(com.google.common.net.d.F0);
            int size = listA.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                m mVarE = e(url, listA.get(i10));
                if (mVarE != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarE);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<m> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        private b() {
        }
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    @oj.n
    @Nullable
    public static final m t(@NotNull v vVar, @NotNull String str) {
        return f334715j.e(vVar, str);
    }

    @oj.n
    @NotNull
    public static final List<m> u(@NotNull v vVar, @NotNull u uVar) {
        return f334715j.g(vVar, uVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "domain", imports = {}))
    @oj.i(name = "-deprecated_domain")
    @NotNull
    public final String a() {
        return this.f334723d;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "expiresAt", imports = {}))
    @oj.i(name = "-deprecated_expiresAt")
    public final long b() {
        return this.f334722c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostOnly", imports = {}))
    @oj.i(name = "-deprecated_hostOnly")
    public final boolean c() {
        return this.f334728i;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "httpOnly", imports = {}))
    @oj.i(name = "-deprecated_httpOnly")
    public final boolean d() {
        return this.f334726g;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "name", imports = {}))
    @oj.i(name = "-deprecated_name")
    @NotNull
    public final String e() {
        return this.f334720a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (Intrinsics.areEqual(mVar.f334720a, this.f334720a) && Intrinsics.areEqual(mVar.f334721b, this.f334721b) && mVar.f334722c == this.f334722c && Intrinsics.areEqual(mVar.f334723d, this.f334723d) && Intrinsics.areEqual(mVar.f334724e, this.f334724e) && mVar.f334725f == this.f334725f && mVar.f334726g == this.f334726g && mVar.f334727h == this.f334727h && mVar.f334728i == this.f334728i) {
                return true;
            }
        }
        return false;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "path", imports = {}))
    @oj.i(name = "-deprecated_path")
    @NotNull
    public final String f() {
        return this.f334724e;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "persistent", imports = {}))
    @oj.i(name = "-deprecated_persistent")
    public final boolean g() {
        return this.f334727h;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "secure", imports = {}))
    @oj.i(name = "-deprecated_secure")
    public final boolean h() {
        return this.f334725f;
    }

    @zl.a
    public int hashCode() {
        return ((((((((((((((((527 + this.f334720a.hashCode()) * 31) + this.f334721b.hashCode()) * 31) + Long.hashCode(this.f334722c)) * 31) + this.f334723d.hashCode()) * 31) + this.f334724e.hashCode()) * 31) + Boolean.hashCode(this.f334725f)) * 31) + Boolean.hashCode(this.f334726g)) * 31) + Boolean.hashCode(this.f334727h)) * 31) + Boolean.hashCode(this.f334728i);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "value", imports = {}))
    @oj.i(name = "-deprecated_value")
    @NotNull
    public final String i() {
        return this.f334721b;
    }

    @oj.i(name = "domain")
    @NotNull
    public final String n() {
        return this.f334723d;
    }

    @oj.i(name = "expiresAt")
    public final long o() {
        return this.f334722c;
    }

    @oj.i(name = "hostOnly")
    public final boolean p() {
        return this.f334728i;
    }

    @oj.i(name = "httpOnly")
    public final boolean q() {
        return this.f334726g;
    }

    public final boolean r(@NotNull v url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if ((this.f334728i ? Intrinsics.areEqual(url.F(), this.f334723d) : f334715j.d(url.F(), this.f334723d)) && f334715j.k(url, this.f334724e)) {
            return !this.f334725f || url.G();
        }
        return false;
    }

    @oj.i(name = "name")
    @NotNull
    public final String s() {
        return this.f334720a;
    }

    @NotNull
    public String toString() {
        return y(false);
    }

    @oj.i(name = "path")
    @NotNull
    public final String v() {
        return this.f334724e;
    }

    @oj.i(name = "persistent")
    public final boolean w() {
        return this.f334727h;
    }

    @oj.i(name = "secure")
    public final boolean x() {
        return this.f334725f;
    }

    @NotNull
    public final String y(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f334720a);
        sb2.append('=');
        sb2.append(this.f334721b);
        if (this.f334727h) {
            if (this.f334722c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(okhttp3.internal.http.c.b(new Date(this.f334722c)));
            }
        }
        if (!this.f334728i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f334723d);
        }
        sb2.append("; path=");
        sb2.append(this.f334724e);
        if (this.f334725f) {
            sb2.append("; secure");
        }
        if (this.f334726g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @oj.i(name = "value")
    @NotNull
    public final String z() {
        return this.f334721b;
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f334720a = str;
        this.f334721b = str2;
        this.f334722c = j10;
        this.f334723d = str3;
        this.f334724e = str4;
        this.f334725f = z10;
        this.f334726g = z11;
        this.f334727h = z12;
        this.f334728i = z13;
    }
}
