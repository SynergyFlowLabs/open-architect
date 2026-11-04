package com.superwall.sdk.paywall.view.webview;

import android.net.Uri;
import java.net.URI;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PaywallMessage {

    public static final class Close extends PaywallMessage {

        @NotNull
        public static final Close INSTANCE = new Close();

        private Close() {
            super(null);
        }
    }

    public static final class Custom extends PaywallMessage {

        @NotNull
        private final String data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(@NotNull String data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = custom.data;
            }
            return custom.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.data;
        }

        @NotNull
        public final Custom copy(@NotNull String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Custom(data);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && Intrinsics.areEqual(this.data, ((Custom) obj).data);
        }

        @NotNull
        public final String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "Custom(data=" + this.data + ")";
        }
    }

    public static final class CustomPlacement extends PaywallMessage {

        @NotNull
        private final String name;

        @NotNull
        private final JSONObject params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPlacement(@NotNull String name, @NotNull JSONObject params) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(params, "params");
            this.name = name;
            this.params = params;
        }

        public static /* synthetic */ CustomPlacement copy$default(CustomPlacement customPlacement, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = customPlacement.name;
            }
            if ((i10 & 2) != 0) {
                jSONObject = customPlacement.params;
            }
            return customPlacement.copy(str, jSONObject);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final JSONObject component2() {
            return this.params;
        }

        @NotNull
        public final CustomPlacement copy(@NotNull String name, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(params, "params");
            return new CustomPlacement(name, params);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomPlacement)) {
                return false;
            }
            CustomPlacement customPlacement = (CustomPlacement) obj;
            return Intrinsics.areEqual(this.name, customPlacement.name) && Intrinsics.areEqual(this.params, customPlacement.params);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final JSONObject getParams() {
            return this.params;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "CustomPlacement(name=" + this.name + ", params=" + this.params + ")";
        }
    }

    public static final class OnReady extends PaywallMessage {

        @NotNull
        private final String paywallJsVersion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnReady(@NotNull String paywallJsVersion) {
            super(null);
            Intrinsics.checkNotNullParameter(paywallJsVersion, "paywallJsVersion");
            this.paywallJsVersion = paywallJsVersion;
        }

        public static /* synthetic */ OnReady copy$default(OnReady onReady, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = onReady.paywallJsVersion;
            }
            return onReady.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.paywallJsVersion;
        }

        @NotNull
        public final OnReady copy(@NotNull String paywallJsVersion) {
            Intrinsics.checkNotNullParameter(paywallJsVersion, "paywallJsVersion");
            return new OnReady(paywallJsVersion);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnReady) && Intrinsics.areEqual(this.paywallJsVersion, ((OnReady) obj).paywallJsVersion);
        }

        @NotNull
        public final String getPaywallJsVersion() {
            return this.paywallJsVersion;
        }

        public int hashCode() {
            return this.paywallJsVersion.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnReady(paywallJsVersion=" + this.paywallJsVersion + ")";
        }
    }

    public static final class OpenDeepLink extends PaywallMessage {

        @NotNull
        private final Uri url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenDeepLink(@NotNull Uri url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenDeepLink copy$default(OpenDeepLink openDeepLink, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = openDeepLink.url;
            }
            return openDeepLink.copy(uri);
        }

        @NotNull
        public final Uri component1() {
            return this.url;
        }

        @NotNull
        public final OpenDeepLink copy(@NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenDeepLink(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && Intrinsics.areEqual(this.url, ((OpenDeepLink) obj).url);
        }

        @NotNull
        public final Uri getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "OpenDeepLink(url=" + this.url + ")";
        }
    }

    public static final class OpenUrl extends PaywallMessage {

        @NotNull
        private final URI url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(@NotNull URI url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, URI uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = openUrl.url;
            }
            return openUrl.copy(uri);
        }

        @NotNull
        public final URI component1() {
            return this.url;
        }

        @NotNull
        public final OpenUrl copy(@NotNull URI url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenUrl(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        @NotNull
        public final URI getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "OpenUrl(url=" + this.url + ")";
        }
    }

    public static final class OpenUrlInBrowser extends PaywallMessage {

        @NotNull
        private final URI url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlInBrowser(@NotNull URI url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenUrlInBrowser copy$default(OpenUrlInBrowser openUrlInBrowser, URI uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = openUrlInBrowser.url;
            }
            return openUrlInBrowser.copy(uri);
        }

        @NotNull
        public final URI component1() {
            return this.url;
        }

        @NotNull
        public final OpenUrlInBrowser copy(@NotNull URI url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenUrlInBrowser(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrlInBrowser) && Intrinsics.areEqual(this.url, ((OpenUrlInBrowser) obj).url);
        }

        @NotNull
        public final URI getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "OpenUrlInBrowser(url=" + this.url + ")";
        }
    }

    public static final class PaywallClose extends PaywallMessage {

        @NotNull
        public static final PaywallClose INSTANCE = new PaywallClose();

        private PaywallClose() {
            super(null);
        }
    }

    public static final class PaywallOpen extends PaywallMessage {

        @NotNull
        public static final PaywallOpen INSTANCE = new PaywallOpen();

        private PaywallOpen() {
            super(null);
        }
    }

    public static final class Purchase extends PaywallMessage {

        @NotNull
        private final String product;

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Purchase(@NotNull String product, @NotNull String productId) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.product = product;
            this.productId = productId;
        }

        public static /* synthetic */ Purchase copy$default(Purchase purchase, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = purchase.product;
            }
            if ((i10 & 2) != 0) {
                str2 = purchase.productId;
            }
            return purchase.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.product;
        }

        @NotNull
        public final String component2() {
            return this.productId;
        }

        @NotNull
        public final Purchase copy(@NotNull String product, @NotNull String productId) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new Purchase(product, productId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Purchase)) {
                return false;
            }
            Purchase purchase = (Purchase) obj;
            return Intrinsics.areEqual(this.product, purchase.product) && Intrinsics.areEqual(this.productId, purchase.productId);
        }

        @NotNull
        public final String getProduct() {
            return this.product;
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + this.productId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Purchase(product=" + this.product + ", productId=" + this.productId + ")";
        }
    }

    public static final class Restore extends PaywallMessage {

        @NotNull
        public static final Restore INSTANCE = new Restore();

        private Restore() {
            super(null);
        }
    }

    public static final class RestoreFailed extends PaywallMessage {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RestoreFailed(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public static /* synthetic */ RestoreFailed copy$default(RestoreFailed restoreFailed, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = restoreFailed.message;
            }
            return restoreFailed.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final RestoreFailed copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new RestoreFailed(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestoreFailed) && Intrinsics.areEqual(this.message, ((RestoreFailed) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "RestoreFailed(message=" + this.message + ")";
        }
    }

    public static final class TemplateParamsAndUserAttributes extends PaywallMessage {

        @NotNull
        public static final TemplateParamsAndUserAttributes INSTANCE = new TemplateParamsAndUserAttributes();

        private TemplateParamsAndUserAttributes() {
            super(null);
        }
    }

    public /* synthetic */ PaywallMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaywallMessage() {
    }
}
