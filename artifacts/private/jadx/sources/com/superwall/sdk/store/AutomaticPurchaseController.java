package com.superwall.sdk.store;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c0;
import com.android.billingclient.api.d0;
import com.android.billingclient.api.g0;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.config.models.ConfigurationStatus;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAutomaticPurchaseController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomaticPurchaseController.kt\ncom/superwall/sdk/store/AutomaticPurchaseController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,366:1\n1#2:367\n1755#3,3:368\n1368#3:371\n1454#3,5:372\n1368#3:377\n1454#3,5:378\n774#3:383\n865#3,2:384\n1863#3,2:386\n*S KotlinDebug\n*F\n+ 1 AutomaticPurchaseController.kt\ncom/superwall/sdk/store/AutomaticPurchaseController\n*L\n283#1:368,3\n287#1:371\n287#1:372,5\n290#1:377\n290#1:378,5\n344#1:383\n344#1:384,2\n345#1:386,2\n*E\n"})
public final class AutomaticPurchaseController implements PurchaseController, d0 {

    @NotNull
    private h billingClient;

    @NotNull
    private Context context;

    @NotNull
    private final Entitlements entitlementsInfo;

    @NotNull
    private final k0<Boolean> isConnected;

    @NotNull
    private final k0<PurchaseResult> purchaseResults;
    private long reconnectMilliseconds;

