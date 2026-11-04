package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.f3;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,124:1\n47#2,4:125\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n21#1:125,4\n*E\n"})
public final class i {

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,49:1\n21#2:50\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements kotlinx.coroutines.o0 {
        public a(kotlinx.coroutines.o0.b bVar) {
            super(bVar);
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {26, 27}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    static final class b<E> extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super E>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f313774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f313775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f313776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<E> f313777d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(n0<? extends E> n0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f313777d = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f313777d, dVar);
            bVar.f313776c = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0051  */
        /* JADX WARN: Code duplicated, block: B:19:0x005f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0072  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
        
            if (r4.G(r8, r7) == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:8:0x001c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f313775b
                r2 = 2
                r3 = 1
                r6 = 7
                if (r1 == 0) goto L35
                r6 = 2
                if (r1 == r3) goto L28
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f313774a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r7.f313776c
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r8)
            L1c:
                r8 = r4
                r6 = 2
                goto L42
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 7
                throw r7
            L28:
                java.lang.Object r1 = r7.f313774a
                r6 = 1
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r7.f313776c
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r8)
                goto L54
            L35:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f313776c
                kotlinx.coroutines.channels.l0 r8 = (kotlinx.coroutines.channels.l0) r8
                kotlinx.coroutines.channels.n0<E> r1 = r7.f313777d
                kotlinx.coroutines.channels.r r1 = r1.iterator()
            L42:
                r6 = 6
                r7.f313776c = r8
                r7.f313774a = r1
                r7.f313775b = r3
                r6 = 2
                java.lang.Object r4 = r1.c(r7)
                if (r4 != r0) goto L51
                goto L70
            L51:
                r5 = r4
                r4 = r8
                r8 = r5
            L54:
                r6 = 6
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                r6 = 5
                boolean r8 = r8.booleanValue()
                r6 = 5
                if (r8 == 0) goto L72
                java.lang.Object r8 = r1.next()
                r7.f313776c = r4
                r7.f313774a = r1
                r6 = 1
                r7.f313775b = r2
                java.lang.Object r8 = r4.G(r8, r7)
                if (r8 != r0) goto L1c
            L70:
                r6 = 1
                return r0
            L72:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super E> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @f3
    @NotNull
    public static final <E> d<E> b(@NotNull s0 s0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull u0 u0Var, @Nullable Function1<? super Throwable, Unit> function1, @kotlin.b @NotNull Function2<? super l0<? super E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextK = kotlinx.coroutines.l0.k(s0Var, coroutineContext);
        d dVarA = f.a(i10);
        g h0Var = u0Var.o() ? new h0(coroutineContextK, dVarA, function2) : new g(coroutineContextK, dVarA, true);
        if (function1 != null) {
            ((w2) h0Var).E(function1);
        }
        ((kotlinx.coroutines.a) h0Var).h2(u0Var, h0Var, function2);
        return (d<E>) h0Var;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @f3
    @NotNull
    public static final <E> d<E> c(@NotNull final n0<? extends E> n0Var, int i10, @NotNull u0 u0Var) {
        return d(t0.m(t0.m(f2.f314023a, l1.g()), new a(kotlinx.coroutines.o0.L2)), null, i10, u0Var, new Function1() { // from class: kotlinx.coroutines.channels.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.f(n0Var, (Throwable) obj);
            }
        }, new b(n0Var, null), 1, null);
    }

    public static /* synthetic */ d d(s0 s0Var, CoroutineContext coroutineContext, int i10, u0 u0Var, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if ((i11 & 4) != 0) {
            u0Var = u0.LAZY;
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        u0 u0Var2 = u0Var;
        return b(s0Var, coroutineContext, i10, u0Var2, function1, function2);
    }

    public static /* synthetic */ d e(n0 n0Var, int i10, u0 u0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        if ((i11 & 2) != 0) {
            u0Var = u0.LAZY;
        }
        return c(n0Var, i10, u0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(n0 n0Var, Throwable th2) {
        v.b(n0Var, th2);
        return Unit.f312394a;
    }
}
