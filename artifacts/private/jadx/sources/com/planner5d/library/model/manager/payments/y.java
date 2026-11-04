package com.planner5d.library.model.manager.payments;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.w2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f193047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.w f193048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w2 f193049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u1 f193050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c2 f193051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.c2 f193052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.t f193053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final a0 f193054h;

    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.s f193055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f193056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FragmentManager f193057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.model.manager.config.purchaseplacement.b.a f193058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y3.c f193059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f193060f;

        a(androidx.fragment.app.s sVar, y yVar, FragmentManager fragmentManager, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, Bundle bundle) {
            this.f193055a = sVar;
            this.f193056b = yVar;
            this.f193057c = fragmentManager;
            this.f193058d = aVar;
            this.f193059e = cVar;
            this.f193060f = bundle;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(o0 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onResume(owner);
            this.f193055a.getLifecycle().g(this);
            this.f193056b.f193053g.c(new com.planner5d.library.activity.fragment.dialog.r(this.f193057c), this.f193058d, this.f193059e, this.f193060f);
        }
    }

    @ij.a
    public y(@NotNull Application application, @NotNull com.planner5d.library.model.manager.w featureConfigManager, @NotNull w2 purchasePlacementManager, @NotNull u1 logRecordManagerService, @NotNull c2 messageManager, @NotNull com.planner5d.library.services.utility.c2 networkStateUtility, @NotNull com.planner5d.library.activity.fragment.dialog.purchase.t purchaseDialogFactoryService, @NotNull a0 superwallPurchaseService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(purchasePlacementManager, "purchasePlacementManager");
        Intrinsics.checkNotNullParameter(logRecordManagerService, "logRecordManagerService");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(purchaseDialogFactoryService, "purchaseDialogFactoryService");
        Intrinsics.checkNotNullParameter(superwallPurchaseService, "superwallPurchaseService");
        this.f193047a = application;
        this.f193048b = featureConfigManager;
        this.f193049c = purchasePlacementManager;
        this.f193050d = logRecordManagerService;
        this.f193051e = messageManager;
        this.f193052f = networkStateUtility;
        this.f193053g = purchaseDialogFactoryService;
        this.f193054h = superwallPurchaseService;
    }

    private final void d(FragmentManager fragmentManager, Bundle bundle, com.planner5d.library.model.manager.config.purchaseplacement.b.a aVar, y3.c cVar, androidx.fragment.app.s sVar) {
        if (fragmentManager.i1()) {
            sVar.getLifecycle().c(new a(sVar, this, fragmentManager, aVar, cVar, bundle));
        } else {
            this.f193053g.c(new com.planner5d.library.activity.fragment.dialog.r(fragmentManager), aVar, cVar, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(y yVar, Function0 function0, FragmentManager fragmentManager, Bundle bundle, y3.c cVar, androidx.fragment.app.s sVar, boolean z10, boolean z11) {
        if (yVar.f193054h.c()) {
            function0.invoke();
        } else if (!z10) {
            yVar.d(fragmentManager, bundle, com.planner5d.library.model.manager.config.purchaseplacement.b.a.fallback, cVar, sVar);
        }
        return Unit.f312394a;
    }

    @Override // com.planner5d.library.model.manager.payments.b0
    public void a(@NotNull final androidx.fragment.app.s activity, @NotNull final FragmentManager fragmentManager, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a placementName, @Nullable final Bundle bundle, @NotNull final Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (this.f193054h.c()) {
            onSuccess.invoke();
            return;
        }
        if (!this.f193052f.d(this.f193047a)) {
            c2 c2Var = this.f193051e;
            ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
            Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
            c2Var.c(errorMessageExceptionCreateNoInternetException);
            return;
        }
        com.planner5d.library.model.manager.config.purchaseplacement.a aVarA = this.f193049c.a(placementName);
        final y3.c cVarE = this.f193054h.e(placementName);
        if (aVarA == null) {
            d(fragmentManager, bundle, com.planner5d.library.model.manager.config.purchaseplacement.b.a.fallback, cVarE, activity);
            this.f193050d.b("superwall_placement", placementName.n(), null);
            return;
        }
        if (this.f193048b.a(com.planner5d.library.model.manager.config.f.Superwall) && aVarA.f() == fd.e.Superwall) {
            this.f193054h.d(activity, placementName, new Function2() { // from class: com.planner5d.library.model.manager.payments.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y.e(this.f193041a, onSuccess, fragmentManager, bundle, cVarE, activity, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
            return;
        }
        if (aVarA.f() == fd.e.None) {
            onSuccess.invoke();
            return;
        }
        if (aVarA.f() == fd.e.Superwall) {
            placementName = null;
        }
        if (placementName == null) {
            placementName = com.planner5d.library.model.manager.config.purchaseplacement.b.a.fallback;
        }
        d(fragmentManager, bundle, placementName, cVarE, activity);
    }
}
