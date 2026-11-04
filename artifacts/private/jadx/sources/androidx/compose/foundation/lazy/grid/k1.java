package androidx.compose.foundation.lazy.grid;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16850c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f16851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f16852b;

    public k1(@NotNull int[] iArr, @NotNull int[] iArr2) {
        this.f16851a = iArr;
        this.f16852b = iArr2;
    }

    @NotNull
    public final int[] a() {
        return this.f16852b;
    }

    @NotNull
    public final int[] b() {
        return this.f16851a;
    }
}
