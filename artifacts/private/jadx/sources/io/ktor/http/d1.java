package io.ktor.http;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaders.kt\nio/ktor/http/HttpHeaders\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,220:1\n12637#2,2:221\n1188#3,3:223\n1188#3,3:226\n*S KotlinDebug\n*F\n+ 1 HttpHeaders.kt\nio/ktor/http/HttpHeaders\n*L\n132#1:221,2\n157#1:223,3\n170#1:226,3\n*E\n"})
public final class d1 {

    @NotNull
    private static final String[] V0;

    @NotNull
    private static final List<String> W0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d1 f295782a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f295784b = "Accept";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f295786c = com.google.common.net.d.f119503i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f295788d = com.google.common.net.d.f119507j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f295790e = com.google.common.net.d.f119511k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f295792f = com.google.common.net.d.Q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f295794g = com.google.common.net.d.Y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f295796h = com.google.common.net.d.Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f295798i = "ALPN";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f295800j = "Authentication-Info";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f295802k = "Authorization";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f295804l = com.google.common.net.d.f119471a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f295806m = com.google.common.net.d.f119523o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f295808n = com.google.common.net.d.f119472a0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final String f295810o = com.google.common.net.d.f119476b0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f295812p = com.google.common.net.d.f119480c0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f295814q = "Content-Length";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f295816r = com.google.common.net.d.f119484d0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f295818s = com.google.common.net.d.f119492f0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f295820t = "Content-Type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f295822u = "Cookie";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f295824v = "DASL";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f295826w = com.google.common.net.d.f119483d;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String f295828x = "DAV";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f295830y = "Depth";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f295832z = "Destination";

    @NotNull
    private static final String A = com.google.common.net.d.f119527p0;

    @NotNull
    private static final String B = com.google.common.net.d.f119535s;

    @NotNull
    private static final String C = com.google.common.net.d.f119530q0;

    @NotNull
    private static final String D = com.google.common.net.d.f119538t;

    @NotNull
    private static final String E = com.google.common.net.d.f119541u;

    @NotNull
    private static final String F = com.google.common.net.d.f119547w;

    @NotNull
    private static final String G = com.google.common.net.d.f119550x;

    @NotNull
    private static final String H = "If";

    @NotNull
    private static final String I = com.google.common.net.d.f119553y;

    @NotNull
    private static final String J = com.google.common.net.d.f119556z;

    @NotNull
    private static final String K = com.google.common.net.d.A;

    @NotNull
    private static final String L = com.google.common.net.d.B;

    @NotNull
    private static final String M = "If-Schedule-Tag-Match";

    @NotNull
    private static final String N = com.google.common.net.d.C;

    @NotNull
    private static final String O = com.google.common.net.d.f119533r0;

    @NotNull
    private static final String P = com.google.common.net.d.f119539t0;

    @NotNull
    private static final String Q = "Lock-Token";

    @NotNull
    private static final String R = "Link";

    @NotNull
    private static final String S = com.google.common.net.d.E;

    @NotNull
    private static final String T = "MIME-Version";

    @NotNull
    private static final String U = "Ordering-Type";

    @NotNull
    private static final String V = com.google.common.net.d.F;

    @NotNull
    private static final String W = "Overwrite";

    @NotNull
    private static final String X = "Position";

    @NotNull
    private static final String Y = com.google.common.net.d.f119487e;

    @NotNull
    private static final String Z = "Prefer";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    private static final String f295783a0 = "Preference-Applied";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @NotNull
    private static final String f295785b0 = "Proxy-Authenticate";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    private static final String f295787c0 = "Proxy-Authentication-Info";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @NotNull
    private static final String f295789d0 = "Proxy-Authorization";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    private static final String f295791e0 = com.google.common.net.d.f119481c1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    private static final String f295793f0 = com.google.common.net.d.f119485d1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    private static final String f295795g0 = com.google.common.net.d.I;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @NotNull
    private static final String f295797h0 = com.google.common.net.d.J;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    private static final String f295799i0 = com.google.common.net.d.B0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    private static final String f295801j0 = "Schedule-Reply";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @NotNull
    private static final String f295803k0 = "Schedule-Tag";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @NotNull
    private static final String f295805l0 = com.google.common.net.d.Y1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    private static final String f295807m0 = com.google.common.net.d.Z1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @NotNull
    private static final String f295809n0 = com.google.common.net.d.f119474a2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @NotNull
    private static final String f295811o0 = com.google.common.net.d.f119478b2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final String f295813p0 = com.google.common.net.d.f119482c2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    private static final String f295815q0 = com.google.common.net.d.C0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    private static final String f295817r0 = com.google.common.net.d.F0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    private static final String f295819s0 = "SLUG";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    private static final String f295821t0 = com.google.common.net.d.J0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    private static final String f295823u0 = com.google.common.net.d.M;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    private static final String f295825v0 = "Timeout";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    private static final String f295827w0 = com.google.common.net.d.L0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    private static final String f295829x0 = com.google.common.net.d.M0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    private static final String f295831y0 = com.google.common.net.d.N;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @NotNull
    private static final String f295833z0 = com.google.common.net.d.P;

