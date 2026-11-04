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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ComposableSingletons$InAppNotificationCardKt {

    @NotNull
    public static final ComposableSingletons$InAppNotificationCardKt INSTANCE = new ComposableSingletons$InAppNotificationCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f243lambda1 = w.c(-690804227, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-1$1
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
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), null, c0Var, 8, 2);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<c0, Integer, Unit> f244lambda2 = w.c(779369617, false, new Function2<c0, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-2$1
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
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 1044467, null), null, c0Var, 8, 2);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m408getLambda1$intercom_sdk_base_release() {
        return f243lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<c0, Integer, Unit> m409getLambda2$intercom_sdk_base_release() {
        return f244lambda2;
    }
}
