package com.superwall.sdk.paywall.request;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.TrackingResult;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallLogic {

    @NotNull
    public static final PaywallLogic INSTANCE = new PaywallLogic();

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.request.PaywallLogic$handlePaywallError$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.request.PaywallLogic$handlePaywallError$1", f = "PaywallLogic.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<Trackable, d<? super Result<? extends TrackingResult>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Trackable trackable, d<? super Result<TrackingResult>> dVar) {
            return ((AnonymousClass1) create(trackable, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objTrack;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Trackable trackable = (Trackable) this.L$0;
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                objTrack = TrackingKt.track(companion, trackable, this);
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

    private PaywallLogic() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Throwable handlePaywallError$default(PaywallLogic paywallLogic, Throwable th2, EventData eventData, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        return paywallLogic.handlePaywallError(th2, eventData, function2);
    }

    public static /* synthetic */ String requestHash$default(PaywallLogic paywallLogic, String str, EventData eventData, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            eventData = null;
        }
        return paywallLogic.requestHash(str, eventData, str2, str3);
    }

    @NotNull
    public final ProductProcessingOutcome getVariablesAndFreeTrial(@NotNull List<ProductItem> productItems, @NotNull Map<String, StoreProduct> productsByFullId, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(productItems, "productItems");
        Intrinsics.checkNotNullParameter(productsByFullId, "productsByFullId");
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = false;
        for (ProductItem productItem : productItems) {
            StoreProduct storeProduct = productsByFullId.get(productItem.getFullProductId());
            if (storeProduct != null) {
                arrayList.add(new ProductVariable(productItem.getName(), storeProduct.getAttributes()));
                if (!zBooleanValue) {
                    zBooleanValue = storeProduct.getHasFreeTrial();
                }
            }
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new ProductProcessingOutcome(arrayList, zBooleanValue);
    }

    @NotNull
    public final Throwable handlePaywallError(@NotNull Throwable error, @Nullable EventData eventData, @Nullable Function2<? super Trackable, ? super d<? super Result<TrackingResult>>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (function2 == null) {
            new AnonymousClass1(null);
        }
        return new Exception("Not Found");
    }

    @NotNull
    public final String requestHash(@Nullable String str, @Nullable EventData eventData, @NotNull String locale, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (str == null) {
            str = eventData != null ? eventData.getName() : null;
            if (str == null) {
                str = "$called_manually";
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        return str + "_" + locale + "_" + ((Object) str2);
    }
}
