package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DragGestureNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,671:1\n1#2:672\n*E\n"})
public abstract class j2 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.d2 {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f14623i3 = 8;

    @Nullable
    private androidx.compose.foundation.interaction.a.b H1;

    @NotNull
    private Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> X;
    private boolean Y;

    @Nullable
    private androidx.compose.foundation.interaction.j Z;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.input.pointer.y0 f14625h3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.channels.p<d1> f14627p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f14628p2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private q3 f14629w;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.input.pointer.c0, Boolean> f14626p0 = new Function1() { // from class: androidx.compose.foundation.gestures.d2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(j2.H9(this.f14535a, (androidx.compose.ui.input.pointer.c0) obj));
        }
    };

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private long f14624g3 = n0.g.f332700b.e();

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.j2$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {543}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
        static final class C0078a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14632b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f14633c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j2 f14634d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.ui.input.pointer.c0, androidx.compose.ui.input.pointer.c0, n0.g, Unit> f14635e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<androidx.compose.ui.input.pointer.c0, Unit> f14636f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f14637g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0<Boolean> f14638h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.ui.input.pointer.c0, n0.g, Unit> f14639i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0078a(androidx.compose.ui.input.pointer.l0 l0Var, j2 j2Var, pj.n<? super androidx.compose.ui.input.pointer.c0, ? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> nVar, Function1<? super androidx.compose.ui.input.pointer.c0, Unit> function1, Function0<Unit> function0, Function0<Boolean> function2, Function2<? super androidx.compose.ui.input.pointer.c0, ? super n0.g, Unit> function3, kotlin.coroutines.d<? super C0078a> dVar) {
                super(2, dVar);
                this.f14633c = l0Var;
                this.f14634d = j2Var;
                this.f14635e = nVar;
                this.f14636f = function1;
                this.f14637g = function0;
                this.f14638h = function2;
                this.f14639i = function3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0078a c0078a = new C0078a(this.f14633c, this.f14634d, this.f14635e, this.f14636f, this.f14637g, this.f14638h, this.f14639i, dVar);
                c0078a.f14632b = obj;
                return c0078a;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0066  */
            /* JADX WARN: Code duplicated, block: B:32:0x007b  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.s0 s0Var;
                C0078a c0078a;
                CancellationException cancellationException;
                kotlinx.coroutines.channels.p pVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14631a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0Var = (kotlinx.coroutines.s0) this.f14632b;
                    try {
                        androidx.compose.ui.input.pointer.l0 l0Var = this.f14633c;
                        q3 q3Var = this.f14634d.f14629w;
                        pj.n<androidx.compose.ui.input.pointer.c0, androidx.compose.ui.input.pointer.c0, n0.g, Unit> nVar = this.f14635e;
                        Function1<androidx.compose.ui.input.pointer.c0, Unit> function1 = this.f14636f;
                        Function0<Unit> function0 = this.f14637g;
                        Function0<Boolean> function2 = this.f14638h;
                        Function2<androidx.compose.ui.input.pointer.c0, n0.g, Unit> function3 = this.f14639i;
                        this.f14632b = s0Var;
                        this.f14631a = 1;
                        c0078a = this;
                        try {
                            if (x1.J(l0Var, q3Var, nVar, function1, function0, function2, function3, c0078a) == objL) {
                                return objL;
                            }
                        } catch (CancellationException e10) {
                            e = e10;
                            cancellationException = e;
                            pVar = c0078a.f14634d.f14627p1;
                            if (pVar != null) {
                                kotlinx.coroutines.channels.t.b(pVar.p(d1.a.f14527b));
                            }
                            if (!kotlinx.coroutines.t0.k(s0Var)) {
                                throw cancellationException;
                            }
                        }
                    } catch (CancellationException e11) {
                        e = e11;
                        c0078a = this;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s0Var = (kotlinx.coroutines.s0) this.f14632b;
                    try {
                        ResultKt.m(obj);
                    } catch (CancellationException e12) {
                        cancellationException = e12;
                        c0078a = this;
                        pVar = c0078a.f14634d.f14627p1;
                        if (pVar != null) {
                            kotlinx.coroutines.channels.t.b(pVar.p(d1.a.f14527b));
                        }
                        if (!kotlinx.coroutines.t0.k(s0Var)) {
                            throw cancellationException;
                        }
                    }
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0078a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(j2 j2Var, r0.e eVar, androidx.compose.ui.input.pointer.c0 c0Var, androidx.compose.ui.input.pointer.c0 c0Var2, n0.g gVar) {
            j2Var.f14624g3 = n0.g.f332700b.e();
            if (j2Var.U9().invoke(c0Var).booleanValue()) {
                if (!j2Var.f14628p2) {
                    if (j2Var.f14627p1 == null) {
                        j2Var.f14627p1 = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);
                    }
                    j2Var.ea();
                }
                r0.f.d(eVar, c0Var);
                long jV = n0.g.v(c0Var2.u(), gVar.B());
                kotlinx.coroutines.channels.p pVar = j2Var.f14627p1;
                if (pVar != null) {
                    kotlinx.coroutines.channels.t.b(pVar.p(new d1.c(jV, null)));
                }
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(r0.e eVar, androidx.compose.ui.input.pointer.l0 l0Var, j2 j2Var, androidx.compose.ui.input.pointer.c0 c0Var) {
            r0.f.d(eVar, c0Var);
            float fM = l0Var.getViewConfiguration().m();
            long jC = eVar.c(androidx.compose.ui.unit.d0.a(fM, fM));
            eVar.f();
            kotlinx.coroutines.channels.p pVar = j2Var.f14627p1;
            if (pVar != null) {
                kotlinx.coroutines.channels.t.b(pVar.p(new d1.d(x2.n(jC), null)));
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(j2 j2Var) {
            kotlinx.coroutines.channels.p pVar = j2Var.f14627p1;
            if (pVar != null) {
                kotlinx.coroutines.channels.t.b(pVar.p(d1.a.f14527b));
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(j2 j2Var) {
            return !j2Var.da();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(j2 j2Var, kotlin.jvm.internal.i1.g gVar, r0.e eVar, androidx.compose.ui.input.pointer.c0 c0Var, n0.g gVar2) {
            if (androidx.compose.foundation.s1.f18605j) {
                long jH = androidx.compose.ui.layout.h0.h(androidx.compose.ui.node.k.s(j2Var));
                if (!n0.g.l(jH, gVar.f312750a)) {
                    j2Var.f14624g3 = n0.g.w(j2Var.f14624g3, n0.g.v(jH, gVar.f312750a));
                }
                gVar.f312750a = jH;
            }
            r0.f.e(eVar, c0Var, j2Var.f14624g3);
            kotlinx.coroutines.channels.p pVar = j2Var.f14627p1;
            if (pVar != null) {
                kotlinx.coroutines.channels.t.b(pVar.p(new d1.b(gVar2.B(), null)));
            }
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(final androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final r0.e eVar = new r0.e();
            final kotlin.jvm.internal.i1.g gVar = new kotlin.jvm.internal.i1.g();
            gVar.f312750a = androidx.compose.foundation.s1.f18605j ? androidx.compose.ui.layout.h0.h(androidx.compose.ui.node.k.s(j2.this)) : n0.g.f332700b.e();
            final j2 j2Var = j2.this;
            pj.n nVar = new pj.n() { // from class: androidx.compose.foundation.gestures.e2
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return j2.a.f(j2Var, eVar, (androidx.compose.ui.input.pointer.c0) obj, (androidx.compose.ui.input.pointer.c0) obj2, (n0.g) obj3);
                }
            };
            final j2 j2Var2 = j2.this;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.f2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j2.a.g(eVar, l0Var, j2Var2, (androidx.compose.ui.input.pointer.c0) obj);
                }
            };
            final j2 j2Var3 = j2.this;
            Function0 function0 = new Function0() { // from class: androidx.compose.foundation.gestures.g2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j2.a.h(j2Var3);
                }
            };
            final j2 j2Var4 = j2.this;
            Function0 function2 = new Function0() { // from class: androidx.compose.foundation.gestures.h2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(j2.a.i(j2Var4));
                }
            };
            final j2 j2Var5 = j2.this;
            Object objG = kotlinx.coroutines.t0.g(new C0078a(l0Var, j2.this, nVar, function1, function0, function2, new Function2() { // from class: androidx.compose.foundation.gestures.i2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j2.a.j(j2Var5, gVar, eVar, (androidx.compose.ui.input.pointer.c0) obj, (n0.g) obj2);
                }
            }, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {}, l = {583}, m = "processDragCancel", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14640a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14642c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14640a = obj;
            this.f14642c |= Integer.MIN_VALUE;
            return j2.this.aa(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 1, 1}, l = {565, 568}, m = "processDragStart", n = {androidx.core.app.w.I0, androidx.core.app.w.I0, "interaction"}, s = {"L$0", "L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14645c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14647e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14645c = obj;
            this.f14647e |= Integer.MIN_VALUE;
            return j2.this.ba(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0}, l = {575}, m = "processDragStop", n = {androidx.core.app.w.I0}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14649b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14651d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14649b = obj;
            this.f14651d |= Integer.MIN_VALUE;
            return j2.this.ca(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {436, 438, 440, 447, 449, 452}, m = "invokeSuspend", n = {"$this$launch", androidx.core.app.w.I0, "$this$launch", androidx.core.app.w.I0, "$this$launch", androidx.core.app.w.I0, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f14655d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {443}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Function1<? super d1.b, ? extends Unit>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f14657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f14658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f14659c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.i1.h<d1> f14660d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ j2 f14661e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.jvm.internal.i1.h<d1> hVar, j2 j2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14660d = hVar;
                this.f14661e = j2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14660d, this.f14661e, dVar);
                aVar.f14659c = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003b  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:26:0x006f). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:25:0x006c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Function1 function1;
                d1 d1Var;
                T t10;
                kotlin.jvm.internal.i1.h<d1> hVar;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14658b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    function1 = (Function1) this.f14659c;
                    d1Var = this.f14660d.f312751a;
                    if (!(d1Var instanceof d1.d) || (d1Var instanceof d1.a)) {
                        return Unit.f312394a;
                    }
                    t10 = 0;
                    d1.b bVar = d1Var instanceof d1.b ? (d1.b) d1Var : null;
                    if (bVar != null) {
                        function1.invoke(bVar);
                    }
                    hVar = this.f14660d;
                    kotlinx.coroutines.channels.p pVar = this.f14661e.f14627p1;
                    if (pVar != null) {
                        this.f14659c = function1;
                        this.f14657a = hVar;
                        this.f14658b = 1;
                        obj = pVar.j(this);
                        if (obj == objL) {
                            return objL;
                        }
                    }
                    hVar.f312751a = t10;
                    d1Var = this.f14660d.f312751a;
                    if (d1Var instanceof d1.d) {
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (kotlin.jvm.internal.i1.h) this.f14657a;
                function1 = (Function1) this.f14659c;
                ResultKt.m(obj);
                t10 = (d1) obj;
                hVar.f312751a = t10;
                d1Var = this.f14660d.f312751a;
                if (d1Var instanceof d1.d) {
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Function1<? super d1.b, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(function1, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = j2.this.new e(dVar);
            eVar.f14655d = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r1 r3
          0x003c: PHI (r1v14 kotlin.jvm.internal.i1$h) = (r1v6 kotlin.jvm.internal.i1$h), (r1v20 kotlin.jvm.internal.i1$h) binds: [B:13:0x0038, B:37:0x00d8] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r3v8 kotlinx.coroutines.s0) = (r3v5 kotlinx.coroutines.s0), (r3v12 kotlinx.coroutines.s0) binds: [B:13:0x0038, B:37:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x006d A[PHI: r4
          0x006d: PHI (r4v8 kotlinx.coroutines.s0) = 
          (r4v1 kotlinx.coroutines.s0)
          (r4v4 kotlinx.coroutines.s0)
          (r4v4 kotlinx.coroutines.s0)
          (r4v4 kotlinx.coroutines.s0)
          (r4v6 kotlinx.coroutines.s0)
          (r4v9 kotlinx.coroutines.s0)
         binds: [B:18:0x0064, B:46:0x0103, B:48:0x0114, B:42:0x00f8, B:30:0x00a5, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0075  */
        /* JADX WARN: Code duplicated, block: B:23:0x0084  */
        /* JADX WARN: Code duplicated, block: B:25:0x0095  */
        /* JADX WARN: Code duplicated, block: B:26:0x0098  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ff A[Catch: CancellationException -> 0x00fb, TryCatch #1 {CancellationException -> 0x00fb, blocks: (B:39:0x00db, B:41:0x00e1, B:45:0x00ff, B:47:0x0105), top: B:58:0x00db }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0105 A[Catch: CancellationException -> 0x00fb, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00fb, blocks: (B:39:0x00db, B:41:0x00e1, B:45:0x00ff, B:47:0x0105), top: B:58:0x00db }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a5 -> B:19:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00f8 -> B:19:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0103 -> B:19:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0114 -> B:19:0x006d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0127 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.j2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j2(@NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable q3 q3Var) {
        this.f14629w = q3Var;
        this.X = function1;
        this.Y = z10;
        this.Z = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H9(j2 j2Var, androidx.compose.ui.input.pointer.c0 c0Var) {
        return j2Var.X.invoke(c0Var).booleanValue();
    }

    private final androidx.compose.ui.input.pointer.y0 X9() {
        return androidx.compose.ui.input.pointer.w0.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object aa(kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f14642c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f14642c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f14640a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f14642c;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.interaction.a.b bVar2 = this.H1;
            if (bVar2 != null) {
                androidx.compose.foundation.interaction.j jVar = this.Z;
                if (jVar != null) {
                    androidx.compose.foundation.interaction.a.C0087a c0087a = new androidx.compose.foundation.interaction.a.C0087a(bVar2);
                    bVar.f14642c = 1;
                    if (jVar.b(c0087a, bVar) == objL) {
                        return objL;
                    }
                }
            }
            Z9(androidx.compose.ui.unit.c0.f42681b.a());
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.H1 = null;
        Z9(androidx.compose.ui.unit.c0.f42681b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object ba(d1.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        c cVar2;
        androidx.compose.foundation.interaction.j jVar;
        androidx.compose.foundation.interaction.a.b bVar;
        d1.c cVar3;
        androidx.compose.foundation.interaction.a.b bVar2;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f14647e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f14647e = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        Object obj = cVar2.f14645c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar2.f14647e;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.interaction.a.b bVar3 = this.H1;
            if (bVar3 != null && (jVar = this.Z) != null) {
                androidx.compose.foundation.interaction.a.C0087a c0087a = new androidx.compose.foundation.interaction.a.C0087a(bVar3);
                cVar2.f14643a = cVar;
                cVar2.f14647e = 1;
                if (jVar.b(c0087a, cVar2) != objL) {
                }
                return objL;
            }
            this.H1 = bVar;
            Y9(cVar.a());
            return Unit.f312394a;
        }
        if (i11 == 1) {
            cVar = (d1.c) cVar2.f14643a;
            ResultKt.m(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (androidx.compose.foundation.interaction.a.b) cVar2.f14644b;
            cVar3 = (d1.c) cVar2.f14643a;
            ResultKt.m(obj);
        }
        bVar = bVar2;
        cVar = cVar3;
        this.H1 = bVar;
        Y9(cVar.a());
        return Unit.f312394a;
        bVar = new androidx.compose.foundation.interaction.a.b();
        androidx.compose.foundation.interaction.j jVar2 = this.Z;
        if (jVar2 != null) {
            cVar2.f14643a = cVar;
            cVar2.f14644b = bVar;
            cVar2.f14647e = 2;
            if (jVar2.b(bVar, cVar2) != objL) {
                cVar3 = cVar;
                bVar2 = bVar;
                bVar = bVar2;
                cVar = cVar3;
            }
            return objL;
        }
        this.H1 = bVar;
        Y9(cVar.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object ca(d1.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        d dVar3;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i10 = dVar3.f14651d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar3.f14651d = i10 - Integer.MIN_VALUE;
            } else {
                dVar3 = new d(dVar2);
            }
        } else {
            dVar3 = new d(dVar2);
        }
        Object obj = dVar3.f14649b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar3.f14651d;
        if (i11 == 0) {
            ResultKt.m(obj);
            androidx.compose.foundation.interaction.a.b bVar = this.H1;
            if (bVar != null) {
                androidx.compose.foundation.interaction.j jVar = this.Z;
                if (jVar != null) {
                    androidx.compose.foundation.interaction.a.c cVar = new androidx.compose.foundation.interaction.a.c(bVar);
                    dVar3.f14648a = dVar;
                    dVar3.f14651d = 1;
                    if (jVar.b(cVar, dVar3) == objL) {
                        return objL;
                    }
                }
            }
            Z9(dVar.a());
            return Unit.f312394a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (d1.d) dVar3.f14648a;
        ResultKt.m(obj);
        this.H1 = null;
        Z9(dVar.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ea() {
        this.f14628p2 = true;
        kotlinx.coroutines.k.f(Q8(), null, null, new e(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ga(j2 j2Var, Function1 function1, boolean z10, androidx.compose.foundation.interaction.j jVar, q3 q3Var, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i10 & 1) != 0) {
            function1 = j2Var.X;
        }
        if ((i10 & 2) != 0) {
            z10 = j2Var.Y;
        }
        if ((i10 & 4) != 0) {
            jVar = j2Var.Z;
        }
        if ((i10 & 8) != 0) {
            q3Var = j2Var.f14629w;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        androidx.compose.foundation.interaction.j jVar2 = jVar;
        Function1 function2 = function1;
        j2Var.fa(function2, z10, jVar2, q3Var, z12);
    }

    public final void S9() {
        androidx.compose.foundation.interaction.a.b bVar = this.H1;
        if (bVar != null) {
            androidx.compose.foundation.interaction.j jVar = this.Z;
            if (jVar != null) {
                jVar.a(new androidx.compose.foundation.interaction.a.C0087a(bVar));
            }
            this.H1 = null;
        }
    }

    @Nullable
    public abstract Object T9(@NotNull Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @NotNull
    protected final Function1<androidx.compose.ui.input.pointer.c0, Boolean> U9() {
        return this.X;
    }

    protected final boolean V9() {
        return this.Y;
    }

    @Nullable
    protected final androidx.compose.foundation.interaction.j W9() {
        return this.Z;
    }

    public abstract void Y9(long j10);

    public abstract void Z9(long j10);

    public abstract boolean da();

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        this.f14628p2 = false;
        S9();
        this.f14624g3 = n0.g.f332700b.e();
    }

    public final void fa(@NotNull Function1<? super androidx.compose.ui.input.pointer.c0, Boolean> function1, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable q3 q3Var, boolean z11) {
        androidx.compose.ui.input.pointer.y0 y0Var;
        this.X = function1;
        boolean z12 = true;
        if (this.Y != z10) {
            this.Y = z10;
            if (!z10) {
                S9();
                androidx.compose.ui.input.pointer.y0 y0Var2 = this.f14625h3;
                if (y0Var2 != null) {
                    C9(y0Var2);
                }
                this.f14625h3 = null;
            }
            z11 = true;
        }
        if (!Intrinsics.areEqual(this.Z, jVar)) {
            S9();
            this.Z = jVar;
        }
        if (this.f14629w != q3Var) {
            this.f14629w = q3Var;
        } else {
            z12 = z11;
        }
        if (!z12 || (y0Var = this.f14625h3) == null) {
            return;
        }
        y0Var.A6();
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        androidx.compose.ui.input.pointer.y0 y0Var = this.f14625h3;
        if (y0Var != null) {
            y0Var.p3();
        }
    }

    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        if (this.Y && this.f14625h3 == null) {
            this.f14625h3 = (androidx.compose.ui.input.pointer.y0) v9(X9());
        }
        androidx.compose.ui.input.pointer.y0 y0Var = this.f14625h3;
        if (y0Var != null) {
            y0Var.p5(qVar, sVar, j10);
        }
    }
}
