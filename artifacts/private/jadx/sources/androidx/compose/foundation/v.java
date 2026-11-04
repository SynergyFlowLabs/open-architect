package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,209:1\n110#2:210\n110#2:211\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n57#1:210\n88#1:211\n*E\n"})
public final class v {

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,110:1\n89#2,5:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f21839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.i0 f21840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f21841c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var) {
            super(1);
            this.f21839a = f10;
            this.f21840b = i0Var;
            this.f21841c = q3Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("background");
            t2Var.b().c("alpha", Float.valueOf(this.f21839a));
            t2Var.b().c("brush", this.f21840b);
            t2Var.b().c("shape", this.f21841c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,110:1\n58#2,5:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f21842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f21843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, androidx.compose.ui.graphics.q3 q3Var) {
            super(1);
            this.f21842a = j10;
            this.f21843b = q3Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("background");
            t2Var.e(androidx.compose.ui.graphics.q0.n(this.f21842a));
            t2Var.b().c("color", androidx.compose.ui.graphics.q0.n(this.f21842a));
            t2Var.b().c("shape", this.f21843b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, @NotNull androidx.compose.ui.graphics.q3 q3Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        return a0Var.B2(new BackgroundElement(0L, i0Var, f10, q3Var, androidx.compose.ui.platform.r2.e() ? new a(f10, i0Var, q3Var) : androidx.compose.ui.platform.r2.b(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.i0 i0Var, androidx.compose.ui.graphics.q3 q3Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.ui.graphics.d3.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(a0Var, i0Var, q3Var, f10);
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, long j10, @NotNull androidx.compose.ui.graphics.q3 q3Var) {
        return a0Var.B2(new BackgroundElement(j10, null, 1.0f, q3Var, androidx.compose.ui.platform.r2.e() ? new b(j10, q3Var) : androidx.compose.ui.platform.r2.b(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, long j10, androidx.compose.ui.graphics.q3 q3Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.ui.graphics.d3.a();
        }
        return c(a0Var, j10, q3Var);
    }
}
