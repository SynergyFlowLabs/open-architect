package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f71681a = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", f = "FlowExt.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13644#2,3:225\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n*L\n144#1:225,3\n*E\n"})
    public static final class a<R> extends kotlin.coroutines.jvm.internal.o implements Function2<a3<R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T1> f71684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T2> f71685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.o<T1, T2, m, kotlin.coroutines.d<? super R>, Object> f71686e;

        /* JADX INFO: renamed from: androidx.paging.d0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.F1}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1\n*L\n1#1,224:1\n*E\n"})
        public static final class C0643a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71687a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<Object> f71688b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f71689c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a3<R> f71690d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ i3<T1, T2> f71691e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f71692f;

            /* JADX INFO: renamed from: androidx.paging.d0$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1\n*L\n1#1,224:1\n*E\n"})
            public static final class C0644a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ i3<T1, T2> f71693a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f71694b;

                /* JADX INFO: renamed from: androidx.paging.d0$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", f = "FlowExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.G1, 151}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1\n*L\n1#1,224:1\n*E\n"})
                static final class C0645a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f71695a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C0644a<T> f71696b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f71697c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0645a(C0644a<? super T> c0644a, kotlin.coroutines.d<? super C0645a> dVar) {
                        super(dVar);
                        this.f71696b = c0644a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f71695a = obj;
                        this.f71697c |= Integer.MIN_VALUE;
                        return this.f71696b.emit(null, this);
                    }
                }

                public C0644a(i3<T1, T2> i3Var, int i10) {
                    this.f71693a = i3Var;
                    this.f71694b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
                
                    if (kotlinx.coroutines.h4.a(r0) == r1) goto L22;
                 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        java.lang.String r5 = "Androeed.ru"
                        boolean r0 = r8 instanceof androidx.paging.d0.a.C0643a.C0644a.C0645a
                        if (r0 == 0) goto L19
                        r0 = r8
                        r5 = 2
                        androidx.paging.d0$a$a$a$a r0 = (androidx.paging.d0.a.C0643a.C0644a.C0645a) r0
                        int r1 = r0.f71697c
                        r5 = 5
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L19
                        int r1 = r1 - r2
                        r5 = 5
                        r0.f71697c = r1
                        r5 = 2
                        goto L1e
                    L19:
                        androidx.paging.d0$a$a$a$a r0 = new androidx.paging.d0$a$a$a$a
                        r0.<init>(r6, r8)
                    L1e:
                        java.lang.Object r8 = r0.f71695a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        r5 = 7
                        int r2 = r0.f71697c
                        r3 = 2
                        r4 = 5
                        r4 = 1
                        if (r2 == 0) goto L42
                        r5 = 6
                        if (r2 == r4) goto L3e
                        if (r2 != r3) goto L36
                        kotlin.ResultKt.m(r8)
                        r5 = 6
                        goto L60
                    L36:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L3e:
                        kotlin.ResultKt.m(r8)
                        goto L56
                    L42:
                        kotlin.ResultKt.m(r8)
                        androidx.paging.i3<T1, T2> r8 = r6.f71693a
                        r5 = 7
                        int r6 = r6.f71694b
                        r5 = 1
                        r0.f71697c = r4
                        java.lang.Object r6 = r8.a(r6, r7, r0)
                        r5 = 1
                        if (r6 != r1) goto L56
                        r5 = 7
                        goto L5f
                    L56:
                        r0.f71697c = r3
                        java.lang.Object r6 = kotlinx.coroutines.h4.a(r0)
                        r5 = 0
                        if (r6 != r1) goto L60
                    L5f:
                        return r1
                    L60:
                        kotlin.Unit r6 = kotlin.Unit.f312394a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.a.C0643a.C0644a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0643a(kotlinx.coroutines.flow.i<? extends Object> iVar, AtomicInteger atomicInteger, a3<R> a3Var, i3<T1, T2> i3Var, int i10, kotlin.coroutines.d<? super C0643a> dVar) {
                super(2, dVar);
                this.f71688b = iVar;
                this.f71689c = atomicInteger;
                this.f71690d = a3Var;
                this.f71691e = i3Var;
                this.f71692f = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0643a(this.f71688b, this.f71689c, this.f71690d, this.f71691e, this.f71692f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f71687a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.i<Object> iVar = this.f71688b;
                        C0644a c0644a = new C0644a(this.f71691e, this.f71692f);
                        this.f71687a = 1;
                        if (iVar.collect(c0644a, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    if (this.f71689c.decrementAndGet() == 0) {
                        kotlinx.coroutines.channels.o0.a.a(this.f71690d, null, 1, null);
                    }
                    return Unit.f312394a;
                } catch (Throwable th2) {
                    if (this.f71689c.decrementAndGet() == 0) {
                        kotlinx.coroutines.channels.o0.a.a(this.f71690d, null, 1, null);
                    }
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0643a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$2\n*L\n1#1,224:1\n*E\n"})
        public static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.a0 f71698a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlinx.coroutines.a0 a0Var) {
                super(0);
                this.f71698a = a0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f312394a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.p2.a.b(this.f71698a, null, 1, null);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T1, T2] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", f = "FlowExt.kt", i = {}, l = {androidx.media2.widget.f.i.f59775g0, androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1\n*L\n1#1,224:1\n*E\n"})
        public static final class c<T1, T2> extends kotlin.coroutines.jvm.internal.o implements pj.o<T1, T2, m, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71699a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f71700b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f71701c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f71702d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a3<R> f71703e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ pj.o<T1, T2, m, kotlin.coroutines.d<? super R>, Object> f71704f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(a3<R> a3Var, pj.o<? super T1, ? super T2, ? super m, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar, kotlin.coroutines.d<? super c> dVar) {
                super(4, dVar);
                this.f71703e = a3Var;
                this.f71704f = oVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$a$c<T1, T2> for r9v4 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
                /*
                    r9 = this;
                    r8 = 4
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.f71699a
                    r2 = 0
                    r3 = 2
                    r8 = 3
                    r4 = 1
                    if (r1 == 0) goto L29
                    r8 = 2
                    if (r1 == r4) goto L20
                    if (r1 != r3) goto L16
                    kotlin.ResultKt.m(r10)
                    goto L56
                L16:
                    r8 = 1
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    r8 = 1
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L20:
                    r8 = 1
                    java.lang.Object r1 = r9.f71700b
                    androidx.paging.a3 r1 = (androidx.paging.a3) r1
                    kotlin.ResultKt.m(r10)
                    goto L49
                L29:
                    r8 = 2
                    kotlin.ResultKt.m(r10)
                    java.lang.Object r10 = r9.f71700b
                    java.lang.Object r1 = r9.f71701c
                    java.lang.Object r5 = r9.f71702d
                    androidx.paging.m r5 = (androidx.paging.m) r5
                    androidx.paging.a3<R> r6 = r9.f71703e
                    pj.o<T1, T2, androidx.paging.m, kotlin.coroutines.d<? super R>, java.lang.Object> r7 = r9.f71704f
                    r9.f71700b = r6
                    r9.f71701c = r2
                    r8 = 0
                    r9.f71699a = r4
                    r8 = 6
                    java.lang.Object r10 = r7.invoke(r10, r1, r5, r9)
                    if (r10 != r0) goto L48
                    goto L55
                L48:
                    r1 = r6
                L49:
                    r8 = 4
                    r9.f71700b = r2
                    r8 = 4
                    r9.f71699a = r3
                    java.lang.Object r9 = r1.G(r10, r9)
                    if (r9 != r0) goto L56
                L55:
                    return r0
                L56:
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    r8 = 1
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$a$c<T1, T2> for r5v3 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r6 = r5.f71700b
                    java.lang.Object r0 = r5.f71701c
                    r4 = 6
                    java.lang.Object r1 = r5.f71702d
                    androidx.paging.m r1 = (androidx.paging.m) r1
                    androidx.paging.a3<R> r2 = r5.f71703e
                    pj.o<T1, T2, androidx.paging.m, kotlin.coroutines.d<? super R>, java.lang.Object> r3 = r5.f71704f
                    java.lang.Object r6 = r3.invoke(r6, r0, r1, r5)
                    r4 = 2
                    r0 = 0
                    kotlin.jvm.internal.h0.e(r0)
                    r2.G(r6, r5)
                    r5 = 1
                    r4 = 4
                    kotlin.jvm.internal.h0.e(r5)
                    kotlin.Unit r5 = kotlin.Unit.f312394a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.a.c.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
            }

            @Override // pj.o
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T1 t10, T2 t11, @NotNull m mVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                c cVar = new c(this.f71703e, this.f71704f, dVar);
                cVar.f71700b = t10;
                cVar.f71701c = t11;
                cVar.f71702d = mVar;
                return cVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlinx.coroutines.flow.i<? extends T2> iVar2, pj.o<? super T1, ? super T2, ? super m, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f71684c = iVar;
            this.f71685d = iVar2;
            this.f71686e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f71684c, this.f71685d, this.f71686e, dVar);
            aVar.f71683b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71682a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a3 a3Var = (a3) this.f71683b;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                i3 i3Var = new i3(new c(a3Var, this.f71686e, null));
                kotlinx.coroutines.a0 a0VarC = kotlinx.coroutines.u2.c(null, 1, null);
                int i11 = 0;
                kotlinx.coroutines.flow.i[] iVarArr = {this.f71684c, this.f71685d};
                int i12 = 0;
                while (i12 < 2) {
                    a3 a3Var2 = a3Var;
                    a3Var = a3Var2;
                    kotlinx.coroutines.k.f(a3Var, a0VarC, null, new C0643a(iVarArr[i12], atomicInteger, a3Var2, i3Var, i11, null), 2, null);
                    i12++;
                    atomicInteger = atomicInteger;
                    i11++;
                    i3Var = i3Var;
                }
                b bVar = new b(a0VarC);
                this.f71682a = 1;
                if (a3Var.U0(bVar, this) == objL) {
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

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            a3 a3Var = (a3) this.f71683b;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            i3 i3Var = new i3(new c(a3Var, this.f71686e, null));
            kotlinx.coroutines.a0 a0VarC = kotlinx.coroutines.u2.c(null, 1, null);
            kotlinx.coroutines.flow.i[] iVarArr = {this.f71684c, this.f71685d};
            int i10 = 0;
            int i11 = 0;
            while (i11 < 2) {
                int i12 = i10;
                kotlinx.coroutines.flow.i iVar = iVarArr[i11];
                int i13 = i12 + 1;
                int iIntValue = Integer.valueOf(i12).intValue();
                a3 a3Var2 = a3Var;
                a3Var = a3Var2;
                AtomicInteger atomicInteger2 = atomicInteger;
                kotlinx.coroutines.k.f(a3Var, a0VarC, null, new C0643a(iVar, atomicInteger, a3Var2, i3Var, iIntValue, null), 2, null);
                Unit unit = Unit.f312394a;
                i11++;
                atomicInteger = atomicInteger2;
                i10 = i13;
                i3Var = i3Var;
            }
            b bVar = new b(a0VarC);
            kotlin.jvm.internal.h0.e(0);
            a3Var.U0(bVar, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull a3<R> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", f = "FlowExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1, com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n*L\n1#1,224:1\n*E\n"})
    public static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f71707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, Object> f71708d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f71708d = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$b<R, T> for r6v4 'this'  java.lang.Object
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
                r5 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f71705a
                r2 = 2
                r5 = 6
                r3 = 1
                r5 = 6
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r7)
                goto L55
            L15:
                r5 = 3
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 7
                r6.<init>(r7)
                throw r6
            L1f:
                r5 = 1
                java.lang.Object r1 = r6.f71706b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L44
            L28:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f71706b
                r1 = r7
                r5 = 0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f71707c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, java.lang.Object> r4 = r6.f71708d
                r5 = 6
                r6.f71706b = r1
                r5 = 5
                r6.f71705a = r3
                r5 = 3
                java.lang.Object r7 = r4.invoke(r7, r6)
                r5 = 3
                if (r7 != r0) goto L44
                goto L54
            L44:
                r5 = 0
                kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.i) r7
                r3 = 0
                r6.f71706b = r3
                r6.f71705a = r2
                r5 = 6
                java.lang.Object r6 = kotlinx.coroutines.flow.k.o0(r1, r7, r6)
                r5 = 7
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                r5 = 6
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$b<R, T> for r3v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                r2 = 7
                java.lang.Object r4 = r3.f71706b
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r0 = r3.f71707c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, java.lang.Object> r1 = r3.f71708d
                java.lang.Object r0 = r1.invoke(r0, r3)
                r2 = 1
                kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.i) r0
                r1 = 0
                r2 = 0
                kotlin.jvm.internal.h0.e(r1)
                kotlinx.coroutines.flow.k.o0(r4, r0, r3)
                r3 = 1
                kotlin.jvm.internal.h0.e(r3)
                r2 = 3
                kotlin.Unit r3 = kotlin.Unit.f312394a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.b.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super R> jVar, T t10, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f71708d, dVar);
            bVar.f71706b = jVar;
            bVar.f71707c = t10;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", i = {}, l = {105, 105}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n*L\n1#1,224:1\n*E\n"})
    public static final class c<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f71711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, kotlin.coroutines.d<? super R>, Object> f71712d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f71712d = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$c<R, T> for r6v4 'this'  java.lang.Object
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
                int r1 = r6.f71709a
                r2 = 2
                r3 = 1
                r5 = 3
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r7)
                goto L4f
            L13:
                r5 = 0
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1c:
                java.lang.Object r1 = r6.f71710b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L41
            L24:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f71710b
                r1 = r7
                r1 = r7
                r5 = 0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r5 = 6
                java.lang.Object r7 = r6.f71711c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r6.f71712d
                r6.f71710b = r1
                r5 = 1
                r6.f71709a = r3
                r5 = 2
                java.lang.Object r7 = r4.invoke(r7, r6)
                if (r7 != r0) goto L41
                r5 = 1
                goto L4e
            L41:
                r5 = 1
                r3 = 0
                r6.f71710b = r3
                r6.f71709a = r2
                java.lang.Object r6 = r1.emit(r7, r6)
                r5 = 4
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                r5 = 0
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$c<R, T> for r3v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.f71710b
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                java.lang.Object r0 = r3.f71711c
                r2 = 2
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.d<? super R>, java.lang.Object> r1 = r3.f71712d
                java.lang.Object r0 = r1.invoke(r0, r3)
                r2 = 7
                r1 = 0
                kotlin.jvm.internal.h0.e(r1)
                r4.emit(r0, r3)
                r3 = 1
                r2 = 3
                kotlin.jvm.internal.h0.e(r3)
                kotlin.Unit r3 = kotlin.Unit.f312394a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.c.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super R> jVar, T t10, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(this.f71712d, dVar);
            cVar.f71710b = jVar;
            cVar.f71711c = t10;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V}, m = "invokeSuspend", n = {}, s = {})
    static final class d<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f71715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<T, T, kotlin.coroutines.d<? super T>, Object> f71716d;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<Object> f71717a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<T, T, kotlin.coroutines.d<? super T>, Object> f71718b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<T> f71719c;

            /* JADX INFO: renamed from: androidx.paging.d0$d$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160725s, 76}, m = "emit", n = {"this"}, s = {"L$0"})
            static final class C0646a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f71720a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f71721b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f71722c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a<T> f71723d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71724e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0646a(a<? super T> aVar, kotlin.coroutines.d<? super C0646a> dVar) {
                    super(dVar);
                    this.f71723d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71722c = obj;
                    this.f71724e |= Integer.MIN_VALUE;
                    return this.f71723d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlin.jvm.internal.i1.h<Object> hVar, pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar, kotlinx.coroutines.flow.j<? super T> jVar) {
                this.f71717a = hVar;
                this.f71718b = nVar;
                this.f71719c = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0016  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
            
                if (r9.emit(r8, r0) == r1) goto L26;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    java.lang.String r7 = "Androeed.ru"
                    boolean r0 = r10 instanceof androidx.paging.d0.d.a.C0646a
                    r7 = 3
                    if (r0 == 0) goto L16
                    r0 = r10
                    androidx.paging.d0$d$a$a r0 = (androidx.paging.d0.d.a.C0646a) r0
                    int r1 = r0.f71724e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L16
                    int r1 = r1 - r2
                    r0.f71724e = r1
                    goto L1b
                L16:
                    androidx.paging.d0$d$a$a r0 = new androidx.paging.d0$d$a$a
                    r0.<init>(r8, r10)
                L1b:
                    java.lang.Object r10 = r0.f71722c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f71724e
                    r3 = 2
                    r7 = r3
                    r4 = 1
                    if (r2 == 0) goto L47
                    if (r2 == r4) goto L39
                    if (r2 != r3) goto L30
                    kotlin.ResultKt.m(r10)
                    goto L93
                L30:
                    r7 = 7
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L39:
                    r7 = 7
                    java.lang.Object r8 = r0.f71721b
                    kotlin.jvm.internal.i1$h r8 = (kotlin.jvm.internal.i1.h) r8
                    java.lang.Object r9 = r0.f71720a
                    r7 = 3
                    androidx.paging.d0$d$a r9 = (androidx.paging.d0.d.a) r9
                    kotlin.ResultKt.m(r10)
                    goto L74
                L47:
                    kotlin.ResultKt.m(r10)
                    r7 = 2
                    kotlin.jvm.internal.i1$h<java.lang.Object> r10 = r8.f71717a
                    r7 = 2
                    T r2 = r10.f312751a
                    java.lang.Object r5 = androidx.paging.d0.a()
                    r7 = 1
                    if (r2 != r5) goto L58
                    goto L78
                L58:
                    r7 = 6
                    pj.n<T, T, kotlin.coroutines.d<? super T>, java.lang.Object> r2 = r8.f71718b
                    kotlin.jvm.internal.i1$h<java.lang.Object> r5 = r8.f71717a
                    r7 = 2
                    T r5 = r5.f312751a
                    r0.f71720a = r8
                    r0.f71721b = r10
                    r7 = 1
                    r0.f71724e = r4
                    java.lang.Object r9 = r2.invoke(r5, r9, r0)
                    r7 = 2
                    if (r9 != r1) goto L70
                    r7 = 2
                    goto L91
                L70:
                    r6 = r9
                    r9 = r8
                    r8 = r10
                    r10 = r6
                L74:
                    r6 = r10
                    r10 = r8
                    r8 = r9
                    r9 = r6
                L78:
                    r7 = 1
                    r10.f312751a = r9
                    r7 = 1
                    kotlinx.coroutines.flow.j<T> r9 = r8.f71719c
                    r7 = 0
                    kotlin.jvm.internal.i1$h<java.lang.Object> r8 = r8.f71717a
                    T r8 = r8.f312751a
                    r10 = 0
                    r0.f71720a = r10
                    r0.f71721b = r10
                    r0.f71724e = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    r7 = 2
                    if (r8 != r1) goto L93
                L91:
                    r7 = 3
                    return r1
                L93:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    r7 = 0
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(kotlinx.coroutines.flow.i<? extends T> iVar, pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f71715c = iVar;
            this.f71716d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f71715c, this.f71716d, dVar);
            dVar2.f71714b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71713a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f71714b;
                kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
                hVar.f312751a = (T) d0.f71681a;
                kotlinx.coroutines.flow.i<T> iVar = this.f71715c;
                a aVar = new a(hVar, this.f71716d, jVar);
                this.f71713a = 1;
                if (iVar.collect(aVar, this) == objL) {
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
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
    static final class e<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f71725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f71726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f71727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ R f71728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f71729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ pj.n<R, T, kotlin.coroutines.d<? super R>, Object> f71730f;

        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<R> f71731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<R, T, kotlin.coroutines.d<? super R>, Object> f71732b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j<R> f71733c;

            /* JADX INFO: renamed from: androidx.paging.d0$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160729t0, com.planner5d.library.engine.input.f.b.f160707m}, m = "emit", n = {"this"}, s = {"L$0"})
            static final class C0647a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f71734a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f71735b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f71736c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a<T> f71737d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f71738e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0647a(a<? super T> aVar, kotlin.coroutines.d<? super C0647a> dVar) {
                    super(dVar);
                    this.f71737d = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f71736c = obj;
                    this.f71738e |= Integer.MIN_VALUE;
                    return this.f71737d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(kotlin.jvm.internal.i1.h<R> hVar, pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlinx.coroutines.flow.j<? super R> jVar) {
                this.f71731a = hVar;
                this.f71732b = nVar;
                this.f71733c = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) {
                /*
                    r8 = this;
                    java.lang.String r7 = "Androeed.ru"
                    boolean r0 = r10 instanceof androidx.paging.d0.e.a.C0647a
                    r7 = 7
                    if (r0 == 0) goto L19
                    r0 = r10
                    androidx.paging.d0$e$a$a r0 = (androidx.paging.d0.e.a.C0647a) r0
                    int r1 = r0.f71738e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r7 = 7
                    r3 = r1 & r2
                    if (r3 == 0) goto L19
                    int r1 = r1 - r2
                    r7 = 6
                    r0.f71738e = r1
                    r7 = 6
                    goto L1e
                L19:
                    androidx.paging.d0$e$a$a r0 = new androidx.paging.d0$e$a$a
                    r0.<init>(r8, r10)
                L1e:
                    java.lang.Object r10 = r0.f71736c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r7 = 5
                    int r2 = r0.f71738e
                    r3 = 2
                    r4 = 1
                    int r7 = r7 >> r4
                    if (r2 == 0) goto L49
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    kotlin.ResultKt.m(r10)
                    goto L84
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    java.lang.Object r8 = r0.f71735b
                    kotlin.jvm.internal.i1$h r8 = (kotlin.jvm.internal.i1.h) r8
                    java.lang.Object r9 = r0.f71734a
                    r7 = 7
                    androidx.paging.d0$e$a r9 = (androidx.paging.d0.e.a) r9
                    kotlin.ResultKt.m(r10)
                    goto L6a
                L49:
                    kotlin.ResultKt.m(r10)
                    kotlin.jvm.internal.i1$h<R> r10 = r8.f71731a
                    pj.n<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r2 = r8.f71732b
                    T r5 = r10.f312751a
                    r7 = 1
                    r0.f71734a = r8
                    r7 = 3
                    r0.f71735b = r10
                    r7 = 3
                    r0.f71738e = r4
                    r7 = 4
                    java.lang.Object r9 = r2.invoke(r5, r9, r0)
                    r7 = 6
                    if (r9 != r1) goto L64
                    goto L83
                L64:
                    r6 = r9
                    r6 = r9
                    r9 = r8
                    r8 = r10
                    r8 = r10
                    r10 = r6
                L6a:
                    r7 = 5
                    r8.f312751a = r10
                    r7 = 5
                    kotlinx.coroutines.flow.j<R> r8 = r9.f71733c
                    r7 = 5
                    kotlin.jvm.internal.i1$h<R> r9 = r9.f71731a
                    T r9 = r9.f312751a
                    r7 = 6
                    r10 = 0
                    r0.f71734a = r10
                    r0.f71735b = r10
                    r0.f71738e = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L84
                L83:
                    return r1
                L84:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.e.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(R r10, kotlinx.coroutines.flow.i<? extends T> iVar, pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f71728d = r10;
            this.f71729e = iVar;
            this.f71730f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f71728d, this.f71729e, this.f71730f, dVar);
            eVar.f71727c = obj;
            return eVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.paging.d0$e<R> for r7v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 0
                int r1 = r7.f71726b
                r6 = 7
                r2 = 2
                r3 = 6
                r3 = 1
                if (r1 == 0) goto L2c
                r6 = 5
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.m(r8)
                goto L6f
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1e:
                r6 = 6
                java.lang.Object r1 = r7.f71725a
                r6 = 2
                kotlin.jvm.internal.i1$h r1 = (kotlin.jvm.internal.i1.h) r1
                java.lang.Object r3 = r7.f71727c
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
                kotlin.ResultKt.m(r8)
                goto L51
            L2c:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f71727c
                r6 = 3
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                kotlin.jvm.internal.i1$h r1 = new kotlin.jvm.internal.i1$h
                r1.<init>()
                r6 = 5
                R r4 = r7.f71728d
                r6 = 7
                r1.f312751a = r4
                r6 = 2
                r7.f71727c = r8
                r7.f71725a = r1
                r6 = 1
                r7.f71726b = r3
                r6 = 2
                java.lang.Object r3 = r8.emit(r4, r7)
                r6 = 2
                if (r3 != r0) goto L50
                goto L6d
            L50:
                r3 = r8
            L51:
                r6 = 5
                kotlinx.coroutines.flow.i<T> r8 = r7.f71729e
                r6 = 6
                androidx.paging.d0$e$a r4 = new androidx.paging.d0$e$a
                r6 = 1
                pj.n<R, T, kotlin.coroutines.d<? super R>, java.lang.Object> r5 = r7.f71730f
                r6 = 7
                r4.<init>(r1, r5, r3)
                r1 = 0
                r7.f71727c = r1
                r6 = 1
                r7.f71725a = r1
                r7.f71726b = r2
                java.lang.Object r7 = r8.collect(r4, r7)
                r6 = 2
                if (r7 != r0) goto L6f
            L6d:
                r6 = 2
                return r0
            L6f:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super R> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {}, s = {})
    static final class f<R> extends kotlin.coroutines.jvm.internal.o implements Function2<a3<R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f71739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f71740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f71741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> f71742d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f71743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f71744b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> f71745c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<R> f71746d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, l<R> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f71745c = nVar;
                this.f71746d = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f71745c, this.f71746d, dVar);
                aVar.f71744b = obj;
                return aVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.d0$f$a<T> for r5v4 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f71743a
                    r4 = 6
                    r2 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r2) goto L10
                    kotlin.ResultKt.m(r6)
                    goto L30
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    r4 = 6
                    java.lang.String r6 = "n/s/w orthsatui //o eoelicb/levk oe///tcore nemurfi"
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    r4 = 6
                    throw r5
                L1c:
                    kotlin.ResultKt.m(r6)
                    java.lang.Object r6 = r5.f71744b
                    pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r5.f71745c
                    androidx.paging.l<R> r3 = r5.f71746d
                    r5.f71743a = r2
                    r4 = 0
                    java.lang.Object r5 = r1.invoke(r3, r6, r5)
                    r4 = 2
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    kotlin.Unit r5 = kotlin.Unit.f312394a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.flow.i<? extends T> iVar, pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f71741c = iVar;
            this.f71742d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f71741c, this.f71742d, dVar);
            fVar.f71740b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f71739a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a3 a3Var = (a3) this.f71740b;
                kotlinx.coroutines.flow.i<T> iVar = this.f71741c;
                a aVar = new a(this.f71742d, new l(a3Var), null);
                this.f71739a = 1;
                if (kotlinx.coroutines.flow.k.C(iVar, aVar, this) == objL) {
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
        public final Object invoke(@NotNull a3<R> a3Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(a3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <T1, T2, R> Object b(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull pj.o<? super T1, ? super T2, ? super m, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar, @NotNull kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>> dVar) {
        return z2.a(new a(iVar, iVar2, oVar, null));
    }

    private static final <T1, T2, R> Object c(kotlinx.coroutines.flow.i<? extends T1> iVar, kotlinx.coroutines.flow.i<? extends T2> iVar2, pj.o<? super T1, ? super T2, ? super m, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar, kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>> dVar) {
        return z2.a(new a(iVar, iVar2, oVar, null));
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> d(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super kotlinx.coroutines.flow.i<? extends R>>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return h(iVar, new b(transform, null));
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> e(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return h(iVar, new c(transform, null));
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> f(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return kotlinx.coroutines.flow.k.K0(new d(iVar, operation, null));
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> g(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, R r10, @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return kotlinx.coroutines.flow.k.K0(new e(r10, iVar, operation, null));
    }

    @NotNull
    public static final <T, R> kotlinx.coroutines.flow.i<R> h(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, @NotNull pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return z2.a(new f(iVar, transform, null));
    }
}
