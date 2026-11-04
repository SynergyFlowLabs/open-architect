package vf;

import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    @j
    public static final void a(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull String message) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        c(aVar, message, null, 2, null);
    }

    @j
    public static final void b(@NotNull com.segment.analytics.kotlin.core.a aVar, @NotNull String message, @NotNull b kind) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(kind, "kind");
        f.a(com.segment.analytics.kotlin.core.a.Companion, message, kind);
    }

    public static /* synthetic */ void c(com.segment.analytics.kotlin.core.a aVar, String str, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = b.DEBUG;
        }
        b(aVar, str, bVar);
    }
}
