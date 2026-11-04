package io.ktor.http;

import com.superwall.sdk.network.Api;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nURLUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLUtilsJvm.kt\nio/ktor/http/URLUtilsJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class u2 {
    @NotNull
    public static final Url a(@NotNull URI uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z10 = false;
        return b(new k2(null, null, 0, null, null, null, null, null, false, 511, null), uri).b();
    }

    @NotNull
    public static final k2 b(@NotNull k2 k2Var, @NotNull URI uri) {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String scheme = uri.getScheme();
        if (scheme != null) {
            k2Var.C(s2.f296093c.a(scheme));
            k2Var.B(k2Var.o().k());
        }
        if (uri.getPort() > 0) {
            k2Var.B(uri.getPort());
        } else {
            String scheme2 = uri.getScheme();
            if (Intrinsics.areEqual(scheme2, "http")) {
                k2Var.B(80);
            } else if (Intrinsics.areEqual(scheme2, Api.scheme)) {
                k2Var.B(443);
            }
        }
        if (uri.getRawUserInfo() != null) {
            String rawUserInfo = uri.getRawUserInfo();
            Intrinsics.checkNotNullExpressionValue(rawUserInfo, "getRawUserInfo(...)");
            if (rawUserInfo.length() > 0) {
                String rawUserInfo2 = uri.getRawUserInfo();
                Intrinsics.checkNotNullExpressionValue(rawUserInfo2, "getRawUserInfo(...)");
                int i10 = 3 >> 0;
                List listSplit$default = StringsKt.split$default(rawUserInfo2, new String[]{":"}, false, 0, 6, null);
                k2Var.w((String) CollectionsKt.first(listSplit$default));
                k2Var.u((String) CollectionsKt.getOrNull(listSplit$default, 1));
            }
        }
        String host = uri.getHost();
        if (host != null) {
            k2Var.y(host);
        }
        String rawPath = uri.getRawPath();
        Intrinsics.checkNotNullExpressionValue(rawPath, "getRawPath(...)");
        n2.y(k2Var, rawPath);
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            y1 y1VarB = b2.b(0, 1, null);
            y1VarB.j(d2.d(rawQuery, 0, 0, false, 6, null));
            k2Var.t(y1VarB);
        }
        String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            k2Var.E(true);
        }
        String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            k2Var.s(rawFragment);
        }
        return k2Var;
    }

    @NotNull
    public static final k2 c(@NotNull k2 k2Var, @NotNull URL url) throws URISyntaxException {
        Intrinsics.checkNotNullParameter(k2Var, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        String host = url.getHost();
        Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
        if (StringsKt.U2(host, '_', false, 2, null)) {
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return r2.m(k2Var, string);
        }
        URI uri = url.toURI();
        Intrinsics.checkNotNullExpressionValue(uri, "toURI(...)");
        return b(k2Var, uri);
    }

    @NotNull
    public static final URI d(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return new URI(url.toString());
    }
}
