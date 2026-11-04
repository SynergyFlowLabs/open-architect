package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.text.f5;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.node.g0;
import androidx.compose.ui.node.i2;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.node.j2;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.o3;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,595:1\n1#2:596\n27#3,3:597\n31#3:614\n26#4:600\n26#4:601\n54#5:602\n54#5:604\n59#5:606\n59#5:608\n54#5:610\n59#5:612\n54#5:616\n59#5:618\n85#6:603\n85#6:605\n90#6:607\n90#6:609\n85#6:611\n90#6:613\n85#6:617\n90#6:619\n53#6,3:621\n233#7:615\n33#8:620\n635#9:624\n635#9:625\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n424#1:597,3\n424#1:614\n439#1:600\n440#1:601\n451#1:602\n452#1:604\n453#1:606\n454#1:608\n459#1:610\n460#1:612\n535#1:616\n536#1:618\n451#1:603\n452#1:605\n453#1:607\n454#1:609\n459#1:611\n460#1:613\n535#1:617\n536#1:619\n537#1:621,3\n529#1:615\n537#1:620\n559#1:624\n561#1:625\n*E\n"})
public final class w extends androidx.compose.ui.a0.d implements g0, androidx.compose.ui.node.t, i2 {

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f20666n3 = 8;

    @Nullable
    private Function1<? super List<n0.j>, Unit> H1;
    private int X;
    private boolean Y;
    private int Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private x0 f20667g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private f5 f20668h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @Nullable
    private Function1<? super a, Unit> f20669i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @Nullable
    private Map<androidx.compose.ui.layout.a, Integer> f20670j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @Nullable
    private g f20671k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private Function1<? super List<p3>, Boolean> f20672l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private a f20673m3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f20674p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private List<androidx.compose.ui.text.f.e<v0>> f20675p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private n f20676p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.f f20677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private y3 f20678t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.font.y.b f20679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function1<? super p3, Unit> f20680w;

