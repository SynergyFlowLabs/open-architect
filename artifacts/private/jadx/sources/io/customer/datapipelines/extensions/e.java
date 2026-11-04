package io.customer.datapipelines.extensions;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    @NotNull
    public static final Map<String, Object> a(@NotNull kh.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cVar instanceof kh.c.b) {
            linkedHashMap.put("recipient", ((kh.c.b) cVar).g());
        } else {
            if (!(cVar instanceof kh.c.a)) {
                throw new k0();
            }
            linkedHashMap.putAll(((kh.c.a) cVar).g());
        }
        linkedHashMap.put("metric", kh.b.a(cVar.e6()));
        linkedHashMap.put("deliveryId", cVar.a());
        return linkedHashMap;
    }

    @NotNull
    public static final String b(@NotNull kh.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof kh.c.b) {
            return MetricTracker.Place.PUSH;
        }
        if (cVar instanceof kh.c.a) {
            return "in-app";
        }
        throw new k0();
    }
}
