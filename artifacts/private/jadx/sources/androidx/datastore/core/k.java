package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f49508a = new a(null);

    @SourceDebugExtension({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1855#2,2:73\n1#3:75\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion\n*L\n55#1:73,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: androidx.datastore.core.k$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        static final class C0431a extends kotlin.coroutines.jvm.internal.o implements Function2<v<T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f49509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f49510b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<j<T>> f49511c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0431a(List<? extends j<T>> list, kotlin.coroutines.d<? super C0431a> dVar) {
                super(2, dVar);
                this.f49511c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0431a c0431a = new C0431a(this.f49511c, dVar);
                c0431a.f49510b = obj;
                return c0431a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f49509a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    v vVar = (v) this.f49510b;
                    a aVar = k.f49508a;
                    List<j<T>> list = this.f49511c;
                    this.f49509a = 1;
                    if (aVar.c(list, vVar, this) == objL) {
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

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull v<T> vVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0431a) create(vVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, com.planner5d.library.engine.input.f.b.f160707m}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f49512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f49513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f49514c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f49516e;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f49514c = obj;
                this.f49516e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
        @SourceDebugExtension({"SMAP\nDataMigrationInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1789#2,3:73\n*S KotlinDebug\n*F\n+ 1 DataMigrationInitializer.kt\nandroidx/datastore/core/DataMigrationInitializer$Companion$runMigrations$2\n*L\n43#1:73,3\n*E\n"})
        static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f49517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f49518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f49519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f49520d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f49521e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<j<T>> f49522f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<Function1<kotlin.coroutines.d<? super Unit>, Object>> f49523g;

            /* JADX INFO: renamed from: androidx.datastore.core.k$a$c$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
            static final class C0432a extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f49524a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j<T> f49525b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0432a(j<T> jVar, kotlin.coroutines.d<? super C0432a> dVar) {
                    super(1, dVar);
                    this.f49525b = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0432a(this.f49525b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f49524a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        j<T> jVar = this.f49525b;
                        this.f49524a = 1;
                        if (jVar.b(this) == objL) {
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

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0432a) create(dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends j<T>> list, List<Function1<kotlin.coroutines.d<? super Unit>, Object>> list2, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f49522f = list;
                this.f49523g = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f49522f, this.f49523g, dVar);
                cVar.f49521e = obj;
                return cVar;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x005d  */
            /* JADX WARN: Code duplicated, block: B:16:0x0078  */
            /* JADX WARN: Code duplicated, block: B:19:0x0087  */
            /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
                /*
                    r10 = this;
                    r9 = 6
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r9 = 2
                    int r1 = r10.f49520d
                    r2 = 2
                    r9 = r9 ^ r2
                    r3 = 1
                    r9 = 6
                    if (r1 == 0) goto L44
                    if (r1 == r3) goto L2b
                    if (r1 != r2) goto L21
                    java.lang.Object r1 = r10.f49517a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    r9 = 2
                    java.lang.Object r4 = r10.f49521e
                    r9 = 1
                    java.util.List r4 = (java.util.List) r4
                    kotlin.ResultKt.m(r11)
                    r9 = 3
                    goto L57
                L21:
                    r9 = 0
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r9 = 7
                    r10.<init>(r11)
                    throw r10
                L2b:
                    r9 = 7
                    java.lang.Object r1 = r10.f49519c
                    java.lang.Object r4 = r10.f49518b
                    androidx.datastore.core.j r4 = (androidx.datastore.core.j) r4
                    java.lang.Object r5 = r10.f49517a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f49521e
                    java.util.List r6 = (java.util.List) r6
                    kotlin.ResultKt.m(r11)
                    r8 = r6
                    r6 = r4
                    r6 = r4
                    r4 = r8
                    r4 = r8
                    r9 = 6
                    goto L7d
                L44:
                    kotlin.ResultKt.m(r11)
                    r9 = 5
                    java.lang.Object r11 = r10.f49521e
                    r9 = 1
                    java.util.List<androidx.datastore.core.j<T>> r1 = r10.f49522f
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    r9 = 3
                    java.util.List<kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object>> r4 = r10.f49523g
                    r9 = 4
                    java.util.Iterator r1 = r1.iterator()
                L57:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto La9
                    r9 = 3
                    java.lang.Object r5 = r1.next()
                    r9 = 1
                    androidx.datastore.core.j r5 = (androidx.datastore.core.j) r5
                    r10.f49521e = r4
                    r9 = 6
                    r10.f49517a = r1
                    r10.f49518b = r5
                    r10.f49519c = r11
                    r10.f49520d = r3
                    java.lang.Object r6 = r5.a(r11, r10)
                    r9 = 0
                    if (r6 != r0) goto L78
                    goto La2
                L78:
                    r8 = r1
                    r1 = r11
                    r11 = r6
                    r6 = r5
                    r5 = r8
                L7d:
                    r9 = 3
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    r9 = 2
                    if (r11 == 0) goto La6
                    r9 = 6
                    androidx.datastore.core.k$a$c$a r11 = new androidx.datastore.core.k$a$c$a
                    r7 = 0
                    r11.<init>(r6, r7)
                    r4.add(r11)
                    r10.f49521e = r4
                    r10.f49517a = r5
                    r10.f49518b = r7
                    r10.f49519c = r7
                    r10.f49520d = r2
                    java.lang.Object r11 = r6.c(r1, r10)
                    r9 = 7
                    if (r11 != r0) goto La3
                La2:
                    return r0
                La3:
                    r1 = r5
                    r9 = 5
                    goto L57
                La6:
                    r11 = r1
                    r9 = 5
                    goto La3
                La9:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.k.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, @Nullable kotlin.coroutines.d<? super T> dVar) {
                return ((c) create(t10, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0081  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0079->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009a -> B:25:0x0079). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009d -> B:25:0x0079). Please report as a decompilation issue!!! */
        public final <T> Object c(List<? extends j<T>> list, v<T> vVar, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
            b bVar;
            List list2;
            Iterator<T> it;
            i1.h hVar;
            Throwable th2;
            Function1 function1;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f49516e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f49516e = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f49514c;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f49516e;
            int i12 = 0 << 1;
            if (i11 == 0) {
                ResultKt.m(obj);
                ArrayList arrayList = new ArrayList();
                Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                bVar.f49512a = arrayList;
                bVar.f49516e = 1;
                if (vVar.a(cVar, bVar) != objL) {
                    list2 = arrayList;
                }
                return objL;
            }
            if (i11 == 1) {
                list2 = (List) bVar.f49512a;
                ResultKt.m(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f49513b;
                hVar = (i1.h) bVar.f49512a;
                try {
                    ResultKt.m(obj);
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    boolean r0 = r9 instanceof androidx.datastore.core.k.a.b
                    if (r0 == 0) goto L16
                    r0 = r9
                    androidx.datastore.core.k$a$b r0 = (androidx.datastore.core.k.a.b) r0
                    int r1 = r0.f49516e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = 6
                    r3 = r1 & r2
                    r5 = 0
                    if (r3 == 0) goto L16
                    r5 = 7
                    int r1 = r1 - r2
                    r0.f49516e = r1
                    goto L1b
                L16:
                    androidx.datastore.core.k$a$b r0 = new androidx.datastore.core.k$a$b
                    r0.<init>(r9)
                L1b:
                    java.lang.Object r6 = r0.f49514c
                    java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 0
                    int r1 = r0.f49516e
                    r2 = 3
                    r2 = 2
                    r3 = 1
                    int r5 = r5 << r3
                    if (r1 == 0) goto L50
                    if (r1 == r3) goto L47
                    if (r1 != r2) goto L3e
                    r5 = 6
                    java.lang.Object r7 = r0.f49513b
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.f49512a
                    kotlin.jvm.internal.i1$h r8 = (kotlin.jvm.internal.i1.h) r8
                    kotlin.ResultKt.m(r6)     // Catch: java.lang.Throwable -> L3c
                    r5 = 6
                    goto L79
                L3c:
                    r6 = move-exception
                    goto L96
                L3e:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    r5 = 1
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L47:
                    java.lang.Object r7 = r0.f49512a
                    java.util.List r7 = (java.util.List) r7
                    kotlin.ResultKt.m(r6)
                    r5 = 4
                    goto L6d
                L50:
                    kotlin.ResultKt.m(r6)
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    androidx.datastore.core.k$a$c r1 = new androidx.datastore.core.k$a$c
                    r4 = 0
                    r1.<init>(r7, r6, r4)
                    r0.f49512a = r6
                    r5 = 3
                    r0.f49516e = r3
                    java.lang.Object r7 = r8.a(r1, r0)
                    r5 = 7
                    if (r7 != r9) goto L6c
                    r5 = 3
                    goto L95
                L6c:
                    r7 = r6
                L6d:
                    kotlin.jvm.internal.i1$h r6 = new kotlin.jvm.internal.i1$h
                    r6.<init>()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                    r8 = r6
                L79:
                    r5 = 7
                    boolean r6 = r7.hasNext()
                    r5 = 0
                    if (r6 == 0) goto La8
                    r5 = 6
                    java.lang.Object r6 = r7.next()
                    kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                    r0.f49512a = r8     // Catch: java.lang.Throwable -> L3c
                    r5 = 0
                    r0.f49513b = r7     // Catch: java.lang.Throwable -> L3c
                    r0.f49516e = r2     // Catch: java.lang.Throwable -> L3c
                    java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L3c
                    if (r6 != r9) goto L79
                L95:
                    return r9
                L96:
                    T r1 = r8.f312751a
                    if (r1 != 0) goto L9d
                    r8.f312751a = r6
                    goto L79
                L9d:
                    r5 = 0
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    r5 = 1
                    kotlin.p.a(r1, r6)
                    goto L79
                La8:
                    T r6 = r8.f312751a
                    java.lang.Throwable r6 = (java.lang.Throwable) r6
                    if (r6 != 0) goto Lb1
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                Lb1:
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.k.a.c(java.util.List, androidx.datastore.core.v, kotlin.coroutines.d):java.lang.Object");
            }

            @NotNull
            public final <T> Function2<v<T>, kotlin.coroutines.d<? super Unit>, Object> b(@NotNull List<? extends j<T>> migrations) {
                Intrinsics.checkNotNullParameter(migrations, "migrations");
                return new C0431a(migrations, null);
            }

            private a() {
            }
        }
    }
