package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.modules.user.user.t;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements nb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.payments.j f160428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t f160429b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.dgenerator.interactor.GetDesignGeneratorProductsInteractor", f = "GetDesignGeneratorProductsInteractor.kt", i = {}, l = {16}, m = "getInAppProducts", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f160430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f160432c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f160430a = obj;
            this.f160432c |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    @ij.a
    public g(@NotNull com.planner5d.library.model.manager.payments.j paymentManager, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f160428a = paymentManager;
        this.f160429b = userAuthorization;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // nb.d
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super List<fd.g>> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f160432c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f160432c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objN0 = aVar.f160430a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f160432c;
        if (i11 == 0) {
            ResultKt.m(objN0);
            com.planner5d.library.model.manager.payments.j jVar = this.f160428a;
            fd.k kVar = fd.k.DESIGN_GENERATOR;
            id.a aVarA = this.f160429b.a();
            com.planner5d.library.model.manager.config.a.EnumC1573a enumC1573a = com.planner5d.library.model.manager.config.a.EnumC1573a.NATIVE;
            aVar.f160432c = 1;
            objN0 = jVar.n0(kVar, aVarA, enumC1573a, aVar);
            if (objN0 == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objN0);
        }
        return ArraysKt.toList((Object[]) objN0);
    }
}
