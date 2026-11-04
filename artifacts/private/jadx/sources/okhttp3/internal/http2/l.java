package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f334482a = a.f334484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final l f334483b = new a.C2364a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f334484a = new a();

        /* JADX INFO: renamed from: okhttp3.internal.http2.l$a$a, reason: collision with other inner class name */
        private static final class C2364a implements l {
            @Override // okhttp3.internal.http2.l
            public boolean a(int i10, @NotNull List<c> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.l
            public boolean b(int i10, @NotNull List<c> responseHeaders, boolean z10) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.l
            public boolean c(int i10, @NotNull okio.n source, int i11, boolean z10) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // okhttp3.internal.http2.l
            public void d(int i10, @NotNull b errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        private a() {
        }
    }

    boolean a(int i10, @NotNull List<c> list);

    boolean b(int i10, @NotNull List<c> list, boolean z10);

    boolean c(int i10, @NotNull okio.n nVar, int i11, boolean z10) throws IOException;

    void d(int i10, @NotNull b bVar);
}
