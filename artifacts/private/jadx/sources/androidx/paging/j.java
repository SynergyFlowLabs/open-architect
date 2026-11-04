package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCachedPagingData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n+ 2 FlowExt.kt\nandroidx/paging/FlowExtKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,134:1\n105#2:135\n53#3:136\n55#3:140\n50#4:137\n55#4:139\n107#5:138\n*S KotlinDebug\n*F\n+ 1 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n97#1:135\n106#1:136\n106#1:140\n106#1:137\n106#1:139\n106#1:138\n*E\n"})
public final class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<x1<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f72272a;

        /* JADX INFO: renamed from: androidx.paging.j$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n1#1,222:1\n54#2:223\n107#3:224\n*E\n"})
        public static final class C0671a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f72273a;

            /* JADX INFO: renamed from: androidx.paging.j$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0672a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f72274a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72275b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f72276c;

                public C0672a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72274a = obj;
                    this.f72275b |= Integer.MIN_VALUE;
                    return C0671a.this.emit(null, this);
                }
            }

            public C0671a(kotlinx.coroutines.flow.j jVar) {
                this.f72273a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0672a c0672a;
                if (dVar instanceof C0672a) {
                    c0672a = (C0672a) dVar;
                    int i10 = c0672a.f72275b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0672a.f72275b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0672a = new C0672a(dVar);
                    }
                } else {
                    c0672a = new C0672a(dVar);
                }
                Object obj2 = c0672a.f72274a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0672a.f72275b;
                int i12 = 3 & 1;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f72273a;
                    x1<T> x1VarB = ((c1) obj).b();
                    c0672a.f72275b = 1;
                    if (jVar.emit(x1VarB, c0672a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public a(kotlinx.coroutines.flow.i iVar) {
            this.f72272a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f72272a.collect(new C0671a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n+ 2 CachedPagingData.kt\nandroidx/paging/CachedPagingDataKt\n*L\n1#1,224:1\n98#2,4:225\n*E\n"})
    public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super c1<T>>, x1<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f72280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f72281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.paging.c f72282e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, kotlinx.coroutines.s0 s0Var, androidx.paging.c cVar) {
            super(3, dVar);
            this.f72281d = s0Var;
            this.f72282e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72278a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f72279b;
                c1 c1Var = new c1(this.f72281d, (x1) this.f72280c, this.f72282e);
                this.f72278a = 1;
                if (jVar.emit(c1Var, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super c1<T>> jVar, x1<T> x1Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(dVar, this.f72281d, this.f72282e);
            bVar.f72279b = jVar;
            bVar.f72280c = x1Var;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {io.ktor.http.t1.b.f296120h}, s = {"L$0"})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<c1<T>, c1<T>, kotlin.coroutines.d<? super c1<T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f72284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f72285c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72283a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1 c1Var = (c1) this.f72284b;
                ResultKt.m(obj);
                return c1Var;
            }
            ResultKt.m(obj);
            c1 c1Var2 = (c1) this.f72284b;
            c1 c1Var3 = (c1) this.f72285c;
            this.f72284b = c1Var3;
            this.f72283a = 1;
            return c1Var2.c(this) == objL ? objL : c1Var3;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull c1<T> c1Var, @NotNull c1<T> c1Var2, @Nullable kotlin.coroutines.d<? super c1<T>> dVar) {
            c cVar = new c(dVar);
            cVar.f72284b = c1Var;
            cVar.f72285c = c1Var2;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super x1<T>>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.paging.c f72287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.paging.c cVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f72287b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new d(this.f72287b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72286a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.paging.c cVar = this.f72287b;
                if (cVar != null) {
                    androidx.paging.c.a aVar = androidx.paging.c.a.PAGED_DATA_FLOW;
                    this.f72286a = 1;
                    if (cVar.c(aVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super x1<T>> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", i = {}, l = {com.rabbitmq.client.impl.k.b.p.f265340a}, m = "invokeSuspend", n = {}, s = {})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super x1<T>>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.paging.c f72289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.paging.c cVar, kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
            this.f72289b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72288a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.paging.c cVar = this.f72289b;
                if (cVar != null) {
                    androidx.paging.c.a aVar = androidx.paging.c.a.PAGED_DATA_FLOW;
                    this.f72288a = 1;
                    if (cVar.a(aVar, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super x1<T>> jVar, @Nullable Throwable th2, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return new e(this.f72289b, dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.annotation.j
    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<x1<T>> a(@NotNull kotlinx.coroutines.flow.i<x1<T>> iVar, @NotNull kotlinx.coroutines.s0 scope) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return b(iVar, scope, null);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<x1<T>> b(@NotNull kotlinx.coroutines.flow.i<x1<T>> iVar, @NotNull kotlinx.coroutines.s0 scope, @Nullable androidx.paging.c cVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return kotlinx.coroutines.flow.k.I1(kotlinx.coroutines.flow.k.g1(kotlinx.coroutines.flow.k.o1(new a(d0.f(d0.h(iVar, new b(null, scope, cVar)), new c(null))), new d(cVar, null)), new e(cVar, null)), scope, kotlinx.coroutines.flow.u0.f314834a.d(), 1);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i c(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.s0 s0Var, androidx.paging.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        return b(iVar, s0Var, cVar);
    }
}
