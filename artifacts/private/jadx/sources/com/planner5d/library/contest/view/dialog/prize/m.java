package com.planner5d.library.contest.view.dialog.prize;

import android.app.Activity;
import android.app.Application;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.activity.fragment.list.b0;
import com.planner5d.library.database.model.contest.ContestPrize;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.p0;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class m extends f2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f153609w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f153610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.synchronization.k f153612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p0 f153613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c2 f153614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w f153615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.k f153616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.w f153617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.c2 f153618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.helper.b f153619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f153620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f0 f153621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final c1<Integer> f153622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<String> f153623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final c1<List<ContestPrize>> f153624o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final c1<a> f153625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final c1<Object> f153626t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f153627v;

    public enum a {
        NO_NETWORK,
        NO_MATCHING_CONTEST,
        SYNCHRONIZATION_FAILED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f153632e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f153632e;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.prize.ContestPrizeViewModel", f = "ContestPrizeViewModel.kt", i = {0}, l = {78}, m = "processLocalContest", n = {"this"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f153634b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f153636d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f153634b = obj;
            this.f153636d |= Integer.MIN_VALUE;
            return m.this.r0(false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.prize.ContestPrizeViewModel$refreshContests$1", f = "ContestPrizeViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1, com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends o implements Function2<b0.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153637a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f153639c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.prize.ContestPrizeViewModel$refreshContests$1$1", f = "ContestPrizeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Subscription>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f153641b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f153641b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f153641b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f153640a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f153641b.f153612c.c(true).subscribe((Subscriber<? super Void>) new com.planner5d.library.services.rx.e());
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Subscription> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f153639c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new c(this.f153639c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f153637a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r8)
                goto L4f
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 3
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                r6 = 5
                kotlin.ResultKt.m(r8)
                goto L3f
            L21:
                kotlin.ResultKt.m(r8)
                com.planner5d.library.services.utility.s r8 = com.planner5d.library.services.utility.s.f229729a
                kotlinx.coroutines.z1 r8 = r8.h()
                r6 = 5
                com.planner5d.library.contest.view.dialog.prize.m$c$a r1 = new com.planner5d.library.contest.view.dialog.prize.m$c$a
                com.planner5d.library.contest.view.dialog.prize.m r4 = com.planner5d.library.contest.view.dialog.prize.m.this
                r5 = 0
                r6 = 6
                r1.<init>(r4, r5)
                r7.f153637a = r3
                r6 = 4
                java.lang.Object r8 = kotlinx.coroutines.i.h(r8, r1, r7)
                r6 = 5
                if (r8 != r0) goto L3f
                goto L4d
            L3f:
                com.planner5d.library.contest.view.dialog.prize.m r8 = com.planner5d.library.contest.view.dialog.prize.m.this
                r6 = 4
                boolean r1 = r7.f153639c
                r7.f153637a = r2
                java.lang.Object r8 = com.planner5d.library.contest.view.dialog.prize.m.d0(r8, r1, r7)
                r6 = 4
                if (r8 != r0) goto L4f
            L4d:
                r6 = 1
                return r0
            L4f:
                r6 = 4
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L64
                com.planner5d.library.contest.view.dialog.prize.m r7 = com.planner5d.library.contest.view.dialog.prize.m.this
                androidx.lifecycle.c1 r7 = r7.l0()
                r6 = 2
                com.planner5d.library.contest.view.dialog.prize.m$a r8 = com.planner5d.library.contest.view.dialog.prize.m.a.NO_MATCHING_CONTEST
                r7.r(r8)
            L64:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.contest.view.dialog.prize.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b0.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.prize.ContestPrizeViewModel$setWinnerContestUid$1", f = "ContestPrizeViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153642a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f153644c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f153644c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new d(this.f153644c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153642a;
            if (i10 == 0) {
                ResultKt.m(obj);
                m mVar = m.this;
                boolean z10 = this.f153644c;
                this.f153642a = 1;
                obj = mVar.r0(z10, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                m.this.s0(this.f153644c);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.prize.ContestPrizeViewModel$share$1", f = "ContestPrizeViewModel.kt", i = {0, 1}, l = {109, com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class e extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f153645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f153646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f153647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f153648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f153649e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, m mVar, Activity activity, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f153647c = z10;
            this.f153648d = mVar;
            this.f153649e = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f153647c, this.f153648d, this.f153649e, dVar);
            eVar.f153646b = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            if (r9 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r7 = 4
                int r1 = r8.f153645a
                r2 = 2
                r7 = r2
                r3 = 1
                r7 = r3
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r8.f153646b
                kotlinx.coroutines.s0 r0 = (kotlinx.coroutines.s0) r0
                kotlin.ResultKt.m(r9)
                goto L6d
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L21:
                r7 = 4
                java.lang.Object r0 = r8.f153646b
                r7 = 4
                kotlinx.coroutines.s0 r0 = (kotlinx.coroutines.s0) r0
                kotlin.ResultKt.m(r9)
                goto L4b
            L2b:
                r7 = 3
                kotlin.ResultKt.m(r9)
                r7 = 4
                java.lang.Object r9 = r8.f153646b
                kotlinx.coroutines.s0 r9 = (kotlinx.coroutines.s0) r9
                boolean r1 = r8.f153647c
                if (r1 == 0) goto L4f
                r7 = 6
                com.planner5d.library.contest.view.dialog.prize.m r1 = r8.f153648d
                com.planner5d.library.contest.data.i r1 = com.planner5d.library.contest.view.dialog.prize.m.X(r1)
                r8.f153646b = r9
                r8.f153645a = r3
                java.lang.Object r9 = r1.r(r8)
                if (r9 != r0) goto L4b
                r7 = 4
                goto L6c
            L4b:
                com.planner5d.library.database.model.contest.Contest r9 = (com.planner5d.library.database.model.contest.Contest) r9
            L4d:
                r3 = r9
                goto L70
            L4f:
                r7 = 1
                com.planner5d.library.contest.view.dialog.prize.m r1 = r8.f153648d
                com.planner5d.library.contest.data.i r1 = com.planner5d.library.contest.view.dialog.prize.m.X(r1)
                com.planner5d.library.contest.view.dialog.prize.m r3 = r8.f153648d
                long r3 = r3.o0()
                java.lang.Long r3 = kotlin.coroutines.jvm.internal.b.g(r3)
                r7 = 3
                r8.f153646b = r9
                r8.f153645a = r2
                r7 = 7
                java.lang.Object r9 = r1.j(r3, r8)
                if (r9 != r0) goto L6d
            L6c:
                return r0
            L6d:
                com.planner5d.library.database.model.contest.Contest r9 = (com.planner5d.library.database.model.contest.Contest) r9
                goto L4d
            L70:
                r7 = 4
                if (r3 == 0) goto Lc4
                com.planner5d.library.contest.view.dialog.prize.m r9 = r8.f153648d
                android.app.Activity r1 = r8.f153649e
                r7 = 1
                com.planner5d.library.contest.data.k r8 = com.planner5d.library.contest.view.dialog.prize.m.a0(r9)
                com.planner5d.library.modules.user.user.w r0 = com.planner5d.library.contest.view.dialog.prize.m.c0(r9)
                id.a r0 = r0.a()
                r7 = 6
                com.planner5d.library.database.model.project.Project r2 = r8.b(r0, r3)
                r7 = 2
                if (r2 == 0) goto L9a
                r7 = 5
                com.planner5d.library.contest.helper.b r0 = com.planner5d.library.contest.view.dialog.prize.m.Y(r9)
                int r4 = com.planner5d.library.contest.e.r.f151488e5
                com.planner5d.library.model.manager.statistics.events.l3$b r5 = com.planner5d.library.model.manager.statistics.events.l3.b.claim_prize_card_popup
                r0.a(r1, r2, r3, r4, r5)
                r7 = 4
                goto Lc4
            L9a:
                com.planner5d.library.model.manager.c2 r8 = com.planner5d.library.contest.view.dialog.prize.m.Z(r9)
                com.planner5d.library.model.u r9 = new com.planner5d.library.model.u
                com.planner5d.library.model.u$c r0 = com.planner5d.library.model.u.c.Error
                com.planner5d.library.services.utility.k3 r1 = new com.planner5d.library.services.utility.k3
                int r2 = com.planner5d.library.contest.e.r.R8
                com.planner5d.library.services.utility.k3 r3 = new com.planner5d.library.services.utility.k3
                int r4 = com.planner5d.library.contest.e.r.f151829s9
                r7 = 6
                r5 = 0
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r7 = 0
                r3.<init>(r4, r6)
                r7 = 3
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                r7 = 4
                r1.<init>(r2, r3)
                com.planner5d.library.model.u$a[] r2 = new com.planner5d.library.model.u.a[r5]
                r7 = 0
                r9.<init>(r0, r1, r2)
                r8.e(r9)
            Lc4:
                r7 = 7
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.contest.view.dialog.prize.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull Application application, @NotNull com.planner5d.library.contest.data.i contestManager, @NotNull com.planner5d.library.model.manager.synchronization.k synchronizationManager, @NotNull p0 formatter, @NotNull c2 networkStateUtility, @NotNull w featureConfigManager, @NotNull com.planner5d.library.contest.data.k projectManager, @NotNull com.planner5d.library.modules.user.user.w userAuthorization, @NotNull com.planner5d.library.model.manager.c2 messageManager, @NotNull com.planner5d.library.contest.helper.b contestProjectSharer) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(synchronizationManager, "synchronizationManager");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(projectManager, "projectManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(contestProjectSharer, "contestProjectSharer");
        this.f153610a = application;
        this.f153611b = contestManager;
        this.f153612c = synchronizationManager;
        this.f153613d = formatter;
        this.f153614e = networkStateUtility;
        this.f153615f = featureConfigManager;
        this.f153616g = projectManager;
        this.f153617h = userAuthorization;
        this.f153618i = messageManager;
        this.f153619j = contestProjectSharer;
        this.f153620k = new c1<>(Boolean.FALSE);
        this.f153621l = g0.c(new Function0() { // from class: com.planner5d.library.contest.view.dialog.prize.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.g0(this.f153606a);
            }
        });
        c1<Integer> c1Var = new c1<>();
        this.f153622m = c1Var;
        this.f153623n = androidx.lifecycle.c2.h(c1Var, new Function1() { // from class: com.planner5d.library.contest.view.dialog.prize.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.v0(this.f153607a, (Integer) obj);
            }
        });
        this.f153624o = new c1<>();
        this.f153625s = new c1<>();
        this.f153626t = new c1<>();
        this.f153627v = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 g0(final m mVar) {
        return new b0(g2.a(mVar), new Function1() { // from class: com.planner5d.library.contest.view.dialog.prize.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.h0(this.f153608a, (b0.a[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(m mVar, b0.a[] it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mVar.f153620k.r(Boolean.valueOf(!(it.length == 0)));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object r0(boolean z10, kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f153636d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f153636d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object objO = bVar2.f153634b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f153636d;
        if (i11 == 0) {
            ResultKt.m(objO);
            com.planner5d.library.contest.data.i iVar = this.f153611b;
            long j10 = this.f153627v;
            String[] strArr = {fd.k.RENDERS.q(), fd.k.TEXTURES.q()};
            bVar2.f153633a = this;
            bVar2.f153636d = 1;
            objO = iVar.o(j10, z10, strArr, bVar2);
            if (objO == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (m) bVar2.f153633a;
            ResultKt.m(objO);
        }
        Pair pair = (Pair) objO;
        if (pair == null) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        List<ContestPrize> list = (List) pair.component2();
        if (list.isEmpty()) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        this.f153622m.r(kotlin.coroutines.jvm.internal.b.f(iIntValue));
        this.f153624o.r(list);
        return kotlin.coroutines.jvm.internal.b.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(boolean z10) {
        if (this.f153614e.d(this.f153610a)) {
            j0().d(b0.a.Synchronizing, new c(z10, null));
        } else {
            this.f153625s.r(a.NO_NETWORK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v0(m mVar, Integer num) {
        p0 p0Var = mVar.f153613d;
        Intrinsics.checkNotNull(num);
        return p0Var.u(num.intValue());
    }

    public final void i0() {
        this.f153626t.r(new Object());
    }

    @NotNull
    public final b0 j0() {
        return (b0) this.f153621l.getValue();
    }

    @NotNull
    public final c1<Object> k0() {
        return this.f153626t;
    }

    @NotNull
    public final c1<a> l0() {
        return this.f153625s;
    }

    @NotNull
    public final c1<Boolean> m0() {
        return this.f153620k;
    }

    @NotNull
    public final c1<List<ContestPrize>> n0() {
        return this.f153624o;
    }

    public final long o0() {
        return this.f153627v;
    }

    @NotNull
    public final androidx.lifecycle.w0<String> p0() {
        return this.f153623n;
    }

    public final boolean q0() {
        return this.f153615f.a(com.planner5d.library.model.manager.config.f.ContestsSharing);
    }

    public final void t0(long j10, boolean z10) {
        if (this.f153627v == j10) {
            return;
        }
        this.f153627v = j10;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new d(z10, null), 3, null);
    }

    public final void u0(@NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = 2 & 3;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new e(z10, this, activity, null), 3, null);
    }
}
