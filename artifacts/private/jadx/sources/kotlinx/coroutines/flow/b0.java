package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.e2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n49#2:215\n51#2:219\n49#2:220\n51#2:224\n46#3:216\n51#3:218\n46#3:221\n51#3:223\n105#4:217\n105#4:222\n105#4:225\n1#5:226\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n43#1:215\n43#1:219\n70#1:220\n70#1:224\n43#1:216\n43#1:218\n70#1:221\n70#1:223\n43#1:217\n70#1:222\n78#1:225\n*E\n"})
final /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f314065a = kotlinx.coroutines.internal.c1.b(k.f314634a, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class a<R> implements i<i<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314067b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.b0$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        public static final class C2275a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f314068a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314069b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.b0$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
            public static final class C2276a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314070a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314071b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f314072c;

                public C2276a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314070a = obj;
                    this.f314071b |= Integer.MIN_VALUE;
                    return C2275a.this.emit(null, this);
                }
            }

            public C2275a(j jVar, Function2 function2) {
                this.f314068a = jVar;
                this.f314069b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001a  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    java.lang.String r6 = "Androeed.ru"
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.b0.a.C2275a.C2276a
                    r6 = 7
                    if (r0 == 0) goto L1a
                    r0 = r9
                    r0 = r9
                    r6 = 6
                    kotlinx.coroutines.flow.b0$a$a$a r0 = (kotlinx.coroutines.flow.b0.a.C2275a.C2276a) r0
                    r6 = 3
                    int r1 = r0.f314071b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L1a
                    int r1 = r1 - r2
                    r0.f314071b = r1
                    r6 = 0
                    goto L20
                L1a:
                    kotlinx.coroutines.flow.b0$a$a$a r0 = new kotlinx.coroutines.flow.b0$a$a$a
                    r6 = 5
                    r0.<init>(r9)
                L20:
                    r6 = 4
                    java.lang.Object r9 = r0.f314070a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f314071b
                    r3 = 2
                    r6 = r3
                    r4 = 1
                    r6 = 7
                    if (r2 == 0) goto L4b
                    if (r2 == r4) goto L41
                    if (r2 != r3) goto L37
                    kotlin.ResultKt.m(r9)
                    goto L72
                L37:
                    r6 = 3
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    r6 = 4
                    throw r7
                L41:
                    java.lang.Object r7 = r0.f314072c
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    r6 = 6
                    kotlin.ResultKt.m(r9)
                    r6 = 3
                    goto L63
                L4b:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f314068a
                    kotlin.jvm.functions.Function2 r7 = r7.f314069b
                    r6 = 4
                    r0.f314072c = r9
                    r6 = 5
                    r0.f314071b = r4
                    r6 = 2
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    if (r7 != r1) goto L60
                    goto L70
                L60:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L63:
                    r6 = 3
                    r8 = 0
                    r0.f314072c = r8
                    r6 = 3
                    r0.f314071b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L72
                L70:
                    r6 = 3
                    return r1
                L72:
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.a.C2275a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(i iVar, Function2 function2) {
            this.f314066a = iVar;
            this.f314067b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314066a.collect(new C2275a(jVar, this.f314067b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {189, 189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super i<? extends R>>, Object> f314077d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f314077d = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.b0$b<R, T> for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f314074a
                r2 = 2
                r3 = 1
                r5 = 7
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r7)
                goto L50
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 4
                java.lang.String r7 = "ttswe/reentoermeo nrfisbuo/vk/ /  /a/ui/ olheclico/"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1f:
                java.lang.Object r1 = r6.f314075b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L40
            L27:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f314075b
                r1 = r7
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f314076c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, java.lang.Object> r4 = r6.f314077d
                r6.f314075b = r1
                r6.f314074a = r3
                java.lang.Object r7 = r4.invoke(r7, r6)
                r5 = 4
                if (r7 != r0) goto L40
                goto L4f
            L40:
                kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.i) r7
                r5 = 6
                r3 = 0
                r5 = 5
                r6.f314075b = r3
                r6.f314074a = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.k.o0(r1, r7, r6)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.b0$b<R, T> for r3v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
            /*
                r3 = this;
                r2 = 7
                java.lang.Object r4 = r3.f314075b
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r0 = r3.f314076c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, java.lang.Object> r1 = r3.f314077d
                r2 = 6
                java.lang.Object r0 = r1.invoke(r0, r3)
                r2 = 1
                kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.i) r0
                r2 = 3
                r1 = 0
                r2 = 1
                kotlin.jvm.internal.h0.e(r1)
                r2 = 7
                kotlinx.coroutines.flow.k.o0(r4, r0, r3)
                r3 = 1
                kotlin.jvm.internal.h0.e(r3)
                kotlin.Unit r3 = kotlin.Unit.f312394a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.b.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        public final Object invoke(j<? super R> jVar, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f314077d, dVar);
            bVar.f314075b = jVar;
            bVar.f314076c = t10;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class c<R> implements i<i<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314079b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f314080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314081b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.b0$c$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
            public static final class C2277a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314082a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314083b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f314084c;

                public C2277a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314082a = obj;
                    this.f314083b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, Function2 function2) {
                this.f314080a = jVar;
                this.f314081b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L24;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    java.lang.String r6 = "Androeed.ru"
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.b0.c.a.C2277a
                    r6 = 5
                    if (r0 == 0) goto L17
                    r0 = r9
                    r6 = 7
                    kotlinx.coroutines.flow.b0$c$a$a r0 = (kotlinx.coroutines.flow.b0.c.a.C2277a) r0
                    int r1 = r0.f314083b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L17
                    int r1 = r1 - r2
                    r0.f314083b = r1
                    goto L1d
                L17:
                    kotlinx.coroutines.flow.b0$c$a$a r0 = new kotlinx.coroutines.flow.b0$c$a$a
                    r6 = 3
                    r0.<init>(r9)
                L1d:
                    java.lang.Object r9 = r0.f314082a
                    r6 = 3
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f314083b
                    r6 = 2
                    r3 = 2
                    r4 = 1
                    r6 = r4
                    if (r2 == 0) goto L47
                    r6 = 5
                    if (r2 == r4) goto L3f
                    r6 = 7
                    if (r2 != r3) goto L36
                    kotlin.ResultKt.m(r9)
                    goto L6d
                L36:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    r6 = 2
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3f:
                    java.lang.Object r7 = r0.f314084c
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    goto L5f
                L47:
                    r6 = 5
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f314080a
                    kotlin.jvm.functions.Function2 r7 = r7.f314081b
                    r0.f314084c = r9
                    r0.f314083b = r4
                    r6 = 4
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    r6 = 5
                    if (r7 != r1) goto L5c
                    goto L6c
                L5c:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L5f:
                    r6 = 7
                    r8 = 0
                    r6 = 3
                    r0.f314084c = r8
                    r0.f314083b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L6d
                L6c:
                    return r1
                L6d:
                    r6 = 7
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.c.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(i iVar, Function2 function2) {
            this.f314078a = iVar;
            this.f314079b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314078a.collect(new a(jVar, this.f314079b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    public static final class d<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314086a;

        public d(i iVar) {
            this.f314086a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objCollect = this.f314086a.collect(new e(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    static final class e<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j<T> f314087a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e<T> f314089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314090c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(e<? super T> eVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314089b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314088a = obj;
                this.f314090c |= Integer.MIN_VALUE;
                return this.f314089b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        e(j<? super T> jVar) {
            this.f314087a = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i<? extends T> iVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314090c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314090c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314088a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314090c;
            int i12 = 7 << 1;
            if (i11 == 0) {
                ResultKt.m(obj);
                j<T> jVar = this.f314087a;
                aVar.f314090c = 1;
                if (k.o0(jVar, iVar, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
    static final class f<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f314094d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.f314094d = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.b0$f<R, T> for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 1
                int r1 = r6.f314091a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                r5 = 7
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r7)
                goto L51
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 6
                java.lang.String r7 = "frslebt/ wle/rn // seoeuaink/t oimoce/ /utvoc /erio"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1f:
                java.lang.Object r1 = r6.f314092b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L43
            L27:
                kotlin.ResultKt.m(r7)
                r5 = 1
                java.lang.Object r7 = r6.f314092b
                r1 = r7
                r1 = r7
                r5 = 0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f314093c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r6.f314094d
                r6.f314092b = r1
                r6.f314091a = r3
                java.lang.Object r7 = r4.invoke(r7, r6)
                r5 = 4
                if (r7 != r0) goto L43
                r5 = 6
                goto L50
            L43:
                r3 = 0
                r3 = 0
                r6.f314092b = r3
                r6.f314091a = r2
                java.lang.Object r6 = r1.emit(r7, r6)
                r5 = 2
                if (r6 != r0) goto L51
            L50:
                return r0
            L51:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        public final Object invoke(j<? super R> jVar, T t10, kotlin.coroutines.d<? super Unit> dVar) {
            f fVar = new f(this.f314094d, dVar);
            fVar.f314092b = jVar;
            fVar.f314093c = t10;
            return fVar.invokeSuspend(Unit.f312394a);
        }
    }

    @c2
    @NotNull
    public static final <T, R> i<R> a(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return k.H0(new a(iVar, function2));
    }

    @c2
    @NotNull
    public static final <T, R> i<R> b(@NotNull i<? extends T> iVar, @kotlin.b @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return k.f2(iVar, new b(function2, null));
    }

    @c2
    @NotNull
    public static final <T, R> i<R> c(@NotNull i<? extends T> iVar, int i10, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return k.I0(new c(iVar, function2), i10);
    }

    public static /* synthetic */ i d(i iVar, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f314065a;
        }
        return k.E0(iVar, i10, function2);
    }

    @c2
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @c2
    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends i<? extends T>> iVar, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i10).toString());
        }
        if (i10 == 1) {
            return k.H0(iVar);
        }
        return new kotlinx.coroutines.flow.internal.g(iVar, i10, null, 0, null, 28, null);
    }

    public static /* synthetic */ i g(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f314065a;
        }
        return k.I0(iVar, i10);
    }

    public static final int h() {
        return f314065a;
    }

    @e2
    public static /* synthetic */ void i() {
    }

    @e2
    public static /* synthetic */ void j() {
    }

    @c2
    @NotNull
    public static final <T, R> i<R> k(@NotNull i<? extends T> iVar, @kotlin.b @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return k.f2(iVar, new f(function2, null));
    }

    @NotNull
    public static final <T> i<T> l(@NotNull Iterable<? extends i<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.k(iterable, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> i<T> m(@NotNull i<? extends T>... iVarArr) {
        return k.a1(ArraysKt.asIterable(iVarArr));
    }

    @c2
    @NotNull
    public static final <T, R> i<R> n(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return new kotlinx.coroutines.flow.internal.j(nVar, iVar, null, 0, null, 28, null);
    }
}
