package com.planner5d.library.contest;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f148476a = 0;

    @w0(parameters = 0)
    public static final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148477c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ErrorMessageException f148478b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ErrorMessageException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f148478b = error;
        }

        @NotNull
        public final ErrorMessageException a() {
            return this.f148478b;
        }
    }

    @w0(parameters = 1)
    public static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f148479b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148480c = 0;

        private b() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1543397921;
        }

        @NotNull
        public String toString() {
            return "Initializing";
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.contest.c$c, reason: collision with other inner class name */
    @w0(parameters = 1)
    public static final class C1518c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1518c f148481b = new C1518c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148482c = 0;

        private C1518c() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C1518c);
        }

        public int hashCode() {
            return 842808537;
        }

        @NotNull
        public String toString() {
            return "Loaded";
        }
    }

    @w0(parameters = 0)
    public static final class d extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f148483d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Contest f148484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<eb.a> f148485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Contest contest, @NotNull List<eb.a> topParticipants) {
            super(null);
            Intrinsics.checkNotNullParameter(contest, "contest");
            Intrinsics.checkNotNullParameter(topParticipants, "topParticipants");
            this.f148484b = contest;
            this.f148485c = topParticipants;
        }

        @NotNull
        public final Contest a() {
            return this.f148484b;
        }

        @NotNull
        public final List<eb.a> b() {
            return this.f148485c;
        }
    }

    @w0(parameters = 0)
    public static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f148486e = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Contest f148487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Project f148488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final Date f148489d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull Contest contest, @Nullable Project project, @NotNull Date serverTime) {
            super(null);
            Intrinsics.checkNotNullParameter(contest, "contest");
            Intrinsics.checkNotNullParameter(serverTime, "serverTime");
            this.f148487b = contest;
            this.f148488c = project;
            this.f148489d = serverTime;
        }

        @NotNull
        public final Contest a() {
            return this.f148487b;
        }

        @Nullable
        public final Project b() {
            return this.f148488c;
        }

        @NotNull
        public final Date c() {
            return this.f148489d;
        }
    }

    @w0(parameters = 1)
    public static final class f extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f148490b = new f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148491c = 0;

        private f() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 357265128;
        }

        @NotNull
        public String toString() {
            return "Loading";
        }
    }

    @w0(parameters = 1)
    public static final class g extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f148492b = new g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148493c = 0;

        private g() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1846555217;
        }

        @NotNull
        public String toString() {
            return "Success";
        }
    }

    @w0(parameters = 1)
    public static final class h extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f148494b = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148495c = 0;

        private h() {
            super(null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 384218927;
        }

        @NotNull
        public String toString() {
            return "Unloading";
        }
    }

    @w0(parameters = 1)
    public static final class i extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148496c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Integer f148497b;

        public i(@Nullable Integer num) {
            super(null);
            this.f148497b = num;
        }

        @Nullable
        public final Integer a() {
            return this.f148497b;
        }
    }

    @w0(parameters = 1)
    public static final class j extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f148498c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Integer f148499b;

        public j(@Nullable Integer num) {
            super(null);
            this.f148499b = num;
        }

        @Nullable
        public final Integer a() {
            return this.f148499b;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
