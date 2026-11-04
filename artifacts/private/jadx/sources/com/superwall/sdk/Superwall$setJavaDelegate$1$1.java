package com.superwall.sdk;

import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall$setJavaDelegate$1$1", f = "Superwall.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
final class Superwall$setJavaDelegate$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ Superwall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$setJavaDelegate$1$1(Superwall superwall, d<? super Superwall$setJavaDelegate$1$1> dVar) {
        super(2, dVar);
        this.this$0 = superwall;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Superwall$setJavaDelegate$1$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Superwall superwall = this.this$0;
            InternalSuperwallEvent.ConfigAttributes configAttributesMakeConfigAttributes = superwall.getDependencyContainer$superwall_release().makeConfigAttributes();
            this.label = 1;
            if (TrackingKt.track(superwall, configAttributesMakeConfigAttributes, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((Result) obj).j();
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((Superwall$setJavaDelegate$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
