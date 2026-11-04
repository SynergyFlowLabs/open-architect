package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t0;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.platform.q1;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,474:1\n75#2:475\n75#2:500\n1282#3,6:476\n1282#3,6:482\n1282#3,6:488\n1282#3,6:494\n1282#3,3:504\n1285#3,3:508\n53#4,3:501\n53#4,3:532\n60#4:536\n70#4:539\n53#4,3:542\n1#5:507\n167#6,6:511\n249#6,14:517\n33#7:531\n33#7:541\n57#8:535\n61#8:538\n22#9:537\n22#9:540\n635#10:545\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n131#1:475\n171#1:500\n135#1:476,6\n136#1:482,6\n147#1:488,6\n159#1:494,6\n173#1:504,3\n173#1:508,3\n172#1:501,3\n317#1:532,3\n325#1:536\n326#1:539\n324#1:542,3\n262#1:511,6\n262#1:517,14\n317#1:531\n324#1:541\n325#1:535\n326#1:538\n325#1:537\n326#1:540\n334#1:545\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f38620a = "VectorRootGroup";

    static final class a extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f38621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map<String, q> f38622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(t tVar, Map<String, ? extends q> map) {
            super(2);
            this.f38621a = tVar;
            this.f38622b = map;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1450046638, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:468)");
            }
            u.a((r) this.f38621a, this.f38622b, c0Var, 0, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f38623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map<String, q> f38624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f38626d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(r rVar, Map<String, ? extends q> map, int i10, int i11) {
            super(2);
            this.f38623a = rVar;
            this.f38624b = map;
            this.f38625c = i10;
            this.f38626d = i11;
        }

        public final void c(c0 c0Var, int i10) {
            u.a(this.f38623a, this.f38624b, c0Var, t4.a(this.f38625c | 1), this.f38626d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    public static final class c implements q {
        c() {
        }
    }

    public static final class d implements q {
        d() {
        }
    }

    @SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,474:1\n66#2,5:475\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$1$1\n*L\n159#1:475,5\n*E\n"})
    static final class e extends l0 implements Function1<v1, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f38627a;

        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$1$1\n*L\n1#1,69:1\n159#2:70\n*E\n"})
        public static final class a implements u1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f38628a;

            public a(o0 o0Var) {
                this.f38628a = o0Var;
            }

            @Override // androidx.compose.runtime.u1
            public void dispose() {
                this.f38628a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0 o0Var) {
            super(1);
            this.f38627a = o0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke(v1 v1Var) {
            return new a(this.f38627a);
        }
    }

    @SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$composition$1$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,474:1\n57#2:475\n61#2:478\n60#3:476\n70#3:479\n22#4:477\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt$rememberVectorPainter$2$composition$1$1\n*L\n155#1:475\n155#1:478\n155#1:476\n155#1:479\n155#1:477\n*E\n"})
    static final class f extends l0 implements Function2<c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.o<Float, Float, c0, Integer, Unit> f38629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(pj.o<? super Float, ? super Float, ? super c0, ? super Integer, Unit> oVar, long j10) {
            super(2);
            this.f38629a = oVar;
            this.f38630b = j10;
        }

        @androidx.compose.runtime.o
        public final void c(c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1749374910, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
            }
            this.f38629a.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.f38630b >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.f38630b & k0.f265952a))), c0Var, 0);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
    /* JADX WARN: Code duplicated, block: B:48:0x018c  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0276  */
    /* JADX WARN: Code duplicated, block: B:55:0x0288  */
    /* JADX WARN: Code duplicated, block: B:56:0x028c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0297  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    public static final void a(@NotNull r rVar, @Nullable Map<String, ? extends q> map, @Nullable c0 c0Var, int i10, int i11) {
        int i12;
        Map<String, ? extends q> map2;
        boolean z10;
        Map<String, ? extends q> map3;
        s5 s5VarT;
        Map<String, ? extends q> mapEmptyMap;
        Iterator<t> it;
        t next;
        Iterator<t> it2;
        Map<String, ? extends q> map4;
        q dVar;
        q cVar;
        c0 c0VarR = c0Var.R(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 48) == 0) {
                map2 = map;
                i12 |= c0VarR.k0(map2) ? 32 : 16;
            }
            if ((i12 & 19) != 18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i13 != 0) {
                    mapEmptyMap = MapsKt.emptyMap();
                } else {
                    mapEmptyMap = map2;
                }
                if (m0.l0()) {
                    m0.A0(-446179233, i12, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:428)");
                }
                it = rVar.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next instanceof v) {
                        c0VarR.E(798467819);
                        v vVar = (v) next;
                        cVar = mapEmptyMap.get(vVar.k());
                        if (cVar == null) {
                            cVar = new c();
                        }
                        it2 = it;
                        c0 c0Var2 = c0VarR;
                        map4 = mapEmptyMap;
                        p.b((List) cVar.b(w.c.f38651b, vVar.l()), vVar.m(), vVar.k(), (i0) cVar.b(w.a.f38647b, vVar.c()), ((Number) cVar.b(w.b.f38649b, Float.valueOf(vVar.i()))).floatValue(), (i0) cVar.b(w.i.f38663b, vVar.n()), ((Number) cVar.b(w.j.f38665b, Float.valueOf(vVar.p()))).floatValue(), ((Number) cVar.b(w.k.f38667b, Float.valueOf(vVar.v()))).floatValue(), vVar.s(), vVar.t(), vVar.u(), ((Number) cVar.b(w.p.f38677b, Float.valueOf(vVar.B()))).floatValue(), ((Number) cVar.b(w.n.f38673b, Float.valueOf(vVar.w()))).floatValue(), ((Number) cVar.b(w.o.f38675b, Float.valueOf(vVar.A()))).floatValue(), c0Var2, 0, 0, 0);
                        c0VarR = c0Var2;
                        c0VarR.A();
                    } else {
                        it2 = it;
                        map4 = mapEmptyMap;
                        if (next instanceof r) {
                            c0VarR.E(799882380);
                            r rVar2 = (r) next;
                            dVar = map4.get(rVar2.k());
                            if (dVar == null) {
                                dVar = new d();
                            }
                            p.a(rVar2.k(), ((Number) dVar.b(w.f.f38657b, Float.valueOf(rVar2.n()))).floatValue(), ((Number) dVar.b(w.d.f38653b, Float.valueOf(rVar2.l()))).floatValue(), ((Number) dVar.b(w.e.f38655b, Float.valueOf(rVar2.m()))).floatValue(), ((Number) dVar.b(w.g.f38659b, Float.valueOf(rVar2.p()))).floatValue(), ((Number) dVar.b(w.h.f38661b, Float.valueOf(rVar2.s()))).floatValue(), ((Number) dVar.b(w.l.f38669b, Float.valueOf(rVar2.u()))).floatValue(), ((Number) dVar.b(w.m.f38671b, Float.valueOf(rVar2.v()))).floatValue(), (List) dVar.b(w.c.f38651b, rVar2.i()), androidx.compose.runtime.internal.w.e(1450046638, true, new a(next, map4), c0VarR, 54), c0VarR, 805306368, 0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(800888547);
                            c0VarR.A();
                        }
                    }
                    mapEmptyMap = map4;
                    it = it2;
                }
                map3 = mapEmptyMap;
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
                map3 = map2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new b(rVar, map3, i10, i11));
            }
        }
        i12 |= 48;
        map2 = map;
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i13 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
            } else {
                mapEmptyMap = map2;
            }
            if (m0.l0()) {
                m0.A0(-446179233, i12, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:428)");
            }
            it = rVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next instanceof v) {
                    c0VarR.E(798467819);
                    v vVar2 = (v) next;
                    cVar = mapEmptyMap.get(vVar2.k());
                    if (cVar == null) {
                        cVar = new c();
                    }
                    it2 = it;
                    c0 c0Var3 = c0VarR;
                    map4 = mapEmptyMap;
                    p.b((List) cVar.b(w.c.f38651b, vVar2.l()), vVar2.m(), vVar2.k(), (i0) cVar.b(w.a.f38647b, vVar2.c()), ((Number) cVar.b(w.b.f38649b, Float.valueOf(vVar2.i()))).floatValue(), (i0) cVar.b(w.i.f38663b, vVar2.n()), ((Number) cVar.b(w.j.f38665b, Float.valueOf(vVar2.p()))).floatValue(), ((Number) cVar.b(w.k.f38667b, Float.valueOf(vVar2.v()))).floatValue(), vVar2.s(), vVar2.t(), vVar2.u(), ((Number) cVar.b(w.p.f38677b, Float.valueOf(vVar2.B()))).floatValue(), ((Number) cVar.b(w.n.f38673b, Float.valueOf(vVar2.w()))).floatValue(), ((Number) cVar.b(w.o.f38675b, Float.valueOf(vVar2.A()))).floatValue(), c0Var3, 0, 0, 0);
                    c0VarR = c0Var3;
                    c0VarR.A();
                } else {
                    it2 = it;
                    map4 = mapEmptyMap;
                    if (next instanceof r) {
                        c0VarR.E(799882380);
                        r rVar3 = (r) next;
                        dVar = map4.get(rVar3.k());
                        if (dVar == null) {
                            dVar = new d();
                        }
                        p.a(rVar3.k(), ((Number) dVar.b(w.f.f38657b, Float.valueOf(rVar3.n()))).floatValue(), ((Number) dVar.b(w.d.f38653b, Float.valueOf(rVar3.l()))).floatValue(), ((Number) dVar.b(w.e.f38655b, Float.valueOf(rVar3.m()))).floatValue(), ((Number) dVar.b(w.g.f38659b, Float.valueOf(rVar3.p()))).floatValue(), ((Number) dVar.b(w.h.f38661b, Float.valueOf(rVar3.s()))).floatValue(), ((Number) dVar.b(w.l.f38669b, Float.valueOf(rVar3.u()))).floatValue(), ((Number) dVar.b(w.m.f38671b, Float.valueOf(rVar3.v()))).floatValue(), (List) dVar.b(w.c.f38651b, rVar3.i()), androidx.compose.runtime.internal.w.e(1450046638, true, new a(next, map4), c0VarR, 54), c0VarR, 805306368, 0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(800888547);
                        c0VarR.A();
                    }
                }
                mapEmptyMap = map4;
                it = it2;
            }
            map3 = mapEmptyMap;
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
            map3 = map2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(rVar, map3, i10, i11));
        }
    }

    @NotNull
    public static final VectorPainter b(@NotNull VectorPainter vectorPainter, long j10, long j11, @NotNull String str, @Nullable r0 r0Var, boolean z10) {
        vectorPainter.F(j10);
        vectorPainter.A(z10);
        vectorPainter.C(r0Var);
        vectorPainter.G(j11);
        vectorPainter.E(str);
        return vectorPainter;
    }

    public static /* synthetic */ VectorPainter c(VectorPainter vectorPainter, long j10, long j11, String str, r0 r0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = f38620a;
        }
        return b(vectorPainter, j10, j11, str, r0Var, (i10 & 16) != 0 ? false : z10);
    }

    private static final r0 d(long j10, int i10) {
        if (j10 != 16) {
            return r0.f38151b.c(j10, i10);
        }
        return null;
    }

    @NotNull
    public static final androidx.compose.ui.graphics.vector.c e(@NotNull androidx.compose.ui.graphics.vector.c cVar, @NotNull r rVar) {
        int iT = rVar.t();
        for (int i10 = 0; i10 < iT; i10++) {
            t tVarD = rVar.d(i10);
            if (tVarD instanceof v) {
                g gVar = new g();
                v vVar = (v) tVarD;
                gVar.w(vVar.l());
                gVar.x(vVar.m());
                gVar.v(vVar.k());
                gVar.t(vVar.c());
                gVar.u(vVar.i());
                gVar.y(vVar.n());
                gVar.z(vVar.p());
                gVar.D(vVar.v());
                gVar.A(vVar.s());
                gVar.B(vVar.t());
                gVar.C(vVar.u());
                gVar.G(vVar.B());
                gVar.E(vVar.w());
                gVar.F(vVar.A());
                cVar.r(i10, gVar);
            } else if (tVarD instanceof r) {
                androidx.compose.ui.graphics.vector.c cVar2 = new androidx.compose.ui.graphics.vector.c();
                r rVar2 = (r) tVarD;
                cVar2.A(rVar2.k());
                cVar2.D(rVar2.n());
                cVar2.E(rVar2.p());
                cVar2.F(rVar2.s());
                cVar2.G(rVar2.u());
                cVar2.H(rVar2.v());
                cVar2.B(rVar2.l());
                cVar2.C(rVar2.m());
                cVar2.z(rVar2.i());
                e(cVar2, rVar2);
                cVar.r(i10, cVar2);
            }
        }
        return cVar;
    }

    @NotNull
    public static final VectorPainter f(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.graphics.vector.d dVar2, @NotNull androidx.compose.ui.graphics.vector.c cVar) {
        long jH = h(dVar, dVar2.f(), dVar2.e());
        return b(new VectorPainter(cVar), jH, i(jH, dVar2.m(), dVar2.l()), dVar2.h(), d(dVar2.k(), dVar2.j()), dVar2.d());
    }

    private static final void g(androidx.compose.ui.graphics.drawscope.f fVar, Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1) {
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(-1.0f, 1.0f, jY);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    private static final long h(androidx.compose.ui.unit.d dVar, float f10, float f11) {
        float fS7 = dVar.S7(f10);
        float fS8 = dVar.S7(f11);
        return n0.n.f((((long) Float.floatToRawIntBits(fS7)) << 32) | (((long) Float.floatToRawIntBits(fS8)) & k0.f265952a));
    }

    private static final long i(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if (Float.isNaN(f11)) {
            f11 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
        }
        return n0.n.f((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & k0.f265952a));
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final VectorPainter j(@NotNull androidx.compose.ui.graphics.vector.d dVar, @Nullable c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0Var.W(q1.m());
        float fG = dVar.g();
        boolean zL = c0Var.L((((long) Float.floatToRawIntBits(dVar2.getDensity())) & k0.f265952a) | (Float.floatToRawIntBits(fG) << 32));
        Object objI0 = c0Var.i0();
        if (zL || objI0 == c0.f35327a.a()) {
            androidx.compose.ui.graphics.vector.c cVar = new androidx.compose.ui.graphics.vector.c();
            e(cVar, dVar.i());
            Unit unit = Unit.f312394a;
            objI0 = f(dVar2, dVar, cVar);
            c0Var.Y(objI0);
        }
        VectorPainter vectorPainter = (VectorPainter) objI0;
        if (m0.l0()) {
            m0.z0();
        }
        return vectorPainter;
    }

    @kotlin.l(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @b1(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @NotNull
    @androidx.compose.runtime.o
    @androidx.compose.runtime.q(index = -1)
    public static final VectorPainter k(float f10, float f11, float f12, float f13, @Nullable String str, long j10, int i10, @NotNull pj.o<? super Float, ? super Float, ? super c0, ? super Integer, Unit> oVar, @Nullable c0 c0Var, int i11, int i12) {
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) != 0 ? Float.NaN : f13;
        String str2 = (i12 & 16) != 0 ? f38620a : str;
        long jU = (i12 & 32) != 0 ? q0.f38131b.u() : j10;
        int iZ = (i12 & 64) != 0 ? d0.f37693b.z() : i10;
        if (m0.l0()) {
            m0.A0(411310745, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        VectorPainter vectorPainterL = l(f10, f11, f14, f15, str2, jU, iZ, false, oVar, c0Var, (i11 & 14) | 12582912 | (i11 & com.planner5d.library.engine.input.f.b.B) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return vectorPainterL;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.q(index = -1)
    @NotNull
    public static final VectorPainter l(float f10, float f11, float f12, float f13, @Nullable String str, long j10, int i10, boolean z10, @NotNull pj.o<? super Float, ? super Float, ? super c0, ? super Integer, Unit> oVar, @Nullable c0 c0Var, int i11, int i12) {
        Object obj;
        float f14 = (i12 & 4) != 0 ? Float.NaN : f12;
        float f15 = (i12 & 8) == 0 ? f13 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? f38620a : str;
        long jU = (i12 & 32) != 0 ? q0.f38131b.u() : j10;
        int iZ = (i12 & 64) != 0 ? d0.f37693b.z() : i10;
        boolean z11 = (i12 & 128) != 0 ? false : z10;
        if (m0.l0()) {
            m0.A0(1685735925, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:129)");
        }
        long jH = h((androidx.compose.ui.unit.d) c0Var.W(q1.m()), f10, f11);
        long jI = i(jH, f14, f15);
        boolean z12 = z11;
        boolean z13 = ((((3670016 & i11) ^ 1572864) > 1048576 && c0Var.K(iZ)) || (i11 & 1572864) == 1048576) | ((((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072 && c0Var.L(jU)) || (i11 & androidx.profileinstaller.n.c.f73814m) == 131072);
        Object objI0 = c0Var.i0();
        if (z13 || objI0 == c0.f35327a.a()) {
            objI0 = d(jU, iZ);
            c0Var.Y(objI0);
        }
        r0 r0Var = (r0) objI0;
        c0Var.E(789580759);
        Object objI1 = c0Var.i0();
        c0.a aVar = c0.f35327a;
        if (objI1 == aVar.a()) {
            objI1 = new VectorPainter(null, 1, null);
            c0Var.Y(objI1);
        }
        VectorPainter vectorPainter = (VectorPainter) objI1;
        b(vectorPainter, jH, jI, str2, r0Var, z12);
        p0 p0VarY = androidx.compose.runtime.v.y(c0Var, 0);
        boolean z14 = ((((234881024 & i11) ^ 100663296) > 67108864 && c0Var.D(oVar)) || (i11 & 100663296) == 67108864) | ((((i11 & 896) ^ a5.S0) > 256 && c0Var.I(f14)) || (i11 & a5.S0) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && c0Var.I(f15)) || (i11 & 3072) == 2048);
        Object objI2 = c0Var.i0();
        if (z14 || objI2 == aVar.a()) {
            obj = objI2;
            o0 o0VarT = vectorPainter.t();
            if (o0VarT == null || o0VarT.k()) {
                o0VarT = t0.a(new m(vectorPainter.y().n()), p0VarY);
            }
            o0 o0Var = o0VarT;
            o0Var.l(androidx.compose.runtime.internal.w.c(1749374910, true, new f(oVar, jI)));
            c0Var.Y(o0Var);
            obj = o0Var;
        }
        obj = objI2;
        o0 o0Var2 = (o0) obj;
        vectorPainter.B(o0Var2);
        boolean zK0 = c0Var.k0(o0Var2);
        Object objI3 = c0Var.i0();
        if (zK0 || objI3 == aVar.a()) {
            objI3 = new e(o0Var2);
            c0Var.Y(objI3);
        }
        b2.d(vectorPainter, (Function1) objI3, c0Var, 0);
        c0Var.A();
        if (m0.l0()) {
            m0.z0();
        }
        return vectorPainter;
    }
}
