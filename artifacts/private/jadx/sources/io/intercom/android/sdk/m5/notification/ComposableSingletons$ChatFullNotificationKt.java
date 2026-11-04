package io.intercom.android.sdk.m5.notification;

import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.o;
import androidx.compose.runtime.t;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$ChatFullNotificationKt {

    @NotNull
    public static final ComposableSingletons$ChatFullNotificationKt INSTANCE = new ComposableSingletons$ChatFullNotificationKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f238lambda1 = w.c(424986995, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-1$1
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
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There! This is a longer message that should wrap to multiple lines in the chat full notification. We want to make sure it displays correctly.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), ChatFullNotificationKt.previewAppConfig, null, c0Var, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f239lambda2 = w.c(-2029839298, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-2$1
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
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Alex").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Quick question about your recent order.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), ChatFullNotificationKt.previewAppConfig, null, c0Var, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f240lambda3 = w.c(-1139271226, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-3$1
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
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Support Bot").withIsBot(true).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("I'm here to help! Let me know what you need assistance with today.")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), ChatFullNotificationKt.previewAppConfig, null, c0Var, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f241lambda4 = w.c(-1302298593, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-4$1
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
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There! This is a ticket-related message.")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 1044467, null), ChatFullNotificationKt.previewAppConfig, null, c0Var, 72, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f242lambda5 = w.c(19293965, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-5$1
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
            List listListOf = CollectionsKt.listOf(new Participant.Builder().withName("Maria").withIsBot(false).withType(Participant.ADMIN_TYPE));
            List listListOf2 = CollectionsKt.listOf(new Part.Builder().withSummary("I've looked into your request and we'll be implementing this feature in our next release."));
            Ticket.Status status = new Ticket.Status("In Progress", "in_progress", null, false, 0L, 28, null);
            Participant.Builder builderWithName = new Participant.Builder().withName("Maria Johnson");
            Intrinsics.checkNotNullExpressionValue(builderWithName, "withName(...)");
            ChatFullNotificationKt.ChatFullNotification(new Conversation(null, false, listListOf, listListOf2, null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, status, null, null, 0, builderWithName, null, null, null, 0L, 31675, null), null, null, null, null, null, null, null, 1044467, null), ChatFullNotificationKt.previewAppConfig, null, c0Var, 72, 4);
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m403getLambda1$intercom_sdk_base_release() {
        return f238lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m404getLambda2$intercom_sdk_base_release() {
        return f239lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m405getLambda3$intercom_sdk_base_release() {
        return f240lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m406getLambda4$intercom_sdk_base_release() {
        return f241lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m407getLambda5$intercom_sdk_base_release() {
        return f242lambda5;
    }
}
