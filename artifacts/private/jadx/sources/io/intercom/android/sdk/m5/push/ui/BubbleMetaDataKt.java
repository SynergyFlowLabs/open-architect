package io.intercom.android.sdk.m5.push.ui;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.j0;
import androidx.core.app.w;
import androidx.core.graphics.drawable.IconCompat;
import com.google.api.client.googleapis.media.a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class BubbleMetaDataKt {
    @NotNull
    public static final w.m getBubbleMetaData(@NotNull Context context, @NotNull IntercomPushConversation conversation) {
        j0 person;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        PendingIntent activity = PendingIntent.getActivity(context, 2, ConversationScreenOpenerKt.getComposerIntent$default(context, null, false, null, conversation.getConversationId(), IntercomBubbleActivity.class, 2, null), a.f115410j);
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) CollectionsKt.firstOrNull((List) conversation.getMessages());
        IconCompat iconCompatD = (message == null || (person = message.getPerson()) == null) ? null : person.d();
        if (iconCompatD == null) {
            iconCompatD = IconCompat.x(context, R.drawable.intercom_ic_avatar_person);
            Intrinsics.checkNotNullExpressionValue(iconCompatD, "createWithResource(...)");
        }
        w.m.c cVarI = new w.m.c(activity, iconCompatD).d(600).i(true);
        Intrinsics.checkNotNullExpressionValue(cVarI, "setSuppressNotification(...)");
        w.m mVarA = cVarI.a();
        Intrinsics.checkNotNullExpressionValue(mVarA, "build(...)");
        return mVarA;
    }
}
