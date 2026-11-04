package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final kotlinx.coroutines.internal.z0 f314763a = new kotlinx.coroutines.internal.z0("NO_VALUE");

    @NotNull
    public static final <T> j0<T> a(int i10, int i11, @NotNull kotlinx.coroutines.channels.j jVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || jVar == kotlinx.coroutines.channels.j.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new p0(i10, i12, jVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + jVar).toString());
    }

    public static /* synthetic */ j0 b(int i10, int i11, kotlinx.coroutines.channels.j jVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            jVar = kotlinx.coroutines.channels.j.SUSPEND;
        }
        return a(i10, i11, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0007  */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[RETURN] */
    @NotNull
    public static final <T> i<T> e(@NotNull o0<? extends T> o0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        if (i10 != 0) {
            int i11 = 1 ^ (-3);
            if (i10 == -3) {
                if (jVar == kotlinx.coroutines.channels.j.SUSPEND) {
                    return o0Var;
                }
            }
        } else if (jVar == kotlinx.coroutines.channels.j.SUSPEND) {
            return o0Var;
        }
        return new kotlinx.coroutines.flow.internal.i(o0Var, coroutineContext, i10, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
