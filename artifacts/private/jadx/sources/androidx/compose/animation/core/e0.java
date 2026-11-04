package androidx.compose.animation.core;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,173:1\n34#2,4:174\n51#3:178\n55#3:180\n22#4:179\n22#4:181\n65#5,10:182\n*S KotlinDebug\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n*L\n114#1:174,4\n119#1:178\n120#1:180\n119#1:179\n120#1:181\n147#1:182,10\n*E\n"})
public final class e0 implements l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12892g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f12895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f12896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f12898f;

    public e0(float f10, float f11, float f12, float f13) {
        this.f12893a = f10;
        this.f12894b = f11;
        this.f12895c = f12;
        this.f12896d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            c2.d("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jE = androidx.compose.ui.graphics.c0.e(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f12897e = Float.intBitsToFloat((int) (jE >> 32));
        this.f12898f = Float.intBitsToFloat((int) (jE & com.rabbitmq.client.k0.f265952a));
    }

    private final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f12893a + ", " + this.f12894b + ", " + this.f12895c + ", " + this.f12896d + ") has no solution at " + f10);
    }

    @Override // androidx.compose.animation.core.l0
    public float a(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            float fMax = Math.max(f10, 1.1920929E-7f);
            float fV = androidx.compose.ui.graphics.c0.v(0.0f - fMax, this.f12893a - fMax, this.f12895c - fMax, 1.0f - fMax);
            if (Float.isNaN(fV)) {
                b(f10);
            }
            f10 = androidx.compose.ui.graphics.c0.n(this.f12894b, this.f12896d, fV);
            float f11 = this.f12897e;
            float f12 = this.f12898f;
            if (f10 < f11) {
                f10 = f11;
            }
            if (f10 > f12) {
                return f12;
            }
        }
        return f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f12893a == e0Var.f12893a && this.f12894b == e0Var.f12894b && this.f12895c == e0Var.f12895c && this.f12896d == e0Var.f12896d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f12893a) * 31) + Float.hashCode(this.f12894b)) * 31) + Float.hashCode(this.f12895c)) * 31) + Float.hashCode(this.f12896d);
    }

    @NotNull
    public String toString() {
        return "CubicBezierEasing(a=" + this.f12893a + ", b=" + this.f12894b + ", c=" + this.f12895c + ", d=" + this.f12896d + ')';
    }
}
