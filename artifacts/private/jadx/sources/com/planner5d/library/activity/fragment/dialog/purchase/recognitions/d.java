package com.planner5d.library.activity.fragment.dialog.purchase.recognitions;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.w;
import fd.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class d extends f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132752c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.c f132753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.dialog.purchase.e> f132754b;

    @f(c = "com.planner5d.library.activity.fragment.dialog.purchase.recognitions.PurchasePlanRecognitionsViewModel$update$1", f = "PurchasePlanRecognitionsViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132755a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132755a;
            int i11 = 2 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.activity.fragment.dialog.purchase.c cVar = d.this.f132753a;
                this.f132755a = 1;
                if (cVar.d(this) == objL) {
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

    @ij.a
    public d(@NotNull com.planner5d.library.activity.fragment.dialog.purchase.c.a productListFetchingFactory) {
        Intrinsics.checkNotNullParameter(productListFetchingFactory, "productListFetchingFactory");
        com.planner5d.library.activity.fragment.dialog.purchase.c cVarA = productListFetchingFactory.a(k.PLAN_RECOGNITIONS);
        this.f132753a = cVarA;
        this.f132754b = w.g(cVarA.b(), null, 0L, 3, null);
        W();
    }

    @NotNull
    public final androidx.lifecycle.w0<com.planner5d.library.activity.fragment.dialog.purchase.e> V() {
        return this.f132754b;
    }

    public final void W() {
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }
}
