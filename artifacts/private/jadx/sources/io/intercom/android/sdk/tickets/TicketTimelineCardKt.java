package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketTimelineCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketTimelineCard.kt\nio/intercom/android/sdk/tickets/TicketTimelineCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,201:1\n75#2:202\n113#3:203\n113#3:278\n113#3:283\n113#3:284\n113#3:285\n113#3:286\n87#4:204\n84#4,9:205\n94#4:290\n80#5,6:214\n87#5,3:229\n90#5,2:238\n80#5,6:251\n87#5,3:266\n90#5,2:275\n94#5:281\n94#5:289\n391#6,9:220\n400#6:240\n391#6,9:257\n400#6:277\n401#6,2:279\n401#6,2:287\n4360#7,6:232\n4360#7,6:269\n99#8:241\n96#8,9:242\n106#8:282\n*S KotlinDebug\n*F\n+ 1 TicketTimelineCard.kt\nio/intercom/android/sdk/tickets/TicketTimelineCardKt\n*L\n32#1:202\n34#1:203\n40#1:278\n44#1:283\n52#1:284\n59#1:285\n66#1:286\n33#1:204\n33#1:205,9\n33#1:290\n33#1:214,6\n33#1:229,3\n33#1:238,2\n37#1:251,6\n37#1:266,3\n37#1:275,2\n37#1:281\n33#1:289\n33#1:220,9\n33#1:240\n37#1:257,9\n37#1:277\n37#1:279,2\n33#1:287,2\n33#1:232,6\n37#1:269,6\n37#1:241\n37#1:242,9\n37#1:282\n*E\n"})
public final class TicketTimelineCardKt {

    @NotNull
    private static final TicketTimelineCardState sampleTicketTimelineCardState;

    static {
        Avatar avatarCreate = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
        sampleTicketTimelineCardState = new TicketTimelineCardState(CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), "Hannah will pick this up soon 🙌", "🕑  Estimated to be resolved today at 4pm", TicketStatus.Submitted.m543getColor0d7_KjU(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false), new TicketTimelineCardState.ProgressSection(false, false)}), "Submitted", 1634889351L, null);
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Light Mode", showBackground = true, uiMode = 16), @d1.c(name = "Dark Mode", showBackground = true, uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void InProgressTicketTimelineWithLabelPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-255211063);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m540getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketTimelineCardKt.InProgressTicketTimelineWithLabelPreview$lambda$6(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InProgressTicketTimelineWithLabelPreview$lambda$6(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        InProgressTicketTimelineWithLabelPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Light Mode", showBackground = true, uiMode = 16), @d1.c(name = "Dark Mode", showBackground = true, uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void ResolvedTicketTimelineWithLabelPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2040249091);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m539getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketTimelineCardKt.ResolvedTicketTimelineWithLabelPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResolvedTicketTimelineWithLabelPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        ResolvedTicketTimelineWithLabelPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Light Mode", showBackground = true, uiMode = 16), @d1.c(name = "Dark Mode", showBackground = true, uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void SubmittedTicketTimelineWithLabelPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1972637636);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m538getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketTimelineCardKt.SubmittedTicketTimelineWithLabelPreview$lambda$4(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedTicketTimelineWithLabelPreview$lambda$4(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        SubmittedTicketTimelineWithLabelPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketTimelineCard(@NotNull final TicketTimelineCardState ticketTimelineCardState, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        String str;
        Intrinsics.checkNotNullParameter(ticketTimelineCardState, "ticketTimelineCardState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(926572596);
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        androidx.compose.ui.a0 a0VarR = d5.r(a0Var2, androidx.compose.ui.unit.h.r(24));
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        androidx.compose.ui.e.b bVarM = aVar.m();
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(qVar.y(), bVarM, c0VarR, 48);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
        y7.n(c0VarD, a1VarB, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        androidx.compose.ui.a0 a0VarJ = i6.J(aVar3, null, false, 3, null);
        a1 a1VarE = u5.e(qVar.w(), aVar.w(), c0VarR, 0);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarJ);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A2);
        } else {
            c0VarR.l();
        }
        androidx.compose.runtime.c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarE, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        y5 y5Var = y5.f16577a;
        AvatarGroupKt.m101AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), null, androidx.compose.ui.unit.h.r(64), androidx.compose.ui.unit.a0.m(24), c0VarR, 3464, 2);
        c0VarR.o();
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(12)), c0VarR, 6);
        String statusLabel = ticketTimelineCardState.getStatusLabel();
        Long timestamp = ticketTimelineCardState.getTimestamp();
        if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context)) == null) {
            str = "";
        }
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        TextWithSeparatorKt.m171TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(c0VarR, i12).getType04SemiBold(), ticketTimelineCardState.m547getProgressColor0d7_KjU(), 0, 0, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), c0VarR, 0, 204);
        float f10 = 8;
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
        q50.t(ticketTimelineCardState.getStatusTitle(), null, intercomTheme.getColors(c0VarR, i12).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i12).getType04(), c0VarR, 0, 0, 131066);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        c0Var2.E(2095162818);
        if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
            l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
            q50.t(ticketTimelineCardState.getStatusSubtitle(), null, intercomTheme.getColors(c0Var2, i12).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i12).getType04(), c0Var2, 0, 0, 131066);
            c0Var2 = c0Var2;
        }
        c0Var2.A();
        l6.a(i6.i(aVar3, androidx.compose.ui.unit.h.r(16)), c0Var2, 6);
        TicketProgressIndicatorKt.m542TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m547getProgressColor0d7_KjU(), null, c0Var2, 8, 4);
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketTimelineCardKt.TicketTimelineCard$lambda$2(ticketTimelineCardState, a0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketTimelineCard$lambda$2(TicketTimelineCardState ticketTimelineCardState, androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(ticketTimelineCardState, "$ticketTimelineCardState");
        TicketTimelineCard(ticketTimelineCardState, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @d1.c.a({@d1.c(name = "Light Mode", showBackground = true, uiMode = 16), @d1.c(name = "Dark Mode", showBackground = true, uiMode = 32)})
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void WaitingOnCustomerTicketTimelinePreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-670677167);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m537getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketTimelineCardKt.WaitingOnCustomerTicketTimelinePreview$lambda$3(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitingOnCustomerTicketTimelinePreview$lambda$3(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        WaitingOnCustomerTicketTimelinePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final TicketTimelineCardState getSampleTicketTimelineCardState() {
        return sampleTicketTimelineCardState;
    }
}
