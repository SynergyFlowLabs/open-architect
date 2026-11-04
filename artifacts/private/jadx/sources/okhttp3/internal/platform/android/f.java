package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class f implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f334512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final j.a f334513g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? super SSLSocket> f334514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Method f334515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f334516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f334517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f334518e;

    public static final class a {

        /* JADX INFO: renamed from: okhttp3.internal.platform.android.f$a$a, reason: collision with other inner class name */
        public static final class C2369a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f334519a;

            C2369a(String str) {
                this.f334519a = str;
            }

            @Override // okhttp3.internal.platform.android.j.a
            public boolean a(@NotNull SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.u2(name, this.f334519a + '.', false, 2, null);
            }

            @Override // okhttp3.internal.platform.android.j.a
            @NotNull
            public k b(@NotNull SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return f.f334512f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new f(superclass);
        }

        @NotNull
        public final j.a c(@NotNull String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C2369a(packageName);
        }

        @NotNull
        public final j.a d() {
            return f.f334513g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f334512f = aVar;
        f334513g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(@NotNull Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f334514a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f334515b = declaredMethod;
        this.f334516c = sslSocketClass.getMethod("setHostname", String.class);
        this.f334517d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f334518e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f334514a.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.k
    public boolean b() {
        return okhttp3.internal.platform.b.f334533h.b();
    }

    @Override // okhttp3.internal.platform.android.k
    @Nullable
    public String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f334517d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // okhttp3.internal.platform.android.k
    public void d(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends c0> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f334515b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f334516c.invoke(sslSocket, str);
                }
                this.f334518e.invoke(sslSocket, okhttp3.internal.platform.h.f334560a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
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
