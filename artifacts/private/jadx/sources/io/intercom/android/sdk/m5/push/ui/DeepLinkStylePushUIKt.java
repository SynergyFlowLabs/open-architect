package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.w;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class DeepLinkStylePushUIKt {
    @NotNull
    public static final Notification buildDeepLinkNotification(@NotNull Context context, @NotNull IntercomPushData.DeepLinkPushData deepLinkPushData, @Nullable Bitmap bitmap, @Nullable TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deepLinkPushData, "deepLinkPushData");
        w.n nVarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, deepLinkPushData.getContentTitle(), deepLinkPushData.getContentText(), NotificationChannel.ACTIONS_CHANNEL);
        if (bitmap != null) {
            nVarCreateBaseNotificationBuilder.z0(new w.k().D(bitmap).B(null).G(deepLinkPushData.getContentTitle()).I(deepLinkPushData.getContentText()));
            nVarCreateBaseNotificationBuilder.b0(bitmap);
        } else {
            nVarCreateBaseNotificationBuilder.z0(new w.l().B(deepLinkPushData.getContentTitle()).A(deepLinkPushData.getContentText()));
        }
        Notification notificationH = nVarCreateBaseNotificationBuilder.M(ConversationDeepLinkRouterKt.buildIntentForDeepLinkScreen(context, deepLinkPushData.getUri(), deepLinkPushData.getInstanceId(), taskStackBuilder)).h();
        Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
        return notificationH;
    }

    public static /* synthetic */ Notification buildDeepLinkNotification$default(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            taskStackBuilder = null;
        }
        return buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder);
    }
}
