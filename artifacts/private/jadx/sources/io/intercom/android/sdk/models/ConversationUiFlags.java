package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ConversationUiFlags {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ConversationUiFlags DEFAULT = new ConversationUiFlags(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    @c("show_last_part_meta")
    @Nullable
    private final Boolean showLastPartMeta;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        public static /* synthetic */ void getDEFAULT$annotations() {
        }

        @NotNull
        public final ConversationUiFlags getDEFAULT() {
            return ConversationUiFlags.DEFAULT;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationUiFlags() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ConversationUiFlags copy$default(ConversationUiFlags conversationUiFlags, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = conversationUiFlags.showLastPartMeta;
        }
        return conversationUiFlags.copy(bool);
    }

    @NotNull
    public static final ConversationUiFlags getDEFAULT() {
        return Companion.getDEFAULT();
    }

    @Nullable
    public final Boolean component1() {
        return this.showLastPartMeta;
    }

    @NotNull
    public final ConversationUiFlags copy(@Nullable Boolean bool) {
        return new ConversationUiFlags(bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationUiFlags) && Intrinsics.areEqual(this.showLastPartMeta, ((ConversationUiFlags) obj).showLastPartMeta);
    }

    @Nullable
    public final Boolean getShowLastPartMeta() {
        return this.showLastPartMeta;
    }

    public int hashCode() {
        Boolean bool = this.showLastPartMeta;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConversationUiFlags(showLastPartMeta=" + this.showLastPartMeta + ')';
    }

    public ConversationUiFlags(@Nullable Boolean bool) {
        this.showLastPartMeta = bool;
    }

    public /* synthetic */ ConversationUiFlags(Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool);
    }
}
