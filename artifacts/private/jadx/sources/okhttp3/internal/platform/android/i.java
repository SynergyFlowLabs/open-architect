package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.c0;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f334526a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final j.a f334527b = new a();

    public static final class a implements j.a {
        a() {
        }

        @Override // okhttp3.internal.platform.android.j.a
        public boolean a(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return okhttp3.internal.platform.d.f334542g.d() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // okhttp3.internal.platform.android.j.a
        @NotNull
        public k b(@NotNull SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j.a a() {
            return i.f334527b;
        }

        private b() {
        }
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean b() {
        return okhttp3.internal.platform.d.f334542g.d();
    }

    @Override // okhttp3.internal.platform.android.k
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.k
    public void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends c0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) okhttp3.internal.platform.h.f334560a.b(protocols).toArray(new String[0]));
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