    @NotNull
    private static final String A0 = com.google.common.net.d.N0;

    @NotNull
    private static final String B0 = com.google.common.net.d.f119491f;

    @NotNull
    private static final String C0 = com.google.common.net.d.f119495g;

    @NotNull
    private static final String D0 = "WWW-Authenticate";

    @NotNull
    private static final String E0 = com.google.common.net.d.T;

    @NotNull
    private static final String F0 = com.google.common.net.d.S;

    @NotNull
    private static final String G0 = com.google.common.net.d.V;

    @NotNull
    private static final String H0 = com.google.common.net.d.R;

    @NotNull
    private static final String I0 = com.google.common.net.d.f119517m;

    @NotNull
    private static final String J0 = com.google.common.net.d.f119514l;

    @NotNull
    private static final String K0 = com.google.common.net.d.W;

    @NotNull
    private static final String L0 = com.google.common.net.d.X;

    @NotNull
    private static final String M0 = "X-Http-Method-Override";

    @NotNull
    private static final String N0 = com.google.common.net.d.Y0;

    @NotNull
    private static final String O0 = "X-Forwarded-Server";

    @NotNull
    private static final String P0 = com.google.common.net.d.X0;

    @NotNull
    private static final String Q0 = com.google.common.net.d.W0;

    @NotNull
    private static final String R0 = com.google.common.net.d.Z0;

    @NotNull
    private static final String S0 = com.google.common.net.d.f119489e1;

    @NotNull
    private static final String T0 = "X-Correlation-ID";

    @NotNull
    private static final String U0 = "X-Total-Count";

    static {
        String[] strArr = {com.google.common.net.d.M0, com.google.common.net.d.N};
        V0 = strArr;
        W0 = ArraysKt.asList(strArr);
    }

