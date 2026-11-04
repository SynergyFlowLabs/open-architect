package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ConversationStateSyncSettings {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ConversationStateSyncSettings DEFAULT = new ConversationStateSyncSettings(false, 0, 0);

    @c("enabled")
    private final boolean enabled;

    @c("start_timeout")
    private final int startTimeout;

    @c("sync_interval")
    private final int syncInterval;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationStateSyncSettings getDEFAULT() {
            return ConversationStateSyncSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    static {
        int i10 = 0 >> 0;
    }

    public ConversationStateSyncSettings(boolean z10, int i10, int i11) {
        this.enabled = z10;
        this.startTimeout = i10;
        this.syncInterval = i11;
    }

    public static /* synthetic */ ConversationStateSyncSettings copy$default(ConversationStateSyncSettings conversationStateSyncSettings, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = conversationStateSyncSettings.enabled;
        }
        if ((i12 & 2) != 0) {
            i10 = conversationStateSyncSettings.startTimeout;
        }
        if ((i12 & 4) != 0) {
            i11 = conversationStateSyncSettings.syncInterval;
        }
        return conversationStateSyncSettings.copy(z10, i10, i11);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.startTimeout;
    }

    public final int component3() {
        return this.syncInterval;
    }

    @NotNull
    public final ConversationStateSyncSettings copy(boolean z10, int i10, int i11) {
        return new ConversationStateSyncSettings(z10, i10, i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationStateSyncSettings)) {
            return false;
        }
        ConversationStateSyncSettings conversationStateSyncSettings = (ConversationStateSyncSettings) obj;
        return this.enabled == conversationStateSyncSettings.enabled && this.startTimeout == conversationStateSyncSettings.startTimeout && this.syncInterval == conversationStateSyncSettings.syncInterval;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final int getSyncInterval() {
        return this.syncInterval;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.enabled) * 31) + Integer.hashCode(this.startTimeout)) * 31) + Integer.hashCode(this.syncInterval);
    }

    @NotNull
    public String toString() {
        return "ConversationStateSyncSettings(enabled=" + this.enabled + ", startTimeout=" + this.startTimeout + ", syncInterval=" + this.syncInterval + ')';
    }
}
