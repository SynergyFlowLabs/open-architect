package androidx.compose.ui.node;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,227:1\n30#2:228\n30#2:232\n53#3,3:229\n53#3,3:233\n70#3:237\n60#3:240\n69#4:236\n65#4:239\n22#5:238\n22#5:241\n26#5:242\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n*L\n112#1:228\n120#1:232\n112#1:229,3\n120#1:233,3\n126#1:237\n128#1:240\n126#1:236\n128#1:239\n126#1:238\n128#1:241\n130#1:242\n*E\n"})
public abstract class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f39643j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f39644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f39647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private b f39651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<androidx.compose.ui.layout.a, Integer> f39652i;

    /* JADX INFO: renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n216#2,2:228\n1863#3,2:230\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines$recalculate$1\n*L\n151#1:228,2\n158#1:230,2\n*E\n"})
    static final class C0306a extends kotlin.jvm.internal.l0 implements Function1<b, Unit> {
        C0306a() {
            super(1);
        }

        public final void c(b bVar) {
            if (bVar.J()) {
                if (bVar.x().g()) {
                    bVar.B0();
                }
                Map map = bVar.x().f39652i;
                a aVar = a.this;
                for (Map.Entry entry : map.entrySet()) {
                    aVar.c((androidx.compose.ui.layout.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.J0());
                }
                k1 k1VarA5 = bVar.J0().a5();
                Intrinsics.checkNotNull(k1VarA5);
                while (!Intrinsics.areEqual(k1VarA5, a.this.f().J0())) {
                    Set<androidx.compose.ui.layout.a> setKeySet = a.this.e(k1VarA5).keySet();
                    a aVar2 = a.this;
                    for (androidx.compose.ui.layout.a aVar3 : setKeySet) {
                        aVar2.c(aVar3, aVar2.i(k1VarA5, aVar3), k1VarA5);
                    }
                    k1VarA5 = k1VarA5.a5();
                    Intrinsics.checkNotNull(k1VarA5);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            c(bVar);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ a(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(androidx.compose.ui.layout.a aVar, int i10, k1 k1Var) {
        float f10 = i10;
        long jG = n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a));
        while (true) {
            jG = d(k1Var, jG);
            k1Var = k1Var.a5();
            Intrinsics.checkNotNull(k1Var);
            if (Intrinsics.areEqual(k1Var, this.f39644a.J0())) {
                break;
            } else if (e(k1Var).containsKey(aVar)) {
                float fI = i(k1Var, aVar);
                jG = n0.g.g((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI)) & com.rabbitmq.client.k0.f265952a));
            }
        }
        int iRound = Math.round(aVar instanceof androidx.compose.ui.layout.s ? Float.intBitsToFloat((int) (jG & com.rabbitmq.client.k0.f265952a)) : Float.intBitsToFloat((int) (jG >> 32)));
        Map<androidx.compose.ui.layout.a, Integer> map = this.f39652i;
        if (map.containsKey(aVar)) {
            iRound = androidx.compose.ui.layout.b.c(aVar, ((Number) MapsKt.getValue(this.f39652i, aVar)).intValue(), iRound);
        }
        map.put(aVar, Integer.valueOf(iRound));
    }

    protected abstract long d(@NotNull k1 k1Var, long j10);

    @NotNull
    protected abstract Map<androidx.compose.ui.layout.a, Integer> e(@NotNull k1 k1Var);

    @NotNull
    public final b f() {
        return this.f39644a;
    }

    public final boolean g() {
        return this.f39645b;
    }

    @NotNull
    public final Map<androidx.compose.ui.layout.a, Integer> h() {
        return this.f39652i;
    }

    protected abstract int i(@NotNull k1 k1Var, @NotNull androidx.compose.ui.layout.a aVar);

    public final boolean j() {
        return this.f39648e;
    }

    public final boolean k() {
        if (!this.f39646c && !this.f39648e && !this.f39649f && !this.f39650g) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        s();
        return this.f39651h != null;
    }

    public final boolean m() {
        return this.f39650g;
    }

    public final boolean n() {
        return this.f39649f;
    }

    public final boolean o() {
        return this.f39647d;
    }

    public final boolean p() {
        return this.f39646c;
    }

    public final void q() {
        this.f39645b = true;
        b bVarT0 = this.f39644a.t0();
        if (bVarT0 == null) {
            return;
        }
        if (this.f39646c) {
            bVarT0.n0();
        } else if (this.f39648e || this.f39647d) {
            bVarT0.requestLayout();
        }
        if (this.f39649f) {
            this.f39644a.n0();
        }
        if (this.f39650g) {
            this.f39644a.requestLayout();
        }
        bVarT0.x().q();
    }

    public final void r() {
        this.f39652i.clear();
        this.f39644a.T0(new C0306a());
        this.f39652i.putAll(e(this.f39644a.J0()));
        this.f39645b = false;
    }

    public final void s() {
        b bVar;
        a aVarX;
        a aVarX2;
        if (!k()) {
            b bVarT0 = this.f39644a.t0();
            if (bVarT0 != null) {
                bVar = bVarT0.x().f39651h;
                if (bVar == null || !bVar.x().k()) {
                    b bVar2 = this.f39651h;
                    if (bVar2 != null && !bVar2.x().k()) {
                        b bVarT1 = bVar2.t0();
                        if (bVarT1 != null && (aVarX2 = bVarT1.x()) != null) {
                            aVarX2.s();
                        }
                        b bVarT2 = bVar2.t0();
                        bVar = (bVarT2 == null || (aVarX = bVarT2.x()) == null) ? null : aVarX.f39651h;
                    }
                }
            }
        }
        bVar = this.f39644a;
        this.f39651h = bVar;
    }

    public final void t() {
        this.f39645b = true;
        this.f39646c = false;
        this.f39648e = false;
        this.f39647d = false;
        this.f39649f = false;
        this.f39650g = false;
        this.f39651h = null;
    }

    public final void u(boolean z10) {
        this.f39645b = z10;
    }

    public final void v(boolean z10) {
        this.f39648e = z10;
    }

    public final void w(boolean z10) {
        this.f39650g = z10;
    }

    public final void x(boolean z10) {
        this.f39649f = z10;
    }

    public final void y(boolean z10) {
        this.f39647d = z10;
    }

    public final void z(boolean z10) {
        this.f39646c = z10;
    }

    private a(b bVar) {
        this.f39644a = bVar;
        this.f39645b = true;
        this.f39652i = new HashMap();
    }
}
