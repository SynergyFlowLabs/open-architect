package androidx.compose.animation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class m1 implements androidx.compose.animation.core.a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13673b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k0 f13674a;

    public m1(@NotNull androidx.compose.ui.unit.d dVar) {
        this.f13674a = new k0(n1.a(), dVar);
    }

    private final float f(float f10) {
        return this.f13674a.b(f10) * Math.signum(f10);
    }

    @Override // androidx.compose.animation.core.a1
    public float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.a1
    public float b(long j10, float f10, float f11) {
        return this.f13674a.d(f11).j(j10 / 1000000);
    }

    @Override // androidx.compose.animation.core.a1
    public long c(float f10, float f11) {
        return this.f13674a.c(f11) * 1000000;
    }

    @Override // androidx.compose.animation.core.a1
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // androidx.compose.animation.core.a1
    public float e(long j10, float f10, float f11) {
        return f10 + this.f13674a.d(f11).i(j10 / 1000000);
    }
}
