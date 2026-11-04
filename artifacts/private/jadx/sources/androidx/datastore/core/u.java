package androidx.datastore.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class u<T> extends p0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f49810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@NotNull Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f49810b = finalException;
    }

    @NotNull
    public final Throwable b() {
        return this.f49810b;
    }
}
