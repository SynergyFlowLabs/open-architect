package io.intercom.android.sdk.models;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    static abstract class Builder {

        @p0
        Config config;
        boolean has_conversations;

        @p0
        User.Builder user;

        Builder() {
        }

        public abstract BaseResponse build();
    }

    protected BaseResponse(Builder builder) {
        Config config = builder.config;
        this.config = config == null ? new Config() : config;
        this.hasConversations = builder.has_conversations;
        User.Builder builder2 = builder.user;
        this.user = builder2 == null ? User.NULL : builder2.build();
    }

    public Config getConfig() {
        return this.config;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }
}
