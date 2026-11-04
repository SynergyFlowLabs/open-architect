package io.ktor.client.call;

import io.ktor.http.d1;
import io.ktor.http.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f294254a;

    public d(@NotNull io.ktor.client.statement.c response, @NotNull kotlin.reflect.d<?> from, @NotNull kotlin.reflect.d<?> to) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        Expected response body of the type '");
        sb2.append(to);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(io.ktor.client.statement.e.h(response).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(response.j());
        sb2.append("`\n        Response header `ContentType: ");
        v0 v0VarO = response.O();
        d1 d1Var = d1.f295782a;
        sb2.append(v0VarO.get(d1Var.C()));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(io.ktor.client.statement.e.h(response).O().get(d1Var.d()));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f294254a = StringsKt.p(sb2.toString());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f294254a;
    }
}
