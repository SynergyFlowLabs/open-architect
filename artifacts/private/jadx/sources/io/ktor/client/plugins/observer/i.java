package io.ktor.client.plugins.observer;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    @Nullable
    public static final Object a(@NotNull kotlin.coroutines.d<? super CoroutineContext> dVar) {
        ck.a aVar = (ck.a) dVar.getContext().get(ck.a.f86918b);
        return aVar != null ? aVar : kotlin.coroutines.h.f312451a;
    }
}
