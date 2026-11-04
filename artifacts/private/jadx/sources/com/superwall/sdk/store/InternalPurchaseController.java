package com.superwall.sdk.store;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.z;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.delegate.subscription_controller.PurchaseControllerJava;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InternalPurchaseController implements PurchaseController {

    @NotNull
    private final Context context;

    @Nullable
    private final PurchaseControllerJava javaPurchaseController;

    @Nullable
    private final PurchaseController kotlinPurchaseController;

    public InternalPurchaseController(@Nullable PurchaseController purchaseController, @Nullable PurchaseControllerJava purchaseControllerJava, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.kotlinPurchaseController = purchaseController;
        this.javaPurchaseController = purchaseControllerJava;
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getHasExternalPurchaseController() {
        return !getHasInternalPurchaseController();
    }

    public final boolean getHasInternalPurchaseController() {
        return this.kotlinPurchaseController instanceof AutomaticPurchaseController;
    }

    @Override // com.superwall.sdk.delegate.subscription_controller.PurchaseController
    @Nullable
    public Object purchase(@NotNull Activity activity, @NotNull z zVar, @Nullable String str, @Nullable String str2, @NotNull kotlin.coroutines.d<? super PurchaseResult> dVar) {
        PurchaseController purchaseController = this.kotlinPurchaseController;
        if (purchaseController != null) {
            return purchaseController.purchase(activity, zVar, str, str2, dVar);
        }
        if (this.javaPurchaseController == null) {
            return new PurchaseResult.Cancelled();
        }
        final j jVar = new j(kotlin.coroutines.intrinsics.b.e(dVar));
        this.javaPurchaseController.purchase(zVar, str, str2, new Function1<PurchaseResult, Unit>() { // from class: com.superwall.sdk.store.InternalPurchaseController$purchase$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchaseResult purchaseResult) {
                invoke2(purchaseResult);
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchaseResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                kotlin.coroutines.d<PurchaseResult> dVar2 = jVar;
                Result.a aVar = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(result));
            }
        });
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objA;
    }

    @Override // com.superwall.sdk.delegate.subscription_controller.PurchaseController
    @Nullable
    public Object restorePurchases(@NotNull kotlin.coroutines.d<? super RestorationResult> dVar) {
        PurchaseController purchaseController = this.kotlinPurchaseController;
        if (purchaseController != null) {
            return purchaseController.restorePurchases(dVar);
        }
        if (this.javaPurchaseController == null) {
            return new RestorationResult.Failed(null);
        }
        final j jVar = new j(kotlin.coroutines.intrinsics.b.e(dVar));
        this.javaPurchaseController.restorePurchases(new Function2<RestorationResult, Throwable, Unit>() { // from class: com.superwall.sdk.store.InternalPurchaseController$restorePurchases$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(RestorationResult restorationResult, Throwable th2) {
                invoke2(restorationResult, th2);
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RestorationResult result, Throwable th2) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (th2 == null) {
                    kotlin.coroutines.d<RestorationResult> dVar2 = jVar;
                    Result.a aVar = Result.Companion;
                    dVar2.resumeWith(Result.m785constructorimpl(result));
                } else {
                    kotlin.coroutines.d<RestorationResult> dVar3 = jVar;
                    Result.a aVar2 = Result.Companion;
                    dVar3.resumeWith(Result.m785constructorimpl(new RestorationResult.Failed(th2)));
                }
            }
        });
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            h.c(dVar);
        }
        return objA;
    }
}
