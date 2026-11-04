package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,260:1\n223#1:261\n223#1:283\n119#2,10:262\n119#2,10:273\n119#2,10:284\n71#3:272\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n216#1:261\n244#1:283\n216#1:262,10\n223#1:273,10\n244#1:284,10\n219#1:272\n*E\n"})
public final class e1 implements z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12899f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f12902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12904e;

    public e1() {
        this(0, 0, null, 7, null);
    }

    private final long h(long j10) {
        long j11 = j10 - this.f12904e;
        long j12 = this.f12903d;
        if (j11 < 0) {
            j11 = 0;
        }
        return j11 > j12 ? j12 : j11;
    }

    @Override // androidx.compose.animation.core.z0
    public float b(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f12904e;
        long j12 = this.f12903d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f12;
        }
        return (g(j13, f10, f11, f12) - g(j13 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.z0
    public long c(float f10, float f11, float f12) {
        return this.f12904e + this.f12903d;
    }

    @Override // androidx.compose.animation.core.z0
    public float g(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f12904e;
        long j12 = this.f12903d;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        float fA = this.f12902c.a(this.f12900a == 0 ? 1.0f : j11 / j12);
        return (f10 * (1 - fA)) + (f11 * fA);
    }

    public final int i() {
        return this.f12901b;
    }

    public final int j() {
        return this.f12900a;
    }

    public e1(int i10, int i11, @NotNull l0 l0Var) {
        this.f12900a = i10;
        this.f12901b = i11;
        this.f12902c = l0Var;
        this.f12903d = ((long) i10) * 1000000;
        this.f12904e = ((long) i11) * 1000000;
    }

    public /* synthetic */ e1(int i10, int i11, l0 l0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? u0.d() : l0Var);
    }
}
