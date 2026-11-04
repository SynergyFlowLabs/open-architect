package io.ktor.http;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpStatusCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpStatusCode.kt\nio/ktor/http/HttpStatusCode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1208#2,2:197\n1236#2,4:199\n*S KotlinDebug\n*F\n+ 1 HttpStatusCode.kt\nio/ktor/http/HttpStatusCode\n*L\n119#1:197,2\n119#1:199,4\n*E\n"})
public final class l1 implements Comparable<l1> {

    @NotNull
    private static final List<l1> K3;

    @NotNull
    private static final Map<Integer, l1> L3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f295979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f295980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f295939c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final l1 f295940d = new l1(100, "Continue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final l1 f295941e = new l1(101, "Switching Protocols");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final l1 f295942f = new l1(102, "Processing");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final l1 f295943g = new l1(200, "OK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final l1 f295945h = new l1(201, "Created");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final l1 f295947i = new l1(202, "Accepted");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final l1 f295949j = new l1(203, "Non-Authoritative Information");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final l1 f295951k = new l1(204, "No Content");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final l1 f295953l = new l1(205, "Reset Content");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final l1 f295955m = new l1(206, "Partial Content");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final l1 f295957n = new l1(androidx.compose.runtime.m0.f36245r, "Multi-Status");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final l1 f295959o = new l1(300, "Multiple Choices");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final l1 f295967s = new l1(301, "Moved Permanently");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final l1 f295969t = new l1(302, "Found");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final l1 f295972v = new l1(303, "See Other");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final l1 f295974w = new l1(304, "Not Modified");

    @NotNull
    private static final l1 X = new l1(305, "Use Proxy");

    @NotNull
    private static final l1 Y = new l1(306, "Switch Proxy");

    @NotNull
    private static final l1 Z = new l1(307, "Temporary Redirect");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private static final l1 f295961p0 = new l1(308, "Permanent Redirect");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private static final l1 f295962p1 = new l1(400, "Bad Request");

    @NotNull
    private static final l1 H1 = new l1(401, "Unauthorized");

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private static final l1 f295963p2 = new l1(402, "Payment Required");

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NotNull
    private static final l1 f295944g3 = new l1(403, "Forbidden");

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private static final l1 f295946h3 = new l1(404, "Not Found");

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final l1 f295948i3 = new l1(405, "Method Not Allowed");

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private static final l1 f295950j3 = new l1(com.rabbitmq.client.a.f264843n, "Not Acceptable");

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private static final l1 f295952k3 = new l1(407, "Proxy Authentication Required");

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @NotNull
    private static final l1 f295954l3 = new l1(408, "Request Timeout");

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @NotNull
    private static final l1 f295956m3 = new l1(com.google.api.client.http.a0.f115563p, "Conflict");

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @NotNull
    private static final l1 f295958n3 = new l1(410, "Gone");

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private static final l1 f295960o3 = new l1(411, "Length Required");

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @NotNull
    private static final l1 f295964p3 = new l1(412, "Precondition Failed");

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @NotNull
    private static final l1 f295965q3 = new l1(413, "Payload Too Large");

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @NotNull
    private static final l1 f295966r3 = new l1(414, "Request-URI Too Long");

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NotNull
    private static final l1 f295968s3 = new l1(415, "Unsupported Media Type");

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @NotNull
    private static final l1 f295970t3 = new l1(androidx.constraintlayout.core.motion.utils.v.c.f44016q, "Requested Range Not Satisfiable");

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @NotNull
    private static final l1 f295971u3 = new l1(417, "Expectation Failed");

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @NotNull
    private static final l1 f295973v3 = new l1(422, "Unprocessable Entity");

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @NotNull
    private static final l1 f295975w3 = new l1(androidx.constraintlayout.core.motion.utils.v.c.f44020u, "Locked");

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @NotNull
    private static final l1 f295976x3 = new l1(androidx.constraintlayout.core.motion.utils.v.c.f44021v, "Failed Dependency");

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @NotNull
    private static final l1 f295977y3 = new l1(androidx.constraintlayout.core.motion.utils.v.c.f44022w, "Too Early");

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    @NotNull
    private static final l1 f295978z3 = new l1(426, "Upgrade Required");

    @NotNull
    private static final l1 A3 = new l1(429, "Too Many Requests");

    @NotNull
    private static final l1 B3 = new l1(431, "Request Header Fields Too Large");

    @NotNull
    private static final l1 C3 = new l1(500, "Internal Server Error");

    @NotNull
    private static final l1 D3 = new l1(501, "Not Implemented");

    @NotNull
    private static final l1 E3 = new l1(502, "Bad Gateway");

    @NotNull
    private static final l1 F3 = new l1(503, "Service Unavailable");

    @NotNull
    private static final l1 G3 = new l1(504, "Gateway Timeout");

    @NotNull
    private static final l1 H3 = new l1(505, "HTTP Version Not Supported");

    @NotNull
    private static final l1 I3 = new l1(506, "Variant Also Negotiates");

    @NotNull
    private static final l1 J3 = new l1(androidx.constraintlayout.core.motion.utils.v.g.f44095o, "Insufficient Storage");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final l1 A() {
            return l1.D3;
        }

        @NotNull
        public final l1 B() {
            return l1.f295974w;
        }

        @NotNull
        public final l1 C() {
            return l1.f295943g;
        }

        @NotNull
        public final l1 D() {
            return l1.f295955m;
        }

        @NotNull
        public final l1 E() {
            return l1.f295965q3;
        }

        @NotNull
        public final l1 F() {
            return l1.f295963p2;
        }

        @NotNull
        public final l1 G() {
            return l1.f295961p0;
        }

        @NotNull
        public final l1 H() {
            return l1.f295964p3;
        }

        @NotNull
        public final l1 I() {
            return l1.f295942f;
        }

        @NotNull
        public final l1 J() {
            return l1.f295952k3;
        }

        @NotNull
        public final l1 K() {
            return l1.B3;
        }

        @NotNull
        public final l1 L() {
            return l1.f295954l3;
        }

        @NotNull
        public final l1 M() {
            return l1.f295966r3;
        }

        @NotNull
        public final l1 N() {
            return l1.f295970t3;
        }

        @NotNull
        public final l1 O() {
            return l1.f295953l;
        }

        @NotNull
        public final l1 P() {
            return l1.f295972v;
        }

        @NotNull
        public final l1 Q() {
            return l1.F3;
        }

        @NotNull
        public final l1 R() {
            return l1.Y;
        }

        @NotNull
        public final l1 S() {
            return l1.f295941e;
        }

        @NotNull
        public final l1 T() {
            return l1.Z;
        }

        @NotNull
        public final l1 U() {
            return l1.f295977y3;
        }

        @NotNull
        public final l1 V() {
            return l1.A3;
        }

        @NotNull
        public final l1 W() {
            return l1.H1;
        }

        @NotNull
        public final l1 X() {
            return l1.f295973v3;
        }

        @NotNull
        public final l1 Y() {
            return l1.f295968s3;
        }

        @NotNull
        public final l1 Z() {
            return l1.f295978z3;
        }

        @NotNull
        public final l1 a(int i10) {
            l1 l1Var = (l1) l1.L3.get(Integer.valueOf(i10));
            if (l1Var == null) {
                l1Var = new l1(i10, "Unknown Status Code");
            }
            return l1Var;
        }

        @NotNull
        public final l1 a0() {
            return l1.X;
        }

        @NotNull
        public final l1 b() {
            return l1.f295947i;
        }

        @NotNull
        public final l1 b0() {
            return l1.I3;
        }

        @NotNull
        public final List<l1> c() {
            return l1.K3;
        }

        @NotNull
        public final l1 c0() {
            return l1.H3;
        }

        @NotNull
        public final l1 d() {
            return l1.E3;
        }

        @NotNull
        public final l1 e() {
            return l1.f295962p1;
        }

        @NotNull
        public final l1 f() {
            return l1.f295956m3;
        }

        @NotNull
        public final l1 g() {
            return l1.f295940d;
        }

        @NotNull
        public final l1 h() {
            return l1.f295945h;
        }

        @NotNull
        public final l1 i() {
            return l1.f295971u3;
        }

        @NotNull
        public final l1 j() {
            return l1.f295976x3;
        }

        @NotNull
        public final l1 k() {
            return l1.f295944g3;
        }

        @NotNull
        public final l1 l() {
            return l1.f295969t;
        }

        @NotNull
        public final l1 m() {
            return l1.G3;
        }

        @NotNull
        public final l1 n() {
            return l1.f295958n3;
        }

        @NotNull
        public final l1 o() {
            return l1.J3;
        }

        @NotNull
        public final l1 p() {
            return l1.C3;
        }

        @NotNull
        public final l1 q() {
            return l1.f295960o3;
        }

        @NotNull
        public final l1 r() {
            return l1.f295975w3;
        }

        @NotNull
        public final l1 s() {
            return l1.f295948i3;
        }

        @NotNull
        public final l1 t() {
            return l1.f295967s;
        }

        @NotNull
        public final l1 u() {
            return l1.f295957n;
        }

        @NotNull
        public final l1 v() {
            return l1.f295959o;
        }

        @NotNull
        public final l1 w() {
            return l1.f295951k;
        }

        @NotNull
        public final l1 x() {
            return l1.f295949j;
        }

        @NotNull
        public final l1 y() {
            return l1.f295950j3;
        }

        @NotNull
        public final l1 z() {
            return l1.f295946h3;
        }

        private a() {
        }
    }

    static {
        List<l1> listA = m1.a();
        K3 = listA;
        List<l1> list = listA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((l1) obj).f295979a), obj);
        }
        L3 = linkedHashMap;
    }

    public l1(int i10, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f295979a = i10;
        this.f295980b = description;
    }

    public static /* synthetic */ l1 E0(l1 l1Var, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = l1Var.f295979a;
        }
        if ((i11 & 2) != 0) {
            str = l1Var.f295980b;
        }
        return l1Var.D0(i10, str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull l1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f295979a - other.f295979a;
    }

    public final int B0() {
        return this.f295979a;
    }

    @NotNull
    public final String C0() {
        return this.f295980b;
    }

    @NotNull
    public final l1 D0(int i10, @NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new l1(i10, description);
    }

    @NotNull
    public final l1 F0(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return E0(this, 0, value, 1, null);
    }

    @NotNull
    public final String G0() {
        return this.f295980b;
    }

    public final int H0() {
        return this.f295979a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof l1) && ((l1) obj).f295979a == this.f295979a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f295979a);
    }

    @NotNull
    public String toString() {
        return this.f295979a + ' ' + this.f295980b;
    }
}
