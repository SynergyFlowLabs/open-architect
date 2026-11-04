package com.superwall.sdk.billing.observer;

import android.app.Activity;
import com.android.billingclient.api.h;
import com.android.billingclient.api.n;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.store.PurchasingObserverState;
import com.superwall.sdk.store.abstractions.product.RawStoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nLaunchBillingFlowWithSuperwall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchBillingFlowWithSuperwall.kt\ncom/superwall/sdk/billing/observer/LaunchBillingFlowWithSuperwallKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1557#2:73\n1628#2,3:74\n1863#2,2:77\n*S KotlinDebug\n*F\n+ 1 LaunchBillingFlowWithSuperwall.kt\ncom/superwall/sdk/billing/observer/LaunchBillingFlowWithSuperwallKt\n*L\n57#1:73\n57#1:74,3\n64#1:77,2\n*E\n"})
public final class LaunchBillingFlowWithSuperwallKt {
    @NotNull
    public static final n launchBillingFlowWithSuperwall(@NotNull h hVar, @NotNull Activity activity, @NotNull SuperwallBillingFlowParams params) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Superwall.Companion companion = Superwall.Companion;
        if (!companion.getInitialized()) {
            throw new IllegalStateException("Superwall SDK is not initialized");
        }
        if (companion.getInstance().getOptions().getShouldObservePurchases()) {
            Iterator<T> it = params.getProductDetailsParams$superwall_release().iterator();
            while (it.hasNext()) {
                Superwall.Companion.getInstance().observe(new PurchasingObserverState.PurchaseWillBegin(RawStoreProduct.Companion.from(((SuperwallBillingFlowParams.ProductDetailsParams) it.next()).getDetails$superwall_release()).getUnderlyingProductDetails()));
            }
            n nVarL = hVar.l(activity, params.toOriginal());
            Intrinsics.checkNotNullExpressionValue(nVarL, "launchBillingFlow(...)");
            return nVarL;
        }
        Logger logger = Logger.INSTANCE;
        LogLevel logLevel = LogLevel.error;
        LogScope logScope = LogScope.superwallCore;
        Pair pair = TuplesKt.to("method", "launchBillingFlowWithSuperwall");
        List<SuperwallBillingFlowParams.ProductDetailsParams> productDetailsParams$superwall_release = params.getProductDetailsParams$superwall_release();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(productDetailsParams$superwall_release, 10));
        Iterator<T> it2 = productDetailsParams$superwall_release.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SuperwallBillingFlowParams.ProductDetailsParams) it2.next()).getDetails$superwall_release().d());
        }
        Logger.debug$default(logger, logLevel, logScope, "Observer mode is not enabled. In order to observe purchases, please enable it in the SuperwallOptions by setting `shouldObservePurchases` to true.", MapsKt.mapOf(pair, TuplesKt.to("products", CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null))), null, 16, null);
        n nVarL2 = hVar.l(activity, params.toOriginal());
        Intrinsics.checkNotNullExpressionValue(nVarL2, "launchBillingFlow(...)");
        return nVarL2;
    }
}
