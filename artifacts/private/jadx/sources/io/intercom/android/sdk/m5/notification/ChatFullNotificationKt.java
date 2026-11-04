package io.intercom.android.sdk.m5.notification;

import android.content.Context;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.j0;
import androidx.compose.foundation.layout.l6;
import androidx.compose.foundation.layout.n0;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.v;
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
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.y3;
import androidx.media3.exoplayer.a5;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nChatFullNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatFullNotification.kt\nio/intercom/android/sdk/m5/notification/ChatFullNotificationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,285:1\n75#2:286\n113#3:287\n113#3:288\n113#3:289\n113#3:290\n113#3:365\n113#3:399\n113#3:404\n70#4:291\n67#4,9:292\n77#4:412\n80#5,6:301\n87#5,3:316\n90#5,2:325\n80#5,6:338\n87#5,3:353\n90#5,2:362\n80#5,6:372\n87#5,3:387\n90#5,2:396\n94#5:402\n94#5:407\n94#5:411\n391#6,9:307\n400#6:327\n391#6,9:344\n400#6:364\n391#6,9:378\n400#6:398\n401#6,2:400\n401#6,2:405\n401#6,2:409\n4360#7,6:319\n4360#7,6:356\n4360#7,6:390\n87#8:328\n84#8,9:329\n94#8:408\n99#9,6:366\n106#9:403\n*S KotlinDebug\n*F\n+ 1 ChatFullNotification.kt\nio/intercom/android/sdk/m5/notification/ChatFullNotificationKt\n*L\n65#1:286\n68#1:287\n69#1:288\n71#1:289\n72#1:290\n81#1:365\n88#1:399\n110#1:404\n66#1:291\n66#1:292,9\n66#1:412\n66#1:301,6\n66#1:316,3\n66#1:325,2\n74#1:338,6\n74#1:353,3\n74#1:362,2\n78#1:372,6\n78#1:387,3\n78#1:396,2\n78#1:402\n74#1:407\n66#1:411\n66#1:307,9\n66#1:327\n74#1:344,9\n74#1:364\n78#1:378,9\n78#1:398\n78#1:400,2\n74#1:405,2\n66#1:409,2\n66#1:319,6\n74#1:356,6\n78#1:390,6\n74#1:328\n74#1:329,9\n74#1:408\n78#1:366,6\n78#1:403\n*E\n"})
public final class ChatFullNotificationKt {

