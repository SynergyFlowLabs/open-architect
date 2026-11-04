package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.internal.i1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,140:1\n105#2:141\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n83#1:141\n*E\n"})
public final class m {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, com.planner5d.library.engine.input.f.b.f160725s, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f314551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f314552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<T[]> f314554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314555i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f314556j;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        static final class C2290a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314558b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f314559c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f314560d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.p<IndexedValue<Object>> f314561e;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$a$a$a, reason: collision with other inner class name */
            static final class C2291a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.channels.p<IndexedValue<Object>> f314562a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f314563b;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
                static final class C2292a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f314564a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2291a<T> f314565b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f314566c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2292a(C2291a<? super T> c2291a, kotlin.coroutines.d<? super C2292a> dVar) {
                        super(dVar);
                        this.f314565b = c2291a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f314564a = obj;
                        this.f314566c |= Integer.MIN_VALUE;
                        return this.f314565b.emit(null, this);
                    }
                }

                C2291a(kotlinx.coroutines.channels.p<IndexedValue<Object>> pVar, int i10) {
                    this.f314562a = pVar;
                    this.f314563b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
                
                    if (kotlinx.coroutines.h4.a(r0) == r1) goto L21;
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
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.m.a.C2290a.C2291a.C2292a
                        if (r0 == 0) goto L19
                        r0 = r8
                        r0 = r8
                        r5 = 4
                        kotlinx.coroutines.flow.internal.m$a$a$a$a r0 = (kotlinx.coroutines.flow.internal.m.a.C2290a.C2291a.C2292a) r0
                        int r1 = r0.f314566c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = 0
                        r3 = r1 & r2
                        r5 = 6
                        if (r3 == 0) goto L19
                        int r1 = r1 - r2
                        r0.f314566c = r1
                        goto L1e
                    L19:
                        kotlinx.coroutines.flow.internal.m$a$a$a$a r0 = new kotlinx.coroutines.flow.internal.m$a$a$a$a
                        r0.<init>(r6, r8)
                    L1e:
                        java.lang.Object r8 = r0.f314564a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        r5 = 3
                        int r2 = r0.f314566c
                        r5 = 3
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L42
                        if (r2 == r4) goto L3d
                        if (r2 != r3) goto L34
                        kotlin.ResultKt.m(r8)
                        goto L62
                    L34:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r5 = 3
                        r6.<init>(r7)
                        throw r6
                    L3d:
                        r5 = 6
                        kotlin.ResultKt.m(r8)
                        goto L58
                    L42:
                        kotlin.ResultKt.m(r8)
                        kotlinx.coroutines.channels.p<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f314562a
                        r5 = 4
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r6 = r6.f314563b
                        r2.<init>(r6, r7)
                        r0.f314566c = r4
                        java.lang.Object r6 = r8.G(r2, r0)
                        if (r6 != r1) goto L58
                        goto L61
                    L58:
                        r5 = 7
                        r0.f314566c = r3
                        java.lang.Object r6 = kotlinx.coroutines.h4.a(r0)
                        if (r6 != r1) goto L62
                    L61:
                        return r1
                    L62:
                        kotlin.Unit r6 = kotlin.Unit.f312394a
                        r5 = 4
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.a.C2290a.C2291a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2290a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, int i10, AtomicInteger atomicInteger, kotlinx.coroutines.channels.p<IndexedValue<Object>> pVar, kotlin.coroutines.d<? super C2290a> dVar) {
                super(2, dVar);
                this.f314558b = iVarArr;
                this.f314559c = i10;
                this.f314560d = atomicInteger;
                this.f314561e = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2290a(this.f314558b, this.f314559c, this.f314560d, this.f314561e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314557a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.i[] iVarArr = this.f314558b;
                        int i11 = this.f314559c;
                        kotlinx.coroutines.flow.i iVar = iVarArr[i11];
                        C2291a c2291a = new C2291a(this.f314561e, i11);
                        this.f314557a = 1;
                        if (iVar.collect(c2291a, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    if (this.f314560d.decrementAndGet() == 0) {
                        o0.a.a(this.f314561e, null, 1, null);
                    }
                    return Unit.f312394a;
                } catch (Throwable th2) {
                    if (this.f314560d.decrementAndGet() == 0) {
                        o0.a.a(this.f314561e, null, 1, null);
                    }
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2290a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, Function0<T[]> function0, pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314553g = iVarArr;
            this.f314554h = function0;
            this.f314555i = nVar;
            this.f314556j = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f314553g, this.f314554h, this.f314555i, this.f314556j, dVar);
            aVar.f314552f = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[EDGE_INSN: B:35:0x00e7->B:44:0x012a BREAK  A[LOOP:0: B:28:0x00c2->B:47:?]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:41:0x010a  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c2->B:47:?, LOOP_END, SYNTHETIC] */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0107 -> B:44:0x012a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0127 -> B:44:0x012a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x010a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,108:1\n84#2:109\n139#2:110\n*E\n"})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n f314569c;

        public b(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, pj.n nVar) {
            this.f314567a = iVar;
            this.f314568b = iVar2;
            this.f314569c = nVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            int i10 = 1 >> 0;
            Object objG = t0.g(new c(this.f314567a, this.f314568b, jVar, this.f314569c, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f314571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f314572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> f314573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> f314574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<R> f314575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ pj.n<T1, T2, kotlin.coroutines.d<? super R>, Object> f314576g;

        static final class a implements Function1<Throwable, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.a0 f314577a;

            a(kotlinx.coroutines.a0 a0Var) {
                this.f314577a = a0Var;
            }

            public final void c(Throwable th2) {
                if (this.f314577a.isActive()) {
                    this.f314577a.e(new kotlinx.coroutines.flow.internal.a(this.f314577a));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                c(th2);
                return Unit.f312394a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314578a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T1> f314579b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f314580c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f314581d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n0<Object> f314582e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f314583f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ pj.n<T1, T2, kotlin.coroutines.d<? super R>, Object> f314584g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.a0 f314585h;

            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ CoroutineContext f314586a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f314587b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ n0<Object> f314588c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.j<R> f314589d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ pj.n<T1, T2, kotlin.coroutines.d<? super R>, Object> f314590e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.a0 f314591f;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$c$b$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {okhttp3.internal.ws.g.f334652s, 129, 129}, m = "invokeSuspend", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n994#2:141\n14#3:142\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141\n129#1:142\n*E\n"})
                static final class C2293a extends kotlin.coroutines.jvm.internal.o implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f314592a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f314593b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ n0<Object> f314594c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.flow.j<R> f314595d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ pj.n<T1, T2, kotlin.coroutines.d<? super R>, Object> f314596e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ T1 f314597f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.a0 f314598g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2293a(n0<? extends Object> n0Var, kotlinx.coroutines.flow.j<? super R> jVar, pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, T1 t10, kotlinx.coroutines.a0 a0Var, kotlin.coroutines.d<? super C2293a> dVar) {
                        super(2, dVar);
                        this.f314594c = n0Var;
                        this.f314595d = jVar;
                        this.f314596e = nVar;
                        this.f314597f = t10;
                        this.f314598g = a0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C2293a(this.f314594c, this.f314595d, this.f314596e, this.f314597f, this.f314598g, dVar);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
                    
                        if (r1.emit(r10, r9) == r0) goto L31;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.j] */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v7 */
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
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                        /*
                            r9 = this;
                            r8 = 6
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            r8 = 6
                            int r1 = r9.f314593b
                            r8 = 3
                            r2 = 0
                            r3 = 1
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            int r8 = r8 << r5
                            if (r1 == 0) goto L3c
                            r8 = 0
                            if (r1 == r5) goto L30
                            r8 = 6
                            if (r1 == r4) goto L27
                            if (r1 != r3) goto L1d
                            kotlin.ResultKt.m(r10)
                            goto L85
                        L1d:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r10 = " lsson/iekinvm  //lefor eatortcut ///oohe/iewr b/eu"
                            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r10)
                            throw r9
                        L27:
                            java.lang.Object r1 = r9.f314592a
                            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                            kotlin.ResultKt.m(r10)
                            r8 = 7
                            goto L79
                        L30:
                            kotlin.ResultKt.m(r10)
                            r8 = 6
                            kotlinx.coroutines.channels.t r10 = (kotlinx.coroutines.channels.t) r10
                            r8 = 3
                            java.lang.Object r10 = r10.o()
                            goto L4c
                        L3c:
                            kotlin.ResultKt.m(r10)
                            kotlinx.coroutines.channels.n0<java.lang.Object> r10 = r9.f314594c
                            r8 = 5
                            r9.f314593b = r5
                            java.lang.Object r10 = r10.A(r9)
                            if (r10 != r0) goto L4c
                            r8 = 5
                            goto L84
                        L4c:
                            kotlinx.coroutines.a0 r1 = r9.f314598g
                            boolean r5 = r10 instanceof kotlinx.coroutines.channels.t.c
                            r8 = 6
                            if (r5 == 0) goto L61
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.t.f(r10)
                            if (r9 != 0) goto L60
                            r8 = 0
                            kotlinx.coroutines.flow.internal.a r9 = new kotlinx.coroutines.flow.internal.a
                            r8 = 6
                            r9.<init>(r1)
                        L60:
                            throw r9
                        L61:
                            kotlinx.coroutines.flow.j<R> r1 = r9.f314595d
                            pj.n<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r5 = r9.f314596e
                            T1 r6 = r9.f314597f
                            kotlinx.coroutines.internal.z0 r7 = kotlinx.coroutines.flow.internal.u.f314619a
                            if (r10 != r7) goto L6c
                            r10 = r2
                        L6c:
                            r8 = 0
                            r9.f314592a = r1
                            r9.f314593b = r4
                            java.lang.Object r10 = r5.invoke(r6, r10, r9)
                            r8 = 3
                            if (r10 != r0) goto L79
                            goto L84
                        L79:
                            r9.f314592a = r2
                            r9.f314593b = r3
                            java.lang.Object r9 = r1.emit(r10, r9)
                            r8 = 2
                            if (r9 != r0) goto L85
                        L84:
                            return r0
                        L85:
                            kotlin.Unit r9 = kotlin.Unit.f312394a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.c.b.a.C2293a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C2293a) create(unit, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$c$b$a$b, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {125}, m = "emit", n = {}, s = {})
                static final class C2294b extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f314599a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ a<T> f314600b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f314601c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2294b(a<? super T> aVar, kotlin.coroutines.d<? super C2294b> dVar) {
                        super(dVar);
                        this.f314600b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f314599a = obj;
                        this.f314601c |= Integer.MIN_VALUE;
                        return this.f314600b.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                a(CoroutineContext coroutineContext, Object obj, n0<? extends Object> n0Var, kotlinx.coroutines.flow.j<? super R> jVar, pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlinx.coroutines.a0 a0Var) {
                    this.f314586a = coroutineContext;
                    this.f314587b = obj;
                    this.f314588c = n0Var;
                    this.f314589d = jVar;
                    this.f314590e = nVar;
                    this.f314591f = a0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T1 t10, kotlin.coroutines.d<? super Unit> dVar) {
                    C2294b c2294b;
                    if (dVar instanceof C2294b) {
                        c2294b = (C2294b) dVar;
                        int i10 = c2294b.f314601c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c2294b.f314601c = i10 - Integer.MIN_VALUE;
                        } else {
                            c2294b = new C2294b(this, dVar);
                        }
                    } else {
                        c2294b = new C2294b(this, dVar);
                    }
                    Object obj = c2294b.f314599a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c2294b.f314601c;
                    if (i11 == 0) {
                        ResultKt.m(obj);
                        CoroutineContext coroutineContext = this.f314586a;
                        Unit unit = Unit.f312394a;
                        Object obj2 = this.f314587b;
                        C2293a c2293a = new C2293a(this.f314588c, this.f314589d, this.f314590e, t10, this.f314591f, null);
                        c2294b.f314601c = 1;
                        if (f.c(coroutineContext, unit, obj2, c2293a, c2294b) == objL) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.flow.i<? extends T1> iVar, CoroutineContext coroutineContext, Object obj, n0<? extends Object> n0Var, kotlinx.coroutines.flow.j<? super R> jVar, pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlinx.coroutines.a0 a0Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f314579b = iVar;
                this.f314580c = coroutineContext;
                this.f314581d = obj;
                this.f314582e = n0Var;
                this.f314583f = jVar;
                this.f314584g = nVar;
                this.f314585h = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f314579b, this.f314580c, this.f314581d, this.f314582e, this.f314583f, this.f314584g, this.f314585h, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.m$c$b for r11v4 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r10 = 4
                    int r1 = r11.f314578a
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L11
                    kotlin.ResultKt.m(r12)
                    r10 = 3
                    goto L3e
                L11:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    r10 = 4
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    r10 = 4
                    throw r11
                L1b:
                    kotlin.ResultKt.m(r12)
                    kotlinx.coroutines.flow.i<T1> r12 = r11.f314579b
                    r10 = 7
                    kotlinx.coroutines.flow.internal.m$c$b$a r3 = new kotlinx.coroutines.flow.internal.m$c$b$a
                    r10 = 3
                    kotlin.coroutines.CoroutineContext r4 = r11.f314580c
                    java.lang.Object r5 = r11.f314581d
                    kotlinx.coroutines.channels.n0<java.lang.Object> r6 = r11.f314582e
                    kotlinx.coroutines.flow.j<R> r7 = r11.f314583f
                    pj.n<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r8 = r11.f314584g
                    kotlinx.coroutines.a0 r9 = r11.f314585h
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    r11.f314578a = r2
                    r10 = 2
                    java.lang.Object r11 = r12.collect(r3, r11)
                    r10 = 5
                    if (r11 != r0) goto L3e
                    return r0
                L3e:
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(unit, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$c$c, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160702k0}, m = "invokeSuspend", n = {}, s = {})
        static final class C2295c extends kotlin.coroutines.jvm.internal.o implements Function2<l0<? super Object>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314603b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T2> f314604c;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$c$c$a */
            static final class a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l0<Object> f314605a;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.m$c$c$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160690g0}, m = "emit", n = {}, s = {})
                static final class C2296a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f314606a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ a<T> f314607b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f314608c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2296a(a<? super T> aVar, kotlin.coroutines.d<? super C2296a> dVar) {
                        super(dVar);
                        this.f314607b = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f314606a = obj;
                        this.f314608c |= Integer.MIN_VALUE;
                        return this.f314607b.emit(null, this);
                    }
                }

                a(l0<Object> l0Var) {
                    this.f314605a = l0Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T2 t10, kotlin.coroutines.d<? super Unit> dVar) {
                    C2296a c2296a;
                    Object obj;
                    if (dVar instanceof C2296a) {
                        c2296a = (C2296a) dVar;
                        int i10 = c2296a.f314608c;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c2296a.f314608c = i10 - Integer.MIN_VALUE;
                        } else {
                            c2296a = new C2296a(this, dVar);
                        }
                    } else {
                        c2296a = new C2296a(this, dVar);
                    }
                    Object obj2 = c2296a.f314606a;
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i11 = c2296a.f314608c;
                    if (i11 == 0) {
                        ResultKt.m(obj2);
                        o0<Object> o0VarS = this.f314605a.s();
                        if (t10 == 0) {
                            obj = t10;
                            obj = u.f314619a;
                        }
                        obj = t10;
                        c2296a.f314608c = 1;
                        if (o0VarS.G(obj, c2296a) == objL) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2295c(kotlinx.coroutines.flow.i<? extends T2> iVar, kotlin.coroutines.d<? super C2295c> dVar) {
                super(2, dVar);
                this.f314604c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C2295c c2295c = new C2295c(this.f314604c, dVar);
                c2295c.f314603b = obj;
                return c2295c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l0<? super Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return invoke2((l0<Object>) l0Var, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.m$c$c for r5v4 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r4 = 0
                    int r1 = r5.f314602a
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L11
                    kotlin.ResultKt.m(r6)
                    r4 = 4
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "t/s/we//eee luero/oa s/rn ne coo kciutibt/ilm rv/ho"
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r4 = 5
                    r5.<init>(r6)
                    r4 = 5
                    throw r5
                L1d:
                    kotlin.ResultKt.m(r6)
                    java.lang.Object r6 = r5.f314603b
                    kotlinx.coroutines.channels.l0 r6 = (kotlinx.coroutines.channels.l0) r6
                    kotlinx.coroutines.flow.i<T2> r1 = r5.f314604c
                    kotlinx.coroutines.flow.internal.m$c$c$a r3 = new kotlinx.coroutines.flow.internal.m$c$c$a
                    r3.<init>(r6)
                    r5.f314602a = r2
                    r4 = 5
                    java.lang.Object r5 = r1.collect(r3, r5)
                    r4 = 1
                    if (r5 != r0) goto L36
                    return r0
                L36:
                    kotlin.Unit r5 = kotlin.Unit.f312394a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.m.c.C2295c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2295c) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.flow.i<? extends T2> iVar, kotlinx.coroutines.flow.i<? extends T1> iVar2, kotlinx.coroutines.flow.j<? super R> jVar, pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f314573d = iVar;
            this.f314574e = iVar2;
            this.f314575f = jVar;
            this.f314576g = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f314573d, this.f314574e, this.f314575f, this.f314576g, dVar);
            cVar.f314572c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            n0 n0Var;
            n0 n0Var2;
            kotlinx.coroutines.a0 a0Var;
            kotlinx.coroutines.a0 a0Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314571b;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var2 = (kotlinx.coroutines.a0) this.f314570a;
                    n0Var = (n0) this.f314572c;
                    try {
                        ResultKt.m(obj);
                    } catch (kotlinx.coroutines.flow.internal.a e10) {
                        e = e10;
                        q.b(e, a0Var2);
                    }
                    n0.a.b(n0Var, null, 1, null);
                    return Unit.f312394a;
                }
                ResultKt.m(obj);
                s0 s0Var = (s0) this.f314572c;
                n0 n0VarH = j0.h(s0Var, null, 0, new C2295c(this.f314573d, null), 3, null);
                kotlinx.coroutines.a0 a0VarC = u2.c(null, 1, null);
                Intrinsics.checkNotNull(n0VarH, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((o0) n0VarH).n(new a(a0VarC));
                try {
                    CoroutineContext coroutineContext = s0Var.getCoroutineContext();
                    Object objG = i1.g(coroutineContext);
                    CoroutineContext coroutineContextPlus = s0Var.getCoroutineContext().plus(a0VarC);
                    try {
                        try {
                            Unit unit = Unit.f312394a;
                            try {
                                b bVar = new b(this.f314574e, coroutineContext, objG, n0VarH, this.f314575f, this.f314576g, a0VarC, null);
                                n0Var2 = n0VarH;
                                a0Var = a0VarC;
                                try {
                                    this.f314572c = n0Var2;
                                    this.f314570a = a0Var;
                                    this.f314571b = 1;
                                    if (f.d(coroutineContextPlus, unit, null, bVar, this, 4, null) == objL) {
                                        return objL;
                                    }
                                    n0Var = n0Var2;
                                    n0.a.b(n0Var, null, 1, null);
                                    return Unit.f312394a;
                                } catch (kotlinx.coroutines.flow.internal.a e11) {
                                    e = e11;
                                    a0Var2 = a0Var;
                                    n0Var = n0Var2;
                                    q.b(e, a0Var2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    n0Var = n0Var2;
                                    n0.a.b(n0Var, null, 1, null);
                                    throw th;
                                }
                            } catch (kotlinx.coroutines.flow.internal.a e12) {
                                e = e12;
                                n0Var2 = n0VarH;
                                a0Var = a0VarC;
                            }
                        } catch (kotlinx.coroutines.flow.internal.a e13) {
                            e = e13;
                            a0Var = a0VarC;
                            n0Var2 = n0VarH;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        n0Var2 = n0VarH;
                    }
                } catch (kotlinx.coroutines.flow.internal.a e14) {
                    e = e14;
                    n0Var2 = n0VarH;
                    a0Var = a0VarC;
                } catch (Throwable th4) {
                    th = th4;
                    n0Var2 = n0VarH;
                }
                q.b(e, a0Var2);
                n0.a.b(n0Var, null, 1, null);
                return Unit.f312394a;
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @a1
    @Nullable
    public static final <R, T> Object a(@NotNull kotlinx.coroutines.flow.j<? super R> jVar, @NotNull kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @NotNull Function0<T[]> function0, @NotNull pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = p.a(new a(iVarArr, function0, nVar, jVar, null), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }

    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> b(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return new b(iVar2, iVar, nVar);
    }
}
