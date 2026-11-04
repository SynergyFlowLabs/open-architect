package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import androidx.core.app.w;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class BasePushUIKt {
    @NotNull
    public static final w.n createBaseNotificationBuilder(@NotNull Context context, @NotNull String contentTitle, @NotNull String contentText, @NotNull NotificationChannel notificationChannel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentText, "contentText");
        Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
        w.n nVarC = new w.n(context, notificationChannel.getChannelName()).O(contentTitle).N(contentText).t0(R.drawable.intercom_push_icon).C(true);
        Intrinsics.checkNotNullExpressionValue(nVarC, "setAutoCancel(...)");
        return nVarC;
    }
}
