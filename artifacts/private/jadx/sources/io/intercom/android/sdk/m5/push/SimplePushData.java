package io.intercom.android.sdk.m5.push;

import android.content.Context;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.ui.common.ActualStringOrResKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nIntercomPushData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntercomPushData.kt\nio/intercom/android/sdk/m5/push/SimplePushData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,179:1\n1#2:180\n147#3:181\n*S KotlinDebug\n*F\n+ 1 IntercomPushData.kt\nio/intercom/android/sdk/m5/push/SimplePushData\n*L\n137#1:181\n*E\n"})
final class SimplePushData {

    @NotNull
    private final String appName;

    @NotNull
    private final String authorName;

    @NotNull
    private final String body;

    @NotNull
    private final String contentImageUrl;

    @NotNull
    private final String conversationId;

    @NotNull
    private final String conversationPartType;

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String instanceId;

    @NotNull
    private final String intercomPushType;

    @NotNull
    private final Json json;

    @NotNull
    private final String message;

    @NotNull
    private final String messageData;

    @NotNull
    private final String receiver;

    @NotNull
    private final String title;
    private final Twig twig;

    @NotNull
    private final String uri;

    public SimplePushData(@NotNull String intercomPushType, @NotNull String conversationId, @NotNull String title, @NotNull String message, @NotNull String body, @NotNull String receiver, @NotNull String authorName, @NotNull String appName, @NotNull String contentImageUrl, @NotNull String imageUrl, @NotNull String uri, @NotNull String instanceId, @NotNull String conversationPartType, @NotNull String messageData) {
        Intrinsics.checkNotNullParameter(intercomPushType, "intercomPushType");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(conversationPartType, "conversationPartType");
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        this.intercomPushType = intercomPushType;
        this.conversationId = conversationId;
        this.title = title;
        this.message = message;
        this.body = body;
        this.receiver = receiver;
        this.authorName = authorName;
        this.appName = appName;
        this.contentImageUrl = contentImageUrl;
        this.imageUrl = imageUrl;
        this.uri = uri;
        this.instanceId = instanceId;
        this.conversationPartType = conversationPartType;
        this.messageData = messageData;
        this.json = JsonKt.Json$default(null, new Function1() { // from class: io.intercom.android.sdk.m5.push.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimplePushData.json$lambda$0((JsonBuilder) obj);
            }
        }, 1, null);
        this.twig = LumberMill.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.f312394a;
    }

    @NotNull
    public final String component1() {
        return this.intercomPushType;
    }

    @NotNull
    public final String component10() {
        return this.imageUrl;
    }

    @NotNull
    public final String component11() {
        return this.uri;
    }

    @NotNull
    public final String component12() {
        return this.instanceId;
    }

    @NotNull
    public final String component13() {
        return this.conversationPartType;
    }

    @NotNull
    public final String component14() {
        return this.messageData;
    }

    @NotNull
    public final String component2() {
        return this.conversationId;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.message;
    }

    @NotNull
    public final String component5() {
        return this.body;
    }

    @NotNull
    public final String component6() {
        return this.receiver;
    }

    @NotNull
    public final String component7() {
        return this.authorName;
    }

    @NotNull
    public final String component8() {
        return this.appName;
    }

    @NotNull
    public final String component9() {
        return this.contentImageUrl;
    }

    @NotNull
    public final SimplePushData copy(@NotNull String intercomPushType, @NotNull String conversationId, @NotNull String title, @NotNull String message, @NotNull String body, @NotNull String receiver, @NotNull String authorName, @NotNull String appName, @NotNull String contentImageUrl, @NotNull String imageUrl, @NotNull String uri, @NotNull String instanceId, @NotNull String conversationPartType, @NotNull String messageData) {
        Intrinsics.checkNotNullParameter(intercomPushType, "intercomPushType");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(conversationPartType, "conversationPartType");
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        return new SimplePushData(intercomPushType, conversationId, title, message, body, receiver, authorName, appName, contentImageUrl, imageUrl, uri, instanceId, conversationPartType, messageData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) obj;
        return Intrinsics.areEqual(this.intercomPushType, simplePushData.intercomPushType) && Intrinsics.areEqual(this.conversationId, simplePushData.conversationId) && Intrinsics.areEqual(this.title, simplePushData.title) && Intrinsics.areEqual(this.message, simplePushData.message) && Intrinsics.areEqual(this.body, simplePushData.body) && Intrinsics.areEqual(this.receiver, simplePushData.receiver) && Intrinsics.areEqual(this.authorName, simplePushData.authorName) && Intrinsics.areEqual(this.appName, simplePushData.appName) && Intrinsics.areEqual(this.contentImageUrl, simplePushData.contentImageUrl) && Intrinsics.areEqual(this.imageUrl, simplePushData.imageUrl) && Intrinsics.areEqual(this.uri, simplePushData.uri) && Intrinsics.areEqual(this.instanceId, simplePushData.instanceId) && Intrinsics.areEqual(this.conversationPartType, simplePushData.conversationPartType) && Intrinsics.areEqual(this.messageData, simplePushData.messageData);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    @NotNull
    public final String getContentText() {
        String str = this.message;
        return StringsKt.w3(str) ? this.body : str;
    }

    @NotNull
    public final String getContentTitle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!StringsKt.w3(this.title)) {
            return this.title;
        }
        if (StringsKt.w3(this.authorName) || StringsKt.w3(this.appName)) {
            return !StringsKt.w3(this.authorName) ? this.authorName : this.appName;
        }
        return ActualStringOrResKt.parseString(context, R.string.intercom_teammate_from_company, CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("name", this.authorName), TuplesKt.to("company", this.appName)}));
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageData, reason: collision with other method in class */
    public final String m410getMessageData() {
        return this.messageData;
    }

    @NotNull
    public final String getReceiver() {
        return this.receiver;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.intercomPushType.hashCode() * 31) + this.conversationId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.body.hashCode()) * 31) + this.receiver.hashCode()) * 31) + this.authorName.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.contentImageUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.instanceId.hashCode()) * 31) + this.conversationPartType.hashCode()) * 31) + this.messageData.hashCode();
    }

    public final boolean isIntercomPush() {
        return !StringsKt.w3(this.intercomPushType) && Intrinsics.areEqual(Intercom.PUSH_RECEIVER, this.receiver);
    }

    @NotNull
    public String toString() {
        return "SimplePushData(intercomPushType=" + this.intercomPushType + ", conversationId=" + this.conversationId + ", title=" + this.title + ", message=" + this.message + ", body=" + this.body + ", receiver=" + this.receiver + ", authorName=" + this.authorName + ", appName=" + this.appName + ", contentImageUrl=" + this.contentImageUrl + ", imageUrl=" + this.imageUrl + ", uri=" + this.uri + ", instanceId=" + this.instanceId + ", conversationPartType=" + this.conversationPartType + ", messageData=" + this.messageData + ')';
    }

    @Nullable
    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!StringsKt.w3(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        IntercomPushData.ConversationPushData.MessageData messageData = null;
        if (!StringsKt.w3(this.messageData)) {
            try {
                Json json = this.json;
                String str = this.messageData;
                json.getSerializersModule();
                messageData = (IntercomPushData.ConversationPushData.MessageData) json.decodeFromString(hk.a.v(IntercomPushData.ConversationPushData.MessageData.Companion.serializer()), str);
            } catch (IllegalArgumentException e10) {
                this.twig.e(e10);
            }
        }
        return messageData;
    }
}
