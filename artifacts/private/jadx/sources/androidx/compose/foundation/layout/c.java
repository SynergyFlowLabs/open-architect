package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n110#2:365\n110#2:366\n97#3:367\n97#3:368\n97#3:372\n97#3:373\n252#4:369\n252#4:370\n1#5:371\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:365\n119#1:366\n146#1:367\n153#1:368\n323#1:372\n328#1:373\n181#1:369\n184#1:370\n*E\n"})
public final class c {

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,110:1\n76#2,5:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.a f15937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f15938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15939c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.a aVar, float f10, float f11) {
            super(1);
            this.f15937a = aVar;
            this.f15938b = f10;
            this.f15939c = f11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("paddingFrom");
            t2Var.b().c("alignmentLine", this.f15937a);
            t2Var.b().c(androidx.media3.extractor.text.ttml.c.f68676d0, androidx.compose.ui.unit.h.o(this.f15938b));
            t2Var.b().c(androidx.media3.extractor.text.ttml.c.f68677e0, androidx.compose.ui.unit.h.o(this.f15939c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,110:1\n120#2,5:111\n*E\n"})
    public static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.a f15940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f15941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f15942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.a aVar, long j10, long j11) {
            super(1);
            this.f15940a = aVar;
            this.f15941b = j10;
            this.f15942c = j11;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("paddingFrom");
            t2Var.b().c("alignmentLine", this.f15940a);
            t2Var.b().c(androidx.media3.extractor.text.ttml.c.f68676d0, androidx.compose.ui.unit.z.c(this.f15941b));
            t2Var.b().c(androidx.media3.extractor.text.ttml.c.f68677e0, androidx.compose.ui.unit.z.c(this.f15942c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 c(androidx.compose.ui.layout.c1 c1Var, final androidx.compose.ui.layout.a aVar, final float f10, float f11, androidx.compose.ui.layout.z0 z0Var, long j10) {
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(e(aVar) ? androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null) : androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 14, null));
        int iM = i2VarP0.M(aVar);
        if (iM == Integer.MIN_VALUE) {
            iM = 0;
        }
        int iC1 = e(aVar) ? i2VarP0.c1() : i2VarP0.h1();
        int iO = (e(aVar) ? androidx.compose.ui.unit.b.o(j10) : androidx.compose.ui.unit.b.p(j10)) - iC1;
        final int I = kotlin.ranges.r.I((!Float.isNaN(f10) ? c1Var.g6(f10) : 0) - iM, 0, iO);
        final int I2 = kotlin.ranges.r.I(((!Float.isNaN(f11) ? c1Var.g6(f11) : 0) - iC1) + iM, 0, iO - I);
        final int iH1 = e(aVar) ? i2VarP0.h1() : Math.max(i2VarP0.h1() + I + I2, androidx.compose.ui.unit.b.r(j10));
        final int iMax = e(aVar) ? Math.max(i2VarP0.c1() + I + I2, androidx.compose.ui.unit.b.q(j10)) : i2VarP0.c1();
        return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iMax, null, new Function1() { // from class: androidx.compose.foundation.layout.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.d(aVar, f10, I, iH1, I2, i2VarP0, iMax, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.layout.a aVar, float f10, int i10, int i11, int i12, androidx.compose.ui.layout.i2 i2Var, int i13, androidx.compose.ui.layout.i2.a aVar2) {
        int iH1;
        int i14;
        if (e(aVar)) {
            iH1 = 0;
        } else {
            iH1 = !androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e()) ? i10 : (i11 - i12) - i2Var.h1();
        }
        if (e(aVar)) {
            if (androidx.compose.ui.unit.h.x(f10, androidx.compose.ui.unit.h.f42689b.e())) {
                i10 = (i13 - i12) - i2Var.c1();
            }
            i14 = i10;
        } else {
            i14 = 0;
        }
        androidx.compose.ui.layout.i2.a.e0(aVar2, i2Var, iH1, i14, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private static final boolean e(androidx.compose.ui.layout.a aVar) {
        return aVar instanceof androidx.compose.ui.layout.s;
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 f(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.a aVar, float f10, float f11) {
        return a0Var.B2(new AlignmentLineOffsetDpElement(aVar, f10, f11, androidx.compose.ui.platform.r2.e() ? new a(aVar, f10, f11) : androidx.compose.ui.platform.r2.b(), null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 g(androidx.compose.ui.a0 a0Var, androidx.compose.ui.layout.a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 4) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return f(a0Var, aVar, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 h(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.ui.layout.a aVar, long j10, long j11) {
        androidx.compose.ui.layout.a aVar2;
        long j12;
        long j13;
        Function1 function1B;
        if (androidx.compose.ui.platform.r2.e()) {
            j12 = j10;
            j13 = j11;
            function1B = new b(aVar, j12, j13);
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            j12 = j10;
            j13 = j11;
            function1B = androidx.compose.ui.platform.r2.b();
        }
        return a0Var.B2(new AlignmentLineOffsetTextUnitElement(aVar2, j12, j13, function1B, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 i(androidx.compose.ui.a0 a0Var, androidx.compose.ui.layout.a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.unit.z.f42728b.b();
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = androidx.compose.ui.unit.z.f42728b.b();
        }
        return h(a0Var, aVar, j12, j11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, float f10, float f11) {
        androidx.compose.ui.a0 a0VarG;
        androidx.compose.ui.a0 a0VarB2 = a0Var.B2(!Float.isNaN(f10) ? g(androidx.compose.ui.a0.E, androidx.compose.ui.layout.b.a(), f10, 0.0f, 4, null) : androidx.compose.ui.a0.E);
        if (Float.isNaN(f11)) {
            a0VarG = androidx.compose.ui.a0.E;
        } else {
            int i10 = 5 | 2;
            a0VarG = g(androidx.compose.ui.a0.E, androidx.compose.ui.layout.b.b(), 0.0f, f11, 2, null);
        }
        return a0VarB2.B2(a0VarG);
    }

    public static /* synthetic */ androidx.compose.ui.a0 k(androidx.compose.ui.a0 a0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.ui.unit.h.f42689b.e();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.ui.unit.h.f42689b.e();
        }
        return j(a0Var, f10, f11);
    }

    @androidx.compose.runtime.k7
    @NotNull
    public static final androidx.compose.ui.a0 l(@NotNull androidx.compose.ui.a0 a0Var, long j10, long j11) {
        return a0Var.B2(androidx.compose.ui.unit.z.l(j10) == 0 ? androidx.compose.ui.a0.E : i(androidx.compose.ui.a0.E, androidx.compose.ui.layout.b.a(), j10, 0L, 4, null)).B2(androidx.compose.ui.unit.z.l(j11) == 0 ? androidx.compose.ui.a0.E : i(androidx.compose.ui.a0.E, androidx.compose.ui.layout.b.b(), 0L, j11, 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.a0 m(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = androidx.compose.ui.unit.z.f42728b.b();
        }
        if ((i10 & 2) != 0) {
            j11 = androidx.compose.ui.unit.z.f42728b.b();
        }
        return l(a0Var, j10, j11);
    }
}
