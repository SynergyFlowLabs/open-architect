package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.e;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationDeepLinkRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationDeepLinkRouter.kt\nio/intercom/android/sdk/m5/push/ConversationDeepLinkRouterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n1#2:116\n29#3:117\n18817#4,2:118\n*S KotlinDebug\n*F\n+ 1 ConversationDeepLinkRouter.kt\nio/intercom/android/sdk/m5/push/ConversationDeepLinkRouterKt\n*L\n44#1:117\n100#1:118,2\n*E\n"})
public final class ConversationDeepLinkRouterKt {
    private static final int DEFAULT_REQUEST_CODE = 0;

    @NotNull
    public static final String INTERCOM_PUSH_INSTANCE_ID = "io.intercom.android.sdk.INTERCOM_PUSH_INSTANCE_ID";

    private static final PendingIntent buildBasePendingIntent(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        if (bundle != null) {
            if (intent != null) {
                intent.putExtras(bundle);
            }
            launchIntentForPackage.putExtras(bundle);
        }
        int iIntValue = num != null ? num.intValue() : 0;
        if (taskStackBuilder == null) {
            return intent != null ? PendingIntent.getActivity(context, iIntValue, intent, 201326592) : PendingIntent.getActivity(context, iIntValue, launchIntentForPackage, 201326592);
        }
        if (intent != null) {
            Intent[] intents = taskStackBuilder.getIntents();
            Intrinsics.checkNotNullExpressionValue(intents, "getIntents(...)");
            for (Intent intent2 : intents) {
                if (!Intrinsics.areEqual(intent2.getComponent(), intent.getComponent())) {
                }
            }
            taskStackBuilder.addNextIntent(intent);
        }
        return taskStackBuilder.getPendingIntent(iIntValue, 201326592);
    }

    static /* synthetic */ PendingIntent buildBasePendingIntent$default(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            bundle = null;
        }
        return buildBasePendingIntent(context, num, intent, taskStackBuilder, bundle);
    }

    @Nullable
    public static final PendingIntent buildIntentForConversationScreen(@NotNull Context context, @NotNull String conversationId, @Nullable TaskStackBuilder taskStackBuilder) {
        Context context2;
        Intent intentForArgs$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        if (StringsKt.w3(conversationId)) {
            context2 = context;
            intentForArgs$default = null;
        } else {
            context2 = context;
            intentForArgs$default = IntercomRootActivityArgsKt.getIntentForArgs$default(context2, new IntercomRootActivityArgs.ConversationScreenArgs(conversationId, "", false, null, null, null, 48, null), null, null, 4, null);
        }
        return buildBasePendingIntent(context2, intentForArgs$default != null ? Integer.valueOf(conversationId.hashCode()) : null, intentForArgs$default, taskStackBuilder, null);
    }

    @Nullable
    public static final PendingIntent buildIntentForDeepLinkScreen(@NotNull Context context, @NotNull String uri, @NotNull String instanceId, @Nullable TaskStackBuilder taskStackBuilder) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        if (StringsKt.w3(uri)) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
            intent.addCategory("android.intent.category.BROWSABLE");
        }
        return buildBasePendingIntent(context, intent != null ? Integer.valueOf(uri.hashCode()) : null, intent, taskStackBuilder, e.b(TuplesKt.to(INTERCOM_PUSH_INSTANCE_ID, instanceId)));
    }

    @Nullable
    public static final PendingIntent buildIntentForMessagesScreen(@NotNull Context context, @Nullable TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        return buildBasePendingIntent(context, 0, IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 4, null), taskStackBuilder, null);
    }
}
