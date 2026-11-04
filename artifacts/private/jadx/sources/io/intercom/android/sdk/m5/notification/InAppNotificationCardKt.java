package io.intercom.android.sdk.m5.notification;

import android.content.Context;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.v;
import androidx.compose.material3.pj;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.o;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.draw.x;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nInAppNotificationCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppNotificationCard.kt\nio/intercom/android/sdk/m5/notification/InAppNotificationCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,238:1\n75#2:239\n75#2:365\n113#3:240\n113#3:241\n113#3:279\n113#3:313\n113#3:314\n70#4:242\n67#4,9:243\n77#4:364\n80#5,6:252\n87#5,3:267\n90#5,2:276\n80#5,6:286\n87#5,3:301\n90#5,2:310\n80#5,6:326\n87#5,3:341\n90#5,2:350\n94#5:355\n94#5:359\n94#5:363\n391#6,9:258\n400#6:278\n391#6,9:292\n400#6:312\n391#6,9:332\n400#6,3:352\n401#6,2:357\n401#6,2:361\n4360#7,6:270\n4360#7,6:304\n4360#7,6:344\n99#8,6:280\n106#8:360\n87#9:315\n83#9,10:316\n94#9:356\n*S KotlinDebug\n*F\n+ 1 InAppNotificationCard.kt\nio/intercom/android/sdk/m5/notification/InAppNotificationCardKt\n*L\n90#1:239\n181#1:365\n93#1:240\n95#1:241\n100#1:279\n108#1:313\n110#1:314\n91#1:242\n91#1:243,9\n91#1:364\n91#1:252,6\n91#1:267,3\n91#1:276,2\n97#1:286,6\n97#1:301,3\n97#1:310,2\n110#1:326,6\n110#1:341,3\n110#1:350,2\n110#1:355\n97#1:359\n91#1:363\n91#1:258,9\n91#1:278\n97#1:292,9\n97#1:312\n110#1:332,9\n110#1:352,3\n97#1:357,2\n91#1:361,2\n91#1:270,6\n97#1:304,6\n110#1:344,6\n97#1:280,6\n97#1:360\n110#1:315\n110#1:316,10\n110#1:356\n*E\n"})
public final class InAppNotificationCardKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void InAppNotificationCard(@NotNull final Conversation conversation, @Nullable a0 a0Var, @Nullable c0 c0Var, final int i10, final int i11) {
        String forename;
        int i12;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        c0 c0VarR = c0Var.R(-320085669);
        a0 a0Var2 = (i11 & 2) != 0 ? a0.E : a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        float fR = androidx.compose.ui.unit.h.r(2);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i13 = IntercomTheme.$stable;
        a0 a0Var3 = a0Var2;
        a0 a0VarC = v.c(x.f(a0Var2, fR, intercomTheme.getShapes(c0VarR, i13).m(), false, 0L, 0L, 24, null), pj.f31758a.a(c0VarR, pj.f31759b).g(), intercomTheme.getShapes(c0VarR, i13).m());
        float f10 = 16;
        a0 a0VarS = d5.s(a0VarC, androidx.compose.ui.unit.h.r(f10), androidx.compose.ui.unit.h.r(f10));
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = m.n(c0VarR, a0VarS);
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
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarK, aVar2.e());
        y7.n(c0VarD, b1VarK, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar2.f());
        d0 d0Var = d0.f15956a;
        a0.a aVar3 = a0.E;
        a0 a0VarH = i6.h(aVar3, 0.0f, 1, null);
        q qVar = q.f16330a;
        a1 a1VarE = u5.e(qVar.G(androidx.compose.ui.unit.h.r(8)), aVar.w(), c0VarR, 54);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        a0 a0VarN2 = m.n(c0VarR, a0VarH);
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
        c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarE, aVar2.e());
        y7.n(c0VarD2, b1VarK2, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar2.f());
        y5 y5Var = y5.f16577a;
        Avatar avatar = conversation.lastAdmin().getAvatar();
        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
        Boolean boolIsBot = conversation.lastAdmin().isBot();
        Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
        final a0 a0Var4 = a0Var3;
        IntercomTheme intercomTheme2 = intercomTheme;
        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar3, androidx.compose.ui.unit.h.r(32)), new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, c0VarR, 70, 60);
        c0 c0Var2 = c0VarR;
        a1 a1VarB = j0.b(qVar.G(androidx.compose.ui.unit.h.r(4)), aVar.u(), c0Var2, 6);
        int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0Var2, 0));
        b1 b1VarK3 = c0Var2.k();
        a0 a0VarN3 = m.n(c0Var2, aVar3);
        Function0<androidx.compose.ui.node.g> function0A3 = aVar2.a();
        if (c0Var2.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var2.q();
        if (c0Var2.P()) {
            c0Var2.q0(function0A3);
        } else {
            c0Var2.l();
        }
        c0 c0VarD3 = y7.d(c0Var2);
        y7.n(c0VarD3, a1VarB, aVar2.e());
        y7.n(c0VarD3, b1VarK3, aVar2.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar2.b();
        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN3, aVar2.f());
        n0 n0Var = n0.f16227a;
        c0Var2.E(110719758);
        if (conversation.getTicket() != null) {
            forename = null;
            TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? v0.f41742b.m() : v0.f41742b.o()), c0Var2, 0, 1);
        } else {
            forename = null;
        }
        c0Var2.A();
        if (conversation.parts().isEmpty()) {
            a0Var4 = a0Var4;
            i12 = i13;
            if (conversation.getTicket() != null) {
                c0Var2.E(-860880263);
                Ticket ticket = conversation.getTicket();
                if (!Intrinsics.areEqual(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED)) {
                    forename = ticket.getAssignee().build().getForename();
                }
                String title = ticket.getCurrentStatus().getTitle();
                String string = context.getString(R.string.intercom_time_just_now);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TicketInAppNotificationContent(forename, title, string, c0Var2, 0, 0);
                c0Var2.A();
            } else {
                c0Var2.E(-860364609);
                c0Var2.A();
            }
        } else {
            c0Var2.E(-862185704);
            Part part = conversation.parts().get(0);
            MessageStyle messageStyle = part.getMessageStyle();
            int i14 = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
            if (i14 == 1) {
                i12 = i13;
                c0Var2.E(-862033928);
                if (!Intrinsics.areEqual(part.getEventData().getStatus(), MetricTracker.Action.SUBMITTED)) {
                    forename = part.getParticipant().getForename();
                }
                String eventAsPlainText = part.getEventData().getEventAsPlainText();
                String string2 = context.getString(R.string.intercom_time_just_now);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                TicketInAppNotificationContent(forename, eventAsPlainText, string2, c0Var2, 0, 0);
                c0Var2.A();
                Unit unit = Unit.f312394a;
            } else if (i14 != 2) {
                c0Var2.E(-861083964);
                c0Var2.A();
                Unit unit2 = Unit.f312394a;
                i12 = i13;
            } else {
                c0Var2.E(-861473324);
                String summary = part.getSummary();
                Intrinsics.checkNotNullExpressionValue(summary, "getSummary(...)");
                i12 = i13;
                q50.t(summary, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 2, 0, null, intercomTheme2.getTypography(c0Var2, i13).getType04Point5(), c0Var2, 0, 24960, 110590);
                c0Var2 = c0Var2;
                c0Var2.A();
                Unit unit3 = Unit.f312394a;
                intercomTheme2 = intercomTheme2;
            }
            c0Var2.A();
        }
        c0Var2.E(110794746);
        if (conversation.getTicket() == null) {
            c0 c0Var3 = c0Var2;
            q50.t(Phrase.from(context, R.string.intercom_reply_from_admin).put("name", conversation.lastAdmin().getName()).format().toString(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, y3.m(intercomTheme2.getTypography(c0Var2, i12).getType04Point5(), s0.d(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), c0Var3, 0, 24576, 114686);
            c0Var2 = c0Var3;
        }
        c0Var2.A();
        c0Var2.o();
        c0Var2.o();
        c0Var2.o();
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InAppNotificationCardKt.InAppNotificationCard$lambda$5(conversation, a0Var4, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InAppNotificationCard$lambda$5(Conversation conversation, a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        InAppNotificationCard(conversation, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void InAppNotificationCardPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-2144100909);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m408getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InAppNotificationCardKt.InAppNotificationCardPreview$lambda$7(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InAppNotificationCardPreview$lambda$7(int i10, c0 c0Var, int i11) {
        InAppNotificationCardPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void InAppNotificationCardTicketPreview(c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-186124313);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m409getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InAppNotificationCardKt.InAppNotificationCardTicketPreview$lambda$8(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InAppNotificationCardTicketPreview$lambda$8(int i10, c0 c0Var, int i11) {
        InAppNotificationCardTicketPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00dc, please report this as an issue */
    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void TicketInAppNotificationContent(@Nullable final String str, @NotNull final String ticketStatus, @Nullable String str2, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        String str3;
        final String strD;
        androidx.compose.ui.text.f fVar;
        c0 c0Var2;
        Intrinsics.checkNotNullParameter(ticketStatus, "ticketStatus");
        c0 c0VarR = c0Var.R(818896879);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c0VarR.D(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.D(ticketStatus) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                str3 = str2;
                int i13 = c0VarR.D(str3) ? 256 : 128;
                i12 |= i13;
            } else {
                str3 = str2;
            }
            i12 |= i13;
        } else {
            str3 = str2;
        }
        if ((i12 & 731) == 146 && c0VarR.d()) {
            c0VarR.u();
            c0Var2 = c0VarR;
            strD = str3;
        } else {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                if ((i11 & 4) != 0) {
                    strD = u0.i.d(R.string.intercom_time_just_now, c0VarR, 0);
                }
                c0VarR.Z();
                if (str != null) {
                    c0VarR.E(856513646);
                    androidx.compose.ui.text.f fVar2 = new androidx.compose.ui.text.f(Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", ticketStatus).put("timestamp", strD).format().toString(), null, 2, null);
                    c0VarR.A();
                    fVar = fVar2;
                } else {
                    c0VarR.E(856837162);
                    androidx.compose.ui.text.f fVar3 = new androidx.compose.ui.text.f(u0.i.d(R.string.intercom_tickets_status_description_prefix_when_submitted, c0VarR, 0) + ' ' + ticketStatus, null, 2, null);
                    c0VarR.A();
                    fVar = fVar3;
                }
                c0Var2 = c0VarR;
                q50.u(fVar, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType05(), c0Var2, 0, 24960, 241662);
            } else {
                c0VarR.u();
            }
            strD = str3;
            c0VarR.Z();
            if (str != null) {
                c0VarR.E(856513646);
                androidx.compose.ui.text.f fVar4 = new androidx.compose.ui.text.f(Phrase.from((Context) c0VarR.W(AndroidCompositionLocals_androidKt.g()), R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", ticketStatus).put("timestamp", strD).format().toString(), null, 2, null);
                c0VarR.A();
                fVar = fVar4;
            } else {
                c0VarR.E(856837162);
                androidx.compose.ui.text.f fVar5 = new androidx.compose.ui.text.f(u0.i.d(R.string.intercom_tickets_status_description_prefix_when_submitted, c0VarR, 0) + ' ' + ticketStatus, null, 2, null);
                c0VarR.A();
                fVar = fVar5;
            }
            c0Var2 = c0VarR;
            q50.u(fVar, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType05(), c0Var2, 0, 24960, 241662);
        }
        s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InAppNotificationCardKt.TicketInAppNotificationContent$lambda$6(str, ticketStatus, strD, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketInAppNotificationContent$lambda$6(String str, String ticketStatus, String str2, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(ticketStatus, "$ticketStatus");
        TicketInAppNotificationContent(str, ticketStatus, str2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static final void addInappNotificationCardToView(@Nullable ComposeView composeView, @NotNull final Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(w.c(-1448950486, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                invoke(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @o
            @t(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(c0 c0Var, int i10) {
                if ((i10 & 11) == 2 && c0Var.d()) {
                    c0Var.u();
                } else {
                    final Conversation conversation2 = conversation;
                    IntercomThemeKt.IntercomTheme(null, null, null, w.e(-395652032, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                            invoke(c0Var2, num.intValue());
                            return Unit.f312394a;
                        }

                        @o
                        @t(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(c0 c0Var2, int i11) {
                            if ((i11 & 11) == 2 && c0Var2.d()) {
                                c0Var2.u();
                            } else {
                                InAppNotificationCardKt.InAppNotificationCard(conversation2, null, c0Var2, 8, 2);
                            }
                        }
                    }, c0Var, 54), c0Var, 3072, 7);
                }
            }
        }));
    }

    public static final void addTicketHeaderToCompose(@Nullable ComposeView composeView, @NotNull final Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (composeView != null && !ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            composeView.setContent(w.c(-744078063, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
                    invoke(c0Var, num.intValue());
                    return Unit.f312394a;
                }

                @o
                @t(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(c0 c0Var, int i10) {
                    if ((i10 & 11) == 2 && c0Var.d()) {
                        c0Var.u();
                    } else {
                        final Conversation conversation2 = conversation;
                        IntercomThemeKt.IntercomTheme(null, null, null, w.e(-1860903769, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var2, Integer num) {
                                invoke(c0Var2, num.intValue());
                                return Unit.f312394a;
                            }

                            @o
                            @t(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(c0 c0Var2, int i11) {
                                if ((i11 & 11) == 2 && c0Var2.d()) {
                                    c0Var2.u();
                                    return;
                                }
                                if (conversation2.getTicket() != null) {
                                    TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation2.getTicket().getTitle(), conversation2.isRead() ? v0.f41742b.m() : v0.f41742b.o()), c0Var2, 0, 1);
                                }
                            }
                        }, c0Var, 54), c0Var, 3072, 7);
                    }
                }
            }));
        }
    }
}
