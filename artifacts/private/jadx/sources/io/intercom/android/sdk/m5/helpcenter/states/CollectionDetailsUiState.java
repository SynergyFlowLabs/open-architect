package io.intercom.android.sdk.m5.helpcenter.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.ErrorState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface CollectionDetailsUiState {

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nCollectionDetailsUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDetailsUiState.kt\nio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1755#2,3:42\n827#2:45\n855#2,2:46\n827#2:48\n855#2,2:49\n*S KotlinDebug\n*F\n+ 1 CollectionDetailsUiState.kt\nio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content\n*L\n23#1:42,3\n27#1:45\n27#1:46,2\n38#1:48\n38#1:49,2\n*E\n"})
    public static final class Content implements CollectionDetailsUiState {
        public static final int $stable = 8;
        private final int articlesCount;

        @NotNull
        private final List<Author> authors;

        @NotNull
        private final List<CollectionDetailsRow> collectionDetailsRows;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f292694id;

        @NotNull
        private final String summary;

        @NotNull
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull String id2, @NotNull String title, @NotNull String summary, int i10, @NotNull List<Author> authors, @NotNull List<? extends CollectionDetailsRow> collectionDetailsRows) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(authors, "authors");
            Intrinsics.checkNotNullParameter(collectionDetailsRows, "collectionDetailsRows");
            this.f292694id = id2;
            this.title = title;
            this.summary = summary;
            this.articlesCount = i10;
            this.authors = authors;
            this.collectionDetailsRows = collectionDetailsRows;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, int i10, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = content.f292694id;
            }
            if ((i11 & 2) != 0) {
                str2 = content.title;
            }
            if ((i11 & 4) != 0) {
                str3 = content.summary;
            }
            if ((i11 & 8) != 0) {
                i10 = content.articlesCount;
            }
            if ((i11 & 16) != 0) {
                list = content.authors;
            }
            if ((i11 & 32) != 0) {
                list2 = content.collectionDetailsRows;
            }
            List list3 = list;
            List list4 = list2;
            return content.copy(str, str2, str3, i10, list3, list4);
        }

        @NotNull
        public final String component1() {
            return this.f292694id;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.summary;
        }

        public final int component4() {
            return this.articlesCount;
        }

        @NotNull
        public final List<Author> component5() {
            return this.authors;
        }

        @NotNull
        public final List<CollectionDetailsRow> component6() {
            return this.collectionDetailsRows;
        }

        @NotNull
        public final Content copy(@NotNull String id2, @NotNull String title, @NotNull String summary, int i10, @NotNull List<Author> authors, @NotNull List<? extends CollectionDetailsRow> collectionDetailsRows) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(authors, "authors");
            Intrinsics.checkNotNullParameter(collectionDetailsRows, "collectionDetailsRows");
            return new Content(id2, title, summary, i10, authors, collectionDetailsRows);
        }

        @NotNull
        public final Content copyWithSingleSendMessageRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            if (!hasSendMessageRow()) {
                return copy$default(this, null, null, null, 0, null, CollectionsKt.plus((Collection<? extends CollectionDetailsRow.SendMessageRow>) this.collectionDetailsRows, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
            }
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, CollectionsKt.plus((Collection<? extends CollectionDetailsRow.SendMessageRow>) arrayList, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
        }

        @NotNull
        public final Content copyWithoutSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, arrayList, 31, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.f292694id, content.f292694id) && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.summary, content.summary) && this.articlesCount == content.articlesCount && Intrinsics.areEqual(this.authors, content.authors) && Intrinsics.areEqual(this.collectionDetailsRows, content.collectionDetailsRows);
        }

        public final int getArticlesCount() {
            return this.articlesCount;
        }

        @NotNull
        public final List<Author> getAuthors() {
            return this.authors;
        }

        @NotNull
        public final List<CollectionDetailsRow> getCollectionDetailsRows() {
            return this.collectionDetailsRows;
        }

        @NotNull
        public final String getId() {
            return this.f292694id;
        }

        @NotNull
        public final String getSummary() {
            return this.summary;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionDetailsRow) it.next()) instanceof CollectionDetailsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.f292694id.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + this.authors.hashCode()) * 31) + this.collectionDetailsRows.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(id=" + this.f292694id + ", title=" + this.title + ", summary=" + this.summary + ", articlesCount=" + this.articlesCount + ", authors=" + this.authors + ", collectionDetailsRows=" + this.collectionDetailsRows + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Error implements CollectionDetailsUiState {
        public static final int $stable = 0;

        @NotNull
        private final ErrorState errorState;

        public Error(@NotNull ErrorState errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        @NotNull
        public final ErrorState component1() {
            return this.errorState;
        }

        @NotNull
        public final Error copy(@NotNull ErrorState errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.errorState, ((Error) obj).errorState);
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Initial implements CollectionDetailsUiState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj && !(obj instanceof Initial)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -545067083;
        }

        @NotNull
        public String toString() {
            return "Initial";
        }
    }

    @w0(parameters = 1)
    public static final class Loading implements CollectionDetailsUiState {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return 2138208685;
        }

        @NotNull
        public String toString() {
            return "Loading";
        }
    }
}
