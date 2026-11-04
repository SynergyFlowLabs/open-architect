package androidx.compose.foundation.text;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,130:1\n110#2:131\n97#3,4:132\n97#3,4:136\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n56#1:131\n123#1:132,4\n126#1:136,4\n*E\n"})
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20500a = 1;

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,110:1\n57#2,5:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f20503c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, androidx.compose.ui.text.y3 y3Var) {
            super(1);
            this.f20501a = i10;
            this.f20502b = i11;
            this.f20503c = y3Var;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("heightInLines");
            t2Var.b().c("minLines", Integer.valueOf(this.f20501a));
            t2Var.b().c("maxLines", Integer.valueOf(this.f20502b));
            t2Var.b().c("textStyle", this.f20503c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,130:1\n75#2:131\n75#2:132\n75#2:133\n1282#3,6:134\n1282#3,6:140\n1282#3,3:146\n1285#3,3:151\n1282#3,3:154\n1285#3,3:159\n59#4:149\n59#4:157\n90#5:150\n90#5:158\n85#6:162\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n66#1:131\n67#1:132\n68#1:133\n73#1:134,6\n75#1:140,6\n85#1:146,3\n85#1:151,3\n97#1:154,3\n97#1:159,3\n93#1:149\n106#1:157\n93#1:150\n106#1:158\n75#1:162\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f20505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.y3 f20506c;

        b(int i10, int i11, androidx.compose.ui.text.y3 y3Var) {
            this.f20504a = i10;
            this.f20505b = i11;
            this.f20506c = y3Var;
        }

        private static final Object d(androidx.compose.runtime.n7<? extends Object> n7Var) {
            return n7Var.getValue();
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(408240218);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:62)");
            }
            m3.c(this.f20504a, this.f20505b);
            if (this.f20504a == 1 && this.f20505b == Integer.MAX_VALUE) {
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var.A();
                return aVar;
            }
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.ui.text.font.y.b bVar = (androidx.compose.ui.text.font.y.b) c0Var.W(androidx.compose.ui.platform.q1.o());
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) c0Var.W(androidx.compose.ui.platform.q1.u());
            boolean zD = c0Var.D(this.f20506c) | c0Var.K(wVar.ordinal());
            androidx.compose.ui.text.y3 y3Var = this.f20506c;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.ui.text.z3.d(y3Var, wVar);
                c0Var.Y(objI0);
            }
            androidx.compose.ui.text.y3 y3Var2 = (androidx.compose.ui.text.y3) objI0;
            boolean zD2 = c0Var.D(bVar) | c0Var.D(y3Var2);
            Object objI1 = c0Var.i0();
            if (zD2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                androidx.compose.ui.text.font.y yVarV = y3Var2.v();
                androidx.compose.ui.text.font.v0 v0VarA = y3Var2.A();
                if (v0VarA == null) {
                    v0VarA = androidx.compose.ui.text.font.v0.f41742b.m();
                }
                androidx.compose.ui.text.font.q0 q0VarY = y3Var2.y();
                int iJ = q0VarY != null ? q0VarY.j() : androidx.compose.ui.text.font.q0.f41690b.c();
                androidx.compose.ui.text.font.r0 r0VarZ = y3Var2.z();
                objI1 = bVar.b(yVarV, v0VarA, iJ, r0VarZ != null ? r0VarZ.m() : androidx.compose.ui.text.font.r0.f41699b.a());
                c0Var.Y(objI1);
            }
            androidx.compose.runtime.n7 n7Var = (androidx.compose.runtime.n7) objI1;
            boolean zD3 = c0Var.D(d(n7Var)) | c0Var.D(dVar) | c0Var.D(bVar) | c0Var.D(this.f20506c) | c0Var.K(wVar.ordinal());
            Object objI2 = c0Var.i0();
            if (zD3 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = Integer.valueOf((int) (r5.a(y3Var2, dVar, bVar, r5.d(), 1) & com.rabbitmq.client.k0.f265952a));
                c0Var.Y(objI2);
            }
            int iIntValue = ((Number) objI2).intValue();
            boolean zK = c0Var.K(wVar.ordinal()) | c0Var.D(dVar) | c0Var.D(bVar) | c0Var.D(this.f20506c) | c0Var.D(d(n7Var));
            Object objI3 = c0Var.i0();
            if (zK || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = Integer.valueOf((int) (r5.a(y3Var2, dVar, bVar, r5.d() + '\n' + r5.d(), 2) & com.rabbitmq.client.k0.f265952a));
                c0Var.Y(objI3);
            }
            int iIntValue2 = ((Number) objI3).intValue() - iIntValue;
            int i11 = this.f20504a;
            int i12 = 7 | 0;
            Integer numValueOf = i11 == 1 ? null : Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue);
            int i13 = this.f20505b;
            Integer numValueOf2 = i13 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i13 - 1))) : null;
            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.layout.i6.j(androidx.compose.ui.a0.E, numValueOf != null ? dVar.D3(numValueOf.intValue()) : androidx.compose.ui.unit.h.f42689b.e(), numValueOf2 != null ? dVar.D3(numValueOf2.intValue()) : androidx.compose.ui.unit.h.f42689b.e());
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarJ;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(a0Var, c0Var, num.intValue());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.text.y3 y3Var, int i10, int i11) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new a(i10, i11, y3Var) : androidx.compose.ui.platform.r2.b(), new b(i10, i11, y3Var));
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, androidx.compose.ui.text.y3 y3Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 1;
        }
        if ((i12 & 4) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(a0Var, y3Var, i10, i11);
    }

    public static final void c(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            androidx.compose.foundation.internal.e.g("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (!(i10 <= i11)) {
            androidx.compose.foundation.internal.e.g("minLines " + i10 + " must be less than or equal to maxLines " + i11);
        }
    }
}
