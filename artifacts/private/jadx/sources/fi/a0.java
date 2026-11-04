package fi;

import io.ktor.http.k2;
import io.ktor.http.u2;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpRequestJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestJvm.kt\nio/ktor/client/request/HttpRequestJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
public final class a0 {
    @NotNull
    public static final y a(@NotNull y.a aVar, @NotNull URL url) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        y yVar = new y();
        b(yVar, url);
        return yVar;
    }

    @NotNull
    public static final k2 b(@NotNull y yVar, @NotNull URL url) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        return u2.c(yVar.i(), url);
    }
}
