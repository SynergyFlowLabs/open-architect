package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.l0;
import androidx.core.app.w;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.j;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationActionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationActionHandler.kt\nio/intercom/android/sdk/m5/push/ConversationActionHandlerKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,89:1\n29#2:90\n*S KotlinDebug\n*F\n+ 1 ConversationActionHandler.kt\nio/intercom/android/sdk/m5/push/ConversationActionHandlerKt\n*L\n84#1:90\n*E\n"})
public final class ConversationActionHandlerKt {

    @NotNull
    public static final String KEY_CONVERSATION_ID = "io.intercom.android.sdk.INTERCOM_KEY_CONVERSATION_ID";

    @NotNull
    public static final String KEY_CUSTOM_STACK_INTENTS = "io.intercom.android.sdk.INTERCOM_KEY_CUSTOM_STACK_INTENTS";

    @NotNull
    public static final String KEY_TEXT_REPLY = "io.intercom.android.sdk.INTERCOM_KEY_TEXT_REPLY";

    @NotNull
    public static final w.b buildContextualAction(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        IconCompat iconCompatX = IconCompat.x(context, R.drawable.intercom_ic_attachment);
        Intrinsics.checkNotNullExpressionValue(iconCompatX, "createWithResource(...)");
        w.b bVarC = new w.b.a(iconCompatX, "Open Attachment", getAttachmentIntent(context, url)).j(true).c();
        Intrinsics.checkNotNullExpressionValue(bVarC, "build(...)");
        return bVarC;
    }

    @NotNull
    public static final w.b buildReplyAction(@NotNull Context context, @NotNull String conversationId, @Nullable TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        l0 l0VarB = new l0.e(KEY_TEXT_REPLY).h(context.getString(R.string.intercom_reply)).b();
        Intrinsics.checkNotNullExpressionValue(l0VarB, "build(...)");
        w.b bVarC = new w.b.a(io.intercom.android.sdk.ui.R.drawable.intercom_send, context.getString(R.string.intercom_reply), getReplyIntent(context, conversationId, taskStackBuilder)).b(l0VarB).c();
        Intrinsics.checkNotNullExpressionValue(bVarC, "build(...)");
        return bVarC;
    }

    private static final PendingIntent getAttachmentIntent(Context context, String str) {
        int iHashCode = str.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(context, iHashCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    private static final PendingIntent getReplyIntent(Context context, String str, TaskStackBuilder taskStackBuilder) {
        int iHashCode = str.hashCode();
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : j.W0;
        Intent intent = new Intent(context, (Class<?>) ConversationReplyReceiver.class);
        intent.putExtra(KEY_CONVERSATION_ID, str);
        if (taskStackBuilder != null) {
            intent.putExtra(KEY_CUSTOM_STACK_INTENTS, taskStackBuilder.getIntents());
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, iHashCode, intent, i10);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
