package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class p {
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i10) {
        return d(iVar, i10, null, 2, null);
    }

    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && jVar != kotlinx.coroutines.channels.j.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            jVar = kotlinx.coroutines.channels.j.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        kotlinx.coroutines.channels.j jVar2 = jVar;
        if (iVar instanceof kotlinx.coroutines.flow.internal.r) {
            return kotlinx.coroutines.flow.internal.r.a.a((kotlinx.coroutines.flow.internal.r) iVar, null, i11, jVar2, 1, null);
        }
        return new kotlinx.coroutines.flow.internal.i(iVar, null, i11, jVar2, 2, null);
    }

    public static /* synthetic */ i c(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        return a(iVar, i10);
    }

    public static /* synthetic */ i d(i iVar, int i10, kotlinx.coroutines.channels.j jVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            jVar = kotlinx.coroutines.channels.j.SUSPEND;
        }
        return k.p(iVar, i10, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    private static final void f(CoroutineContext coroutineContext) {
        if (coroutineContext.get(p2.M2) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar) {
        return d(iVar, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> h(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        f(coroutineContext);
        if (Intrinsics.areEqual(coroutineContext, kotlin.coroutines.h.f312451a)) {
            return iVar;
        }
        if (iVar instanceof kotlinx.coroutines.flow.internal.r) {
            return kotlinx.coroutines.flow.internal.r.a.a((kotlinx.coroutines.flow.internal.r) iVar, coroutineContext, 0, null, 6, null);
        }
        return new kotlinx.coroutines.flow.internal.i(iVar, coroutineContext, 0, null, 12, null);
    }
}
