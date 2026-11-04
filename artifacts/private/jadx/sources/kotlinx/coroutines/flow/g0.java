package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.c2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n17#1:174\n19#1:178\n17#1:179\n19#1:183\n46#2:168\n51#2:170\n46#2:171\n51#2:173\n46#2:175\n51#2:177\n46#2:180\n51#2:182\n46#2:184\n51#2:186\n46#2:187\n51#2:189\n46#2:190\n51#2:192\n46#2:194\n51#2:196\n105#3:169\n105#3:172\n105#3:176\n105#3:181\n105#3:185\n105#3:188\n105#3:191\n105#3:193\n105#3:195\n105#3:197\n105#3:198\n105#3:200\n1#4:199\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n32#1:174\n32#1:178\n37#1:179\n37#1:183\n17#1:168\n17#1:170\n24#1:171\n24#1:173\n32#1:175\n32#1:177\n37#1:180\n37#1:182\n42#1:184\n42#1:186\n49#1:187\n49#1:189\n56#1:190\n56#1:192\n74#1:194\n74#1:196\n17#1:169\n24#1:172\n32#1:176\n37#1:181\n42#1:185\n49#1:188\n56#1:191\n64#1:193\n74#1:195\n101#1:197\n121#1:198\n152#1:200\n*E\n"})
final /* synthetic */ class g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n153#2,12:109\n165#2:122\n1#3:121\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.i<List<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f314232b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.g0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0}, l = {110, 120}, m = "collect", n = {"$this$chunked_u24lambda_u2413", "result"}, s = {"L$0", "L$1"})
        public static final class C2282a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314233a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314234b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314236d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314237e;

            public C2282a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314233a = obj;
                this.f314234b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, int i10) {
            this.f314231a = iVar;
            this.f314232b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L24;
         */
        @Override // kotlinx.coroutines.flow.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super java.util.List<? extends T>> r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                java.lang.String r6 = "Androeed.ru"
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.g0.a.C2282a
                if (r0 == 0) goto L18
                r0 = r9
                kotlinx.coroutines.flow.g0$a$a r0 = (kotlinx.coroutines.flow.g0.a.C2282a) r0
                int r1 = r0.f314234b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 4
                r3 = r1 & r2
                if (r3 == 0) goto L18
                r6 = 3
                int r1 = r1 - r2
                r6 = 0
                r0.f314234b = r1
                goto L1d
            L18:
                kotlinx.coroutines.flow.g0$a$a r0 = new kotlinx.coroutines.flow.g0$a$a
                r0.<init>(r9)
            L1d:
                java.lang.Object r9 = r0.f314233a
                r6 = 5
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r6 = 6
                int r2 = r0.f314234b
                r6 = 4
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3d
                if (r2 != r3) goto L35
                kotlin.ResultKt.m(r9)
                r6 = 3
                goto L85
            L35:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3d:
                java.lang.Object r7 = r0.f314237e
                r6 = 3
                kotlin.jvm.internal.i1$h r7 = (kotlin.jvm.internal.i1.h) r7
                java.lang.Object r8 = r0.f314236d
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                kotlin.ResultKt.m(r9)
                goto L6e
            L4a:
                kotlin.ResultKt.m(r9)
                kotlin.jvm.internal.i1$h r9 = new kotlin.jvm.internal.i1$h
                r6 = 4
                r9.<init>()
                kotlinx.coroutines.flow.i r2 = r7.f314231a
                r6 = 5
                kotlinx.coroutines.flow.g0$b r5 = new kotlinx.coroutines.flow.g0$b
                r6 = 5
                int r7 = r7.f314232b
                r5.<init>(r9, r7, r8)
                r6 = 0
                r0.f314236d = r8
                r0.f314237e = r9
                r0.f314234b = r4
                r6 = 0
                java.lang.Object r7 = r2.collect(r5, r0)
                if (r7 != r1) goto L6d
                goto L83
            L6d:
                r7 = r9
            L6e:
                T r7 = r7.f312751a
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                r6 = 5
                if (r7 == 0) goto L85
                r6 = 1
                r9 = 0
                r0.f314236d = r9
                r0.f314237e = r9
                r0.f314234b = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L85
            L83:
                r6 = 7
                return r1
            L85:
                r6 = 6
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.a.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$chunked$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
    static final class b<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<ArrayList<T>> f314238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f314239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<List<? extends T>> f314240c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", f = "Transform.kt", i = {0}, l = {159}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314242b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b<T> f314243c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f314244d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314243c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314242b = obj;
                this.f314244d |= Integer.MIN_VALUE;
                return this.f314243c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(i1.h<ArrayList<T>> hVar, int i10, kotlinx.coroutines.flow.j<? super List<? extends T>> jVar) {
            this.f314238a = hVar;
            this.f314239b = i10;
            this.f314240c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.j<java.util.List<? extends T>>] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.ArrayList] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            ?? r10;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314244d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314244d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314242b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314244d;
            if (i11 == 0) {
                ResultKt.m(obj);
                boolean z10 = (T) ((ArrayList) ((ArrayList<T>) this.f314238a.f312751a));
                if (!z10) {
                    r10 = z10;
                    T t11 = (T) new ArrayList(this.f314239b);
                    this.f314238a.f312751a = t11;
                    r10 = t11;
                }
                r10 = z10;
                r10.add(t10);
                if (r10.size() == this.f314239b) {
                    kotlinx.coroutines.flow.j<List<? extends T>> jVar = this.f314240c;
                    aVar.f314241a = this;
                    aVar.f314244d = 1;
                    if (jVar.emit(r10, aVar) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (b) aVar.f314241a;
            ResultKt.m(obj);
            this.f314238a.f312751a = null;
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314246b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314247a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314248b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314247a = obj;
                this.f314248b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2,2:50\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314251b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 50}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314252a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314253b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314255d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f314256e;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314252a = obj;
                    this.f314253b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f314250a = jVar;
                this.f314251b = function2;
            }

            public final Object a(Object obj, kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.h0.e(4);
                new a(dVar);
                kotlin.jvm.internal.h0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f314250a;
                if (((Boolean) this.f314251b.invoke(obj, dVar)).booleanValue()) {
                    kotlin.jvm.internal.h0.e(0);
                    jVar.emit(obj, dVar);
                    kotlin.jvm.internal.h0.e(1);
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0016  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L24;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.g0.c.b.a
                    if (r0 == 0) goto L16
                    r0 = r9
                    r0 = r9
                    r6 = 3
                    kotlinx.coroutines.flow.g0$c$b$a r0 = (kotlinx.coroutines.flow.g0.c.b.a) r0
                    int r1 = r0.f314253b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L16
                    int r1 = r1 - r2
                    r0.f314253b = r1
                    r6 = 6
                    goto L1c
                L16:
                    r6 = 2
                    kotlinx.coroutines.flow.g0$c$b$a r0 = new kotlinx.coroutines.flow.g0$c$b$a
                    r0.<init>(r9)
                L1c:
                    java.lang.Object r9 = r0.f314252a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 7
                    int r2 = r0.f314253b
                    r3 = 2
                    r6 = r3
                    r4 = 1
                    r6 = r6 & r4
                    if (r2 == 0) goto L48
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L33
                    kotlin.ResultKt.m(r9)
                    goto L7d
                L33:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    r6 = 0
                    throw r7
                L3c:
                    java.lang.Object r7 = r0.f314256e
                    r6 = 4
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r8 = r0.f314255d
                    kotlin.ResultKt.m(r9)
                    r6 = 0
                    goto L63
                L48:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f314250a
                    kotlin.jvm.functions.Function2 r7 = r7.f314251b
                    r0.f314255d = r8
                    r6 = 0
                    r0.f314256e = r9
                    r6 = 2
                    r0.f314253b = r4
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    if (r7 != r1) goto L5f
                    r6 = 6
                    goto L7b
                L5f:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                    r7 = r5
                L63:
                    r6 = 4
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L7d
                    r9 = 0
                    r0.f314255d = r9
                    r0.f314256e = r9
                    r6 = 2
                    r0.f314253b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    r6 = 1
                    if (r7 != r1) goto L7d
                L7b:
                    r6 = 5
                    return r1
                L7d:
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    r6 = 3
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.c.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public c(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314245a = iVar;
            this.f314246b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f314245a;
            b bVar = new b(jVar, this.f314246b);
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            int i10 = 1 >> 1;
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314245a.collect(new b(jVar, this.f314246b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class d implements kotlinx.coroutines.flow.i<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314257a;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314258a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314259b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314258a = obj;
                this.f314259b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n32#2:51\n19#2:52\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314261a;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314262a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314263b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f314264c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314265d;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314262a = obj;
                    this.f314263b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar) {
                this.f314261a = jVar;
            }

            public final Object a(Object obj, kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.h0.e(4);
                new a(dVar);
                kotlin.jvm.internal.h0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f314261a;
                Intrinsics.reifiedOperationMarker(3, "R");
                if (obj != null) {
                    kotlin.jvm.internal.h0.e(0);
                    jVar.emit(obj, dVar);
                    kotlin.jvm.internal.h0.e(1);
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                a aVar;
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i10 = aVar.f314263b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f314263b = i10 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(dVar);
                    }
                } else {
                    aVar = new a(dVar);
                }
                Object obj2 = aVar.f314262a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = aVar.f314263b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f314261a;
                    Intrinsics.reifiedOperationMarker(3, "R");
                    if (obj != null) {
                        aVar.f314263b = 1;
                        if (jVar.emit(obj, aVar) == objL) {
                            return objL;
                        }
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

        public d(kotlinx.coroutines.flow.i iVar) {
            this.f314257a = iVar;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f314257a;
            Intrinsics.needClassReification();
            b bVar = new b(jVar);
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super Object> jVar, kotlin.coroutines.d dVar) {
            kotlinx.coroutines.flow.i iVar = this.f314257a;
            Intrinsics.needClassReification();
            Object objCollect = iVar.collect(new b(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class e implements kotlinx.coroutines.flow.i<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d f314268b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n37#2:51\n19#2:52\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.d f314270b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.g0$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            public static final class C2283a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314271a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314272b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f314273c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314274d;

                public C2283a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314271a = obj;
                    this.f314272b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, kotlin.reflect.d dVar) {
                this.f314269a = jVar;
                this.f314270b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0016  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                C2283a c2283a;
                if (dVar instanceof C2283a) {
                    c2283a = (C2283a) dVar;
                    int i10 = c2283a.f314272b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2283a.f314272b = i10 - Integer.MIN_VALUE;
                    } else {
                        c2283a = new C2283a(dVar);
                    }
                } else {
                    c2283a = new C2283a(dVar);
                }
                Object obj2 = c2283a.f314271a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c2283a.f314272b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f314269a;
                    if (this.f314270b.K(obj)) {
                        c2283a.f314272b = 1;
                        if (jVar.emit(obj, c2283a) == objL) {
                            return objL;
                        }
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

        public e(kotlinx.coroutines.flow.i iVar, kotlin.reflect.d dVar) {
            this.f314267a = iVar;
            this.f314268b = dVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super Object> jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314267a.collect(new a(jVar, this.f314268b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class f<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314277b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314278a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314279b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314278a = obj;
                this.f314279b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n25#2,2:50\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314281a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314282b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 50}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314283a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314284b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314286d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f314287e;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314283a = obj;
                    this.f314284b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f314281a = jVar;
                this.f314282b = function2;
            }

            public final Object a(Object obj, kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.h0.e(4);
                new a(dVar);
                kotlin.jvm.internal.h0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f314281a;
                if (!((Boolean) this.f314282b.invoke(obj, dVar)).booleanValue()) {
                    kotlin.jvm.internal.h0.e(0);
                    jVar.emit(obj, dVar);
                    kotlin.jvm.internal.h0.e(1);
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L25;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.g0.f.b.a
                    r6 = 6
                    if (r0 == 0) goto L17
                    r0 = r9
                    kotlinx.coroutines.flow.g0$f$b$a r0 = (kotlinx.coroutines.flow.g0.f.b.a) r0
                    int r1 = r0.f314284b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    r6 = 3
                    if (r3 == 0) goto L17
                    r6 = 3
                    int r1 = r1 - r2
                    r0.f314284b = r1
                    r6 = 5
                    goto L1d
                L17:
                    r6 = 0
                    kotlinx.coroutines.flow.g0$f$b$a r0 = new kotlinx.coroutines.flow.g0$f$b$a
                    r0.<init>(r9)
                L1d:
                    java.lang.Object r9 = r0.f314283a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f314284b
                    r3 = 2
                    r6 = 1
                    r4 = 1
                    if (r2 == 0) goto L4a
                    if (r2 == r4) goto L3c
                    r6 = 3
                    if (r2 != r3) goto L34
                    r6 = 5
                    kotlin.ResultKt.m(r9)
                    goto L80
                L34:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3c:
                    r6 = 4
                    java.lang.Object r7 = r0.f314287e
                    r6 = 7
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    java.lang.Object r8 = r0.f314286d
                    r6 = 7
                    kotlin.ResultKt.m(r9)
                    r6 = 7
                    goto L64
                L4a:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f314281a
                    kotlin.jvm.functions.Function2 r7 = r7.f314282b
                    r6 = 7
                    r0.f314286d = r8
                    r0.f314287e = r9
                    r6 = 3
                    r0.f314284b = r4
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    r6 = 3
                    if (r7 != r1) goto L61
                    goto L7f
                L61:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L64:
                    r6 = 1
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    r6 = 0
                    if (r9 != 0) goto L80
                    r9 = 6
                    r9 = 0
                    r6 = 4
                    r0.f314286d = r9
                    r6 = 0
                    r0.f314287e = r9
                    r0.f314284b = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    r6 = 7
                    if (r7 != r1) goto L80
                L7f:
                    return r1
                L80:
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.f.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314276a = iVar;
            this.f314277b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f314276a;
            b bVar = new b(jVar, this.f314277b);
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314276a.collect(new b(jVar, this.f314277b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class g<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314288a;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n43#2,2:50\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314289a;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.g0$g$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            public static final class C2284a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314290a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314291b;

                public C2284a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314290a = obj;
                    this.f314291b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar) {
                this.f314289a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001b  */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                C2284a c2284a;
                if (dVar instanceof C2284a) {
                    c2284a = (C2284a) dVar;
                    int i10 = c2284a.f314291b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2284a.f314291b = i10 - Integer.MIN_VALUE;
                    } else {
                        c2284a = new C2284a(dVar);
                    }
                } else {
                    c2284a = new C2284a(dVar);
                }
                Object obj = c2284a.f314290a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c2284a.f314291b;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = this.f314289a;
                    if (t10 != null) {
                        c2284a.f314291b = 1;
                        if (jVar.emit(t10, c2284a) == objL) {
                            return objL;
                        }
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

        public g(kotlinx.coroutines.flow.i iVar) {
            this.f314288a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314288a.collect(new a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class h<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314294b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314295a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314296b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314295a = obj;
                this.f314296b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314299b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314300a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314301b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314303d;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314300a = obj;
                    this.f314301b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f314298a = jVar;
                this.f314299b = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object a(Object obj, kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.h0.e(4);
                new a(dVar);
                kotlin.jvm.internal.h0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f314298a;
                Object objInvoke = this.f314299b.invoke(obj, dVar);
                kotlin.jvm.internal.h0.e(0);
                jVar.emit(objInvoke, dVar);
                kotlin.jvm.internal.h0.e(1);
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.g0.h.b.a
                    if (r0 == 0) goto L14
                    r0 = r9
                    kotlinx.coroutines.flow.g0$h$b$a r0 = (kotlinx.coroutines.flow.g0.h.b.a) r0
                    int r1 = r0.f314301b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r6 = 0
                    r3 = r1 & r2
                    if (r3 == 0) goto L14
                    int r1 = r1 - r2
                    r0.f314301b = r1
                    goto L1a
                L14:
                    r6 = 5
                    kotlinx.coroutines.flow.g0$h$b$a r0 = new kotlinx.coroutines.flow.g0$h$b$a
                    r0.<init>(r9)
                L1a:
                    r6 = 1
                    java.lang.Object r9 = r0.f314300a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 5
                    int r2 = r0.f314301b
                    r6 = 5
                    r3 = 2
                    r4 = 1
                    int r6 = r6 << r4
                    if (r2 == 0) goto L45
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L32
                    kotlin.ResultKt.m(r9)
                    goto L6a
                L32:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    r6 = 1
                    throw r7
                L3b:
                    java.lang.Object r7 = r0.f314303d
                    r6 = 5
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    r6 = 1
                    kotlin.ResultKt.m(r9)
                    goto L5b
                L45:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f314298a
                    kotlin.jvm.functions.Function2 r7 = r7.f314299b
                    r0.f314303d = r9
                    r0.f314301b = r4
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    r6 = 7
                    if (r7 != r1) goto L58
                    goto L69
                L58:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                L5b:
                    r6 = 5
                    r8 = 0
                    r6 = 1
                    r0.f314303d = r8
                    r0.f314301b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    r6 = 4
                    if (r7 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    r6 = 1
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.h.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314293a = iVar;
            this.f314294b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f314293a;
            b bVar = new b(jVar, this.f314294b);
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314293a.collect(new b(jVar, this.f314294b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class i<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314305b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314306a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314307b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314306a = obj;
                this.f314307b |= Integer.MIN_VALUE;
                return i.this.collect(null, this);
            }
        }

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n57#2,2:50\n*E\n"})
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314310b;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {50, 51}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
            public static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314311a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314312b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314314d;

                public a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314311a = obj;
                    this.f314312b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f314309a = jVar;
                this.f314310b = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object a(Object obj, kotlin.coroutines.d dVar) {
                kotlin.jvm.internal.h0.e(4);
                new a(dVar);
                kotlin.jvm.internal.h0.e(5);
                kotlinx.coroutines.flow.j jVar = this.f314309a;
                Object objInvoke = this.f314310b.invoke(obj, dVar);
                if (objInvoke != null) {
                    kotlin.jvm.internal.h0.e(0);
                    jVar.emit(objInvoke, dVar);
                    kotlin.jvm.internal.h0.e(1);
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L25;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    r6 = 6
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.g0.i.b.a
                    if (r0 == 0) goto L18
                    r0 = r9
                    kotlinx.coroutines.flow.g0$i$b$a r0 = (kotlinx.coroutines.flow.g0.i.b.a) r0
                    int r1 = r0.f314312b
                    r6 = 0
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r6 = 3
                    r3 = r1 & r2
                    if (r3 == 0) goto L18
                    r6 = 5
                    int r1 = r1 - r2
                    r0.f314312b = r1
                    r6 = 7
                    goto L1e
                L18:
                    r6 = 2
                    kotlinx.coroutines.flow.g0$i$b$a r0 = new kotlinx.coroutines.flow.g0$i$b$a
                    r0.<init>(r9)
                L1e:
                    java.lang.Object r9 = r0.f314311a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f314312b
                    r6 = 3
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L48
                    r6 = 4
                    if (r2 == r4) goto L3f
                    if (r2 != r3) goto L35
                    kotlin.ResultKt.m(r9)
                    r6 = 7
                    goto L70
                L35:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r6 = 4
                    r7.<init>(r8)
                    r6 = 0
                    throw r7
                L3f:
                    java.lang.Object r7 = r0.f314314d
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    r6 = 1
                    goto L60
                L48:
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f314309a
                    r6 = 0
                    kotlin.jvm.functions.Function2 r7 = r7.f314310b
                    r0.f314314d = r9
                    r0.f314312b = r4
                    java.lang.Object r7 = r7.invoke(r8, r0)
                    if (r7 != r1) goto L5c
                    r6 = 0
                    goto L6f
                L5c:
                    r5 = r9
                    r9 = r7
                    r9 = r7
                    r7 = r5
                L60:
                    if (r9 != 0) goto L63
                    goto L70
                L63:
                    r8 = 0
                    r6 = 2
                    r0.f314314d = r8
                    r0.f314312b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L70
                L6f:
                    return r1
                L70:
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.i.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public i(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314304a = iVar;
            this.f314305b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i iVar = this.f314304a;
            b bVar = new b(jVar, this.f314305b);
            int i10 = 6 ^ 0;
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314304a.collect(new b(jVar, this.f314305b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314316b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f314318b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.g0$j$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 51}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
            public static final class C2285a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314319a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f314320b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f314322d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f314323e;

                public C2285a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314319a = obj;
                    this.f314320b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, Function2 function2) {
                this.f314317a = jVar;
                this.f314318b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
            
                if (r6.emit(r7, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    java.lang.String r5 = "Androeed.ru"
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.g0.j.a.C2285a
                    if (r0 == 0) goto L15
                    r0 = r8
                    kotlinx.coroutines.flow.g0$j$a$a r0 = (kotlinx.coroutines.flow.g0.j.a.C2285a) r0
                    int r1 = r0.f314320b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L15
                    int r1 = r1 - r2
                    r0.f314320b = r1
                    goto L1a
                L15:
                    kotlinx.coroutines.flow.g0$j$a$a r0 = new kotlinx.coroutines.flow.g0$j$a$a
                    r0.<init>(r8)
                L1a:
                    java.lang.Object r8 = r0.f314319a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f314320b
                    r3 = 2
                    r4 = 1
                    r5 = r4
                    if (r2 == 0) goto L44
                    if (r2 == r4) goto L38
                    if (r2 != r3) goto L30
                    kotlin.ResultKt.m(r8)
                    r5 = 1
                    goto L7a
                L30:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L38:
                    java.lang.Object r6 = r0.f314323e
                    r5 = 1
                    kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                    java.lang.Object r7 = r0.f314322d
                    r5 = 1
                    kotlin.ResultKt.m(r8)
                    goto L67
                L44:
                    r5 = 4
                    kotlin.ResultKt.m(r8)
                    r5 = 6
                    kotlinx.coroutines.flow.j r8 = r6.f314317a
                    kotlin.jvm.functions.Function2 r6 = r6.f314318b
                    r5 = 3
                    r0.f314322d = r7
                    r0.f314323e = r8
                    r0.f314320b = r4
                    r2 = 6
                    r2 = 6
                    kotlin.jvm.internal.h0.e(r2)
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    r5 = 7
                    r2 = 7
                    kotlin.jvm.internal.h0.e(r2)
                    if (r6 != r1) goto L65
                    goto L79
                L65:
                    r6 = r8
                    r6 = r8
                L67:
                    r5 = 6
                    r8 = 0
                    r0.f314322d = r8
                    r5 = 1
                    r0.f314323e = r8
                    r5 = 1
                    r0.f314320b = r3
                    r5 = 0
                    java.lang.Object r6 = r6.emit(r7, r0)
                    r5 = 7
                    if (r6 != r1) goto L7a
                L79:
                    return r1
                L7a:
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.j.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314315a = iVar;
            this.f314316b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objCollect = this.f314315a.collect(new a(jVar, this.f314316b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n102#2,7:109\n*E\n"})
    public static final class k<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f314324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n f314326c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {110, com.rabbitmq.client.impl.k.b.p.f265340a}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314328b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314330d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314331e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f314332f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314327a = obj;
                this.f314328b |= Integer.MIN_VALUE;
                return k.this.collect(null, this);
            }
        }

        public k(Object obj, kotlinx.coroutines.flow.i iVar, pj.n nVar) {
            this.f314324a = obj;
            this.f314325b = iVar;
            this.f314326c = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            if (r2.collect(r4, r0) == r1) goto L21;
         */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super R> r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                java.lang.String r5 = "Androeed.ru"
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.g0.k.a
                if (r0 == 0) goto L19
                r0 = r8
                kotlinx.coroutines.flow.g0$k$a r0 = (kotlinx.coroutines.flow.g0.k.a) r0
                int r1 = r0.f314328b
                r5 = 0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = 5
                r3 = r1 & r2
                if (r3 == 0) goto L19
                r5 = 7
                int r1 = r1 - r2
                r0.f314328b = r1
                r5 = 7
                goto L1e
            L19:
                kotlinx.coroutines.flow.g0$k$a r0 = new kotlinx.coroutines.flow.g0$k$a
                r0.<init>(r8)
            L1e:
                r5 = 5
                java.lang.Object r8 = r0.f314327a
                r5 = 4
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314328b
                r3 = 2
                r5 = 5
                r4 = 1
                if (r2 == 0) goto L53
                if (r2 == r4) goto L3f
                if (r2 != r3) goto L35
                kotlin.ResultKt.m(r8)
                goto L90
            L35:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "t/sia vht cno/eeeron o/el/ueu otc w ir/sbl/moier/f/"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3f:
                java.lang.Object r6 = r0.f314332f
                kotlin.jvm.internal.i1$h r6 = (kotlin.jvm.internal.i1.h) r6
                java.lang.Object r7 = r0.f314331e
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                java.lang.Object r2 = r0.f314330d
                r5 = 6
                kotlinx.coroutines.flow.g0$k r2 = (kotlinx.coroutines.flow.g0.k) r2
                r5 = 4
                kotlin.ResultKt.m(r8)
                r8 = r6
                r6 = r2
                goto L73
            L53:
                r5 = 3
                kotlin.ResultKt.m(r8)
                r5 = 3
                kotlin.jvm.internal.i1$h r8 = new kotlin.jvm.internal.i1$h
                r8.<init>()
                r5 = 4
                java.lang.Object r2 = r6.f314324a
                r8.f312751a = r2
                r5 = 6
                r0.f314330d = r6
                r0.f314331e = r7
                r0.f314332f = r8
                r0.f314328b = r4
                r5 = 6
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L73
                goto L8f
            L73:
                kotlinx.coroutines.flow.i r2 = r6.f314325b
                kotlinx.coroutines.flow.g0$l r4 = new kotlinx.coroutines.flow.g0$l
                pj.n r6 = r6.f314326c
                r4.<init>(r8, r6, r7)
                r6 = 0
                r0.f314330d = r6
                r0.f314331e = r6
                r5 = 4
                r0.f314332f = r6
                r5 = 0
                r0.f314328b = r3
                r5 = 0
                java.lang.Object r6 = r2.collect(r4, r0)
                r5 = 0
                if (r6 != r1) goto L90
            L8f:
                return r1
            L90:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.k.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    static final class l<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<R> f314333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<R, T, kotlin.coroutines.d<? super R>, Object> f314334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f314335c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {105, com.planner5d.library.engine.input.f.b.f160742x1}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314336a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f314337b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314338c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<T> f314339d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f314340e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(l<? super T> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314339d = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314338c = obj;
                this.f314340e |= Integer.MIN_VALUE;
                return this.f314339d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(i1.h<R> hVar, pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlinx.coroutines.flow.j<? super R> jVar) {
            this.f314333a = hVar;
            this.f314334b = nVar;
            this.f314335c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        
            if (r8.emit((R) r9, r0) == r1) goto L23;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                java.lang.String r7 = "Androeed.ru"
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.g0.l.a
                if (r0 == 0) goto L17
                r0 = r10
                kotlinx.coroutines.flow.g0$l$a r0 = (kotlinx.coroutines.flow.g0.l.a) r0
                int r1 = r0.f314340e
                r7 = 1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                r7 = 3
                if (r3 == 0) goto L17
                int r1 = r1 - r2
                r0.f314340e = r1
                goto L1d
            L17:
                kotlinx.coroutines.flow.g0$l$a r0 = new kotlinx.coroutines.flow.g0$l$a
                r7 = 3
                r0.<init>(r8, r10)
            L1d:
                java.lang.Object r10 = r0.f314338c
                r7 = 0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314340e
                r7 = 0
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4b
                r7 = 4
                if (r2 == r4) goto L3d
                if (r2 != r3) goto L34
                kotlin.ResultKt.m(r10)
                goto L80
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                r7 = 6
                throw r8
            L3d:
                java.lang.Object r8 = r0.f314337b
                kotlin.jvm.internal.i1$h r8 = (kotlin.jvm.internal.i1.h) r8
                java.lang.Object r9 = r0.f314336a
                r7 = 3
                kotlinx.coroutines.flow.g0$l r9 = (kotlinx.coroutines.flow.g0.l) r9
                r7 = 0
                kotlin.ResultKt.m(r10)
                goto L67
            L4b:
                kotlin.ResultKt.m(r10)
                kotlin.jvm.internal.i1$h<R> r10 = r8.f314333a
                pj.n<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r8.f314334b
                T r5 = r10.f312751a
                r0.f314336a = r8
                r0.f314337b = r10
                r7 = 4
                r0.f314340e = r4
                java.lang.Object r9 = r2.invoke(r5, r9, r0)
                if (r9 != r1) goto L63
                r7 = 0
                goto L7f
            L63:
                r6 = r9
                r9 = r8
                r8 = r10
                r10 = r6
            L67:
                r7 = 0
                r8.f312751a = r10
                kotlinx.coroutines.flow.j<R> r8 = r9.f314335c
                kotlin.jvm.internal.i1$h<R> r9 = r9.f314333a
                T r9 = r9.f312751a
                r10 = 0
                r7 = r10
                r0.f314336a = r10
                r0.f314337b = r10
                r7 = 7
                r0.f314340e = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L80
            L7f:
                return r1
            L80:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.l.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n122#2,10:109\n*E\n"})
    public static final class m<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n f314342b;

        public m(kotlinx.coroutines.flow.i iVar, pj.n nVar) {
            this.f314341a = iVar;
            this.f314342b = nVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            i1.h hVar = new i1.h();
            hVar.f312751a = (T) kotlinx.coroutines.flow.internal.u.f314619a;
            Object objCollect = this.f314341a.collect(new n(hVar, this.f314342b, jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    static final class n<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<Object> f314343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n<T, T, kotlin.coroutines.d<? super T>, Object> f314344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f314345c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {127, 129}, m = "emit", n = {"this"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314346a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f314347b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314348c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n<T> f314349d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f314350e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n<? super T> nVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314349d = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314348c = obj;
                this.f314350e |= Integer.MIN_VALUE;
                return this.f314349d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n(i1.h<Object> hVar, pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f314343a = hVar;
            this.f314344b = nVar;
            this.f314345c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            if (r9.emit(r8, r0) == r1) goto L26;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                java.lang.String r7 = "Androeed.ru"
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.g0.n.a
                if (r0 == 0) goto L1c
                r0 = r10
                r0 = r10
                r7 = 4
                kotlinx.coroutines.flow.g0$n$a r0 = (kotlinx.coroutines.flow.g0.n.a) r0
                r7 = 6
                int r1 = r0.f314350e
                r7 = 0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                r7 = 7
                if (r3 == 0) goto L1c
                r7 = 2
                int r1 = r1 - r2
                r0.f314350e = r1
                r7 = 3
                goto L23
            L1c:
                r7 = 6
                kotlinx.coroutines.flow.g0$n$a r0 = new kotlinx.coroutines.flow.g0$n$a
                r7 = 5
                r0.<init>(r8, r10)
            L23:
                java.lang.Object r10 = r0.f314348c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r7 = 2
                int r2 = r0.f314350e
                r3 = 2
                r4 = 1
                r7 = r4
                if (r2 == 0) goto L51
                if (r2 == r4) goto L44
                if (r2 != r3) goto L3a
                kotlin.ResultKt.m(r10)
                r7 = 6
                goto L95
            L3a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "o/s ntouclrnt/awh/u/ki /  fe/to eecml/vroio/ ebseri"
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L44:
                r7 = 7
                java.lang.Object r8 = r0.f314347b
                kotlin.jvm.internal.i1$h r8 = (kotlin.jvm.internal.i1.h) r8
                java.lang.Object r9 = r0.f314346a
                kotlinx.coroutines.flow.g0$n r9 = (kotlinx.coroutines.flow.g0.n) r9
                kotlin.ResultKt.m(r10)
                goto L75
            L51:
                kotlin.ResultKt.m(r10)
                r7 = 4
                kotlin.jvm.internal.i1$h<java.lang.Object> r10 = r8.f314343a
                T r2 = r10.f312751a
                kotlinx.coroutines.internal.z0 r5 = kotlinx.coroutines.flow.internal.u.f314619a
                if (r2 != r5) goto L5f
                r7 = 4
                goto L7a
            L5f:
                pj.n<T, T, kotlin.coroutines.d<? super T>, java.lang.Object> r5 = r8.f314344b
                r0.f314346a = r8
                r0.f314347b = r10
                r0.f314350e = r4
                java.lang.Object r9 = r5.invoke(r2, r9, r0)
                r7 = 0
                if (r9 != r1) goto L6f
                goto L94
            L6f:
                r6 = r9
                r6 = r9
                r9 = r8
                r8 = r10
                r10 = r6
                r10 = r6
            L75:
                r6 = r10
                r10 = r8
                r10 = r8
                r8 = r9
                r9 = r6
            L7a:
                r7 = 0
                r10.f312751a = r9
                r7 = 0
                kotlinx.coroutines.flow.j<T> r9 = r8.f314345c
                kotlin.jvm.internal.i1$h<java.lang.Object> r8 = r8.f314343a
                T r8 = r8.f312751a
                r7 = 3
                r10 = 0
                r7 = 4
                r0.f314346a = r10
                r0.f314347b = r10
                r7 = 5
                r0.f314350e = r3
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L95
            L94:
                return r1
            L95:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g0.n.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n65#2,5:109\n*E\n"})
    public static final class o<T> implements kotlinx.coroutines.flow.i<IndexedValue<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314351a;

        public o(kotlinx.coroutines.flow.i iVar) {
            this.f314351a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super IndexedValue<? extends T>> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objCollect = this.f314351a.collect(new p(jVar, new i1.f()), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,167:1\n29#2,4:168\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n67#1:168,4\n*E\n"})
    static final class p<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<IndexedValue<? extends T>> f314352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.f f314353b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {67}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314354a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p<T> f314355b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314356c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super T> pVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314355b = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314354a = obj;
                this.f314356c |= Integer.MIN_VALUE;
                return this.f314355b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        p(kotlinx.coroutines.flow.j<? super IndexedValue<? extends T>> jVar, i1.f fVar) {
            this.f314352a = jVar;
            this.f314353b = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314356c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314356c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314354a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314356c;
            int i12 = 5 ^ 1;
            if (i11 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j<IndexedValue<? extends T>> jVar = this.f314352a;
                i1.f fVar = this.f314353b;
                int i13 = fVar.f312749a;
                fVar.f312749a = i13 + 1;
                if (i13 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                IndexedValue<? extends T> indexedValue = new IndexedValue<>(i13, t10);
                aVar.f314356c = 1;
                if (jVar.emit(indexedValue, aVar) == objL) {
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

    @c2
    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<List<T>> a(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, int i10) {
        if (i10 >= 1) {
            return new a(iVar, i10);
        }
        throw new IllegalArgumentException(("Expected positive chunk size, but got " + i10).toString());
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return new c(iVar, function2);
    }

    public static final /* synthetic */ <R> kotlinx.coroutines.flow.i<R> c(kotlinx.coroutines.flow.i<?> iVar) {
        Intrinsics.needClassReification();
        return new d(iVar);
    }

    @NotNull
    public static final <R> kotlinx.coroutines.flow.i<R> d(@NotNull kotlinx.coroutines.flow.i<?> iVar, @NotNull kotlin.reflect.d<R> dVar) {
        return new e(iVar, dVar);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return new f(iVar, function2);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> f(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new g(iVar);
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return new h(iVar, function2);
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> h(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return new i(iVar, function2);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> i(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new j(iVar, function2);
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> j(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, R r10, @kotlin.b @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return new k(r10, iVar, nVar);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> k(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar) {
        return new m(iVar, nVar);
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> l(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, R r10, @kotlin.b @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return kotlinx.coroutines.flow.k.B1(iVar, r10, nVar);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<IndexedValue<T>> m(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar) {
        return new o(iVar);
    }
}
