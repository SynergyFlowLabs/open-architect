package com.superwall.sdk.paywall.view.webview.messaging;

import android.net.Uri;
import cj.h;
import java.lang.annotation.Annotation;
import java.net.URI;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@b0
public abstract class PaywallWebEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: com.superwall.sdk.paywall.view.webview.messaging.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaywallWebEvent._init_$_anonymous_();
        }
    });

    public static final class Closed extends PaywallWebEvent {

        @NotNull
        public static final Closed INSTANCE = new Closed();

        private Closed() {
            super(null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PaywallWebEvent.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<PaywallWebEvent> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @a0(h.L)
    public static final class Custom extends PaywallWebEvent {

        @NotNull
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(@NotNull String string) {
            super(null);
            Intrinsics.checkNotNullParameter(string, "string");
            this.string = string;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = custom.string;
            }
            return custom.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.string;
        }

        @NotNull
        public final Custom copy(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return new Custom(string);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && Intrinsics.areEqual(this.string, ((Custom) obj).string);
        }

        @NotNull
        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        @NotNull
        public String toString() {
            return "Custom(string=" + this.string + ")";
        }
    }

    @a0("custom_placement")
    public static final class CustomPlacement extends PaywallWebEvent {

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

    @a0("initiate_purchase")
    public static final class InitiatePurchase extends PaywallWebEvent {

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiatePurchase(@NotNull String productId) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
        }

        public static /* synthetic */ InitiatePurchase copy$default(InitiatePurchase initiatePurchase, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initiatePurchase.productId;
            }
            return initiatePurchase.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.productId;
        }

        @NotNull
        public final InitiatePurchase copy(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new InitiatePurchase(productId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatePurchase) && Intrinsics.areEqual(this.productId, ((InitiatePurchase) obj).productId);
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productId.hashCode();
        }

        @NotNull
        public String toString() {
            return "InitiatePurchase(productId=" + this.productId + ")";
        }
    }

    public static final class InitiateRestore extends PaywallWebEvent {

        @NotNull
        public static final InitiateRestore INSTANCE = new InitiateRestore();

        private InitiateRestore() {
            super(null);
        }
    }

    @a0("opened_deep_link")
    public static final class OpenedDeepLink extends PaywallWebEvent {

        @NotNull
        private final Uri url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenedDeepLink(@NotNull Uri url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenedDeepLink copy$default(OpenedDeepLink openedDeepLink, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = openedDeepLink.url;
            }
            return openedDeepLink.copy(uri);
        }

        @NotNull
        public final Uri component1() {
            return this.url;
        }

        @NotNull
        public final OpenedDeepLink copy(@NotNull Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenedDeepLink(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenedDeepLink) && Intrinsics.areEqual(this.url, ((OpenedDeepLink) obj).url);
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
            return "OpenedDeepLink(url=" + this.url + ")";
        }
    }

    @a0("opened_url")
    public static final class OpenedURL extends PaywallWebEvent {

        @NotNull
        private final URI url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenedURL(@NotNull URI url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenedURL copy$default(OpenedURL openedURL, URI uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = openedURL.url;
            }
            return openedURL.copy(uri);
        }

        @NotNull
        public final URI component1() {
            return this.url;
        }

        @NotNull
        public final OpenedURL copy(@NotNull URI url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenedURL(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenedURL) && Intrinsics.areEqual(this.url, ((OpenedURL) obj).url);
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
            return "OpenedURL(url=" + this.url + ")";
        }
    }

    @a0("opened_url_in_safari")
    public static final class OpenedUrlInChrome extends PaywallWebEvent {

        @NotNull
        private final URI url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenedUrlInChrome(@NotNull URI url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OpenedUrlInChrome copy$default(OpenedUrlInChrome openedUrlInChrome, URI uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = openedUrlInChrome.url;
            }
            return openedUrlInChrome.copy(uri);
        }

        @NotNull
        public final URI component1() {
            return this.url;
        }

        @NotNull
        public final OpenedUrlInChrome copy(@NotNull URI url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenedUrlInChrome(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof OpenedUrlInChrome) && Intrinsics.areEqual(this.url, ((OpenedUrlInChrome) obj).url)) {
                return true;
            }
            return false;
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
            return "OpenedUrlInChrome(url=" + this.url + ")";
        }
    }

    public /* synthetic */ PaywallWebEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.paywall.view.webview.messaging.PaywallWebEvent", j1.d(PaywallWebEvent.class), new kotlin.reflect.d[0], new KSerializer[0], new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(PaywallWebEvent paywallWebEvent, e eVar, SerialDescriptor serialDescriptor) {
    }

    private PaywallWebEvent() {
    }

    public /* synthetic */ PaywallWebEvent(int i10, v2 v2Var) {
    }
}
