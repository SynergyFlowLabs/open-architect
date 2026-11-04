package io.intercom.android.sdk.m5.helpcenter.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class CollectionsRow {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class BrowseAllHelpTopicsAsListRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        public static final BrowseAllHelpTopicsAsListRow INSTANCE = new BrowseAllHelpTopicsAsListRow();

        private BrowseAllHelpTopicsAsListRow() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof BrowseAllHelpTopicsAsListRow);
        }

        public int hashCode() {
            return 164025713;
        }

        @NotNull
        public String toString() {
            return "BrowseAllHelpTopicsAsListRow";
        }
    }

    @w0(parameters = 1)
    public static final class CollectionRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        private final CollectionRowData rowData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectionRow(@NotNull CollectionRowData rowData) {
            super(null);
            Intrinsics.checkNotNullParameter(rowData, "rowData");
            this.rowData = rowData;
        }

        public static /* synthetic */ CollectionRow copy$default(CollectionRow collectionRow, CollectionRowData collectionRowData, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                collectionRowData = collectionRow.rowData;
            }
            return collectionRow.copy(collectionRowData);
        }

        @NotNull
        public final CollectionRowData component1() {
            return this.rowData;
        }

        @NotNull
        public final CollectionRow copy(@NotNull CollectionRowData rowData) {
            Intrinsics.checkNotNullParameter(rowData, "rowData");
            return new CollectionRow(rowData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionRow) && Intrinsics.areEqual(this.rowData, ((CollectionRow) obj).rowData);
        }

        @NotNull
        public final CollectionRowData getRowData() {
            return this.rowData;
        }

        public int hashCode() {
            return this.rowData.hashCode();
        }

        @NotNull
        public String toString() {
            return "CollectionRow(rowData=" + this.rowData + ')';
        }
    }

    @w0(parameters = 1)
    public static final class FullHelpCenterRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        public static final FullHelpCenterRow INSTANCE = new FullHelpCenterRow();

        private FullHelpCenterRow() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof FullHelpCenterRow);
        }

        public int hashCode() {
            return 788964466;
        }

        @NotNull
        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    @w0(parameters = 1)
    public static final class SendMessageRow extends CollectionsRow {
        public static final int $stable = 0;

        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ SendMessageRow copy$default(SendMessageRow sendMessageRow, ArticleViewState.TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState = sendMessageRow.teamPresenceState;
            }
            return sendMessageRow.copy(teamPresenceState);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        @NotNull
        public final SendMessageRow copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            return new SendMessageRow(teamPresenceState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SendMessageRow) && Intrinsics.areEqual(this.teamPresenceState, ((SendMessageRow) obj).teamPresenceState)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return this.teamPresenceState.hashCode();
        }

        @NotNull
        public String toString() {
            return "SendMessageRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ CollectionsRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectionsRow() {
    }
}
