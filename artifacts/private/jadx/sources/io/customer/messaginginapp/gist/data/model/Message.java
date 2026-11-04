package io.customer.messaginginapp.gist.data.model;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Message {

    @NotNull
    private final String instanceId;

    @NotNull
    private final String messageId;

    @Nullable
    private final Integer priority;

    @Nullable
    private final Map<String, Object> properties;

    @Nullable
    private final String queueId;

    public Message() {
        this(null, null, null, null, 15, null);
    }

    private final GistProperties convertToGistProperties() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        MessagePosition messagePositionValueOf = MessagePosition.CENTER;
        Map<String, Object> map = this.properties;
        String str8 = null;
        Object obj = map != null ? map.get("gist") : null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        boolean zBooleanValue = false;
        if (map2 != null) {
            Object obj2 = map2.get("routeRuleAndroid");
            if (obj2 != null) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                str5 = (String) obj2;
            } else {
                str5 = null;
            }
            Object obj3 = map2.get("campaignId");
            if (obj3 != null) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                str6 = (String) obj3;
            } else {
                str6 = null;
            }
            Object obj4 = map2.get("elementId");
            if (obj4 != null) {
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                str7 = (String) obj4;
            } else {
                str7 = null;
            }
            Object obj5 = map2.get("position");
            if (obj5 != null) {
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                String upperCase = ((String) obj5).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                messagePositionValueOf = MessagePosition.valueOf(upperCase);
            }
            Object obj6 = map2.get("persistent");
            if (obj6 != null) {
                Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            Object obj7 = map2.get("overlayColor");
            if (obj7 != null) {
                String str9 = obj7 instanceof String ? (String) obj7 : null;
                if (str9 != null) {
                    str8 = str9;
                }
            }
            str4 = str8;
            str = str5;
            str3 = str6;
            str2 = str7;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new GistProperties(str, str2, str3, messagePositionValueOf, zBooleanValue, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Message copy$default(Message message, String str, Integer num, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = message.messageId;
        }
        if ((i10 & 2) != 0) {
            num = message.priority;
        }
        if ((i10 & 4) != 0) {
            str2 = message.queueId;
        }
        if ((i10 & 8) != 0) {
            map = message.properties;
        }
        return message.copy(str, num, str2, map);
    }

    @NotNull
    public final String component1() {
        return this.messageId;
    }

    @Nullable
    public final Integer component2() {
        return this.priority;
    }

    @Nullable
    public final String component3() {
        return this.queueId;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.properties;
    }

    @NotNull
    public final Message copy(@NotNull String messageId, @Nullable Integer num, @Nullable String str, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new Message(messageId, num, str, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return Intrinsics.areEqual(this.messageId, message.messageId) && Intrinsics.areEqual(this.priority, message.priority) && Intrinsics.areEqual(this.queueId, message.queueId) && Intrinsics.areEqual(this.properties, message.properties);
    }

    @Nullable
    public final String getEmbeddedElementId() {
        return getGistProperties().getElementId();
    }

    @NotNull
    public final GistProperties getGistProperties() {
        return convertToGistProperties();
    }

    @NotNull
    public final String getInstanceId() {
        return this.instanceId;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    @Nullable
    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    @Nullable
    public final String getQueueId() {
        return this.queueId;
    }

    public int hashCode() {
        int iHashCode = this.messageId.hashCode() * 31;
        Integer num = this.priority;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.queueId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.properties;
        if (map != null) {
            iHashCode2 = map.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    public final boolean isEmbedded() {
        return getEmbeddedElementId() != null;
    }

    @NotNull
    public String toString() {
        return "Message(messageId=" + this.messageId + ", instanceId=" + this.instanceId + ", priority=" + this.priority + ", queueId=" + this.queueId + ", properties=" + getGistProperties();
    }

    public Message(@NotNull String messageId, @Nullable Integer num, @Nullable String str, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.priority = num;
        this.queueId = str;
        this.properties = map;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.instanceId = string;
    }

    public /* synthetic */ Message(String str, Integer num, String str2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : map);
    }
}
