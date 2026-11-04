package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.u;
import okio.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C2360a f334210c = new C2360a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f334211d = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f334212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f334213b;

    /* JADX INFO: renamed from: okhttp3.internal.http1.a$a, reason: collision with other inner class name */
    public static final class C2360a {
        public /* synthetic */ C2360a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2360a() {
        }
    }

    public a(@NotNull n source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f334212a = source;
        this.f334213b = PlaybackStateCompat.f9655k3;
    }

    @NotNull
    public final n a() {
        return this.f334212a;
    }

    @NotNull
    public final u b() throws IOException {
        u.a aVar = new u.a();
        while (true) {
            String strC = c();
            if (strC.length() == 0) {
                return aVar.i();
            }
            aVar.f(strC);
        }
    }

    @NotNull
    public final String c() throws IOException {
        String strR9 = this.f334212a.R9(this.f334213b);
        this.f334213b -= (long) strR9.length();
        return strR9;
    }
}
