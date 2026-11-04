package com.superwall.sdk.billing;

import com.android.billingclient.api.e0;
import com.android.billingclient.api.f0;
import com.android.billingclient.api.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBillingClientParamBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientParamBuilders.kt\ncom/superwall/sdk/billing/BillingClientParamBuildersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n*S KotlinDebug\n*F\n+ 1 BillingClientParamBuilders.kt\ncom/superwall/sdk/billing/BillingClientParamBuildersKt\n*L\n28#1:41\n28#1:42,3\n*E\n"})
public final class BillingClientParamBuildersKt {
    @NotNull
    public static final e0 buildQueryProductDetailsParams(@NotNull String str, @NotNull Set<String> productIds) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Set<String> set = productIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(e0.b.a().b((String) it.next()).c(str).a());
        }
        e0 e0VarA = e0.a().b(arrayList).a();
        Intrinsics.checkNotNullExpressionValue(e0VarA, "build(...)");
        return e0VarA;
    }

    @Nullable
    public static final f0 buildQueryPurchaseHistoryParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "inapp") || Intrinsics.areEqual(str, "subs")) {
            return f0.a().b(str).a();
        }
        return null;
    }

    @Nullable
    public static final g0 buildQueryPurchasesParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "inapp") || Intrinsics.areEqual(str, "subs")) {
            return g0.a().b(str).a();
        }
        return null;
    }
}
