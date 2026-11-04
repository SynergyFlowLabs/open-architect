package com.superwall.sdk.network;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
public final class NetworkRequestData<Response> {

    @Nullable
    private final Components components;

    @NotNull
    private final n<Boolean, String, kotlin.coroutines.d<? super Map<String, String>>, Object> factory;
    private boolean isForDebugging;

    @NotNull
    private HttpMethod method;

    @NotNull
    private String requestId;

    @Nullable
    private final URI url;

    public enum HttpMethod {
        GET("GET"),
        POST("POST");

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        private final String method;

        HttpMethod(String str) {
            this.method = str;
        }

        @NotNull
        public static kotlin.enums.a<HttpMethod> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getMethod() {
            return this.method;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRequestData(@Nullable Components components, @Nullable URI uri, @NotNull HttpMethod method, @NotNull String requestId, boolean z10, @NotNull n<? super Boolean, ? super String, ? super kotlin.coroutines.d<? super Map<String, String>>, ? extends Object> factory) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.components = components;
        this.url = uri;
        this.method = method;
        this.requestId = requestId;
        this.isForDebugging = z10;
        this.factory = factory;
    }

    @NotNull
    public final NetworkRequestData<Response> copyWithUrl(@NotNull URI newUrl) {
        Components componentsCopy;
        Intrinsics.checkNotNullParameter(newUrl, "newUrl");
        Components components = this.components;
        if (components == null) {
            componentsCopy = null;
        } else {
            String scheme = newUrl.getScheme();
            String host = newUrl.getHost();
            String path = newUrl.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            componentsCopy = components.copy(scheme, host, path, this.components.getQueryItems(), this.components.getBodyData());
        }
        return new NetworkRequestData<>(componentsCopy, this.url == null ? null : newUrl, this.method, this.requestId, this.isForDebugging, this.factory);
    }

    @Nullable
    public final Components getComponents() {
        return this.components;
    }

    @NotNull
    public final n<Boolean, String, kotlin.coroutines.d<? super Map<String, String>>, Object> getFactory() {
        return this.factory;
    }

    @NotNull
    public final HttpMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final URI getUrl() {
        return this.url;
    }

    public final boolean isForDebugging() {
        return this.isForDebugging;
    }

    public final void setForDebugging(boolean z10) {
        this.isForDebugging = z10;
    }

    public final void setMethod(@NotNull HttpMethod httpMethod) {
        Intrinsics.checkNotNullParameter(httpMethod, "<set-?>");
        this.method = httpMethod;
    }

    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requestId = str;
    }

    public static final class Components {

        @Nullable
        private byte[] bodyData;

        @Nullable
        private final String host;

        @NotNull
        private final String path;

        @Nullable
        private List<URLQueryItem> queryItems;

        @Nullable
        private String scheme;

        public Components(@Nullable String str, @Nullable String str2, @NotNull String path, @Nullable List<URLQueryItem> list, @Nullable byte[] bArr) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.scheme = str;
            this.host = str2;
            this.path = path;
            this.queryItems = list;
            this.bodyData = bArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Components copy$default(Components components, String str, String str2, String str3, List list, byte[] bArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = components.scheme;
            }
            if ((i10 & 2) != 0) {
                str2 = components.host;
            }
            if ((i10 & 4) != 0) {
                str3 = components.path;
            }
            if ((i10 & 8) != 0) {
                list = components.queryItems;
            }
            if ((i10 & 16) != 0) {
                bArr = components.bodyData;
            }
            byte[] bArr2 = bArr;
            String str4 = str3;
            return components.copy(str, str2, str4, list, bArr2);
        }

        @Nullable
        public final String component1() {
            return this.scheme;
        }

        @Nullable
        public final String component2() {
            return this.host;
        }

        @NotNull
        public final String component3() {
            return this.path;
        }

        @Nullable
        public final List<URLQueryItem> component4() {
            return this.queryItems;
        }

        @Nullable
        public final byte[] component5() {
            return this.bodyData;
        }

        @NotNull
        public final Components copy(@Nullable String str, @Nullable String str2, @NotNull String path, @Nullable List<URLQueryItem> list, @Nullable byte[] bArr) {
            Intrinsics.checkNotNullParameter(path, "path");
            return new Components(str, str2, path, list, bArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Components)) {
                return false;
            }
            Components components = (Components) obj;
            if (Intrinsics.areEqual(this.scheme, components.scheme) && Intrinsics.areEqual(this.host, components.host) && Intrinsics.areEqual(this.path, components.path) && Intrinsics.areEqual(this.queryItems, components.queryItems) && Intrinsics.areEqual(this.bodyData, components.bodyData)) {
                return true;
            }
            return false;
        }

        @Nullable
        public final byte[] getBodyData() {
            return this.bodyData;
        }

        @Nullable
        public final String getHost() {
            return this.host;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        @Nullable
        public final List<URLQueryItem> getQueryItems() {
            return this.queryItems;
        }

        @Nullable
        public final String getScheme() {
            return this.scheme;
        }

        public int hashCode() {
            String str = this.scheme;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.host;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.path.hashCode()) * 31;
            List<URLQueryItem> list = this.queryItems;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            byte[] bArr = this.bodyData;
            return iHashCode3 + (bArr != null ? Arrays.hashCode(bArr) : 0);
        }

        public final void setBodyData(@Nullable byte[] bArr) {
            this.bodyData = bArr;
        }

        public final void setQueryItems(@Nullable List<URLQueryItem> list) {
            this.queryItems = list;
        }

        public final void setScheme(@Nullable String str) {
            this.scheme = str;
        }

        @NotNull
        public String toString() {
            return "Components(scheme=" + this.scheme + ", host=" + this.host + ", path=" + this.path + ", queryItems=" + this.queryItems + ", bodyData=" + Arrays.toString(this.bodyData) + ")";
        }

        public /* synthetic */ Components(String str, String str2, String str3, List list, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Api.scheme : str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : bArr);
        }
    }

    public /* synthetic */ NetworkRequestData(Components components, URI uri, HttpMethod httpMethod, String str, boolean z10, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : components, (i10 & 2) != 0 ? null : uri, (i10 & 4) != 0 ? HttpMethod.GET : httpMethod, (i10 & 8) != 0 ? UUID.randomUUID().toString() : str, (i10 & 16) != 0 ? false : z10, nVar);
    }
}
