package com.superwall.sdk.paywall.view.webview;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class WebviewClientEvent {

    public static final class LoadingFallback extends WebviewClientEvent {

        @NotNull
        public static final LoadingFallback INSTANCE = new LoadingFallback();

        private LoadingFallback() {
            super(null);
        }
    }

    public static final class OnError extends WebviewClientEvent {

        @NotNull
        private final WebviewError webviewError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnError(@NotNull WebviewError webviewError) {
            super(null);
            Intrinsics.checkNotNullParameter(webviewError, "webviewError");
            this.webviewError = webviewError;
        }

        public static /* synthetic */ OnError copy$default(OnError onError, WebviewError webviewError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webviewError = onError.webviewError;
            }
            return onError.copy(webviewError);
        }

        @NotNull
        public final WebviewError component1() {
            return this.webviewError;
        }

        @NotNull
        public final OnError copy(@NotNull WebviewError webviewError) {
            Intrinsics.checkNotNullParameter(webviewError, "webviewError");
            return new OnError(webviewError);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnError) && Intrinsics.areEqual(this.webviewError, ((OnError) obj).webviewError);
        }

        @NotNull
        public final WebviewError getWebviewError() {
            return this.webviewError;
        }

        public int hashCode() {
            return this.webviewError.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnError(webviewError=" + this.webviewError + ")";
        }
    }

    public static final class OnPageFinished extends WebviewClientEvent {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPageFinished(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OnPageFinished copy$default(OnPageFinished onPageFinished, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = onPageFinished.url;
            }
            return onPageFinished.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final OnPageFinished copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OnPageFinished(url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPageFinished) && Intrinsics.areEqual(this.url, ((OnPageFinished) obj).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnPageFinished(url=" + this.url + ")";
        }
    }

    public static final class OnResourceError extends WebviewClientEvent {

        @NotNull
        private final WebviewError webviewError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnResourceError(@NotNull WebviewError webviewError) {
            super(null);
            Intrinsics.checkNotNullParameter(webviewError, "webviewError");
            this.webviewError = webviewError;
        }

        public static /* synthetic */ OnResourceError copy$default(OnResourceError onResourceError, WebviewError webviewError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                webviewError = onResourceError.webviewError;
            }
            return onResourceError.copy(webviewError);
        }

        @NotNull
        public final WebviewError component1() {
            return this.webviewError;
        }

        @NotNull
        public final OnResourceError copy(@NotNull WebviewError webviewError) {
            Intrinsics.checkNotNullParameter(webviewError, "webviewError");
            return new OnResourceError(webviewError);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnResourceError) && Intrinsics.areEqual(this.webviewError, ((OnResourceError) obj).webviewError);
        }

        @NotNull
        public final WebviewError getWebviewError() {
            return this.webviewError;
        }

        public int hashCode() {
            return this.webviewError.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnResourceError(webviewError=" + this.webviewError + ")";
        }
    }

    public /* synthetic */ WebviewClientEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WebviewClientEvent() {
    }
}
