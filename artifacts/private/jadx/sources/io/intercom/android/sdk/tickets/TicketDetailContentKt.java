package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.s4;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.q4;
import androidx.compose.material3.ni;
import androidx.compose.material3.q50;
import androidx.compose.material3.u10;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTicketDetailContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketDetailContent.kt\nio/intercom/android/sdk/tickets/TicketDetailContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,372:1\n1282#2,6:373\n1282#2,3:379\n1285#2,3:383\n1282#2,6:386\n1282#2,6:392\n113#3:382\n113#3:435\n113#3:476\n113#3:514\n113#3:515\n113#3:524\n113#3:525\n113#3:559\n87#4:398\n84#4,9:399\n87#4:477\n84#4,9:478\n94#4:519\n94#4:523\n87#4,6:526\n94#4:563\n80#5,6:408\n87#5,3:423\n90#5,2:432\n80#5,6:445\n87#5,3:460\n90#5,2:469\n94#5:474\n80#5,6:487\n87#5,3:502\n90#5,2:511\n94#5:518\n94#5:522\n80#5,6:532\n87#5,3:547\n90#5,2:556\n94#5:562\n391#6,9:414\n400#6:434\n391#6,9:451\n400#6,3:471\n391#6,9:493\n400#6:513\n401#6,2:516\n401#6,2:520\n391#6,9:538\n400#6:558\n401#6,2:560\n4360#7,6:426\n4360#7,6:463\n4360#7,6:505\n4360#7,6:550\n70#8:436\n68#8,8:437\n77#8:475\n85#9:564\n117#9,2:565\n85#9:567\n117#9,2:568\n85#9:570\n117#9,2:571\n*S KotlinDebug\n*F\n+ 1 TicketDetailContent.kt\nio/intercom/android/sdk/tickets/TicketDetailContentKt\n*L\n72#1:373,6\n73#1:379,3\n73#1:383,3\n74#1:386,6\n78#1:392,6\n73#1:382\n95#1:435\n229#1:476\n238#1:514\n247#1:515\n263#1:524\n265#1:525\n271#1:559\n86#1:398\n86#1:399,9\n226#1:477\n226#1:478,9\n226#1:519\n86#1:523\n262#1:526,6\n262#1:563\n86#1:408,6\n86#1:423,3\n86#1:432,2\n91#1:445,6\n91#1:460,3\n91#1:469,2\n91#1:474\n226#1:487,6\n226#1:502,3\n226#1:511,2\n226#1:518\n86#1:522\n262#1:532,6\n262#1:547,3\n262#1:556,2\n262#1:562\n86#1:414,9\n86#1:434\n91#1:451,9\n91#1:471,3\n226#1:493,9\n226#1:513\n226#1:516,2\n86#1:520,2\n262#1:538,9\n262#1:558\n262#1:560,2\n86#1:426,6\n91#1:463,6\n226#1:505,6\n262#1:550,6\n91#1:436\n91#1:437,8\n91#1:475\n72#1:564\n72#1:565,2\n73#1:567\n73#1:568,2\n74#1:570\n74#1:571,2\n*E\n"})
public final class TicketDetailContentKt {

    @NotNull
    private static final TicketDetailState.TicketDetailContentState sampleTicketDetailState;

