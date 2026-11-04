package com.planner5d.library.legal.view.dialog.agreements;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.legal.model.manager.a f180433a;

    @f(c = "com.planner5d.library.legal.view.dialog.agreements.AgreementsDialogViewModel$submit$1", f = "AgreementsDialogViewModel.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180434a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180434a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.legal.model.manager.a aVar = c.this.f180433a;
                this.f180434a = 1;
                if (aVar.F(false, this) == objL) {
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
    public c(@NotNull com.planner5d.library.legal.model.manager.a privacyManager) {
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        this.f180433a = privacyManager;
    }

    public final void V() {
        int i10 = 3 >> 0;
        k.f(g2.a(this), null, null, new a(null), 3, null);
    }
}
