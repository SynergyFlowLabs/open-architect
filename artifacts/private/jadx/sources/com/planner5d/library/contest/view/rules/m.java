package com.planner5d.library.contest.view.rules;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class m extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f153782d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.contest.data.i f153783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<a> f153784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f153785c;

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f153786c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f153787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<hb.a> f153788b;

        public a(boolean z10, @NotNull List<hb.a> prizes) {
            Intrinsics.checkNotNullParameter(prizes, "prizes");
            this.f153787a = z10;
            this.f153788b = prizes;
        }

        public final boolean a() {
            return this.f153787a;
        }

        @NotNull
        public final List<hb.a> b() {
            return this.f153788b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.contest.view.rules.ContestRulesViewModel$loadPrizes$1", f = "ContestRulesViewModel.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f153789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f153790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f153791c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f153791c;
            if (i11 == 0) {
                ResultKt.m(obj);
                c1 c1Var2 = m.this.f153784b;
                com.planner5d.library.contest.data.i iVar = m.this.f153783a;
                this.f153789a = c1Var2;
                this.f153790b = 0;
                this.f153791c = 1;
                Object objQ = iVar.q(this);
                if (objQ == objL) {
                    return objL;
                }
                obj = objQ;
                c1Var = c1Var2;
                i10 = 0;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f153790b;
                c1Var = (c1) this.f153789a;
                ResultKt.m(obj);
            }
            c1Var.r(new a(i10 != 0, (List) obj));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull com.planner5d.library.contest.data.i contestManager) {
        Intrinsics.checkNotNullParameter(contestManager, "contestManager");
        this.f153783a = contestManager;
        c1<a> c1Var = new c1<>(new a(true, CollectionsKt.emptyList()));
        this.f153784b = c1Var;
        this.f153785c = c1Var;
        X();
    }

    private final void X() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.w0<a> W() {
        return this.f153785c;
    }
}
