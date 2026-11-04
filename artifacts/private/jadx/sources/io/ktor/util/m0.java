package io.ktor.util;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface m0 {

    public static final class a {
        public static /* synthetic */ io.ktor.utils.io.h a(m0 m0Var, io.ktor.utils.io.h hVar, CoroutineContext coroutineContext, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
            }
            if ((i10 & 2) != 0) {
                coroutineContext = kotlin.coroutines.h.f312451a;
            }
            return m0Var.a(hVar, coroutineContext);
        }

        public static /* synthetic */ io.ktor.utils.io.h b(m0 m0Var, io.ktor.utils.io.h hVar, CoroutineContext coroutineContext, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i10 & 2) != 0) {
                coroutineContext = kotlin.coroutines.h.f312451a;
            }
            return m0Var.b(hVar, coroutineContext);
        }

        public static /* synthetic */ io.ktor.utils.io.p c(m0 m0Var, io.ktor.utils.io.p pVar, CoroutineContext coroutineContext, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i10 & 2) != 0) {
                coroutineContext = kotlin.coroutines.h.f312451a;
            }
            return m0Var.c(pVar, coroutineContext);
        }
    }

    @NotNull
    io.ktor.utils.io.h a(@NotNull io.ktor.utils.io.h hVar, @NotNull CoroutineContext coroutineContext);

    @NotNull
    io.ktor.utils.io.h b(@NotNull io.ktor.utils.io.h hVar, @NotNull CoroutineContext coroutineContext);

    @NotNull
    io.ktor.utils.io.p c(@NotNull io.ktor.utils.io.p pVar, @NotNull CoroutineContext coroutineContext);
}
