package com.superwall.sdk.analytics.internal;

import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.analytics.internal.TrackingLogic$Companion$processParameters$2", f = "TrackingLogic.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nTrackingLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackingLogic.kt\ncom/superwall/sdk/analytics/internal/TrackingLogic$Companion$processParameters$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,239:1\n216#2,2:240\n216#2,2:242\n*S KotlinDebug\n*F\n+ 1 TrackingLogic.kt\ncom/superwall/sdk/analytics/internal/TrackingLogic$Companion$processParameters$2\n*L\n61#1:240,2\n72#1:242,2\n*E\n"})
final class TrackingLogic$Companion$processParameters$2 extends o implements Function2<s0, d<? super TrackingParameters>, Object> {
    final /* synthetic */ String $appSessionId;
    final /* synthetic */ Trackable $trackableEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingLogic$Companion$processParameters$2(Trackable trackable, String str, d<? super TrackingLogic$Companion$processParameters$2> dVar) {
        super(2, dVar);
        this.$trackableEvent = trackable;
        this.$appSessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TrackingLogic$Companion$processParameters$2(this.$trackableEvent, this.$appSessionId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Trackable trackable = this.$trackableEvent;
            this.label = 1;
            obj = trackable.getSuperwallParameters(this);
            if (obj == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        Map mutableMap = MapsKt.toMutableMap((Map) obj);
        mutableMap.put("app_session_id", this.$appSessionId);
        Map<String, Object> audienceFilterParams = this.$trackableEvent.getAudienceFilterParams();
        String rawName = this.$trackableEvent.getRawName();
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("is_superwall", kotlin.coroutines.jvm.internal.b.a(true)));
        Map mapMutableMapOf2 = MapsKt.mutableMapOf(TuplesKt.to("$is_standard_event", kotlin.coroutines.jvm.internal.b.a(this.$trackableEvent instanceof TrackableSuperwallEvent)), TuplesKt.to("$event_name", rawName), TuplesKt.to("event_name", rawName));
        for (Map.Entry entry : mutableMap.entrySet()) {
            String str = (String) entry.getKey();
            Object objClean = TrackingLogic.Companion.clean(entry.getValue());
            if (objClean != null) {
                mapMutableMapOf2.put("$" + str, objClean);
                mapMutableMapOf.put(str, objClean);
            }
        }
        for (Map.Entry<String, Object> entry2 : audienceFilterParams.entrySet()) {
            String key = entry2.getKey();
            Object objClean2 = TrackingLogic.Companion.clean(entry2.getValue());
            if (objClean2 != null && !StringsKt.u2(key, "$", false, 2, null)) {
                mapMutableMapOf.put(key, objClean2);
                mapMutableMapOf2.put(key, objClean2);
            }
        }
        return new TrackingParameters(mapMutableMapOf, mapMutableMapOf2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super TrackingParameters> dVar) {
        return ((TrackingLogic$Companion$processParameters$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