    private d1() {
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use UnsafeHeadersList instead.", replaceWith = @kotlin.b1(expression = "HttpHeaders.UnsafeHeadersList", imports = {}))
    public static /* synthetic */ void I0() {
    }

    @NotNull
    public final String A() {
        return f295816r;
    }

    @NotNull
    public final String A0() {
        return f295815q0;
    }

    @NotNull
    public final String B() {
        return f295818s;
    }

    @NotNull
    public final String B0() {
        return f295817r0;
    }

    @NotNull
    public final String C() {
        return f295820t;
    }

    @NotNull
    public final String C0() {
        return f295821t0;
    }

    @NotNull
    public final String D() {
        return f295822u;
    }

    @NotNull
    public final String D0() {
        return f295823u0;
    }

    @NotNull
    public final String E() {
        return f295824v;
    }

    @NotNull
    public final String E0() {
        return f295825v0;
    }

    @NotNull
    public final String F() {
        return f295828x;
    }

    @NotNull
    public final String F0() {
        return f295827w0;
    }

    @NotNull
    public final String G() {
        return f295826w;
    }

    @NotNull
    public final String G0() {
        return f295829x0;
    }

    @NotNull
    public final String H() {
        return f295830y;
    }

    @NotNull
    public final String[] H0() {
        String[] strArr = V0;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return (String[]) objArrCopyOf;
    }

    @NotNull
    public final String I() {
        return f295832z;
    }

    @NotNull
    public final String J() {
        return A;
    }

    @NotNull
    public final List<String> J0() {
        return W0;
    }

    @NotNull
    public final String K() {
        return B;
    }

    @NotNull
    public final String K0() {
        return f295831y0;
    }

    @NotNull
    public final String L() {
        return C;
    }

    @NotNull
    public final String L0() {
        return f295833z0;
    }

    @NotNull
    public final String M() {
        return E;
    }

    @NotNull
    public final String M0() {
        return A0;
    }

    @NotNull
    public final String N() {
        return D;
    }

    @NotNull
    public final String N0() {
        return B0;
    }

    @NotNull
    public final String O() {
        return G;
    }

    @NotNull
    public final String O0() {
        return D0;
    }

    @NotNull
    public final String P() {
        return F;
    }

    @NotNull
    public final String P0() {
        return C0;
    }

    @NotNull
    public final String Q() {
        return H;
    }

    @NotNull
    public final String Q0() {
        return T0;
    }

    @NotNull
    public final String R() {
        return I;
    }

    @NotNull
    public final String R0() {
        return Q0;
    }

    @NotNull
    public final String S() {
        return J;
    }

    @NotNull
    public final String S0() {
        return N0;
    }

    @NotNull
    public final String T() {
        return K;
    }

    @NotNull
    public final String T0() {
        return R0;
    }

    @NotNull
    public final String U() {
        return L;
    }

    @NotNull
    public final String U0() {
        return P0;
    }

    @NotNull
    public final String V() {
        return M;
    }

    @NotNull
    public final String V0() {
        return O0;
    }

    @NotNull
    public final String W() {
        return N;
    }

    @NotNull
    public final String W0() {
        return M0;
    }

    @NotNull
    public final String X() {
        return O;
    }

    @NotNull
    public final String X0() {
        return S0;
    }

    @NotNull
    public final String Y() {
        return R;
    }

    @NotNull
    public final String Y0() {
        return U0;
    }

    @NotNull
    public final String Z() {
        return P;
    }

    public final boolean Z0(@NotNull String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        for (String str : V0) {
            if (StringsKt.N1(str, header, true)) {
                return true;
            }
        }
        return false;
    }

    public final void a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int i11 = 0;
        while (i10 < name.length()) {
            char cCharAt = name.charAt(i10);
            int i12 = i11 + 1;
            if (Intrinsics.compare((int) cCharAt, 32) <= 0 || e1.b(cCharAt)) {
                throw new p1(name, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    @NotNull
    public final String a0() {
        return Q;
    }

    public final void b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 0;
        int i11 = 0;
        while (i10 < value.length()) {
            char cCharAt = value.charAt(i10);
            int i12 = i11 + 1;
            if (Intrinsics.compare((int) cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new q1(value, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    @NotNull
    public final String b0() {
        return T;
    }

    @NotNull
    public final String c() {
        return f295798i;
    }

    @NotNull
    public final String c0() {
        return S;
    }

    @NotNull
    public final String d() {
        return f295784b;
    }

    @NotNull
    public final String d0() {
        return U;
    }

    @NotNull
    public final String e() {
        return f295786c;
    }

    @NotNull
    public final String e0() {
        return V;
    }

    @NotNull
    public final String f() {
        return f295788d;
    }

    @NotNull
    public final String f0() {
        return W;
    }

    @NotNull
    public final String g() {
        return f295790e;
    }

    @NotNull
    public final String g0() {
        return X;
    }

    @NotNull
    public final String h() {
        return f295792f;
    }

    @NotNull
    public final String h0() {
        return Y;
    }

    @NotNull
    public final String i() {
        return G0;
    }

    @NotNull
    public final String i0() {
        return Z;
    }

    @NotNull
    public final String j() {
        return H0;
    }

    @NotNull
    public final String j0() {
        return f295783a0;
    }

    @NotNull
    public final String k() {
        return F0;
    }

    @NotNull
    public final String k0() {
        return f295785b0;
    }

    @NotNull
    public final String l() {
        return E0;
    }

    @NotNull
    public final String l0() {
        return f295787c0;
    }

    @NotNull
    public final String m() {
        return K0;
    }

    @NotNull
    public final String m0() {
        return f295789d0;
    }

    @NotNull
    public final String n() {
        return L0;
    }

    @NotNull
    public final String n0() {
        return f295791e0;
    }

    @NotNull
    public final String o() {
        return J0;
    }

    @NotNull
    public final String o0() {
        return f295793f0;
    }

    @NotNull
    public final String p() {
        return I0;
    }

    @NotNull
    public final String p0() {
        return f295795g0;
    }

    @NotNull
    public final String q() {
        return f295794g;
    }

    @NotNull
    public final String q0() {
        return f295797h0;
    }

    @NotNull
    public final String r() {
        return f295796h;
    }

    @NotNull
    public final String r0() {
        return f295799i0;
    }

    @NotNull
    public final String s() {
        return f295800j;
    }

    @NotNull
    public final String s0() {
        return f295819s0;
    }

    @NotNull
    public final String t() {
        return f295802k;
    }

    @NotNull
    public final String t0() {
        return f295801j0;
    }

    @NotNull
    public final String u() {
        return f295804l;
    }

    @NotNull
    public final String u0() {
        return f295803k0;
    }

    @NotNull
    public final String v() {
        return f295806m;
    }

    @NotNull
    public final String v0() {
        return f295805l0;
    }

    @NotNull
    public final String w() {
        return f295808n;
    }

    @NotNull
    public final String w0() {
        return f295807m0;
    }

    @NotNull
    public final String x() {
        return f295810o;
    }

    @NotNull
    public final String x0() {
        return f295809n0;
    }

    @NotNull
    public final String y() {
        return f295812p;
    }

    @NotNull
    public final String y0() {
        return f295811o0;
    }

    @NotNull
    public final String z() {
        return f295814q;
    }

    @NotNull
    public final String z0() {
        return f295813p0;
    }
}
