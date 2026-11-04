package com.planner5d.library.contest.data;

import android.os.Bundle;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.FragmentController;
import com.planner5d.library.activity.fragment.list.b0;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.contest.view.ContestDetailFragment;
import com.planner5d.library.contest.view.voting.ContestVotingFragment;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.s;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f148502h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f148503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f148504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l3 f148505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f148506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f148507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f148508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f148509g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.data.ContestActionsHelper", f = "ContestActionsHelper.kt", i = {0, 0}, l = {75}, m = "edit", n = {"this", "previousDestination"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f148510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f148511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f148512c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f148514e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f148512c = obj;
            this.f148514e |= Integer.MIN_VALUE;
            return f.this.k(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.data.ContestActionsHelper$edit$2", f = "ContestActionsHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f148515a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f148517c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Contest contest, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f148517c = contest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(this.f148517c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f148515a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return f.this.l().u(this.f148517c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.data.ContestActionsHelper$join$2", f = "ContestActionsHelper.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f148518a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Contest f148520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.activity.helper.event.content.c f148521d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Contest contest, com.planner5d.library.activity.helper.event.content.c cVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f148520c = contest;
            this.f148521d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new c(this.f148520c, this.f148521d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f148518a;
            if (i10 == 0) {
                ResultKt.m(obj);
                f fVar = f.this;
                Contest contest = this.f148520c;
                com.planner5d.library.activity.helper.event.content.c cVar = this.f148521d;
                this.f148518a = 1;
                if (fVar.q(contest, cVar, this) == objL) {
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
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.data.ContestActionsHelper", f = "ContestActionsHelper.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {43, 46}, m = "joinBlocking", n = {"this", "previousDestination", "id", "this", "previousDestination", "hash", "userId"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "J$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f148522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f148523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f148524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f148525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f148526e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f148528g;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f148526e = obj;
            this.f148528g |= Integer.MIN_VALUE;
            return f.this.q(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.data.ContestActionsHelper$joinBlocking$2$project$1", f = "ContestActionsHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Project>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f148529a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f148531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f148532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, String str, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f148531c = j10;
            this.f148532d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new e(this.f148531c, this.f148532d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f148529a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            f.this.o().e();
            return f.this.n().f(this.f148531c, this.f148532d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Project> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public f(@NotNull w userAuthorization, @NotNull x navigator, @NotNull l3 statisticsEventContests) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        this.f148503a = userAuthorization;
        this.f148504b = navigator;
        this.f148505c = statisticsEventContests;
        this.f148506d = g0.c(new Function0() { // from class: com.planner5d.library.contest.data.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.i();
            }
        });
        this.f148507e = g0.c(new Function0() { // from class: com.planner5d.library.contest.data.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.v();
            }
        });
        this.f148508f = g0.c(new Function0() { // from class: com.planner5d.library.contest.data.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.u();
            }
        });
        this.f148509g = g0.c(new Function0() { // from class: com.planner5d.library.contest.data.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i i() {
        return com.planner5d.library.contest.application.a.f148393b.a().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i l() {
        return (i) this.f148506d.getValue();
    }

    private final com.planner5d.library.contest.helper.g m() {
        return (com.planner5d.library.contest.helper.g) this.f148509g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k n() {
        return (k) this.f148508f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.planner5d.library.model.manager.synchronization.k o() {
        return (com.planner5d.library.model.manager.synchronization.k) this.f148507e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, long j10) {
        timber.log.b.f381052a.d("Unable to open project. Project with hash " + str + " for user " + j10 + " not found", new Object[0]);
        return Unit.f312394a;
    }

    private final void s(Project project, com.planner5d.library.activity.helper.event.content.c cVar) {
        x.g(this.f148504b, m().a(project, false, null, true, cVar.b()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.contest.helper.g t() {
        return com.planner5d.library.contest.application.a.f148393b.a().h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k u() {
        return com.planner5d.library.contest.application.a.f148393b.a().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.model.manager.synchronization.k v() {
        return com.planner5d.library.contest.application.a.f148393b.a().g();
    }

    public static /* synthetic */ void x(f fVar, Contest contest, com.planner5d.library.activity.helper.event.content.c cVar, l3.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bVar = l3.b.voting;
        }
        fVar.w(contest, cVar, bVar);
    }

    public final void j(@NotNull com.planner5d.library.activity.helper.event.content.c previousDestination) {
        Intrinsics.checkNotNullParameter(previousDestination, "previousDestination");
        int i10 = 4 ^ 0;
        x.g(this.f148504b, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestDetailFragment.class, (Bundle) null).k(previousDestination), false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object k(@NotNull Contest contest, @NotNull com.planner5d.library.activity.helper.event.content.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f148514e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f148514e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objH = aVar.f148512c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f148514e;
        if (i11 == 0) {
            ResultKt.m(objH);
            z1 z1VarH = s.f229729a.h();
            b bVar = new b(contest, null);
            aVar.f148510a = this;
            aVar.f148511b = cVar;
            aVar.f148514e = 1;
            objH = kotlinx.coroutines.i.h(z1VarH, bVar, aVar);
            if (objH == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (com.planner5d.library.activity.helper.event.content.c) aVar.f148511b;
            this = (f) aVar.f148510a;
            ResultKt.m(objH);
        }
        Project project = (Project) objH;
        if (project != null) {
            this.s(project, cVar);
        }
        return Unit.f312394a;
    }

    @Nullable
    public final Object p(@NotNull Contest contest, @NotNull b0 b0Var, @NotNull com.planner5d.library.activity.helper.event.content.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        boolean z10 = true & false;
        Object objC = b0Var.c(b0.a.JoiningContest, new c(contest, cVar, null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @l1
    @Nullable
    public final Object q(@NotNull Contest contest, @NotNull com.planner5d.library.activity.helper.event.content.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Exception {
        d dVar2;
        f fVar;
        com.planner5d.library.activity.helper.event.content.c cVar2;
        long j10;
        com.planner5d.library.activity.helper.event.content.c cVar3;
        f fVar2;
        final long j11;
        final String str;
        Project project;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f148528g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f148528g = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objM = dVar2.f148526e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f148528g;
        if (i11 == 0) {
            ResultKt.m(objM);
            String strB = contest.B();
            if (strB != null) {
                long j12 = Long.parseLong(strB);
                i iVarL = l();
                dVar2.f148522a = this;
                dVar2.f148523b = cVar;
                dVar2.f148525d = j12;
                dVar2.f148528g = 1;
                objM = iVarL.m(j12, dVar2);
                if (objM != objL) {
                    fVar = this;
                    cVar2 = cVar;
                    j10 = j12;
                }
                return objL;
            }
            return Unit.f312394a;
        }
        if (i11 == 1) {
            j10 = dVar2.f148525d;
            cVar2 = (com.planner5d.library.activity.helper.event.content.c) dVar2.f148523b;
            f fVar3 = (f) dVar2.f148522a;
            ResultKt.m(objM);
            fVar = fVar3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = dVar2.f148525d;
            str = (String) dVar2.f148524c;
            cVar3 = (com.planner5d.library.activity.helper.event.content.c) dVar2.f148523b;
            fVar2 = (f) dVar2.f148522a;
            ResultKt.m(objM);
        }
        project = (Project) objM;
        if (project != null) {
            fVar2.s(project, cVar3);
        } else {
            new Function0() { // from class: com.planner5d.library.contest.data.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.r(str, j11);
                }
            };
        }
        return Unit.f312394a;
        String str2 = (String) objM;
        fVar.f148505c.r(j10);
        long jE = fVar.f148503a.e();
        z1 z1VarH = s.f229729a.h();
        e eVar = fVar.new e(jE, str2, null);
        dVar2.f148522a = fVar;
        dVar2.f148523b = cVar2;
        dVar2.f148524c = str2;
        dVar2.f148525d = jE;
        dVar2.f148528g = 2;
        objM = kotlinx.coroutines.i.h(z1VarH, eVar, dVar2);
        if (objM != objL) {
            cVar3 = cVar2;
            fVar2 = fVar;
            j11 = jE;
            str = str2;
            project = (Project) objM;
            if (project != null) {
                fVar2.s(project, cVar3);
            } else {
                new Function0() { // from class: com.planner5d.library.contest.data.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.r(str, j11);
                    }
                };
            }
            return Unit.f312394a;
        }
        return objL;
    }

    public final void w(@NotNull Contest contest, @NotNull com.planner5d.library.activity.helper.event.content.c previousDestination, @NotNull l3.b source) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        Intrinsics.checkNotNullParameter(previousDestination, "previousDestination");
        Intrinsics.checkNotNullParameter(source, "source");
        l3 l3Var = this.f148505c;
        String strB = contest.B();
        l3Var.L0(strB != null ? Long.valueOf(Long.parseLong(strB)) : null, l3.a.contests_voting_opened, source);
        x xVar = this.f148504b;
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        r rVar = r.contestUid;
        String str = contest.uid;
        x.g(xVar, new com.planner5d.library.activity.helper.event.content.c((Class<? extends FragmentController>) ContestVotingFragment.class, iVar.g(rVar, str != null ? Long.parseLong(str) : -1L).a()).k(previousDestination), false, 2, null);
    }
}
