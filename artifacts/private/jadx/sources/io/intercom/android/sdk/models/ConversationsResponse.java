package io.intercom.android.sdk.models;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes13.dex */
public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    public static final class Builder extends BaseResponse.Builder {

        @p0
        ConversationList.Builder conversation_page;

        public Builder withConversationPage(ConversationList.Builder builder) {
            this.conversation_page = builder;
            return this;
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }
    }

    ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList.Builder builder2 = builder.conversation_page;
        this.conversationPage = builder2 == null ? new ConversationList.Builder().build() : builder2.build();
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }
}
