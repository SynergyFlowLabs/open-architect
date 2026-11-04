package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagingDataTransforms.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,165:1\n32#1,2:171\n34#1,3:178\n32#1,2:181\n34#1,3:188\n32#1,2:191\n34#1,3:198\n53#2:166\n55#2:170\n53#2:173\n55#2:177\n53#2:183\n55#2:187\n53#2:193\n55#2:197\n50#3:167\n55#3:169\n50#3:174\n55#3:176\n50#3:184\n55#3:186\n50#3:194\n55#3:196\n107#4:168\n107#4:175\n107#4:185\n107#4:195\n*S KotlinDebug\n*F\n+ 1 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n*L\n46#1:171,2\n46#1:178,3\n56#1:181,2\n56#1:188,3\n65#1:191,2\n65#1:198,3\n33#1:166\n33#1:170\n46#1:173\n46#1:177\n56#1:183\n56#1:187\n65#1:193\n65#1:197\n33#1:167\n33#1:169\n46#1:174\n46#1:176\n56#1:184\n56#1:186\n65#1:194\n65#1:196\n33#1:168\n46#1:175\n56#1:185\n65#1:195\n*E\n"})
public final /* synthetic */ class c2 {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<g1<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f71571b;

        /* JADX INFO: renamed from: androidx.paging.c2$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n65#3:225\n*E\n"})
        public static final class C0636a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71572a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f71573b;

            /* JADX INFO: renamed from: androidx.paging.c2$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0637a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71574a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71575b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71576c;

                public C0637a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71574a = obj;
                    this.f71575b |= Integer.MIN_VALUE;
                    return C0636a.this.emit(null, this);
                }
            }

            public C0636a(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f71572a = jVar;
                this.f71573b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0016  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L23;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    java.lang.String r6 = "Androeed.ru"
                    boolean r0 = r9 instanceof androidx.paging.c2.a.C0636a.C0637a
                    r6 = 3
                    if (r0 == 0) goto L16
                    r0 = r9
                    androidx.paging.c2$a$a$a r0 = (androidx.paging.c2.a.C0636a.C0637a) r0
                    int r1 = r0.f71575b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L16
                    int r1 = r1 - r2
                    r0.f71575b = r1
                    goto L1d
                L16:
                    r6 = 0
                    androidx.paging.c2$a$a$a r0 = new androidx.paging.c2$a$a$a
                    r6 = 1
                    r0.<init>(r9)
                L1d:
                    java.lang.Object r9 = r0.f71574a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 0
                    int r2 = r0.f71575b
                    r3 = 7
                    r3 = 2
                    r4 = 1
                    r6 = 1
                    if (r2 == 0) goto L46
                    if (r2 == r4) goto L3e
                    r6 = 2
                    if (r2 != r3) goto L35
                    kotlin.ResultKt.m(r9)
                    goto L6f
                L35:
                    r6 = 3
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3e:
                    java.lang.Object r7 = r0.f71576c
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    goto L60
                L46:
                    r6 = 1
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f71572a
                    androidx.paging.g1 r8 = (androidx.paging.g1) r8
                    kotlin.jvm.functions.Function2 r7 = r7.f71573b
                    r6 = 1
                    r0.f71576c = r9
                    r0.f71575b = r4
                    r6 = 6
                    java.lang.Object r7 = r8.a(r7, r0)
                    if (r7 != r1) goto L5d
                    goto L6e
                L5d:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L60:
                    r8 = 4
                    r8 = 0
                    r6 = 3
                    r0.f71576c = r8
                    r0.f71575b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    r6 = 5
                    if (r7 != r1) goto L6f
                L6e:
                    return r1
                L6f:
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c2.a.C0636a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f71570a = iVar;
            this.f71571b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super g1<Object>> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71570a.collect(new C0636a(jVar, this.f71571b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class b implements kotlinx.coroutines.flow.i<g1<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f71579b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n56#3:225\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f71581b;

            /* JADX INFO: renamed from: androidx.paging.c2$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0638a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71582a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71583b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71584c;

                public C0638a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71582a = obj;
                    this.f71583b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f71580a = jVar;
                this.f71581b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L23;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    java.lang.String r6 = "Androeed.ru"
                    boolean r0 = r9 instanceof androidx.paging.c2.b.a.C0638a
                    if (r0 == 0) goto L18
                    r0 = r9
                    r6 = 2
                    androidx.paging.c2$b$a$a r0 = (androidx.paging.c2.b.a.C0638a) r0
                    int r1 = r0.f71583b
                    r6 = 6
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L18
                    int r1 = r1 - r2
                    r0.f71583b = r1
                    r6 = 1
                    goto L1d
                L18:
                    androidx.paging.c2$b$a$a r0 = new androidx.paging.c2$b$a$a
                    r0.<init>(r9)
                L1d:
                    java.lang.Object r9 = r0.f71582a
                    r6 = 1
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 2
                    int r2 = r0.f71583b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L48
                    if (r2 == r4) goto L3f
                    r6 = 0
                    if (r2 != r3) goto L35
                    kotlin.ResultKt.m(r9)
                    r6 = 4
                    goto L6e
                L35:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r6 = 4
                    r7.<init>(r8)
                    r6 = 1
                    throw r7
                L3f:
                    java.lang.Object r7 = r0.f71584c
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    r6 = 4
                    goto L61
                L48:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f71580a
                    androidx.paging.g1 r8 = (androidx.paging.g1) r8
                    kotlin.jvm.functions.Function2 r7 = r7.f71581b
                    r0.f71584c = r9
                    r6 = 2
                    r0.f71583b = r4
                    java.lang.Object r7 = r8.c(r7, r0)
                    r6 = 3
                    if (r7 != r1) goto L5e
                    goto L6d
                L5e:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L61:
                    r8 = 0
                    r6 = r8
                    r0.f71584c = r8
                    r0.f71583b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L6e
                L6d:
                    return r1
                L6e:
                    r6 = 2
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c2.b.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public b(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f71578a = iVar;
            this.f71579b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super g1<Object>> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71578a.collect(new a(jVar, this.f71579b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertFooterItem$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<T, T, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f71587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f71588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T t10, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f71588c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f71586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f71587b == null) {
                return this.f71588c;
            }
            return null;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t10, @Nullable T t11, @Nullable kotlin.coroutines.d<? super T> dVar) {
            c cVar = new c(this.f71588c, dVar);
            cVar.f71587b = t11;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1", f = "PagingDataTransforms.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<T, T, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f71590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f71591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t10, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f71591c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f71589a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (this.f71590b == null) {
                return this.f71591c;
            }
            return null;
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t10, @Nullable T t11, @Nullable kotlin.coroutines.d<? super T> dVar) {
            d dVar2 = new d(this.f71591c, dVar);
            dVar2.f71590b = t10;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class e implements kotlinx.coroutines.flow.i<g1<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f71593b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n46#3:225\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f71595b;

            /* JADX INFO: renamed from: androidx.paging.c2$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", i = {}, l = {225, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0639a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71596a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71597b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71598c;

                public C0639a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71596a = obj;
                    this.f71597b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f71594a = jVar;
                this.f71595b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    java.lang.String r6 = "Androeed.ru"
                    boolean r0 = r9 instanceof androidx.paging.c2.e.a.C0639a
                    if (r0 == 0) goto L19
                    r0 = r9
                    r6 = 4
                    androidx.paging.c2$e$a$a r0 = (androidx.paging.c2.e.a.C0639a) r0
                    r6 = 0
                    int r1 = r0.f71597b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    r6 = 1
                    if (r3 == 0) goto L19
                    int r1 = r1 - r2
                    r6 = 0
                    r0.f71597b = r1
                    goto L1e
                L19:
                    androidx.paging.c2$e$a$a r0 = new androidx.paging.c2$e$a$a
                    r0.<init>(r9)
                L1e:
                    java.lang.Object r9 = r0.f71596a
                    r6 = 5
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f71597b
                    r3 = 2
                    r6 = 5
                    r4 = 1
                    if (r2 == 0) goto L48
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L34
                    kotlin.ResultKt.m(r9)
                    goto L6f
                L34:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "bosenw/l seif//ukcorot cm e th/uvaotrelor/ ni/ i//e"
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3e:
                    java.lang.Object r7 = r0.f71598c
                    r6 = 3
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    r6 = 7
                    goto L62
                L48:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f71594a
                    androidx.paging.g1 r8 = (androidx.paging.g1) r8
                    r6 = 1
                    kotlin.jvm.functions.Function2 r7 = r7.f71595b
                    r0.f71598c = r9
                    r0.f71597b = r4
                    java.lang.Object r7 = r8.e(r7, r0)
                    r6 = 1
                    if (r7 != r1) goto L5e
                    goto L6e
                L5e:
                    r5 = r9
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L62:
                    r6 = 2
                    r8 = 0
                    r0.f71598c = r8
                    r0.f71597b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L6f
                L6e:
                    return r1
                L6f:
                    r6 = 1
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    r6 = 1
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c2.e.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f71592a = iVar;
            this.f71593b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super g1<Object>> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71592a.collect(new a(jVar, this.f71593b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class f<R> implements kotlinx.coroutines.flow.i<g1<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f71600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f71601b;

        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f71602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f71603b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f71602a = obj;
                this.f71603b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f71605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f71606b;

            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2", f = "PagingDataTransforms.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f71607a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f71608b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f71609c;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71607a = obj;
                    this.f71608b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f71605a = jVar;
                this.f71606b = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.h0.e(4);
                new a(dVar);
                kotlin.jvm.internal.h0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f71605a;
                Object objInvoke = this.f71606b.invoke((g1) obj, dVar);
                kotlin.jvm.internal.h0.e(0);
                jVar.emit(objInvoke, dVar);
                kotlin.jvm.internal.h0.e(1);
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.c2.f.b.a
                    if (r0 == 0) goto L17
                    r0 = r9
                    r6 = 4
                    androidx.paging.c2$f$b$a r0 = (androidx.paging.c2.f.b.a) r0
                    int r1 = r0.f71608b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r6 = 0
                    r3 = r1 & r2
                    if (r3 == 0) goto L17
                    int r1 = r1 - r2
                    r6 = 0
                    r0.f71608b = r1
                    r6 = 3
                    goto L1c
                L17:
                    androidx.paging.c2$f$b$a r0 = new androidx.paging.c2$f$b$a
                    r0.<init>(r9)
                L1c:
                    java.lang.Object r9 = r0.f71607a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f71608b
                    r3 = 2
                    r6 = 7
                    r4 = 1
                    if (r2 == 0) goto L44
                    if (r2 == r4) goto L3a
                    if (r2 != r3) goto L32
                    kotlin.ResultKt.m(r9)
                    r6 = 0
                    goto L6c
                L32:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3a:
                    r6 = 4
                    java.lang.Object r7 = r0.f71609c
                    r6 = 3
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    goto L5f
                L44:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f71605a
                    androidx.paging.g1 r8 = (androidx.paging.g1) r8
                    r6 = 7
                    kotlin.jvm.functions.Function2 r7 = r7.f71606b
                    r6 = 1
                    r0.f71609c = r9
                    r0.f71608b = r4
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    r6 = 2
                    if (r7 != r1) goto L5b
                    goto L6b
                L5b:
                    r5 = r9
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L5f:
                    r6 = 7
                    r8 = 0
                    r0.f71609c = r8
                    r0.f71608b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L6c
                L6b:
                    return r1
                L6c:
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.c2.f.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f71600a = iVar;
            this.f71601b = function2;
        }

        @Nullable
        public Object c(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f71600a;
            b bVar = new b(jVar, this.f71601b);
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f71600a.collect(new b(jVar, this.f71601b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @androidx.annotation.j
    public static final /* synthetic */ x1 a(x1 x1Var, Function2 predicate) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new x1(new a(x1Var.j(), predicate), x1Var.l(), x1Var.k(), null, 8, null);
    }

    @androidx.annotation.j
    public static final /* synthetic */ x1 b(x1 x1Var, Function2 transform) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 6 & 0;
        return new x1(new b(x1Var.j(), transform), x1Var.l(), x1Var.k(), null, 8, null);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> c(@NotNull x1<T> x1Var, @NotNull f3 terminalSeparatorType, @NotNull T item) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(item, "item");
        return i(x1Var, terminalSeparatorType, new c(item, null));
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> d(@NotNull x1<T> x1Var, @NotNull T item) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        return e(x1Var, null, item, 1, null);
    }

    public static /* synthetic */ x1 e(x1 x1Var, f3 f3Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f3Var = f3.FULLY_COMPLETE;
        }
        return b2.e(x1Var, f3Var, obj);
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> f(@NotNull x1<T> x1Var, @NotNull f3 terminalSeparatorType, @NotNull T item) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(item, "item");
        return i(x1Var, terminalSeparatorType, new d(item, null));
    }

    @oj.j
    @androidx.annotation.j
    @NotNull
    public static final <T> x1<T> g(@NotNull x1<T> x1Var, @NotNull T item) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        return h(x1Var, null, item, 1, null);
    }

    public static /* synthetic */ x1 h(x1 x1Var, f3 f3Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f3Var = f3.FULLY_COMPLETE;
        }
        return b2.h(x1Var, f3Var, obj);
    }

    @androidx.annotation.j
    public static final /* synthetic */ x1 i(x1 x1Var, f3 terminalSeparatorType, pj.n generator) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return new x1(y2.c(x1Var.j(), terminalSeparatorType, generator), x1Var.l(), x1Var.k(), null, 8, null);
    }

    public static /* synthetic */ x1 j(x1 x1Var, f3 f3Var, pj.n nVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f3Var = f3.FULLY_COMPLETE;
        }
        return i(x1Var, f3Var, nVar);
    }

    @androidx.annotation.j
    public static final /* synthetic */ x1 k(x1 x1Var, Function2 transform) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new x1(new e(x1Var.j(), transform), x1Var.l(), x1Var.k(), null, 8, null);
    }

    @NotNull
    public static final <T, R> x1<R> l(@NotNull x1<T> x1Var, @NotNull Function2<? super g1<T>, ? super kotlin.coroutines.d<? super g1<R>>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 3 | 0;
        return new x1<>(new f(x1Var.j(), transform), x1Var.l(), x1Var.k(), null, 8, null);
    }
}