    @NotNull
    private final IOScope scope;

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController$1", f = "AutomaticPurchaseController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AutomaticPurchaseController.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            AutomaticPurchaseController.this.startConnection();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$onPurchasesUpdated$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController$onPurchasesUpdated$1", f = "AutomaticPurchaseController.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    static final class C27381 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ PurchaseResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27381(PurchaseResult purchaseResult, kotlin.coroutines.d<? super C27381> dVar) {
            super(2, dVar);
            this.$result = purchaseResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AutomaticPurchaseController.this.new C27381(this.$result, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = AutomaticPurchaseController.this.purchaseResults;
                PurchaseResult purchaseResult = this.$result;
                this.label = 1;
                if (k0Var.emit(purchaseResult, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            AutomaticPurchaseController.this.syncSubscriptionStatus();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27381) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$purchase$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController", f = "AutomaticPurchaseController.kt", i = {0, 0, 0}, l = {213, 224}, m = FirebaseAnalytics.c.D, n = {"this", "activity", "flowParams"}, s = {"L$0", "L$1", "L$2"})
    static final class C27391 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C27391(kotlin.coroutines.d<? super C27391> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutomaticPurchaseController.this.purchase(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$purchase$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController$purchase$2", f = "AutomaticPurchaseController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<Boolean, kotlin.coroutines.d<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Boolean> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.Z$0);
        }

        public final Object invoke(boolean z10, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController", f = "AutomaticPurchaseController.kt", i = {}, l = {230}, m = "restorePurchases", n = {}, s = {})
    static final class C27401 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C27401(kotlin.coroutines.d<? super C27401> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutomaticPurchaseController.this.restorePurchases(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatus$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatus$1", f = "AutomaticPurchaseController.kt", i = {}, l = {113, 114}, m = "invokeSuspend", n = {}, s = {})
    static final class C27421 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatus$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatus$1$1", f = "AutomaticPurchaseController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C18881 extends o implements Function2<Boolean, kotlin.coroutines.d<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            C18881(kotlin.coroutines.d<? super C18881> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C18881 c18881 = new C18881(dVar);
                c18881.Z$0 = ((Boolean) obj).booleanValue();
                return c18881;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Boolean> dVar) {
                return invoke(bool.booleanValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.Z$0);
            }

            public final Object invoke(boolean z10, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C18881) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        C27421(kotlin.coroutines.d<? super C27421> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return AutomaticPurchaseController.this.new C27421(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r7.syncSubscriptionStatusAndWait(r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 4
                int r1 = r6.label
                r5 = 5
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r7)
                goto L4d
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 6
                java.lang.String r7 = "tssrhe//eltm/ib rwococ  eoliv/ufo//arue/ntk e/eoi n"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 4
                r6.<init>(r7)
                throw r6
            L20:
                kotlin.ResultKt.m(r7)
                goto L40
            L24:
                kotlin.ResultKt.m(r7)
                com.superwall.sdk.Superwall$Companion r7 = com.superwall.sdk.Superwall.Companion
                r5 = 3
                kotlinx.coroutines.flow.i r7 = r7.getHasInitialized()
                r5 = 1
                com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatus$1$1 r1 = new com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatus$1$1
                r5 = 0
                r4 = 0
                r1.<init>(r4)
                r6.label = r3
                java.lang.Object r7 = kotlinx.coroutines.flow.k.x0(r7, r1, r6)
                r5 = 5
                if (r7 != r0) goto L40
                goto L4c
            L40:
                r5 = 6
                com.superwall.sdk.store.AutomaticPurchaseController r7 = com.superwall.sdk.store.AutomaticPurchaseController.this
                r6.label = r2
                java.lang.Object r6 = com.superwall.sdk.store.AutomaticPurchaseController.access$syncSubscriptionStatusAndWait(r7, r6)
                r5 = 3
                if (r6 != r0) goto L4d
            L4c:
                return r0
            L4d:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.AutomaticPurchaseController.C27421.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27421) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatusAndWait$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController", f = "AutomaticPurchaseController.kt", i = {0, 1, 2, 2}, l = {277, 278, 279}, m = "syncSubscriptionStatusAndWait", n = {"this", "this", "this", "subscriptionPurchases"}, s = {"L$0", "L$0", "L$0", "L$1"})
    static final class C27431 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C27431(kotlin.coroutines.d<? super C27431> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutomaticPurchaseController.this.syncSubscriptionStatusAndWait(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatusAndWait$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.AutomaticPurchaseController$syncSubscriptionStatusAndWait$2", f = "AutomaticPurchaseController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27442 extends o implements Function2<ConfigurationStatus, kotlin.coroutines.d<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C27442(kotlin.coroutines.d<? super C27442> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C27442 c27442 = new C27442(dVar);
            c27442.L$0 = obj;
            return c27442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfigurationStatus configurationStatus, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C27442) create(configurationStatus, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(((ConfigurationStatus) this.L$0) instanceof ConfigurationStatus.Configured);
        }
    }

    public AutomaticPurchaseController(@NotNull Context context, @NotNull IOScope scope, @NotNull Entitlements entitlementsInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(entitlementsInfo, "entitlementsInfo");
        this.context = context;
        this.scope = scope;
        this.entitlementsInfo = entitlementsInfo;
        h hVarA = h.m(context).g(this).d().a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
        this.billingClient = hVarA;
        this.isConnected = b1.a(Boolean.FALSE);
        this.purchaseResults = b1.a(null);
        this.reconnectMilliseconds = 1000L;
        k.f(scope, null, null, new AnonymousClass1(null), 3, null);
    }

    private final void acknowledgePurchasesIfNecessary(List<? extends Purchase> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.h() == 1 && !purchase.n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.android.billingclient.api.b bVarA = com.android.billingclient.api.b.b().b(((Purchase) it.next()).j()).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            this.billingClient.a(bVarA, new com.android.billingclient.api.c() { // from class: com.superwall.sdk.store.b
                @Override // com.android.billingclient.api.c
                public final void b(n nVar) {
                    AutomaticPurchaseController.acknowledgePurchasesIfNecessary$lambda$14$lambda$13(nVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acknowledgePurchasesIfNecessary$lambda$14$lambda$13(n billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.b() != 0) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "Unable to acknowledge purchase.", null, null, 24, null);
        }
    }

    private final String buildFullId(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            sb2.append(":" + str2);
        }
        if (str3 != null) {
            sb2.append(":" + str3);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryPurchasesOfType(String str, kotlin.coroutines.d<? super List<? extends Purchase>> dVar) {
        final x xVarC = z.c(null, 1, null);
        g0 g0VarA = g0.a().b(str).a();
        Intrinsics.checkNotNullExpressionValue(g0VarA, "build(...)");
        this.billingClient.q(g0VarA, new c0() { // from class: com.superwall.sdk.store.a
            @Override // com.android.billingclient.api.c0
            public final void onQueryPurchasesResponse(n nVar, List list) {
                AutomaticPurchaseController.queryPurchasesOfType$lambda$11(xVarC, nVar, list);
            }
        });
        return xVarC.q(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesOfType$lambda$11(x xVar, n billingResult, List purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        if (billingResult.b() != 0) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "Unable to query for purchases.", null, null, 24, null);
        } else {
            xVar.R(purchasesList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConnection() {
        try {
            this.billingClient.w(new j() { // from class: com.superwall.sdk.store.AutomaticPurchaseController.startConnection.1
                @Override // com.android.billingclient.api.j
                public void onBillingServiceDisconnected() {
                    AutomaticPurchaseController.this.isConnected.setValue(Boolean.FALSE);
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "ExternalNativePurchaseController billing client disconnected, retrying in " + AutomaticPurchaseController.this.reconnectMilliseconds + " milliseconds", null, null, 24, null);
                    k.f(t0.a(l1.c()), null, null, new AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1(AutomaticPurchaseController.this, null), 3, null);
                    AutomaticPurchaseController automaticPurchaseController = AutomaticPurchaseController.this;
                    automaticPurchaseController.reconnectMilliseconds = Math.min(automaticPurchaseController.reconnectMilliseconds * ((long) 2), 16000L);
                }

                @Override // com.android.billingclient.api.j
                public void onBillingSetupFinished(n billingResult) {
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    AutomaticPurchaseController.this.isConnected.setValue(Boolean.valueOf(billingResult.b() == 0));
                    AutomaticPurchaseController.this.syncSubscriptionStatus();
                }
            });
        } catch (IllegalStateException e10) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "IllegalStateException when connecting to billing client for ExternalNativePurchaseController: " + e10.getMessage(), null, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncSubscriptionStatus() {
        k.f(this.scope, null, null, new C27421(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc A[LOOP:1: B:40:0x00f6->B:42:0x00fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x012c A[LOOP:2: B:44:0x0125->B:46:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x015a A[EDGE_INSN: B:49:0x015a->B:52:0x0165 BREAK  A[LOOP:0: B:35:0x00d4->B:60:?]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0160 A[EDGE_INSN: B:50:0x0160->B:52:0x0165 BREAK  A[LOOP:0: B:35:0x00d4->B:60:?]] */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:58:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:35:0x00d4->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object syncSubscriptionStatusAndWait(kotlin.coroutines.d<? super Unit> dVar) {
        C27431 c27431;
        List list;
        Object objQueryPurchasesOfType;
        AutomaticPurchaseController automaticPurchaseController;
        List list2;
        List listPlus;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        ArrayList arrayList2;
        Set<Entitlement> set;
        SubscriptionStatus active;
        Superwall.Companion companion;
        if (dVar instanceof C27431) {
            c27431 = (C27431) dVar;
            int i10 = c27431.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27431.label = i10 - Integer.MIN_VALUE;
            } else {
                c27431 = new C27431(dVar);
            }
        } else {
            c27431 = new C27431(dVar);
        }
        Object objQueryPurchasesOfType2 = c27431.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27431.label;
        if (i11 == 0) {
            ResultKt.m(objQueryPurchasesOfType2);
            i<ConfigurationStatus> configurationStateListener = Superwall.Companion.getInstance().getConfigurationStateListener();
            C27442 c27442 = new C27442(null);
            c27431.L$0 = this;
            c27431.label = 1;
            if (kotlinx.coroutines.flow.k.x0(configurationStateListener, c27442, c27431) == objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (AutomaticPurchaseController) c27431.L$0;
            ResultKt.m(objQueryPurchasesOfType2);
        } else {
            if (i11 == 2) {
                this = (AutomaticPurchaseController) c27431.L$0;
                ResultKt.m(objQueryPurchasesOfType2);
                list = (List) objQueryPurchasesOfType2;
                c27431.L$0 = this;
                c27431.L$1 = list;
                c27431.label = 3;
                objQueryPurchasesOfType = this.queryPurchasesOfType("inapp", c27431);
                if (objQueryPurchasesOfType != objL) {
                    automaticPurchaseController = this;
                    list2 = list;
                    objQueryPurchasesOfType2 = objQueryPurchasesOfType;
                }
                return objL;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) c27431.L$1;
            automaticPurchaseController = (AutomaticPurchaseController) c27431.L$0;
            ResultKt.m(objQueryPurchasesOfType2);
        }
        listPlus = CollectionsKt.plus((Collection) list2, (Iterable) objQueryPurchasesOfType2);
        if (!(listPlus instanceof Collection) && listPlus.isEmpty()) {
            active = SubscriptionStatus.Inactive.INSTANCE;
            break;
        }
        it = listPlus.iterator();
        while (true) {
            if (!it.hasNext()) {
                active = SubscriptionStatus.Inactive.INSTANCE;
                break;
            }
            if (((Purchase) it.next()).h() == 1) {
                arrayList = new ArrayList();
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    List<String> listG = ((Purchase) it2.next()).g();
                    Intrinsics.checkNotNullExpressionValue(listG, "getProducts(...)");
                    CollectionsKt.addAll(arrayList, listG);
                }
                Set<String> set2 = CollectionsKt.toSet(arrayList);
                arrayList2 = new ArrayList();
                for (String str : set2) {
                    Entitlements entitlements = automaticPurchaseController.entitlementsInfo;
                    Intrinsics.checkNotNull(str);
                    CollectionsKt.addAll(arrayList2, entitlements.byProductId$superwall_release(str));
                }
                set = CollectionsKt.toSet(arrayList2);
                automaticPurchaseController.entitlementsInfo.setActiveDeviceEntitlements$superwall_release(set);
                if (!set.isEmpty()) {
                    active = new SubscriptionStatus.Active(set);
                    break;
                }
                active = SubscriptionStatus.Inactive.INSTANCE;
                break;
            }
        }
        companion = Superwall.Companion;
        if (companion.getInitialized()) {
            companion.getInstance().internallySetSubscriptionStatus$superwall_release(active);
            return Unit.f312394a;
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "Attempting to sync subscription status before Superwall has been initialized.", null, null, 24, null);
        return Unit.f312394a;
        c27431.L$0 = this;
        c27431.label = 2;
        objQueryPurchasesOfType2 = this.queryPurchasesOfType("subs", c27431);
        if (objQueryPurchasesOfType2 != objL) {
            list = (List) objQueryPurchasesOfType2;
            c27431.L$0 = this;
            c27431.L$1 = list;
            c27431.label = 3;
            objQueryPurchasesOfType = this.queryPurchasesOfType("inapp", c27431);
            if (objQueryPurchasesOfType != objL) {
                automaticPurchaseController = this;
                list2 = list;
                objQueryPurchasesOfType2 = objQueryPurchasesOfType;
                listPlus = CollectionsKt.plus((Collection) list2, (Iterable) objQueryPurchasesOfType2);
                if (!(listPlus instanceof Collection)) {
                    it = listPlus.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            active = SubscriptionStatus.Inactive.INSTANCE;
                            break;
                        }
                        if (((Purchase) it.next()).h() == 1) {
                            arrayList = new ArrayList();
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                List<String> listG2 = ((Purchase) it2.next()).g();
                                Intrinsics.checkNotNullExpressionValue(listG2, "getProducts(...)");
                                CollectionsKt.addAll(arrayList, listG2);
                            }
                            Set<String> set3 = CollectionsKt.toSet(arrayList);
                            arrayList2 = new ArrayList();
                            while (r11.hasNext()) {
                                Entitlements entitlements2 = automaticPurchaseController.entitlementsInfo;
                                Intrinsics.checkNotNull(str);
                                CollectionsKt.addAll(arrayList2, entitlements2.byProductId$superwall_release(str));
                            }
                            set = CollectionsKt.toSet(arrayList2);
                            automaticPurchaseController.entitlementsInfo.setActiveDeviceEntitlements$superwall_release(set);
                            if (!set.isEmpty()) {
                                active = SubscriptionStatus.Inactive.INSTANCE;
                                break;
                            }
                            active = new SubscriptionStatus.Active(set);
                            break;
                        }
                    }
                } else {
                    it = listPlus.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            active = SubscriptionStatus.Inactive.INSTANCE;
                            break;
                        }
                        if (((Purchase) it.next()).h() == 1) {
                            arrayList = new ArrayList();
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                List<String> listG3 = ((Purchase) it2.next()).g();
                                Intrinsics.checkNotNullExpressionValue(listG3, "getProducts(...)");
                                CollectionsKt.addAll(arrayList, listG3);
                            }
                            Set<String> set4 = CollectionsKt.toSet(arrayList);
                            arrayList2 = new ArrayList();
                            while (r11.hasNext()) {
                                Entitlements entitlements3 = automaticPurchaseController.entitlementsInfo;
                                Intrinsics.checkNotNull(str);
                                CollectionsKt.addAll(arrayList2, entitlements3.byProductId$superwall_release(str));
                            }
                            set = CollectionsKt.toSet(arrayList2);
                            automaticPurchaseController.entitlementsInfo.setActiveDeviceEntitlements$superwall_release(set);
                            if (!set.isEmpty()) {
                                active = SubscriptionStatus.Inactive.INSTANCE;
                                break;
                            }
                            active = new SubscriptionStatus.Active(set);
                            break;
                        }
                    }
                }
                companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "Attempting to sync subscription status before Superwall has been initialized.", null, null, 24, null);
                    return Unit.f312394a;
                }
                companion.getInstance().internallySetSubscriptionStatus$superwall_release(active);
                return Unit.f312394a;
            }
        }
        return objL;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Entitlements getEntitlementsInfo() {
        return this.entitlementsInfo;
    }

    @NotNull
    public final IOScope getScope() {
        return this.scope;
    }

    @Override // com.android.billingclient.api.d0
    public void onPurchasesUpdated(@NotNull n billingResult, @Nullable List<Purchase> list) {
        PurchaseResult purchased;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int iB = billingResult.b();
        if (iB != 0) {
            purchased = iB != 1 ? new PurchaseResult.Failed(String.valueOf(billingResult.b())) : new PurchaseResult.Cancelled();
        } else {
            if (list != null) {
                acknowledgePurchasesIfNecessary(list);
            }
            purchased = new PurchaseResult.Purchased();
        }
        k.f(this.scope, null, null, new C27381(purchased, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0174, code lost:
    
        if (r4 == r6) goto L50;
     */
    @Override // com.superwall.sdk.delegate.subscription_controller.PurchaseController
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object purchase(@org.jetbrains.annotations.NotNull android.app.Activity r21, @org.jetbrains.annotations.NotNull com.android.billingclient.api.z r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable java.lang.String r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.superwall.sdk.delegate.PurchaseResult> r25) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.AutomaticPurchaseController.purchase(android.app.Activity, com.android.billingclient.api.z, java.lang.String, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.superwall.sdk.delegate.subscription_controller.PurchaseController
    @Nullable
    public Object restorePurchases(@NotNull kotlin.coroutines.d<? super RestorationResult> dVar) {
        C27401 c27401;
        if (dVar instanceof C27401) {
            c27401 = (C27401) dVar;
            int i10 = c27401.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27401.label = i10 - Integer.MIN_VALUE;
            } else {
                c27401 = new C27401(dVar);
            }
        } else {
            c27401 = new C27401(dVar);
        }
        Object obj = c27401.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27401.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            c27401.label = 1;
            if (syncSubscriptionStatusAndWait(c27401) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return new RestorationResult.Restored();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
