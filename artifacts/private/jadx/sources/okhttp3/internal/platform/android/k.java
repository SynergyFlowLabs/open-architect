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
public interface k {

    public static final class a {
        public static boolean a(@NotNull k kVar, @NotNull SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            return false;
        }

        @Nullable
        public static X509TrustManager b(@NotNull k kVar, @NotNull SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    boolean a(@NotNull SSLSocket sSLSocket);

    boolean b();

    @Nullable
    String c(@NotNull SSLSocket sSLSocket);

    void d(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends c0> list);

    @Nullable
    X509TrustManager e(@NotNull SSLSocketFactory sSLSocketFactory);

    boolean f(@NotNull SSLSocketFactory sSLSocketFactory);
}
