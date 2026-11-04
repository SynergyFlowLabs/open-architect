package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1089:1\n65#2:1090\n69#2:1093\n69#2:1095\n65#2:1098\n60#3:1091\n70#3:1094\n70#3:1096\n60#3:1099\n53#3,3:1101\n53#3,3:1105\n22#4:1092\n22#4:1097\n30#5:1100\n30#5:1104\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/TouchSlopDetector\n*L\n925#1:1090\n925#1:1093\n927#1:1095\n927#1:1098\n925#1:1091\n925#1:1094\n927#1:1096\n927#1:1099\n975#1:1101,3\n977#1:1105,3\n925#1:1092\n927#1:1097\n975#1:1100\n977#1:1104\n*E\n"})
public final class h5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14606c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final q3 f14607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14608b;

    public /* synthetic */ h5(q3 q3Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, j10);
    }

    private final long b(float f10) {
        if (this.f14607a == null) {
            long j10 = this.f14608b;
            return n0.g.v(this.f14608b, n0.g.y(n0.g.j(j10, n0.g.m(j10)), f10));
        }
        float fE = e(this.f14608b) - (Math.signum(e(this.f14608b)) * f10);
        float fC = c(this.f14608b);
        if (this.f14607a != q3.Horizontal) {
            return n0.g.g((((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fE)) & com.rabbitmq.client.k0.f265952a));
        }
        return n0.g.g((((long) Float.floatToRawIntBits(fC)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fE) << 32));
    }

    public final long a(@NotNull androidx.compose.ui.input.pointer.c0 c0Var, float f10) {
        long jW = n0.g.w(this.f14608b, n0.g.v(c0Var.u(), c0Var.y()));
        this.f14608b = jW;
        return (this.f14607a == null ? n0.g.m(jW) : Math.abs(e(jW))) >= f10 ? b(f10) : n0.g.f332700b.c();
    }

    public final float c(long j10) {
        return Float.intBitsToFloat((int) (this.f14607a == q3.Horizontal ? j10 & com.rabbitmq.client.k0.f265952a : j10 >> 32));
    }

    @Nullable
    public final q3 d() {
        return this.f14607a;
    }

    public final float e(long j10) {
        return Float.intBitsToFloat((int) (this.f14607a == q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
    }

    public final void f() {
        this.f14608b = n0.g.f332700b.e();
    }

    private h5(q3 q3Var, long j10) {
        this.f14607a = q3Var;
        this.f14608b = j10;
    }

    public /* synthetic */ h5(q3 q3Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : q3Var, (i10 & 2) != 0 ? n0.g.f332700b.e() : j10, null);
    }
}
