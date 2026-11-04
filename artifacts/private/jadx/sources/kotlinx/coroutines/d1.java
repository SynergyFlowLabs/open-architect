package kotlinx.coroutines;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n426#2,11:160\n426#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
public final class d1 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f313921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313922b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f313921a = obj;
            this.f313922b |= Integer.MIN_VALUE;
            return d1.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public static final Object a(@NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f313922b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f313922b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f313921a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f313922b;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar.f313922b = 1;
            p pVar = new p(kotlin.coroutines.intrinsics.b.e(aVar), 1);
            pVar.p0();
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(aVar);
            }
            if (objU == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    @Nullable
    public static final Object b(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (j10 <= 0) {
            return Unit.f312394a;
        }
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        if (j10 < Long.MAX_VALUE) {
            d(pVar.getContext()).b(j10, pVar);
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objB = b(e(j10), dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    @NotNull
    public static final c1 d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.e.K2);
        c1 c1Var = element instanceof c1 ? (c1) element : null;
        return c1Var == null ? z0.a() : c1Var;
    }

    public static final long e(long j10) {
        boolean zY0 = kotlin.time.c.y0(j10);
        if (zY0) {
            kotlin.time.c.a aVar = kotlin.time.c.f313406b;
            return kotlin.time.c.f0(kotlin.time.c.A0(j10, kotlin.time.e.n0(999999L, kotlin.time.f.NANOSECONDS)));
        }
        if (zY0) {
            throw new kotlin.k0();
        }
        return 0L;
    }
}
