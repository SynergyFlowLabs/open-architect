package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import androidx.core.app.c0;
import androidx.core.app.j0;
import androidx.core.app.u;
import androidx.core.content.pm.e;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.ui.ConversationShortcutKt;
import io.intercom.android.sdk.m5.push.ui.ConversationStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.DeepLinkStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nIntercomNotificationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomNotificationHandler.kt\nio/intercom/android/sdk/m5/push/IntercomNotificationHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1#2:298\n1663#3,8:280\n1611#3,9:288\n1863#3:297\n1864#3:299\n1620#3:300\n*S KotlinDebug\n*F\n+ 1 IntercomNotificationHandler.kt\nio/intercom/android/sdk/m5/push/IntercomNotificationHandler\n*L\n235#1:298\n235#1:280,8\n235#1:288,9\n235#1:297\n235#1:299\n235#1:300\n*E\n"})
public final class IntercomNotificationHandler {

    @NotNull
    public static final IntercomNotificationHandler INSTANCE = new IntercomNotificationHandler();

    @NotNull
    private static List<IntercomPushConversation> conversations = CollectionsKt.emptyList();
    private static final Twig twig = LumberMill.getLogger();
    public static final int $stable = 8;

    private IntercomNotificationHandler() {
    }

    @l1
    public static /* synthetic */ void getConversations$intercom_sdk_base_release$annotations() {
    }

