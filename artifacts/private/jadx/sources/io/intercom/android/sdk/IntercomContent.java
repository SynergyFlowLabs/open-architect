package io.intercom.android.sdk;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class IntercomContent {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class Article extends IntercomContent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f291505id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Article(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f291505id = id2;
        }

        public static /* synthetic */ Article copy$default(Article article, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = article.f291505id;
            }
            return article.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f291505id;
        }

        @NotNull
        public final Article copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Article(id2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Article) && Intrinsics.areEqual(this.f291505id, ((Article) obj).f291505id)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getId() {
            return this.f291505id;
        }

        public int hashCode() {
            return this.f291505id.hashCode();
        }

        @NotNull
        public String toString() {
            return "Article(id=" + this.f291505id + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Carousel extends IntercomContent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f291506id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Carousel(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f291506id = id2;
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = carousel.f291506id;
            }
            return carousel.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f291506id;
        }

        @NotNull
        public final Carousel copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Carousel(id2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Carousel) && Intrinsics.areEqual(this.f291506id, ((Carousel) obj).f291506id);
        }

        @NotNull
        public final String getId() {
            return this.f291506id;
        }

        public int hashCode() {
            return this.f291506id.hashCode();
        }

        @NotNull
        public String toString() {
            return "Carousel(id=" + this.f291506id + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Conversation extends IntercomContent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f291507id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f291507id = id2;
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversation.f291507id;
            }
            return conversation.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f291507id;
        }

        @NotNull
        public final Conversation copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Conversation(id2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && Intrinsics.areEqual(this.f291507id, ((Conversation) obj).f291507id);
        }

        @NotNull
        public final String getId() {
            return this.f291507id;
        }

        public int hashCode() {
            return this.f291507id.hashCode();
        }

        @NotNull
        public String toString() {
            return "Conversation(id=" + this.f291507id + ')';
        }
    }

    @w0(parameters = 0)
    public static final class HelpCenterCollections extends IntercomContent {
        public static final int $stable = 8;

        @NotNull
        private final List<String> ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollections(@NotNull List<String> ids) {
            super(null);
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.ids = ids;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.ids;
        }

        @NotNull
        public final HelpCenterCollections copy(@NotNull List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return new HelpCenterCollections(ids);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof HelpCenterCollections) && Intrinsics.areEqual(this.ids, ((HelpCenterCollections) obj).ids)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        @NotNull
        public String toString() {
            return "HelpCenterCollections(ids=" + this.ids + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Survey extends IntercomContent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f291508id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Survey(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f291508id = id2;
        }

        public static /* synthetic */ Survey copy$default(Survey survey, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = survey.f291508id;
            }
            return survey.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f291508id;
        }

        @NotNull
        public final Survey copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Survey(id2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Survey) && Intrinsics.areEqual(this.f291508id, ((Survey) obj).f291508id);
        }

        @NotNull
        public final String getId() {
            return this.f291508id;
        }

        public int hashCode() {
            return this.f291508id.hashCode();
        }

        @NotNull
        public String toString() {
            return "Survey(id=" + this.f291508id + ')';
        }
    }

    @w0(parameters = 1)
    public static final class Ticket extends IntercomContent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @NotNull
        private final String f291509id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ticket(@NotNull String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f291509id = id2;
        }

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticket.f291509id;
            }
            return ticket.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f291509id;
        }

        @NotNull
        public final Ticket copy(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Ticket(id2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ticket) && Intrinsics.areEqual(this.f291509id, ((Ticket) obj).f291509id);
        }

        @NotNull
        public final String getId() {
            return this.f291509id;
        }

        public int hashCode() {
            return this.f291509id.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ticket(id=" + this.f291509id + ')';
        }
    }

    public /* synthetic */ IntercomContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntercomContent() {
    }
}
