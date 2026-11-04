package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.x0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.node.g0;
import androidx.compose.ui.node.i2;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.node.j2;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.y3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 9 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,476:1\n1#2:477\n27#3,3:478\n31#3:495\n26#4:481\n26#4:482\n54#5:483\n54#5:485\n59#5:487\n59#5:489\n54#5:491\n59#5:493\n54#5:502\n59#5:504\n85#6:484\n85#6:486\n90#6:488\n90#6:490\n85#6:492\n90#6:494\n85#6:503\n90#6:505\n109#7,5:496\n233#8:501\n635#9:506\n635#9:507\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n354#1:478,3\n354#1:495\n371#1:481\n372#1:482\n379#1:483\n380#1:485\n381#1:487\n382#1:489\n386#1:491\n386#1:493\n430#1:502\n431#1:504\n379#1:484\n380#1:486\n381#1:488\n382#1:490\n386#1:492\n386#1:494\n430#1:503\n431#1:505\n423#1:496,5\n427#1:501\n453#1:506\n455#1:507\n*E\n"})
public final class e0 extends androidx.compose.ui.a0.d implements g0, androidx.compose.ui.node.t, i2 {

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f20578h3 = 8;

    @Nullable
    private i H1;
    private boolean X;
    private int Y;
    private int Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private a f20579g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    private x0 f20580p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    private Map<androidx.compose.ui.layout.a, Integer> f20581p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private Function1<? super List<p3>, Boolean> f20582p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private String f20583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private y3 f20584t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.font.y.b f20585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20586w;

