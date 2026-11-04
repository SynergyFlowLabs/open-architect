package com.planner5d.library.contest.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestPrize;
import com.planner5d.library.database.model.contest.ContestWinner;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.u2;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@e.a({"NullSafeMutableLiveData"})
public final class z extends f2 {
    public static final long Y = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.k f153931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y1 f153932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c2 f153933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.x f153934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.f f153935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f153936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.c2 f153937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f153938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.d f153939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f153940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final l3 f153941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.t f153942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.helper.b f153943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c1<c> f153944o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f153945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final c1<List<ContestPrize>> f153946t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f153947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final b f153929w = new b(null);
    public static final int X = 8;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$2", f = "ContestViewModel.kt", i = {}, l = {113, 114}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f153949b;

        /* JADX INFO: renamed from: com.planner5d.library.contest.view.z$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$2$1", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1530a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends ContestPrize>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f153952b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1530a(z zVar, kotlin.coroutines.d<? super C1530a> dVar) {
                super(2, dVar);
                this.f153952b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1530a(this.f153952b, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends ContestPrize>> dVar) {
                return invoke2(s0Var, (kotlin.coroutines.d<? super List<ContestPrize>>) dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153951a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f153952b.f153930a.h();
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(s0 s0Var, kotlin.coroutines.d<? super List<ContestPrize>> dVar) {
                return ((C1530a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            androidx.lifecycle.w0 w0VarV0;
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153949b;
            if (i10 != 0) {
                if (i10 == 1) {
                    w0VarV0 = (c1) this.f153948a;
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1Var = (c1) this.f153948a;
                    ResultKt.m(obj);
                }
                c1Var.r(obj);
                return Unit.f312394a;
            }
            ResultKt.m(obj);
            w0VarV0 = z.this.v0();
            com.planner5d.library.model.manager.config.p pVar = z.this.f153936g;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.contestSuggested;
            this.f153948a = w0VarV0;
            this.f153949b = 1;
            obj = pVar.G(rVar, false, this);
            if (obj == objL) {
            }
            return objL;
            w0VarV0.r(obj);
            c1<List<ContestPrize>> c1VarX0 = z.this.x0();
            n0 n0VarH = z.this.f153942m.h();
            C1530a c1530a = new C1530a(z.this, null);
            this.f153948a = c1VarX0;
            this.f153949b = 2;
            Object objH = kotlinx.coroutines.i.h(n0VarH, c1530a, this);
            if (objH != objL) {
                obj = objH;
                c1Var = c1VarX0;
                c1Var.r(obj);
                return Unit.f312394a;
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @w0(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f153953j = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f153954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<com.planner5d.library.contest.view.n> f153955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<com.planner5d.library.contest.view.archive.j> f153956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f153957d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f153958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f153959f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f153960g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f153961h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f153962i;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull d state, @NotNull List<com.planner5d.library.contest.view.n> activeContests, @NotNull List<? extends com.planner5d.library.contest.view.archive.j> archiveContests) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(activeContests, "activeContests");
            Intrinsics.checkNotNullParameter(archiveContests, "archiveContests");
            this.f153954a = state;
            this.f153955b = activeContests;
            this.f153956c = archiveContests;
            boolean z10 = state == d.IDLE;
            this.f153957d = z10;
            this.f153958e = z10 && activeContests.isEmpty();
            this.f153959f = z10 && archiveContests.isEmpty();
            boolean z11 = state == d.SYNCING;
            this.f153960g = z11;
            boolean z12 = state == d.JOINING;
            this.f153961h = z12;
            this.f153962i = z11 || z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c e(c cVar, d dVar, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                dVar = cVar.f153954a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f153955b;
            }
            if ((i10 & 4) != 0) {
                list2 = cVar.f153956c;
            }
            return cVar.d(dVar, list, list2);
        }

        @NotNull
        public final d a() {
            return this.f153954a;
        }

        @NotNull
        public final List<com.planner5d.library.contest.view.n> b() {
            return this.f153955b;
        }

        @NotNull
        public final List<com.planner5d.library.contest.view.archive.j> c() {
            return this.f153956c;
        }

        @NotNull
        public final c d(@NotNull d state, @NotNull List<com.planner5d.library.contest.view.n> activeContests, @NotNull List<? extends com.planner5d.library.contest.view.archive.j> archiveContests) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(activeContests, "activeContests");
            Intrinsics.checkNotNullParameter(archiveContests, "archiveContests");
            return new c(state, activeContests, archiveContests);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f153954a == cVar.f153954a && Intrinsics.areEqual(this.f153955b, cVar.f153955b) && Intrinsics.areEqual(this.f153956c, cVar.f153956c);
        }

        @NotNull
        public final List<com.planner5d.library.contest.view.n> f() {
            return this.f153955b;
        }

        @NotNull
        public final List<com.planner5d.library.contest.view.archive.j> g() {
            return this.f153956c;
        }

        public final boolean h() {
            return this.f153962i;
        }

        public int hashCode() {
            return (((this.f153954a.hashCode() * 31) + this.f153955b.hashCode()) * 31) + this.f153956c.hashCode();
        }

        public final boolean i() {
            return this.f153961h;
        }

        public final boolean j() {
            return this.f153960g;
        }

        public final boolean k() {
            return this.f153958e;
        }

        public final boolean l() {
            return this.f153959f;
        }

        @l1
        @NotNull
        public final d m() {
            return this.f153954a;
        }

        @NotNull
        public String toString() {
            return "ContestListState(state=" + this.f153954a + ", activeContests=" + this.f153955b + ", archiveContests=" + this.f153956c + ")";
        }
    }

    public enum d {
        UNINITIALIZED,
        IDLE,
        SYNCING,
        JOINING;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f153968f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f153968f;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$edit$1", f = "ContestViewModel.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153969a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f153971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.r f153972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ u2 f153973e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Contest contest, com.planner5d.library.services.r rVar, u2 u2Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f153971c = contest;
            this.f153972d = rVar;
            this.f153973e = u2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new e(this.f153971c, this.f153972d, this.f153973e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153969a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.contest.data.f fVar = z.this.f153935f;
                Contest contest = this.f153971c;
                com.planner5d.library.activity.helper.event.content.c cVarQ0 = z.this.q0(this.f153972d, this.f153973e);
                this.f153969a = 1;
                if (fVar.k(contest, cVarQ0, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$markContestSuggested$1", f = "ContestViewModel.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153974a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153974a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = z.this.f153936g;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.contestSuggested;
                this.f153974a = 1;
                if (pVar.L(rVar, true, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            z.this.v0().r(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel", f = "ContestViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {165, 166}, m = "refreshActiveContestItems", n = {"this", "hasJoined", "hasSubmitted", MetricConsts.Install, "hasJoined", "hasSubmitted"}, s = {"L$0", "Z$0", "Z$1", "L$0", "Z$0", "Z$1"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f153977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f153978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f153979d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f153981f;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f153979d = obj;
            this.f153981f |= Integer.MIN_VALUE;
            return z.this.B0(false, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$refreshActiveContestItems$2$serverTime$1", f = "ContestViewModel.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Date>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153982a;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153982a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.contest.data.i iVar = z.this.f153930a;
            this.f153982a = 1;
            Object objV = iVar.v(this);
            return objV == objL ? objL : objV;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Date> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$refreshContestItems$1", f = "ContestViewModel.kt", i = {1, 2, 3, 4}, l = {122, 123, 125, 129, androidx.media2.widget.f.i.f59773f0}, m = "invokeSuspend", n = {"contests", "contests", "project", "archiveContests"}, s = {"L$0", "L$0", "L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nContestViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestViewModel.kt\ncom/planner5d/library/contest/view/ContestViewModel$refreshContestItems$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f153985b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f153987d;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$refreshContestItems$1$archiveContests$1", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super List<? extends com.planner5d.library.contest.view.archive.j>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Contest> f153989b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<Contest> list, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f153989b = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f153989b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153988a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                List<Contest> list = this.f153989b;
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                for (Contest contest : list) {
                    ContestWinner contestWinner = (ContestWinner) CollectionsKt.firstOrNull((List) contest.d0());
                    if (contestWinner != null) {
                        kotlin.coroutines.jvm.internal.b.a(listCreateListBuilder.add(new com.planner5d.library.contest.view.archive.j.b(contestWinner, contest, false, contest.K() != null)));
                    }
                }
                return CollectionsKt.build(listCreateListBuilder);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super List<? extends com.planner5d.library.contest.view.archive.j>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$refreshContestItems$1$project$1$1", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f153991b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Contest f153992c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z zVar, Contest contest, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f153991b = zVar;
                this.f153992c = contest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f153991b, this.f153992c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153990a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f153991b.f153930a.u(this.f153992c);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function0<Unit> function0, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f153987d = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new i(this.f153987d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c9 A[PHI: r1 r13
          0x00c9: PHI (r1v10 com.planner5d.library.database.model.project.Project) = 
          (r1v7 com.planner5d.library.database.model.project.Project)
          (r1v20 com.planner5d.library.database.model.project.Project)
         binds: [B:33:0x00c5, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]
          0x00c9: PHI (r13v17 java.lang.Object) = (r13v12 java.lang.Object), (r13v0 java.lang.Object) binds: [B:33:0x00c5, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:51:0x010d  */
        /* JADX WARN: Code duplicated, block: B:54:0x011d  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        
            if (r13 == r0) goto L47;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.contest.view.z.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$saveNextSynchronizationTime$1", f = "ContestViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153993a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f153995c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Contest contest, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f153995c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new j(this.f153995c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Date dateZ;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153993a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.contest.data.i iVar = z.this.f153930a;
                this.f153993a = 1;
                obj = iVar.v(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            long time = ((Date) obj).getTime();
            Date dateI = this.f153995c.I();
            if ((dateI != null ? dateI.getTime() : 0L) >= time) {
                dateZ = this.f153995c.I();
            } else {
                Date dateZ2 = this.f153995c.z();
                dateZ = (dateZ2 != null ? dateZ2.getTime() : 0L) >= time ? this.f153995c.z() : null;
            }
            if (dateZ != null) {
                z.this.f153939j.a(dateZ.getTime());
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$share$1", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153996a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f153998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f153999d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Contest contest, Activity activity, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f153998c = contest;
            this.f153999d = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new k(this.f153998c, this.f153999d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f153996a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Project projectU = z.this.f153930a.u(this.f153998c);
            if (projectU != null) {
                z zVar = z.this;
                zVar.f153943n.a(this.f153999d, projectU, this.f153998c, com.planner5d.library.contest.e.r.f151439c5, l3.b.main_design_battle_page);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$synchronizeForced$1", f = "ContestViewModel.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154000a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$synchronizeForced$1$1", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f154002a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f154003b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f154003b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f154003b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f154002a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f154003b.f153931b.d();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        l(kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f154000a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    n0 n0VarH = z.this.f153942m.h();
                    a aVar = new a(z.this, null);
                    this.f154000a = 1;
                    if (kotlinx.coroutines.i.h(n0VarH, aVar, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                z.D0(z.this, null, 1, null);
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
                z.this.f153933d.i(ErrorMessageParser.parse$default(z.this.f153940k, th2, null, 2, null));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel", f = "ContestViewModel.kt", i = {0}, l = {183}, m = "synchronizeIfNeeded", n = {"this"}, s = {"L$0"})
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f154004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f154005b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f154007d;

        m(kotlin.coroutines.d<? super m> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154005b = obj;
            this.f154007d |= Integer.MIN_VALUE;
            return z.this.J0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$synchronizeIfNeeded$2", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super com.planner5d.library.model.manager.synchronization.m>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154008a;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new n(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f154008a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return z.this.f153931b.b();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super com.planner5d.library.model.manager.synchronization.m> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$synchronizeIfNeeded$4", f = "ContestViewModel.kt", i = {}, l = {com.facebook.internal.p.f100029m}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends kotlin.coroutines.jvm.internal.o implements Function2<com.planner5d.library.activity.fragment.list.b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f154010a;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.ContestViewModel$synchronizeIfNeeded$4$1", f = "ContestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f154012a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f154013b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f154013b = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f154013b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f154012a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                try {
                    this.f154013b.f153931b.e();
                } catch (Throwable th2) {
                    timber.log.b.f381052a.e(th2);
                    this.f154013b.f153933d.i(ErrorMessageParser.parse$default(this.f154013b.f153940k, th2, null, 2, null));
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        o(kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z.this.new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f154010a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n0 n0VarH = z.this.f153942m.h();
                a aVar = new a(z.this, null);
                this.f154010a = 1;
                if (kotlinx.coroutines.i.h(n0VarH, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            z.D0(z.this, null, 1, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.planner5d.library.activity.fragment.list.b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public z(@NotNull com.planner5d.library.contest.data.i contestManager, @NotNull com.planner5d.library.model.manager.synchronization.k synchronizationManager, @NotNull y1 menuManager, @NotNull c2 messageManager, @NotNull com.planner5d.library.activity.fragment.x navigator, @NotNull com.planner5d.library.contest.data.f contestActionsHelper, @NotNull com.planner5d.library.model.manager.config.p preferencesManager, @NotNull com.planner5d.library.services.utility.c2 networkStateUtility, @NotNull com.planner5d.library.modules.user.user.w userAuthorization, @NotNull com.planner5d.library.contest.d synchronizationExecutor, @NotNull ErrorMessageParser errorMessageParser, @NotNull l3 statisticsEventContests, @NotNull com.planner5d.library.services.utility.t coroutineDispatchersProvider, @NotNull com.planner5d.library.contest.helper.b contestProjectSharer) {
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(contestActionsHelper, "contestActionsHelper");
        Intrinsics.checkNotNullParameter(preferencesManager, "preferencesManager");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(synchronizationExecutor, "synchronizationExecutor");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        Intrinsics.checkNotNullParameter(coroutineDispatchersProvider, "coroutineDispatchersProvider");
        Intrinsics.checkNotNullParameter(contestProjectSharer, "contestProjectSharer");
        this.f153930a = contestManager;
        this.f153931b = synchronizationManager;
        this.f153932c = menuManager;
        this.f153933d = messageManager;
        this.f153934e = navigator;
        this.f153935f = contestActionsHelper;
        this.f153936g = preferencesManager;
        this.f153937h = networkStateUtility;
        this.f153938i = userAuthorization;
        this.f153939j = synchronizationExecutor;
        this.f153940k = errorMessageParser;
        this.f153941l = statisticsEventContests;
        this.f153942m = coroutineDispatchersProvider;
        this.f153943n = contestProjectSharer;
        this.f153944o = new c1<>(new c(d.UNINITIALIZED, CollectionsKt.emptyList(), CollectionsKt.emptyList()));
        this.f153945s = new c1<>();
        this.f153946t = new c1<>();
        this.f153947v = kotlin.g0.c(new Function0() { // from class: com.planner5d.library.contest.view.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.o0(this.f153926a);
            }
        });
        C0(new Function0() { // from class: com.planner5d.library.contest.view.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.Y(this.f153927a);
            }
        });
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object B0(boolean z10, boolean z11, kotlin.coroutines.d<? super List<com.planner5d.library.contest.view.n>> dVar) {
        g gVar;
        boolean z12;
        Contest contest;
        List listListOf;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f153981f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f153981f = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objW0 = gVar.f153979d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f153981f;
        int i12 = 7 << 1;
        if (i11 == 0) {
            ResultKt.m(objW0);
            gVar.f153976a = this;
            gVar.f153977b = z10;
            gVar.f153978c = z11;
            gVar.f153981f = 1;
            objW0 = w0(gVar);
            if (objW0 != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            z11 = gVar.f153978c;
            z10 = gVar.f153977b;
            this = (z) gVar.f153976a;
            ResultKt.m(objW0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = gVar.f153978c;
            z10 = gVar.f153977b;
            Contest contest2 = (Contest) gVar.f153976a;
            ResultKt.m(objW0);
            z12 = z13;
            contest = contest2;
        }
        boolean z14 = z10;
        listListOf = CollectionsKt.listOf(new com.planner5d.library.contest.view.n(com.planner5d.library.contest.view.n.a.ActiveContest, contest, (Date) objW0, z14, z12));
        if (listListOf != null) {
            return CollectionsKt.emptyList();
        }
        return listListOf;
        Contest contest3 = (Contest) objW0;
        if (contest3 != null) {
            n0 n0VarH = this.f153942m.h();
            h hVar = this.new h(null);
            gVar.f153976a = contest3;
            gVar.f153977b = z10;
            gVar.f153978c = z11;
            gVar.f153981f = 2;
            Object objH = kotlinx.coroutines.i.h(n0VarH, hVar, gVar);
            if (objH != objL) {
                z12 = z11;
                contest = contest3;
                objW0 = objH;
                boolean z15 = z10;
                listListOf = CollectionsKt.listOf(new com.planner5d.library.contest.view.n(com.planner5d.library.contest.view.n.a.ActiveContest, contest, (Date) objW0, z15, z12));
                if (listListOf != null) {
                    return listListOf;
                }
            }
            return objL;
        }
        return CollectionsKt.emptyList();
    }

    private final void C0(Function0<Unit> function0) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new i(function0, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void D0(z zVar, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        zVar.C0(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.d
    public final void E0(Contest contest) {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new j(contest, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object J0(kotlin.coroutines.d<? super Unit> dVar) {
        m mVar;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i10 = mVar.f154007d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f154007d = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object objH = mVar.f154005b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = mVar.f154007d;
        if (i11 == 0) {
            ResultKt.m(objH);
            n0 n0VarH = this.f153942m.h();
            n nVar = new n(null);
            mVar.f154004a = this;
            mVar.f154007d = 1;
            objH = kotlinx.coroutines.i.h(n0VarH, nVar, mVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (z) mVar.f154004a;
            ResultKt.m(objH);
        }
        com.planner5d.library.model.manager.synchronization.m mVar2 = (com.planner5d.library.model.manager.synchronization.m) objH;
        if (mVar2 == com.planner5d.library.model.manager.synchronization.m.SYNCHRONIZING || mVar2 == com.planner5d.library.model.manager.synchronization.m.NEEDS_SYNCHRONIZATION) {
            this.t0().d(com.planner5d.library.activity.fragment.list.b0.a.Synchronizing, this.new o(null));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(androidx.navigation.w0 runIfDirectionsAvailable, androidx.navigation.c2 it) {
        Intrinsics.checkNotNullParameter(runIfDirectionsAvailable, "$this$runIfDirectionsAvailable");
        Intrinsics.checkNotNullParameter(it, "it");
        runIfDirectionsAvailable.m0(it);
        return Unit.f312394a;
    }

    public static /* synthetic */ void N0(z zVar, Contest contest, com.planner5d.library.services.r rVar, u2 u2Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            u2Var = null;
        }
        zVar.M0(contest, rVar, u2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(z zVar) {
        c cVarE;
        c1<c> c1Var = zVar.f153944o;
        c cVarF = c1Var.f();
        if (cVarF != null) {
            int i10 = 0 >> 0;
            cVarE = c.e(cVarF, d.IDLE, null, null, 6, null);
        } else {
            cVarE = null;
        }
        c1Var.r(cVarE);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.activity.fragment.list.b0 o0(final z zVar) {
        return new com.planner5d.library.activity.fragment.list.b0(g2.a(zVar), new Function1() { // from class: com.planner5d.library.contest.view.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.p0(this.f153928a, (com.planner5d.library.activity.fragment.list.b0.a[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(z zVar, com.planner5d.library.activity.fragment.list.b0.a[] it) {
        d dVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (ArraysKt.contains(it, com.planner5d.library.activity.fragment.list.b0.a.JoiningContest)) {
            dVar = d.JOINING;
        } else {
            dVar = !(it.length == 0) ? d.SYNCING : d.IDLE;
        }
        d dVar2 = dVar;
        c1<c> c1Var = zVar.f153944o;
        c cVarF = c1Var.f();
        c1Var.r(cVarF != null ? c.e(cVarF, dVar2, null, null, 6, null) : null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.activity.helper.event.content.c q0(com.planner5d.library.services.r rVar, u2 u2Var) {
        if (rVar != null) {
            return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestNavigationFragment.class, new com.planner5d.library.services.utility.i().t(com.planner5d.library.services.r.tab, rVar).h(rVar, new com.planner5d.library.services.utility.i().h(com.planner5d.library.services.r.scrollPosition, u2Var != null ? u2Var.d() : null).a()).a());
        }
        return new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestDetailFragment.class, (Bundle) null).j(this.f153932c.f());
    }

    public static /* synthetic */ void s0(z zVar, Contest contest, com.planner5d.library.services.r rVar, u2 u2Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            u2Var = null;
        }
        zVar.r0(contest, rVar, u2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w0(kotlin.coroutines.d<? super Contest> dVar) {
        return this.f153930a.r(dVar);
    }

    public static /* synthetic */ Object z0(z zVar, Contest contest, com.planner5d.library.services.r rVar, u2 u2Var, kotlin.coroutines.d dVar, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            u2Var = null;
        }
        return zVar.y0(contest, rVar, u2Var, dVar);
    }

    public final void A0() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new f(null), 3, null);
    }

    public final void G0(@NotNull Activity activity, @NotNull Contest contest) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(contest, "contest");
        kotlinx.coroutines.k.f(g2.a(this), com.planner5d.library.services.utility.s.f229729a.h(), null, new k(contest, activity, null), 2, null);
    }

    @Nullable
    public final Object H0(@NotNull Context context, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.f153937h.d(context)) {
            Object objJ0 = J0(dVar);
            return objJ0 == kotlin.coroutines.intrinsics.b.l() ? objJ0 : Unit.f312394a;
        }
        this.f153933d.h();
        return Unit.f312394a;
    }

