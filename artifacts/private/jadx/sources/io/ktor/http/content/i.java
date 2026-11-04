package io.ktor.http.content;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    @Nullable
    public static final w c(@NotNull final w wVar, @NotNull io.ktor.util.z contentEncoder, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(contentEncoder, "contentEncoder");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (wVar instanceof w.e) {
            return new l(wVar, new Function0() { // from class: io.ktor.http.content.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.e(wVar);
                }
            }, contentEncoder, coroutineContext);
        }
        if (wVar instanceof w.f) {
            return new o((w.f) wVar, contentEncoder, coroutineContext);
        }
        if (wVar instanceof w.a) {
            return new l(wVar, new Function0() { // from class: io.ktor.http.content.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.f(wVar);
                }
            }, contentEncoder, coroutineContext);
        }
        if ((wVar instanceof w.c) || (wVar instanceof w.d)) {
            return null;
        }
        if (wVar instanceof w.b) {
            return c(((w.b) wVar).i(), contentEncoder, coroutineContext);
        }
        throw new k0();
    }

    public static /* synthetic */ w d(w wVar, io.ktor.util.z zVar, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return c(wVar, zVar, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.h e(w wVar) {
        return ((w.e) wVar).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.h f(w wVar) {
        return io.ktor.utils.io.c.e(((w.a) wVar).h(), 0, 0, 6, null);
    }
}
