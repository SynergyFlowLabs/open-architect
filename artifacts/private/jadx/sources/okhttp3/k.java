package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.connection.g f334685a;

    public k(@NotNull okhttp3.internal.connection.g delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f334685a = delegate;
    }

    public final int a() {
        return this.f334685a.d();
    }

    public final void b() {
        this.f334685a.e();
    }

    @NotNull
    public final okhttp3.internal.connection.g c() {
        return this.f334685a;
    }

    public final int d() {
        return this.f334685a.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, @NotNull TimeUnit timeUnit) {
        this(new okhttp3.internal.connection.g(okhttp3.internal.concurrent.d.f334058i, i10, j10, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
