package io.ktor.client.plugins.contentnegotiation;

import io.ktor.http.m;
import io.ktor.http.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f294697a = new g();

    private g() {
    }

    @Override // io.ktor.http.n
    public boolean a(@NotNull m contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        m.a aVar = m.a.f295985a;
        if (contentType.h(aVar.k())) {
            return true;
        }
        String string = contentType.k().toString();
        return aVar.b(string) && StringsKt.L1(string, "+json", true);
    }
}
