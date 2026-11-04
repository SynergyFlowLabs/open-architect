package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.app.c0;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNotificationPermissionChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationPermissionChecker.kt\nio/intercom/android/sdk/m5/push/NotificationPermissionCheckerKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,40:1\n216#2,2:41\n*S KotlinDebug\n*F\n+ 1 NotificationPermissionChecker.kt\nio/intercom/android/sdk/m5/push/NotificationPermissionCheckerKt\n*L\n34#1:41,2\n*E\n"})
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(@NotNull Context context, int i10, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        showNotifications(context, MapsKt.mapOf(TuplesKt.to(Integer.valueOf(i10), notification)));
    }

    public static final void showNotifications(@NotNull Context context, @NotNull Map<Integer, ? extends Notification> notifications) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        c0 c0VarQ = c0.q(context);
        if (Build.VERSION.SDK_INT < 33 || androidx.core.content.d.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            for (Map.Entry<Integer, ? extends Notification> entry : notifications.entrySet()) {
                c0VarQ.F(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
}
