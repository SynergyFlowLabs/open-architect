package io.ktor.client.statement;

import io.ktor.http.f1;
import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.o0;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c implements f1, s0 {
    @o0
    public static /* synthetic */ void e() {
    }

    @NotNull
    public abstract io.ktor.utils.io.h c();

    @NotNull
    public abstract GMTDate f();

    @NotNull
    public abstract io.ktor.client.call.b h();

    @NotNull
    public abstract GMTDate i();

    @NotNull
    public abstract l1 j();

    @NotNull
    public abstract k1 k();

    @NotNull
    public String toString() {
        return "HttpResponse[" + e.h(this).getUrl() + ", " + j() + AbstractJsonLexerKt.END_LIST;
    }
}