    public final void I0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f153938i.b()) {
            if (this.f153937h.d(context)) {
                t0().d(com.planner5d.library.activity.fragment.list.b0.a.Synchronizing, new l(null));
                return;
            } else {
                this.f153933d.h();
                return;
            }
        }
        c2 c2Var = this.f153933d;
        ErrorMessageException errorMessageExceptionCreateUserMissingException = ErrorMessageException.createUserMissingException();
        Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateUserMissingException, "createUserMissingException(...)");
        c2Var.i(errorMessageExceptionCreateUserMissingException);
    }

    public final void K0(@NotNull Contest contest, @NotNull androidx.navigation.w0 navController) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        Intrinsics.checkNotNullParameter(navController, "navController");
        String str = contest.uid;
        long j10 = str != null ? Long.parseLong(str) : -1L;
        this.f153941l.x0(Long.valueOf(j10));
        com.planner5d.library.util.navigation.k kVar = com.planner5d.library.util.navigation.k.f240224a;
        g0.a aVarA = g0.a(j10);
        Intrinsics.checkNotNullExpressionValue(aVarA, "toSingleContestArchiveFragment(...)");
        kVar.d(navController, aVarA, new Function2() { // from class: com.planner5d.library.contest.view.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return z.L0((androidx.navigation.w0) obj, (androidx.navigation.c2) obj2);
            }
        });
    }

    public final void M0(@NotNull Contest contest, @Nullable com.planner5d.library.services.r rVar, @Nullable u2 u2Var) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        int i10 = 2 | 0;
        com.planner5d.library.contest.data.f.x(this.f153935f, contest, q0(rVar, u2Var), null, 4, null);
    }

    public final void r0(@NotNull Contest contest, @Nullable com.planner5d.library.services.r rVar, @Nullable u2 u2Var) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(contest, rVar, u2Var, null), 3, null);
    }

    @NotNull
    public final com.planner5d.library.activity.fragment.list.b0 t0() {
        return (com.planner5d.library.activity.fragment.list.b0) this.f153947v.getValue();
    }

    @NotNull
    public final c1<c> u0() {
        return this.f153944o;
    }

    @NotNull
    public final c1<Boolean> v0() {
        return this.f153945s;
    }

    @NotNull
    public final c1<List<ContestPrize>> x0() {
        return this.f153946t;
    }

    @Nullable
    public final Object y0(@NotNull Contest contest, @Nullable com.planner5d.library.services.r rVar, @Nullable u2 u2Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        Object objP = this.f153935f.p(contest, t0(), q0(rVar, u2Var), dVar);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }
}
