package com.superwall.sdk.billing.observer;

import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.m;
import com.android.billingclient.api.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj.a;
import jj.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SuperwallBillingFlowParams {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final m params;

    @NotNull
    private final List<ProductDetailsParams> productDetailsParams;

    @SourceDebugExtension({"SMAP\nSuperwallBillingFlowParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuperwallBillingFlowParams.kt\ncom/superwall/sdk/billing/observer/SuperwallBillingFlowParams$Builder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1557#2:150\n1628#2,3:151\n*S KotlinDebug\n*F\n+ 1 SuperwallBillingFlowParams.kt\ncom/superwall/sdk/billing/observer/SuperwallBillingFlowParams$Builder\n*L\n39#1:150\n39#1:151,3\n*E\n"})
    public static final class Builder {

        @NotNull
        private final m.a builder;

        @NotNull
        private final List<ProductDetailsParams> productDetailsParams;

        public Builder() {
            m.a aVarA = m.a();
            Intrinsics.checkNotNullExpressionValue(aVarA, "newBuilder(...)");
            this.builder = aVarA;
            this.productDetailsParams = new ArrayList();
        }

        @NotNull
        public final SuperwallBillingFlowParams build() {
            m mVarA = this.builder.a();
            Intrinsics.checkNotNullExpressionValue(mVarA, "build(...)");
            return new SuperwallBillingFlowParams(mVarA, this.productDetailsParams, null);
        }

        @NotNull
        public final List<ProductDetailsParams> getProductDetailsParams$superwall_release() {
            return this.productDetailsParams;
        }

        @NotNull
        public final Builder setIsOfferPersonalized(boolean z10) {
            this.builder.b(z10);
            return this;
        }

        @NotNull
        public final Builder setObfuscatedAccountId(@NotNull String obfuscatedAccountId) {
            Intrinsics.checkNotNullParameter(obfuscatedAccountId, "obfuscatedAccountId");
            this.builder.c(obfuscatedAccountId);
            return this;
        }

        @NotNull
        public final Builder setObfuscatedProfileId(@NotNull String obfuscatedProfileId) {
            Intrinsics.checkNotNullParameter(obfuscatedProfileId, "obfuscatedProfileId");
            this.builder.d(obfuscatedProfileId);
            return this;
        }

        @NotNull
        public final Builder setProductDetailsParamsList(@NotNull List<ProductDetailsParams> productDetailsParamsList) {
            Intrinsics.checkNotNullParameter(productDetailsParamsList, "productDetailsParamsList");
            this.productDetailsParams.addAll(productDetailsParamsList);
            m.a aVar = this.builder;
            List<ProductDetailsParams> list = productDetailsParamsList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductDetailsParams) it.next()).toOriginal());
            }
            aVar.e(arrayList);
            return this;
        }

        @l(message = "Use setProductDetailsParamsList instead")
        @NotNull
        public final Builder setSkuDetails(@NotNull SkuDetails skuDetails) {
            Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
            this.builder.f(skuDetails);
            return this;
        }

        @NotNull
        public final Builder setSubscriptionUpdateParams(@NotNull SubscriptionUpdateParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.builder.g(params.toOriginal());
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public static final class ProductDetailsParams {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final z details;

        @NotNull
        private final m.b params;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ProductDetailsParamsBuilder newBuilder() {
                return new ProductDetailsParamsBuilder();
            }

            private Companion() {
            }
        }

        public static final class ProductDetailsParamsBuilder {

            @NotNull
            private final m.b.a builder;

            @Nullable
            private z details;

            public ProductDetailsParamsBuilder() {
                m.b.a aVarA = m.b.a();
                Intrinsics.checkNotNullExpressionValue(aVarA, "newBuilder(...)");
                this.builder = aVarA;
            }

            @NotNull
            public final ProductDetailsParams build() {
                z zVar = this.details;
                if (zVar == null) {
                    throw new IllegalArgumentException("ProductDetails are required");
                }
                m.b bVarA = this.builder.a();
                Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
                return new ProductDetailsParams(bVarA, zVar, null);
            }

            @Nullable
            public final z getDetails$superwall_release() {
                return this.details;
            }

            public final void setDetails$superwall_release(@Nullable z zVar) {
                this.details = zVar;
            }

            @NotNull
            public final ProductDetailsParamsBuilder setOfferToken(@NotNull String offerToken) {
                Intrinsics.checkNotNullParameter(offerToken, "offerToken");
                this.builder.b(offerToken);
                return this;
            }

            @NotNull
            public final ProductDetailsParamsBuilder setProductDetails(@NotNull z productDetails) {
                Intrinsics.checkNotNullParameter(productDetails, "productDetails");
                this.details = productDetails;
                this.builder.c(productDetails);
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(m.b bVar, z zVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, zVar);
        }

        @NotNull
        public final z getDetails$superwall_release() {
            return this.details;
        }

        @NotNull
        public final m.b toOriginal() {
            return this.params;
        }

        private ProductDetailsParams(m.b bVar, z zVar) {
            this.params = bVar;
            this.details = zVar;
        }
    }

    @l(message = "Use SubscriptionUpdateParams.ReplacementMode instead")
    @Retention(RetentionPolicy.SOURCE)
    @e(a.SOURCE)
    public @interface ProrationMode {

        @NotNull
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int DEFERRED = 4;
            public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
            public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
            public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
            public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
            public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;

            private Companion() {
            }
        }
    }

    public static final class SubscriptionUpdateParams {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final m.c params;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SubscriptionUpdateParamsBuilder newBuilder() {
                return new SubscriptionUpdateParamsBuilder();
            }

            private Companion() {
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @e(a.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;

            @NotNull
            public static final Companion Companion = Companion.$$INSTANCE;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;

            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                public static final int CHARGE_FULL_PRICE = 5;
                public static final int CHARGE_PRORATED_PRICE = 2;
                public static final int DEFERRED = 6;
                public static final int UNKNOWN_REPLACEMENT_MODE = 0;
                public static final int WITHOUT_PRORATION = 3;
                public static final int WITH_TIME_PRORATION = 1;

                private Companion() {
                }
            }
        }

        public static final class SubscriptionUpdateParamsBuilder {

            @NotNull
            private final m.c.a builder;

            public SubscriptionUpdateParamsBuilder() {
                m.c.a aVarA = m.c.a();
                Intrinsics.checkNotNullExpressionValue(aVarA, "newBuilder(...)");
                this.builder = aVarA;
            }

            @NotNull
            public final SubscriptionUpdateParams build() {
                m.c cVarA = this.builder.a();
                Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
                return new SubscriptionUpdateParams(cVarA, null);
            }

            @NotNull
            public final SubscriptionUpdateParamsBuilder setOldPurchaseToken(@NotNull String purchaseToken) {
                Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
                this.builder.b(purchaseToken);
                return this;
            }

            @NotNull
            public final SubscriptionUpdateParamsBuilder setOriginalExternalTransactionId(@NotNull String externalTransactionId) {
                Intrinsics.checkNotNullParameter(externalTransactionId, "externalTransactionId");
                this.builder.c(externalTransactionId);
                return this;
            }

            @NotNull
            public final SubscriptionUpdateParamsBuilder setSubscriptionReplacementMode(int i10) {
                this.builder.d(i10);
                return this;
            }
        }

        public /* synthetic */ SubscriptionUpdateParams(m.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar);
        }

        @NotNull
        public final m.c toOriginal() {
            return this.params;
        }

        private SubscriptionUpdateParams(m.c cVar) {
            this.params = cVar;
        }
    }

    public /* synthetic */ SuperwallBillingFlowParams(m mVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, list);
    }

    @NotNull
    public final m getParams$superwall_release() {
        return this.params;
    }

    @NotNull
    public final List<ProductDetailsParams> getProductDetailsParams$superwall_release() {
        return this.productDetailsParams;
    }

    @NotNull
    public final m toOriginal() {
        return this.params;
    }

    private SuperwallBillingFlowParams(m mVar, List<ProductDetailsParams> list) {
        this.params = mVar;
        this.productDetailsParams = list;
    }

    /* synthetic */ SuperwallBillingFlowParams(m mVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, (i10 & 2) != 0 ? new ArrayList() : list);
    }
}