    public /* synthetic */ w(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, Function1 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, function1, i10, z10, i11, i12, list, function2, nVar, x0Var, f5Var, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x00b1  */
    public static final boolean A9(w wVar, List list) {
        p3 p3VarB;
        p3 p3VarL = wVar.I9().l();
        if (p3VarL != null) {
            androidx.compose.ui.text.f fVarN = p3VarL.l().n();
            y3 y3Var = wVar.f20678t;
            x0 x0Var = wVar.f20667g3;
            p3VarB = p3.b(p3VarL, new o3(fVarN, y3Var.i0((16609105 & 1) != 0 ? q0.f38131b.u() : x0Var != null ? x0Var.a() : q0.f38131b.u(), (16609105 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? q0.f38131b.u() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? androidx.compose.ui.text.style.j.f42206b.g() : 0, (16609105 & 65536) != 0 ? androidx.compose.ui.text.style.l.f42221b.f() : 0, (16609105 & 131072) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? androidx.compose.ui.text.style.f.f42154b.g() : 0, (16609105 & 2097152) != 0 ? androidx.compose.ui.text.style.e.f42149b.c() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), p3VarL.l().i(), p3VarL.l().g(), p3VarL.l().l(), p3VarL.l().h(), p3VarL.l().d(), p3VarL.l().f(), p3VarL.l().e(), p3VarL.l().c(), (DefaultConstructorMarker) null), 0L, 2, null);
            if (p3VarB != null) {
                list.add(p3VarB);
            } else {
                p3VarB = null;
            }
        } else {
            p3VarB = null;
        }
        return p3VarB != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B9(w wVar, androidx.compose.ui.text.f fVar) {
        wVar.S9(fVar);
        wVar.L9();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C9(w wVar, boolean z10) {
        a aVar = wVar.f20673m3;
        if (aVar == null) {
            return false;
        }
        Function1<? super a, Unit> function1 = wVar.f20669i3;
        if (function1 != null) {
            Intrinsics.checkNotNull(aVar);
            function1.invoke(aVar);
        }
        a aVar2 = wVar.f20673m3;
        if (aVar2 != null) {
            aVar2.l(z10);
        }
        wVar.L9();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D9(w wVar) {
        wVar.E9();
        wVar.L9();
        return true;
    }

    private static /* synthetic */ void H9() {
    }

    private final g I9() {
        if (this.f20671k3 == null) {
            this.f20671k3 = new g(this.f20677s, this.f20678t, this.f20679v, this.X, this.Y, this.Z, this.f20674p0, this.f20675p1, this.f20668h3, null);
        }
        g gVar = this.f20671k3;
        Intrinsics.checkNotNull(gVar);
        return gVar;
    }

    private final g J9(androidx.compose.ui.unit.d dVar) {
        g gVarG;
        a aVar = this.f20673m3;
        if (aVar != null && aVar.j() && (gVarG = aVar.g()) != null) {
            gVarG.w(dVar);
            return gVarG;
        }
        g gVarI9 = I9();
        gVarI9.w(dVar);
        return gVarI9;
    }

    private final void L9() {
        j2.b(this);
        j0.b(this);
        androidx.compose.ui.node.u.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        int i10 = 5 >> 0;
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final boolean S9(androidx.compose.ui.text.f fVar) {
        a aVar = this.f20673m3;
        if (aVar == null) {
            boolean z10 = false;
            a aVar2 = new a(this.f20677s, fVar, false, null, 12, null);
            g gVar = new g(fVar, this.f20678t, this.f20679v, this.X, this.Y, this.Z, this.f20674p0, CollectionsKt.emptyList(), this.f20668h3, null);
            gVar.w(I9().h());
            aVar2.k(gVar);
            this.f20673m3 = aVar2;
        } else {
            if (Intrinsics.areEqual(fVar, aVar.i())) {
                return false;
            }
            aVar.m(fVar);
            g gVarG = aVar.g();
            if (gVarG == null) {
                return false;
            }
            gVarG.B(fVar, this.f20678t, this.f20679v, this.X, this.Y, this.Z, this.f20674p0, CollectionsKt.emptyList(), this.f20668h3);
        }
        return true;
    }

    public final void E9() {
        this.f20673m3 = null;
    }

    public final void F9(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            I9().B(this.f20677s, this.f20678t, this.f20679v, this.X, this.Y, this.Z, this.f20674p0, this.f20675p1, this.f20668h3);
        }
        if (a9()) {
            if (z11 || (z10 && this.f20672l3 != null)) {
                j2.b(this);
            }
            if (z11 || z12 || z13) {
                j0.b(this);
                androidx.compose.ui.node.u.a(this);
            }
            if (z10) {
                androidx.compose.ui.node.u.a(this);
            }
        }
    }

    public final void G9(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        P(cVar);
    }

    @Nullable
    public final a K9() {
        return this.f20673m3;
    }

    public final int M9(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return e0(zVar, yVar, i10);
    }

    public final int N9(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return W(zVar, yVar, i10);
    }

    @NotNull
    public final b1 O9(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        return c(c1Var, z0Var, j10);
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        if (a9()) {
            n nVar = this.f20676p2;
            if (nVar != null) {
                nVar.d(cVar);
            }
            k0 k0VarF = cVar.Z3().f();
            p3 p3VarM = J9(cVar).m();
            f0 f0VarX = p3VarM.x();
            boolean z10 = true;
            boolean z11 = p3VarM.i() && !androidx.compose.ui.text.style.v.i(this.X, androidx.compose.ui.text.style.v.f42256b.i());
            if (z11) {
                n0.j jVarC = n0.k.c(n0.g.f332700b.e(), n0.n.f((((long) Float.floatToRawIntBits((int) (p3VarM.C() >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a)));
                k0VarF.save();
                k0.p(k0VarF, jVarC, 0, 2, null);
            }
            try {
                androidx.compose.ui.text.style.k kVarS = this.f20678t.S();
                if (kVarS == null) {
                    kVarS = androidx.compose.ui.text.style.k.f42215b.d();
                }
                androidx.compose.ui.text.style.k kVar = kVarS;
                androidx.compose.ui.graphics.o3 o3VarN = this.f20678t.N();
                if (o3VarN == null) {
                    o3VarN = androidx.compose.ui.graphics.o3.f38091d.a();
                }
                androidx.compose.ui.graphics.o3 o3Var = o3VarN;
                androidx.compose.ui.graphics.drawscope.i iVarU = this.f20678t.u();
                if (iVarU == null) {
                    iVarU = androidx.compose.ui.graphics.drawscope.m.f37744a;
                }
                androidx.compose.ui.graphics.drawscope.i iVar = iVarU;
                i0 i0VarS = this.f20678t.s();
                if (i0VarS != null) {
                    f0.T(f0VarX, k0VarF, i0VarS, this.f20678t.p(), o3Var, kVar, iVar, 0, 64, null);
                } else {
                    x0 x0Var = this.f20667g3;
                    long jA = x0Var != null ? x0Var.a() : q0.f38131b.u();
                    if (jA == 16) {
                        jA = this.f20678t.t() != 16 ? this.f20678t.t() : q0.f38131b.a();
                    }
                    f0VarX.O(k0VarF, (32 & 2) != 0 ? q0.f38131b.u() : jA, (32 & 4) != 0 ? null : o3Var, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? iVar : null, (32 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : 0);
                }
                if (z11) {
                    k0VarF.B();
                }
                a aVar = this.f20673m3;
                if (!((aVar == null || !aVar.j()) ? x.a(this.f20677s) : false)) {
                    List<androidx.compose.ui.text.f.e<v0>> list = this.f20675p1;
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                cVar.E4();
            } catch (Throwable th2) {
                if (z11) {
                    k0VarF.B();
                }
                throw th2;
            }
        }
    }

    public final int Q9(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return k0(zVar, yVar, i10);
    }

    public final int R9(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return U(zVar, yVar, i10);
    }

    public final void T9(@Nullable a aVar) {
        this.f20673m3 = aVar;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return J9(zVar).t(zVar.getLayoutDirection());
    }

    public final boolean U9(@Nullable Function1<? super p3, Unit> function1, @Nullable Function1<? super List<n0.j>, Unit> function2, @Nullable n nVar, @Nullable Function1<? super a, Unit> function3) {
        boolean z10;
        if (this.f20680w != function1) {
            this.f20680w = function1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.H1 != function2) {
            this.H1 = function2;
            z10 = true;
        }
        if (!Intrinsics.areEqual(this.f20676p2, nVar)) {
            this.f20676p2 = nVar;
            z10 = true;
        }
        if (this.f20669i3 == function3) {
            return z10;
        }
        this.f20669i3 = function3;
        return true;
    }

    public final boolean V9(@Nullable x0 x0Var, @NotNull y3 y3Var) {
        boolean zAreEqual = Intrinsics.areEqual(x0Var, this.f20667g3);
        this.f20667g3 = x0Var;
        return (zAreEqual && y3Var.Z(this.f20678t)) ? false : true;
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return J9(zVar).s(zVar.getLayoutDirection());
    }

    public final boolean W9(@NotNull y3 y3Var, @Nullable List<androidx.compose.ui.text.f.e<v0>> list, int i10, int i11, boolean z10, @NotNull androidx.compose.ui.text.font.y.b bVar, int i12, @Nullable f5 f5Var) {
        boolean z11 = !this.f20678t.a0(y3Var);
        this.f20678t = y3Var;
        if (!Intrinsics.areEqual(this.f20675p1, list)) {
            this.f20675p1 = list;
            z11 = true;
        }
        if (this.f20674p0 != i10) {
            this.f20674p0 = i10;
            z11 = true;
        }
        if (this.Z != i11) {
            this.Z = i11;
            z11 = true;
        }
        if (this.Y != z10) {
            this.Y = z10;
            z11 = true;
        }
        if (!Intrinsics.areEqual(this.f20679v, bVar)) {
            this.f20679v = bVar;
            z11 = true;
        }
        if (!androidx.compose.ui.text.style.v.i(this.X, i12)) {
            this.X = i12;
            z11 = true;
        }
        if (Intrinsics.areEqual(this.f20668h3, f5Var)) {
            return z11;
        }
        this.f20668h3 = f5Var;
        return true;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    public final boolean X9(@NotNull androidx.compose.ui.text.f fVar) {
        boolean zAreEqual = Intrinsics.areEqual(this.f20677s.m(), fVar.m());
        boolean z10 = (zAreEqual && this.f20677s.p(fVar)) ? false : true;
        if (z10) {
            this.f20677s = fVar;
        }
        if (!zAreEqual) {
            E9();
        }
        return z10;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            g gVarJ9 = J9(c1Var);
            boolean zP = gVarJ9.p(j10, c1Var.getLayoutDirection());
            p3 p3VarM = gVarJ9.m();
            p3VarM.x().m().a();
            if (zP) {
                j0.a(this);
                Function1<? super p3, Unit> function1 = this.f20680w;
                if (function1 != null) {
                    function1.invoke(p3VarM);
                }
                n nVar = this.f20676p2;
                if (nVar != null) {
                    nVar.m(p3VarM);
                }
                Map<androidx.compose.ui.layout.a, Integer> linkedHashMap = this.f20670j3;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>(2);
                }
                linkedHashMap.put(androidx.compose.ui.layout.b.a(), Integer.valueOf(Math.round(p3VarM.h())));
                linkedHashMap.put(androidx.compose.ui.layout.b.b(), Integer.valueOf(Math.round(p3VarM.k())));
                this.f20670j3 = linkedHashMap;
            }
            Function1<? super List<n0.j>, Unit> function2 = this.H1;
            if (function2 != null) {
                function2.invoke(p3VarM.B());
            }
            final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.f42658b.b((int) (p3VarM.C() >> 32), (int) (p3VarM.C() >> 32), (int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a), (int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a)));
            int iC = (int) (p3VarM.C() >> 32);
            int iC2 = (int) (p3VarM.C() & com.rabbitmq.client.k0.f265952a);
            Map<androidx.compose.ui.layout.a, Integer> map = this.f20670j3;
            Intrinsics.checkNotNull(map);
            return c1Var.S6(iC, iC2, map, new Function1() { // from class: androidx.compose.foundation.text.modifiers.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return w.P9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return J9(zVar).n(i10, zVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return J9(zVar).n(i10, zVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        Function1<? super List<p3>, Boolean> function1 = this.f20672l3;
        if (function1 == null) {
            function1 = new Function1() { // from class: androidx.compose.foundation.text.modifiers.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(w.A9(this.f20662a, (List) obj));
                }
            };
            this.f20672l3 = function1;
        }
        androidx.compose.ui.semantics.b0.T1(e0Var, this.f20677s);
        a aVar = this.f20673m3;
        if (aVar != null) {
            androidx.compose.ui.semantics.b0.X1(e0Var, aVar.i());
            androidx.compose.ui.semantics.b0.Q1(e0Var, aVar.j());
        }
        androidx.compose.ui.semantics.b0.Z1(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.modifiers.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(w.B9(this.f20663a, (androidx.compose.ui.text.f) obj));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.f2(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.modifiers.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(w.C9(this.f20664a, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.f(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.modifiers.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(w.D9(this.f20665a));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.l0(e0Var, null, function1, 1, null);
    }

    public /* synthetic */ w(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1 function1, int i10, boolean z10, int i11, int i12, List list, Function1 function2, n nVar, x0 x0Var, f5 f5Var, Function1 function3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : function2, (i13 & 1024) != 0 ? null : nVar, (i13 & 2048) != 0 ? null : x0Var, (i13 & 4096) != 0 ? null : f5Var, (i13 & 8192) != 0 ? null : function3, null);
    }

    private w(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, Function1<? super p3, Unit> function1, int i10, boolean z10, int i11, int i12, List<androidx.compose.ui.text.f.e<v0>> list, Function1<? super List<n0.j>, Unit> function2, n nVar, x0 x0Var, f5 f5Var, Function1<? super a, Unit> function3) {
        this.f20677s = fVar;
        this.f20678t = y3Var;
        this.f20679v = bVar;
        this.f20680w = function1;
        this.X = i10;
        this.Y = z10;
        this.Z = i11;
        this.f20674p0 = i12;
        this.f20675p1 = list;
        this.H1 = function2;
        this.f20676p2 = nVar;
        this.f20667g3 = x0Var;
        this.f20668h3 = f5Var;
        this.f20669i3 = function3;
    }

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f20681e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.text.f f20682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private androidx.compose.ui.text.f f20683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private g f20685d;

        public a(@NotNull androidx.compose.ui.text.f fVar, @NotNull androidx.compose.ui.text.f fVar2, boolean z10, @Nullable g gVar) {
            this.f20682a = fVar;
            this.f20683b = fVar2;
            this.f20684c = z10;
            this.f20685d = gVar;
        }

        public static /* synthetic */ a f(a aVar, androidx.compose.ui.text.f fVar, androidx.compose.ui.text.f fVar2, boolean z10, g gVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fVar = aVar.f20682a;
            }
            if ((i10 & 2) != 0) {
                fVar2 = aVar.f20683b;
            }
            if ((i10 & 4) != 0) {
                z10 = aVar.f20684c;
            }
            if ((i10 & 8) != 0) {
                gVar = aVar.f20685d;
            }
            return aVar.e(fVar, fVar2, z10, gVar);
        }

        @NotNull
        public final androidx.compose.ui.text.f a() {
            return this.f20682a;
        }

        @NotNull
        public final androidx.compose.ui.text.f b() {
            return this.f20683b;
        }

        public final boolean c() {
            return this.f20684c;
        }

        @Nullable
        public final g d() {
            return this.f20685d;
        }

        @NotNull
        public final a e(@NotNull androidx.compose.ui.text.f fVar, @NotNull androidx.compose.ui.text.f fVar2, boolean z10, @Nullable g gVar) {
            return new a(fVar, fVar2, z10, gVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f20682a, aVar.f20682a) && Intrinsics.areEqual(this.f20683b, aVar.f20683b) && this.f20684c == aVar.f20684c && Intrinsics.areEqual(this.f20685d, aVar.f20685d);
        }

        @Nullable
        public final g g() {
            return this.f20685d;
        }

        @NotNull
        public final androidx.compose.ui.text.f h() {
            return this.f20682a;
        }

        public int hashCode() {
            int iHashCode = ((((this.f20682a.hashCode() * 31) + this.f20683b.hashCode()) * 31) + Boolean.hashCode(this.f20684c)) * 31;
            g gVar = this.f20685d;
            return iHashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        @NotNull
        public final androidx.compose.ui.text.f i() {
            return this.f20683b;
        }

        public final boolean j() {
            return this.f20684c;
        }

        public final void k(@Nullable g gVar) {
            this.f20685d = gVar;
        }

        public final void l(boolean z10) {
            this.f20684c = z10;
        }

        public final void m(@NotNull androidx.compose.ui.text.f fVar) {
            this.f20683b = fVar;
        }

        @NotNull
        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f20682a) + ", substitution=" + ((Object) this.f20683b) + ", isShowingSubstitution=" + this.f20684c + ", layoutCache=" + this.f20685d + ')';
        }

        public /* synthetic */ a(androidx.compose.ui.text.f fVar, androidx.compose.ui.text.f fVar2, boolean z10, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(fVar, fVar2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : gVar);
        }
    }
}
