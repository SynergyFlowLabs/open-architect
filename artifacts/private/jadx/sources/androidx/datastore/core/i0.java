package androidx.datastore.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class i0<T> extends p0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Throwable f49507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@NotNull Throwable readException, int i10) {
        super(i10, null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        boolean z10 = true;
        this.f49507b = readException;
    }

    @NotNull
    public final Throwable b() {
        return this.f49507b;
    }
}
