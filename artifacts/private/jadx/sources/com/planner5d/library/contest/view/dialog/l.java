package com.planner5d.library.contest.view.dialog;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.database.model.contest.Contest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class l extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f153575d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f153577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f153578c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.dialog.ContestSubmittedDialogViewModel$1", f = "ContestSubmittedDialogViewModel.kt", i = {}, l = {20, 20}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nContestSubmittedDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestSubmittedDialogViewModel.kt\ncom/planner5d/library/contest/view/dialog/ContestSubmittedDialogViewModel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f153580b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objR;
            Boolean boolA;
            c1 c1Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f153580b;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1Var = l.this.f153577b;
                com.planner5d.library.contest.data.i iVar = l.this.f153576a;
                this.f153579a = c1Var;
                this.f153580b = 1;
                objR = iVar.r(this);
                if (objR != objL) {
                }
                return objL;
            }
            if (i10 == 1) {
                c1 c1Var3 = (c1) this.f153579a;
                ResultKt.m(obj);
                objR = obj;
                c1Var = c1Var3;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var2 = (c1) this.f153579a;
                ResultKt.m(obj);
            }
            Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(((Boolean) obj).booleanValue());
            c1Var = c1Var2;
            boolA = boolA2;
            c1Var.r(boolA);
            return Unit.f312394a;
            Contest contest = (Contest) objR;
            if (contest != null) {
                com.planner5d.library.contest.data.i iVar2 = l.this.f153576a;
                this.f153579a = c1Var;
                this.f153580b = 2;
                Object objI = iVar2.i(contest, this);
                if (objI != objL) {
                    c1 c1Var4 = c1Var;
                    obj = objI;
                    c1Var2 = c1Var4;
                    Boolean boolA3 = kotlin.coroutines.jvm.internal.b.a(((Boolean) obj).booleanValue());
                    c1Var = c1Var2;
                    boolA = boolA3;
                }
                return objL;
            }
            boolA = kotlin.coroutines.jvm.internal.b.a(false);
            c1Var.r(boolA);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull com.planner5d.library.contest.data.i contestManager) {
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        this.f153576a = contestManager;
        c1<Boolean> c1Var = new c1<>(null);
        this.f153577b = c1Var;
        this.f153578c = c1Var;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> W() {
        return this.f153578c;
    }
}
