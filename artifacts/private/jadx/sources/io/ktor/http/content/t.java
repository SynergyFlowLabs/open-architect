package io.ktor.http.content;

import java.io.InputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream b(c0.c cVar) {
        return io.ktor.utils.io.jvm.javaio.a.b(cVar.k().invoke(), null, 1, null);
    }

    @NotNull
    public static final Function0<InputStream> c(@NotNull final c0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new Function0() { // from class: io.ktor.http.content.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.b(cVar);
            }
        };
    }

    @kotlin.l(message = "This API uses blocking InputStream. Please use provider() directly.")
    public static /* synthetic */ void d(c0.c cVar) {
    }
}
