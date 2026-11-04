package com.superwall.sdk.analytics.internal;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.models.events.EventData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.analytics.internal.TrackingKt$track$2$1", f = "Tracking.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
final class TrackingKt$track$2$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ Trackable $event;
    final /* synthetic */ EventData $eventData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingKt$track$2$1(Trackable trackable, EventData eventData, d<? super TrackingKt$track$2$1> dVar) {
        super(2, dVar);
        this.$event = trackable;
        this.$eventData = eventData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TrackingKt$track$2$1(this.$event, this.$eventData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Superwall companion = Superwall.Companion.getInstance();
            Trackable trackable = this.$event;
            EventData eventData = this.$eventData;
            this.label = 1;
            if (TrackingKt.handleImplicitTrigger(companion, trackable, eventData, this) == objL) {
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
        return ((TrackingKt$track$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
