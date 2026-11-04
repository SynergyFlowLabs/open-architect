package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.c0;
import okhttp3.internal.platform.android.i;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@jk.c
@SourceDebugExtension({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
public final class b extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f334533h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f334534i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<k> f334535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.platform.android.h f334536g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f334534i;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.platform.b$b, reason: collision with other inner class name */
    public static final class C2370b implements mk.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final X509TrustManager f334537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Method f334538b;

        public C2370b(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f334537a = trustManager;
            this.f334538b = findByIssuerAndSignatureMethod;
        }

        private final X509TrustManager b() {
            return this.f334537a;
        }

        private final Method c() {
            return this.f334538b;
        }

        public static /* synthetic */ C2370b e(C2370b c2370b, X509TrustManager x509TrustManager, Method method, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                x509TrustManager = c2370b.f334537a;
            }
            if ((i10 & 2) != 0) {
                method = c2370b.f334538b;
            }
            return c2370b.d(x509TrustManager, method);
        }

        @Override // mk.e
        @Nullable
        public X509Certificate a(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f334538b.invoke(this.f334537a, cert);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        @NotNull
        public final C2370b d(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            return new C2370b(trustManager, findByIssuerAndSignatureMethod);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2370b)) {
                return false;
            }
            C2370b c2370b = (C2370b) obj;
            return Intrinsics.areEqual(this.f334537a, c2370b.f334537a) && Intrinsics.areEqual(this.f334538b, c2370b.f334538b);
        }

        public int hashCode() {
            return (this.f334537a.hashCode() * 31) + this.f334538b.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f334537a + ", findByIssuerAndSignatureMethod=" + this.f334538b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.f334560a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f334534i = z10;
    }

    public b() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new k[]{l.a.b(l.f334530j, null, 1, null), new j(okhttp3.internal.platform.android.f.f334512f.d()), new j(i.f334526a.a()), new j(okhttp3.internal.platform.android.g.f334520a.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f334535f = arrayList;
        this.f334536g = okhttp3.internal.platform.android.h.f334522d.a();
    }

    @Override // okhttp3.internal.platform.h
    @NotNull
    public mk.c d(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        okhttp3.internal.platform.android.b bVarA = okhttp3.internal.platform.android.b.f334504d.a(trustManager);
        return bVarA != null ? bVarA : super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.h
    @NotNull
    public mk.e e(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new C2370b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.e(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.h
    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<c0> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.f334535f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            kVar.d(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.h
    public void g(@NotNull Socket socket, @NotNull InetSocketAddress address, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i10);
    }

    @Override // okhttp3.internal.platform.h
    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.f334535f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.h
    @Nullable
    public Object k(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f334536g.a(closer);
    }

    @Override // okhttp3.internal.platform.h
    public boolean l(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.h
    public void o(@NotNull String message, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f334536g.b(obj)) {
            return;
        }
        h.n(this, message, 5, null, 4, null);
    }

    @Override // okhttp3.internal.platform.h
    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sslSocketFactory) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f334535f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).f(sslSocketFactory));
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.e(sslSocketFactory);
        }
        return null;
    }
}
