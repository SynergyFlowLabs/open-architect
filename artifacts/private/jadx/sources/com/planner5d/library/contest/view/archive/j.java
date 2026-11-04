package com.planner5d.library.contest.view.archive;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestWinner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public abstract class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f153445d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Contest f153446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f153447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f153448c;

    @w0(parameters = 1)
    public static final class a extends j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f153449e = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Contest contest, boolean z10, boolean z11) {
            super(contest, z10, z11, null);
            Intrinsics.checkNotNullParameter(contest, "contest");
            int i10 = 2 << 0;
        }
    }

    @w0(parameters = 0)
    public static final class b extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f153450f = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final ContestWinner f153451e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ContestWinner winner, @NotNull Contest contest, boolean z10, boolean z11) {
            super(contest, z10, z11, null);
            Intrinsics.checkNotNullParameter(winner, "winner");
            Intrinsics.checkNotNullParameter(contest, "contest");
            this.f153451e = winner;
        }

        @NotNull
        public final ContestWinner d() {
            return this.f153451e;
        }
    }

    public /* synthetic */ j(Contest contest, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(contest, z10, z11);
    }

    @NotNull
    public final Contest a() {
        return this.f153446a;
    }

    public final boolean b() {
        return this.f153447b;
    }

    public final boolean c() {
        return this.f153448c;
    }

    private j(Contest contest, boolean z10, boolean z11) {
        this.f153446a = contest;
        this.f153447b = z10;
        this.f153448c = z11;
    }
}
