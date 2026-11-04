package com.superwall.sdk.deeplinks;

import android.net.Uri;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.deeplinks.DeepLinkRouter$handleDeepLink$1$1", f = "DeepLinkRouter.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
final class DeepLinkRouter$handleDeepLink$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ DeepLinkRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkRouter$handleDeepLink$1$1(DeepLinkRouter deepLinkRouter, Uri uri, d<? super DeepLinkRouter$handleDeepLink$1$1> dVar) {
        super(2, dVar);
        this.this$0 = deepLinkRouter;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeepLinkRouter$handleDeepLink$1$1(this.this$0, this.$uri, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Function2<TrackableSuperwallEvent, d<? super Unit>, Object> track = this.this$0.getTrack();
            int i11 = 3 & 2;
            InternalSuperwallEvent.DeepLink deepLink = new InternalSuperwallEvent.DeepLink(this.$uri, null, 2, null);
            this.label = 1;
            if (track.invoke(deepLink, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((DeepLinkRouter$handleDeepLink$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
