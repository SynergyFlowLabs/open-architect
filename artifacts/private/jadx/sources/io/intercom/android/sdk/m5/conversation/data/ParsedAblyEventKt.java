package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.f;
import io.ably.lib.types.u;
import io.intercom.android.sdk.models.Part;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ParsedAblyEventKt {
    @NotNull
    public static final ParsedAblyEvent asAblyData(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (!Intrinsics.areEqual(uVar.f288181s, "NewComment")) {
            return ParsedAblyEvent.UnSupportedEvent.INSTANCE;
        }
        try {
            AblyMessage ablyMessage = (AblyMessage) new f().r(uVar.f288022f.toString(), AblyMessage.class);
            Part partBuild = ablyMessage.getEventData().getConversationPart().build();
            return new ParsedAblyEvent.ConversationAblyEvent.NewComment(String.valueOf(ablyMessage.getEventData().getConversationId()), partBuild.isUser() ? String.valueOf(partBuild.isUser()) : "", "", ablyMessage.getEventData().getConversationPart());
        } catch (Exception e10) {
            System.out.println((Object) ("AblyManager: JSON parsing error: " + e10.getMessage()));
            e10.printStackTrace();
            return ParsedAblyEvent.UnSupportedEvent.INSTANCE;
        }
    }
}
