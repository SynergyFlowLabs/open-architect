package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.f0;
import okhttp3.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f334069b = new a();

    private a() {
    }

    @Override // okhttp3.w
    @NotNull
    public f0 intercept(@NotNull w.a chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.g gVar = (okhttp3.internal.http.g) chain;
        return okhttp3.internal.http.g.j(gVar, 0, gVar.k().s(gVar), null, 0, 0, 0, 61, null).c(gVar.o());
    }
}
