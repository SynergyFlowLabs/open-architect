package okhttp3;

import com.superwall.sdk.network.Api;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b f334772k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final char[] f334773l = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', org.locationtech.jts.geom.l.f338157g};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f334774m = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f334775n = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f334776o = " \"<>^`{}|/\\?#";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f334777p = "[]";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f334778q = " \"'<>#";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f334779r = " \"'<>#&=";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f334780s = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f334781t = "\\^`{|}";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f334782u = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f334783v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f334784w = " \"#<>\\^`{|}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f334785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f334786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f334787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f334788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f334789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<String> f334790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final List<String> f334791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f334792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f334793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f334794j;

    @SourceDebugExtension({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final C2378a f334795i = new C2378a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final String f334796j = "Invalid URL host";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private String f334797a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private String f334800d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f334802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private List<String> f334803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private String f334804h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f334798b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private String f334799c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f334801e = -1;

        /* JADX INFO: renamed from: okhttp3.v$a$a, reason: collision with other inner class name */
        public static final class C2378a {
            public /* synthetic */ C2378a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int i12 = Integer.parseInt(b.f(v.f334772k, str, i10, i11, "", false, false, false, false, null, com.planner5d.library.engine.input.f.b.R1, null));
                    if (1 > i12 || i12 >= 65536) {
                        return -1;
                    }
                    return i12;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((Intrinsics.compare((int) cCharAt, 97) >= 0 && Intrinsics.compare((int) cCharAt, 122) <= 0) || (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                    while (true) {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.'))) {
                            if (cCharAt2 == ':') {
                                return i10;
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private C2378a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f334802f = arrayList;
            arrayList.add("");
        }

        private final void C() {
            List<String> list = this.f334802f;
            if (list.remove(list.size() - 1).length() != 0 || this.f334802f.isEmpty()) {
                this.f334802f.add("");
            } else {
                List<String> list2 = this.f334802f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void E(String str, int i10, int i11, boolean z10, boolean z11) {
            String strF = b.f(v.f334772k, str, i10, i11, v.f334776o, z11, false, false, false, null, 240, null);
            if (y(strF)) {
                return;
            }
            if (z(strF)) {
                C();
                return;
            }
            List<String> list = this.f334802f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f334802f;
                list2.set(list2.size() - 1, strF);
            } else {
                this.f334802f.add(strF);
            }
            if (z10) {
                this.f334802f.add("");
            }
        }

        private final void H(String str) {
            List<String> list = this.f334803g;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int iC = kotlin.internal.n.c(size, 0, -2);
            if (iC <= size) {
                while (true) {
                    List<String> list2 = this.f334803g;
                    Intrinsics.checkNotNull(list2);
                    if (Intrinsics.areEqual(str, list2.get(size))) {
                        List<String> list3 = this.f334803g;
                        Intrinsics.checkNotNull(list3);
                        list3.remove(size + 1);
                        List<String> list4 = this.f334803g;
                        Intrinsics.checkNotNull(list4);
                        list4.remove(size);
                        List<String> list5 = this.f334803g;
                        Intrinsics.checkNotNull(list5);
                        if (list5.isEmpty()) {
                            this.f334803g = null;
                            return;
                        }
                    }
                    if (size != iC) {
                        size -= 2;
                    }
                }
            }
        }

        private final void L(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f334802f.clear();
                this.f334802f.add("");
                i10++;
            } else {
                List<String> list = this.f334802f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iT = jk.f.t(str, "/\\", i12, i11);
                boolean z10 = iT < i11;
                this = this;
                str = str;
                this.E(str, i12, iT, z10, true);
                i12 = z10 ? iT + 1 : iT;
            }
        }

        private final a f(String str, boolean z10) {
            int i10 = 0;
            while (true) {
                int iT = jk.f.t(str, "/\\", i10, str.length());
                this.E(str, i10, iT, iT < str.length(), z10);
                i10 = iT + 1;
                if (i10 > str.length()) {
                    return this;
                }
                this = this;
                str = str;
                z10 = z10;
            }
        }

        private final int i() {
            int i10 = this.f334801e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = v.f334772k;
            String str = this.f334797a;
            Intrinsics.checkNotNull(str);
            return bVar.g(str);
        }

        private final boolean y(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.N1(str, "%2e", true);
        }

        private final boolean z(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.N1(str, "%2e.", true) || StringsKt.N1(str, ".%2e", true) || StringsKt.N1(str, "%2e%2e", true);
        }

        @NotNull
        public final a A(@Nullable v vVar, @NotNull String str) {
            String str2;
            int iT;
            int i10;
            boolean z10;
            int i11;
            int i12;
            int i13;
            char c10;
            int i14;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iG = jk.f.G(input, 0, 0, 3, null);
            int I = jk.f.I(input, iG, 0, 2, null);
            C2378a c2378a = f334795i;
            int iG2 = c2378a.g(input, iG, I);
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z11 = true;
            int i15 = -1;
            if (iG2 != -1) {
                if (StringsKt.r2(input, "https:", iG, true)) {
                    this.f334797a = Api.scheme;
                    iG += 6;
                } else {
                    if (!StringsKt.r2(input, "http:", iG, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f334797a = "http";
                    iG += 5;
                }
            } else {
                if (vVar == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.X8(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f334797a = vVar.X();
            }
            int iH = c2378a.h(input, iG, I);
            int i16 = 63;
            int i17 = 35;
            if (iH >= 2 || vVar == null || !Intrinsics.areEqual(vVar.X(), this.f334797a)) {
                int i18 = iG + iH;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    iT = jk.f.t(input, "@/\\?#", i18, I);
                    int iCharAt = iT != I ? input.charAt(iT) : i15;
                    if (iCharAt == i15 || iCharAt == i17 || iCharAt == 47 || iCharAt == 92 || iCharAt == i16) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z12) {
                            z10 = z11;
                            i11 = i15;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f334799c);
                            sb3.append("%40");
                            input = str;
                            i12 = iT;
                            sb3.append(b.f(v.f334772k, input, i18, iT, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f334799c = sb3.toString();
                        } else {
                            int iS = jk.f.s(input, AbstractJsonLexerKt.COLON, i18, iT);
                            b bVar = v.f334772k;
                            i11 = i15;
                            z10 = z11;
                            String strF = b.f(bVar, input, i18, iS, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strF = this.f334798b + "%40" + strF;
                            }
                            this.f334798b = strF;
                            if (iS != iT) {
                                i13 = iT;
                                this.f334799c = b.f(bVar, str, iS + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i13 = iT;
                            }
                            input = str;
                            i12 = i13;
                            z13 = z10;
                        }
                        i18 = i12 + 1;
                        i15 = i11;
                        I = I;
                        str3 = str3;
                        z11 = z10;
                        i16 = 63;
                        i17 = 35;
                    }
                }
                i10 = I;
                String str4 = str3;
                int i19 = i15;
                C2378a c2378a2 = f334795i;
                int iF = c2378a2.f(input, i18, iT);
                int i20 = iF + 1;
                if (i20 < iT) {
                    this.f334800d = jk.a.e(b.n(v.f334772k, input, i18, iF, false, 4, null));
                    int iE = c2378a2.e(input, i20, iT);
                    this.f334801e = iE;
                    if (iE == i19) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i20, iT);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str4);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    b bVar2 = v.f334772k;
                    this.f334800d = jk.a.e(b.n(bVar2, input, i18, iF, false, 4, null));
                    String str5 = this.f334797a;
                    Intrinsics.checkNotNull(str5);
                    this.f334801e = bVar2.g(str5);
                }
                if (this.f334800d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i18, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str4);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iG = iT;
            } else {
                this.f334798b = vVar.A();
                this.f334799c = vVar.w();
                this.f334800d = vVar.F();
                this.f334801e = vVar.N();
                this.f334802f.clear();
                this.f334802f.addAll(vVar.y());
                if (iG == I || input.charAt(iG) == '#') {
                    m(vVar.z());
                }
                i10 = I;
            }
            int i21 = i10;
            int iT2 = jk.f.t(input, "?#", iG, i21);
            L(input, iG, iT2);
            if (iT2 >= i21 || input.charAt(iT2) != '?') {
                c10 = '#';
                i14 = iT2;
            } else {
                c10 = '#';
                int iS2 = jk.f.s(input, '#', iT2, i21);
                b bVar3 = v.f334772k;
                this.f334803g = bVar3.p(b.f(bVar3, input, iT2 + 1, iS2, v.f334778q, true, false, true, false, null, 208, null));
                i14 = iS2;
            }
            if (i14 < i21 && input.charAt(i14) == c10) {
                this.f334804h = b.f(v.f334772k, input, i14 + 1, i21, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final a B(@NotNull String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            int i10 = 3 ^ 0;
            this.f334799c = b.f(v.f334772k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, com.planner5d.library.engine.input.f.b.U1, null);
            return this;
        }

        @NotNull
        public final a D(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f334801e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0028  */
        @NotNull
        public final a F(@Nullable String str) {
            List<String> listP;
            if (str != null) {
                b bVar = v.f334772k;
                int i10 = 3 << 0;
                String strF = b.f(bVar, str, 0, 0, v.f334778q, false, false, true, false, null, 219, null);
                if (strF != null) {
                    listP = bVar.p(strF);
                } else {
                    listP = null;
                }
            } else {
                listP = null;
            }
            this.f334803g = listP;
            return this;
        }

        @NotNull
        public final a G() {
            String str = this.f334800d;
            this.f334800d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f334802f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.f334802f;
                list.set(i10, b.f(v.f334772k, list.get(i10), 0, 0, v.f334777p, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f334803g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list2.get(i11);
                    list2.set(i11, str2 != null ? b.f(v.f334772k, str2, 0, 0, v.f334781t, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f334804h;
            this.f334804h = str3 != null ? b.f(v.f334772k, str3, 0, 0, v.f334784w, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @NotNull
        public final a I(@NotNull String encodedName) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f334803g == null) {
                return this;
            }
            int i10 = 0 << 0;
            int i11 = 1 << 0;
            H(b.f(v.f334772k, encodedName, 0, 0, v.f334779r, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final a J(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f334803g == null) {
                return this;
            }
            H(b.f(v.f334772k, name, 0, 0, v.f334780s, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final a K(int i10) {
            this.f334802f.remove(i10);
            if (this.f334802f.isEmpty()) {
                this.f334802f.add("");
            }
            return this;
        }

        @NotNull
        public final a M(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.N1(scheme, "http", true)) {
                this.f334797a = "http";
                return this;
            }
            if (StringsKt.N1(scheme, Api.scheme, true)) {
                this.f334797a = Api.scheme;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void N(@Nullable String str) {
            this.f334804h = str;
        }

        public final void O(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f334799c = str;
        }

        @NotNull
        public final a P(int i10, @NotNull String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            String strF = b.f(v.f334772k, encodedPathSegment, 0, 0, v.f334776o, true, false, false, false, null, com.planner5d.library.engine.input.f.b.M1, null);
            this.f334802f.set(i10, strF);
            if (!y(strF) && !z(strF)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void Q(@Nullable List<String> list) {
            this.f334803g = list;
        }

        @NotNull
        public final a R(@NotNull String encodedName, @Nullable String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            I(encodedName);
            c(encodedName, str);
            return this;
        }

        public final void S(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f334798b = str;
        }

        public final void T(@Nullable String str) {
            this.f334800d = str;
        }

        @NotNull
        public final a U(int i10, @NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            String strF = b.f(v.f334772k, pathSegment, 0, 0, v.f334776o, false, false, false, false, null, com.planner5d.library.engine.input.f.b.U1, null);
            if (!y(strF) && !z(strF)) {
                this.f334802f.set(i10, strF);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void V(int i10) {
            this.f334801e = i10;
        }

        @NotNull
        public final a W(@NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            J(name);
            g(name, str);
            return this;
        }

        public final void X(@Nullable String str) {
            this.f334797a = str;
        }

        @NotNull
        public final a Y(@NotNull String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f334798b = b.f(v.f334772k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, com.planner5d.library.engine.input.f.b.U1, null);
            return this;
        }

        @NotNull
        public final a a(@NotNull String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            int i10 = 0 << 1;
            E(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final a b(@NotNull String encodedPathSegments) {
            Intrinsics.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            return f(encodedPathSegments, true);
        }

        @NotNull
        public final a c(@NotNull String encodedName, @Nullable String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.f334803g == null) {
                this.f334803g = new ArrayList();
            }
            List<String> list = this.f334803g;
            Intrinsics.checkNotNull(list);
            b bVar = v.f334772k;
            list.add(b.f(bVar, encodedName, 0, 0, v.f334779r, true, false, true, false, null, 211, null));
            List<String> list2 = this.f334803g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.f(bVar, str, 0, 0, v.f334779r, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final a d(@NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            E(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final a e(@NotNull String pathSegments) {
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            return f(pathSegments, false);
        }

        @NotNull
        public final a g(@NotNull String name, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.f334803g == null) {
                this.f334803g = new ArrayList();
            }
            List<String> list = this.f334803g;
            Intrinsics.checkNotNull(list);
            b bVar = v.f334772k;
            list.add(b.f(bVar, name, 0, 0, v.f334780s, false, false, true, false, null, 219, null));
            List<String> list2 = this.f334803g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.f(bVar, str, 0, 0, v.f334780s, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final v h() {
            ArrayList arrayList;
            String str = this.f334797a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = v.f334772k;
            String strN = b.n(bVar, this.f334798b, 0, 0, false, 7, null);
            String strN2 = b.n(bVar, this.f334799c, 0, 0, false, 7, null);
            String str2 = this.f334800d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i10 = i();
            List<String> list = this.f334802f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.n(v.f334772k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f334803g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? b.n(v.f334772k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f334804h;
            return new v(str, strN, strN2, str2, i10, arrayList2, arrayList, str4 != null ? b.n(v.f334772k, str4, 0, 0, false, 7, null) : null, toString());
        }

        @NotNull
        public final a j(@Nullable String str) {
            this.f334804h = str != null ? b.f(v.f334772k, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final a k(@NotNull String encodedPassword) {
            Intrinsics.checkNotNullParameter(encodedPassword, "encodedPassword");
            int i10 = 3 >> 0;
            this.f334799c = b.f(v.f334772k, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.planner5d.library.engine.input.f.b.M1, null);
            return this;
        }

        @NotNull
        public final a l(@NotNull String encodedPath) {
            Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (StringsKt.u2(encodedPath, "/", false, 2, null)) {
                L(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        @NotNull
        public final a m(@Nullable String str) {
            b bVar;
            String strF;
            this.f334803g = (str == null || (strF = b.f((bVar = v.f334772k), str, 0, 0, v.f334778q, true, false, true, false, null, 211, null)) == null) ? null : bVar.p(strF);
            return this;
        }

        @NotNull
        public final a n(@NotNull String encodedUsername) {
            Intrinsics.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.f334798b = b.f(v.f334772k, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, com.planner5d.library.engine.input.f.b.M1, null);
            return this;
        }

        @NotNull
        public final a o(@Nullable String str) {
            this.f334804h = str != null ? b.f(v.f334772k, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @Nullable
        public final String p() {
            return this.f334804h;
        }

        @NotNull
        public final String q() {
            return this.f334799c;
        }

        @NotNull
        public final List<String> r() {
            return this.f334802f;
        }

        @Nullable
        public final List<String> s() {
            return this.f334803g;
        }

        @NotNull
        public final String t() {
            return this.f334798b;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0098  */
        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f334797a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f334798b.length() > 0 || this.f334799c.length() > 0) {
                sb2.append(this.f334798b);
                if (this.f334799c.length() > 0) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(this.f334799c);
                }
                sb2.append('@');
            }
            String str2 = this.f334800d;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.U2(str2, AbstractJsonLexerKt.COLON, false, 2, null)) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(this.f334800d);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb2.append(this.f334800d);
                }
            }
            if (this.f334801e != -1 || this.f334797a != null) {
                int i10 = i();
                String str3 = this.f334797a;
                if (str3 != null) {
                    b bVar = v.f334772k;
                    Intrinsics.checkNotNull(str3);
                    if (i10 != bVar.g(str3)) {
                        sb2.append(AbstractJsonLexerKt.COLON);
                        sb2.append(i10);
                    }
                } else {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(i10);
                }
            }
            b bVar2 = v.f334772k;
            bVar2.o(this.f334802f, sb2);
            if (this.f334803g != null) {
                sb2.append('?');
                List<String> list = this.f334803g;
                Intrinsics.checkNotNull(list);
                bVar2.q(list, sb2);
            }
            if (this.f334804h != null) {
                sb2.append('#');
                sb2.append(this.f334804h);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        @Nullable
        public final String u() {
            return this.f334800d;
        }

        public final int v() {
            return this.f334801e;
        }

        @Nullable
        public final String w() {
            return this.f334797a;
        }

        @NotNull
        public final a x(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strE = jk.a.e(b.n(v.f334772k, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.f334800d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String f(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return bVar.e(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        private final boolean k(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && jk.f.R(str.charAt(i10 + 1)) != -1 && jk.f.R(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String n(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.m(str, i10, i11, z10);
        }

        private final void r(okio.l lVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            okio.l lVar2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        lVar.pa(z10 ? org.slf4j.h.f339615a3 : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!StringsKt.U2(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || k(str, iCharCount, i11))))) {
                                lVar.d9(iCodePointAt);
                            }
                        }
                        if (lVar2 == null) {
                            lVar2 = new okio.l();
                        }
                        if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            lVar2.d9(iCodePointAt);
                        } else {
                            lVar2.c5(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!lVar2.y1()) {
                            byte b10 = lVar2.readByte();
                            lVar.writeByte(37);
                            lVar.writeByte(v.f334773l[((b10 & 255) >> 4) & 15]);
                            lVar.writeByte(v.f334773l[b10 & com.google.common.base.c.f116464q]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        private final void s(okio.l lVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iR = jk.f.R(str.charAt(i10 + 1));
                    int iR2 = jk.f.R(str.charAt(i12));
                    if (iR == -1 || iR2 == -1) {
                        lVar.d9(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        lVar.writeByte((iR << 4) + iR2);
                        i10 = i12 + Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt == 43 && z10) {
                    lVar.writeByte(32);
                    i10++;
                } else {
                    lVar.d9(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @oj.i(name = "-deprecated_get")
        @NotNull
        public final v a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return h(url);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @oj.i(name = "-deprecated_get")
        @Nullable
        public final v b(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return i(uri);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @oj.i(name = "-deprecated_get")
        @Nullable
        public final v c(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return j(url);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @oj.i(name = "-deprecated_parse")
        @Nullable
        public final v d(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return l(url);
        }

        @NotNull
        public final String e(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt.U2(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !k(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    okio.l lVar = new okio.l();
                    lVar.K3(str, i10, iCharCount);
                    r(lVar, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return lVar.O7();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @oj.n
        public final int g(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, Api.scheme) ? 443 : -1;
        }

        @oj.n
        @oj.i(name = "get")
        @NotNull
        public final v h(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new a().A(null, str).h();
        }

        @oj.n
        @oj.i(name = "get")
        @Nullable
        public final v i(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "<this>");
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return l(string);
        }

        @oj.n
        @oj.i(name = "get")
        @Nullable
        public final v j(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return l(string);
        }

        @oj.n
        @oj.i(name = "parse")
        @Nullable
        public final v l(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String m(@NotNull String str, int i10, int i11, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    okio.l lVar = new okio.l();
                    lVar.K3(str, i10, i12);
                    s(lVar, str, i12, i11, z10);
                    return lVar.O7();
                }
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void o(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append(list.get(i10));
            }
        }

        @NotNull
        public final List<String> p(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iQ3 = StringsKt.q3(str2, kotlin.text.b0.f313279d, i10, false, 4, null);
                if (iQ3 == -1) {
                    iQ3 = str2.length();
                }
                int iQ4 = StringsKt.q3(str2, '=', i10, false, 4, null);
                if (iQ4 == -1 || iQ4 > iQ3) {
                    String strSubstring = str2.substring(i10, iQ3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iQ4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iQ4 + 1, iQ3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iQ3 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void q(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, list.size()), 2);
            int iL = jVarB1.l();
            int iM = jVarB1.m();
            int iN = jVarB1.n();
            if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
                while (true) {
                    String str = list.get(iL);
                    String str2 = list.get(iL + 1);
                    if (iL > 0) {
                        out.append(kotlin.text.b0.f313279d);
                    }
                    out.append(str);
                    if (str2 != null) {
                        out.append('=');
                        out.append(str2);
                    }
                    if (iL == iM) {
                        break;
                    } else {
                        iL += iN;
                    }
                }
            }
        }

        private b() {
        }
    }

    public v(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i10, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f334785a = scheme;
        this.f334786b = username;
        this.f334787c = password;
        this.f334788d = host;
        this.f334789e = i10;
        this.f334790f = pathSegments;
        this.f334791g = list;
        this.f334792h = str;
        this.f334793i = url;
        this.f334794j = Intrinsics.areEqual(scheme, Api.scheme);
    }

    @oj.n
    @oj.i(name = "get")
    @NotNull
    public static final v C(@NotNull String str) {
        return f334772k.h(str);
    }

    @oj.n
    @oj.i(name = "get")
    @Nullable
    public static final v D(@NotNull URI uri) {
        return f334772k.i(uri);
    }

    @oj.n
    @oj.i(name = "get")
    @Nullable
    public static final v E(@NotNull URL url) {
        return f334772k.j(url);
    }

    @oj.n
    @oj.i(name = "parse")
    @Nullable
    public static final v J(@NotNull String str) {
        return f334772k.l(str);
    }

    @oj.n
    public static final int u(@NotNull String str) {
        return f334772k.g(str);
    }

    @oj.i(name = "encodedUsername")
    @NotNull
    public final String A() {
        if (this.f334786b.length() == 0) {
            return "";
        }
        int length = this.f334785a.length() + 3;
        String str = this.f334793i;
        String strSubstring = this.f334793i.substring(length, jk.f.t(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @oj.i(name = "fragment")
    @Nullable
    public final String B() {
        return this.f334792h;
    }

    @oj.i(name = "host")
    @NotNull
    public final String F() {
        return this.f334788d;
    }

    public final boolean G() {
        return this.f334794j;
    }

    @NotNull
    public final a H() {
        a aVar = new a();
        aVar.X(this.f334785a);
        aVar.S(A());
        aVar.O(w());
        aVar.T(this.f334788d);
        aVar.V(this.f334789e != f334772k.g(this.f334785a) ? this.f334789e : -1);
        aVar.r().clear();
        aVar.r().addAll(y());
        aVar.m(z());
        aVar.N(v());
        return aVar;
    }

    @Nullable
    public final a I(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().A(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @oj.i(name = "password")
    @NotNull
    public final String K() {
        return this.f334787c;
    }

    @oj.i(name = "pathSegments")
    @NotNull
    public final List<String> L() {
        return this.f334790f;
    }

    @oj.i(name = "pathSize")
    public final int M() {
        return this.f334790f.size();
    }

    @oj.i(name = com.rabbitmq.client.s.f266031f)
    public final int N() {
        return this.f334789e;
    }

    @oj.i(name = "query")
    @Nullable
    public final String O() {
        if (this.f334791g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f334772k.q(this.f334791g, sb2);
        return sb2.toString();
    }

    @Nullable
    public final String P(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.f334791g;
        if (list == null) {
            return null;
        }
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, list.size()), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (!Intrinsics.areEqual(name, this.f334791g.get(iL))) {
                if (iL != iM) {
                    iL += iN;
                }
            }
            return this.f334791g.get(iL + 1);
        }
        return null;
    }

    @NotNull
    public final String Q(int i10) {
        List<String> list = this.f334791g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i10 * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    @oj.i(name = "queryParameterNames")
    @NotNull
    public final Set<String> R() {
        if (this.f334791g == null) {
            return SetsKt.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f334791g.size()), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                String str = this.f334791g.get(iL);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (iL == iM) {
                    break;
                }
                iL += iN;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Nullable
    public final String S(int i10) {
        List<String> list = this.f334791g;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> T(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f334791g == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f334791g.size()), 2);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                if (Intrinsics.areEqual(name, this.f334791g.get(iL))) {
                    arrayList.add(this.f334791g.get(iL + 1));
                }
                if (iL == iM) {
                    break;
                }
                iL += iN;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    @oj.i(name = "querySize")
    public final int U() {
        List<String> list = this.f334791g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String V() {
        a aVarI = I("/...");
        Intrinsics.checkNotNull(aVarI);
        return aVarI.Y("").B("").h().toString();
    }

    @Nullable
    public final v W(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarI = I(link);
        if (aVarI != null) {
            return aVarI.h();
        }
        return null;
    }

    @oj.i(name = "scheme")
    @NotNull
    public final String X() {
        return this.f334785a;
    }

    @Nullable
    public final String Y() {
        if (jk.f.k(this.f334788d)) {
            return null;
        }
        return PublicSuffixDatabase.f334565e.c().c(this.f334788d);
    }

    @oj.i(name = "uri")
    @NotNull
    public final URI Z() {
        String string = H().G().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedFragment", imports = {}))
    @oj.i(name = "-deprecated_encodedFragment")
    @Nullable
    public final String a() {
        return v();
    }

    @oj.i(name = "url")
    @NotNull
    public final URL a0() {
        try {
            return new URL(this.f334793i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPassword", imports = {}))
    @oj.i(name = "-deprecated_encodedPassword")
    @NotNull
    public final String b() {
        return w();
    }

    @oj.i(name = "username")
    @NotNull
    public final String b0() {
        return this.f334786b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPath", imports = {}))
    @oj.i(name = "-deprecated_encodedPath")
    @NotNull
    public final String c() {
        return x();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPathSegments", imports = {}))
    @oj.i(name = "-deprecated_encodedPathSegments")
    @NotNull
    public final List<String> d() {
        return y();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedQuery", imports = {}))
    @oj.i(name = "-deprecated_encodedQuery")
    @Nullable
    public final String e() {
        return z();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof v) && Intrinsics.areEqual(((v) obj).f334793i, this.f334793i);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedUsername", imports = {}))
    @oj.i(name = "-deprecated_encodedUsername")
    @NotNull
    public final String f() {
        return A();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "fragment", imports = {}))
    @oj.i(name = "-deprecated_fragment")
    @Nullable
    public final String g() {
        return this.f334792h;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "host", imports = {}))
    @oj.i(name = "-deprecated_host")
    @NotNull
    public final String h() {
        return this.f334788d;
    }

    public int hashCode() {
        return this.f334793i.hashCode();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "password", imports = {}))
    @oj.i(name = "-deprecated_password")
    @NotNull
    public final String i() {
        return this.f334787c;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "pathSegments", imports = {}))
    @oj.i(name = "-deprecated_pathSegments")
    @NotNull
    public final List<String> j() {
        return this.f334790f;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "pathSize", imports = {}))
    @oj.i(name = "-deprecated_pathSize")
    public final int k() {
        return M();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = com.rabbitmq.client.s.f266031f, imports = {}))
    @oj.i(name = "-deprecated_port")
    public final int l() {
        return this.f334789e;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "query", imports = {}))
    @oj.i(name = "-deprecated_query")
    @Nullable
    public final String m() {
        return O();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "queryParameterNames", imports = {}))
    @oj.i(name = "-deprecated_queryParameterNames")
    @NotNull
    public final Set<String> n() {
        return R();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "querySize", imports = {}))
    @oj.i(name = "-deprecated_querySize")
    public final int o() {
        return U();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "scheme", imports = {}))
    @oj.i(name = "-deprecated_scheme")
    @NotNull
    public final String p() {
        return this.f334785a;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to toUri()", replaceWith = @b1(expression = "toUri()", imports = {}))
    @oj.i(name = "-deprecated_uri")
    @NotNull
    public final URI q() {
        return Z();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to toUrl()", replaceWith = @b1(expression = "toUrl()", imports = {}))
    @oj.i(name = "-deprecated_url")
    @NotNull
    public final URL r() {
        return a0();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "username", imports = {}))
    @oj.i(name = "-deprecated_username")
    @NotNull
    public final String s() {
        return this.f334786b;
    }

    @NotNull
    public String toString() {
        return this.f334793i;
    }

    @oj.i(name = "encodedFragment")
    @Nullable
    public final String v() {
        if (this.f334792h == null) {
            return null;
        }
        String strSubstring = this.f334793i.substring(StringsKt.q3(this.f334793i, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @oj.i(name = "encodedPassword")
    @NotNull
    public final String w() {
        if (this.f334787c.length() == 0) {
            return "";
        }
        String strSubstring = this.f334793i.substring(StringsKt.q3(this.f334793i, AbstractJsonLexerKt.COLON, this.f334785a.length() + 3, false, 4, null) + 1, StringsKt.q3(this.f334793i, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @oj.i(name = "encodedPath")
    @NotNull
    public final String x() {
        int iQ3 = StringsKt.q3(this.f334793i, '/', this.f334785a.length() + 3, false, 4, null);
        String str = this.f334793i;
        String strSubstring = this.f334793i.substring(iQ3, jk.f.t(str, "?#", iQ3, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @oj.i(name = "encodedPathSegments")
    @NotNull
    public final List<String> y() {
        int iQ3 = StringsKt.q3(this.f334793i, '/', this.f334785a.length() + 3, false, 4, null);
        String str = this.f334793i;
        int iT = jk.f.t(str, "?#", iQ3, str.length());
        ArrayList arrayList = new ArrayList();
        while (iQ3 < iT) {
            int i10 = iQ3 + 1;
            int iS = jk.f.s(this.f334793i, '/', i10, iT);
            String strSubstring = this.f334793i.substring(i10, iS);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iQ3 = iS;
        }
        return arrayList;
    }

    @oj.i(name = "encodedQuery")
    @Nullable
    public final String z() {
        if (this.f334791g == null) {
            return null;
        }
        int iQ3 = StringsKt.q3(this.f334793i, '?', 0, false, 6, null) + 1;
        String str = this.f334793i;
        String strSubstring = this.f334793i.substring(iQ3, jk.f.s(str, '#', iQ3, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
