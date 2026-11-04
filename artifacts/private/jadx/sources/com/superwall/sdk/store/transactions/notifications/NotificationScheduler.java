package com.superwall.sdk.store.transactions.notifications;

import android.content.Context;
import androidx.work.h;
import androidx.work.m0;
import androidx.work.y;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.paywall.LocalNotification;
import com.superwall.sdk.paywall.view.SuperwallPaywallActivity;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class NotificationScheduler {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nNotificationScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationScheduler.kt\ncom/superwall/sdk/store/transactions/notifications/NotificationScheduler$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Data.kt\nandroidx/work/DataKt\n+ 4 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,63:1\n1863#2:64\n1864#2:71\n31#3,5:65\n100#4:70\n*S KotlinDebug\n*F\n+ 1 NotificationScheduler.kt\ncom/superwall/sdk/store/transactions/notifications/NotificationScheduler$Companion\n*L\n24#1:64\n24#1:71\n26#1:65,5\n52#1:70\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void scheduleNotifications(@NotNull List<LocalNotification> notifications, @NotNull DeviceHelperFactory factory, @NotNull Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(notifications, "notifications");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(context, "context");
            m0 m0VarQ = m0.q(context);
            Intrinsics.checkNotNullExpressionValue(m0VarQ, "getInstance(...)");
            for (LocalNotification localNotification : notifications) {
                Pair[] pairArr = {TuplesKt.to("id", Integer.valueOf(localNotification.getId())), TuplesKt.to("title", localNotification.getTitle()), TuplesKt.to("body", localNotification.getBody()), TuplesKt.to("subtitle", localNotification.getSubtitle())};
                h.a aVar = new h.a();
                boolean z10 = true | false;
                for (int i10 = 0; i10 < 4; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.getFirst(), pair.getSecond());
                }
                h hVarA = aVar.a();
                Intrinsics.checkNotNullExpressionValue(hVarA, "dataBuilder.build()");
                long delay = localNotification.getDelay();
                if (factory.makeIsSandbox()) {
                    delay = (delay / ((long) 24)) / ((long) 60);
                }
                if (delay <= 0) {
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Notification delay isn't greater than 0 milliseconds. Notifications will not be scheduled.", null, null, 24, null);
                    return;
                }
                m0VarQ.j(new y.a(NotificationWorker.class).s(delay, TimeUnit.MILLISECONDS).w(hVarA).a(SuperwallPaywallActivity.NOTIFICATION_CHANNEL_ID).b());
            }
        }

        private Companion() {
        }
    }
}
