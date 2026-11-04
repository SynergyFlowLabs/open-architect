package io.intercom.android.sdk.m5.helpcenter.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class CollectionDetailsRow {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class ArticleRow extends CollectionDetailsRow {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f292693id;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleRow(@NotNull String id2, @NotNull String title) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f292693id = id2;
            this.title = title;
        }

        public static /* synthetic */ ArticleRow copy$default(ArticleRow articleRow, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = articleRow.f292693id;
            }
            if ((i10 & 2) != 0) {
                str2 = articleRow.title;
            }
            return articleRow.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.f292693id;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final ArticleRow copy(@NotNull String id2, @NotNull String title) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ArticleRow(id2, title);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleRow)) {
                return false;
            }
            ArticleRow articleRow = (ArticleRow) obj;
            return Intrinsics.areEqual(this.f292693id, articleRow.f292693id) && Intrinsics.areEqual(this.title, articleRow.title);
        }

        @NotNull
        public final String getId() {
            return this.f292693id;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (this.f292693id.hashCode() * 31) + this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return "ArticleRow(id=" + this.f292693id + ", title=" + this.title + ')';
        }
    }

    @w0(parameters = 1)
    public static final class CollectionRow extends CollectionDetailsRow {
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
    public static final class FullHelpCenterRow extends CollectionDetailsRow {
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
            return -1758362845;
        }

        @NotNull
        public String toString() {
            return "FullHelpCenterRow";
        }
    }

    @w0(parameters = 1)
    public static final class SendMessageRow extends CollectionDetailsRow {
        public static final int $stable = 0;

        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            int i10 = 5 & 0;
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
            return (obj instanceof SendMessageRow) && Intrinsics.areEqual(this.teamPresenceState, ((SendMessageRow) obj).teamPresenceState);
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

    public /* synthetic */ CollectionDetailsRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectionDetailsRow() {
    }
}
