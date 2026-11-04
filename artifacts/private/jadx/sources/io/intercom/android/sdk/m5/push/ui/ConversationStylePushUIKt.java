package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import androidx.core.app.j0;
import androidx.core.app.w;
import androidx.core.content.pm.e;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nConversationStylePushUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationStylePushUI.kt\nio/intercom/android/sdk/m5/push/ui/ConversationStylePushUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1863#2,2:173\n1368#2:175\n1454#2,5:176\n1863#2:181\n1863#2:182\n1864#2:192\n1864#2:193\n41#3,2:183\n87#3:186\n74#3,4:187\n43#3:191\n1#4:185\n*S KotlinDebug\n*F\n+ 1 ConversationStylePushUI.kt\nio/intercom/android/sdk/m5/push/ui/ConversationStylePushUIKt\n*L\n42#1:173,2\n94#1:175\n94#1:176,5\n97#1:181\n98#1:182\n98#1:192\n97#1:193\n99#1:183,2\n100#1:186\n100#1:187,4\n99#1:191\n*E\n"})
public final class ConversationStylePushUIKt {

    @NotNull
    public static final String KEY_GROUP_CONVERSATION = "io.intercom.android.sdk.INTERCOM_KEY_GROUP_CONVERSATION";
    public static final int SUMMARY_NOTIFICATION_ID = 9999997;

    @NotNull
    public static final Notification buildConversationStyleNotification(@NotNull Context context, @NotNull IntercomPushConversation conversation, @Nullable e eVar, @NotNull IntercomPushData.ConversationPushData conversationPushData, @NotNull NotificationChannel notificationChannel, boolean z10, @Nullable TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(conversationPushData, "conversationPushData");
        Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String messagesContentText = getMessagesContentText(context, conversation.getMessages().size());
        String string2 = context.getString(R.string.intercom_you);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        w.u uVar = new w.u(new j0.c().f(string2).a());
        for (IntercomPushConversation.Message message : conversation.getMessages()) {
            w.u.d dVar = new w.u.d(message.getMessage(), message.getTimestamp(), message.getPerson());
            Uri contentImageUri = message.getContentImageUri();
            if (contentImageUri != null) {
                dVar.k("image/", contentImageUri);
            }
            uVar.B(dVar);
        }
        w.n nVarM = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel).z0(uVar).q0(eVar).M(ConversationDeepLinkRouterKt.buildIntentForConversationScreen(context, conversation.getConversationId(), taskStackBuilder));
        int i10 = Build.VERSION.SDK_INT;
        nVarM.b(ConversationActionHandlerKt.buildReplyAction(context, conversation.getConversationId(), taskStackBuilder));
        if (conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Attachment) {
            nVarM.b(ConversationActionHandlerKt.buildContextualAction(context, ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getUrl()));
        }
        if (i10 >= 31) {
            nVarM.E(BubbleMetaDataKt.getBubbleMetaData(context, conversation));
        }
        Notification notificationH = nVarM.Y(KEY_GROUP_CONVERSATION).s0(z10).h();
        Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
        return notificationH;
    }

    public static /* synthetic */ Notification buildConversationStyleNotification$default(Context context, IntercomPushConversation intercomPushConversation, e eVar, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z10, TaskStackBuilder taskStackBuilder, int i10, Object obj) {
        if ((i10 & 64) != 0) {
            taskStackBuilder = null;
        }
        return buildConversationStyleNotification(context, intercomPushConversation, eVar, conversationPushData, notificationChannel, z10, taskStackBuilder);
    }

    @NotNull
    public static final Notification buildConversationStyleSummaryNotification(@NotNull Context context, @NotNull List<IntercomPushConversation> conversations, @NotNull NotificationChannel notificationChannel, @Nullable TaskStackBuilder taskStackBuilder) {
        CharSequence charSequenceF;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        List<IntercomPushConversation> list = conversations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((IntercomPushConversation) it.next()).getMessages());
        }
        String messagesContentText = getMessagesContentText(context, arrayList.size());
        w.t tVarB = new w.t().B(string);
        Intrinsics.checkNotNullExpressionValue(tVarB, "setBigContentTitle(...)");
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            for (IntercomPushConversation.Message message : ((IntercomPushConversation) it2.next()).getMessages()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                j0 person = message.getPerson();
                if (person != null && (charSequenceF = person.f()) != null) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) charSequenceF);
                    sb2.append(' ');
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                }
                spannableStringBuilder.append((CharSequence) message.getMessage());
                tVarB.A(new SpannedString(spannableStringBuilder));
            }
        }
        Notification notificationH = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel).M(ConversationDeepLinkRouterKt.buildIntentForMessagesScreen(context, taskStackBuilder)).Y(KEY_GROUP_CONVERSATION).a0(true).z0(tVarB).h();
        Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
        return notificationH;
    }

    private static final String getMessagesContentText(Context context, int i10) {
        String string = i10 == 1 ? context.getString(R.string.intercom_one_new_message) : Phrase.from(context, R.string.intercom_new_messages).put("n", i10).format().toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    @NotNull
    public static final IntercomPushConversation.Message toMessage(@NotNull IntercomPushData.ConversationPushData conversationPushData, long j10, @Nullable Bitmap bitmap, @Nullable Uri uri) {
        String title;
        Intrinsics.checkNotNullParameter(conversationPushData, "<this>");
        j0 j0VarA = null;
        if (!conversationPushData.isCurrentUser()) {
            j0VarA = new j0.c().f(conversationPushData.getAuthorName()).e(conversationPushData.getAuthorName() + conversationPushData.getAvatarUrl()).c(bitmap != null ? IconCompat.t(bitmap) : null).a();
        }
        j0 j0Var = j0VarA;
        IntercomPushData.ConversationPushData.MessageData messageData = conversationPushData.getMessageData();
        if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Text) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Text) conversationPushData.getMessageData()).getMessage();
        } else if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Image) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getTitle();
        } else {
            if (!(messageData instanceof IntercomPushData.ConversationPushData.MessageData.Attachment)) {
                throw new k0();
            }
            title = ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getTitle();
        }
        return new IntercomPushConversation.Message(j0Var, j10, title, uri);
    }

    public static /* synthetic */ IntercomPushConversation.Message toMessage$default(IntercomPushData.ConversationPushData conversationPushData, long j10, Bitmap bitmap, Uri uri, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bitmap = null;
        }
        if ((i10 & 4) != 0) {
            uri = null;
        }
        return toMessage(conversationPushData, j10, bitmap, uri);
    }
}
