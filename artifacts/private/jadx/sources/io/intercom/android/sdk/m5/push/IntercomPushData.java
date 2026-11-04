package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.w0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface IntercomPushData {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Nullable
        public final IntercomPushData createFrom(@NotNull Context context, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            SimplePushData simplePushDataFromBundle = IntercomPushDataKt.getSimplePushDataFromBundle(bundle);
            if (!simplePushDataFromBundle.isIntercomPush()) {
                return null;
            }
            if (Intrinsics.areEqual(simplePushDataFromBundle.getIntercomPushType(), "push_only")) {
                return new DeepLinkPushData(simplePushDataFromBundle.getContentTitle(context), simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getUri(), simplePushDataFromBundle.getContentImageUrl(), simplePushDataFromBundle.getInstanceId());
            }
            String authorName = simplePushDataFromBundle.getAuthorName();
            String imageUrl = simplePushDataFromBundle.getImageUrl();
            String conversationId = simplePushDataFromBundle.getConversationId();
            boolean zAreEqual = Intrinsics.areEqual(simplePushDataFromBundle.getConversationPartType(), "message");
            ConversationPushData.MessageData messageData = simplePushDataFromBundle.getMessageData();
            if (messageData == null) {
                messageData = new ConversationPushData.MessageData.Text(StringsKt.E5(StringsKt.d4(simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getAuthorName() + AbstractJsonLexerKt.COLON)).toString());
            }
            return new ConversationPushData(authorName, imageUrl, conversationId, messageData, false, zAreEqual);
        }

        public final boolean isIntercomPush(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return IntercomPushDataKt.getSimplePushDataFromBundle(bundle).isIntercomPush();
        }
    }

    @w0(parameters = 0)
    public static final class ConversationPushData implements IntercomPushData {
        public static final int $stable = 8;

        @NotNull
        private final String authorName;

        @NotNull
        private final String avatarUrl;

        @NotNull
        private final String conversationId;
        private final boolean isCurrentUser;
        private final boolean isNewConversation;

        @NotNull
        private final MessageData messageData;

        @b0
        public interface MessageData {

            @NotNull
            public static final Companion Companion = Companion.$$INSTANCE;

            @b0
            @a0("attachment")
            @w0(parameters = 1)
            public static final class Attachment implements MessageData {
                public static final int $stable = 0;

                @NotNull
                public static final Companion Companion = new Companion(null);

                @NotNull
                private final String title;

                @NotNull
                private final String url;

                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer<Attachment> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Attachment(int i10, String str, String str2, v2 v2Var) {
                    if (3 != (i10 & 3)) {
                        g2.b(i10, 3, IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = attachment.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = attachment.url;
                    }
                    return attachment.copy(str, str2);
                }

                @n
                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Attachment attachment, e eVar, SerialDescriptor serialDescriptor) {
                    eVar.encodeStringElement(serialDescriptor, 0, attachment.title);
                    eVar.encodeStringElement(serialDescriptor, 1, attachment.url);
                }

                @NotNull
                public final String component1() {
                    return this.title;
                }

                @NotNull
                public final String component2() {
                    return this.url;
                }

                @NotNull
                public final Attachment copy(@NotNull String title, @NotNull String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Attachment(title, url);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Attachment)) {
                        return false;
                    }
                    Attachment attachment = (Attachment) obj;
                    return Intrinsics.areEqual(this.title, attachment.title) && Intrinsics.areEqual(this.url, attachment.url);
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.url.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Attachment(title=" + this.title + ", url=" + this.url + ')';
                }

                public Attachment(@NotNull String title, @NotNull String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.title = title;
                    this.url = url;
                }
            }

            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();

                private Companion() {
                }

                @NotNull
                public final KSerializer<MessageData> serializer() {
                    return new v("io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData", j1.d(MessageData.class), new kotlin.reflect.d[]{j1.d(Attachment.class), j1.d(Image.class), j1.d(Text.class)}, new KSerializer[]{IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE}, new Annotation[0]);
                }
            }

            @b0
            @a0("image")
            @w0(parameters = 1)
            public static final class Image implements MessageData {
                public static final int $stable = 0;

                @NotNull
                public static final Companion Companion = new Companion(null);

                @NotNull
                private final String title;

                @NotNull
                private final String url;

                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer<Image> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Image(int i10, String str, String str2, v2 v2Var) {
                    if (3 != (i10 & 3)) {
                        g2.b(i10, 3, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = image.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = image.url;
                    }
                    return image.copy(str, str2);
                }

                @n
                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Image image, e eVar, SerialDescriptor serialDescriptor) {
                    eVar.encodeStringElement(serialDescriptor, 0, image.title);
                    eVar.encodeStringElement(serialDescriptor, 1, image.url);
                }

                @NotNull
                public final String component1() {
                    return this.title;
                }

                @NotNull
                public final String component2() {
                    return this.url;
                }

                @NotNull
                public final Image copy(@NotNull String title, @NotNull String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Image(title, url);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj;
                    return Intrinsics.areEqual(this.title, image.title) && Intrinsics.areEqual(this.url, image.url);
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.url.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Image(title=" + this.title + ", url=" + this.url + ')';
                }

                public Image(@NotNull String title, @NotNull String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.title = title;
                    this.url = url;
                }
            }

            @b0
            @a0("text")
            @w0(parameters = 1)
            public static final class Text implements MessageData {
                public static final int $stable = 0;

                @NotNull
                public static final Companion Companion = new Companion(null);

                @NotNull
                private final String message;

                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer<Text> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Text(int i10, String str, v2 v2Var) {
                    if (1 != (i10 & 1)) {
                        g2.b(i10, 1, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE.getDescriptor());
                    }
                    this.message = str;
                }

                public static /* synthetic */ Text copy$default(Text text, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = text.message;
                    }
                    return text.copy(str);
                }

                @NotNull
                public final String component1() {
                    return this.message;
                }

                @NotNull
                public final Text copy(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new Text(message);
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof Text) && Intrinsics.areEqual(this.message, ((Text) obj).message)) {
                        return true;
                    }
                    return false;
                }

                @NotNull
                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Text(message=" + this.message + ')';
                }

                public Text(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }
            }
        }

        public ConversationPushData(@NotNull String authorName, @NotNull String avatarUrl, @NotNull String conversationId, @NotNull MessageData messageData, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(authorName, "authorName");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(messageData, "messageData");
            this.authorName = authorName;
            this.avatarUrl = avatarUrl;
            this.conversationId = conversationId;
            this.messageData = messageData;
            this.isCurrentUser = z10;
            this.isNewConversation = z11;
        }

        public static /* synthetic */ ConversationPushData copy$default(ConversationPushData conversationPushData, String str, String str2, String str3, MessageData messageData, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationPushData.authorName;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationPushData.avatarUrl;
            }
            if ((i10 & 4) != 0) {
                str3 = conversationPushData.conversationId;
            }
            if ((i10 & 8) != 0) {
                messageData = conversationPushData.messageData;
            }
            if ((i10 & 16) != 0) {
                z10 = conversationPushData.isCurrentUser;
            }
            if ((i10 & 32) != 0) {
                z11 = conversationPushData.isNewConversation;
            }
            boolean z12 = z10;
            boolean z13 = z11;
            return conversationPushData.copy(str, str2, str3, messageData, z12, z13);
        }

        @NotNull
        public final String component1() {
            return this.authorName;
        }

        @NotNull
        public final String component2() {
            return this.avatarUrl;
        }

        @NotNull
        public final String component3() {
            return this.conversationId;
        }

        @NotNull
        public final MessageData component4() {
            return this.messageData;
        }

        public final boolean component5() {
            return this.isCurrentUser;
        }

        public final boolean component6() {
            return this.isNewConversation;
        }

        @NotNull
        public final ConversationPushData copy(@NotNull String authorName, @NotNull String avatarUrl, @NotNull String conversationId, @NotNull MessageData messageData, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(authorName, "authorName");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(messageData, "messageData");
            return new ConversationPushData(authorName, avatarUrl, conversationId, messageData, z10, z11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationPushData)) {
                return false;
            }
            ConversationPushData conversationPushData = (ConversationPushData) obj;
            return Intrinsics.areEqual(this.authorName, conversationPushData.authorName) && Intrinsics.areEqual(this.avatarUrl, conversationPushData.avatarUrl) && Intrinsics.areEqual(this.conversationId, conversationPushData.conversationId) && Intrinsics.areEqual(this.messageData, conversationPushData.messageData) && this.isCurrentUser == conversationPushData.isCurrentUser && this.isNewConversation == conversationPushData.isNewConversation;
        }

        @NotNull
        public final String getAuthorName() {
            return this.authorName;
        }

        @NotNull
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final MessageData getMessageData() {
            return this.messageData;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.conversationId.hashCode();
        }

        public int hashCode() {
            return (((((((((this.authorName.hashCode() * 31) + this.avatarUrl.hashCode()) * 31) + this.conversationId.hashCode()) * 31) + this.messageData.hashCode()) * 31) + Boolean.hashCode(this.isCurrentUser)) * 31) + Boolean.hashCode(this.isNewConversation);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public final boolean isNewConversation() {
            return this.isNewConversation;
        }

        @NotNull
        public String toString() {
            return "ConversationPushData(authorName=" + this.authorName + ", avatarUrl=" + this.avatarUrl + ", conversationId=" + this.conversationId + ", messageData=" + this.messageData + ", isCurrentUser=" + this.isCurrentUser + ", isNewConversation=" + this.isNewConversation + ')';
        }
    }

    @w0(parameters = 1)
    public static final class DeepLinkPushData implements IntercomPushData {
        public static final int $stable = 0;

        @NotNull
        private final String contentImageUrl;

        @NotNull
        private final String contentText;

        @NotNull
        private final String contentTitle;

        @NotNull
        private final String instanceId;

        @NotNull
        private final String uri;

        public DeepLinkPushData(@NotNull String contentTitle, @NotNull String contentText, @NotNull String uri, @NotNull String contentImageUrl, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
            Intrinsics.checkNotNullParameter(contentText, "contentText");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.contentTitle = contentTitle;
            this.contentText = contentText;
            this.uri = uri;
            this.contentImageUrl = contentImageUrl;
            this.instanceId = instanceId;
        }

        public static /* synthetic */ DeepLinkPushData copy$default(DeepLinkPushData deepLinkPushData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deepLinkPushData.contentTitle;
            }
            if ((i10 & 2) != 0) {
                str2 = deepLinkPushData.contentText;
            }
            if ((i10 & 4) != 0) {
                str3 = deepLinkPushData.uri;
            }
            if ((i10 & 8) != 0) {
                str4 = deepLinkPushData.contentImageUrl;
            }
            if ((i10 & 16) != 0) {
                str5 = deepLinkPushData.instanceId;
            }
            String str6 = str5;
            String str7 = str3;
            return deepLinkPushData.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        public final String component1() {
            return this.contentTitle;
        }

        @NotNull
        public final String component2() {
            return this.contentText;
        }

        @NotNull
        public final String component3() {
            return this.uri;
        }

        @NotNull
        public final String component4() {
            return this.contentImageUrl;
        }

        @NotNull
        public final String component5() {
            return this.instanceId;
        }

        @NotNull
        public final DeepLinkPushData copy(@NotNull String contentTitle, @NotNull String contentText, @NotNull String uri, @NotNull String contentImageUrl, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
            Intrinsics.checkNotNullParameter(contentText, "contentText");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return new DeepLinkPushData(contentTitle, contentText, uri, contentImageUrl, instanceId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeepLinkPushData)) {
                return false;
            }
            DeepLinkPushData deepLinkPushData = (DeepLinkPushData) obj;
            return Intrinsics.areEqual(this.contentTitle, deepLinkPushData.contentTitle) && Intrinsics.areEqual(this.contentText, deepLinkPushData.contentText) && Intrinsics.areEqual(this.uri, deepLinkPushData.uri) && Intrinsics.areEqual(this.contentImageUrl, deepLinkPushData.contentImageUrl) && Intrinsics.areEqual(this.instanceId, deepLinkPushData.instanceId);
        }

        @NotNull
        public final String getContentImageUrl() {
            return this.contentImageUrl;
        }

        @NotNull
        public final String getContentText() {
            return this.contentText;
        }

        @NotNull
        public final String getContentTitle() {
            return this.contentTitle;
        }

        @NotNull
        public final String getInstanceId() {
            return this.instanceId;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.instanceId.hashCode();
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (((((((this.contentTitle.hashCode() * 31) + this.contentText.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.contentImageUrl.hashCode()) * 31) + this.instanceId.hashCode();
        }

        @NotNull
        public String toString() {
            return "DeepLinkPushData(contentTitle=" + this.contentTitle + ", contentText=" + this.contentText + ", uri=" + this.uri + ", contentImageUrl=" + this.contentImageUrl + ", instanceId=" + this.instanceId + ')';
        }
    }

    int getNotificationId();
}
