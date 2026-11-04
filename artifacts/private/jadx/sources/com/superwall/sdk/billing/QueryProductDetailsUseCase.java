package com.superwall.sdk.billing;

import com.android.billingclient.api.a0;
import com.android.billingclient.api.e0;
import com.android.billingclient.api.z;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.store.abstractions.product.RawStoreProduct;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nQueryProductDetailsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryProductDetailsUseCase.kt\ncom/superwall/sdk/billing/QueryProductDetailsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n774#2:107\n865#2,2:108\n1863#2,2:111\n1368#2:113\n1454#2,2:114\n1557#2:116\n1628#2,3:117\n1456#2,3:120\n1#3:110\n*S KotlinDebug\n*F\n+ 1 QueryProductDetailsUseCase.kt\ncom/superwall/sdk/billing/QueryProductDetailsUseCase\n*L\n39#1:107\n39#1:108,2\n65#1:111,2\n71#1:113\n71#1:114,2\n72#1:116\n72#1:117,3\n71#1:120,3\n*E\n"})
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends z>> {

    @NotNull
    private final Function1<BillingError, Unit> onError;

    @NotNull
    private final Function1<List<StoreProduct>, Unit> onReceive;

    @NotNull
    private final QueryProductDetailsUseCaseParams useCaseParams;

    @NotNull
    private final Function1<Function1<? super com.android.billingclient.api.h, Unit>, Unit> withConnectedClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryProductDetailsUseCase(@NotNull QueryProductDetailsUseCaseParams useCaseParams, @NotNull Function1<? super List<StoreProduct>, Unit> onReceive, @NotNull Function1<? super BillingError, Unit> onError, @NotNull Function1<? super Function1<? super com.android.billingclient.api.h, Unit>, Unit> withConnectedClient, @NotNull Function2<? super Long, ? super Function1<? super BillingError, Unit>, Unit> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        Intrinsics.checkNotNullParameter(useCaseParams, "useCaseParams");
        Intrinsics.checkNotNullParameter(onReceive, "onReceive");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(withConnectedClient, "withConnectedClient");
        Intrinsics.checkNotNullParameter(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executeAsync$lambda$1(final QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, com.android.billingclient.api.h withConnectedClient) {
        Intrinsics.checkNotNullParameter(withConnectedClient, "$this$withConnectedClient");
        queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(withConnectedClient, BillingClientParamBuildersKt.buildQueryProductDetailsParams(queryProductDetailsUseCase.useCaseParams.getProductType(), set), new a0() { // from class: com.superwall.sdk.billing.m
            @Override // com.android.billingclient.api.a0
            public final void onProductDetailsResponse(com.android.billingclient.api.n nVar, List list) {
                BillingClientUseCase.processResult$default(this.f267387a, nVar, list, null, null, 12, null);
            }
        });
        return Unit.f312394a;
    }

    private final void log(String str) {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.productsManager, str, null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onOk$lambda$2(z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final synchronized void queryProductDetailsAsyncEnsuringOneResponse(com.android.billingclient.api.h hVar, e0 e0Var, final a0 a0Var) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        hVar.n(e0Var, new a0() { // from class: com.superwall.sdk.billing.n
            @Override // com.android.billingclient.api.a0
            public final void onProductDetailsResponse(com.android.billingclient.api.n nVar, List list) {
                QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$7(atomicBoolean, this, a0Var, nVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$7(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, a0 a0Var, com.android.billingclient.api.n billingResult, List productDetailsList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        if (!atomicBoolean.getAndSet(true)) {
            a0Var.onProductDetailsResponse(billingResult, productDetailsList);
            return;
        }
        queryProductDetailsUseCase.log("BillingClient queryProductDetails has returned more than once, with result " + billingResult.b());
    }

    @Override // com.superwall.sdk.billing.BillingClientUseCase
    public void executeAsync() {
        Set<String> subscriptionIds = this.useCaseParams.getSubscriptionIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : subscriptionIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        final Set set = CollectionsKt.toSet(arrayList);
        if (!set.isEmpty()) {
            this.withConnectedClient.invoke(new Function1() { // from class: com.superwall.sdk.billing.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return QueryProductDetailsUseCase.executeAsync$lambda$1(this.f267385a, set, (com.android.billingclient.api.h) obj2);
                }
            });
        } else {
            log("productId list is empty, skipping queryProductDetailsAsync call");
            this.onReceive.invoke(CollectionsKt.emptyList());
        }
    }

    @NotNull
    public final Function1<BillingError, Unit> getOnError() {
        return this.onError;
    }

    @NotNull
    public final Function1<List<StoreProduct>, Unit> getOnReceive() {
        return this.onReceive;
    }

    @NotNull
    public final Function1<Function1<? super com.android.billingclient.api.h, Unit>, Unit> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.superwall.sdk.billing.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends z> list) {
        onOk2((List<z>) list);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(@NotNull List<z> received) {
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(received, "received");
        log("Products request finished for " + CollectionsKt.joinToString$default(this.useCaseParams.getSubscriptionIds(), null, null, null, 0, null, null, 63, null));
        log("Retrieved productDetailsList: " + CollectionsKt.joinToString$default(received, null, null, null, 0, null, new Function1() { // from class: com.superwall.sdk.billing.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueryProductDetailsUseCase.onOk$lambda$2((z) obj);
            }
        }, 31, null));
        List<z> list = !received.isEmpty() ? received : null;
        if (list != null) {
            for (z zVar : list) {
                log(zVar.d() + " - " + zVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (z zVar2 : received) {
            List<DecomposedProductIds> list2 = this.useCaseParams.getDecomposedProductIdsBySubscriptionId().get(zVar2.d());
            if (list2 != null) {
                List<DecomposedProductIds> list3 = list2;
                collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (DecomposedProductIds decomposedProductIds : list3) {
                    String fullId = decomposedProductIds.getFullId();
                    if (fullId == null) {
                        fullId = "";
                    }
                    collectionEmptyList.add(new StoreProduct(new RawStoreProduct(zVar2, fullId, decomposedProductIds.getBasePlanId(), decomposedProductIds.getOfferType())));
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, collectionEmptyList);
        }
        this.onReceive.invoke(arrayList);
    }
}
