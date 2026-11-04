package androidx.room;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements w3.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w3.e.c f74811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f74812b;

    public f(@NotNull w3.e.c delegate, @NotNull d autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f74811a = delegate;
        this.f74812b = autoCloser;
    }

    @Override // w3.e.c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(@NotNull w3.e.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new e(this.f74811a.a(configuration), this.f74812b);
    }
}
