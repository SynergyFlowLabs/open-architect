package io.intercom.android.sdk.m5.conversation.ui.components.row;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class QuickReply {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f292289id;

    @NotNull
    private final String text;

    public QuickReply(@NotNull String id2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f292289id = id2;
        this.text = text;
    }

    public static /* synthetic */ QuickReply copy$default(QuickReply quickReply, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = quickReply.f292289id;
        }
        if ((i10 & 2) != 0) {
            str2 = quickReply.text;
        }
        return quickReply.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f292289id;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final QuickReply copy(@NotNull String id2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new QuickReply(id2, text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickReply)) {
            return false;
        }
        QuickReply quickReply = (QuickReply) obj;
        if (Intrinsics.areEqual(this.f292289id, quickReply.f292289id) && Intrinsics.areEqual(this.text, quickReply.text)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getId() {
        return this.f292289id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.f292289id.hashCode() * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "QuickReply(id=" + this.f292289id + ", text=" + this.text + ')';
    }
}
