package com.planner5d.library.project.interactor;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.dialog.purchase.s;
import com.planner5d.library.model.manager.payments.j;
import com.planner5d.library.modules.user.user.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements pd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s f223912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f223913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f223914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f223915d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.project.interactor.InitiateInAppPurchaseInteractor", f = "InitiateInAppPurchaseInteractor.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 3}, l = {27, 30, 33, 43}, m = FirebaseAnalytics.c.D, n = {"this", "lifecycleOwner", "numberOfRoomStyles", "this", "lifecycleOwner", "sku", "numberOfRoomStyles", "this", "paymentState"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f223916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f223917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f223918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f223919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f223920e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f223922g;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f223920e = obj;
            this.f223922g |= Integer.MIN_VALUE;
            return e.this.a(null, 0, this);
        }
    }

    @ij.a
    public e(@NotNull s purchaseDialogFactory, @NotNull k dialogLauncher, @NotNull j paymentManager, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(purchaseDialogFactory, "purchaseDialogFactory");
        Intrinsics.checkNotNullParameter(dialogLauncher, "dialogLauncher");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f223912a = purchaseDialogFactory;
        this.f223913b = dialogLauncher;
        this.f223914c = paymentManager;
        this.f223915d = userAuthorization;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0129  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        if (r1 == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0147, code lost:
    
        if (r1 == r2) goto L47;
     */
    @Override // pd.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull androidx.lifecycle.o0 r23, int r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.planner5d.library.activity.fragment.dialog.purchase.e0> r25) throws com.planner5d.library.model.manager.payments.u.a {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.project.interactor.e.a(androidx.lifecycle.o0, int, kotlin.coroutines.d):java.lang.Object");
    }
}
