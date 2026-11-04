package com.devtodev.analytics.internal.network.request.platform;

import com.planner5d.library.model.payments.a;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlBuilder implements IUrlBuilder {

    @NotNull
    private String host;

    @NotNull
    private String path;

    @NotNull
    private Map<String, String> queryParameter;

    public UrlBuilder(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.path = "";
        this.queryParameter = new LinkedHashMap();
    }

    private final String buildFullPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.host);
        sb2.append(this.path);
        if (!this.queryParameter.isEmpty()) {
            sb2.append(a.f222474i);
        }
        boolean z10 = false;
        for (String str : this.queryParameter.keySet()) {
            String str2 = this.queryParameter.get(str);
            if (str2 != null) {
                if (z10) {
                    sb2.append("&");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append(str2);
                if (!z10) {
                    z10 = true;
                }
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullPath.toString()");
        return string;
    }

    @Override // com.devtodev.analytics.internal.network.request.platform.IUrlBuilder
    public void appendSegment(@NotNull String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.host = this.host + "/" + segment;
    }

    @Override // com.devtodev.analytics.internal.network.request.platform.IUrl
    @NotNull
    public URL getUrl() throws MalformedURLException {
        URL url = new URI(buildFullPath()).toURL();
        Intrinsics.checkNotNullExpressionValue(url, "uri.toURL()");
        return url;
    }

    @Override // com.devtodev.analytics.internal.network.request.platform.IUrlBuilder
    public void setQueryParam(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.queryParameter.put(key, value);
    }
}
