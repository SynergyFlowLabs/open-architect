package androidx.paging;

import java.util.concurrent.Executor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagingDataTransforms.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n+ 2 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,191:1\n32#2,2:192\n34#2,3:199\n32#2,2:202\n34#2,3:209\n32#2,2:212\n34#2,3:219\n53#3:194\n55#3:198\n53#3:204\n55#3:208\n53#3:214\n55#3:218\n50#4:195\n55#4:197\n50#4:205\n55#4:207\n50#4:215\n55#4:217\n107#5:196\n107#5:206\n107#5:216\n*S KotlinDebug\n*F\n+ 1 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n37#1:192,2\n37#1:199,3\n53#1:202,2\n53#1:209,3\n69#1:212,2\n69#1:219,3\n37#1:194\n37#1:198\n53#1:204\n53#1:208\n69#1:214\n69#1:218\n37#1:195\n37#1:197\n53#1:205\n53#1:207\n69#1:215\n69#1:217\n37#1:196\n53#1:206\n69#1:216\n*E\n"})
final /* synthetic */ class d2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<g1<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f71758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f71759c;

        /* JADX INFO: renamed from: androidx.paging.d2$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n70#4:225\n*E\n"})
        public static final class C0648a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71760a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Executor f71761b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f71762c;

            /* JADX INFO: renamed from: androidx.paging.d2$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0649a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71763a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71764b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71765c;

                public C0649a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71763a = obj;
                    this.f71764b |= Integer.MIN_VALUE;
                    return C0648a.this.emit(null, this);
                }
            }

            public C0648a(kotlinx.coroutines.flow.j jVar, Executor executor, Function1 function1) {
                this.f71760a = jVar;
                this.f71761b = executor;
                this.f71762c = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
            
                if (r9.emit(r11, r0) == r1) goto L23;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r11) {
                /*
                    r9 = this;
                    java.lang.String r8 = "Androeed.ru"
                    boolean r0 = r11 instanceof androidx.paging.d2.a.C0648a.C0649a
                    if (r0 == 0) goto L18
                    r0 = r11
                    r8 = 2
                    androidx.paging.d2$a$a$a r0 = (androidx.paging.d2.a.C0648a.C0649a) r0
                    r8 = 0
                    int r1 = r0.f71764b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L18
                    int r1 = r1 - r2
                    r0.f71764b = r1
                    r8 = 4
                    goto L1e
                L18:
                    r8 = 0
                    androidx.paging.d2$a$a$a r0 = new androidx.paging.d2$a$a$a
                    r0.<init>(r11)
                L1e:
                    java.lang.Object r11 = r0.f71763a
                    r8 = 1
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r8 = 7
                    int r2 = r0.f71764b
                    r8 = 7
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L4b
                    if (r2 == r5) goto L42
                    r8 = 1
                    if (r2 != r4) goto L38
                    kotlin.ResultKt.m(r11)
                    r8 = 5
                    goto L7c
                L38:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r8 = 7
                    r9.<init>(r10)
                    r8 = 3
                    throw r9
                L42:
                    r8 = 7
                    java.lang.Object r9 = r0.f71765c
                    kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                    kotlin.ResultKt.m(r11)
                    goto L70
                L4b:
                    kotlin.ResultKt.m(r11)
                    r8 = 4
                    kotlinx.coroutines.flow.j r11 = r9.f71760a
                    androidx.paging.g1 r10 = (androidx.paging.g1) r10
                    java.util.concurrent.Executor r2 = r9.f71761b
                    kotlinx.coroutines.n0 r2 = kotlinx.coroutines.b2.c(r2)
                    r8 = 5
                    androidx.paging.d2$b r6 = new androidx.paging.d2$b
                    kotlin.jvm.functions.Function1 r9 = r9.f71762c
                    r6.<init>(r10, r9, r3)
                    r0.f71765c = r11
                    r0.f71764b = r5
                    java.lang.Object r9 = kotlinx.coroutines.i.h(r2, r6, r0)
                    if (r9 != r1) goto L6d
                    r8 = 2
                    goto L7b
                L6d:
                    r7 = r11
                    r11 = r9
                    r9 = r7
                L70:
                    r0.f71765c = r3
                    r0.f71764b = r4
                    java.lang.Object r9 = r9.emit(r11, r0)
                    r8 = 6
                    if (r9 != r1) goto L7c
                L7b:
                    return r1
                L7c:
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d2.a.C0648a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, Executor executor, Function1 function1) {
            this.f71757a = iVar;
            this.f71758b = executor;
            this.f71759c = function1;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71757a.collect(new C0648a(jVar, this.f71758b, this.f71759c), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super g1<T>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1<T> f71768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f71769c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f71771b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<T, Boolean> f71772c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super T, Boolean> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f71772c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f71772c, dVar);
                aVar.f71771b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f71770a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f71772c.invoke((T) this.f71771b);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull T t10, @Nullable kotlin.coroutines.d<? super Boolean> dVar) {
                return ((a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g1<T> g1Var, Function1<? super T, Boolean> function1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f71768b = g1Var;
            this.f71769c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f71768b, this.f71769c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71767a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g1<T> g1Var = this.f71768b;
            a aVar = new a(this.f71769c, null);
            this.f71767a = 1;
            Object objA = g1Var.a(aVar, this);
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super g1<T>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class c<R> implements kotlinx.coroutines.flow.i<g1<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f71774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f71775c;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n54#4:225\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71776a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Executor f71777b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f71778c;

            /* JADX INFO: renamed from: androidx.paging.d2$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0650a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71779a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71780b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71781c;

                public C0650a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71779a = obj;
                    this.f71780b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Executor executor, Function1 function1) {
                this.f71776a = jVar;
                this.f71777b = executor;
                this.f71778c = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
            
                if (r9.emit(r11, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r11) {
                /*
                    r9 = this;
                    java.lang.String r8 = "Androeed.ru"
                    boolean r0 = r11 instanceof androidx.paging.d2.c.a.C0650a
                    r8 = 4
                    if (r0 == 0) goto L18
                    r0 = r11
                    r0 = r11
                    androidx.paging.d2$c$a$a r0 = (androidx.paging.d2.c.a.C0650a) r0
                    int r1 = r0.f71780b
                    r8 = 3
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L18
                    int r1 = r1 - r2
                    r0.f71780b = r1
                    goto L1d
                L18:
                    androidx.paging.d2$c$a$a r0 = new androidx.paging.d2$c$a$a
                    r0.<init>(r11)
                L1d:
                    java.lang.Object r11 = r0.f71779a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r8 = 3
                    int r2 = r0.f71780b
                    r3 = 0
                    int r8 = r8 << r3
                    r4 = 2
                    r8 = 4
                    r5 = 1
                    if (r2 == 0) goto L49
                    if (r2 == r5) goto L40
                    if (r2 != r4) goto L35
                    kotlin.ResultKt.m(r11)
                    goto L7e
                L35:
                    r8 = 3
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "a/so iemr//looc etrteu/ he ofe/nek t/cunoriv/lb i/w"
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L40:
                    java.lang.Object r9 = r0.f71781c
                    kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                    r8 = 7
                    kotlin.ResultKt.m(r11)
                    goto L71
                L49:
                    kotlin.ResultKt.m(r11)
                    kotlinx.coroutines.flow.j r11 = r9.f71776a
                    androidx.paging.g1 r10 = (androidx.paging.g1) r10
                    java.util.concurrent.Executor r2 = r9.f71777b
                    r8 = 7
                    kotlinx.coroutines.n0 r2 = kotlinx.coroutines.b2.c(r2)
                    androidx.paging.d2$d r6 = new androidx.paging.d2$d
                    r8 = 1
                    kotlin.jvm.functions.Function1 r9 = r9.f71778c
                    r8 = 2
                    r6.<init>(r10, r9, r3)
                    r8 = 7
                    r0.f71781c = r11
                    r8 = 7
                    r0.f71780b = r5
                    java.lang.Object r9 = kotlinx.coroutines.i.h(r2, r6, r0)
                    r8 = 7
                    if (r9 != r1) goto L6e
                    goto L7d
                L6e:
                    r7 = r11
                    r11 = r9
                    r9 = r7
                L71:
                    r8 = 0
                    r0.f71781c = r3
                    r0.f71780b = r4
                    java.lang.Object r9 = r9.emit(r11, r0)
                    r8 = 1
                    if (r9 != r1) goto L7e
                L7d:
                    return r1
                L7e:
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d2.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.flow.i iVar, Executor executor, Function1 function1) {
            this.f71773a = iVar;
            this.f71774b = executor;
            this.f71775c = function1;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71773a.collect(new a(jVar, this.f71774b, this.f71775c), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class d<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super g1<R>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1<T> f71784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, Iterable<R>> f71785c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super Iterable<? extends R>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71786a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f71787b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<T, Iterable<R>> f71788c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super T, ? extends Iterable<? extends R>> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f71788c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f71788c, dVar);
                aVar.f71787b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f71786a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f71788c.invoke((T) this.f71787b);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull T t10, @Nullable kotlin.coroutines.d<? super Iterable<? extends R>> dVar) {
                return ((a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(g1<T> g1Var, Function1<? super T, ? extends Iterable<? extends R>> function1, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f71784b = g1Var;
            this.f71785c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new d(this.f71784b, this.f71785c, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.d2$d<R> for r6v3 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 5
                int r1 = r6.f71783a
                r2 = 1
                if (r1 == 0) goto L1c
                r5 = 3
                if (r1 != r2) goto L11
                kotlin.ResultKt.m(r7)
                return r7
            L11:
                r5 = 3
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "oeshtwecn l  o/// e/nb/eo/s/ea/toifr  ricuoirvklemu"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1c:
                kotlin.ResultKt.m(r7)
                androidx.paging.g1<T> r7 = r6.f71784b
                androidx.paging.d2$d$a r1 = new androidx.paging.d2$d$a
                r5 = 5
                kotlin.jvm.functions.Function1<T, java.lang.Iterable<R>> r3 = r6.f71785c
                r4 = 0
                r1.<init>(r3, r4)
                r5 = 1
                r6.f71783a = r2
                java.lang.Object r6 = r7.c(r1, r6)
                if (r6 != r0) goto L34
                return r0
            L34:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super g1<R>> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    static final class e<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<T, T, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f71790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f71791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Executor f71792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, R> f71793e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71794a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<T, T, R> f71795b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f71796c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f71797d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super T, ? super T, ? extends R> function2, T t10, T t11, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f71795b = function2;
                this.f71796c = t10;
                this.f71797d = t11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f71795b, this.f71796c, this.f71797d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f71794a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f71795b.invoke(this.f71796c, this.f71797d);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super R> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Executor executor, Function2<? super T, ? super T, ? extends R> function2, kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
            this.f71792d = executor;
            this.f71793e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71789a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            Object obj2 = this.f71790b;
            Object obj3 = this.f71791c;
            kotlinx.coroutines.n0 n0VarC = kotlinx.coroutines.b2.c(this.f71792d);
            a aVar = new a(this.f71793e, obj2, obj3, null);
            this.f71790b = null;
            this.f71789a = 1;
            Object objH = kotlinx.coroutines.i.h(n0VarC, aVar, this);
            return objH == objL ? objL : objH;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t10, @Nullable T t11, @Nullable kotlin.coroutines.d<? super R> dVar) {
            e eVar = new e(this.f71792d, this.f71793e, dVar);
            eVar.f71790b = t10;
            eVar.f71791c = t11;
            return eVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class f<R> implements kotlinx.coroutines.flow.i<g1<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f71799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f71800c;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n38#4:225\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Executor f71802b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f71803c;

            /* JADX INFO: renamed from: androidx.paging.d2$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.jvm.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0651a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71804a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71805b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71806c;

                public C0651a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71804a = obj;
                    this.f71805b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Executor executor, Function1 function1) {
                this.f71801a = jVar;
                this.f71802b = executor;
                this.f71803c = function1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
            
                if (r9.emit(r11, r0) == r1) goto L23;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r11) {
                /*
                    r9 = this;
                    java.lang.String r8 = "Androeed.ru"
                    boolean r0 = r11 instanceof androidx.paging.d2.f.a.C0651a
                    if (r0 == 0) goto L17
                    r0 = r11
                    androidx.paging.d2$f$a$a r0 = (androidx.paging.d2.f.a.C0651a) r0
                    int r1 = r0.f71805b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L17
                    r8 = 3
                    int r1 = r1 - r2
                    r8 = 3
                    r0.f71805b = r1
                    goto L1c
                L17:
                    androidx.paging.d2$f$a$a r0 = new androidx.paging.d2$f$a$a
                    r0.<init>(r11)
                L1c:
                    java.lang.Object r11 = r0.f71804a
                    r8 = 3
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r8 = 4
                    int r2 = r0.f71805b
                    r8 = 5
                    r3 = 0
                    r4 = 4
                    r4 = 2
                    r5 = 1
                    r8 = 4
                    if (r2 == 0) goto L4a
                    if (r2 == r5) goto L42
                    r8 = 5
                    if (r2 != r4) goto L37
                    kotlin.ResultKt.m(r11)
                    goto L7b
                L37:
                    r8 = 6
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r8 = 1
                    r9.<init>(r10)
                    r8 = 3
                    throw r9
                L42:
                    java.lang.Object r9 = r0.f71806c
                    kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                    kotlin.ResultKt.m(r11)
                    goto L6e
                L4a:
                    kotlin.ResultKt.m(r11)
                    kotlinx.coroutines.flow.j r11 = r9.f71801a
                    r8 = 3
                    androidx.paging.g1 r10 = (androidx.paging.g1) r10
                    java.util.concurrent.Executor r2 = r9.f71802b
                    kotlinx.coroutines.n0 r2 = kotlinx.coroutines.b2.c(r2)
                    r8 = 6
                    androidx.paging.d2$g r6 = new androidx.paging.d2$g
                    kotlin.jvm.functions.Function1 r9 = r9.f71803c
                    r6.<init>(r10, r9, r3)
                    r0.f71806c = r11
                    r0.f71805b = r5
                    java.lang.Object r9 = kotlinx.coroutines.i.h(r2, r6, r0)
                    if (r9 != r1) goto L6b
                    goto L79
                L6b:
                    r7 = r11
                    r11 = r9
                    r9 = r7
                L6e:
                    r8 = 5
                    r0.f71806c = r3
                    r0.f71805b = r4
                    java.lang.Object r9 = r9.emit(r11, r0)
                    if (r9 != r1) goto L7b
                L79:
                    r8 = 0
                    return r1
                L7b:
                    r8 = 6
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d2.f.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, Executor executor, Function1 function1) {
            this.f71798a = iVar;
            this.f71799b = executor;
            this.f71800c = function1;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71798a.collect(new a(jVar, this.f71799b, this.f71800c), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class g<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super g1<R>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1<T> f71809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, R> f71810c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1$1", f = "PagingDataTransforms.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super R>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71811a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f71812b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<T, R> f71813c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super T, ? extends R> function1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f71813c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f71813c, dVar);
                aVar.f71812b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f71811a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return this.f71813c.invoke((T) this.f71812b);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull T t10, @Nullable kotlin.coroutines.d<? super R> dVar) {
                return ((a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(g1<T> g1Var, Function1<? super T, ? extends R> function1, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f71809b = g1Var;
            this.f71810c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new g(this.f71809b, this.f71810c, dVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.d2$g<R> for r6v3 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 6
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f71808a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L10
                kotlin.ResultKt.m(r7)
                return r7
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 7
                java.lang.String r7 = "unsi th/t u/ letoeeroba/ irkseirc/oolw vco/ //f/nem"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                kotlin.ResultKt.m(r7)
                androidx.paging.g1<T> r7 = r6.f71809b
                androidx.paging.d2$g$a r1 = new androidx.paging.d2$g$a
                r5 = 2
                kotlin.jvm.functions.Function1<T, R> r3 = r6.f71810c
                r4 = 0
                r1.<init>(r3, r4)
                r5 = 1
                r6.f71808a = r2
                r5 = 0
                java.lang.Object r6 = r7.e(r1, r6)
                r5 = 6
                if (r6 != r0) goto L35
                return r0
            L35:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d2.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super g1<R>> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.annotation.j
    @oj.i(name = "filter")
    @NotNull
    public static final <T> x1<T> a(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new x1<>(new a(x1Var.j(), executor, predicate), x1Var.l(), x1Var.k(), null, 8, null);
    }

    @androidx.annotation.j
    @NotNull
    public static final <T, R> x1<R> b(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new x1<>(new c(x1Var.j(), executor, transform), x1Var.l(), x1Var.k(), null, 8, null);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <R, T extends R> x1<R> c(@NotNull x1<T> x1Var, @NotNull f3 terminalSeparatorType, @NotNull Executor executor, @NotNull Function2<? super T, ? super T, ? extends R> generator) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return c2.i(x1Var, terminalSeparatorType, new e(executor, generator, null));
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <R, T extends R> x1<R> d(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function2<? super T, ? super T, ? extends R> generator) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return e(x1Var, null, executor, generator, 1, null);
    }

    public static /* synthetic */ x1 e(x1 x1Var, f3 f3Var, Executor executor, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f3Var = f3.FULLY_COMPLETE;
        }
        return b2.k(x1Var, f3Var, executor, function2);
    }

    @androidx.annotation.j
    @NotNull
    public static final <T, R> x1<R> f(@NotNull x1<T> x1Var, @NotNull Executor executor, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new x1<>(new f(x1Var.j(), executor, transform), x1Var.l(), x1Var.k(), null, 8, null);
    }
}
