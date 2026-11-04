package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1751:1\n1#2:1752\n30#3:1753\n53#4,3:1754\n70#4:1758\n60#4:1761\n69#5:1757\n65#5:1760\n22#6:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableNode\n*L\n518#1:1753\n518#1:1754,3\n531#1:1758\n531#1:1761\n531#1:1757\n531#1:1760\n531#1:1759\n*E\n"})
final class o<T> extends j2 {

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private b0<T> f14861j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @NotNull
    private q3 f14862k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private Boolean f14863l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.x3 f14864m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @Nullable
    private Boolean f14865n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @Nullable
    private c3 f14866o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public c3 f14867p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f14868q3;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {com.google.api.client.http.a0.f115563p}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.b, t2<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f14871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o<T> f14872d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, o<T> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f14871c = function2;
            this.f14872d = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(final o oVar, final androidx.compose.foundation.gestures.b bVar, d1.b bVar2) {
            float fXa = oVar.xa(oVar.ua(bVar2.a()));
            if (oVar.f14864m3 == null) {
                androidx.compose.foundation.gestures.b.b(bVar, oVar.f14861j3.K(fXa), 0.0f, 2, null);
            } else {
                androidx.compose.foundation.x3 x3Var = oVar.f14864m3;
                Intrinsics.checkNotNull(x3Var);
                n0.g.d(x3Var.z(oVar.ya(fXa), androidx.compose.ui.input.nestedscroll.f.f38949b.h(), new Function1() { // from class: androidx.compose.foundation.gestures.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.a.v(oVar, bVar, (n0.g) obj);
                    }
                }));
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n0.g v(o oVar, androidx.compose.foundation.gestures.b bVar, n0.g gVar) {
            float fK = oVar.f14861j3.K(oVar.xa(gVar.B()));
            long jYa = oVar.ya(fK - oVar.f14861j3.N());
            androidx.compose.foundation.gestures.b.b(bVar, fK, 0.0f, 2, null);
            return n0.g.d(jYa);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14869a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final androidx.compose.foundation.gestures.b bVar = (androidx.compose.foundation.gestures.b) this.f14870b;
                Function2<Function1<? super d1.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14871c;
                final o<T> oVar = this.f14872d;
                Function1<? super d1.b, Unit> function1 = new Function1() { // from class: androidx.compose.foundation.gestures.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return o.a.s(oVar, bVar, (d1.b) obj2);
                    }
                };
                this.f14869a = 1;
                if (function2.invoke(function1, this) == objL) {
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

        @Override // pj.n
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.b bVar, t2<T> t2Var, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f14871c, this.f14872d, dVar);
            aVar.f14870b = bVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", i = {1}, l = {456, 459}, m = "fling", n = {"leftoverVelocity"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o<T> f14875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o<T> oVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f14875c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14874b = obj;
            this.f14876d |= Integer.MIN_VALUE;
            return this.f14875c.qa(0.0f, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", i = {}, l = {470}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<androidx.compose.foundation.gestures.b, t2<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o<T> f14879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.e f14880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f14881e;

        public static final class a implements z3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o<T> f14882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.gestures.b f14883b;

            a(o<T> oVar, androidx.compose.foundation.gestures.b bVar) {
                this.f14882a = oVar;
                this.f14883b = bVar;
            }

            @Override // androidx.compose.foundation.gestures.z3
            public float f(float f10) {
                float fK = ((o) this.f14882a).f14861j3.K(f10);
                float fY = fK - ((o) this.f14882a).f14861j3.y();
                androidx.compose.foundation.gestures.b.b(this.f14883b, fK, 0.0f, 2, null);
                return fY;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o<T> oVar, kotlin.jvm.internal.i1.e eVar, float f10, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f14879c = oVar;
            this.f14880d = eVar;
            this.f14881e = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.i1.e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14877a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a(this.f14879c, (androidx.compose.foundation.gestures.b) this.f14878b);
                c3 c3VarRa = this.f14879c.ra();
                kotlin.jvm.internal.i1.e eVar2 = this.f14880d;
                float f10 = this.f14881e;
                this.f14878b = eVar2;
                this.f14877a = 1;
                obj = c3VarRa.a(aVar, f10, this);
                if (obj == objL) {
                    return objL;
                }
                eVar = eVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (kotlin.jvm.internal.i1.e) this.f14878b;
                ResultKt.m(obj);
            }
            eVar.f312748a = ((Number) obj).floatValue();
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.foundation.gestures.b bVar, t2<T> t2Var, kotlin.coroutines.d<? super Unit> dVar) {
            c cVar = new c(this.f14879c, this.f14880d, this.f14881e, dVar);
            cVar.f14878b = bVar;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {435, 437}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f14885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f14886c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {439}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14887a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ long f14888b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o<T> f14889c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o<T> oVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14889c = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14889c, dVar);
                aVar.f14888b = ((androidx.compose.ui.unit.c0) obj).v();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
                return k(c0Var.v(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                long jZa;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14887a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    long j10 = this.f14888b;
                    o<T> oVar = this.f14889c;
                    float fWa = oVar.wa(j10);
                    this.f14888b = j10;
                    this.f14887a = 1;
                    obj = oVar.qa(fWa, this);
                    if (obj == objL) {
                        return objL;
                    }
                    jZa = j10;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jZa = this.f14888b;
                    ResultKt.m(obj);
                }
                float fFloatValue = ((Number) obj).floatValue();
                float fN = ((o) this.f14889c).f14861j3.N();
                float fH = ((o) this.f14889c).f14861j3.r().h();
                if (fN >= ((o) this.f14889c).f14861j3.r().f() || fN <= fH) {
                    jZa = this.f14889c.za(fFloatValue);
                }
                return androidx.compose.ui.unit.c0.b(jZa);
            }

            public final Object k(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
                return ((a) create(androidx.compose.ui.unit.c0.b(j10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o<T> oVar, long j10, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f14885b = oVar;
            this.f14886c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f14885b, this.f14886c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.qa(r9, r8) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            if (r1.A(r3, r9, r8) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f14884a
                r2 = 2
                r7 = r2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1d
                r7 = 6
                if (r1 != r2) goto L15
                r7 = 6
                kotlin.ResultKt.m(r9)
                goto L6a
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1d:
                kotlin.ResultKt.m(r9)
                r7 = 6
                goto L6d
            L22:
                kotlin.ResultKt.m(r9)
                androidx.compose.foundation.gestures.o<T> r9 = r8.f14885b
                long r4 = r8.f14886c
                long r4 = androidx.compose.foundation.gestures.o.ka(r9, r4)
                r7 = 1
                float r9 = androidx.compose.foundation.gestures.o.ma(r9, r4)
                androidx.compose.foundation.gestures.o<T> r1 = r8.f14885b
                androidx.compose.foundation.x3 r1 = androidx.compose.foundation.gestures.o.ia(r1)
                if (r1 != 0) goto L45
                androidx.compose.foundation.gestures.o<T> r1 = r8.f14885b
                r8.f14884a = r3
                java.lang.Object r8 = androidx.compose.foundation.gestures.o.ha(r1, r9, r8)
                if (r8 != r0) goto L6d
                goto L69
            L45:
                androidx.compose.foundation.gestures.o<T> r1 = r8.f14885b
                androidx.compose.foundation.x3 r1 = androidx.compose.foundation.gestures.o.ia(r1)
                r7 = 6
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                androidx.compose.foundation.gestures.o<T> r3 = r8.f14885b
                long r3 = androidx.compose.foundation.gestures.o.pa(r3, r9)
                r7 = 4
                androidx.compose.foundation.gestures.o$d$a r9 = new androidx.compose.foundation.gestures.o$d$a
                androidx.compose.foundation.gestures.o<T> r5 = r8.f14885b
                r7 = 2
                r6 = 0
                r7 = 4
                r9.<init>(r5, r6)
                r7 = 3
                r8.f14884a = r2
                java.lang.Object r8 = r1.A(r3, r9, r8)
                if (r8 != r0) goto L6a
            L69:
                return r0
            L6a:
                r7 = 0
                kotlin.Unit r8 = kotlin.Unit.f312394a
            L6d:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.o.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public o(@NotNull b0<T> b0Var, @NotNull q3 q3Var, boolean z10, @Nullable Boolean bool, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable Boolean bool2, @Nullable c3 c3Var) {
        super(k.f14680a, z10, jVar, q3Var);
        this.f14861j3 = b0Var;
        this.f14862k3 = q3Var;
        this.f14863l3 = bool;
        this.f14864m3 = x3Var;
        this.f14865n3 = bool2;
        this.f14866o3 = c3Var;
    }

    private final void Ba() {
        androidx.compose.ui.unit.d dVarQ = androidx.compose.ui.node.k.q(this);
        androidx.compose.ui.unit.d dVar = this.f14868q3;
        if (dVar == null || !Intrinsics.areEqual(dVar, dVarQ)) {
            this.f14868q3 = dVarQ;
            Ca(this.f14866o3);
        }
    }

    private final void Ca(c3 c3Var) {
        if (c3Var == null) {
            androidx.compose.foundation.gestures.d dVar = androidx.compose.foundation.gestures.d.f14520a;
            androidx.compose.animation.core.o<Float> oVarF = dVar.f();
            Function1<Float, Float> function1E = dVar.e();
            androidx.compose.ui.unit.d dVarQ = androidx.compose.ui.node.k.q(this);
            this.f14868q3 = dVarQ;
            c3Var = k.F(this.f14861j3, dVarQ, function1E, oVarF);
        }
        va(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object qa(float f10, kotlin.coroutines.d<? super Float> dVar) {
        b bVar;
        kotlin.jvm.internal.i1.e eVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f14876d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f14876d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f14874b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar2.f14876d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (this.f14861j3.G()) {
                b0<T> b0Var = this.f14861j3;
                bVar2.f14876d = 1;
                Object objZ = b0Var.Z(f10, bVar2);
                if (objZ != objL) {
                    return objZ;
                }
            } else {
                kotlin.jvm.internal.i1.e eVar2 = new kotlin.jvm.internal.i1.e();
                eVar2.f312748a = f10;
                b0<T> b0Var2 = this.f14861j3;
                c cVar = new c(this, eVar2, f10, null);
                bVar2.f14873a = eVar2;
                bVar2.f14876d = 2;
                if (b0.n(b0Var2, null, cVar, bVar2, 1, null) != objL) {
                    eVar = eVar2;
                }
            }
            return objL;
        }
        if (i11 == 1) {
            ResultKt.m(obj);
            return obj;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eVar = (kotlin.jvm.internal.i1.e) bVar2.f14873a;
        ResultKt.m(obj);
        return kotlin.coroutines.jvm.internal.b.e(eVar.f312748a);
    }

    private final boolean sa() {
        Boolean bool = this.f14863l3;
        if (bool == null) {
            return androidx.compose.ui.node.k.t(this) == androidx.compose.ui.unit.w.Rtl && this.f14862k3 == q3.Horizontal;
        }
        Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ta(long j10) {
        return androidx.compose.ui.unit.c0.s(j10, sa() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ua(long j10) {
        return n0.g.y(j10, sa() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float wa(long j10) {
        return this.f14862k3 == q3.Vertical ? androidx.compose.ui.unit.c0.n(j10) : androidx.compose.ui.unit.c0.l(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float xa(long j10) {
        return Float.intBitsToFloat((int) (this.f14862k3 == q3.Vertical ? j10 & com.rabbitmq.client.k0.f265952a : j10 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ya(float f10) {
        q3 q3Var = this.f14862k3;
        float f11 = q3Var == q3.Horizontal ? f10 : 0.0f;
        if (q3Var != q3.Vertical) {
            f10 = 0.0f;
        }
        return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long za(float f10) {
        q3 q3Var = this.f14862k3;
        float f11 = q3Var == q3.Horizontal ? f10 : 0.0f;
        if (q3Var != q3.Vertical) {
            f10 = 0.0f;
        }
        return androidx.compose.ui.unit.d0.a(f11, f10);
    }

    public final void Aa(@NotNull b0<T> b0Var, @NotNull q3 q3Var, boolean z10, @Nullable Boolean bool, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.foundation.x3 x3Var, @Nullable Boolean bool2, @Nullable c3 c3Var) {
        boolean z11;
        boolean z12;
        this.f14866o3 = c3Var;
        if (Intrinsics.areEqual(this.f14861j3, b0Var)) {
            z11 = false;
        } else {
            this.f14861j3 = b0Var;
            Ca(c3Var);
            z11 = true;
        }
        if (this.f14862k3 != q3Var) {
            this.f14862k3 = q3Var;
            z11 = true;
        }
        if (Intrinsics.areEqual(this.f14863l3, bool)) {
            z12 = z11;
        } else {
            this.f14863l3 = bool;
            z12 = true;
        }
        this.f14865n3 = bool2;
        this.f14864m3 = x3Var;
        j2.ga(this, null, z10, jVar, q3Var, z12, 1, null);
    }

    @Override // androidx.compose.foundation.gestures.j2
    @Nullable
    public Object T9(@NotNull Function2<? super Function1<? super d1.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN = b0.n(this.f14861j3, null, new a(function2, this, null), dVar, 1, null);
        return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Y9(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.j2
    public void Z9(long j10) {
        if (a9()) {
            kotlinx.coroutines.k.f(Q8(), null, null, new d(this, j10, null), 3, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.j2
    public boolean da() {
        Boolean bool = this.f14865n3;
        return bool != null ? bool.booleanValue() : this.f14861j3.J();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        Ca(this.f14866o3);
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        p3();
        if (a9()) {
            Ba();
        }
    }

    @NotNull
    public final c3 ra() {
        c3 c3Var = this.f14867p3;
        if (c3Var != null) {
            return c3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resolvedFlingBehavior");
        return null;
    }

    public final void va(@NotNull c3 c3Var) {
        this.f14867p3 = c3Var;
    }
}