    @NotNull
    private static final AppConfig previewAppConfig = new AppConfig("", -12627531, -13615201, -15064194, false, false, false, 100, 1000, 1000, 1000, 1000, true, true, "", "", false, true, "", SetsKt.emptySet(), SetsKt.emptySet(), "", "", false, true, false, false, false, null, new NexusConfig(), AttachmentSettings.Companion.getDEFAULT(), true, ConversationStateSyncSettings.Companion.getDEFAULT(), false);

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    private static final void ChatFullContent(final Conversation conversation, final Context context, c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(649010099);
        Part partLastPart = conversation.lastPart();
        String summary = partLastPart.getSummary();
        Intrinsics.checkNotNullExpressionValue(summary, "getSummary(...)");
        if (StringsKt.w3(summary)) {
            c0VarR.E(341123830);
            if (conversation.getTicket() != null) {
                Ticket ticket = conversation.getTicket();
                InAppNotificationCardKt.TicketInAppNotificationContent(Intrinsics.areEqual(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED) ? null : ticket.getAssignee().build().getForename(), ticket.getCurrentStatus().getTitle(), "Just now", c0VarR, a5.S0, 0);
            }
            c0VarR.A();
        } else {
            c0VarR.E(340941240);
            String summary2 = partLastPart.getSummary();
            Intrinsics.checkNotNullExpressionValue(summary2, "getSummary(...)");
            q50.t(summary2, i6.h(a0.E, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c0VarR, IntercomTheme.$stable).getType05(), c0VarR, 48, 0, 131068);
            c0VarR = c0VarR;
            c0VarR.A();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullContent$lambda$5(conversation, context, i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullContent$lambda$5(Conversation conversation, Context context, int i10, c0 c0Var, int i11) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(context, "$context");
        ChatFullContent(conversation, context, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ChatFullNotification(@NotNull final Conversation conversation, @NotNull final AppConfig appConfig, @Nullable a0 a0Var, @Nullable c0 c0Var, final int i10, final int i11) {
        float f10;
        a0.a aVar;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        c0 c0VarR = c0Var.R(1263781866);
        a0 a0Var2 = (i11 & 4) != 0 ? a0.E : a0Var;
        Context context = (Context) c0VarR.W(AndroidCompositionLocals_androidKt.g());
        float f11 = 8;
        final a0 a0Var3 = a0Var2;
        a0 a0VarA = androidx.compose.ui.draw.j.a(x.f(a0Var2, androidx.compose.ui.unit.h.r(4), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f11)), false, 0L, 0L, 24, null), androidx.compose.foundation.shape.o.h(androidx.compose.ui.unit.h.r(f11)));
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        a0 a0VarK = i6.k(d5.r(v.d(a0VarA, intercomTheme.getColors(c0VarR, i12).m690getBackground0d7_KjU(), null, 2, null), androidx.compose.ui.unit.h.r(16)), 0.0f, androidx.compose.ui.unit.h.r(400), 1, null);
        androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
        a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK = c0VarR.k();
        a0 a0VarN = m.n(c0VarR, a0VarK);
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
        c0 c0VarD = y7.d(c0VarR);
        y7.n(c0VarD, a1VarK, aVar3.e());
        y7.n(c0VarD, b1VarK, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        y7.n(c0VarD, a0VarN, aVar3.f());
        d0 d0Var = d0.f15956a;
        a0.a aVar4 = a0.E;
        a0 a0VarH = i6.h(aVar4, 0.0f, 1, null);
        q qVar = q.f16330a;
        a1 a1VarB = j0.b(qVar.y(), aVar2.u(), c0VarR, 0);
        int iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK2 = c0VarR.k();
        a0 a0VarN2 = m.n(c0VarR, a0VarH);
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
        c0 c0VarD2 = y7.d(c0VarR);
        y7.n(c0VarD2, a1VarB, aVar3.e());
        y7.n(c0VarD2, b1VarK2, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
        if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
            c0VarD2.Y(Integer.valueOf(iHashCode2));
            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
        }
        y7.n(c0VarD2, a0VarN2, aVar3.f());
        n0 n0Var = n0.f16227a;
        a0 a0VarH2 = i6.h(aVar4, 0.0f, 1, null);
        float f12 = 12;
        a1 a1VarE = u5.e(qVar.G(androidx.compose.ui.unit.h.r(f12)), aVar2.q(), c0VarR, 54);
        int iHashCode3 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
        b1 b1VarK3 = c0VarR.k();
        a0 a0VarN3 = m.n(c0VarR, a0VarH2);
        Function0<androidx.compose.ui.node.g> function0A3 = aVar3.a();
        if (c0VarR.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0VarR.q();
        if (c0VarR.P()) {
            c0VarR.q0(function0A3);
        } else {
            c0VarR.l();
        }
        c0 c0VarD3 = y7.d(c0VarR);
        y7.n(c0VarD3, a1VarE, aVar3.e());
        y7.n(c0VarD3, b1VarK3, aVar3.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B3 = aVar3.b();
        if (c0VarD3.P() || !Intrinsics.areEqual(c0VarD3.i0(), Integer.valueOf(iHashCode3))) {
            c0VarD3.Y(Integer.valueOf(iHashCode3));
            c0VarD3.f(Integer.valueOf(iHashCode3), function2B3);
        }
        y7.n(c0VarD3, a0VarN3, aVar3.f());
        y5 y5Var = y5.f16577a;
        Avatar avatar = conversation.lastAdmin().getAvatar();
        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
        Boolean boolIsBot = conversation.lastAdmin().isBot();
        Intrinsics.checkNotNullExpressionValue(boolIsBot, "isBot(...)");
        AvatarIconKt.m173AvatarIconRd90Nhg(i6.w(aVar4, androidx.compose.ui.unit.h.r(32)), new AvatarWrapper(avatar, boolIsBot.booleanValue()), null, false, 0L, null, c0VarR, 70, 60);
        if (conversation.getTicket() != null) {
            c0VarR.E(2114072472);
            TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? v0.f41742b.m() : v0.f41742b.o()), c0VarR, 0, 1);
            c0VarR.A();
            f10 = f12;
            aVar = aVar4;
        } else {
            c0VarR.E(2114407458);
            String name = conversation.lastAdmin().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            f10 = f12;
            aVar = aVar4;
            q50.t(name, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, y3.m(intercomTheme.getTypography(c0VarR, i12).getType05(), 0L, 0L, v0.f41742b.o(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), c0VarR, 0, 24960, 110590);
            c0VarR = c0VarR;
            c0VarR.A();
        }
        c0VarR.o();
        l6.a(i6.i(aVar, androidx.compose.ui.unit.h.r(f10)), c0VarR, 6);
        ChatFullContent(conversation, context, c0VarR, 72);
        c0VarR.o();
        c0VarR.o();
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullNotification$lambda$4(conversation, appConfig, a0Var3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotification$lambda$4(Conversation conversation, AppConfig appConfig, a0 a0Var, int i10, int i11, c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(appConfig, "$appConfig");
        ChatFullNotification(conversation, appConfig, a0Var, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ChatFullNotificationAssignedTicketPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(-671495709);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m407getLambda5$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullNotificationAssignedTicketPreview$lambda$10(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationAssignedTicketPreview$lambda$10(int i10, c0 c0Var, int i11) {
        ChatFullNotificationAssignedTicketPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ChatFullNotificationBotPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1053171888);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m405getLambda3$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullNotificationBotPreview$lambda$8(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationBotPreview$lambda$8(int i10, c0 c0Var, int i11) {
        ChatFullNotificationBotPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ChatFullNotificationPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(1120680649);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m403getLambda1$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullNotificationPreview$lambda$6(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationPreview$lambda$6(int i10, c0 c0Var, int i11) {
        ChatFullNotificationPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ChatFullNotificationShortMessagePreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(735919252);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m404getLambda2$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullNotificationShortMessagePreview$lambda$7(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationShortMessagePreview$lambda$7(int i10, c0 c0Var, int i11) {
        ChatFullNotificationShortMessagePreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @o
    @IntercomPreviews
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void ChatFullNotificationTicketPreview(@Nullable c0 c0Var, final int i10) {
        c0 c0VarR = c0Var.R(202840309);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m406getLambda4$intercom_sdk_base_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.m5.notification.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatFullNotificationKt.ChatFullNotificationTicketPreview$lambda$9(i10, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationTicketPreview$lambda$9(int i10, c0 c0Var, int i11) {
        ChatFullNotificationTicketPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final void addChatFullNotificationToView(@Nullable ComposeView composeView, @NotNull final Conversation conversation, @NotNull final AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        if (composeView != null && !ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            composeView.setContent(w.c(1805122629, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1
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
                        return;
                    }
                    final Conversation conversation2 = conversation;
                    final AppConfig appConfig2 = appConfig;
                    IntercomThemeKt.IntercomTheme(null, null, null, w.e(583177563, true, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1.1
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
                                ChatFullNotificationKt.ChatFullNotification(conversation2, appConfig2, null, c0Var2, 72, 4);
                            }
                        }
                    }, c0Var, 54), c0Var, 3072, 7);
                }
            }));
        }
    }
}
