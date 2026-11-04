package com.planner5d.library.contest.view;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f153721f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f153722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Contest f153723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Date f153724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f153725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f153726e;

    public enum a {
        ActiveContest(0),
        InactiveContest(1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f153730e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f153731a;

        a(int i10) {
            this.f153731a = i10;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f153730e;
        }

        public final int n() {
            return this.f153731a;
        }
    }

    public n(@NotNull a viewType, @Nullable Contest contest, @NotNull Date serverTime, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(serverTime, "serverTime");
        this.f153722a = viewType;
        this.f153723b = contest;
        this.f153724c = serverTime;
        this.f153725d = z10;
        this.f153726e = z11;
    }

    @Nullable
    public final Contest a() {
        return this.f153723b;
    }

    public final boolean b() {
        return this.f153725d;
    }

    @NotNull
    public final Date c() {
        return this.f153724c;
    }

    public final boolean d() {
        return this.f153726e;
    }

    @NotNull
    public final a e() {
        return this.f153722a;
    }
}
