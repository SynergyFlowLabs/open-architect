package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n55#2,3:109\n*E\n"})
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n f314899b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.y$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {109, 110}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
        public static final class C2309a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314900a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314901b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314903d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314904e;

            public C2309a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314900a = obj;
                this.f314901b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(i iVar, pj.n nVar) {
            this.f314898a = iVar;
            this.f314899b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        
            if (r6 == r1) goto L23;
         */
        @Override // kotlinx.coroutines.flow.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r7, kotlin.coroutines.d<? super kotlin.Unit> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r5 = "Androeed.ru"
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.y.a.C2309a
                if (r0 == 0) goto L17
                r0 = r8
                r0 = r8
                kotlinx.coroutines.flow.y$a$a r0 = (kotlinx.coroutines.flow.y.a.C2309a) r0
                int r1 = r0.f314901b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                r5 = 1
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f314901b = r1
                goto L1c
            L17:
                kotlinx.coroutines.flow.y$a$a r0 = new kotlinx.coroutines.flow.y$a$a
                r0.<init>(r8)
            L1c:
                r5 = 0
                java.lang.Object r8 = r0.f314900a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314901b
                r3 = 2
                r4 = 5
                r4 = 1
                if (r2 == 0) goto L4d
                if (r2 == r4) goto L3d
                if (r2 != r3) goto L33
                kotlin.ResultKt.m(r8)
                r5 = 5
                goto L83
            L33:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 0
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 4
                throw r6
            L3d:
                java.lang.Object r6 = r0.f314904e
                r7 = r6
                r7 = r6
                r5 = 3
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                java.lang.Object r6 = r0.f314903d
                r5 = 4
                kotlinx.coroutines.flow.y$a r6 = (kotlinx.coroutines.flow.y.a) r6
                kotlin.ResultKt.m(r8)
                goto L63
            L4d:
                kotlin.ResultKt.m(r8)
                kotlinx.coroutines.flow.i r8 = r6.f314898a
                r5 = 3
                r0.f314903d = r6
                r0.f314904e = r7
                r0.f314901b = r4
                r5 = 3
                java.lang.Object r8 = kotlinx.coroutines.flow.k.w(r8, r7, r0)
                r5 = 2
                if (r8 != r1) goto L63
                r5 = 2
                goto L82
            L63:
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                r5 = 1
                if (r8 == 0) goto L83
                pj.n r6 = r6.f314899b
                r2 = 0
                r0.f314903d = r2
                r0.f314904e = r2
                r0.f314901b = r3
                r2 = 6
                r5 = 3
                kotlin.jvm.internal.h0.e(r2)
                r5 = 3
                java.lang.Object r6 = r6.invoke(r7, r8, r0)
                r7 = 7
                r5 = r7
                kotlin.jvm.internal.h0.e(r7)
                if (r6 != r1) goto L83
            L82:
                return r1
            L83:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314907c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314906b = obj;
            this.f314907c |= Integer.MIN_VALUE;
            return k.w(null, null, this);
        }
    }

    static final class c<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j<T> f314908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h<Throwable> f314909b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {androidx.media2.widget.f.i.f59793p0}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T> f314912c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f314913d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314912c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314911b = obj;
                this.f314913d |= Integer.MIN_VALUE;
                return this.f314912c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(j<? super T> jVar, i1.h<Throwable> hVar) {
            this.f314908a = jVar;
            this.f314909b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Throwable] */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314913d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314913d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314911b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314913d;
            try {
                if (i11 == 0) {
                    ResultKt.m(obj);
                    j<T> jVar = this.f314908a;
                    aVar.f314910a = this;
                    aVar.f314913d = 1;
                    if (jVar.emit(t10, aVar) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this = (c<T>) Unit.f312394a;
                return this;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:297)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                this = this;
                java.lang.String r4 = "Androeed.ru"
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.y.c.a
                if (r0 == 0) goto L17
                r0 = r7
                r4 = 3
                kotlinx.coroutines.flow.y$c$a r0 = (kotlinx.coroutines.flow.y.c.a) r0
                int r1 = r0.f314913d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = 6
                r3 = r1 & r2
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f314913d = r1
                goto L1d
            L17:
                kotlinx.coroutines.flow.y$c$a r0 = new kotlinx.coroutines.flow.y$c$a
                r4 = 5
                r0.<init>(r5, r7)
            L1d:
                r4 = 7
                java.lang.Object r7 = r0.f314911b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r4 = 7
                int r2 = r0.f314913d
                r4 = 6
                r3 = 1
                if (r2 == 0) goto L41
                if (r2 != r3) goto L38
                java.lang.Object r5 = r0.f314910a
                kotlinx.coroutines.flow.y$c r5 = (kotlinx.coroutines.flow.y.c) r5
                r4 = 5
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L36
                goto L52
            L36:
                r6 = move-exception
                goto L55
            L38:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r4 = 7
                r5.<init>(r6)
                throw r5
            L41:
                kotlin.ResultKt.m(r7)
                kotlinx.coroutines.flow.j<T> r7 = r5.f314908a     // Catch: java.lang.Throwable -> L36
                r0.f314910a = r5     // Catch: java.lang.Throwable -> L36
                r0.f314913d = r3     // Catch: java.lang.Throwable -> L36
                java.lang.Object r5 = r7.emit(r6, r0)     // Catch: java.lang.Throwable -> L36
                if (r5 != r1) goto L52
                r4 = 7
                return r1
            L52:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            L55:
                kotlin.jvm.internal.i1$h<java.lang.Throwable> r5 = r5.f314909b
                r5.f312751a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.c.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314914a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f314914a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(true);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((d) create(th2, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements pj.o<j<? super T>, Throwable, Long, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f314917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f314918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Throwable, kotlin.coroutines.d<? super Boolean>, Object> f314919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j10, Function2<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
            this.f314918d = j10;
            this.f314919e = function2;
        }

        @Override // pj.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l10, kotlin.coroutines.d<? super Boolean> dVar) {
            return k((j) obj, th2, l10.longValue(), dVar);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0043  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314915a;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.m(obj);
                Throwable th2 = (Throwable) this.f314916b;
                if (this.f314917c < this.f314918d) {
                    Function2<Throwable, kotlin.coroutines.d<? super Boolean>, Object> function2 = this.f314919e;
                    this.f314915a = 1;
                    obj = function2.invoke(th2, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    z10 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (!((Boolean) obj).booleanValue()) {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        public final Object k(j<? super T> jVar, Throwable th2, long j10, kotlin.coroutines.d<? super Boolean> dVar) {
            e eVar = new e(this.f314918d, this.f314919e, dVar);
            eVar.f314916b = th2;
            eVar.f314917c = j10;
            return eVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n129#2,15:109\n*E\n"})
    public static final class f<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.o f314921b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {113, 115}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314923b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314925d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314926e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f314927f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            long f314928g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f314929h;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314922a = obj;
                this.f314923b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(i iVar, pj.o oVar) {
            this.f314920a = iVar;
            this.f314921b = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x008d  */
        /* JADX WARN: Code duplicated, block: B:22:0x008f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0099  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[PHI: r2 r5 r6 r13
          0x00d3: PHI (r2v7 int) = (r2v1 int), (r2v9 int) binds: [B:24:0x0097, B:31:0x00cc] A[DONT_GENERATE, DONT_INLINE]
          0x00d3: PHI (r5v5 kotlinx.coroutines.flow.j<? super T>) = (r5v1 kotlinx.coroutines.flow.j<? super T>), (r5v7 kotlinx.coroutines.flow.j<? super T>) binds: [B:24:0x0097, B:31:0x00cc] A[DONT_GENERATE, DONT_INLINE]
          0x00d3: PHI (r6v3 kotlinx.coroutines.flow.y$f<T>) = (r6v0 kotlinx.coroutines.flow.y$f<T>), (r6v4 kotlinx.coroutines.flow.y$f<T>) binds: [B:24:0x0097, B:31:0x00cc] A[DONT_GENERATE, DONT_INLINE]
          0x00d3: PHI (r13v4 long) = (r13v1 long), (r13v8 long) binds: [B:24:0x0097, B:31:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0097 -> B:32:0x00d3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bf -> B:29:0x00c2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlinx.coroutines.flow.i
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r14, kotlin.coroutines.d<? super kotlin.Unit> r15) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y.f.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> i<T> a(@NotNull i<? extends T> iVar, @NotNull pj.n<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return new a(iVar, nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public static final <T> Object b(@NotNull i<? extends T> iVar, @NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Throwable> dVar) throws Throwable {
        b bVar;
        i1.h hVar;
        Throwable th2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f314907c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f314907c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f314906b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f314907c;
        if (i11 == 0) {
            ResultKt.m(obj);
            i1.h hVar2 = new i1.h();
            try {
                j<? super Object> cVar = new c<>(jVar, hVar2);
                bVar.f314905a = hVar2;
                bVar.f314907c = 1;
                if (iVar.collect(cVar, bVar) == objL) {
                    return objL;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                hVar = hVar2;
                th2 = (Throwable) hVar.f312751a;
                if (d(th, th2)) {
                }
                throw th;
            }
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hVar = (i1.h) bVar.f314905a;
        try {
            ResultKt.m(obj);
            return null;
        } catch (Throwable th4) {
            th = th4;
            th2 = (Throwable) hVar.f312751a;
            if (!d(th, th2) || c(th, bVar.getContext())) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                kotlin.p.a(th2, th);
                throw th2;
            }
            kotlin.p.a(th, th2);
            throw th;
        }
    }

    private static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
        p2 p2Var = (p2) coroutineContext.get(p2.M2);
        if (p2Var == null || !p2Var.isCancelled()) {
            return false;
        }
        return d(th2, p2Var.y0());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.areEqual(th3, th2);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, long j10, @NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        if (j10 > 0) {
            return k.A1(iVar, new e(j10, function2, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j10).toString());
    }

    public static /* synthetic */ i f(i iVar, long j10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            function2 = new d(null);
        }
        return k.y1(iVar, j10, function2);
    }

    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar, @NotNull pj.o<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> oVar) {
        return new f(iVar, oVar);
    }
}
