package io.ktor.network.selector;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.spi.SelectorProvider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k {
    @NotNull
    public static final j a(@NotNull CoroutineContext dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new a(dispatcher);
    }

    public static /* synthetic */ j b(CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return a(coroutineContext);
    }

    public static final <C extends Closeable, R> R c(@NotNull j jVar, @NotNull Function1<? super SelectorProvider, ? extends C> create, @NotNull Function1<? super C, ? extends R> setup) throws IOException {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(setup, "setup");
        C cInvoke = create.invoke(jVar.u0());
        try {
            return setup.invoke(cInvoke);
        } catch (Throwable th2) {
            cInvoke.close();
            throw th2;
        }
    }
}
