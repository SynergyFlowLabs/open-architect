package com.superwall.sdk.paywall.presentation.internal.request;

import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
import com.superwall.sdk.models.paywall.PaywallProducts;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPaywallOverrides.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallOverrides.kt\ncom/superwall/sdk/paywall/presentation/internal/request/PaywallOverrides\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n462#2:66\n412#2:67\n1246#3,4:68\n*S KotlinDebug\n*F\n+ 1 PaywallOverrides.kt\ncom/superwall/sdk/paywall/presentation/internal/request/PaywallOverrides\n*L\n22#1:66\n22#1:67\n22#1:68,4\n*E\n"})
public final class PaywallOverrides {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean ignoreSubscriptionStatus;

    @NotNull
    private final PaywallPresentationStyle presentationStyle;

    @Nullable
    private final PaywallProducts products;

    @NotNull
    private final Map<String, StoreProduct> productsByName;

    @SourceDebugExtension({"SMAP\nPaywallOverrides.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallOverrides.kt\ncom/superwall/sdk/paywall/presentation/internal/request/PaywallOverrides$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, StoreProduct> mapFromPaywallProducts(PaywallProducts paywallProducts) {
            StoreProduct tertiary;
            StoreProduct secondary;
            StoreProduct primary;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (paywallProducts != null && (primary = paywallProducts.getPrimary()) != null) {
                linkedHashMap.put("primary", primary);
            }
            if (paywallProducts != null && (secondary = paywallProducts.getSecondary()) != null) {
                linkedHashMap.put("secondary", secondary);
            }
            if (paywallProducts != null && (tertiary = paywallProducts.getTertiary()) != null) {
                linkedHashMap.put("tertiary", tertiary);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PaywallProducts mapToPaywallProducts(Map<String, StoreProduct> map) {
            StoreProduct storeProduct = map.get("primary");
            StoreProduct storeProduct2 = map.get("secondary");
            StoreProduct storeProduct3 = map.get("tertiary");
            if (storeProduct == null && storeProduct2 == null && storeProduct3 == null) {
                return null;
            }
            return new PaywallProducts(storeProduct, storeProduct2, storeProduct3);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallOverrides() {
        this(null, false, null, 7, null);
        int i10 = 3 >> 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallOverrides copy$default(PaywallOverrides paywallOverrides, Map map, boolean z10, PaywallPresentationStyle paywallPresentationStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = paywallOverrides.productsByName;
        }
        if ((i10 & 2) != 0) {
            z10 = paywallOverrides.ignoreSubscriptionStatus;
        }
        if ((i10 & 4) != 0) {
            paywallPresentationStyle = paywallOverrides.presentationStyle;
        }
        return paywallOverrides.copy(map, z10, paywallPresentationStyle);
    }

    @l(message = "This variable has been deprecated.", replaceWith = @b1(expression = "productsByName", imports = {}))
    public static /* synthetic */ void getProducts$annotations() {
    }

    @NotNull
    public final Map<String, StoreProduct> component1() {
        return this.productsByName;
    }

    public final boolean component2() {
        return this.ignoreSubscriptionStatus;
    }

    @NotNull
    public final PaywallPresentationStyle component3() {
        return this.presentationStyle;
    }

    @NotNull
    public final PaywallOverrides copy(@NotNull Map<String, StoreProduct> productsByName, boolean z10, @NotNull PaywallPresentationStyle presentationStyle) {
        Intrinsics.checkNotNullParameter(productsByName, "productsByName");
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        return new PaywallOverrides(productsByName, z10, presentationStyle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallOverrides)) {
            return false;
        }
        PaywallOverrides paywallOverrides = (PaywallOverrides) obj;
        return Intrinsics.areEqual(this.productsByName, paywallOverrides.productsByName) && this.ignoreSubscriptionStatus == paywallOverrides.ignoreSubscriptionStatus && this.presentationStyle == paywallOverrides.presentationStyle;
    }

    public final boolean getIgnoreSubscriptionStatus() {
        return this.ignoreSubscriptionStatus;
    }

    @NotNull
    public final PaywallPresentationStyle getPresentationStyle() {
        return this.presentationStyle;
    }

    @NotNull
    public final Map<String, ProductOverride> getProductOverridesByName() {
        Map<String, StoreProduct> map = this.productsByName;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new ProductOverride.ByProduct((StoreProduct) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Nullable
    public final PaywallProducts getProducts() {
        return this.products;
    }

    @NotNull
    public final Map<String, StoreProduct> getProductsByName() {
        return this.productsByName;
    }

    public int hashCode() {
        return (((this.productsByName.hashCode() * 31) + Boolean.hashCode(this.ignoreSubscriptionStatus)) * 31) + this.presentationStyle.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaywallOverrides(productsByName=" + this.productsByName + ", ignoreSubscriptionStatus=" + this.ignoreSubscriptionStatus + ", presentationStyle=" + this.presentationStyle + ")";
    }

    public PaywallOverrides(@NotNull Map<String, StoreProduct> productsByName, boolean z10, @NotNull PaywallPresentationStyle presentationStyle) {
        Intrinsics.checkNotNullParameter(productsByName, "productsByName");
        Intrinsics.checkNotNullParameter(presentationStyle, "presentationStyle");
        this.productsByName = productsByName;
        this.ignoreSubscriptionStatus = z10;
        this.presentationStyle = presentationStyle;
        this.products = Companion.mapToPaywallProducts(productsByName);
    }

    public /* synthetic */ PaywallOverrides(Map map, boolean z10, PaywallPresentationStyle paywallPresentationStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? PaywallPresentationStyle.NONE : paywallPresentationStyle);
    }

    @l(message = "This constructor has been deprecated.", replaceWith = @b1(expression = "PaywallOverrides(productsByName)", imports = {}))
    public PaywallOverrides(@Nullable PaywallProducts paywallProducts) {
        this(Companion.mapFromPaywallProducts(paywallProducts), false, null, 6, null);
    }

    @l(message = "This constructor has been deprecated.", replaceWith = @b1(expression = "PaywallOverrides(productsByName, ignoreSubscriptionStatus)", imports = {}))
    public PaywallOverrides(@Nullable PaywallProducts paywallProducts, boolean z10) {
        this(Companion.mapFromPaywallProducts(paywallProducts), z10, null, 4, null);
    }
}
