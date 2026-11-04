package com.planner5d.library.model.manager.payments;

import com.planner5d.library.model.payments.Payment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPaymentsWithOrders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsWithOrders.kt\ncom/planner5d/library/model/manager/payments/PaymentsWithOrders\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,36:1\n1863#2,2:37\n216#3,2:39\n*S KotlinDebug\n*F\n+ 1 PaymentsWithOrders.kt\ncom/planner5d/library/model/manager/payments/PaymentsWithOrders\n*L\n13#1:37,2\n26#1:39,2\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Payment, com.planner5d.library.model.payments.a> f192999a = new LinkedHashMap();

    public t(@Nullable List<Payment> list) {
        if (list != null) {
            for (Payment payment : list) {
                try {
                    this.f192999a.put(payment, payment.s());
                } catch (JSONException e10) {
                    timber.log.b.f381052a.e(e10);
                }
            }
        }
    }

    public final boolean a(@Nullable com.planner5d.library.model.payments.a aVar) {
        return this.f192999a.containsValue(aVar);
    }

    @Nullable
    public final Payment b(@Nullable com.planner5d.library.model.payments.a aVar) {
        if (aVar == null) {
            return null;
        }
        for (Map.Entry<Payment, com.planner5d.library.model.payments.a> entry : this.f192999a.entrySet()) {
            Payment key = entry.getKey();
            if (Intrinsics.areEqual(aVar, entry.getValue())) {
                return key;
            }
        }
        return null;
    }
}
