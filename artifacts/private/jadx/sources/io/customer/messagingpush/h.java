package io.customer.messagingpush;

import androidx.core.app.w;
import java.util.Locale;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPushDeliveryTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushDeliveryTracker.kt\nio/customer/messagingpush/PushDeliveryTrackerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class h implements f {
    private final io.customer.messagingpush.network.a c() {
        return zg.c.g(eh.d.f274883c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, Result result) {
        Object objJ = result.j();
        if (Result.h(objJ)) {
            Result.a aVar = Result.Companion;
            objJ = Unit.f312394a;
        }
        Object objM785constructorimpl = Result.m785constructorimpl(objJ);
        if (function1 != null) {
            function1.invoke(Result.a(objM785constructorimpl));
        }
        return Unit.f312394a;
    }

    @Override // io.customer.messagingpush.f
    public void a(@NotNull String token, @NotNull String event, @NotNull String deliveryId, @Nullable final Function1<? super Result<Unit>, Unit> function1) throws JSONException {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("recipient", token);
        String lowerCase = event.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject.put("metric", lowerCase);
        jSONObject.put("deliveryId", deliveryId);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("anonymousId", deliveryId);
        jSONObject2.put("properties", jSONObject);
        jSONObject2.put(w.I0, mh.a.f332665d);
        c().a(new io.customer.messagingpush.network.c("/track", MapsKt.mapOf(TuplesKt.to("Content-Type", "application/json; charset=utf-8")), jSONObject2.toString()), new Function1() { // from class: io.customer.messagingpush.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.d(function1, (Result) obj);
            }
        });
    }
}
