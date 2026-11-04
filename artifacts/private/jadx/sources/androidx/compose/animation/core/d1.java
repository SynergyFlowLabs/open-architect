package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatSpringSpec\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,260:1\n32#2:261\n35#2:264\n60#3:262\n70#3:265\n22#4:263\n22#4:266\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatSpringSpec\n*L\n154#1:261\n166#1:264\n154#1:262\n166#1:265\n154#1:263\n166#1:266\n*E\n"})
public final class d1 implements z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12869e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f12872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final o2 f12873d;

    public d1() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // androidx.compose.animation.core.z0
    public float b(long j10, float f10, float f11, float f12) {
        this.f12873d.f(f11);
        return Float.intBitsToFloat((int) (this.f12873d.h(f10, f12, j10 / 1000000) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.animation.core.z0
    public long c(float f10, float f11, float f12) {
        float fD = this.f12873d.d();
        float fB = this.f12873d.b();
        float f13 = this.f12872c;
        return n2.c(fD, fB, f12 / f13, (f10 - f11) / f13, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.z0
    public float f(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.z0
    public float g(long j10, float f10, float f11, float f12) {
        this.f12873d.f(f11);
        return Float.intBitsToFloat((int) (this.f12873d.h(f10, f12, j10 / 1000000) >> 32));
    }

    public final float h() {
        return this.f12870a;
    }

    public final float i() {
        return this.f12871b;
    }

    public d1(float f10, float f11, float f12) {
        this.f12870a = f10;
        this.f12871b = f11;
        this.f12872c = f12;
        o2 o2Var = new o2(1.0f);
        o2Var.e(f10);
        o2Var.g(f11);
        this.f12873d = o2Var;
    }

    public /* synthetic */ d1(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
