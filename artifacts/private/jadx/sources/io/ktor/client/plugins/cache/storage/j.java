package io.ktor.client.plugins.cache.storage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {
    @NotNull
    public static final b a(@NotNull File directory, @NotNull n0 dispatcher) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new d(new h(directory, dispatcher));
    }

    public static /* synthetic */ b b(File file, n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            n0Var = l1.c();
        }
        return a(file, n0Var);
    }
}
