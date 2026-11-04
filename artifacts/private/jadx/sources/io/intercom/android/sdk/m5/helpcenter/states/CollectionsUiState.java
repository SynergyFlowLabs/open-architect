package io.intercom.android.sdk.m5.helpcenter.states;

import androidx.compose.runtime.internal.w0;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
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
public interface CollectionsUiState {

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nCollectionsUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsUiState.kt\nio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1755#2,3:36\n827#2:39\n855#2,2:40\n827#2:42\n855#2,2:43\n*S KotlinDebug\n*F\n+ 1 CollectionsUiState.kt\nio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content\n*L\n17#1:36,3\n21#1:39\n21#1:40,2\n32#1:42\n32#1:43,2\n*E\n"})
    public static final class Content implements CollectionsUiState {
        public static final int $stable = 8;

        @NotNull
        private final List<CollectionsRow> collections;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull List<? extends CollectionsRow> collections) {
            Intrinsics.checkNotNullParameter(collections, "collections");
            this.collections = collections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.collections;
            }
            return content.copy(list);
        }

        @NotNull
        public final List<CollectionsRow> component1() {
            return this.collections;
        }

        @NotNull
        public final Content copy(@NotNull List<? extends CollectionsRow> collections) {
            Intrinsics.checkNotNullParameter(collections, "collections");
            return new Content(collections);
        }

        @NotNull
        public final Content copyWithSingleSendMessageRow(@NotNull ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            if (!hasSendMessageRow()) {
                return copy(CollectionsKt.plus((Collection<? extends CollectionsRow.SendMessageRow>) this.collections, new CollectionsRow.SendMessageRow(teamPresenceState)));
            }
            List<CollectionsRow> list = this.collections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(CollectionsKt.plus((Collection<? extends CollectionsRow.SendMessageRow>) arrayList, new CollectionsRow.SendMessageRow(teamPresenceState)));
        }

        @NotNull
        public final Content copyWithoutSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(arrayList);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && Intrinsics.areEqual(this.collections, ((Content) obj).collections);
        }

        @NotNull
        public final List<CollectionsRow> getCollections() {
            return this.collections;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionsRow) it.next()) instanceof CollectionsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.collections.hashCode();
        }

        @NotNull
        public String toString() {
            return "Content(collections=" + this.collections + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Error implements CollectionsUiState {
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
    public static final class Initial implements CollectionsUiState {
        public static final int $stable = 0;

        @NotNull
        public static final Initial INSTANCE = new Initial();

        private Initial() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public int hashCode() {
            return 1088616516;
        }

        @NotNull
        public String toString() {
            return "Initial";
        }
    }

    @w0(parameters = 1)
    public static final class Loading implements CollectionsUiState {
        public static final int $stable = 0;

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -523075012;
        }

        @NotNull
        public String toString() {
            return "Loading";
        }
    }
}
