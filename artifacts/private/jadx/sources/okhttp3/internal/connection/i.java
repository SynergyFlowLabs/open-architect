package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IOException f334160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private IOException f334161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f334160a = firstConnectException;
        this.f334161b = firstConnectException;
    }

    public final void a(@NotNull IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        p.a(this.f334160a, e10);
        this.f334161b = e10;
    }

    @NotNull
    public final IOException b() {
        return this.f334160a;
    }

    @NotNull
    public final IOException c() {
        return this.f334161b;
    }
}
