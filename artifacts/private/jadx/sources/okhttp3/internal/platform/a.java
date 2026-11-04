package okhttp3.internal.platform;

import android.security.NetworkSecurityPolicy;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@jk.c
@SourceDebugExtension({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
public final class a extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C2367a f334500g = new C2367a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f334501h = h.f334560a.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<k> f334502f;

    /* JADX INFO: renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name */
    public static final class C2367a {
        public /* synthetic */ C2367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f334501h;
        }

        private C2367a() {
        }
    }

    public a() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new k[]{okhttp3.internal.platform.android.a.f334503a.a(), new j(okhttp3.internal.platform.android.f.f334512f.d()), new j(i.f334526a.a()), new j(okhttp3.internal.platform.android.g.f334520a.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f334502f = arrayList;
    }

    @Override // okhttp3.internal.platform.h
    @NotNull
    public mk.c d(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        okhttp3.internal.platform.android.b bVarA = okhttp3.internal.platform.android.b.f334504d.a(trustManager);
        return bVarA != null ? bVarA : super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.h
    public void f(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends c0> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.f334502f.iterator();
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
    @Nullable
    public String j(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.f334502f.iterator();
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
    @e.a({"NewApi"})
    public boolean l(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.h
    @Nullable
    public X509TrustManager s(@NotNull SSLSocketFactory sslSocketFactory) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f334502f.iterator();
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
