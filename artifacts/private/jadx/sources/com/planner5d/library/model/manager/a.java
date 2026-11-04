package com.planner5d.library.model.manager;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.l(message = "Only for back compatibility, should be removed in future")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t2 f180773a;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.BlockingPaymentsManager$getPurchaseInformationAsStringBlocking$1", f = "BlockingPaymentsManager.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
    static final class C1568a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f180774a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f180776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f180777d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1568a(Context context, long j10, kotlin.coroutines.d<? super C1568a> dVar) {
            super(2, dVar);
            this.f180776c = context;
            this.f180777d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C1568a(this.f180776c, this.f180777d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f180774a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            t2 t2Var = a.this.f180773a;
            Context context = this.f180776c;
            long j10 = this.f180777d;
            this.f180774a = 1;
            Object objB = t2Var.b(context, j10, this);
            return objB == objL ? objL : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((C1568a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public a(@NotNull t2 paymentsManager) {
        Intrinsics.checkNotNullParameter(paymentsManager, "paymentsManager");
        this.f180773a = paymentsManager;
    }

    @androidx.annotation.m1
    @NotNull
    public final String b(@NotNull Context context, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (String) com.planner5d.library.services.utility.c0.t(com.planner5d.library.services.utility.c0.f225068a, null, false, new C1568a(context, j10, null), 3, null);
    }
}
