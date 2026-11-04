package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ArticleSearchState {
    public static final int $stable = 0;

    @w0(parameters = 0)
    public static final class Content extends ArticleSearchState {
        public static final int $stable = 8;

        @NotNull
        private final List<ArticleSearchResultRow> searchResults;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull List<? extends ArticleSearchResultRow> searchResults) {
            super(null);
            Intrinsics.checkNotNullParameter(searchResults, "searchResults");
            this.searchResults = searchResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.searchResults;
            }
            return content.copy(list);
        }

        @NotNull
        public final List<ArticleSearchResultRow> component1() {
            return this.searchResults;
        }

        @NotNull
        public final Content copy(@NotNull List<? extends ArticleSearchResultRow> searchResults) {
            Intrinsics.checkNotNullParameter(searchResults, "searchResults");
            return new Content(searchResults);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && Intrinsics.areEqual(this.searchResults, ((Content) obj).searchResults);
        }

        @NotNull
        public final List<ArticleSearchResultRow> getSearchResults() {
            return this.searchResults;
        }

        public int hashCode() {
            return this.searchResults.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(searchResults=" + this.searchResults + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Error extends ArticleSearchState {
        public static final int $stable = 0;

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class Initial extends ArticleSearchState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return -498820373;
        }

        @NotNull
        public String toString() {
            return "Initial";
        }
    }

    @w0(parameters = 1)
    public static final class Loading extends ArticleSearchState {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj && !(obj instanceof Loading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -2110511901;
        }

        @NotNull
        public String toString() {
            return "Loading";
        }
    }

    @w0(parameters = 1)
    public static final class NoResults extends ArticleSearchState {
        public static final int $stable = 0;

        @NotNull
        private final String searchTerm;

        @NotNull
        private final ArticleViewState.TeamPresenceState teamPresenceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResults(@NotNull ArticleViewState.TeamPresenceState teamPresenceState, @NotNull String searchTerm) {
            super(null);
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            int i10 = 1 >> 0;
            this.teamPresenceState = teamPresenceState;
            this.searchTerm = searchTerm;
        }

        public static /* synthetic */ NoResults copy$default(NoResults noResults, ArticleViewState.TeamPresenceState teamPresenceState, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                teamPresenceState = noResults.teamPresenceState;
            }
            if ((i10 & 2) != 0) {
                str = noResults.searchTerm;
            }
            return noResults.copy(teamPresenceState, str);
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState component1() {
            return this.teamPresenceState;
        }

        @NotNull
        public final String component2() {
            return this.searchTerm;
        }

        @NotNull
        public final NoResults copy(@NotNull ArticleViewState.TeamPresenceState teamPresenceState, @NotNull String searchTerm) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            return new NoResults(teamPresenceState, searchTerm);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoResults)) {
                return false;
            }
            NoResults noResults = (NoResults) obj;
            return Intrinsics.areEqual(this.teamPresenceState, noResults.teamPresenceState) && Intrinsics.areEqual(this.searchTerm, noResults.searchTerm);
        }

        @NotNull
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        @NotNull
        public final ArticleViewState.TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public int hashCode() {
            return (this.teamPresenceState.hashCode() * 31) + this.searchTerm.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoResults(teamPresenceState=" + this.teamPresenceState + ", searchTerm=" + this.searchTerm + ')';
        }
    }

    @w0(parameters = 1)
    public static final class NoResultsNoTeamHelp extends ArticleSearchState {
        public static final int $stable = 0;

        @NotNull
        private final String searchTerm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultsNoTeamHelp(@NotNull String searchTerm) {
            super(null);
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
        }

        public static /* synthetic */ NoResultsNoTeamHelp copy$default(NoResultsNoTeamHelp noResultsNoTeamHelp, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = noResultsNoTeamHelp.searchTerm;
            }
            return noResultsNoTeamHelp.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.searchTerm;
        }

        @NotNull
        public final NoResultsNoTeamHelp copy(@NotNull String searchTerm) {
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            return new NoResultsNoTeamHelp(searchTerm);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoResultsNoTeamHelp) && Intrinsics.areEqual(this.searchTerm, ((NoResultsNoTeamHelp) obj).searchTerm);
        }

        @NotNull
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoResultsNoTeamHelp(searchTerm=" + this.searchTerm + ')';
        }
    }

    public /* synthetic */ ArticleSearchState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ArticleSearchState() {
    }
}
