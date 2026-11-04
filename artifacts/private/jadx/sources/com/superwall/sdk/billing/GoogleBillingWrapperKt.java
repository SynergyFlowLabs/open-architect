package com.superwall.sdk.billing;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c0;
import com.android.billingclient.api.g0;
import com.superwall.sdk.delegate.InternalPurchaseResult;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGoogleBillingWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleBillingWrapper.kt\ncom/superwall/sdk/billing/GoogleBillingWrapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,679:1\n1557#2:680\n1628#2,3:681\n*S KotlinDebug\n*F\n+ 1 GoogleBillingWrapper.kt\ncom/superwall/sdk/billing/GoogleBillingWrapperKt\n*L\n645#1:680\n645#1:681,3\n*E\n"})
public final class GoogleBillingWrapperKt {
    public static final long RECONNECT_TIMER_MAX_TIME_MILLISECONDS = 16000;
    public static final long RECONNECT_TIMER_START_MILLISECONDS = 1000;

    @Nullable
    public static final Object queryType(@NotNull com.android.billingclient.api.h hVar, @NotNull String str, @NotNull kotlin.coroutines.d<? super List<? extends Purchase>> dVar) {
        final x xVarC = z.c(null, 1, null);
        g0 g0VarA = g0.a().b(str).a();
        Intrinsics.checkNotNullExpressionValue(g0VarA, "build(...)");
        hVar.q(g0VarA, new c0() { // from class: com.superwall.sdk.billing.k
            @Override // com.android.billingclient.api.c0
            public final void onQueryPurchasesResponse(com.android.billingclient.api.n nVar, List list) {
                GoogleBillingWrapperKt.queryType$lambda$1(xVarC, nVar, list);
            }
        });
        return xVarC.q(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryType$lambda$1(x xVar, com.android.billingclient.api.n billingResult, List purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        if (billingResult.b() == 0) {
            xVar.R(purchasesList);
        } else {
            int i10 = 7 ^ 0;
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.nativePurchaseController, "Unable to query for purchases.", null, null, 24, null);
        }
    }

    @NotNull
    public static final List<InternalPurchaseResult> toInternalResult(@NotNull Pair<com.android.billingclient.api.n, ? extends List<? extends Purchase>> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        com.android.billingclient.api.n nVarComponent1 = pair.component1();
        List<? extends Purchase> listComponent2 = pair.component2();
        if (nVarComponent1.b() != 0 || listComponent2 == null) {
            return nVarComponent1.b() == 1 ? CollectionsKt.listOf(InternalPurchaseResult.Cancelled.INSTANCE) : CollectionsKt.listOf(new InternalPurchaseResult.Failed(new Exception(String.valueOf(nVarComponent1.b()))));
        }
        List<? extends Purchase> list = listComponent2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new InternalPurchaseResult.Purchased((Purchase) it.next()));
        }
        return arrayList;
    }
}