    static {
        Avatar avatarCreate = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        Intrinsics.checkNotNullExpressionValue(avatarCreate, "create(...)");
        sampleTicketDetailState = new TicketDetailState.TicketDetailContentState("API issue", new TicketTimelineCardState(CollectionsKt.listOf(new AvatarWrapper(avatarCreate, false, 2, null)), "Hannah will pick this up soon", "🕑  Estimated to be resolved today at 4pm", q0.f38131b.c(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(false, true), new TicketTimelineCardState.ProgressSection(false, false)}), "Submitted", Long.valueOf(System.currentTimeMillis()), null), CollectionsKt.listOf((Object[]) new Ticket.TicketAttribute[]{new Ticket.TicketAttribute.PrimitiveAttribute(null, null, "Description", false, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Et, ut hendrerit et lacus, dictumst ridiculus morbi elementum.", 27, null), new Ticket.TicketAttribute.PrimitiveAttribute(null, null, "API Version", false, null, "1.2", 27, null), new Ticket.TicketAttribute.DateTimeAttribute(null, null, "When did the issue occur?", false, null, "1676555323", 27, null)}), "test@gmail.com", "123", new ConversationButtonState(true, Integer.valueOf(R.drawable.intercom_send_message_icon), new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null)));
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketDetailContent(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final TicketDetailState.TicketDetailContentState ticketDetailContentState, @Nullable Function1<? super String, Unit> function1, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final TicketDetailState.TicketDetailContentState ticketDetailContentState2;
        Intrinsics.checkNotNullParameter(ticketDetailContentState, "ticketDetailContentState");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-872031756);
        androidx.compose.ui.a0 a0Var2 = (i11 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var;
        final Function1<? super String, Unit> function2 = (i11 & 4) != 0 ? new Function1() { // from class: io.intercom.android.sdk.tickets.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TicketDetailContentKt.TicketDetailContent$lambda$0((String) obj);
            }
        } : function1;
        final boolean z11 = (i11 & 8) != 0 ? false : z10;
        Object[] objArr = new Object[0];
        c0VarR.E(1639443041);
        boolean z12 = (((i10 & 7168) ^ 3072) > 2048 && c0VarR.G(z11)) || (i10 & 3072) == 2048;
        Object objI0 = c0VarR.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: io.intercom.android.sdk.tickets.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketDetailContentKt.TicketDetailContent$lambda$2$lambda$1(z11);
                }
            };
            c0VarR.Y(objI0);
        }
        c0VarR.A();
        n3 n3Var = (n3) androidx.compose.runtime.saveable.i.k(objArr, (Function0) objI0, c0VarR, 8);
        c0VarR.E(1639447110);
        Object objI1 = c0VarR.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI1 == aVar.a()) {
            objI1 = d7.g(androidx.compose.ui.unit.h.o(androidx.compose.ui.unit.h.r(-56)), null, 2, null);
            c0VarR.Y(objI1);
        }
        n3 n3Var2 = (n3) objI1;
        c0VarR.A();
        c0VarR.E(1639449312);
        Object objI2 = c0VarR.i0();
        if (objI2 == aVar.a()) {
            objI2 = d7.g(Float.valueOf(0.0f), null, 2, null);
            c0VarR.Y(objI2);
        }
        n3 n3Var3 = (n3) objI2;
        c0VarR.A();
        c0VarR.E(1639450743);
        CardState cardStateTicketDetailContent$lambda$3 = TicketDetailContent$lambda$3(n3Var);
        CardState cardState = CardState.SubmissionCard;
        if (cardStateTicketDetailContent$lambda$3 == cardState) {
            c0VarR.E(1639454260);
            boolean zD = c0VarR.D(n3Var);
            Object objI3 = c0VarR.i0();
            if (zD || objI3 == aVar.a()) {
                objI3 = new TicketDetailContentKt$TicketDetailContent$2$1(n3Var2, n3Var3, n3Var, null);
                c0VarR.Y(objI3);
            }
            c0VarR.A();
            b2.i(null, (Function2) objI3, c0VarR, 70);
        }
        c0VarR.A();
        androidx.compose.ui.a0 a0VarM = q4.m(i6.d(a0Var2, 0.0f, 1, null), q4.f(0, c0VarR, 0, 1), false, null, false, 14, null);
        androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
        androidx.compose.foundation.layout.q.m mVarY = qVar.y();
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        a1 a1VarB = androidx.compose.foundation.layout.j0.b(mVarY, aVar2.u(), c0VarR, 0);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarM);
        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
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
        y7.n(c0VarD, a1VarB, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
        androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        final boolean z13 = z11;
        final androidx.compose.ui.a0 a0Var3 = a0Var2;
        androidx.compose.ui.a0 a0VarD = androidx.compose.animation.n.d(i6.k(i6.f(androidx.compose.foundation.v.d(aVar4, intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU(), null, 2, null), 0.0f, 1, null), androidx.compose.ui.unit.h.r(194), 0.0f, 2, null), androidx.compose.animation.core.p.t(0, 0, null, 7, null), null, 2, null);
        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.i(), false);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarD);
        Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
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
        y7.n(c0VarD2, a1VarK, aVar3.e());
        y7.n(c0VarD2, b1VarK2, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar3.f());
        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
        TicketTimelineCardKt.TicketTimelineCard(ticketDetailContentState.getTicketTimelineCardState(), androidx.compose.ui.draw.a.a(aVar4, androidx.compose.animation.core.f.f(TicketDetailContent$lambda$3(n3Var) == CardState.TimelineCard ? 1.0f : 0.0f, androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null), 0.0f, null, null, c0VarR, 48, 28).getValue().floatValue()), c0VarR, 8, 0);
        TicketSubmissionCard(s4.m(androidx.compose.ui.draw.a.a(aVar4, androidx.compose.animation.core.f.f(TicketDetailContent$lambda$3(n3Var) == cardState ? TicketDetailContent$lambda$9(n3Var3) : 0.0f, TicketDetailContent$lambda$3(n3Var) == cardState ? androidx.compose.animation.core.p.t(1000, 0, null, 6, null) : androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null), 0.0f, null, null, c0VarR, 64, 28).getValue().floatValue()), 0.0f, androidx.compose.animation.core.f.d(TicketDetailContent$lambda$6(n3Var2), androidx.compose.animation.core.p.t(1000, 0, null, 6, null), null, null, c0VarR, 48, 12).getValue().O(), 1, null), c0VarR, 0, 0);
        c0VarR.o();
        u10.c(i6.f(aVar4, 0.0f, 1, null), null, intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.w.e(925724611, true, new Function2<androidx.compose.runtime.c0, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var2, Integer num) {
                invoke(c0Var2, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(androidx.compose.runtime.c0 c0Var2, int i13) {
                androidx.compose.ui.a0.a aVar5;
                char c10;
                Object obj;
                boolean z14;
                if ((i13 & 11) == 2 && c0Var2.d()) {
                    c0Var2.u();
                    return;
                }
                androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                float f10 = 16;
                androidx.compose.ui.a0 a0VarR = d5.r(aVar6, androidx.compose.ui.unit.h.r(f10));
                TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
                androidx.compose.foundation.layout.q.m mVarY2 = qVar2.y();
                androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(mVarY2, aVar7.u(), c0Var2, 0);
                int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK3 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarR);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A3 = aVar8.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A3);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var2);
                y7.n(c0VarD3, a1VarB2, aVar8.e());
                y7.n(c0VarD3, b1VarK3, aVar8.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar8.b();
                if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                    c0VarD3.Y(Integer.valueOf(iHashCode3));
                    c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
                }
                y7.n(c0VarD3, a0VarN3, aVar8.f());
                androidx.compose.foundation.layout.n0 n0Var2 = androidx.compose.foundation.layout.n0.f16227a;
                androidx.compose.ui.e.c cVarQ = aVar7.q();
                androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(aVar6, androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(8)));
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                float f11 = 12;
                androidx.compose.ui.a0 a0VarR2 = d5.r(i6.h(androidx.compose.foundation.v.d(a0VarA, intercomTheme2.getColors(c0Var2, i14).m693getBubbleBackground0d7_KjU(), null, 2, null), 0.0f, 1, null), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarE = u5.e(qVar2.w(), cVarQ, c0Var2, 48);
                int iHashCode4 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
                b1 b1VarK4 = c0Var2.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0Var2, a0VarR2);
                Function0<androidx.compose.ui.node.g> function0A4 = aVar8.a();
                if (c0Var2.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var2.q();
                if (c0Var2.P()) {
                    c0Var2.q0(function0A4);
                } else {
                    c0Var2.l();
                }
                androidx.compose.runtime.c0 c0VarD4 = y7.d(c0Var2);
                y7.n(c0VarD4, a1VarE, aVar8.e());
                y7.n(c0VarD4, b1VarK4, aVar8.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B4 = aVar8.b();
                if (c0VarD4.P() || !Intrinsics.areEqual(c0VarD4.i0(), Integer.valueOf(iHashCode4))) {
                    c0VarD4.Y(Integer.valueOf(iHashCode4));
                    c0VarD4.f(Integer.valueOf(iHashCode4), function2B4);
                }
                y7.n(c0VarD4, a0VarN4, aVar8.f());
                y5 y5Var = y5.f16577a;
                ni.o(u0.e.c(R.drawable.intercom_ticket_notification, c0Var2, 0), null, i6.w(d5.v(aVar6, 0.0f, androidx.compose.ui.unit.h.r(4), 0.0f, 0.0f, 13, null), androidx.compose.ui.unit.h.r(f10)), intercomTheme2.getColors(c0Var2, i14).m713getPrimaryIcon0d7_KjU(), c0Var2, 440, 0);
                l6.a(i6.B(aVar6, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
                y3 type04 = intercomTheme2.getTypography(c0Var2, i14).getType04();
                c0Var2.E(1807110670);
                androidx.compose.ui.text.f.b bVar = new androidx.compose.ui.text.f.b(0, 1, null);
                c0Var2.E(1807112154);
                int iZ = bVar.z(new c3(0L, 0L, v0.f41742b.o(), (androidx.compose.ui.text.font.q0) null, (r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (o3) null, (y0) null, (androidx.compose.ui.graphics.drawscope.i) null, 65531, (DefaultConstructorMarker) null));
                try {
                    bVar.p(u0.i.d(R.string.intercom_youll_be_notified_here_and_by_email, c0Var2, 0));
                    bVar.p(" ");
                    Unit unit = Unit.f312394a;
                    bVar.u(iZ);
                    c0Var2.A();
                    bVar.p(ticketDetailContentState3.getUserEmail());
                    androidx.compose.ui.text.f fVarC = bVar.C();
                    c0Var2.A();
                    q50.u(fVarC, null, intercomTheme2.getColors(c0Var2, i14).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, androidx.compose.ui.unit.a0.m(22), 0, false, 0, 0, null, null, type04, c0Var2, 0, 48, 260090);
                    androidx.compose.runtime.c0 c0Var3 = c0Var2;
                    c0Var3.o();
                    char c11 = 6;
                    l6.a(i6.i(aVar6, androidx.compose.ui.unit.h.r(24)), c0Var3, 6);
                    c0Var3.E(-711350793);
                    if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                        Object obj2 = null;
                        char c12 = 2;
                        boolean z15 = true;
                        androidx.compose.ui.a0 a0VarF = i6.f(d5.t(aVar6, androidx.compose.ui.unit.h.r(f11), 0.0f, 2, null), 0.0f, 1, null);
                        a1 a1VarB3 = androidx.compose.foundation.layout.j0.b(qVar2.y(), aVar7.u(), c0Var3, 0);
                        int iHashCode5 = Long.hashCode(androidx.compose.runtime.v.l(c0Var3, 0));
                        b1 b1VarK5 = c0Var3.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0Var3, a0VarF);
                        Function0<androidx.compose.ui.node.g> function0A5 = aVar8.a();
                        if (c0Var3.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0Var3.q();
                        if (c0Var3.P()) {
                            c0Var3.q0(function0A5);
                        } else {
                            c0Var3.l();
                        }
                        androidx.compose.runtime.c0 c0VarD5 = y7.d(c0Var3);
                        y7.n(c0VarD5, a1VarB3, aVar8.e());
                        y7.n(c0VarD5, b1VarK5, aVar8.g());
                        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B5 = aVar8.b();
                        if (c0VarD5.P() || !Intrinsics.areEqual(c0VarD5.i0(), Integer.valueOf(iHashCode5))) {
                            c0VarD5.Y(Integer.valueOf(iHashCode5));
                            c0VarD5.f(Integer.valueOf(iHashCode5), function2B5);
                        }
                        y7.n(c0VarD5, a0VarN5, aVar8.f());
                        c0Var3.E(1807143465);
                        for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                            String name = ticketAttribute.getName();
                            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                            int i15 = IntercomTheme.$stable;
                            q50.t(name, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var3, i15).getType04SemiBold(), c0Var2, 0, 0, 131070);
                            c0Var3 = c0Var2;
                            androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                            l6.a(i6.i(aVar9, androidx.compose.ui.unit.h.r(2)), c0Var3, 6);
                            if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                c0Var3.E(2134715913);
                                c10 = 2;
                                aVar5 = aVar9;
                                q50.t(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                                c0Var3 = c0Var2;
                                c0Var3.A();
                            } else {
                                aVar5 = aVar9;
                                c10 = 2;
                                if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                    c0Var3.E(2135020457);
                                    q50.t(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                                    c0Var3 = c0Var2;
                                    c0Var3.A();
                                } else {
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                        c0Var3.E(2135335386);
                                        String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * ((long) 1000), "dd-MM-yyy, HH:mm");
                                        Intrinsics.checkNotNullExpressionValue(timeInMillisAsDate, "formatTimeInMillisAsDate(...)");
                                        q50.t(timeInMillisAsDate, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                                        c0Var3 = c0Var2;
                                        c0Var3.A();
                                    } else if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                        c0Var3.E(2135835354);
                                        FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), c0Var3, 64, 1);
                                        c0Var3.A();
                                        z14 = true;
                                        obj = null;
                                    } else {
                                        if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                            c0Var3.E(1592882332);
                                            c0Var3.A();
                                            throw new kotlin.k0();
                                        }
                                        c0Var3.E(2136019990);
                                        obj = null;
                                        z14 = true;
                                        q50.t(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c0Var3, i15).getType04(), c0Var2, 0, 0, 131070);
                                        c0Var3 = c0Var2;
                                        c0Var3.A();
                                    }
                                    c11 = 6;
                                    l6.a(i6.i(aVar5, androidx.compose.ui.unit.h.r(f10)), c0Var3, 6);
                                    z15 = z14;
                                    obj2 = obj;
                                    c12 = c10;
                                }
                            }
                            z14 = true;
                            obj = null;
                            c11 = 6;
                            l6.a(i6.i(aVar5, androidx.compose.ui.unit.h.r(f10)), c0Var3, 6);
                            z15 = z14;
                            obj2 = obj;
                            c12 = c10;
                        }
                        c0Var3.A();
                        c0Var3.o();
                    }
                    c0Var3.A();
                    c0Var3.o();
                } catch (Throwable th2) {
                    bVar.u(iZ);
                    throw th2;
                }
            }
        }, c0VarR, 54), c0VarR, 12582918, 122);
        androidx.compose.runtime.c0 c0Var2 = c0VarR;
        c0Var2.E(1933740147);
        if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
            l6.a(androidx.compose.foundation.layout.m0.o(n0Var, aVar4, 1.0f, false, 2, null), c0Var2, 0);
            float f10 = 16;
            androidx.compose.ui.a0 a0VarT = d5.t(i6.h(aVar4, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.h.r(f10), 1, null);
            a1 a1VarB2 = androidx.compose.foundation.layout.j0.b(qVar.y(), aVar2.m(), c0Var2, 48);
            int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
            b1 b1VarK3 = c0Var2.k();
            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0Var2, a0VarT);
            Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
            if (c0Var2.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var2.q();
            if (c0Var2.P()) {
                c0Var2.q0(function0A3);
            } else {
                c0Var2.l();
            }
            androidx.compose.runtime.c0 c0VarD3 = y7.d(c0Var2);
            y7.n(c0VarD3, a1VarB2, aVar3.e());
            y7.n(c0VarD3, b1VarK3, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
            if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
                c0VarD3.Y(Integer.valueOf(iHashCode3));
                c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
            }
            y7.n(c0VarD3, a0VarN3, aVar3.f());
            q50.t(u0.i.d(R.string.intercom_tickets_cta_text, c0Var2, 0), i6.h(aVar4, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(androidx.compose.ui.text.style.j.f42206b.a()), 0L, 0, false, 0, 0, null, y3.m(intercomTheme.getTypography(c0Var2, i12).getType04Point5(), intercomTheme.getColors(c0Var2, i12).m699getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var2, 48, 0, 130044);
            l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(8)), c0Var2, 6);
            ConversationButtonState conversationButtonState = ticketDetailContentState.getConversationButtonState();
            IntercomButton.Style styleM589primaryStyleKlgxPg = IntercomButton.INSTANCE.m589primaryStyleKlgxPg(0L, 0L, null, c0Var2, IntercomButton.$stable << 9, 7);
            c0Var2 = c0Var2;
            String text = conversationButtonState.getText().getText(c0Var2, StringProvider.$stable);
            Integer iconRes = conversationButtonState.getIconRes();
            ticketDetailContentState2 = ticketDetailContentState;
            IntercomButtonKt.IntercomButton(null, styleM589primaryStyleKlgxPg, text, iconRes, new Function0() { // from class: io.intercom.android.sdk.tickets.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TicketDetailContentKt.TicketDetailContent$lambda$15$lambda$14$lambda$13(function2, ticketDetailContentState2);
                }
            }, c0Var2, IntercomButton.Style.$stable << 3, 1);
            l6.a(i6.i(aVar4, androidx.compose.ui.unit.h.r(f10)), c0Var2, 6);
            c0Var2.o();
        } else {
            ticketDetailContentState2 = ticketDetailContentState;
        }
        c0Var2.A();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketDetailContentKt.TicketDetailContent$lambda$16(a0Var3, ticketDetailContentState2, function2, z13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailContent$lambda$0(String str) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$10(n3<Float> n3Var, float f10) {
        n3Var.setValue(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailContent$lambda$15$lambda$14$lambda$13(Function1 function1, TicketDetailState.TicketDetailContentState ticketDetailContentState) {
        Intrinsics.checkNotNullParameter(ticketDetailContentState, "$ticketDetailContentState");
        function1.invoke(ticketDetailContentState.getConversationId());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailContent$lambda$16(androidx.compose.ui.a0 a0Var, TicketDetailState.TicketDetailContentState ticketDetailContentState, Function1 function1, boolean z10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(ticketDetailContentState, "$ticketDetailContentState");
        TicketDetailContent(a0Var, ticketDetailContentState, function1, z10, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 TicketDetailContent$lambda$2$lambda$1(boolean z10) {
        return d7.g(z10 ? CardState.SubmissionCard : CardState.TimelineCard, null, 2, null);
    }

    private static final CardState TicketDetailContent$lambda$3(n3<CardState> n3Var) {
        return n3Var.getValue();
    }

    private static final float TicketDetailContent$lambda$6(n3<androidx.compose.ui.unit.h> n3Var) {
        return n3Var.getValue().O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$7(n3<androidx.compose.ui.unit.h> n3Var, float f10) {
        n3Var.setValue(androidx.compose.ui.unit.h.o(f10));
    }

    private static final float TicketDetailContent$lambda$9(n3<Float> n3Var) {
        return n3Var.getValue().floatValue();
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1759013677);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m529getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketDetailContentKt.TicketPreview$lambda$20(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketPreview$lambda$20(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketPreviewSubmittedCard(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2122497154);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m530getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketDetailContentKt.TicketPreviewSubmittedCard$lambda$21(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketPreviewSubmittedCard$lambda$21(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketPreviewSubmittedCard(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketSubmissionCard(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2022209692);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = i10 | (c0VarR.D(a0Var2) ? 4 : 2);
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
        } else {
            androidx.compose.ui.a0 a0Var3 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
            float f10 = 16;
            androidx.compose.foundation.layout.q.f fVarG = androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f10));
            androidx.compose.ui.e.b bVarM = androidx.compose.ui.e.f37317a.m();
            androidx.compose.ui.a0 a0VarR = d5.r(a0Var3, androidx.compose.ui.unit.h.r(f10));
            a1 a1VarB = androidx.compose.foundation.layout.j0.b(fVarG, bVarM, c0VarR, 54);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
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
            y7.n(c0VarD, a1VarB, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            ni.o(u0.e.c(R.drawable.intercom_submitted, c0VarR, 0), null, i6.w(androidx.compose.ui.a0.E, androidx.compose.ui.unit.h.r(48)), s0.d(4279072050L), c0VarR, 3512, 0);
            String strD = u0.i.d(R.string.intercom_tickets_created_confirmation_header, c0VarR, 0);
            androidx.compose.ui.text.style.j.a aVar2 = androidx.compose.ui.text.style.j.f42206b;
            int iA = aVar2.a();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i14 = IntercomTheme.$stable;
            c0Var2 = c0VarR;
            q50.t(strD, null, intercomTheme.getColors(c0VarR, i14).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(iA), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0VarR, i14).getType04(), c0Var2, 0, 0, 130042);
            q50.t(u0.i.d(R.string.intercom_tickets_submitted_confirmation_paragraph, c0Var2, 0), null, intercomTheme.getColors(c0Var2, i14).m714getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, androidx.compose.ui.text.style.j.h(aVar2.a()), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c0Var2, i14).getType04(), c0Var2, 0, 0, 130042);
            c0Var2.o();
            a0Var2 = a0Var3;
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketDetailContentKt.TicketSubmissionCard$lambda$18(a0Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketSubmissionCard$lambda$18(androidx.compose.ui.a0 a0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        TicketSubmissionCard(a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketSubmissionCardPreview(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-981393609);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m528getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.tickets.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TicketDetailContentKt.TicketSubmissionCardPreview$lambda$19(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketSubmissionCardPreview$lambda$19(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        TicketSubmissionCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @NotNull
    public static final TicketDetailState.TicketDetailContentState getSampleTicketDetailState() {
        return sampleTicketDetailState;
    }
}
