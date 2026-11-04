package io.intercom.android.sdk.m5.push;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class IntercomPushDataKt {

    @NotNull
    private static final String AppName = "app_name";

    @NotNull
    private static final String AuthorName = "author_name";

    @NotNull
    private static final String Body = "body";

    @NotNull
    private static final String ContentImageUrl = "content_image_url";

    @NotNull
    private static final String ConversationId = "conversation_id";

    @NotNull
    private static final String ConversationPartType = "conversation_part_type";

    @NotNull
    private static final String ImageUrl = "image_url";

    @NotNull
    private static final String InstanceId = "instance_id";

    @NotNull
    private static final String IntercomPushType = "intercom_push_type";

    @NotNull
    private static final String Message = "message";

    @NotNull
    private static final String MessageData = "message_data";

    @NotNull
    private static final String Receiver = "receiver";

    @NotNull
    private static final String Title = "title";

    @NotNull
    private static final String Uri = "uri";

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimplePushData getSimplePushDataFromBundle(Bundle bundle) {
        String string = bundle.getString(IntercomPushType, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString("conversation_id", "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = bundle.getString("title", "");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = bundle.getString("message", "");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = bundle.getString(Receiver, "");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = bundle.getString(AuthorName, "");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        String string7 = bundle.getString("body", "");
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = bundle.getString("app_name", "");
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = bundle.getString(ContentImageUrl, "");
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = bundle.getString(ImageUrl, "");
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        String string11 = bundle.getString("uri", "");
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = bundle.getString(InstanceId, "");
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        String string13 = bundle.getString(ConversationPartType, "");
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        String string14 = bundle.getString(MessageData, "");
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        return new SimplePushData(string, string2, string3, string4, string7, string5, string6, string8, string9, string10, string11, string12, string13, string14);
    }
}
