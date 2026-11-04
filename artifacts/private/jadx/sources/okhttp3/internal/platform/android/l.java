package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f334530j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Class<? super SSLSocketFactory> f334531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Class<?> f334532i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        @Nullable
        public final k a(@NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new l(cls, cls2, paramsClass);
            } catch (Exception e10) {
                okhttp3.internal.platform.h.f334560a.g().m("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Class<? super SSLSocket> sslSocketClass, @NotNull Class<? super SSLSocketFactory> sslSocketFactoryClass, @NotNull Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f334531h = sslSocketFactoryClass;
        this.f334532i = paramClass;
    }

    @Override // okhttp3.internal.platform.android.f, okhttp3.internal.platform.android.k
    @Nullable
    public X509TrustManager e(@NotNull SSLSocketFactory sslSocketFactory) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Object objU = jk.f.U(sslSocketFactory, this.f334532i, "sslParameters");
        Intrinsics.checkNotNull(objU);
        X509TrustManager x509TrustManager = (X509TrustManager) jk.f.U(objU, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) jk.f.U(objU, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // okhttp3.internal.platform.android.f, okhttp3.internal.platform.android.k
    public boolean f(@NotNull SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return this.f334531h.isInstance(sslSocketFactory);
    }
}
