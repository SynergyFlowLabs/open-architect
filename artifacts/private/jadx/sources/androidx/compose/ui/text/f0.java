package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1227:1\n118#2,4:1228\n118#2,4:1261\n118#2,4:1268\n118#2,4:1272\n118#2,4:1276\n530#3,2:1232\n35#3,3:1234\n532#3:1237\n151#3,2:1239\n35#3,5:1241\n153#3:1246\n533#3,2:1247\n39#3:1249\n535#3:1250\n35#3,5:1251\n35#3,5:1256\n1#4:1238\n69#5:1265\n70#6:1266\n22#7:1267\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n389#1:1228,4\n522#1:1261,4\n988#1:1268,4\n994#1:1272,4\n1000#1:1276,4\n455#1:1232,2\n455#1:1234,3\n455#1:1237\n456#1:1239,2\n456#1:1241,5\n456#1:1246\n455#1:1247,2\n455#1:1249\n455#1:1250\n483#1:1251,5\n500#1:1256,5\n564#1:1265\n564#1:1266\n564#1:1267\n*E\n"})
public final class f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41538i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final i0 f41539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f41542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f41543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f41544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<n0.j> f41545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<o0> f41546h;

    public /* synthetic */ f0(f fVar, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, j10, dVar, bVar, (List<f.e<v0>>) list, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.graphics.k2 k2Var, int i10, int i11, o0 o0Var) {
        int i12 = 2 >> 0;
        androidx.compose.ui.graphics.k2.y(k2Var, o0Var.v(o0Var.n().A(o0Var.E(i10), o0Var.E(i11))), 0L, 2, null);
        return Unit.f312394a;
    }

    public static /* synthetic */ void R(f0 f0Var, androidx.compose.ui.graphics.k0 k0Var, long j10, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.k kVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = androidx.compose.ui.graphics.q0.f38131b.u();
        }
        f0Var.Q(k0Var, j10, (i10 & 4) != 0 ? null : o3Var, (i10 & 8) != 0 ? null : kVar);
    }

    public static /* synthetic */ void T(f0 f0Var, androidx.compose.ui.graphics.k0 k0Var, androidx.compose.ui.graphics.i0 i0Var, float f10, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.graphics.drawscope.i iVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        f0Var.S(k0Var, i0Var, f10, (i11 & 8) != 0 ? null : o3Var, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : iVar, (i11 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.a() : i10);
    }

    private final void U(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < e().m().length()) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("offset(" + i10 + ") is out of bounds [0, " + e().length() + ')');
        }
    }

    private final void V(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= e().m().length()) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("offset(" + i10 + ") is out of bounds [0, " + e().length() + AbstractJsonLexerKt.END_LIST);
        }
    }

    private final void W(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f41544f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        x0.a.e("lineIndex(" + i10 + ") is out of bounds [0, " + this.f41544f + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(long j10, float[] fArr, kotlin.jvm.internal.i1.f fVar, kotlin.jvm.internal.i1.e eVar, o0 o0Var) {
        long jB = x3.b(o0Var.E(o0Var.o() > w3.l(j10) ? o0Var.o() : w3.l(j10)), o0Var.E(o0Var.k() < w3.k(j10) ? o0Var.k() : w3.k(j10)));
        o0Var.n().s(jB, fArr, fVar.f312749a);
        int iJ = fVar.f312749a + (w3.j(jB) * 4);
        for (int i10 = fVar.f312749a; i10 < iJ; i10 += 4) {
            int i11 = i10 + 1;
            float f10 = fArr[i11];
            float f11 = eVar.f312748a;
            fArr[i11] = f10 + f11;
            int i12 = i10 + 3;
            fArr[i12] = fArr[i12] + f11;
        }
        fVar.f312749a = iJ;
        eVar.f312748a += o0Var.n().getHeight();
        return Unit.f312394a;
    }

    private final f e() {
        return this.f41539a.e();
    }

    public static /* synthetic */ int s(f0 f0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f0Var.r(i10, z10);
    }

    public final float A(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.n().I(o0Var.F(i10));
    }

    public final float B() {
        return this.f41539a.i();
    }

    public final int C() {
        return this.f41540b;
    }

    public final float D() {
        return this.f41539a.f();
    }

    public final int E(long j10) {
        o0 o0Var = this.f41546h.get(l0.f(this.f41546h, Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10))));
        return o0Var.m() == 0 ? o0Var.o() : o0Var.z(o0Var.n().n(o0Var.D(j10)));
    }

    @NotNull
    public final androidx.compose.ui.text.style.i F(int i10) {
        V(i10);
        o0 o0Var = this.f41546h.get(i10 == e().length() ? CollectionsKt.getLastIndex(this.f41546h) : l0.c(this.f41546h, i10));
        return o0Var.n().k(o0Var.E(i10));
    }

    @NotNull
    public final List<o0> G() {
        return this.f41546h;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 H(final int i10, final int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= e().m().length())) {
            x0.a.e("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + e().m().length() + "), or start > end!");
        }
        if (i10 == i11) {
            return androidx.compose.ui.graphics.u.a();
        }
        final androidx.compose.ui.graphics.k2 k2VarA = androidx.compose.ui.graphics.u.a();
        l0.g(this.f41546h, x3.b(i10, i11), new Function1() { // from class: androidx.compose.ui.text.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.I(k2VarA, i10, i11, (o0) obj);
            }
        });
        return k2VarA;
    }

    @NotNull
    public final List<n0.j> J() {
        return this.f41545g;
    }

    public final long K(@NotNull n0.j jVar, int i10, @NotNull m3 m3Var) {
        w3.a aVar;
        w3.a aVar2;
        int iF = l0.f(this.f41546h, jVar.B());
        if (this.f41546h.get(iF).j() >= jVar.j() || iF == CollectionsKt.getLastIndex(this.f41546h)) {
            o0 o0Var = this.f41546h.get(iF);
            return o0.y(o0Var, o0Var.n().r(o0Var.C(jVar), i10, m3Var), false, 1, null);
        }
        int iF2 = l0.f(this.f41546h, jVar.j());
        long jA = w3.f42333b.a();
        while (true) {
            aVar = w3.f42333b;
            if (!w3.g(jA, aVar.a()) || iF > iF2) {
                break;
            }
            o0 o0Var2 = this.f41546h.get(iF);
            jA = o0.y(o0Var2, o0Var2.n().r(o0Var2.C(jVar), i10, m3Var), false, 1, null);
            iF++;
        }
        if (w3.g(jA, aVar.a())) {
            return aVar.a();
        }
        long jA2 = aVar.a();
        while (true) {
            aVar2 = w3.f42333b;
            if (!w3.g(jA2, aVar2.a()) || iF > iF2) {
                break;
            }
            o0 o0Var3 = this.f41546h.get(iF2);
            jA2 = o0.y(o0Var3, o0Var3.n().r(o0Var3.C(jVar), i10, m3Var), false, 1, null);
            iF2--;
        }
        return w3.g(jA2, aVar2.a()) ? jA : x3.b(w3.n(jA), w3.i(jA2));
    }

    public final float L() {
        return this.f41542d;
    }

    public final long M(int i10) {
        V(i10);
        o0 o0Var = this.f41546h.get(i10 == e().length() ? CollectionsKt.getLastIndex(this.f41546h) : l0.c(this.f41546h, i10));
        return o0Var.x(o0Var.n().l(o0Var.E(i10)), false);
    }

    public final boolean N(int i10) {
        W(i10);
        return this.f41546h.get(l0.e(this.f41546h, i10)).n().y(i10);
    }

    public final void O(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        k0Var.save();
        List<o0> list = this.f41546h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = list.get(i11);
            o0Var.n().x(k0Var, j10, o3Var, kVar, iVar, i10);
            k0Var.c(0.0f, o0Var.n().getHeight());
        }
        k0Var.B();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    public final /* synthetic */ void Q(androidx.compose.ui.graphics.k0 k0Var, long j10, androidx.compose.ui.graphics.o3 o3Var, androidx.compose.ui.text.style.k kVar) {
        k0Var.save();
        List<o0> list = this.f41546h;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = list.get(i10);
            n0.C(o0Var.n(), k0Var, j10, o3Var, kVar, null, 0, 48, null);
            k0Var.c(0.0f, o0Var.n().getHeight());
        }
        k0Var.B();
    }

    public final void S(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, float f10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        androidx.compose.ui.text.platform.e.a(this, k0Var, i0Var, f10, o3Var, kVar, iVar, i10);
    }

    @NotNull
    public final float[] c(final long j10, @NotNull final float[] fArr, @androidx.annotation.g0(from = 0) int i10) {
        U(w3.l(j10));
        V(w3.k(j10));
        final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        fVar.f312749a = i10;
        final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
        l0.g(this.f41546h, j10, new Function1() { // from class: androidx.compose.ui.text.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.d(j10, fArr, fVar, eVar, (o0) obj);
            }
        });
        return fArr;
    }

    @NotNull
    public final androidx.compose.ui.text.style.i f(int i10) {
        V(i10);
        o0 o0Var = this.f41546h.get(i10 == e().length() ? CollectionsKt.getLastIndex(this.f41546h) : l0.c(this.f41546h, i10));
        return o0Var.n().G(o0Var.E(i10));
    }

    @NotNull
    public final n0.j g(int i10) {
        U(i10);
        o0 o0Var = this.f41546h.get(l0.c(this.f41546h, i10));
        return o0Var.w(o0Var.n().j(o0Var.E(i10)));
    }

    @NotNull
    public final n0.j h(int i10) {
        V(i10);
        o0 o0Var = this.f41546h.get(i10 == e().length() ? CollectionsKt.getLastIndex(this.f41546h) : l0.c(this.f41546h, i10));
        return o0Var.w(o0Var.n().w(o0Var.E(i10)));
    }

    public final boolean i() {
        return this.f41541c;
    }

    public final float j() {
        if (this.f41546h.isEmpty()) {
            return 0.0f;
        }
        return this.f41546h.get(0).n().m();
    }

    public final float k() {
        return this.f41543e;
    }

    public final float l(int i10, boolean z10) {
        V(i10);
        o0 o0Var = this.f41546h.get(i10 == e().length() ? CollectionsKt.getLastIndex(this.f41546h) : l0.c(this.f41546h, i10));
        return o0Var.n().B(o0Var.E(i10), z10);
    }

    @NotNull
    public final i0 m() {
        return this.f41539a;
    }

    public final float n() {
        if (this.f41546h.isEmpty()) {
            return 0.0f;
        }
        o0 o0Var = (o0) CollectionsKt.last((List) this.f41546h);
        return o0Var.B(o0Var.n().E());
    }

    public final float o(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.B(o0Var.n().p(o0Var.F(i10)));
    }

    public final float p(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.B(o0Var.n().e(o0Var.F(i10)));
    }

    public final int q() {
        return this.f41544f;
    }

    public final int r(int i10, boolean z10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.z(o0Var.n().o(o0Var.F(i10), z10));
    }

    public final int t(int i10) {
        int iC;
        if (i10 >= e().length()) {
            iC = CollectionsKt.getLastIndex(this.f41546h);
        } else {
            iC = i10 < 0 ? 0 : l0.c(this.f41546h, i10);
        }
        o0 o0Var = this.f41546h.get(iC);
        return o0Var.A(o0Var.n().F(o0Var.E(i10)));
    }

    public final int u(float f10) {
        o0 o0Var = this.f41546h.get(l0.f(this.f41546h, f10));
        return o0Var.m() == 0 ? o0Var.p() : o0Var.A(o0Var.n().q(o0Var.G(f10)));
    }

    public final float v(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.n().c(o0Var.F(i10));
    }

    public final float w(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.n().d(o0Var.F(i10));
    }

    public final float x(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.n().h(o0Var.F(i10));
    }

    public final int y(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.z(o0Var.n().b(o0Var.F(i10)));
    }

    public final float z(int i10) {
        W(i10);
        o0 o0Var = this.f41546h.get(l0.e(this.f41546h, i10));
        return o0Var.B(o0Var.n().a(o0Var.F(i10)));
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ f0(f fVar, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, j10, dVar, bVar, (List<f.e<v0>>) list, i10, z10);
    }

    public /* synthetic */ f0(i0 i0Var, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, j10, i10, i11);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ f0(i0 i0Var, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, j10, i10, z10);
    }

    private f0(i0 i0Var, long j10, int i10, int i11) {
        int iO;
        this.f41539a = i0Var;
        this.f41540b = i10;
        boolean z10 = true;
        if (!(androidx.compose.ui.unit.b.r(j10) == 0 && androidx.compose.ui.unit.b.q(j10) == 0)) {
            x0.a.e("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<p0> listG = i0Var.g();
        int size = listG.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z10 = false;
                break;
            }
            p0 p0Var = listG.get(i13);
            q0 q0VarG = p0Var.g();
            int iP = androidx.compose.ui.unit.b.p(j10);
            if (androidx.compose.ui.unit.b.i(j10)) {
                iO = kotlin.ranges.r.u(androidx.compose.ui.unit.b.o(j10) - s0.o(f10), 0);
            } else {
                iO = androidx.compose.ui.unit.b.o(j10);
            }
            n0 n0VarM = s0.m(q0VarG, androidx.compose.ui.unit.c.b(0, iP, 0, iO, 5, null), this.f41540b - i12, i11);
            float height = f10 + n0VarM.getHeight();
            int iG = i12 + n0VarM.g();
            arrayList.add(new o0(n0VarM, p0Var.h(), p0Var.f(), i12, iG, f10, height));
            if (n0VarM.z() || (iG == this.f41540b && i13 != CollectionsKt.getLastIndex(this.f41539a.g()))) {
                i12 = iG;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = iG;
                f10 = height;
            }
        }
        this.f41543e = f10;
        this.f41544f = i12;
        this.f41541c = z10;
        this.f41546h = arrayList;
        this.f41542d = androidx.compose.ui.unit.b.p(j10);
        List<n0.j> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            o0 o0Var = (o0) arrayList.get(i14);
            List<n0.j> listH = o0Var.n().H();
            ArrayList arrayList3 = new ArrayList(listH.size());
            int size3 = listH.size();
            for (int i15 = 0; i15 < size3; i15++) {
                n0.j jVar = listH.get(i15);
                arrayList3.add(jVar != null ? o0Var.w(jVar) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f41539a.h().size()) {
            int size4 = this.f41539a.h().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.f41545g = arrayList2;
    }

    public /* synthetic */ f0(i0 i0Var, long j10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, j10, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i11, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f0(i0 i0Var, long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z10, (DefaultConstructorMarker) null);
    }

    private f0(i0 i0Var, long j10, int i10, boolean z10) {
        this(i0Var, j10, i10, z10 ? androidx.compose.ui.text.style.v.f42256b.c() : androidx.compose.ui.text.style.v.f42256b.a(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f0(i0 i0Var, int i10, boolean z10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z10, f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.l(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.b1(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public f0(@NotNull i0 i0Var, int i10, boolean z10, float f10) {
        long jB = androidx.compose.ui.unit.c.b(0, s0.o(f10), 0, 0, 13, null);
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        this(i0Var, jB, i10, z10 ? aVar.c() : aVar.a(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f0(f fVar, y3 y3Var, List list, int i10, boolean z10, float f10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.x.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, (List<f.e<v0>>) ((i11 & 4) != 0 ? CollectionsKt.emptyList() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z10, f10, dVar, bVar);
    }

    @kotlin.l(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @kotlin.b1(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public f0(@NotNull f fVar, @NotNull y3 y3Var, @NotNull List<f.e<v0>> list, int i10, boolean z10, float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.x.b bVar) {
        i0 i0Var = new i0(fVar, y3Var, list, dVar, androidx.compose.ui.text.font.s.a(bVar));
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        this(i0Var, androidx.compose.ui.unit.c.b(0, s0.o(f10), 0, 0, 13, null), i10, z10 ? aVar.c() : aVar.a(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f0(f fVar, y3 y3Var, float f10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, f10, dVar, bVar, (List<f.e<v0>>) ((i11 & 32) != 0 ? CollectionsKt.emptyList() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10);
    }

    @kotlin.l(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.b1(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public f0(@NotNull f fVar, @NotNull y3 y3Var, float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.text.font.y.b bVar, @NotNull List<f.e<v0>> list, int i10, boolean z10) {
        i0 i0Var = new i0(fVar, y3Var, list, dVar, bVar);
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        this(i0Var, androidx.compose.ui.unit.c.b(0, s0.o(f10), 0, 0, 13, null), i10, z10 ? aVar.c() : aVar.a(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f0(f fVar, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, j10, dVar, bVar, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z10, (DefaultConstructorMarker) null);
    }

    private f0(f fVar, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List<f.e<v0>> list, int i10, boolean z10) {
        i0 i0Var = new i0(fVar, y3Var, list, dVar, bVar);
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        this(i0Var, j10, i10, z10 ? aVar.c() : aVar.a(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f0(f fVar, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, j10, dVar, bVar, (i12 & 32) != 0 ? CollectionsKt.emptyList() : list, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i11, (DefaultConstructorMarker) null);
    }

    private f0(f fVar, y3 y3Var, long j10, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List<f.e<v0>> list, int i10, int i11) {
        this(new i0(fVar, y3Var, list, dVar, bVar), j10, i10, i11, (DefaultConstructorMarker) null);
    }
}
