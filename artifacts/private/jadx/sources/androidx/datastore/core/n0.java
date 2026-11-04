package androidx.datastore.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSimpleActor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,127:1\n548#2,5:128\n*S KotlinDebug\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n*L\n104#1:128,5\n*E\n"})
public final class n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f49689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<T, kotlin.coroutines.d<? super Unit>, Object> f49690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<T> f49691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f49692d;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Unit> f49693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0<T> f49694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<T, Throwable, Unit> f49695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Throwable, Unit> function1, n0<T> n0Var, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f49693a = function1;
            this.f49694b = n0Var;
            this.f49695c = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            Unit unit;
            this.f49693a.invoke(th2);
            ((n0) this.f49694b).f49691c.F(th2);
            do {
                Object objH = kotlinx.coroutines.channels.t.h(((n0) this.f49694b).f49691c.w());
                if (objH != null) {
                    this.f49695c.invoke((T) objH, th2);
                    unit = Unit.f312394a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f49697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<T> f49698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0<T> n0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f49698c = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f49698c, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x005d A[PHI: r1 r7
          0x005d: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x005a, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x005d: PHI (r7v5 java.lang.Object) = (r7v12 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x005a, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            if (r1.invoke(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:19:0x006c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 4
                int r1 = r6.f49697b
                r5 = 3
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L20
                if (r1 != r2) goto L15
                r5 = 4
                kotlin.ResultKt.m(r7)
                goto L6c
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = " lseese m r/el twr /on/boo/nktue ohrcv/efiuta/o/ii/"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 4
                r6.<init>(r7)
                throw r6
            L20:
                java.lang.Object r1 = r6.f49696a
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                kotlin.ResultKt.m(r7)
                r5 = 5
                goto L5d
            L29:
                kotlin.ResultKt.m(r7)
                androidx.datastore.core.n0<T> r7 = r6.f49698c
                r5 = 2
                androidx.datastore.core.d r7 = androidx.datastore.core.n0.c(r7)
                int r7 = r7.b()
                r5 = 3
                if (r7 <= 0) goto L7f
            L3a:
                androidx.datastore.core.n0<T> r7 = r6.f49698c
                r5 = 5
                kotlinx.coroutines.s0 r7 = androidx.datastore.core.n0.d(r7)
                kotlinx.coroutines.t0.j(r7)
                androidx.datastore.core.n0<T> r7 = r6.f49698c
                kotlin.jvm.functions.Function2 r1 = androidx.datastore.core.n0.a(r7)
                r5 = 3
                androidx.datastore.core.n0<T> r7 = r6.f49698c
                kotlinx.coroutines.channels.p r7 = androidx.datastore.core.n0.b(r7)
                r5 = 5
                r6.f49696a = r1
                r6.f49697b = r3
                java.lang.Object r7 = r7.j(r6)
                if (r7 != r0) goto L5d
                goto L6a
            L5d:
                r5 = 2
                r4 = 0
                r6.f49696a = r4
                r6.f49697b = r2
                java.lang.Object r7 = r1.invoke(r7, r6)
                r5 = 4
                if (r7 != r0) goto L6c
            L6a:
                r5 = 2
                return r0
            L6c:
                r5 = 6
                androidx.datastore.core.n0<T> r7 = r6.f49698c
                r5 = 0
                androidx.datastore.core.d r7 = androidx.datastore.core.n0.c(r7)
                int r7 = r7.a()
                r5 = 5
                if (r7 != 0) goto L3a
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 7
                return r6
            L7f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 1
                java.lang.String r7 = "Check failed."
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.n0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(@NotNull kotlinx.coroutines.s0 scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f49689a = scope;
        this.f49690b = consumeMessage;
        int i10 = 0 << 0;
        this.f49691c = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
        this.f49692d = new d(0);
        p2 p2Var = (p2) scope.getCoroutineContext().get(p2.M2);
        if (p2Var != null) {
            p2Var.E(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T t10) throws Throwable {
        Object objP = this.f49691c.p(t10);
        if (objP instanceof kotlinx.coroutines.channels.t.a) {
            Throwable thF = kotlinx.coroutines.channels.t.f(objP);
            if (thF != null) {
                throw thF;
            }
            throw new kotlinx.coroutines.channels.d0("Channel was closed normally");
        }
        if (!kotlinx.coroutines.channels.t.m(objP)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f49692d.c() == 0) {
            kotlinx.coroutines.k.f(this.f49689a, null, null, new b(this, null), 3, null);
        }
    }
}
