package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ArticleSearchResultRow {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class TeammateHelpRow extends ArticleSearchResultRow {
        public static final int $stable = 0;

        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TeammateHelpRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            super(null);
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ TeammateHelpRow copy$default(TeammateHelpRow teammateHelpRow, ArticleViewState.TeamPresenceState teamPresenceState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState = teammateHelpRow.teamPresenceState;
            }
            return teammateHelpRow.copy(teamPresenceState);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        @NotNull
        public final TeammateHelpRow copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            return new TeammateHelpRow(teamPresenceState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeammateHelpRow) && Intrinsics.areEqual(this.teamPresenceState, ((TeammateHelpRow) obj).teamPresenceState);
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
            return "TeammateHelpRow(teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    public /* synthetic */ ArticleSearchResultRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @w0(parameters = 1)
    public static final class ArticleResultRow extends ArticleSearchResultRow {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f291589id;

        @NotNull
        private final String summaryText;
        private final int summaryVisibility;

        @NotNull
        private final String titleText;

        public /* synthetic */ ArticleResultRow(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? 8 : i10);
        }

        public static /* synthetic */ ArticleResultRow copy$default(ArticleResultRow articleResultRow, String str, String str2, String str3, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleResultRow.f291589id;
            }
            if ((i11 & 2) != 0) {
                str2 = articleResultRow.titleText;
            }
            if ((i11 & 4) != 0) {
                str3 = articleResultRow.summaryText;
            }
            if ((i11 & 8) != 0) {
                i10 = articleResultRow.summaryVisibility;
            }
            return articleResultRow.copy(str, str2, str3, i10);
        }

        @NotNull
        public final String component1() {
            return this.f291589id;
        }

        @NotNull
        public final String component2() {
            return this.titleText;
        }

        @NotNull
        public final String component3() {
            return this.summaryText;
        }

        public final int component4() {
            return this.summaryVisibility;
        }

        @NotNull
        public final ArticleResultRow copy(@NotNull String id2, @NotNull String titleText, @NotNull String summaryText, int i10) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(summaryText, "summaryText");
            return new ArticleResultRow(id2, titleText, summaryText, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleResultRow)) {
                return false;
            }
            ArticleResultRow articleResultRow = (ArticleResultRow) obj;
            if (Intrinsics.areEqual(this.f291589id, articleResultRow.f291589id) && Intrinsics.areEqual(this.titleText, articleResultRow.titleText) && Intrinsics.areEqual(this.summaryText, articleResultRow.summaryText) && this.summaryVisibility == articleResultRow.summaryVisibility) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getId() {
            return this.f291589id;
        }

        @NotNull
        public final String getSummaryText() {
            return this.summaryText;
        }

        public final int getSummaryVisibility() {
            return this.summaryVisibility;
        }

        @NotNull
        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return (((((this.f291589id.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.summaryText.hashCode()) * 31) + Integer.hashCode(this.summaryVisibility);
        }

        @NotNull
        public String toString() {
            return "ArticleResultRow(id=" + this.f291589id + ", titleText=" + this.titleText + ", summaryText=" + this.summaryText + ", summaryVisibility=" + this.summaryVisibility + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleResultRow(@NotNull String id2, @NotNull String titleText, @NotNull String summaryText, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(summaryText, "summaryText");
            this.f291589id = id2;
            this.titleText = titleText;
            this.summaryText = summaryText;
            this.summaryVisibility = i10;
        }
    }

    private ArticleSearchResultRow() {
    }
}
