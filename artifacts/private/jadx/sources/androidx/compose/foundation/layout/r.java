package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,240:1\n110#2:241\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n65#1:241\n*E\n"})
public final class r {

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n1#1,110:1\n66#2,4:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f16372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, boolean z10) {
            super(1);
            this.f16372a = f10;
            this.f16373b = z10;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("aspectRatio");
            t2Var.b().c("ratio", Float.valueOf(this.f16372a));
            t2Var.b().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f16373b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, boolean z10) {
        return a0Var.B2(new AspectRatioElement(f10, z10, androidx.compose.ui.platform.r2.e() ? new a(f10, z10) : androidx.compose.ui.platform.r2.b()));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(a0Var, f10, z10);
    }

    @androidx.compose.runtime.k7
    public static final boolean c(long j10, int i10, int i11) {
        int iR = androidx.compose.ui.unit.b.r(j10);
        if (i10 > androidx.compose.ui.unit.b.p(j10) || iR > i10) {
            return false;
        }
        return i11 <= androidx.compose.ui.unit.b.o(j10) && androidx.compose.ui.unit.b.q(j10) <= i11;
    }
}
