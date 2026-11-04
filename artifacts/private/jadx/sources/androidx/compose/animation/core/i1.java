package androidx.compose.animation.core;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,345:1\n1107#2:346\n1085#2,2:347\n85#3:349\n117#3,2:350\n85#3:352\n117#3,2:353\n1282#4,6:355\n1282#4,6:361\n424#5,8:367\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n145#1:346\n145#1:347,2\n146#1:349\n146#1:350,2\n148#1:352\n148#1:353,2\n166#1:355,6\n168#1:361,6\n203#1:367,8\n*E\n"})
public final class i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13005f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f13006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<a<?, ?>> f13007b = new androidx.compose.runtime.collection.d<>(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13008c = d7.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f13009d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13010e = d7.g(Boolean.TRUE, null, 2, null);

    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,345:1\n85#2:346\n117#2,2:347\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n79#1:346\n79#1:347,2\n*E\n"})
    public final class a<T, V extends w> implements n7<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f13011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f13012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final z3<T, V> f13013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f13014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.n3 f13015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private o<T> f13016f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private g3<T, V> f13017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f13018h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f13019i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f13020j;

        public a(T t10, @NotNull T t11, @NotNull z3<T, V> z3Var, @NotNull o<T> oVar, String str) {
            this.f13011a = t10;
            this.f13012b = t11;
            this.f13013c = z3Var;
            this.f13014d = str;
            this.f13015e = d7.g(t10, null, 2, null);
            this.f13016f = oVar;
            this.f13017g = new g3<>(this.f13016f, z3Var, this.f13011a, this.f13012b, (w) null, 16, (DefaultConstructorMarker) null);
        }

        public final void A() {
            this.f13019i = true;
        }

        public final void E(@NotNull g3<T, V> g3Var) {
            this.f13017g = g3Var;
        }

        public final void F(boolean z10) {
            this.f13018h = z10;
        }

        public final void G(T t10) {
            this.f13011a = t10;
        }

        public final void H(T t10) {
            this.f13012b = t10;
        }

        public void I(T t10) {
            this.f13015e.setValue(t10);
        }

        public final void J() {
            I(this.f13017g.c());
            this.f13019i = true;
        }

        public final void K(T t10, T t11, @NotNull o<T> oVar) {
            this.f13011a = t10;
            this.f13012b = t11;
            this.f13016f = oVar;
            this.f13017g = new g3<>(oVar, this.f13013c, t10, t11, (w) null, 16, (DefaultConstructorMarker) null);
            i1.this.p(true);
            this.f13018h = false;
            this.f13019i = true;
        }

        @NotNull
        public final g3<T, V> a() {
            return this.f13017g;
        }

        @NotNull
        public final o<T> b() {
            return this.f13016f;
        }

        public final T d() {
            return this.f13011a;
        }

        @NotNull
        public final String g() {
            return this.f13014d;
        }

        @Override // androidx.compose.runtime.n7
        public T getValue() {
            return this.f13015e.getValue();
        }

        public final T h() {
            return this.f13012b;
        }

        @NotNull
        public final z3<T, V> p() {
            return this.f13013c;
        }

        public final boolean s() {
            return this.f13018h;
        }

        public final void t(long j10) {
            i1.this.p(false);
            if (this.f13019i) {
                this.f13019i = false;
                this.f13020j = j10;
            }
            long j11 = j10 - this.f13020j;
            I(this.f13017g.g(j11));
            this.f13018h = this.f13017g.d(j11);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {172, 193}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,345:1\n424#2,8:346\n424#2,8:354\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n*L\n179#1:346,8\n184#1:354,8\n*E\n"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f13024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<n7<Long>> f13025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1 f13026e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Float, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f13027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ float f13028b;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f13028b = ((Number) obj).floatValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Float f10, kotlin.coroutines.d<? super Boolean> dVar) {
                return k(f10.floatValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f13027a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f13028b > 0.0f);
            }

            public final Object k(float f10, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(Float.valueOf(f10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.n3<n7<Long>> n3Var, i1 i1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f13025d = n3Var;
            this.f13026e = i1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.compose.runtime.n3 n3Var, i1 i1Var, kotlin.jvm.internal.i1.e eVar, kotlinx.coroutines.s0 s0Var, long j10) {
            n7 n7Var = (n7) n3Var.getValue();
            long jLongValue = n7Var != null ? ((Number) n7Var.getValue()).longValue() : j10;
            if (i1Var.f13009d == Long.MIN_VALUE || eVar.f312748a != f3.J(s0Var.getCoroutineContext())) {
                i1Var.f13009d = j10;
                androidx.compose.runtime.collection.d dVar = i1Var.f13007b;
                Object[] objArr = dVar.f35552a;
                int iR = dVar.R();
                for (int i10 = 0; i10 < iR; i10++) {
                    ((a) objArr[i10]).A();
                }
                eVar.f312748a = f3.J(s0Var.getCoroutineContext());
            }
            if (eVar.f312748a == 0.0f) {
                androidx.compose.runtime.collection.d dVar2 = i1Var.f13007b;
                Object[] objArr2 = dVar2.f35552a;
                int iR2 = dVar2.R();
                for (int i11 = 0; i11 < iR2; i11++) {
                    ((a) objArr2[i11]).J();
                }
            } else {
                i1Var.l((long) ((jLongValue - i1Var.f13009d) / eVar.f312748a));
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float s(kotlinx.coroutines.s0 s0Var) {
            return f3.J(s0Var.getCoroutineContext());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f13025d, this.f13026e, dVar);
            bVar.f13024c = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0049 A[PHI: r1 r9
          0x0049: PHI (r1v3 kotlin.jvm.internal.i1$e) = 
          (r1v1 kotlin.jvm.internal.i1$e)
          (r1v2 kotlin.jvm.internal.i1$e)
          (r1v2 kotlin.jvm.internal.i1$e)
          (r1v7 kotlin.jvm.internal.i1$e)
         binds: [B:11:0x0039, B:16:0x0066, B:18:0x0083, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]
          0x0049: PHI (r9v4 kotlinx.coroutines.s0) = (r9v2 kotlinx.coroutines.s0), (r9v3 kotlinx.coroutines.s0), (r9v3 kotlinx.coroutines.s0), (r9v7 kotlinx.coroutines.s0) binds: [B:11:0x0039, B:16:0x0066, B:18:0x0083, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:15:0x0061 A[PHI: r1 r9
          0x0061: PHI (r1v2 kotlin.jvm.internal.i1$e) = (r1v3 kotlin.jvm.internal.i1$e), (r1v5 kotlin.jvm.internal.i1$e) binds: [B:13:0x005e, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x0061: PHI (r9v3 kotlinx.coroutines.s0) = (r9v4 kotlinx.coroutines.s0), (r9v5 kotlinx.coroutines.s0) binds: [B:13:0x005e, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:12:0x0049). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:12:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f13023b
                r2 = 2
                r7 = 7
                r3 = 1
                if (r1 == 0) goto L39
                r7 = 6
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L1f
                r7 = 2
                java.lang.Object r1 = r8.f13022a
                kotlin.jvm.internal.i1$e r1 = (kotlin.jvm.internal.i1.e) r1
                r7 = 7
                java.lang.Object r4 = r8.f13024c
                kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.s0) r4
                kotlin.ResultKt.m(r9)
                r9 = r4
                goto L49
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r7 = 4
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r7 = 3
                r8.<init>(r9)
                r7 = 3
                throw r8
            L2a:
                java.lang.Object r1 = r8.f13022a
                kotlin.jvm.internal.i1$e r1 = (kotlin.jvm.internal.i1.e) r1
                r7 = 1
                java.lang.Object r4 = r8.f13024c
                r7 = 1
                kotlinx.coroutines.s0 r4 = (kotlinx.coroutines.s0) r4
                kotlin.ResultKt.m(r9)
                r9 = r4
                goto L61
            L39:
                kotlin.ResultKt.m(r9)
                java.lang.Object r9 = r8.f13024c
                kotlinx.coroutines.s0 r9 = (kotlinx.coroutines.s0) r9
                kotlin.jvm.internal.i1$e r1 = new kotlin.jvm.internal.i1$e
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f312748a = r4
            L49:
                androidx.compose.runtime.n3<androidx.compose.runtime.n7<java.lang.Long>> r4 = r8.f13025d
                androidx.compose.animation.core.i1 r5 = r8.f13026e
                androidx.compose.animation.core.j1 r6 = new androidx.compose.animation.core.j1
                r6.<init>()
                r7 = 2
                r8.f13024c = r9
                r7 = 4
                r8.f13022a = r1
                r8.f13023b = r3
                java.lang.Object r4 = androidx.compose.animation.core.f1.c(r6, r8)
                if (r4 != r0) goto L61
                goto L85
            L61:
                float r4 = r1.f312748a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L49
                androidx.compose.animation.core.k1 r4 = new androidx.compose.animation.core.k1
                r4.<init>()
                kotlinx.coroutines.flow.i r4 = androidx.compose.runtime.w6.y(r4)
                androidx.compose.animation.core.i1$b$a r5 = new androidx.compose.animation.core.i1$b$a
                r6 = 0
                r6 = 0
                r5.<init>(r6)
                r8.f13024c = r9
                r8.f13022a = r1
                r8.f13023b = r2
                java.lang.Object r4 = kotlinx.coroutines.flow.k.x0(r4, r5, r8)
                r7 = 3
                if (r4 != r0) goto L49
            L85:
                r7 = 5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.i1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public i1(@NotNull String str) {
        this.f13006a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j() {
        return ((Boolean) this.f13008c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean k() {
        return ((Boolean) this.f13010e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(long j10) {
        androidx.compose.runtime.collection.d<a<?, ?>> dVar = this.f13007b;
        a<?, ?>[] aVarArr = dVar.f35552a;
        int iR = dVar.R();
        boolean z10 = true;
        for (int i10 = 0; i10 < iR; i10++) {
            a<?, ?> aVar = aVarArr[i10];
            if (!aVar.s()) {
                aVar.t(j10);
            }
            if (!aVar.s()) {
                z10 = false;
            }
        }
        q(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(i1 i1Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        i1Var.n(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z10) {
        this.f13008c.setValue(Boolean.valueOf(z10));
    }

    private final void q(boolean z10) {
        this.f13010e.setValue(Boolean.valueOf(z10));
    }

    public final void g(@NotNull a<?, ?> aVar) {
        this.f13007b.d(aVar);
        p(true);
    }

    @NotNull
    public final List<a<?, ?>> h() {
        return this.f13007b.q();
    }

    @NotNull
    public final String i() {
        return this.f13006a;
    }

    public final void m(@NotNull a<?, ?> aVar) {
        this.f13007b.n0(aVar);
    }

    @androidx.compose.runtime.o
    public final void n(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:164)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(null, null, 2, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
            if (k() || j()) {
                c0VarR.E(-144783432);
                boolean zK0 = c0VarR.k0(this);
                Object objI1 = c0VarR.i0();
                if (zK0 || objI1 == aVar.a()) {
                    objI1 = new b(n3Var, this, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.i(this, (Function2) objI1, c0VarR, i11 & 14);
                c0VarR.A();
            } else {
                c0VarR.E(-143396709);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.animation.core.h1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i1.o(this.f12993a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
