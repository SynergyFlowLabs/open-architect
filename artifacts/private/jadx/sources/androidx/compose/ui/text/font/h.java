package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class h implements g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41597c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41598b;

    public h(int i10) {
        this.f41598b = i10;
    }

    private final int e() {
        return this.f41598b;
    }

    public static /* synthetic */ h g(h hVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = hVar.f41598b;
        }
        return hVar.f(i10);
    }

    @Override // androidx.compose.ui.text.font.g1
    @NotNull
    public v0 b(@NotNull v0 v0Var) {
        int i10 = this.f41598b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? v0Var : new v0(kotlin.ranges.r.I(v0Var.O() + this.f41598b, 1, 1000));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f41598b == ((h) obj).f41598b;
    }

    @NotNull
    public final h f(int i10) {
        return new h(i10);
    }

    public int hashCode() {
        return Integer.hashCode(this.f41598b);
    }

    @NotNull
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f41598b + ')';
    }
}
