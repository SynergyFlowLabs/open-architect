package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class k6 {

    @SourceDebugExtension({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,86:1\n607#2:87\n604#2,6:88\n1282#3,3:94\n1285#3,3:98\n1282#3,6:101\n1282#3,6:107\n1282#3,6:113\n605#4:97\n66#5,5:119\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n41#1:87\n41#1:88,6\n41#1:94,3\n41#1:98,3\n42#1:101,6\n44#1:107,6\n53#1:113,6\n41#1:97\n45#1:119,5\n*E\n"})
    static final class a implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f20388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.j f20389b;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.k6$a$a, reason: collision with other inner class name */
        static final class C0149a implements PointerInputEventHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f20390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> f20391b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.j f20392c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n7<Function1<n0.g, Unit>> f20393d;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.k6$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
            static final class C0150a extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f20394a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f20395b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                /* synthetic */ long f20396c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f20397d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> f20398e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.j f20399f;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.k6$a$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                static final class C0151a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f20400a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f20401b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> f20402c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ long f20403d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.j f20404e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0151a(androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var, long j10, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super C0151a> dVar) {
                        super(2, dVar);
                        this.f20402c = n3Var;
                        this.f20403d = j10;
                        this.f20404e = jVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0151a(this.f20402c, this.f20403d, this.f20404e, dVar);
                    }

                    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var;
                        androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var2;
                        androidx.compose.foundation.interaction.l.b bVar;
                        androidx.compose.foundation.interaction.j jVar;
                        androidx.compose.foundation.interaction.l.b bVar2;
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f20401b;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                n3Var2 = (androidx.compose.runtime.n3) this.f20400a;
                                ResultKt.m(obj);
                            } else {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                bVar2 = (androidx.compose.foundation.interaction.l.b) this.f20400a;
                                ResultKt.m(obj);
                            }
                            bVar = bVar2;
                            this.f20402c.setValue(bVar);
                            return Unit.f312394a;
                        }
                        ResultKt.m(obj);
                        androidx.compose.foundation.interaction.l.b value = this.f20402c.getValue();
                        if (value == null) {
                            bVar = new androidx.compose.foundation.interaction.l.b(this.f20403d, null);
                            jVar = this.f20404e;
                            if (jVar != null) {
                                this.f20400a = bVar;
                                this.f20401b = 2;
                                if (jVar.b(bVar, this) != objL) {
                                    bVar2 = bVar;
                                    bVar = bVar2;
                                }
                            }
                            this.f20402c.setValue(bVar);
                            return Unit.f312394a;
                        }
                        androidx.compose.foundation.interaction.j jVar2 = this.f20404e;
                        n3Var = this.f20402c;
                        androidx.compose.foundation.interaction.l.a aVar = new androidx.compose.foundation.interaction.l.a(value);
                        if (jVar2 == null) {
                            n3Var.setValue(null);
                            bVar = new androidx.compose.foundation.interaction.l.b(this.f20403d, null);
                            jVar = this.f20404e;
                            if (jVar != null) {
                                this.f20400a = bVar;
                                this.f20401b = 2;
                                if (jVar.b(bVar, this) != objL) {
                                    bVar2 = bVar;
                                    bVar = bVar2;
                                }
                            }
                            this.f20402c.setValue(bVar);
                            return Unit.f312394a;
                        }
                        this.f20400a = n3Var;
                        this.f20401b = 1;
                        if (jVar2.b(aVar, this) != objL) {
                            n3Var2 = n3Var;
                        }
                        return objL;
                        n3Var = n3Var2;
                        n3Var.setValue(null);
                        bVar = new androidx.compose.foundation.interaction.l.b(this.f20403d, null);
                        jVar = this.f20404e;
                        if (jVar != null) {
                            this.f20400a = bVar;
                            this.f20401b = 2;
                            if (jVar.b(bVar, this) != objL) {
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                            return objL;
                        }
                        this.f20402c.setValue(bVar);
                        return Unit.f312394a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0151a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.text.k6$a$a$a$b */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
                static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f20405a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f20406b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> f20407c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ boolean f20408d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.j f20409e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var, boolean z10, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f20407c = n3Var;
                        this.f20408d = z10;
                        this.f20409e = jVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new b(this.f20407c, this.f20408d, this.f20409e, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var;
                        androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var2;
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f20406b;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            androidx.compose.foundation.interaction.l.b value = this.f20407c.getValue();
                            if (value != null) {
                                boolean z10 = this.f20408d;
                                androidx.compose.foundation.interaction.j jVar = this.f20409e;
                                n3Var = this.f20407c;
                                androidx.compose.foundation.interaction.g cVar = z10 ? new androidx.compose.foundation.interaction.l.c(value) : new androidx.compose.foundation.interaction.l.a(value);
                                if (jVar != null) {
                                    this.f20405a = n3Var;
                                    this.f20406b = 1;
                                    if (jVar.b(cVar, this) == objL) {
                                        return objL;
                                    }
                                    n3Var2 = n3Var;
                                }
                                n3Var.setValue(null);
                            }
                            return Unit.f312394a;
                        }
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n3Var2 = (androidx.compose.runtime.n3) this.f20405a;
                        ResultKt.m(obj);
                        n3Var = n3Var2;
                        n3Var.setValue(null);
                        return Unit.f312394a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0150a(kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d<? super C0150a> dVar) {
                    super(3, dVar);
                    this.f20397d = s0Var;
                    this.f20398e = n3Var;
                    this.f20399f = jVar;
                }

                @Override // pj.n
                public /* bridge */ /* synthetic */ Object invoke(androidx.compose.foundation.gestures.r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return k(r3Var, gVar.B(), dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f20394a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        androidx.compose.foundation.gestures.r3 r3Var = (androidx.compose.foundation.gestures.r3) this.f20395b;
                        kotlinx.coroutines.k.f(this.f20397d, null, null, new C0151a(this.f20398e, this.f20396c, this.f20399f, null), 3, null);
                        this.f20394a = 1;
                        obj = r3Var.l6(this);
                        if (obj == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    kotlinx.coroutines.k.f(this.f20397d, null, null, new b(this.f20398e, ((Boolean) obj).booleanValue(), this.f20399f, null), 3, null);
                    return Unit.f312394a;
                }

                public final Object k(androidx.compose.foundation.gestures.r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
                    C0150a c0150a = new C0150a(this.f20397d, this.f20398e, this.f20399f, dVar);
                    c0150a.f20395b = r3Var;
                    c0150a.f20396c = j10;
                    return c0150a.invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0149a(kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n3<androidx.compose.foundation.interaction.l.b> n3Var, androidx.compose.foundation.interaction.j jVar, androidx.compose.runtime.n7<? extends Function1<? super n0.g, Unit>> n7Var) {
                this.f20390a = s0Var;
                this.f20391b = n3Var;
                this.f20392c = jVar;
                this.f20393d = n7Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit b(androidx.compose.runtime.n7 n7Var, n0.g gVar) {
                ((Function1) n7Var.getValue()).invoke(gVar);
                return Unit.f312394a;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                C0150a c0150a = new C0150a(this.f20390a, this.f20391b, this.f20392c, null);
                final androidx.compose.runtime.n7<Function1<n0.g, Unit>> n7Var = this.f20393d;
                Object objM = androidx.compose.foundation.gestures.c5.m(l0Var, c0150a, new Function1() { // from class: androidx.compose.foundation.text.j6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k6.a.C0149a.b(n7Var, (n0.g) obj);
                    }
                }, dVar);
                return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
            }
        }

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n1#1,69:1\n46#2,6:70\n*E\n"})
        public static final class b implements androidx.compose.runtime.u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.n3 f20410a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.j f20411b;

            public b(androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.interaction.j jVar) {
                this.f20410a = n3Var;
                this.f20411b = jVar;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                androidx.compose.foundation.interaction.l.b bVar = (androidx.compose.foundation.interaction.l.b) this.f20410a.getValue();
                if (bVar != null) {
                    androidx.compose.foundation.interaction.l.a aVar = new androidx.compose.foundation.interaction.l.a(bVar);
                    androidx.compose.foundation.interaction.j jVar = this.f20411b;
                    if (jVar != null) {
                        jVar.a(aVar);
                    }
                    this.f20410a.setValue(null);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super n0.g, Unit> function1, androidx.compose.foundation.interaction.j jVar) {
            this.f20388a = function1;
            this.f20389b = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.runtime.u1 f(androidx.compose.runtime.n3 n3Var, androidx.compose.foundation.interaction.j jVar, androidx.compose.runtime.v1 v1Var) {
            return new b(n3Var, jVar);
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-102778667);
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 0 ^ (-1);
                androidx.compose.runtime.m0.A0(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objI0 = c0Var.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0Var);
                c0Var.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
            Object objI1 = c0Var.i0();
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.d7.g(null, null, 2, null);
                c0Var.Y(objI1);
            }
            final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI1;
            androidx.compose.runtime.n7 n7VarW = androidx.compose.runtime.w6.w(this.f20388a, c0Var, 0);
            Object obj = this.f20389b;
            boolean zD = c0Var.D(obj);
            final androidx.compose.foundation.interaction.j jVar = this.f20389b;
            Object objI2 = c0Var.i0();
            if (zD || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.foundation.text.i6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return k6.a.f(n3Var, jVar, (androidx.compose.runtime.v1) obj2);
                    }
                };
                c0Var.Y(objI2);
            }
            androidx.compose.runtime.b2.d(obj, (Function1) objI2, c0Var, 0);
            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
            androidx.compose.foundation.interaction.j jVar2 = this.f20389b;
            boolean zK0 = c0Var.k0(s0Var) | c0Var.D(this.f20389b) | c0Var.D(n7VarW);
            androidx.compose.foundation.interaction.j jVar3 = this.f20389b;
            Object objI3 = c0Var.i0();
            if (zK0 || objI3 == aVar.a()) {
                objI3 = new C0149a(s0Var, n3Var, jVar3, n7VarW);
                c0Var.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarE = androidx.compose.ui.input.pointer.w0.e(aVar2, jVar2, (PointerInputEventHandler) objI3);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarE;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return d(a0Var, c0Var, num.intValue());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.interaction.j jVar, boolean z10, @NotNull Function1<? super n0.g, Unit> function1) {
        if (z10) {
            a0Var = androidx.compose.ui.m.k(a0Var, null, new a(function1, jVar), 1, null);
        }
        return a0Var;
    }

    public static /* synthetic */ androidx.compose.ui.a0 b(androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(a0Var, jVar, z10, function1);
    }
}
