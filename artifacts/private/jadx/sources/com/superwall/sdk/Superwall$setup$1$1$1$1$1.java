package com.superwall.sdk;

import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.TrackingResult;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall$setup$1$1$1$1$1", f = "Superwall.kt", i = {}, l = {com.rabbitmq.client.a.f264854y}, m = "invokeSuspend", n = {}, s = {})
final class Superwall$setup$1$1$1$1$1 extends o implements Function2<Trackable, d<? super Result<? extends TrackingResult>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Superwall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$setup$1$1$1$1$1(Superwall superwall, d<? super Superwall$setup$1$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = superwall;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        Superwall$setup$1$1$1$1$1 superwall$setup$1$1$1$1$1 = new Superwall$setup$1$1$1$1$1(this.this$0, dVar);
        superwall$setup$1$1$1$1$1.L$0 = obj;
        return superwall$setup$1$1$1$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Trackable trackable, d<? super Result<TrackingResult>> dVar) {
        return ((Superwall$setup$1$1$1$1$1) create(trackable, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objTrack;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Trackable trackable = (Trackable) this.L$0;
            Superwall superwall = this.this$0;
            this.label = 1;
            objTrack = TrackingKt.track(superwall, trackable, this);
            if (objTrack == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            objTrack = ((Result) obj).j();
        }
        return Result.a(objTrack);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Trackable trackable, d<? super Result<? extends TrackingResult>> dVar) {
        return invoke2(trackable, (d<? super Result<TrackingResult>>) dVar);
    }
}
