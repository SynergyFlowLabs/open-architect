package io.ktor.utils.io;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
        a(Object obj) {
            super(1, obj, p.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) this.receiver).g(dVar);
        }
    }

    public static final void a(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.c(new IOException("Channel was cancelled"));
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Cancel without reason is deprecated. Please provide a cause for cancellation.", replaceWith = @kotlin.b1(expression = "cancel(IOException())", imports = {"kotlinx.coroutines.cancel"}))
    public static final void b(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        pVar.c(new IOException("Channel was cancelled"));
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Async close is deprecated. Please consider replacing it with flushAndClose or cancel ", replaceWith = @kotlin.b1(expression = "flushAndClose()", imports = {}))
    public static final void c(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        t.f(new a(pVar));
    }

    @o0
    @Nullable
    public static final Object d(@NotNull p pVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD;
        k.b0(pVar);
        b bVar = pVar instanceof b ? (b) pVar : null;
        if (((bVar != null && bVar.n()) || ui.j.f(pVar.i()) >= 1048576) && (objD = pVar.d(dVar)) == kotlin.coroutines.intrinsics.b.l()) {
            return objD;
        }
        return Unit.f312394a;
    }
}
