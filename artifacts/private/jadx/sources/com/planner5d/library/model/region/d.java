package com.planner5d.library.model.region;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d0;
import com.android.billingclient.api.n;
import com.planner5d.library.services.e0;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.s;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
public final class d implements e0, d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f222778d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f1 f222779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.android.billingclient.api.h f222780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f222781c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.region.PlayBillingRegionProvider$updateCountry$1", f = "PlayBillingRegionProvider.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222782a;

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
            int i10 = this.f222782a;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            while (!d.this.f222780b.k()) {
                this.f222782a = 1;
                if (d1.b(100L, this) == objL) {
                    return objL;
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public d(@NotNull Application application, @NotNull f1 coroutineScope) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f222779a = coroutineScope;
        com.android.billingclient.api.h hVarA = com.android.billingclient.api.h.m(application).g(this).d().a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
        this.f222780b = hVarA;
        c();
    }

    private final void c() {
        kotlinx.coroutines.k.f(this.f222779a, s.f229729a.d(), null, new a(null), 2, null);
    }

    @Override // com.planner5d.library.services.e0
    @Nullable
    public String a() {
        return this.f222781c;
    }

    @Override // com.android.billingclient.api.d0
    public void onPurchasesUpdated(@NotNull n p10, @Nullable List<Purchase> list) {
        Intrinsics.checkNotNullParameter(p10, "p0");
    }
}
