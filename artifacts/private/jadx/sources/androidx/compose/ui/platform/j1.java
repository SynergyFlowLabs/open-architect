package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.w6;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@k7
@SourceDebugExtension({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,252:1\n85#2:253\n117#2,2:254\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n*L\n200#1:253\n200#1:254,2\n*E\n"})
final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final j1 f40541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f40542b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", i = {}, l = {219}, m = "textInputSession", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40543a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f40545c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40543a = obj;
            this.f40545c |= Integer.MIN_VALUE;
            return j1.this.d(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.R1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<n3, kotlin.coroutines.d<?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f40546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f40547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<n3, kotlin.coroutines.d<?>, Object> f40548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j1 f40549d;

        public static final class a implements n3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ n3 f40550a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n3 f40551b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AtomicReference<androidx.compose.ui.g0.a<Object>> f40552c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j1 f40553d;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", i = {}, l = {230}, m = "startInputMethod", n = {}, s = {})
            static final class C0322a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f40554a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f40556c;

                C0322a(kotlin.coroutines.d<? super C0322a> dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f40554a = obj;
                    this.f40556c |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$b$a$b, reason: collision with other inner class name */
            static final class C0323b extends kotlin.jvm.internal.l0 implements Function1<kotlinx.coroutines.s0, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0323b f40557a = new C0323b();

                C0323b() {
                    super(1);
                }

                public final void c(kotlinx.coroutines.s0 s0Var) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(kotlinx.coroutines.s0 s0Var) {
                    c(s0Var);
                    return Unit.f312394a;
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<Unit, kotlin.coroutines.d<?>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f40558a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f40559b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ j3 f40560c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ n3 f40561d;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$b$a$c$a, reason: collision with other inner class name */
                static final class C0324a extends kotlin.jvm.internal.l0 implements Function0<i3> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ j1 f40562a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0324a(j1 j1Var) {
                        super(0);
                        this.f40562a = j1Var;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final i3 invoke() {
                        return this.f40562a.b();
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.j1$b$a$c$b, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
                static final class C0325b extends kotlin.coroutines.jvm.internal.o implements Function2<i3, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f40563a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f40564b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ j3 f40565c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ n3 f40566d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0325b(j3 j3Var, n3 n3Var, kotlin.coroutines.d<? super C0325b> dVar) {
                        super(2, dVar);
                        this.f40565c = j3Var;
                        this.f40566d = n3Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        C0325b c0325b = new C0325b(this.f40565c, this.f40566d, dVar);
                        c0325b.f40564b = obj;
                        return c0325b;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f40563a;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            i3 i3Var = (i3) this.f40564b;
                            j3 j3Var = this.f40565c;
                            n3 n3Var = this.f40566d;
                            this.f40563a = 1;
                            if (i3Var.a(j3Var, n3Var, this) == objL) {
                                return objL;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                        }
                        throw new kotlin.a0();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(i3 i3Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0325b) create(i3Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(j1 j1Var, j3 j3Var, n3 n3Var, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f40559b = j1Var;
                    this.f40560c = j3Var;
                    this.f40561d = n3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new c(this.f40559b, this.f40560c, this.f40561d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f40558a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.flow.i iVarY = w6.y(new C0324a(this.f40559b));
                        C0325b c0325b = new C0325b(this.f40560c, this.f40561d, null);
                        this.f40558a = 1;
                        if (kotlinx.coroutines.flow.k.C(iVarY, c0325b, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Unit unit, kotlin.coroutines.d<?> dVar) {
                    return ((c) create(unit, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            a(n3 n3Var, AtomicReference<androidx.compose.ui.g0.a<Object>> atomicReference, j1 j1Var) {
                this.f40551b = n3Var;
                this.f40552c = atomicReference;
                this.f40553d = j1Var;
                this.f40550a = n3Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001a  */
            @Override // androidx.compose.ui.platform.m3
            public Object c(j3 j3Var, kotlin.coroutines.d<?> dVar) {
                C0322a c0322a;
                if (dVar instanceof C0322a) {
                    c0322a = (C0322a) dVar;
                    int i10 = c0322a.f40556c;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0322a.f40556c = i10 - Integer.MIN_VALUE;
                    } else {
                        c0322a = new C0322a(dVar);
                    }
                } else {
                    c0322a = new C0322a(dVar);
                }
                Object obj = c0322a.f40554a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0322a.f40556c;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    AtomicReference<androidx.compose.ui.g0.a<Object>> atomicReference = this.f40552c;
                    C0323b c0323b = C0323b.f40557a;
                    c cVar = new c(this.f40553d, j3Var, this.f40551b, null);
                    c0322a.f40556c = 1;
                    if (androidx.compose.ui.g0.j(atomicReference, c0323b, cVar, c0322a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                throw new kotlin.a0();
            }

            @Override // kotlinx.coroutines.s0
            public CoroutineContext getCoroutineContext() {
                return this.f40550a.getCoroutineContext();
            }

            @Override // androidx.compose.ui.platform.m3
            public View getView() {
                return this.f40550a.getView();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super n3, ? super kotlin.coroutines.d<?>, ? extends Object> function2, j1 j1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40548c = function2;
            this.f40549d = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f40548c, this.f40549d, dVar);
            bVar.f40547b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f40546a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a((n3) this.f40547b, androidx.compose.ui.g0.b(), this.f40549d);
                Function2<n3, kotlin.coroutines.d<?>, Object> function2 = this.f40548c;
                this.f40546a = 1;
                if (function2.invoke(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n3 n3Var, kotlin.coroutines.d<?> dVar) {
            return ((b) create(n3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j1(@NotNull i3 i3Var, @Nullable j1 j1Var) {
        this.f40541a = j1Var;
        this.f40542b = d7.g(i3Var, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i3 b() {
        return (i3) this.f40542b.getValue();
    }

    private final void c(i3 i3Var) {
        this.f40542b.setValue(i3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object d(@NotNull androidx.compose.ui.node.x1 x1Var, @NotNull Function2<? super n3, ? super kotlin.coroutines.d<?>, ? extends Object> function2, @NotNull kotlin.coroutines.d<?> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f40545c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f40545c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f40543a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f40545c;
        if (i11 == 0) {
            ResultKt.m(obj);
            j1 j1Var = this.f40541a;
            b bVar = new b(function2, this, null);
            aVar.f40545c = 1;
            if (l3.d(x1Var, j1Var, bVar, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    public final void e(@NotNull i3 i3Var) {
        c(i3Var);
    }
}
