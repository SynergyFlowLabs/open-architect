package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import okhttp3.b0;
import okhttp3.c0;
import okio.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f334560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static volatile h f334561b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f334562c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f334563d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f334564e;

    @SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h d() {
            okhttp3.internal.platform.android.c.f334507a.b();
            h hVarA = okhttp3.internal.platform.a.f334500g.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f334533h.a();
            Intrinsics.checkNotNull(hVarA2);
            return hVarA2;
        }

        private final h e() {
            g gVarA;
            c cVarA;
            d dVarC;
            if (j() && (dVarC = d.f334542g.c()) != null) {
                return dVarC;
            }
            if (i() && (cVarA = c.f334539g.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.f334557g.a()) != null) {
                return gVarA;
            }
            f fVarA = f.f334555f.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f334546k.a();
            return hVarA != null ? hVarA : new h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return Intrinsics.areEqual("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
        }

        public static /* synthetic */ void m(a aVar, h hVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hVar = aVar.f();
            }
            aVar.l(hVar);
        }

        @NotNull
        public final List<String> b(@NotNull List<? extends c0> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((c0) obj) != c0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c0) it.next()).toString());
            }
            return arrayList2;
        }

        @NotNull
        public final byte[] c(@NotNull List<? extends c0> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            l lVar = new l();
            for (String str : b(protocols)) {
                lVar.writeByte(str.length());
                lVar.pa(str);
            }
            return lVar.Y5();
        }

        @n
        @NotNull
        public final h g() {
            return h.f334561b;
        }

        public final boolean h() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void l(@NotNull h platform) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            h.f334561b = platform;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f334560a = aVar;
        f334561b = aVar.f();
        f334564e = Logger.getLogger(b0.class.getName());
    }

    @n
    @NotNull
    public static final h h() {
        return f334560a.g();
    }

    public static /* synthetic */ void n(h hVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        hVar.m(str, i10, th2);
    }

    public void c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public mk.c d(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new mk.a(e(trustManager));
    }

    @NotNull
    public mk.e e(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new mk.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<c0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void g(@NotNull Socket socket, @NotNull InetSocketAddress address, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i10);
    }

    @NotNull
    public final String i() {
        return "OkHttp";
    }

    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Nullable
    public Object k(@NotNull String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f334564e.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean l(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void m(@NotNull String message, int i10, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        f334564e.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void o(@NotNull String message, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m(message, 5, (Throwable) obj);
    }

    @NotNull
    public SSLContext p() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory q(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextP = p();
            sSLContextP.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextP.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    @NotNull
    public X509TrustManager r() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sslSocketFactory) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            Intrinsics.checkNotNullExpressionValue(sslContextClass, "sslContextClass");
            Object objU = jk.f.U(sslSocketFactory, sslContextClass, "context");
            if (objU == null) {
                return null;
            }
            return (X509TrustManager) jk.f.U(objU, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e10) {
            if (!Intrinsics.areEqual(e10.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e10;
            }
            return null;
        }
    }

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
