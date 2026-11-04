package com.superwall.sdk.analytics.session;

import androidx.media3.extractor.metadata.dvbsi.b;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.analytics.session.AppSessionManager$detectNewSession$1$1", f = "AppSessionManager.kt", i = {1, 1, 2}, l = {113, b.f67479d, 122, 128}, m = "invokeSuspend", n = {"deviceAttributes", "userAttributes", "userAttributes"}, s = {"L$0", "L$1", "L$0"})
final class AppSessionManager$detectNewSession$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AppSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSessionManager$detectNewSession$1$1(AppSessionManager appSessionManager, d<? super AppSessionManager$detectNewSession$1$1> dVar) {
        super(2, dVar);
        this.this$0 = appSessionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AppSessionManager$detectNewSession$1$1(this.this$0, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba A[PHI: r1
      0x00ba: PHI (r1v5 com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent$Attributes) = 
      (r1v4 com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent$Attributes)
      (r1v4 com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent$Attributes)
      (r1v9 com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent$Attributes)
     binds: [B:24:0x009d, B:26:0x00b6, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        if (com.superwall.sdk.analytics.internal.TrackingKt.track(r11, r1, r10) == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.analytics.session.AppSessionManager$detectNewSession$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((AppSessionManager$detectNewSession$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
