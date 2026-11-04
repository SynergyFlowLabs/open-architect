package io.ktor.events;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static final <T> void a(@NotNull c cVar, @NotNull a<T> definition, T t10, @Nullable org.slf4j.c cVar2) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(definition, "definition");
        try {
            cVar.b(definition, t10);
        } catch (Throwable th2) {
            if (cVar2 != null) {
                cVar2.c("Some handlers have thrown an exception", th2);
            }
        }
    }

    public static /* synthetic */ void b(c cVar, a aVar, Object obj, org.slf4j.c cVar2, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            cVar2 = null;
        }
        a(cVar, aVar, obj, cVar2);
    }
}
