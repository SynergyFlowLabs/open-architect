package androidx.lifecycle.compose;

import androidx.compose.runtime.k4;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import androidx.lifecycle.j1;
import androidx.lifecycle.o0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n75#2:188\n75#2:189\n1282#3,6:190\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n59#1:188\n135#1:189\n176#1:190,6\n*E\n"})
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<k4<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f52191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.c0 f52192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.c0.b f52193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f52194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f52195f;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.c$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", i = {}, l = {179, 181}, m = "invokeSuspend", n = {}, s = {})
        static final class C0473a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f52196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f52197b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f52198c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k4<T> f52199d;

            /* JADX INFO: renamed from: androidx.lifecycle.compose.c$a$a$a, reason: collision with other inner class name */
            static final class C0474a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ k4<T> f52200a;

                C0474a(k4<T> k4Var) {
                    this.f52200a = k4Var;
                }

                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                    this.f52200a.setValue(t10);
                    return Unit.f312394a;
                }
            }

            /* JADX INFO: renamed from: androidx.lifecycle.compose.c$a$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f52201a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.i<T> f52202b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ k4<T> f52203c;

                /* JADX INFO: renamed from: androidx.lifecycle.compose.c$a$a$b$a, reason: collision with other inner class name */
                static final class C0475a<T> implements kotlinx.coroutines.flow.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ k4<T> f52204a;

                    C0475a(k4<T> k4Var) {
                        this.f52204a = k4Var;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                        this.f52204a.setValue(t10);
                        return Unit.f312394a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(kotlinx.coroutines.flow.i<? extends T> iVar, k4<T> k4Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f52202b = iVar;
                    this.f52203c = k4Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f52202b, this.f52203c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f52201a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.f52202b;
                        C0475a c0475a = new C0475a(this.f52203c);
                        this.f52201a = 1;
                        if (iVar.collect(c0475a, this) == objL) {
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
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0473a(CoroutineContext coroutineContext, kotlinx.coroutines.flow.i<? extends T> iVar, k4<T> k4Var, kotlin.coroutines.d<? super C0473a> dVar) {
                super(2, dVar);
                this.f52197b = coroutineContext;
                this.f52198c = iVar;
                this.f52199d = k4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0473a(this.f52197b, this.f52198c, this.f52199d, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            
                if (r8.collect(r1, r7) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            
                if (kotlinx.coroutines.i.h(r8, r1, r7) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 6
                    int r1 = r7.f52196a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    goto L18
                L10:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L18:
                    kotlin.ResultKt.m(r8)
                    goto L57
                L1c:
                    r6 = 2
                    kotlin.ResultKt.m(r8)
                    kotlin.coroutines.CoroutineContext r8 = r7.f52197b
                    kotlin.coroutines.h r1 = kotlin.coroutines.h.f312451a
                    boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
                    if (r8 == 0) goto L3e
                    kotlinx.coroutines.flow.i<T> r8 = r7.f52198c
                    r6 = 0
                    androidx.lifecycle.compose.c$a$a$a r1 = new androidx.lifecycle.compose.c$a$a$a
                    r6 = 3
                    androidx.compose.runtime.k4<T> r2 = r7.f52199d
                    r1.<init>(r2)
                    r7.f52196a = r3
                    java.lang.Object r7 = r8.collect(r1, r7)
                    if (r7 != r0) goto L57
                    goto L55
                L3e:
                    r6 = 0
                    kotlin.coroutines.CoroutineContext r8 = r7.f52197b
                    androidx.lifecycle.compose.c$a$a$b r1 = new androidx.lifecycle.compose.c$a$a$b
                    kotlinx.coroutines.flow.i<T> r3 = r7.f52198c
                    androidx.compose.runtime.k4<T> r4 = r7.f52199d
                    r6 = 5
                    r5 = 0
                    r1.<init>(r3, r4, r5)
                    r7.f52196a = r2
                    java.lang.Object r7 = kotlinx.coroutines.i.h(r8, r1, r7)
                    r6 = 2
                    if (r7 != r0) goto L57
                L55:
                    r6 = 0
                    return r0
                L57:
                    r6 = 1
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.c.a.C0473a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0473a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.lifecycle.c0 c0Var, androidx.lifecycle.c0.b bVar, CoroutineContext coroutineContext, kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f52192c = c0Var;
            this.f52193d = bVar;
            this.f52194e = coroutineContext;
            this.f52195f = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f52192c, this.f52193d, this.f52194e, this.f52195f, dVar);
            aVar.f52191b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(k4<T> k4Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(k4Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f52190a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k4 k4Var = (k4) this.f52191b;
                androidx.lifecycle.c0 c0Var = this.f52192c;
                androidx.lifecycle.c0.b bVar = this.f52193d;
                C0473a c0473a = new C0473a(this.f52194e, this.f52195f, k4Var, null);
                this.f52190a = 1;
                if (j1.a(c0Var, bVar, c0473a, this) == objL) {
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
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> n7<T> a(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, T t10, @NotNull androidx.lifecycle.c0 c0Var, @Nullable androidx.lifecycle.c0.b bVar, @Nullable CoroutineContext coroutineContext, @Nullable androidx.compose.runtime.c0 c0Var2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            bVar = androidx.lifecycle.c0.b.STARTED;
        }
        androidx.lifecycle.c0.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (m0.l0()) {
            int i12 = 0 & (-1);
            m0.A0(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {iVar, c0Var, bVar2, coroutineContext2};
        boolean zK0 = c0Var2.k0(c0Var) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var2.K(bVar2.ordinal())) || (i10 & 3072) == 2048) | c0Var2.k0(coroutineContext2) | c0Var2.k0(iVar);
        Object objI0 = c0Var2.i0();
        if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            a aVar = new a(c0Var, bVar2, coroutineContext2, iVar, null);
            c0Var2.Y(aVar);
            objI0 = aVar;
        }
        n7<T> n7VarU = w6.u(t10, objArr, (Function2) objI0, c0Var2, (i10 >> 3) & 14);
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarU;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> n7<T> b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, T t10, @Nullable o0 o0Var, @Nullable androidx.lifecycle.c0.b bVar, @Nullable CoroutineContext coroutineContext, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            o0Var = (o0) c0Var.W(d0.c());
        }
        if ((i11 & 4) != 0) {
            bVar = androidx.lifecycle.c0.b.STARTED;
        }
        androidx.lifecycle.c0.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (m0.l0()) {
            m0.A0(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        n7<T> n7VarA = a(iVar, t10, o0Var.getLifecycle(), bVar2, coroutineContext2, c0Var, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 7168) | (57344 & i10), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> n7<T> c(@NotNull z0<? extends T> z0Var, @NotNull androidx.lifecycle.c0 c0Var, @Nullable androidx.lifecycle.c0.b bVar, @Nullable CoroutineContext coroutineContext, @Nullable androidx.compose.runtime.c0 c0Var2, int i10, int i11) {
        if ((i11 & 2) != 0) {
            bVar = androidx.lifecycle.c0.b.STARTED;
        }
        androidx.lifecycle.c0.b bVar2 = bVar;
        if ((i11 & 4) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (m0.l0()) {
            m0.A0(-1858162195, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
        }
        int i12 = i10 << 3;
        n7<T> n7VarA = a(z0Var, z0Var.getValue(), c0Var, bVar2, coroutineContext2, c0Var2, (i10 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarA;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T> n7<T> d(@NotNull z0<? extends T> z0Var, @Nullable o0 o0Var, @Nullable androidx.lifecycle.c0.b bVar, @Nullable CoroutineContext coroutineContext, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            o0Var = (o0) c0Var.W(d0.c());
        }
        if ((i11 & 2) != 0) {
            bVar = androidx.lifecycle.c0.b.STARTED;
        }
        androidx.lifecycle.c0.b bVar2 = bVar;
        if ((i11 & 4) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (m0.l0()) {
            m0.A0(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i12 = i10 << 3;
        n7<T> n7VarA = a(z0Var, z0Var.getValue(), o0Var.getLifecycle(), bVar2, coroutineContext2, c0Var, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarA;
    }
}
