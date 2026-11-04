package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public final class ReplySuggestion {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f291929id;

    @NotNull
    private final String text;

    public ReplySuggestion(@NotNull String id2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f291929id = id2;
        this.text = text;
    }

    public static /* synthetic */ ReplySuggestion copy$default(ReplySuggestion replySuggestion, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = replySuggestion.f291929id;
        }
        if ((i10 & 2) != 0) {
            str2 = replySuggestion.text;
        }
        return replySuggestion.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f291929id;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final ReplySuggestion copy(@NotNull String id2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ReplySuggestion(id2, text);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplySuggestion)) {
            return false;
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) obj;
        return Intrinsics.areEqual(this.f291929id, replySuggestion.f291929id) && Intrinsics.areEqual(this.text, replySuggestion.text);
    }

    @NotNull
    public final String getId() {
        return this.f291929id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.f291929id.hashCode() * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplySuggestion(id=" + this.f291929id + ", text=" + this.text + ')';
    }
}