    public /* synthetic */ e0(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, bVar, i10, z10, i11, i12, x0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A9(e0 e0Var, List list) {
        i iVarH9 = e0Var.H9();
        y3 y3Var = e0Var.f20584t;
        x0 x0Var = e0Var.f20580p0;
        p3 p3VarV = iVarH9.v(y3Var.i0((16609105 & 1) != 0 ? q0.f38131b.u() : x0Var != null ? x0Var.a() : q0.f38131b.u(), (16609105 & 2) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? q0.f38131b.u() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? androidx.compose.ui.text.style.j.f42206b.g() : 0, (16609105 & 65536) != 0 ? androidx.compose.ui.text.style.l.f42221b.f() : 0, (16609105 & 131072) != 0 ? androidx.compose.ui.unit.z.f42728b.b() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? androidx.compose.ui.text.style.f.f42154b.g() : 0, (16609105 & 2097152) != 0 ? androidx.compose.ui.text.style.e.f42149b.c() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null));
        if (p3VarV != null) {
            list.add(p3VarV);
        } else {
            p3VarV = null;
        }
        return p3VarV != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B9(e0 e0Var, androidx.compose.ui.text.f fVar) {
        e0Var.M9(fVar.m());
        e0Var.K9();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C9(e0 e0Var, boolean z10) {
        a aVar = e0Var.f20579g3;
        if (aVar == null) {
            return false;
        }
        if (aVar != null) {
            aVar.l(z10);
        }
        e0Var.K9();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D9(e0 e0Var) {
        e0Var.E9();
        e0Var.K9();
        return true;
    }

    private final void E9() {
        this.f20579g3 = null;
    }

    private static /* synthetic */ void G9() {
    }

    private final i H9() {
        if (this.H1 == null) {
            this.H1 = new i(this.f20583s, this.f20584t, this.f20585v, this.f20586w, this.X, this.Y, this.Z, null);
        }
        i iVar = this.H1;
        Intrinsics.checkNotNull(iVar);
        return iVar;
    }

    private final i I9(androidx.compose.ui.layout.z zVar) {
        i iVarJ9 = J9();
        iVarJ9.p(zVar);
        return iVarJ9;
    }

    @oj.i(name = "getLayoutCacheOrSubstitute")
    private final i J9() {
        i iVarG;
        a aVar = this.f20579g3;
        if (aVar != null) {
            if (!aVar.j()) {
                aVar = null;
            }
            if (aVar != null && (iVarG = aVar.g()) != null) {
                return iVarG;
            }
        }
        return H9();
    }

    private final void K9() {
        j2.b(this);
        j0.b(this);
        androidx.compose.ui.node.u.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L9(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, 0, 0.0f, 4, null);
        return Unit.f312394a;
    }

    private final boolean M9(String str) {
        a aVar = this.f20579g3;
        if (aVar == null) {
            a aVar2 = new a(this.f20583s, str, false, null, 12, null);
            i iVar = new i(str, this.f20584t, this.f20585v, this.f20586w, this.X, this.Y, this.Z, null);
            iVar.p(H9().a());
            aVar2.k(iVar);
            this.f20579g3 = aVar2;
        } else {
            if (Intrinsics.areEqual(str, aVar.i())) {
                return false;
            }
            aVar.m(str);
            i iVarG = aVar.g();
            if (iVarG == null) {
                return false;
            }
            iVarG.w(str, this.f20584t, this.f20585v, this.f20586w, this.X, this.Y, this.Z);
        }
        return true;
    }

    public final void F9(boolean z10, boolean z11, boolean z12) {
        if (z11 || z12) {
            H9().w(this.f20583s, this.f20584t, this.f20585v, this.f20586w, this.X, this.Y, this.Z);
        }
        if (a9()) {
            if (z11 || (z10 && this.f20582p2 != null)) {
                j2.b(this);
            }
            if (z11 || z12) {
                j0.b(this);
                androidx.compose.ui.node.u.a(this);
            }
            if (z10) {
                androidx.compose.ui.node.u.a(this);
            }
        }
    }

    public final boolean N9(@Nullable x0 x0Var, @NotNull y3 y3Var) {
        boolean zAreEqual = Intrinsics.areEqual(x0Var, this.f20580p0);
        this.f20580p0 = x0Var;
        if (zAreEqual && y3Var.Z(this.f20584t)) {
            return false;
        }
        return true;
    }

    public final boolean O9(@NotNull y3 y3Var, int i10, int i11, boolean z10, @NotNull androidx.compose.ui.text.font.y.b bVar, int i12) {
        boolean z11 = !this.f20584t.a0(y3Var);
        this.f20584t = y3Var;
        if (this.Z != i10) {
            this.Z = i10;
            z11 = true;
        }
        if (this.Y != i11) {
            this.Y = i11;
            z11 = true;
        }
        if (this.X != z10) {
            this.X = z10;
            z11 = true;
        }
        if (!Intrinsics.areEqual(this.f20585v, bVar)) {
            this.f20585v = bVar;
            z11 = true;
        }
        if (androidx.compose.ui.text.style.v.i(this.f20586w, i12)) {
            return z11;
        }
        this.f20586w = i12;
        return true;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        if (a9()) {
            i iVarJ9 = J9();
            n0 n0VarG = iVarJ9.g();
            if (n0VarG == null) {
                androidx.compose.foundation.internal.e.h("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.H1 + ", textSubstitution=" + this.f20579g3 + ')');
                throw new kotlin.a0();
            }
            k0 k0VarF = cVar.Z3().f();
            boolean zB = iVarJ9.b();
            if (zB) {
                float fE = (int) (iVarJ9.e() >> 32);
                float fE2 = (int) (iVarJ9.e() & com.rabbitmq.client.k0.f265952a);
                k0VarF.save();
                k0.E(k0VarF, 0.0f, 0.0f, fE, fE2, 0, 16, null);
            }
            try {
                androidx.compose.ui.text.style.k kVarS = this.f20584t.S();
                if (kVarS == null) {
                    kVarS = androidx.compose.ui.text.style.k.f42215b.d();
                }
                androidx.compose.ui.text.style.k kVar = kVarS;
                o3 o3VarN = this.f20584t.N();
                if (o3VarN == null) {
                    o3VarN = o3.f38091d.a();
                }
                o3 o3Var = o3VarN;
                androidx.compose.ui.graphics.drawscope.i iVarU = this.f20584t.u();
                if (iVarU == null) {
                    iVarU = androidx.compose.ui.graphics.drawscope.m.f37744a;
                }
                androidx.compose.ui.graphics.drawscope.i iVar = iVarU;
                i0 i0VarS = this.f20584t.s();
                if (i0VarS != null) {
                    n0.u(n0VarG, k0VarF, i0VarS, this.f20584t.p(), o3Var, kVar, iVar, 0, 64, null);
                } else {
                    x0 x0Var = this.f20580p0;
                    long jA = x0Var != null ? x0Var.a() : q0.f38131b.u();
                    if (jA == 16) {
                        jA = this.f20584t.t() != 16 ? this.f20584t.t() : q0.f38131b.a();
                    }
                    n0.C(n0VarG, k0VarF, jA, o3Var, kVar, iVar, 0, 32, null);
                }
            } finally {
                if (zB) {
                    k0VarF.B();
                }
            }
        }
    }

    public final boolean P9(@NotNull String str) {
        if (Intrinsics.areEqual(this.f20583s, str)) {
            boolean z10 = false | false;
            return false;
        }
        this.f20583s = str;
        E9();
        return true;
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return I9(zVar).m(zVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return I9(zVar).l(zVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            i iVarI9 = I9(c1Var);
            boolean zJ = iVarI9.j(j10, c1Var.getLayoutDirection());
            iVarI9.f();
            n0 n0VarG = iVarI9.g();
            Intrinsics.checkNotNull(n0VarG);
            long jE = iVarI9.e();
            if (zJ) {
                j0.a(this);
                Map map = this.f20581p1;
                if (map == null) {
                    map = new HashMap(2);
                    this.f20581p1 = map;
                }
                map.put(androidx.compose.ui.layout.b.a(), Integer.valueOf(Math.round(n0VarG.m())));
                map.put(androidx.compose.ui.layout.b.b(), Integer.valueOf(Math.round(n0VarG.E())));
            }
            androidx.compose.ui.unit.b.a aVar = androidx.compose.ui.unit.b.f42658b;
            int i10 = (int) (jE >> 32);
            int i11 = (int) (jE & com.rabbitmq.client.k0.f265952a);
            final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(aVar.b(i10, i10, i11, i11));
            Map<androidx.compose.ui.layout.a, Integer> map2 = this.f20581p1;
            Intrinsics.checkNotNull(map2);
            return c1Var.S6(i10, i11, map2, new Function1() { // from class: androidx.compose.foundation.text.modifiers.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e0.L9(i2VarP0, (androidx.compose.ui.layout.i2.a) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return I9(zVar).h(i10, zVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return I9(zVar).h(i10, zVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.i2
    public void p0(@NotNull androidx.compose.ui.semantics.e0 e0Var) {
        Function1<? super List<p3>, Boolean> function1 = this.f20582p2;
        if (function1 == null) {
            function1 = new Function1() { // from class: androidx.compose.foundation.text.modifiers.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(e0.A9(this.f20686a, (List) obj));
                }
            };
            this.f20582p2 = function1;
        }
        androidx.compose.ui.semantics.b0.T1(e0Var, new androidx.compose.ui.text.f(this.f20583s, null, 2, null));
        a aVar = this.f20579g3;
        if (aVar != null) {
            androidx.compose.ui.semantics.b0.Q1(e0Var, aVar.j());
            androidx.compose.ui.semantics.b0.X1(e0Var, new androidx.compose.ui.text.f(aVar.i(), null, 2, null));
        }
        androidx.compose.ui.semantics.b0.Z1(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.modifiers.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e0.B9(this.f20555a, (androidx.compose.ui.text.f) obj));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.f2(e0Var, null, new Function1() { // from class: androidx.compose.foundation.text.modifiers.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e0.C9(this.f20562a, ((Boolean) obj).booleanValue()));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.f(e0Var, null, new Function0() { // from class: androidx.compose.foundation.text.modifiers.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(e0.D9(this.f20563a));
            }
        }, 1, null);
        androidx.compose.ui.semantics.b0.l0(e0Var, null, function1, 1, null);
    }

    public /* synthetic */ e0(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, x0 x0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, bVar, (i13 & 8) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : x0Var, null);
    }

    private e0(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, x0 x0Var) {
        this.f20583s = str;
        this.f20584t = y3Var;
        this.f20585v = bVar;
        this.f20586w = i10;
        this.X = z10;
        this.Y = i11;
        this.Z = i12;
        this.f20580p0 = x0Var;
    }

    @w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f20587e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f20588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private String f20589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private i f20591d;

        public a(@NotNull String str, @NotNull String str2, boolean z10, @Nullable i iVar) {
            this.f20588a = str;
            this.f20589b = str2;
            this.f20590c = z10;
            this.f20591d = iVar;
        }

        public static /* synthetic */ a f(a aVar, String str, String str2, boolean z10, i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f20588a;
            }
            if ((i10 & 2) != 0) {
                str2 = aVar.f20589b;
            }
            if ((i10 & 4) != 0) {
                z10 = aVar.f20590c;
            }
            if ((i10 & 8) != 0) {
                iVar = aVar.f20591d;
            }
            return aVar.e(str, str2, z10, iVar);
        }

        @NotNull
        public final String a() {
            return this.f20588a;
        }

        @NotNull
        public final String b() {
            return this.f20589b;
        }

        public final boolean c() {
            return this.f20590c;
        }

        @Nullable
        public final i d() {
            return this.f20591d;
        }

        @NotNull
        public final a e(@NotNull String str, @NotNull String str2, boolean z10, @Nullable i iVar) {
            return new a(str, str2, z10, iVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f20588a, aVar.f20588a) && Intrinsics.areEqual(this.f20589b, aVar.f20589b) && this.f20590c == aVar.f20590c && Intrinsics.areEqual(this.f20591d, aVar.f20591d);
        }

        @Nullable
        public final i g() {
            return this.f20591d;
        }

        @NotNull
        public final String h() {
            return this.f20588a;
        }

        public int hashCode() {
            int iHashCode = ((((this.f20588a.hashCode() * 31) + this.f20589b.hashCode()) * 31) + Boolean.hashCode(this.f20590c)) * 31;
            i iVar = this.f20591d;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        @NotNull
        public final String i() {
            return this.f20589b;
        }

        public final boolean j() {
            return this.f20590c;
        }

        public final void k(@Nullable i iVar) {
            this.f20591d = iVar;
        }

        public final void l(boolean z10) {
            this.f20590c = z10;
        }

        public final void m(@NotNull String str) {
            this.f20589b = str;
        }

        @NotNull
        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f20591d + ", isShowingSubstitution=" + this.f20590c + ')';
        }

        public /* synthetic */ a(String str, String str2, boolean z10, i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : iVar);
        }
    }
}
