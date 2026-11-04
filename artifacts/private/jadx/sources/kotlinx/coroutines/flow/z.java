package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n105#3:143\n105#3:144\n105#3:145\n105#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n19#1:143\n30#1:144\n49#1:145\n81#1:146\n*E\n"})
final /* synthetic */ class z {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {134}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314940c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314939b = obj;
            this.f314940c |= Integer.MIN_VALUE;
            return z.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super Boolean>, Object> f314941a;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {128}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314943b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f314945d;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314943b = obj;
                this.f314945d |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
            this.f314941a = function2;
        }

        public Object a(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            if (((Boolean) this.f314941a.invoke(t10, dVar)).booleanValue()) {
                return Unit.f312394a;
            }
            throw new kotlinx.coroutines.flow.internal.a(this);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314945d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314945d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f314943b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314945d;
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                Function2<T, kotlin.coroutines.d<? super Boolean>, Object> function2 = this.f314941a;
                aVar.f314942a = this;
                aVar.f314945d = 1;
                objInvoke = function2.invoke(t10, aVar);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (b) aVar.f314942a;
                ResultKt.m(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                return Unit.f312394a;
            }
            throw new kotlinx.coroutines.flow.internal.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n20#2,5:109\n*E\n"})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f314947b;

        public c(kotlinx.coroutines.flow.i iVar, int i10) {
            this.f314946a = iVar;
            this.f314947b = i10;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objCollect = this.f314946a.collect(new d(new i1.f(), this.f314947b, jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.f f314948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f314949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f314950c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {22}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314951a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d<T> f314952b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314953c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f314952b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314951a = obj;
                this.f314953c |= Integer.MIN_VALUE;
                return this.f314952b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(i1.f fVar, int i10, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f314948a = fVar;
            this.f314949b = i10;
            this.f314950c = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314953c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314953c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314951a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314953c;
            if (i11 == 0) {
                ResultKt.m(obj);
                i1.f fVar = this.f314948a;
                int i12 = fVar.f312749a;
                if (i12 < this.f314949b) {
                    fVar.f312749a = i12 + 1;
                    return Unit.f312394a;
                }
                kotlinx.coroutines.flow.j<T> jVar = this.f314950c;
                aVar.f314953c = 1;
                if (jVar.emit(t10, aVar) == objL) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n31#2,10:109\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314955b;

        public e(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314954a = iVar;
            this.f314955b = function2;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objCollect = this.f314954a.collect(new f(new i1.a(), jVar, this.f314955b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    static final class f<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f314956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f314957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super Boolean>, Object> f314958c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {34, 35, 37}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314959a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f314960b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314961c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f<T> f314962d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f314963e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? super T> fVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314962d = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314961c = obj;
                this.f314963e |= Integer.MIN_VALUE;
                return this.f314962d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(i1.a aVar, kotlinx.coroutines.flow.j<? super T> jVar, Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
            this.f314956a = aVar;
            this.f314957b = jVar;
            this.f314958c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0082  */
        /* JADX WARN: Code duplicated, block: B:38:0x009e  */
        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L34;
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
        public final java.lang.Object emit(T r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                java.lang.String r6 = "Androeed.ru"
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.z.f.a
                if (r0 == 0) goto L18
                r0 = r9
                r6 = 2
                kotlinx.coroutines.flow.z$f$a r0 = (kotlinx.coroutines.flow.z.f.a) r0
                int r1 = r0.f314963e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L18
                r6 = 7
                int r1 = r1 - r2
                r6 = 1
                r0.f314963e = r1
                goto L1d
            L18:
                kotlinx.coroutines.flow.z$f$a r0 = new kotlinx.coroutines.flow.z$f$a
                r0.<init>(r7, r9)
            L1d:
                java.lang.Object r9 = r0.f314961c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r6 = 0
                int r2 = r0.f314963e
                r3 = 3
                int r6 = r6 << r3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L51
                r6 = 4
                if (r2 == r5) goto L4c
                r6 = 0
                if (r2 == r4) goto L41
                if (r2 != r3) goto L39
                kotlin.ResultKt.m(r9)
                r6 = 4
                goto L9b
            L39:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L41:
                r6 = 7
                java.lang.Object r8 = r0.f314960b
                java.lang.Object r7 = r0.f314959a
                kotlinx.coroutines.flow.z$f r7 = (kotlinx.coroutines.flow.z.f) r7
                kotlin.ResultKt.m(r9)
                goto L7a
            L4c:
                r6 = 2
                kotlin.ResultKt.m(r9)
                goto L65
            L51:
                kotlin.ResultKt.m(r9)
                kotlin.jvm.internal.i1$a r9 = r7.f314956a
                boolean r9 = r9.f312744a
                if (r9 == 0) goto L68
                kotlinx.coroutines.flow.j<T> r7 = r7.f314957b
                r0.f314963e = r5
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L65
                goto L99
            L65:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L68:
                r6 = 6
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r9 = r7.f314958c
                r6 = 3
                r0.f314959a = r7
                r0.f314960b = r8
                r0.f314963e = r4
                r6 = 5
                java.lang.Object r9 = r9.invoke(r8, r0)
                if (r9 != r1) goto L7a
                goto L99
            L7a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L9e
                kotlin.jvm.internal.i1$a r9 = r7.f314956a
                r6 = 4
                r9.f312744a = r5
                kotlinx.coroutines.flow.j<T> r7 = r7.f314957b
                r9 = 0
                r6 = r9
                r0.f314959a = r9
                r0.f314960b = r9
                r6 = 5
                r0.f314963e = r3
                r6 = 7
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L9b
            L99:
                r6 = 3
                return r1
            L9b:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L9e:
                r6 = 1
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.f.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {71}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314966c;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314965b = obj;
            this.f314966c |= Integer.MIN_VALUE;
            return z.f(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n50#2,4:109\n64#2,4:113\n*E\n"})
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f314968b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.B}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314969a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314970b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314972d;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314969a = obj;
                this.f314970b |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, int i10) {
            this.f314967a = iVar;
            this.f314968b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            Object obj;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314970b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314970b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj2 = aVar.f314969a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314970b;
            if (i11 == 0) {
                ResultKt.m(obj2);
                Object obj3 = new Object();
                i1.f fVar = new i1.f();
                try {
                    kotlinx.coroutines.flow.i iVar = this.f314967a;
                    i iVar2 = new i(fVar, this.f314968b, jVar, obj3);
                    aVar.f314972d = obj3;
                    aVar.f314970b = 1;
                    if (iVar.collect(iVar2, aVar) == objL) {
                        return objL;
                    }
                } catch (kotlinx.coroutines.flow.internal.a e10) {
                    e = e10;
                    obj = obj3;
                    kotlinx.coroutines.flow.internal.q.b(e, obj);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f314972d;
                try {
                    ResultKt.m(obj2);
                } catch (kotlinx.coroutines.flow.internal.a e11) {
                    e = e11;
                    kotlinx.coroutines.flow.internal.q.b(e, obj);
                }
            }
            return Unit.f312394a;
        }
    }

    static final class i<T> implements kotlinx.coroutines.flow.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.f f314973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f314974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f314975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f314976d;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.D0, 61}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i<T> f314978b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314979c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(i<? super T> iVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314978b = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314977a = obj;
                this.f314979c |= Integer.MIN_VALUE;
                return this.f314978b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(i1.f fVar, int i10, kotlinx.coroutines.flow.j<? super T> jVar, Object obj) {
            this.f314973a = fVar;
            this.f314974b = i10;
            this.f314975c = jVar;
            this.f314976d = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r6.emit(r7, r0) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            if (kotlinx.coroutines.flow.z.f(r8, r7, r6, r0) == r1) goto L26;
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.z.i.a
                if (r0 == 0) goto L15
                r0 = r8
                kotlinx.coroutines.flow.z$i$a r0 = (kotlinx.coroutines.flow.z.i.a) r0
                int r1 = r0.f314979c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L15
                int r1 = r1 - r2
                r0.f314979c = r1
                goto L1b
            L15:
                r5 = 3
                kotlinx.coroutines.flow.z$i$a r0 = new kotlinx.coroutines.flow.z$i$a
                r0.<init>(r6, r8)
            L1b:
                r5 = 1
                java.lang.Object r8 = r0.f314977a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r5 = 5
                int r2 = r0.f314979c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                r5 = 3
                if (r2 == r4) goto L3d
                if (r2 != r3) goto L33
                r5 = 0
                kotlin.ResultKt.m(r8)
                goto L6e
            L33:
                r5 = 0
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 0
                throw r6
            L3d:
                kotlin.ResultKt.m(r8)
                goto L5d
            L41:
                r5 = 5
                kotlin.ResultKt.m(r8)
                kotlin.jvm.internal.i1$f r8 = r6.f314973a
                int r2 = r8.f312749a
                int r2 = r2 + r4
                r8.f312749a = r2
                r5 = 3
                int r8 = r6.f314974b
                r5 = 7
                if (r2 >= r8) goto L61
                kotlinx.coroutines.flow.j<T> r6 = r6.f314975c
                r0.f314979c = r4
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L5d
                goto L6d
            L5d:
                r5 = 6
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L61:
                kotlinx.coroutines.flow.j<T> r8 = r6.f314975c
                java.lang.Object r6 = r6.f314976d
                r0.f314979c = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.z.a(r8, r7, r6, r0)
                if (r6 != r1) goto L6e
            L6d:
                return r1
            L6e:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.i.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n83#2:109\n124#2,17:110\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n83#1:110,17\n*E\n"})
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314981b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {120}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314982a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314983b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314985d;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314982a = obj;
                this.f314983b |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, Function2 function2) {
            this.f314980a = iVar;
            this.f314981b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            k kVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314983b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314983b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f314982a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314983b;
            if (i11 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVar = this.f314980a;
                k kVar2 = new k(this.f314981b, jVar);
                try {
                    aVar.f314985d = kVar2;
                    aVar.f314983b = 1;
                    if (iVar.collect(kVar2, aVar) == objL) {
                        return objL;
                    }
                } catch (kotlinx.coroutines.flow.internal.a e10) {
                    e = e10;
                    kVar = kVar2;
                    kotlinx.coroutines.flow.internal.q.b(e, kVar);
                    s2.y(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (k) aVar.f314985d;
                try {
                    ResultKt.m(obj);
                } catch (kotlinx.coroutines.flow.internal.a e11) {
                    e = e11;
                    kotlinx.coroutines.flow.internal.q.b(e, kVar);
                    s2.y(aVar.getContext());
                }
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,131:1\n84#2,6:132\n*E\n"})
    public static final class k<T> implements kotlinx.coroutines.flow.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f314986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j f314987b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {132, 133}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f314988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314989b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314990c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314992e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314989b = obj;
                this.f314990c |= Integer.MIN_VALUE;
                return k.this.emit(null, this);
            }
        }

        public k(Function2 function2, kotlinx.coroutines.flow.j jVar) {
            this.f314986a = function2;
            this.f314987b = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0090  */
        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L24;
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
        public java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                java.lang.String r5 = "Androeed.ru"
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.z.k.a
                r5 = 6
                if (r0 == 0) goto L18
                r0 = r8
                r0 = r8
                kotlinx.coroutines.flow.z$k$a r0 = (kotlinx.coroutines.flow.z.k.a) r0
                int r1 = r0.f314990c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L18
                int r1 = r1 - r2
                r5 = 5
                r0.f314990c = r1
                goto L1e
            L18:
                kotlinx.coroutines.flow.z$k$a r0 = new kotlinx.coroutines.flow.z$k$a
                r5 = 5
                r0.<init>(r8)
            L1e:
                r5 = 6
                java.lang.Object r8 = r0.f314989b
                r5 = 7
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314990c
                r5 = 7
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4f
                if (r2 == r4) goto L44
                r5 = 7
                if (r2 != r3) goto L3b
                r5 = 3
                java.lang.Object r6 = r0.f314988a
                kotlinx.coroutines.flow.z$k r6 = (kotlinx.coroutines.flow.z.k) r6
                kotlin.ResultKt.m(r8)
                goto L8b
            L3b:
                r5 = 4
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L44:
                java.lang.Object r7 = r0.f314992e
                java.lang.Object r6 = r0.f314988a
                kotlinx.coroutines.flow.z$k r6 = (kotlinx.coroutines.flow.z.k) r6
                kotlin.ResultKt.m(r8)
                r5 = 0
                goto L6e
            L4f:
                kotlin.ResultKt.m(r8)
                r5 = 2
                kotlin.jvm.functions.Function2 r8 = r6.f314986a
                r5 = 7
                r0.f314988a = r6
                r0.f314992e = r7
                r5 = 7
                r0.f314990c = r4
                r5 = 4
                r2 = 6
                kotlin.jvm.internal.h0.e(r2)
                java.lang.Object r8 = r8.invoke(r7, r0)
                r5 = 3
                r2 = 7
                kotlin.jvm.internal.h0.e(r2)
                if (r8 != r1) goto L6e
                goto L89
            L6e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r5 = 7
                if (r8 == 0) goto L8a
                kotlinx.coroutines.flow.j r8 = r6.f314987b
                r5 = 7
                r0.f314988a = r6
                r2 = 0
                r5 = 1
                r0.f314992e = r2
                r0.f314990c = r3
                r5 = 4
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L8b
            L89:
                return r1
            L8a:
                r4 = 0
            L8b:
                if (r4 == 0) goto L90
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L90:
                kotlinx.coroutines.flow.internal.a r7 = new kotlinx.coroutines.flow.internal.a
                r5 = 3
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.k.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n124#2,17:142\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n117#1:142,17\n*E\n"})
    static final class l<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f314995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Boolean>, Object> f314996d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,131:1\n118#2:132\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n f314997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f314998b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$l$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {132}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C2310a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f314999a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f315000b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f315001c;

                public C2310a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f315000b = obj;
                    this.f315001c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pj.n nVar, kotlinx.coroutines.flow.j jVar) {
                this.f314997a = nVar;
                this.f314998b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0018  */
            @Override // kotlinx.coroutines.flow.j
            public Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                C2310a c2310a;
                if (dVar instanceof C2310a) {
                    c2310a = (C2310a) dVar;
                    int i10 = c2310a.f315001c;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2310a.f315001c = i10 - Integer.MIN_VALUE;
                    } else {
                        c2310a = new C2310a(dVar);
                    }
                } else {
                    c2310a = new C2310a(dVar);
                }
                Object objInvoke = c2310a.f315000b;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c2310a.f315001c;
                if (i11 == 0) {
                    ResultKt.m(objInvoke);
                    pj.n nVar = this.f314997a;
                    kotlinx.coroutines.flow.j jVar = this.f314998b;
                    c2310a.f314999a = this;
                    c2310a.f315001c = 1;
                    kotlin.jvm.internal.h0.e(6);
                    objInvoke = nVar.invoke(jVar, t10, c2310a);
                    kotlin.jvm.internal.h0.e(7);
                    if (objInvoke == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (a) c2310a.f314999a;
                    ResultKt.m(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return Unit.f312394a;
                }
                throw new kotlinx.coroutines.flow.internal.a(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(kotlinx.coroutines.flow.i<? extends T> iVar, pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> nVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f314995c = iVar;
            this.f314996d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f314995c, this.f314996d, dVar);
            lVar.f314994b = obj;
            return lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.z$l<R> for r6v7 'this'  kotlin.coroutines.d
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
                r5 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 1
                int r1 = r6.f314993a
                r5 = 2
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r6.f314994b
                kotlinx.coroutines.flow.z$l$a r0 = (kotlinx.coroutines.flow.z.l.a) r0
                kotlin.ResultKt.m(r7)     // Catch: kotlinx.coroutines.flow.internal.a -> L16
                goto L4c
            L16:
                r7 = move-exception
                goto L40
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L20:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f314994b
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                kotlinx.coroutines.flow.i<T> r1 = r6.f314995c
                pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r3 = r6.f314996d
                kotlinx.coroutines.flow.z$l$a r4 = new kotlinx.coroutines.flow.z$l$a
                r5 = 3
                r4.<init>(r3, r7)
                r6.f314994b = r4     // Catch: kotlinx.coroutines.flow.internal.a -> L3e
                r6.f314993a = r2     // Catch: kotlinx.coroutines.flow.internal.a -> L3e
                r5 = 2
                java.lang.Object r6 = r1.collect(r4, r6)     // Catch: kotlinx.coroutines.flow.internal.a -> L3e
                if (r6 != r0) goto L4c
                r5 = 6
                return r0
            L3e:
                r7 = move-exception
                r0 = r4
            L40:
                r5 = 1
                kotlinx.coroutines.flow.internal.q.b(r7, r0)
                kotlin.coroutines.CoroutineContext r6 = r6.getContext()
                r5 = 1
                kotlinx.coroutines.s2.y(r6)
            L4c:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.z.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        kotlinx.coroutines.flow.j<? super Object> jVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f314940c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f314940c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f314939b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f314940c;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.flow.j<? super Object> bVar = new b<>(function2);
            try {
                aVar.f314938a = bVar;
                aVar.f314940c = 1;
                if (iVar.collect(bVar, aVar) == objL) {
                    return objL;
                }
            } catch (kotlinx.coroutines.flow.internal.a e10) {
                e = e10;
                jVar = bVar;
                kotlinx.coroutines.flow.internal.q.b(e, jVar);
                s2.y(aVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (b) aVar.f314938a;
            try {
                ResultKt.m(obj);
            } catch (kotlinx.coroutines.flow.internal.a e11) {
                e = e11;
                kotlinx.coroutines.flow.internal.q.b(e, jVar);
                s2.y(aVar.getContext());
            }
        }
        return Unit.f312394a;
    }

    private static final <T> Object c(kotlinx.coroutines.flow.i<? extends T> iVar, Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar = new b(function2);
        try {
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(bVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        } catch (kotlinx.coroutines.flow.internal.a e10) {
            kotlinx.coroutines.flow.internal.q.b(e10, bVar);
            kotlin.jvm.internal.h0.e(3);
            throw null;
        }
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> d(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, int i10) {
        if (i10 >= 0) {
            return new c(iVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return new e(iVar, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final <T> Object f(kotlinx.coroutines.flow.j<? super T> jVar, T t10, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f314966c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f314966c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj2 = gVar.f314965b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f314966c;
        if (i11 == 0) {
            ResultKt.m(obj2);
            gVar.f314964a = obj;
            gVar.f314966c = 1;
            if (jVar.emit(t10, gVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = gVar.f314964a;
            ResultKt.m(obj2);
        }
        throw new kotlinx.coroutines.flow.internal.a(obj);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> g(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, int i10) {
        if (i10 > 0) {
            return new h(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> h(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return new j(iVar, function2);
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> nVar) {
        return kotlinx.coroutines.flow.k.K0(new l(iVar, nVar, null));
    }
}
