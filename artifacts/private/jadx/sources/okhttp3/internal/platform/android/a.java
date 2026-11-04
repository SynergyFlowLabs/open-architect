package okhttp3.internal.platform.android;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@e.a({"NewApi"})
@jk.c
@SourceDebugExtension({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n60#1:78,2\n*E\n"})
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2368a f334503a = new C2368a(null);

    /* JADX INFO: renamed from: okhttp3.internal.platform.android.a$a, reason: collision with other inner class name */
    @jk.c
    public static final class C2368a {
        public /* synthetic */ C2368a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return okhttp3.internal.platform.h.f334560a.h();
        }

        private C2368a() {
        }
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean b() {
        return f334503a.b();
    }

    @Override // okhttp3.internal.platform.android.k
    @e.a({"NewApi"})
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            applicationProtocol = null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.k
    @e.a({"NewApi"})
    public void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends c0> protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            int i10 = 2 & 0;
            sSLParameters.setApplicationProtocols((String[]) okhttp3.internal.platform.h.f334560a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
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
