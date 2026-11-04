package io.intercom.android.sdk.tickets;

import androidx.compose.animation.core.g1;
import androidx.compose.animation.core.i1;
import androidx.compose.animation.core.n1;
import androidx.compose.animation.core.q1;
import androidx.compose.animation.core.u0;
import androidx.compose.animation.s1;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.os;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.layout.a1;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketProgressIndicator.kt\nio/intercom/android/sdk/tickets/TicketProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n113#2:100\n113#2:144\n99#3:101\n97#3,8:102\n106#3:155\n80#4,6:110\n87#4,3:125\n90#4,2:134\n94#4:154\n391#5,9:116\n400#5:136\n401#5,2:152\n4360#6,6:128\n1863#7:137\n1864#7:151\n1282#8,6:138\n1282#8,6:145\n*S KotlinDebug\n*F\n+ 1 TicketProgressIndicator.kt\nio/intercom/android/sdk/tickets/TicketProgressIndicatorKt\n*L\n32#1:100\n81#1:144\n31#1:101\n31#1:102,8\n31#1:155\n31#1:110,6\n31#1:125,3\n31#1:134,2\n31#1:154\n31#1:116,9\n31#1:136\n31#1:152,2\n31#1:128,6\n37#1:137\n37#1:151\n62#1:138,6\n77#1:145,6\n*E\n"})
public final class TicketProgressIndicatorKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    /* JADX INFO: renamed from: TicketProgressIndicator-3IgeMak, reason: not valid java name */
    public static final void m542TicketProgressIndicator3IgeMak(@NotNull final List<TicketTimelineCardState.ProgressSection> progressSections, final long j10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z10;
        final float fFloatValue;
        i1 i1Var;
        long j11;
        long jM;
        Intrinsics.checkNotNullParameter(progressSections, "progressSections");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(484493125);
        androidx.compose.ui.a0 a0Var2 = (i11 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        i1 i1VarJ = n1.j("Infinite progress animation", c0VarR, 6, 0);
        final long jM700getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, IntercomTheme.$stable).m700getDisabled0d7_KjU();
        androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(4));
        androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(i6.h(a0Var2, 0.0f, 1, null), androidx.compose.foundation.shape.o.c(50));
        a1 a1VarE = u5.e(fVarG, androidx.compose.ui.e.f37317a.w(), c0VarR, 6);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarE, aVar.e());
        y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar.f());
        y5 y5Var = y5.f16577a;
        c0VarR.E(1767069389);
        for (TicketTimelineCardState.ProgressSection progressSection : progressSections) {
            c0VarR.E(1767070266);
            if (progressSection.isLoading()) {
                z10 = true;
                fFloatValue = n1.d(i1VarJ, 0.0f, 1.0f, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: io.intercom.android.sdk.tickets.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0((q1.b) obj);
                    }
                }), null, 0L, 6, null), "Progress value animation", c0VarR, i1.f13005f | 25008 | (g1.f12967d << 9), 0).getValue().floatValue();
            } else {
                z10 = true;
                fFloatValue = progressSection.isDone() ? 1.0f : 0.0f;
            }
            c0VarR.A();
            c0VarR.E(1767091849);
            if (progressSection.isLoading()) {
                c0VarR.E(1463860081);
                boolean zL = c0VarR.L(jM700getDisabled0d7_KjU) | (((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0VarR.L(j10)) && (i10 & 48) != 32) ? false : z10);
                Object objI0 = c0VarR.i0();
                if (zL || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: io.intercom.android.sdk.tickets.f0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(j10, jM700getDisabled0d7_KjU, (q1.b) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                i1 i1Var2 = i1VarJ;
                long j12 = jM700getDisabled0d7_KjU;
                i1Var = i1Var2;
                j11 = j12;
                jM = s1.b(i1Var2, j12, j10, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null), "Color value animation", c0VarR, i1.f13005f | 24576 | ((i10 << 3) & 896) | (g1.f12967d << 9), 0).getValue().M();
            } else {
                i1Var = i1VarJ;
                j11 = jM700getDisabled0d7_KjU;
                jM = j10;
            }
            c0VarR.A();
            androidx.compose.ui.a0 a0VarQ = x5.q(y5Var, androidx.compose.ui.a0.E, 1.0f, false, 2, null);
            float fR = androidx.compose.ui.unit.h.r(0);
            int iC = u3.f38256b.c();
            c0VarR.E(1463876813);
            boolean zI = c0VarR.I(fFloatValue);
            Object objI1 = c0VarR.i0();
            if (zI || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: io.intercom.android.sdk.tickets.g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(fFloatValue));
                    }
                };
                c0VarR.Y(objI1);
            }
            c0VarR.A();
            androidx.compose.runtime.c0 c0Var2 = c0VarR;
            os.Z((Function0) objI1, a0VarQ, jM, j11, iC, fR, new Function1() { // from class: io.intercom.android.sdk.tickets.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5((androidx.compose.ui.graphics.drawscope.f) obj);
                }
            }, c0Var2, 1769472, 0);
            jM700getDisabled0d7_KjU = j11;
            c0VarR = c0Var2;
            i1VarJ = i1Var;
        }
        c0VarR.A();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var3 = a0Var2;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$8(progressSections, j10, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketProgressIndicatorPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1245553611);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            int i11 = 2 << 0;
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressIndicatorKt.INSTANCE.m536getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketProgressIndicatorKt.TicketProgressIndicatorPreview$lambda$9(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicatorPreview$lambda$9(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketProgressIndicatorPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0(q1.b keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.h(3200);
        Float fValueOf = Float.valueOf(1.0f);
        keyframes.i(keyframes.a(fValueOf, 850), u0.e());
        keyframes.a(fValueOf, 3200);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(long j10, long j11, q1.b keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.h(3200);
        keyframes.i(keyframes.a(q0.n(j10), 850), u0.e());
        keyframes.a(q0.n(j10), 1850);
        keyframes.i(keyframes.a(q0.n(j11), 2200), u0.e());
        keyframes.a(q0.n(j11), 3200);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(float f10) {
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5(androidx.compose.ui.graphics.drawscope.f LinearProgressIndicator) {
        Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$8(List progressSections, long j10, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(progressSections, "$progressSections");
        m542TicketProgressIndicator3IgeMak(progressSections, j10, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}
