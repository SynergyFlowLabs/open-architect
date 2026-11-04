package com.planner5d.library.contest.view.voting;

import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.a0;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.q;
import com.planner5d.library.services.utility.s;
import java.net.URI;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestVotingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestVotingViewModel.kt\ncom/planner5d/library/contest/view/voting/ContestVotingViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n13409#2:184\n13410#2:187\n1863#3,2:185\n*S KotlinDebug\n*F\n+ 1 ContestVotingViewModel.kt\ncom/planner5d/library/contest/view/voting/ContestVotingViewModel\n*L\n156#1:184\n156#1:187\n157#1:185,2\n*E\n"})
public final class m extends f2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f153878o = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f153879s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f153880t = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y1 f153882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f153883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f153884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l3 f153885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q f153886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Contest f153887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f153888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c1<eb.d> f153889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.contest.c> f153890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final c1<Pair<Integer, Integer>> f153891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private eb.d[] f153892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f153893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final c1<a0> f153894n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.voting.ContestVotingViewModel", f = "ContestVotingViewModel.kt", i = {0, 0, 0}, l = {161}, m = "preloadImages", n = {"this", "$this$forEach$iv", v.a.M}, s = {"L$0", "L$1", "L$3"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f153896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f153897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f153898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153899e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f153900f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f153901g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f153903i;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f153901g = obj;
            this.f153903i |= Integer.MIN_VALUE;
            return m.this.o0(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.voting.ContestVotingViewModel$start$1", f = "ContestVotingViewModel.kt", i = {0, 1, 2, 2}, l = {com.planner5d.library.engine.input.f.b.I0, 66, 67}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", MetricConsts.Install}, s = {"L$0", "L$0", "L$0", "L$3"})
    @SourceDebugExtension({"SMAP\nContestVotingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestVotingViewModel.kt\ncom/planner5d/library/contest/view/voting/ContestVotingViewModel$start$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,183:1\n37#2,2:184\n*S KotlinDebug\n*F\n+ 1 ContestVotingViewModel.kt\ncom/planner5d/library/contest/view/voting/ContestVotingViewModel$start$1\n*L\n67#1:184,2\n*E\n"})
    static final class c extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f153905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f153906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f153907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f153909f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Long f153911h;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.voting.ContestVotingViewModel$start$1$1$1", f = "ContestVotingViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f153912a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f153913b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ eb.d[] f153914c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, eb.d[] dVarArr, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f153913b = mVar;
                this.f153914c = dVarArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f153913b, this.f153914c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f153912a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    m mVar = this.f153913b;
                    eb.d[] dVarArr = this.f153914c;
                    this.f153912a = 1;
                    if (mVar.o0(dVarArr, this) == objL) {
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
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l10, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f153911h = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = m.this.new c(this.f153911h, dVar);
            cVar.f153909f = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            s0 s0Var;
            m mVar;
            m mVar2;
            s0 s0Var2;
            m mVar3;
            eb.d[] dVarArr;
            eb.d[] dVarArr2;
            Object obj2;
            m mVar4;
            m mVar5;
            eb.d[] dVarArr3;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153908e;
            int i11 = 7 << 3;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0Var = (s0) this.f153909f;
                    mVar = m.this;
                    com.planner5d.library.contest.data.i iVar = mVar.f153881a;
                    Long l10 = this.f153911h;
                    this.f153909f = s0Var;
                    this.f153904a = mVar;
                    this.f153908e = 1;
                    obj = iVar.j(l10, this);
                    if (obj == objL) {
                    }
                    return objL;
                }
                if (i10 == 1) {
                    mVar = (m) this.f153904a;
                    s0Var = (s0) this.f153909f;
                    ResultKt.m(obj);
                } else {
                    if (i10 == 2) {
                        mVar2 = (m) this.f153904a;
                        s0Var2 = (s0) this.f153909f;
                        ResultKt.m(obj);
                        mVar3 = m.this;
                        dVarArr = (eb.d[]) obj;
                        dVarArr2 = (eb.d[]) ArraysKt.take(dVarArr, 1).toArray(new eb.d[0]);
                        this.f153909f = s0Var2;
                        this.f153904a = obj;
                        this.f153905b = mVar3;
                        this.f153906c = dVarArr;
                        this.f153907d = mVar2;
                        this.f153908e = 3;
                        if (mVar3.o0(dVarArr2, this) != objL) {
                            obj2 = obj;
                            mVar4 = mVar2;
                            mVar5 = mVar3;
                            dVarArr3 = dVarArr;
                        }
                        return objL;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar4 = (m) this.f153907d;
                    dVarArr3 = (eb.d[]) this.f153906c;
                    mVar5 = (m) this.f153905b;
                    obj2 = this.f153904a;
                    s0Var2 = (s0) this.f153909f;
                    ResultKt.m(obj);
                }
                kotlinx.coroutines.k.f(s0Var2, null, null, new a(mVar5, dVarArr3, null), 3, null);
                mVar4.f153892l = (eb.d[]) obj2;
                m.this.g0();
                return Unit.f312394a;
                Contest contest = (Contest) obj;
                if (contest == null) {
                    throw new ErrorMessageException(com.planner5d.library.contest.e.r.f151491e8, new String[0]);
                }
                mVar.q0(contest);
                m.this.c0().r(m.this.b0().G());
                m mVar6 = m.this;
                com.planner5d.library.contest.data.i iVar2 = mVar6.f153881a;
                Contest contestB0 = m.this.b0();
                this.f153909f = s0Var;
                this.f153904a = mVar6;
                this.f153908e = 2;
                Object objF = iVar2.f(contestB0, this);
                if (objF != objL) {
                    mVar2 = mVar6;
                    obj = objF;
                    s0Var2 = s0Var;
                    mVar3 = m.this;
                    dVarArr = (eb.d[]) obj;
                    dVarArr2 = (eb.d[]) ArraysKt.take(dVarArr, 1).toArray(new eb.d[0]);
                    this.f153909f = s0Var2;
                    this.f153904a = obj;
                    this.f153905b = mVar3;
                    this.f153906c = dVarArr;
                    this.f153907d = mVar2;
                    this.f153908e = 3;
                    if (mVar3.o0(dVarArr2, this) != objL) {
                        obj2 = obj;
                        mVar4 = mVar2;
                        mVar5 = mVar3;
                        dVarArr3 = dVarArr;
                        kotlinx.coroutines.k.f(s0Var2, null, null, new a(mVar5, dVarArr3, null), 3, null);
                        mVar4.f153892l = (eb.d[]) obj2;
                        m.this.g0();
                        return Unit.f312394a;
                    }
                }
                return objL;
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                if (this.f153911h != null) {
                    m.this.m0();
                    return Unit.f312394a;
                }
                m.this.d0().r(new com.planner5d.library.contest.c.a(m.this.f153884d.parse(e10, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.contest.e.r.f151491e8))));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.voting.ContestVotingViewModel$vote$1", f = "ContestVotingViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160706l1}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f153916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f153917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f153918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f153919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Integer num, m mVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f153918d = num;
            this.f153919e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f153918d, this.f153919e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[Catch: Exception -> 0x001d, TRY_ENTER, TryCatch #1 {Exception -> 0x001d, blocks: (B:7:0x0018, B:35:0x00a9, B:36:0x00b8), top: B:45:0x0018 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #1 {Exception -> 0x001d, blocks: (B:7:0x0018, B:35:0x00a9, B:36:0x00b8), top: B:45:0x0018 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            Integer num;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153917c;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (this.f153918d != null) {
                    m mVar2 = this.f153919e;
                    l3 l3Var = mVar2.f153885e;
                    String str = mVar2.b0().uid;
                    l3Var.L0(str != null ? kotlin.coroutines.jvm.internal.b.g(Long.parseLong(str)) : null, l3.a.contests_vote_added, null);
                } else {
                    l3 l3Var2 = this.f153919e.f153885e;
                    String str2 = this.f153919e.b0().uid;
                    l3Var2.L0(str2 != null ? kotlin.coroutines.jvm.internal.b.g(Long.parseLong(str2)) : null, l3.a.contests_vote_skipped, null);
                }
                eb.d dVar = (eb.d) ArraysKt.getOrNull(this.f153919e.f153892l, this.f153919e.f153888h);
                if (dVar != null) {
                    m mVar3 = this.f153919e;
                    Integer num2 = this.f153918d;
                    try {
                        com.planner5d.library.contest.data.i iVar = mVar3.f153881a;
                        Contest contestB0 = mVar3.b0();
                        this.f153915a = mVar3;
                        this.f153916b = num2;
                        this.f153917c = 1;
                        if (iVar.b(contestB0, dVar, num2, this) == objL) {
                            return objL;
                        }
                        mVar = mVar3;
                        num = num2;
                        if (num != null) {
                            mVar.d0().r(new com.planner5d.library.contest.c.j(num));
                        } else {
                            mVar.t0();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        mVar = mVar3;
                        timber.log.b.f381052a.e(e);
                        mVar.d0().r(new com.planner5d.library.contest.c.a(mVar.f153884d.parse(e, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.contest.e.r.f151467d8))));
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) this.f153916b;
                mVar = (m) this.f153915a;
                try {
                    ResultKt.m(obj);
                    if (num != null) {
                        mVar.d0().r(new com.planner5d.library.contest.c.j(num));
                    } else {
                        mVar.t0();
                    }
                } catch (Exception e11) {
                    e = e11;
                    timber.log.b.f381052a.e(e);
                    mVar.d0().r(new com.planner5d.library.contest.c.a(mVar.f153884d.parse(e, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.contest.e.r.f151467d8))));
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull com.planner5d.library.contest.data.i contestManager, @NotNull y1 menuManager, @NotNull x navigator, @NotNull ErrorMessageParser errorMessageParser, @NotNull l3 statisticsEventContests, @NotNull q imageManagerService) {
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(menuManager, "menuManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(statisticsEventContests, "statisticsEventContests");
        Intrinsics.checkNotNullParameter(imageManagerService, "imageManagerService");
        this.f153881a = contestManager;
        this.f153882b = menuManager;
        this.f153883c = navigator;
        this.f153884d = errorMessageParser;
        this.f153885e = statisticsEventContests;
        this.f153886f = imageManagerService;
        this.f153888h = -1;
        this.f153889i = new c1<>(null);
        this.f153890j = new c1<>(com.planner5d.library.contest.c.b.f148479b);
        this.f153891k = new c1<>(TuplesKt.to(1, 0));
        this.f153892l = new eb.d[0];
        this.f153894n = new c1<>();
    }

    private final boolean h0() {
        return this.f153893m > 14;
    }

    private final boolean i0() {
        return this.f153888h >= this.f153892l.length - 1;
    }

    private final com.planner5d.library.services.bitmaploader.d.C1663d j0(URI uri, com.planner5d.library.services.bitmaploader.target.a aVar) {
        return this.f153886f.b(uri != null ? uri.toString() : null, 0, 0, aVar, -3L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0061 -> B:17:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0074 -> B:20:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o0(eb.d[] r11, kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.planner5d.library.contest.view.voting.m.b
            r9 = 6
            if (r0 == 0) goto L15
            r0 = r12
            com.planner5d.library.contest.view.voting.m$b r0 = (com.planner5d.library.contest.view.voting.m.b) r0
            int r1 = r0.f153903i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r9 = 3
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f153903i = r1
            goto L1b
        L15:
            r9 = 5
            com.planner5d.library.contest.view.voting.m$b r0 = new com.planner5d.library.contest.view.voting.m$b
            r0.<init>(r12)
        L1b:
            java.lang.Object r12 = r0.f153901g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r9 = 0
            int r2 = r0.f153903i
            r3 = 6
            r3 = 0
            r4 = 1
            r9 = r4
            if (r2 == 0) goto L58
            if (r2 != r4) goto L4f
            int r10 = r0.f153900f
            int r11 = r0.f153899e
            java.lang.Object r2 = r0.f153898d
            com.planner5d.library.services.bitmaploader.target.b r2 = (com.planner5d.library.services.bitmaploader.target.b) r2
            java.lang.Object r5 = r0.f153897c
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f153896b
            r9 = 3
            eb.d[] r6 = (eb.d[]) r6
            java.lang.Object r7 = r0.f153895a
            com.planner5d.library.contest.view.voting.m r7 = (com.planner5d.library.contest.view.voting.m) r7
            kotlin.ResultKt.m(r12)
            r12 = r5
            r12 = r5
            r9 = 6
            r5 = r11
            r5 = r11
            r11 = r6
            r6 = r12
            r9 = 7
            r12 = r10
            r10 = r7
            goto L86
        L4f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            r9 = 0
            throw r10
        L58:
            r9 = 3
            kotlin.ResultKt.m(r12)
            int r12 = r11.length
            r9 = 7
            r2 = r3
        L5f:
            if (r2 >= r12) goto Lb1
            r9 = 1
            r5 = r11[r2]
            java.util.List r5 = r5.g()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lae
            java.lang.Object r6 = r5.next()
            eb.b r6 = (eb.b) r6
            com.planner5d.library.services.bitmaploader.target.b r7 = new com.planner5d.library.services.bitmaploader.target.b
            r9 = 1
            r7.<init>(r3)
            r10.l0(r6, r7)
            r6 = r5
            r5 = r2
            r2 = r7
        L86:
            r9 = 5
            boolean r7 = r2.e()
            if (r7 != 0) goto La7
            r0.f153895a = r10
            r0.f153896b = r11
            r0.f153897c = r6
            r0.f153898d = r2
            r9 = 3
            r0.f153899e = r5
            r0.f153900f = r12
            r9 = 4
            r0.f153903i = r4
            r7 = 100
            java.lang.Object r7 = kotlinx.coroutines.d1.b(r7, r0)
            r9 = 0
            if (r7 != r1) goto L86
            return r1
        La7:
            r2.dispose()
            r2 = r5
            r5 = r6
            r5 = r6
            goto L6e
        Lae:
            int r2 = r2 + 1
            goto L5f
        Lb1:
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.contest.view.voting.m.o0(eb.d[], kotlin.coroutines.d):java.lang.Object");
    }

    private final void p0() {
        this.f153888h = -1;
        String str = b0().uid;
        s0(str != null ? Long.valueOf(Long.parseLong(str)) : null);
    }

    @NotNull
    public final Contest b0() {
        Contest contest = this.f153887g;
        if (contest != null) {
            return contest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contest");
        return null;
    }

    @NotNull
    public final c1<a0> c0() {
        return this.f153894n;
    }

    @NotNull
    public final c1<com.planner5d.library.contest.c> d0() {
        return this.f153890j;
    }

    @NotNull
    public final c1<eb.d> f0() {
        return this.f153889i;
    }

    public final void g0() {
        com.planner5d.library.contest.c cVar;
        c1<com.planner5d.library.contest.c> c1Var = this.f153890j;
        if (h0()) {
            this.f153893m = 0;
            l3 l3Var = this.f153885e;
            String str = b0().uid;
            l3Var.L0(str != null ? Long.valueOf(Long.parseLong(str)) : null, l3.a.contests_voting_opened, l3.b.new_voting);
            cVar = com.planner5d.library.contest.c.g.f148492b;
        } else if (i0()) {
            p0();
            cVar = com.planner5d.library.contest.c.b.f148479b;
        } else {
            c1<Pair<Integer, Integer>> c1Var2 = this.f153891k;
            int i10 = this.f153888h;
            this.f153888h = i10 + 1;
            c1Var2.r(TuplesKt.to(Integer.valueOf(i10 + 2), Integer.valueOf(this.f153892l.length)));
            this.f153889i.r(this.f153892l[this.f153888h]);
            cVar = com.planner5d.library.contest.c.f.f148490b;
        }
        c1Var.r(cVar);
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.d.C1663d k0(@Nullable eb.c cVar, @NotNull com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return j0(cVar != null ? cVar.b() : null, target);
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.d.C1663d l0(@Nullable eb.b bVar, @NotNull com.planner5d.library.services.bitmaploader.target.a target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return j0(bVar != null ? bVar.a() : null, target);
    }

    public final void m0() {
        x xVar = this.f153883c;
        com.planner5d.library.activity.helper.event.content.c cVarD = this.f153882b.d();
        Intrinsics.checkNotNullExpressionValue(cVarD, "getPreviousDestination(...)");
        x.g(xVar, cVarD, false, 2, null);
    }

    public final void n0() {
        g0();
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        if (this.f153887g != null) {
            l3 l3Var = this.f153885e;
            String str = b0().uid;
            l3Var.L0(str != null ? Long.valueOf(Long.parseLong(str)) : null, l3.a.contests_voting_closed, null);
        }
    }

    public final void q0(@NotNull Contest contest) {
        Intrinsics.checkNotNullParameter(contest, "<set-?>");
        this.f153887g = contest;
    }

    public final void r0() {
        this.f153890j.r(com.planner5d.library.contest.c.C1518c.f148481b);
    }

    public final void s0(@Nullable Long l10) {
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.a(), null, new c(l10, null), 2, null);
    }

    public final void t0() {
        this.f153890j.r(com.planner5d.library.contest.c.h.f148494b);
    }

    public final void u0(@Nullable Integer num) {
        this.f153893m++;
        this.f153890j.r(new com.planner5d.library.contest.c.i(num));
        int i10 = 2 ^ 0;
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.a(), null, new d(num, this, null), 2, null);
    }
}
