package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.w0;
import com.facebook.share.internal.f;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class ComposerSuggestions {
    public static final int $stable = 8;

    @c("composer_disabled")
    private final boolean isComposerDisabled;

    @c("snapshot_id")
    @Nullable
    private final Long snapshotId;

    @c(f.f101837i)
    @NotNull
    private final List<Suggestion> suggestions;

    @w0(parameters = 1)
    public static final class Suggestion {
        public static final int $stable = 0;

        @c("text")
        @NotNull
        private final String text;

        @c("uuid")
        @NotNull
        private final String uuid;

        /* JADX WARN: Multi-variable type inference failed */
        public Suggestion() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = suggestion.text;
            }
            if ((i10 & 2) != 0) {
                str2 = suggestion.uuid;
            }
            return suggestion.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.text;
        }

        @NotNull
        public final String component2() {
            return this.uuid;
        }

        @NotNull
        public final Suggestion copy(@NotNull String text, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new Suggestion(text, uuid);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            return Intrinsics.areEqual(this.text, suggestion.text) && Intrinsics.areEqual(this.uuid, suggestion.uuid);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.uuid.hashCode();
        }

        @NotNull
        public String toString() {
            return "Suggestion(text=" + this.text + ", uuid=" + this.uuid + ')';
        }

        public Suggestion(@NotNull String text, @NotNull String uuid) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.text = text;
            this.uuid = uuid;
        }

        public /* synthetic */ Suggestion(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposerSuggestions() {
        this(null, false, null, 7, null);
        int i10 = 0 >> 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerSuggestions copy$default(ComposerSuggestions composerSuggestions, List list, boolean z10, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = composerSuggestions.suggestions;
        }
        if ((i10 & 2) != 0) {
            z10 = composerSuggestions.isComposerDisabled;
        }
        if ((i10 & 4) != 0) {
            l10 = composerSuggestions.snapshotId;
        }
        return composerSuggestions.copy(list, z10, l10);
    }

    @NotNull
    public final List<Suggestion> component1() {
        return this.suggestions;
    }

    public final boolean component2() {
        return this.isComposerDisabled;
    }

    @Nullable
    public final Long component3() {
        return this.snapshotId;
    }

    @NotNull
    public final ComposerSuggestions copy(@NotNull List<Suggestion> suggestions, boolean z10, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new ComposerSuggestions(suggestions, z10, l10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerSuggestions)) {
            return false;
        }
        ComposerSuggestions composerSuggestions = (ComposerSuggestions) obj;
        return Intrinsics.areEqual(this.suggestions, composerSuggestions.suggestions) && this.isComposerDisabled == composerSuggestions.isComposerDisabled && Intrinsics.areEqual(this.snapshotId, composerSuggestions.snapshotId);
    }

    @Nullable
    public final Long getSnapshotId() {
        return this.snapshotId;
    }

    @NotNull
    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        int iHashCode = ((this.suggestions.hashCode() * 31) + Boolean.hashCode(this.isComposerDisabled)) * 31;
        Long l10 = this.snapshotId;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final boolean isComposerDisabled() {
        return this.isComposerDisabled;
    }

    @NotNull
    public String toString() {
        return "ComposerSuggestions(suggestions=" + this.suggestions + ", isComposerDisabled=" + this.isComposerDisabled + ", snapshotId=" + this.snapshotId + ')';
    }

    public ComposerSuggestions(@NotNull List<Suggestion> suggestions, boolean z10, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.suggestions = suggestions;
        this.isComposerDisabled = z10;
        this.snapshotId = l10;
    }

    public /* synthetic */ ComposerSuggestions(List list, boolean z10, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : l10);
    }
}
