package com.superwall.sdk;

import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall$setInterfaceStyle$1$1", f = "Superwall.kt", i = {}, l = {626, 626}, m = "invokeSuspend", n = {}, s = {})
final class Superwall$setInterfaceStyle$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ Superwall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$setInterfaceStyle$1$1(Superwall superwall, d<? super Superwall$setInterfaceStyle$1$1> dVar) {
        super(2, dVar);
        this.this$0 = superwall;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Superwall$setInterfaceStyle$1$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (com.superwall.sdk.analytics.internal.TrackingKt.track(r1, r2, r6) == r0) goto L16;
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
            r5 = 6
            int r1 = r6.label
            r5 = 5
            r2 = 1
            r3 = 1
            r3 = 2
            r5 = 5
            if (r1 == 0) goto L2d
            r5 = 6
            if (r1 == r2) goto L24
            if (r1 != r3) goto L1c
            kotlin.ResultKt.m(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            r7.j()
            goto L5d
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L24:
            java.lang.Object r1 = r6.L$0
            com.superwall.sdk.Superwall r1 = (com.superwall.sdk.Superwall) r1
            kotlin.ResultKt.m(r7)
            r5 = 0
            goto L45
        L2d:
            kotlin.ResultKt.m(r7)
            r5 = 7
            com.superwall.sdk.Superwall r1 = r6.this$0
            com.superwall.sdk.dependencies.DependencyContainer r7 = r1.getDependencyContainer$superwall_release()
            r5 = 5
            r6.L$0 = r1
            r6.label = r2
            r5 = 7
            java.lang.Object r7 = r7.makeSessionDeviceAttributes(r6)
            if (r7 != r0) goto L45
            r5 = 0
            goto L5c
        L45:
            java.util.HashMap r7 = (java.util.HashMap) r7
            com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent$DeviceAttributes r2 = new com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent$DeviceAttributes
            r4 = 2
            r4 = 0
            r5 = 5
            r2.<init>(r7, r4, r3, r4)
            r5 = 5
            r6.L$0 = r4
            r5 = 5
            r6.label = r3
            java.lang.Object r6 = com.superwall.sdk.analytics.internal.TrackingKt.track(r1, r2, r6)
            r5 = 7
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.Superwall$setInterfaceStyle$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((Superwall$setInterfaceStyle$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
