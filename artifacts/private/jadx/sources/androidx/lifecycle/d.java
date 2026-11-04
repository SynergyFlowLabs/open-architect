package androidx.lifecycle;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(26)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f52305a = new d();

    private d() {
    }

    public final long a(@NotNull Duration timeout) {
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        return timeout.toMillis();
    }
}
