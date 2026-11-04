package com.planner5d.library.modules.user.user;

import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@ij.f
public final class b1 implements y0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222979b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.p f222980a;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.user.UserRememberAdapterPayments", f = "UserRememberAdapterPayments.kt", i = {}, l = {13}, m = "get", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f222981a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f222983c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222981a = obj;
            this.f222983c |= Integer.MIN_VALUE;
            return b1.this.a(this);
        }
    }

    @ij.a
    public b1(@NotNull com.planner5d.library.model.manager.payments.p payments) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f222980a = payments;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.planner5d.library.modules.user.user.y0.a
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super id.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f222983c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f222983c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE = aVar.f222981a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f222983c;
        if (i11 == 0) {
            ResultKt.m(objE);
            com.planner5d.library.model.manager.payments.p pVar = this.f222980a;
            aVar.f222983c = 1;
            objE = pVar.E(aVar);
            if (objE == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objE);
        }
        return new id.c((id.a) objE);
    }

    @Override // com.planner5d.library.modules.user.user.y0.a
    public void b() {
    }
}
