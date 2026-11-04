package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.animation.core.y3;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBigTicketCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigTicketCard.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BigTicketCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,198:1\n75#2:199\n*S KotlinDebug\n*F\n+ 1 BigTicketCard.kt\nio/intercom/android/sdk/m5/conversation/ui/components/row/BigTicketCardKt\n*L\n50#1:199\n*E\n"})
public final class BigTicketCardKt {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BigTicketCard(@NotNull final TicketDetailState.TicketDetailContentState ticketDetailState, @NotNull final Function0<Unit> onClick, final boolean z10, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "ticketDetailState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1861461937);
        final androidx.compose.ui.a0 a0Var2 = (i11 & 8) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        y3 y3VarT = androidx.compose.animation.core.p.t(1000, 0, null, 6, null);
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        androidx.compose.animation.d0 d0VarC = androidx.compose.animation.b0.k(y3VarT, aVar.y(), false, null, 12, null).c(androidx.compose.animation.b0.H(androidx.compose.animation.core.p.t(1000, 500, null, 4, null), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BigTicketCardKt.BigTicketCard$lambda$0(((Integer) obj).intValue()));
            }
        })).c(androidx.compose.animation.b0.o(androidx.compose.animation.core.p.t(1000, 500, null, 4, null), 0.0f, 2, null));
        androidx.compose.animation.f0 f0VarD = androidx.compose.animation.b0.N(androidx.compose.animation.core.p.t(1000, 0, null, 6, null), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BigTicketCardKt.BigTicketCard$lambda$1(((Integer) obj).intValue()));
            }
        }).d(androidx.compose.animation.b0.q(androidx.compose.animation.core.p.t(1000, 0, null, 6, null), 0.0f, 2, null)).d(androidx.compose.animation.b0.A(androidx.compose.animation.core.p.t(1000, 500, null, 4, null), aVar.y(), false, null, 12, null));
        androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(-915811879, true, new pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
            @Override // pj.n
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(lVar, c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.animation.l AnimatedVisibility, androidx.compose.runtime.c0 c0Var2, int i12) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
                Function0<Unit> function0 = onClick;
                final TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState;
                final Context context2 = context;
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), bVarM, c0Var2, 48);
                int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                androidx.compose.runtime.b1 b1VarK = c0Var2.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var2, aVar2);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD = y7.d(c0Var2);
                y7.n(c0VarD, a1VarB, aVar3.e());
                y7.n(c0VarD, b1VarK, aVar3.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN, aVar3.f());
                androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
                q50.t(u0.i.d(R.string.intercom_your_ticket, c0Var2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0Var2, IntercomTheme.$stable).getType04(), c0Var2, 0, 0, 131070);
                IntercomCardKt.IntercomCard(function0, d5.s(aVar2, androidx.compose.ui.unit.h.r(14), androidx.compose.ui.unit.h.r(12)), false, IntercomCardStyle.INSTANCE.m596conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, c0Var2, IntercomCardStyle.$stable << 15, 31), null, androidx.compose.runtime.internal.w.e(-1554241908, true, new pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                    @Override // pj.n
                    public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.m0 m0Var, androidx.compose.runtime.c0 c0Var3, Integer num) {
                        invoke(m0Var, c0Var3, num.intValue());
                        return Unit.f312394a;
                    }

                    @androidx.compose.runtime.o
                    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                    public final void invoke(androidx.compose.foundation.layout.m0 IntercomCard, androidx.compose.runtime.c0 c0Var3, int i13) {
                        String str;
                        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                        if ((i13 & 81) == 16 && c0Var3.d()) {
                            c0Var3.u();
                            return;
                        }
                        TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                        Context context3 = context2;
                        androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
                        androidx.compose.ui.e.a aVar5 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.layout.a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(mVarY, aVar5.u(), c0Var3, 0);
                        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                        androidx.compose.runtime.b1 b1VarK2 = c0Var3.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var3, aVar4);
                        androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                        Function0<androidx.compose.ui.node.g> function0A2 = aVar6.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A2);
                        } else {
                            c0Var3.l();
                        }
                        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0Var3);
                        y7.n(c0VarD2, a1VarB2, aVar6.e());
                        y7.n(c0VarD2, b1VarK2, aVar6.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar6.b();
                        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN2, aVar6.f());
                        androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                        float f10 = 12;
                        androidx.compose.ui.a0 a0VarR = d5.r(aVar4, androidx.compose.ui.unit.h.r(f10));
                        androidx.compose.ui.layout.a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar5.m(), c0Var3, 48);
                        int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                        androidx.compose.runtime.b1 b1VarK3 = c0Var3.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var3, a0VarR);
                        Function0<androidx.compose.ui.node.g> function0A3 = aVar6.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A3);
                        } else {
                            c0Var3.l();
                        }
                        androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var3);
                        y7.n(c0VarD3, a1VarB3, aVar6.e());
                        y7.n(c0VarD3, b1VarK3, aVar6.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar6.b();
                        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                            c0VarD3.Y(Integer.valueOf(iHashCode3));
                            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                        }
                        y7.n(c0VarD3, a0VarN3, aVar6.f());
                        l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(4)), c0Var3, 6);
                        String ticketName = ticketDetailContentState2.getTicketName();
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i14 = IntercomTheme.$stable;
                        q50.t(ticketName, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var3, i14).getType04SemiBold(), c0Var3, 0, 0, 131070);
                        ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
                        Unit unit = Unit.f312394a;
                        float f11 = 8;
                        l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f11)), c0Var3, 6);
                        String statusLabel = ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
                        Long timestamp = ticketDetailContentState2.getTicketTimelineCardState().getTimestamp();
                        if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context3)) == null) {
                            str = "";
                        }
                        TextWithSeparatorKt.m171TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(c0Var3, i14).getType04SemiBold(), ticketDetailContentState2.getTicketTimelineCardState().m547getProgressColor0d7_KjU(), 0, 0, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), c0Var3, 0, 204);
                        l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f11)), c0Var3, 6);
                        q50.t(ticketDetailContentState2.getTicketTimelineCardState().getStatusTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var3, i14).getType04(), c0Var3, 0, 0, 131070);
                        l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(16)), c0Var3, 6);
                        TicketProgressIndicatorKt.m542TicketProgressIndicator3IgeMak(ticketDetailContentState2.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState2.getTicketTimelineCardState().m547getProgressColor0d7_KjU(), null, c0Var3, 8, 4);
                        l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f11)), c0Var3, 6);
                        c0Var3.o();
                        IntercomDividerKt.IntercomDivider(d5.t(aVar4, androidx.compose.ui.unit.h.r(f10), 0.0f, 2, null), c0Var3, 6, 0);
                        androidx.compose.ui.a0 a0VarT = d5.t(n0Var2.p(aVar4, aVar5.m()), 0.0f, androidx.compose.ui.unit.h.r(14), 1, null);
                        androidx.compose.ui.layout.a1 a1VarE = u5.e(qVar.w(), aVar5.q(), c0Var3, 48);
                        int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                        androidx.compose.runtime.b1 b1VarK4 = c0Var3.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var3, a0VarT);
                        Function0<androidx.compose.ui.node.g> function0A4 = aVar6.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A4);
                        } else {
                            c0Var3.l();
                        }
                        androidx.compose.runtime.c0 c0VarD4 = y7.d(c0Var3);
                        y7.n(c0VarD4, a1VarE, aVar6.e());
                        y7.n(c0VarD4, b1VarK4, aVar6.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar6.b();
                        if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                            c0VarD4.Y(Integer.valueOf(iHashCode4));
                            c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                        }
                        y7.n(c0VarD4, a0VarN4, aVar6.f());
                        y5 y5Var = y5.f16577a;
                        ni.o(u0.e.c(R.drawable.intercom_ticket_detail_icon, c0Var3, 0), null, d5.v(aVar4, 0.0f, 0.0f, androidx.compose.ui.unit.h.r(f11), 0.0f, 11, null), ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(c0Var3, i14).m684getAction0d7_KjU()), c0Var3, 440, 0);
                        q50.t(u0.i.d(R.string.intercom_tickets_view_ticket, c0Var3, 0), null, ColorExtensionsKt.m732getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(c0Var3, i14).m684getAction0d7_KjU()), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var3, i14).getType04SemiBold(), c0Var3, 0, 0, 131066);
                        c0Var3.o();
                        c0Var3.o();
                    }
                }, c0Var2, 54), c0Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                c0Var2.o();
            }
        }, c0VarR, 54);
        int i12 = i10 >> 6;
        androidx.compose.animation.k.j(z10, a0Var2, d0VarC, f0VarD, null, cVarE, c0VarR, (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 14) | 196992, 16);
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BigTicketCardKt.BigTicketCard$lambda$2(ticketDetailState, onClick, z10, a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$0(int i10) {
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$1(int i10) {
        return -i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BigTicketCard$lambda$2(TicketDetailState.TicketDetailContentState ticketDetailState, Function0 onClick, boolean z10, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "$ticketDetailState");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        BigTicketCard(ticketDetailState, onClick, z10, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BigTicketCardPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1841168271);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m278getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BigTicketCardKt.BigTicketCardPreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BigTicketCardPreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BigTicketCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void BigTicketCardWaitingPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1532589538);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m279getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BigTicketCardKt.BigTicketCardWaitingPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BigTicketCardWaitingPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        BigTicketCardWaitingPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}
