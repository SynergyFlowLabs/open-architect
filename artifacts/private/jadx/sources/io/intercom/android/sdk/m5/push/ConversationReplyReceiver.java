package io.intercom.android.sdk.m5.push;

import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.l0;
import androidx.work.e;
import androidx.work.h;
import androidx.work.m0;
import androidx.work.w;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nConversationReplyReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationReplyReceiver.kt\nio/intercom/android/sdk/m5/push/ConversationReplyReceiver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n4135#2,11:67\n1863#3,2:78\n*S KotlinDebug\n*F\n+ 1 ConversationReplyReceiver.kt\nio/intercom/android/sdk/m5/push/ConversationReplyReceiver\n*L\n26#1:67,11\n28#1:78,2\n*E\n"})
public final class ConversationReplyReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) throws Throwable {
        String string;
        String stringExtra;
        TaskStackBuilder taskStackBuilderCreate;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle bundleP = l0.p(intent);
        if (bundleP != null && (string = bundleP.getString(ConversationActionHandlerKt.KEY_TEXT_REPLY)) != null && (stringExtra = intent.getStringExtra(ConversationActionHandlerKt.KEY_CONVERSATION_ID)) != null) {
            Bundle extras = intent.getExtras();
            Parcelable[] parcelableArrC = extras != null ? androidx.core.os.d.c(extras, ConversationActionHandlerKt.KEY_CUSTOM_STACK_INTENTS, Intent.class) : null;
            if (parcelableArrC != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArrC) {
                    if (parcelable instanceof Intent) {
                        arrayList.add(parcelable);
                    }
                }
                taskStackBuilderCreate = TaskStackBuilder.create(context);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    taskStackBuilderCreate.addNextIntent((Intent) it.next());
                }
            } else {
                taskStackBuilderCreate = null;
            }
            h hVarA = new h.a().q(ConversationActionHandlerKt.KEY_TEXT_REPLY, string).q(ConversationActionHandlerKt.KEY_CONVERSATION_ID, stringExtra).a();
            Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
            m0.q(context).j(new y.a(SendMessageWorker.class).w(hVarA).o(new e.a().c(w.CONNECTED).b()).b());
            IntercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, context, new IntercomPushData.ConversationPushData("", "", stringExtra, new IntercomPushData.ConversationPushData.MessageData.Text(string), true, false), taskStackBuilderCreate, true, null, 16, null);
        }
    }
}
