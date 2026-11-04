package com.superwall.sdk.paywall.request;

import com.superwall.sdk.models.paywall.Paywall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.x;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywall$2$1", f = "PaywallRequestManager.kt", i = {3, 3, 4, 4}, l = {80, com.planner5d.library.engine.input.f.b.f160696i0, 90, com.planner5d.library.engine.input.f.b.f160718p1, 99, 110, com.planner5d.library.engine.input.f.b.B}, m = "invokeSuspend", n = {"requestHash", "deferredTask", "requestHash", "deferredTask"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nPaywallRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallRequestManager.kt\ncom/superwall/sdk/paywall/request/PaywallRequestManager$getPaywall$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,375:1\n1053#2:376\n*S KotlinDebug\n*F\n+ 1 PaywallRequestManager.kt\ncom/superwall/sdk/paywall/request/PaywallRequestManager$getPaywall$2$1\n*L\n65#1:376\n*E\n"})
final class PaywallRequestManager$getPaywall$2$1 extends o implements Function2<s0, d<? super Paywall>, Object> {
    final /* synthetic */ boolean $isPreloading;
    final /* synthetic */ PaywallRequest $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaywallRequestManager this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywall$2$1$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywall$2$1$1", f = "PaywallRequestManager.kt", i = {1}, l = {101, 102}, m = "invokeSuspend", n = {"finalPaywall"}, s = {"L$0"})
    static final class AnonymousClass1 extends o implements Function2<Paywall, d<? super Unit>, Object> {
        final /* synthetic */ x<Paywall> $deferredTask;
        final /* synthetic */ PaywallRequest $request;
        final /* synthetic */ String $requestHash;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaywallRequestManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, String str, x<Paywall> xVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = paywallRequestManager;
            this.$request = paywallRequest;
            this.$requestHash = str;
            this.$deferredTask = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, this.$requestHash, this.$deferredTask, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Paywall paywall, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(paywall, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Paywall paywall;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.m(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    paywall = (Paywall) this.L$0;
                    ResultKt.m(obj);
                }
                this.$deferredTask.R(paywall);
                return Unit.f312394a;
            }
            ResultKt.m(obj);
            Paywall paywall2 = (Paywall) this.L$0;
            PaywallRequestManager paywallRequestManager = this.this$0;
            PaywallRequest paywallRequest = this.$request;
            this.label = 1;
            obj = paywallRequestManager.addProducts(paywall2, paywallRequest, this);
            if (obj != objL) {
            }
            return objL;
            Paywall paywall3 = (Paywall) obj;
            PaywallRequestManager paywallRequestManager2 = this.this$0;
            String str = this.$requestHash;
            boolean zIsDebuggerLaunched = this.$request.isDebuggerLaunched();
            this.L$0 = paywall3;
            this.label = 2;
            if (paywallRequestManager2.saveRequestHash(str, paywall3, zIsDebuggerLaunched, this) != objL) {
                paywall = paywall3;
                this.$deferredTask.R(paywall);
                return Unit.f312394a;
            }
            return objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallRequestManager$getPaywall$2$1(PaywallRequestManager paywallRequestManager, PaywallRequest paywallRequest, boolean z10, d<? super PaywallRequestManager$getPaywall$2$1> dVar) {
        super(2, dVar);
        this.this$0 = paywallRequestManager;
        this.$request = paywallRequest;
        this.$isPreloading = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PaywallRequestManager$getPaywall$2$1(this.this$0, this.$request, this.$isPreloading, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0192  */
    /* JADX WARN: Code duplicated, block: B:59:0x0194  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2 A[PHI: r14
      0x01b2: PHI (r14v30 java.lang.Object) = (r14v29 java.lang.Object), (r14v0 java.lang.Object) binds: [B:61:0x01af, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
    
        if (r14 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01df, code lost:
    
        if (r14 == r0) goto L72;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.request.PaywallRequestManager$getPaywall$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Paywall> dVar) {
        return ((PaywallRequestManager$getPaywall$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
