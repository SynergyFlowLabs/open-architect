package mk;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f332679a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return h.f334560a.g().d(trustManager);
        }

        @NotNull
        public final c b(@NotNull X509Certificate... caCerts) {
            Intrinsics.checkNotNullParameter(caCerts, "caCerts");
            return new mk.a(new b((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }

        private a() {
        }
    }

    @NotNull
    public abstract List<Certificate> a(@NotNull List<? extends Certificate> list, @NotNull String str) throws SSLPeerUnverifiedException;
}
