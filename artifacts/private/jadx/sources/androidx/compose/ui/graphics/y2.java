package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f38707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38711e;

    public y2(@NotNull int[] iArr, int i10, int i11, int i12, int i13) {
        this.f38707a = iArr;
        this.f38708b = i10;
        this.f38709c = i11;
        this.f38710d = i12;
        this.f38711e = i13;
    }

    public final long a(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        return s0.b(this.f38707a[this.f38710d + (i11 * this.f38711e) + i10]);
    }

    @NotNull
    public final int[] b() {
        return this.f38707a;
    }

    public final int c() {
        return this.f38710d;
    }

    public final int d() {
        return this.f38709c;
    }

    public final int e() {
        return this.f38711e;
    }

    public final int f() {
        return this.f38708b;
    }
}
