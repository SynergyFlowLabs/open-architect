package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class c1 implements a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12853c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12855b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c1() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    @Override // androidx.compose.animation.core.a1
    public float a() {
        return this.f12854a;
    }

    @Override // androidx.compose.animation.core.a1
    public float b(long j10, float f10, float f11) {
        return f11 * ((float) Math.exp(((j10 / 1000000) / 1000.0f) * this.f12855b));
    }

    @Override // androidx.compose.animation.core.a1
    public long c(float f10, float f11) {
        return ((long) ((((float) Math.log(a() / Math.abs(f11))) * 1000.0f) / this.f12855b)) * 1000000;
    }

    @Override // androidx.compose.animation.core.a1
    public float d(float f10, float f11) {
        if (Math.abs(f11) <= a()) {
            return f10;
        }
        double dLog = Math.log(Math.abs(a() / f11));
        float f12 = this.f12855b;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((((double) f12) * ((dLog / ((double) f12)) * ((double) 1000))) / ((double) 1000.0f))));
    }

    @Override // androidx.compose.animation.core.a1
    public float e(long j10, float f10, float f11) {
        float f12 = this.f12855b;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((f12 * (j10 / 1000000)) / 1000.0f)));
    }

    public c1(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f11) {
        this.f12854a = Math.max(1.0E-7f, Math.abs(f11));
        this.f12855b = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    public /* synthetic */ c1(float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.1f : f11);
    }
}
