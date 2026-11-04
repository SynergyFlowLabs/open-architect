package com.superwall.sdk.paywall.view.webview;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class WebviewError {

    public static final class AllUrlsFailed extends WebviewError {

        @NotNull
        private final List<String> urls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllUrlsFailed(@NotNull List<String> urls) {
            super(null);
            Intrinsics.checkNotNullParameter(urls, "urls");
            this.urls = urls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AllUrlsFailed copy$default(AllUrlsFailed allUrlsFailed, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = allUrlsFailed.urls;
            }
            return allUrlsFailed.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.urls;
        }

        @NotNull
        public final AllUrlsFailed copy(@NotNull List<String> urls) {
            Intrinsics.checkNotNullParameter(urls, "urls");
            return new AllUrlsFailed(urls);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllUrlsFailed) && Intrinsics.areEqual(this.urls, ((AllUrlsFailed) obj).urls);
        }

        @NotNull
        public final List<String> getUrls() {
            return this.urls;
        }

        public int hashCode() {
            return this.urls.hashCode();
        }

        @NotNull
        public String toString() {
            return "All paywall URLs have failed to load.";
        }
    }

    public static final class MaxAttemptsReached extends WebviewError {

        @NotNull
        private final List<String> urls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxAttemptsReached(@NotNull List<String> urls) {
            super(null);
            Intrinsics.checkNotNullParameter(urls, "urls");
            this.urls = urls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MaxAttemptsReached copy$default(MaxAttemptsReached maxAttemptsReached, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = maxAttemptsReached.urls;
            }
            return maxAttemptsReached.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.urls;
        }

        @NotNull
        public final MaxAttemptsReached copy(@NotNull List<String> urls) {
            Intrinsics.checkNotNullParameter(urls, "urls");
            return new MaxAttemptsReached(urls);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MaxAttemptsReached) && Intrinsics.areEqual(this.urls, ((MaxAttemptsReached) obj).urls);
        }

        @NotNull
        public final List<String> getUrls() {
            return this.urls;
        }

        public int hashCode() {
            return this.urls.hashCode();
        }

        @NotNull
        public String toString() {
            return "The webview has attempted to load too many times.";
        }
    }

    public static final class NetworkError extends WebviewError {
        private final int code;

        @NotNull
        private final String description;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(int i10, @NotNull String description, @NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(url, "url");
            this.code = i10;
            this.description = description;
            this.url = url;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, int i10, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = networkError.code;
            }
            if ((i11 & 2) != 0) {
                str = networkError.description;
            }
            if ((i11 & 4) != 0) {
                str2 = networkError.url;
            }
            return networkError.copy(i10, str, str2);
        }

        public final int component1() {
            return this.code;
        }

        @NotNull
        public final String component2() {
            return this.description;
        }

        @NotNull
        public final String component3() {
            return this.url;
        }

        @NotNull
        public final NetworkError copy(int i10, @NotNull String description, @NotNull String url) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(url, "url");
            return new NetworkError(i10, description, url);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkError)) {
                return false;
            }
            NetworkError networkError = (NetworkError) obj;
            return this.code == networkError.code && Intrinsics.areEqual(this.description, networkError.description) && Intrinsics.areEqual(this.url, networkError.url);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.code) * 31) + this.description.hashCode()) * 31) + this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return "The network failed with error code: " + this.code + " - " + this.description + " - " + this.url + " .";
        }
    }

    public static final class NoUrls extends WebviewError {

        @NotNull
        public static final NoUrls INSTANCE = new NoUrls();

        private NoUrls() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "There were no paywall URLs provided.";
        }
    }

    public /* synthetic */ WebviewError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WebviewError() {
    }
}
