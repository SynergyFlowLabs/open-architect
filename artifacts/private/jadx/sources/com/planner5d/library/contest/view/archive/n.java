package com.planner5d.library.contest.view.archive;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class n extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f153467d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f153469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<com.planner5d.library.contest.c> f153470c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.archive.ContestArchiveViewModel$getContest$1", f = "ContestArchiveViewModel.kt", i = {}, l = {25, 27}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f153472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f153473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f153474d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f153476f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f153476f = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(this.f153476f, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006f A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #1 {Exception -> 0x003f, blocks: (B:14:0x003a, B:23:0x006b, B:25:0x006f, B:32:0x0093, B:33:0x009f), top: B:41:0x003a }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0087  */
        /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: Exception -> 0x003f, TRY_ENTER, TryCatch #1 {Exception -> 0x003f, blocks: (B:14:0x003a, B:23:0x006b, B:25:0x006f, B:32:0x0093, B:33:0x009f), top: B:41:0x003a }] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1<com.planner5d.library.contest.c> c1Var;
            Exception e10;
            c1<com.planner5d.library.contest.c> c1Var2;
            c1<com.planner5d.library.contest.c> c1Var3;
            Contest contest;
            Object objN;
            Contest contest2;
            com.planner5d.library.contest.c aVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153474d;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1<com.planner5d.library.contest.c> c1VarX = n.this.X();
                try {
                    com.planner5d.library.contest.data.i iVar = n.this.f153468a;
                    Long lG = kotlin.coroutines.jvm.internal.b.g(this.f153476f);
                    this.f153471a = c1VarX;
                    this.f153472b = c1VarX;
                    this.f153474d = 1;
                    Object objJ = iVar.j(lG, this);
                    if (objJ != objL) {
                        c1Var2 = c1VarX;
                        obj = objJ;
                        c1Var3 = c1Var2;
                        contest = (Contest) obj;
                        if (contest != null) {
                            throw new ErrorMessageException(com.planner5d.library.contest.e.r.f151442c8, new String[0]);
                        }
                        com.planner5d.library.contest.data.i iVar2 = n.this.f153468a;
                        this.f153471a = c1Var2;
                        this.f153472b = c1Var3;
                        this.f153473c = contest;
                        this.f153474d = 2;
                        objN = iVar2.n(contest, this);
                        if (objN != objL) {
                            contest2 = contest;
                            obj = objN;
                            c1Var = c1Var2;
                            aVar = new com.planner5d.library.contest.c.d(contest2, (List) obj);
                        }
                    }
                    return objL;
                } catch (Exception e11) {
                    c1Var = c1VarX;
                    e10 = e11;
                    timber.log.b.f381052a.e(e10);
                    aVar = new com.planner5d.library.contest.c.a(n.this.f153469b.parse(e10, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.contest.e.r.f151442c8)));
                    c1Var3 = c1Var;
                }
            } else if (i10 == 1) {
                c1Var3 = (c1) this.f153472b;
                c1Var2 = (c1) this.f153471a;
                try {
                    ResultKt.m(obj);
                    contest = (Contest) obj;
                    if (contest != null) {
                        throw new ErrorMessageException(com.planner5d.library.contest.e.r.f151442c8, new String[0]);
                    }
                    com.planner5d.library.contest.data.i iVar3 = n.this.f153468a;
                    this.f153471a = c1Var2;
                    this.f153472b = c1Var3;
                    this.f153473c = contest;
                    this.f153474d = 2;
                    objN = iVar3.n(contest, this);
                    if (objN != objL) {
                        contest2 = contest;
                        obj = objN;
                        c1Var = c1Var2;
                        aVar = new com.planner5d.library.contest.c.d(contest2, (List) obj);
                    }
                    return objL;
                } catch (Exception e12) {
                    e10 = e12;
                    c1Var = c1Var2;
                    timber.log.b.f381052a.e(e10);
                    aVar = new com.planner5d.library.contest.c.a(n.this.f153469b.parse(e10, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.contest.e.r.f151442c8)));
                    c1Var3 = c1Var;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contest2 = (Contest) this.f153473c;
                c1Var3 = (c1) this.f153472b;
                c1Var = (c1) this.f153471a;
                try {
                    ResultKt.m(obj);
                    aVar = new com.planner5d.library.contest.c.d(contest2, (List) obj);
                } catch (Exception e13) {
                    e10 = e13;
                    timber.log.b.f381052a.e(e10);
                    aVar = new com.planner5d.library.contest.c.a(n.this.f153469b.parse(e10, kotlin.coroutines.jvm.internal.b.f(com.planner5d.library.contest.e.r.f151442c8)));
                    c1Var3 = c1Var;
                }
            }
            c1Var3.r(aVar);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public n(@NotNull com.planner5d.library.contest.data.i contestManager, @NotNull ErrorMessageParser errorMessageParser) {
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        this.f153468a = contestManager;
        this.f153469b = errorMessageParser;
        this.f153470c = new c1<>(com.planner5d.library.contest.c.b.f148479b);
    }

    public final void W(long j10) {
        this.f153470c.r(com.planner5d.library.contest.c.f.f148490b);
        int i10 = 7 >> 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(j10, null), 3, null);
    }

    @NotNull
    public final c1<com.planner5d.library.contest.c> X() {
        return this.f153470c;
    }
}
