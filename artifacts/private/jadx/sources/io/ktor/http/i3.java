package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i3 {
    @NotNull
    public static final String a(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return b(url) + w2.n(url);
    }

    @NotNull
    public static final String b(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        w2.j(sb2, url.s(), url.o());
        return sb2.toString();
    }

    @NotNull
    public static final String c(@NotNull Url url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(url.A().getName());
        sb2.append("://");
        sb2.append(b(url));
        if (url.E() == 0 || url.E() == url.A().k()) {
            sb2.append(url.u());
        } else {
            sb2.append(w2.m(url));
        }
        return sb2.toString();
    }
}