    private final IntercomPushConversation getOrCreateConversation(Context context, List<IntercomPushConversation> list, IntercomPushData.ConversationPushData conversationPushData, long j10, Bitmap bitmap, Uri uri) {
        Object next;
        List listBuild;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((IntercomPushConversation) next).getConversationId(), conversationPushData.getConversationId()));
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) next;
        if (intercomPushConversation == null) {
            String conversationId = conversationPushData.getConversationId();
            String authorName = conversationPushData.getAuthorName();
            if (StringsKt.w3(authorName)) {
                authorName = context.getString(R.string.intercom_new_notifications);
                Intrinsics.checkNotNullExpressionValue(authorName, "getString(...)");
            }
            return new IntercomPushConversation(conversationId, authorName, CollectionsKt.listOf(ConversationStylePushUIKt.toMessage(conversationPushData, j10, bitmap, uri)));
        }
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) CollectionsKt.lastOrNull((List) intercomPushConversation.getMessages());
        if (message == null || !message.isCurrentUser() || conversationPushData.isCurrentUser()) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.addAll(intercomPushConversation.getMessages());
            listCreateListBuilder.add(ConversationStylePushUIKt.toMessage(conversationPushData, j10, bitmap, uri));
            listBuild = CollectionsKt.build(listCreateListBuilder);
        } else {
            listBuild = CollectionsKt.listOf(ConversationStylePushUIKt.toMessage(conversationPushData, j10, bitmap, uri));
        }
        List list2 = listBuild;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            j0 person = ((IntercomPushConversation.Message) obj).getPerson();
            if (hashSet.add(person != null ? person.e() : null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j0 person2 = ((IntercomPushConversation.Message) it2.next()).getPerson();
            if (person2 != null) {
                arrayList2.add(person2);
            }
        }
        return IntercomPushConversation.copy$default(intercomPushConversation, null, arrayList2.size() > 1 ? GroupConversationTextFormatter.groupConversationTitle(String.valueOf(((j0) CollectionsKt.last((List) arrayList2)).f()), CollectionsKt.getLastIndex(arrayList2), context).toString() : intercomPushConversation.getConversationTitle(), list2, 1, null);
    }

    public static /* synthetic */ void processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData.ConversationPushData conversationPushData, TaskStackBuilder taskStackBuilder, boolean z10, TimeProvider timeProvider, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release(context, conversationPushData, taskStackBuilder, z11, timeProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processConversationPushNotification$lambda$4(Context context, IntercomPushData.ConversationPushData conversationPushData, TimeProvider timeProvider, boolean z10, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(conversationPushData, "$conversationPushData");
        Intrinsics.checkNotNullParameter(timeProvider, "$timeProvider");
        Pair<IntercomPushConversation, List<IntercomPushConversation>> pairUpdateConversations = INSTANCE.updateConversations(context, conversationPushData, timeProvider.currentTimeMillis(), bitmap2, bitmap != null ? IntercomPushBitmapUtilsKt.getBitmapUri(context, bitmap) : null);
        IntercomPushConversation intercomPushConversationComponent1 = pairUpdateConversations.component1();
        List<IntercomPushConversation> listComponent2 = pairUpdateConversations.component2();
        Pair<List<e>, e> pairCreateTemporaryShortcut = ConversationShortcutKt.createTemporaryShortcut(context, intercomPushConversationComponent1.getConversationId(), intercomPushConversationComponent1.getConversationTitle(), bitmap2);
        List<e> listComponent1 = pairCreateTemporaryShortcut.component1();
        e eVarComponent2 = pairCreateTemporaryShortcut.component2();
        NotificationChannel notificationChannel = conversationPushData.isNewConversation() ? NotificationChannel.NEW_CHATS_CHANNEL : NotificationChannel.CHAT_REPLIES_CHANNEL;
        Notification notificationBuildConversationStyleNotification = ConversationStylePushUIKt.buildConversationStyleNotification(context, intercomPushConversationComponent1, eVarComponent2, conversationPushData, notificationChannel, z10, taskStackBuilder);
        Notification notificationBuildConversationStyleSummaryNotification = listComponent2.size() > 1 ? ConversationStylePushUIKt.buildConversationStyleSummaryNotification(context, listComponent2, notificationChannel, taskStackBuilder) : null;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(Integer.valueOf(conversationPushData.getNotificationId()), notificationBuildConversationStyleNotification);
        if (notificationBuildConversationStyleSummaryNotification != null) {
            mapCreateMapBuilder.put(Integer.valueOf(ConversationStylePushUIKt.SUMMARY_NOTIFICATION_ID), notificationBuildConversationStyleSummaryNotification);
        }
        NotificationPermissionCheckerKt.showNotifications(context, MapsKt.build(mapCreateMapBuilder));
        Twig twig2 = twig;
        Intrinsics.checkNotNullExpressionValue(twig2, "twig");
        ConversationShortcutKt.resetShortcuts(context, listComponent1, eVarComponent2, twig2);
        return Unit.f312394a;
    }

    private final void processDeepLinkPushNotification(final Context context, final IntercomPushData.DeepLinkPushData deepLinkPushData, final TaskStackBuilder taskStackBuilder) {
        twig.i("This is a push only message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushOnlyNotification("instance_id:" + deepLinkPushData.getInstanceId(), deepLinkPushData.getInstanceId());
        IntercomPushBitmapUtilsKt.loadBitmaps$default(context, deepLinkPushData.getContentImageUrl(), null, null, new Function2() { // from class: io.intercom.android.sdk.m5.push.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntercomNotificationHandler.processDeepLinkPushNotification$lambda$0(context, deepLinkPushData, taskStackBuilder, (Bitmap) obj, (Bitmap) obj2);
            }
        }, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processDeepLinkPushNotification$lambda$0(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(deepLinkPushData, "$deepLinkPushData");
        NotificationPermissionCheckerKt.showNotification(context, deepLinkPushData.getNotificationId(), DeepLinkStylePushUIKt.buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder));
        return Unit.f312394a;
    }

    public static /* synthetic */ void processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData intercomPushData, TaskStackBuilder taskStackBuilder, TimeProvider timeProvider, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release(context, intercomPushData, taskStackBuilder, timeProvider);
    }

    private final synchronized Pair<IntercomPushConversation, List<IntercomPushConversation>> updateConversations(Context context, IntercomPushData.ConversationPushData conversationPushData, long j10, Bitmap bitmap, Uri uri) throws Throwable {
        try {
            try {
                final IntercomPushConversation orCreateConversation = getOrCreateConversation(context, conversations, conversationPushData, j10, bitmap, uri);
                List<IntercomPushConversation> mutableList = CollectionsKt.toMutableList((Collection) conversations);
                CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: io.intercom.android.sdk.m5.push.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(IntercomNotificationHandler.updateConversations$lambda$6(orCreateConversation, (IntercomPushConversation) obj));
                    }
                });
                mutableList.add(orCreateConversation);
                conversations = mutableList;
                return TuplesKt.to(orCreateConversation, mutableList);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateConversations$lambda$6(IntercomPushConversation conversation, IntercomPushConversation it) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getConversationId(), conversation.getConversationId());
    }

    public final synchronized void clear(@NotNull Context context) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!conversations.isEmpty()) {
                twig.i("Removing Intercom push notifications.", new Object[0]);
            }
            c0.q(context).e();
            conversations = CollectionsKt.emptyList();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final List<IntercomPushConversation> getConversations$intercom_sdk_base_release() {
        return conversations;
    }

    public final void processConversationPushNotification$intercom_sdk_base_release(@NotNull final Context context, @NotNull final IntercomPushData.ConversationPushData conversationPushData, @Nullable final TaskStackBuilder taskStackBuilder, final boolean z10, @NotNull final TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationPushData, "conversationPushData");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        if (!Injector.get().getDataLayer().getHostAppState().getValue().isBackgrounded()) {
            twig.i("Intercom message received but not displayed in notification bar. This happened because the host app was in the foreground.", new Object[0]);
            return;
        }
        twig.i("This is a background push message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushNotification(conversationPushData.getConversationId());
        IntercomPushBitmapUtilsKt.loadBitmaps(context, conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Image ? ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getUrl() : "", conversationPushData.getAvatarUrl(), conversationPushData.getAuthorName(), new Function2() { // from class: io.intercom.android.sdk.m5.push.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntercomNotificationHandler.processConversationPushNotification$lambda$4(context, conversationPushData, timeProvider, z10, taskStackBuilder, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public final void processIntercomPushNotification$intercom_sdk_base_release(@NotNull Context context, @NotNull IntercomPushData intercomPushData, @Nullable TaskStackBuilder taskStackBuilder, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intercomPushData, "intercomPushData");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        if (intercomPushData instanceof IntercomPushData.DeepLinkPushData) {
            processDeepLinkPushNotification(context, (IntercomPushData.DeepLinkPushData) intercomPushData, taskStackBuilder);
        } else {
            if (!(intercomPushData instanceof IntercomPushData.ConversationPushData)) {
                throw new k0();
            }
            processConversationPushNotification$intercom_sdk_base_release$default(this, context, (IntercomPushData.ConversationPushData) intercomPushData, taskStackBuilder, false, timeProvider, 8, null);
        }
    }

    public final void setConversations$intercom_sdk_base_release(@NotNull List<IntercomPushConversation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        conversations = list;
    }

    public final void setUpNotificationChannels$intercom_sdk_base_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        u uVarA = new u.d(NotificationChannel.CHAT_REPLIES_CHANNEL.getChannelName(), 4).h(context.getString(R.string.intercom_notification_channel_chat_replies_title)).c(context.getString(R.string.intercom_notification_channel_chat_replies_description)).a();
        Intrinsics.checkNotNullExpressionValue(uVarA, "build(...)");
        u uVarA2 = new u.d(NotificationChannel.NEW_CHATS_CHANNEL.getChannelName(), 4).h(context.getString(R.string.intercom_notification_channel_new_chats_title)).c(context.getString(R.string.intercom_notification_channel_new_chats_description)).a();
        Intrinsics.checkNotNullExpressionValue(uVarA2, "build(...)");
        u uVarA3 = new u.d(NotificationChannel.ACTIONS_CHANNEL.getChannelName(), 4).h(context.getString(R.string.intercom_notification_channel_actions_title)).c(context.getString(R.string.intercom_notification_channel_actions_description)).a();
        Intrinsics.checkNotNullExpressionValue(uVarA3, "build(...)");
        c0.q(context).m(CollectionsKt.listOf((Object[]) new u[]{uVarA, uVarA2, uVarA3}));
    }
}
