package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.c0;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n37#2,2:69\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n53#1:69,2\n*E\n"})
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f334520a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final j.a f334521b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // okhttp3.internal.platform.android.j.a
        public boolean a(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            okhttp3.internal.platform.c.f334539g.b();
            return false;
        }

        @Override // okhttp3.internal.platform.android.j.a
        @NotNull
        public k b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new g();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j.a a() {
            return g.f334521b;
        }

        private b() {
        }
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean b() {
        return okhttp3.internal.platform.c.f334539g.b();
    }

    @Override // okhttp3.internal.platform.android.k
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            zAreEqual = true;
            int i10 = 4 ^ 1;
        } else {
            zAreEqual = Intrinsics.areEqual(applicationProtocol, "");
        }
        if (zAreEqual) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.k
    public void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends c0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) okhttp3.internal.platform.h.f334560a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.k
    @Nullable
    public X509TrustManager e(@NotNull SSLSocketFactory sSLSocketFactory) {
        return k.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean f(@NotNull SSLSocketFactory sSLSocketFactory) {
        return k.a.a(this, sSLSocketFactory);
    }
}
