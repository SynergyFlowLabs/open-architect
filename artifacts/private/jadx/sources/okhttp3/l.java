package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f334686e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final i[] f334687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final i[] f334688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final l f334689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final l f334690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final l f334691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final l f334692k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f334693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f334694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String[] f334695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String[] f334696d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        i iVar = i.f333905o1;
        i iVar2 = i.f333908p1;
        i iVar3 = i.f333911q1;
        i iVar4 = i.f333863a1;
        i iVar5 = i.f333875e1;
        i iVar6 = i.f333866b1;
        i iVar7 = i.f333878f1;
        i iVar8 = i.f333896l1;
        i iVar9 = i.f333893k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f334687f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.L0, i.M0, i.f333889j0, i.f333892k0, i.H, i.L, i.f333894l};
        f334688g = iVarArr2;
        a aVarE = new a(true).e((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        i0 i0Var = i0.TLS_1_3;
        i0 i0Var2 = i0.TLS_1_2;
        f334689h = aVarE.p(i0Var, i0Var2).n(true).c();
        f334690i = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(i0Var, i0Var2).n(true).c();
        f334691j = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(i0Var, i0Var2, i0.TLS_1_1, i0.TLS_1_0).n(true).c();
        f334692k = new a(false).c();
    }

    public l(boolean z10, boolean z11, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f334693a = z10;
        this.f334694b = z11;
        this.f334695c = strArr;
        this.f334696d = strArr2;
    }

    private final l j(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f334695c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = jk.f.L(enabledCipherSuites, this.f334695c, i.f333864b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f334696d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = jk.f.L(enabledProtocols, this.f334696d, kotlin.comparisons.a.q());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iD = jk.f.D(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f333864b.c());
        if (z10 && iD != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iD];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = jk.f.r(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarD = aVar.d((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarD.o((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).c();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "cipherSuites", imports = {}))
    @oj.i(name = "-deprecated_cipherSuites")
    @Nullable
    public final List<i> a() {
        return g();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "supportsTlsExtensions", imports = {}))
    @oj.i(name = "-deprecated_supportsTlsExtensions")
    public final boolean b() {
        return this.f334694b;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "tlsVersions", imports = {}))
    @oj.i(name = "-deprecated_tlsVersions")
    @Nullable
    public final List<i0> c() {
        return l();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f334693a;
        l lVar = (l) obj;
        if (z10 != lVar.f334693a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f334695c, lVar.f334695c) && Arrays.equals(this.f334696d, lVar.f334696d) && this.f334694b == lVar.f334694b);
    }

    public final void f(@NotNull SSLSocket sslSocket, boolean z10) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        l lVarJ = j(sslSocket, z10);
        if (lVarJ.l() != null) {
            sslSocket.setEnabledProtocols(lVarJ.f334696d);
        }
        if (lVarJ.g() != null) {
            sslSocket.setEnabledCipherSuites(lVarJ.f334695c);
        }
    }

    @oj.i(name = "cipherSuites")
    @Nullable
    public final List<i> g() {
        String[] strArr = this.f334695c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f333864b.b(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean h(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f334693a) {
            return false;
        }
        String[] strArr = this.f334696d;
        if (strArr != null && !jk.f.z(strArr, socket.getEnabledProtocols(), kotlin.comparisons.a.q())) {
            return false;
        }
        String[] strArr2 = this.f334695c;
        return strArr2 == null || jk.f.z(strArr2, socket.getEnabledCipherSuites(), i.f333864b.c());
    }

    public int hashCode() {
        if (!this.f334693a) {
            return 17;
        }
        String[] strArr = this.f334695c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f334696d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f334694b ? 1 : 0);
    }

    @oj.i(name = "isTls")
    public final boolean i() {
        return this.f334693a;
    }

    @oj.i(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.f334694b;
    }

    @oj.i(name = "tlsVersions")
    @Nullable
    public final List<i0> l() {
        String[] strArr = this.f334696d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i0.f333933b.a(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    @NotNull
    public String toString() {
        if (!this.f334693a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(g(), "[all enabled]") + ", tlsVersions=" + Objects.toString(l(), "[all enabled]") + ", supportsTlsExtensions=" + this.f334694b + ')';
    }

    @SourceDebugExtension({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f334697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private String[] f334698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String[] f334699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f334700d;

        public a(boolean z10) {
            this.f334697a = z10;
        }

        @NotNull
        public final a a() {
            if (!this.f334697a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.f334698b = null;
            return this;
        }

        @NotNull
        public final a b() {
            if (!this.f334697a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.f334699c = null;
            return this;
        }

        @NotNull
        public final l c() {
            return new l(this.f334697a, this.f334700d, this.f334698b, this.f334699c);
        }

        @NotNull
        public final a d(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f334697a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f334698b = (String[]) cipherSuites.clone();
            return this;
        }

        @NotNull
        public final a e(@NotNull i... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f334697a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.e());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Nullable
        public final String[] f() {
            return this.f334698b;
        }

        public final boolean g() {
            return this.f334700d;
        }

        public final boolean h() {
            return this.f334697a;
        }

        @Nullable
        public final String[] i() {
            return this.f334699c;
        }

        public final void j(@Nullable String[] strArr) {
            this.f334698b = strArr;
        }

        public final void k(boolean z10) {
            this.f334700d = z10;
        }

        public final void l(boolean z10) {
            this.f334697a = z10;
        }

        public final void m(@Nullable String[] strArr) {
            this.f334699c = strArr;
        }

        @kotlin.l(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final a n(boolean z10) {
            if (!this.f334697a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f334700d = z10;
            return this;
        }

        @NotNull
        public final a o(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f334697a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f334699c = (String[]) tlsVersions.clone();
            return this;
        }

        @NotNull
        public final a p(@NotNull i0... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f334697a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (i0 i0Var : tlsVersions) {
                arrayList.add(i0Var.o());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return o((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(@NotNull l connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f334697a = connectionSpec.i();
            this.f334698b = connectionSpec.f334695c;
            this.f334699c = connectionSpec.f334696d;
            this.f334700d = connectionSpec.k();
        }
    }
}
