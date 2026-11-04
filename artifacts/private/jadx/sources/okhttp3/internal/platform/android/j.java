package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f334528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private k f334529b;

    public interface a {
        boolean a(@NotNull SSLSocket sSLSocket);

        @NotNull
        k b(@NotNull SSLSocket sSLSocket);
    }

    public j(@NotNull a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f334528a = socketAdapterFactory;
    }

    private final synchronized k g(SSLSocket sSLSocket) {
        try {
            if (this.f334529b == null && this.f334528a.a(sSLSocket)) {
                this.f334529b = this.f334528a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334529b;
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f334528a.a(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean b() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.k
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        k kVarG = g(sslSocket);
        if (kVarG != null) {
            return kVarG.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.k
    public void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends c0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        k kVarG = g(sslSocket);
        if (kVarG != null) {
            kVarG.d(sslSocket, str, protocols);
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
