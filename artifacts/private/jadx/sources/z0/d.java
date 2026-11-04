package z0;

import a1.g;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.graphics.s3;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.l;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.style.h;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.style.q;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.y0;
import androidx.compose.ui.text.y3;
import androidx.compose.ui.unit.a0;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.o;
import w0.m;
import w0.n;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,604:1\n252#2:605\n35#3,5:606\n251#3,2:612\n35#3,5:614\n253#3:619\n71#3,5:620\n35#3,5:625\n1#4:611\n65#5:630\n69#5:633\n60#6:631\n70#6:634\n22#7:632\n22#7:635\n635#8:636\n635#8:637\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n92#1:605\n139#1:606,5\n347#1:612,2\n347#1:614,5\n347#1:619\n416#1:620,5\n436#1:625,5\n483#1:630\n484#1:633\n483#1:631\n484#1:634\n483#1:632\n484#1:635\n499#1:636\n567#1:637\n*E\n"})
public final class d {
    public static final void A(@NotNull Spannable spannable, @NotNull y3 y3Var, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, @NotNull androidx.compose.ui.unit.d dVar, @NotNull o<? super y, ? super v0, ? super q0, ? super r0, ? extends Typeface> oVar) {
        MetricAffectingSpan metricAffectingSpanB;
        p(spannable, y3Var, list, oVar);
        List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a> eVar = list.get(i10);
            if (eVar.h() instanceof c3) {
                int i11 = eVar.i();
                int iG = eVar.g();
                if (i11 >= 0 && i11 < spannable.length() && iG > i11 && iG <= spannable.length()) {
                    z(spannable, (c3) eVar.h(), i11, iG, dVar);
                    if (d((c3) eVar.h())) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a> eVar2 = list.get(i12);
                androidx.compose.ui.text.f.a aVarH = eVar2.h();
                if (aVarH instanceof c3) {
                    int i13 = eVar2.i();
                    int iG2 = eVar2.g();
                    if (i13 >= 0 && i13 < spannable.length() && iG2 > i13 && iG2 <= spannable.length() && (metricAffectingSpanB = b(((c3) aVarH).u(), dVar)) != null) {
                        y(spannable, metricAffectingSpanB, i13, iG2);
                    }
                }
            }
        }
    }

    public static final void B(@NotNull Spannable spannable, @Nullable k kVar, int i10, int i11) {
        if (kVar != null) {
            k.a aVar = k.f42215b;
            y(spannable, new n(kVar.d(aVar.f()), kVar.d(aVar.b())), i10, i11);
        }
    }

    public static final void C(@NotNull Spannable spannable, @Nullable s sVar, float f10, @NotNull androidx.compose.ui.unit.d dVar) {
        float fN;
        if (sVar != null && (!z.j(sVar.d(), a0.m(0)) || !z.j(sVar.e(), a0.m(0)))) {
            if (z.l(sVar.d()) == 0 || z.l(sVar.e()) == 0) {
                return;
            }
            long jM = z.m(sVar.d());
            b0.a aVar = b0.f42661b;
            float fN2 = 0.0f;
            if (b0.g(jM, aVar.b())) {
                fN = dVar.p6(sVar.d());
            } else {
                fN = b0.g(jM, aVar.a()) ? z.n(sVar.d()) * f10 : 0.0f;
            }
            long jM2 = z.m(sVar.e());
            if (b0.g(jM2, aVar.b())) {
                fN2 = dVar.p6(sVar.e());
            } else if (b0.g(jM2, aVar.a())) {
                fN2 = z.n(sVar.e()) * f10;
            }
            y(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fN), (int) Math.ceil(fN2)), 0, spannable.length());
        }
    }

    private static final MetricAffectingSpan b(long j10, androidx.compose.ui.unit.d dVar) {
        long jM = z.m(j10);
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.b())) {
            return new w0.f(dVar.p6(j10));
        }
        if (b0.g(jM, aVar.a())) {
            return new w0.e(z.n(j10));
        }
        return null;
    }

    public static final void c(@Nullable c3 c3Var, @NotNull List<androidx.compose.ui.text.f.e<c3>> list, @NotNull pj.n<? super c3, ? super Integer, ? super Integer, Unit> nVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            nVar.invoke(g(c3Var, list.get(0).h()), Integer.valueOf(list.get(0).i()), Integer.valueOf(list.get(0).g()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        int[] iArr = new int[i10];
        List<androidx.compose.ui.text.f.e<c3>> list2 = list;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            androidx.compose.ui.text.f.e<c3> eVar = list.get(i11);
            iArr[i11] = eVar.i();
            iArr[i11 + size] = eVar.g();
        }
        ArraysKt.sort(iArr);
        int iFirst = ArraysKt.first(iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 != iFirst) {
                int size3 = list2.size();
                c3 c3VarG = c3Var;
                for (int i14 = 0; i14 < size3; i14++) {
                    androidx.compose.ui.text.f.e<c3> eVar2 = list.get(i14);
                    if (eVar2.i() != eVar2.g() && l.z(iFirst, i13, eVar2.i(), eVar2.g())) {
                        c3VarG = g(c3VarG, eVar2.h());
                    }
                }
                if (c3VarG != null) {
                    nVar.invoke(c3VarG, Integer.valueOf(iFirst), Integer.valueOf(i13));
                }
                iFirst = i13;
            }
        }
    }

    private static final boolean d(c3 c3Var) {
        long jM = z.m(c3Var.u());
        b0.a aVar = b0.f42661b;
        if (!b0.g(jM, aVar.b()) && !b0.g(z.m(c3Var.u()), aVar.a())) {
            return false;
        }
        return true;
    }

    private static final boolean e(y3 y3Var) {
        return e.e(y3Var.o0()) || y3Var.z() != null;
    }

    private static final boolean f(androidx.compose.ui.unit.d dVar) {
        return ((double) dVar.m0()) > 1.05d;
    }

    private static final c3 g(c3 c3Var, c3 c3Var2) {
        return c3Var == null ? c3Var2 : c3Var.E(c3Var2);
    }

    private static final float h(long j10, float f10, androidx.compose.ui.unit.d dVar) {
        if (z.j(j10, z.f42728b.b())) {
            return f10;
        }
        long jM = z.m(j10);
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.b())) {
            return dVar.p6(j10);
        }
        if (b0.g(jM, aVar.a())) {
            return z.n(j10) * f10;
        }
        return Float.NaN;
    }

    private static final float i(long j10, float f10, androidx.compose.ui.unit.d dVar) {
        float fN;
        long jM = z.m(j10);
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.b())) {
            if (!f(dVar)) {
                return dVar.p6(j10);
            }
            fN = z.n(j10) / z.n(dVar.m1(f10));
        } else {
            if (!b0.g(jM, aVar.a())) {
                return Float.NaN;
            }
            fN = z.n(j10);
        }
        return fN * f10;
    }

    public static final void j(@NotNull Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            y(spannable, new BackgroundColorSpan(s0.t(j10)), i10, i11);
        }
    }

    private static final void k(Spannable spannable, androidx.compose.ui.text.style.a aVar, int i10, int i11) {
        if (aVar != null) {
            y(spannable, new w0.a(aVar.k()), i10, i11);
        }
    }

    private static final void l(Spannable spannable, i0 i0Var, float f10, int i10, int i11) {
        if (i0Var != null) {
            if (i0Var instanceof s3) {
                n(spannable, ((s3) i0Var).c(), i10, i11);
            } else {
                if (!(i0Var instanceof m3)) {
                    throw new k0();
                }
                y(spannable, new g((m3) i0Var, f10), i10, i11);
            }
        }
    }

    public static final void m(@NotNull Spannable spannable, @NotNull List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, float f10, @NotNull androidx.compose.ui.unit.d dVar, @Nullable s sVar) {
        androidx.compose.ui.unit.d dVar2 = dVar;
        float fN = 0.0f;
        if (sVar != null) {
            long jM = z.m(sVar.d());
            b0.a aVar = b0.f42661b;
            if (b0.g(jM, aVar.b())) {
                fN = dVar2.p6(sVar.d());
            } else if (b0.g(jM, aVar.a())) {
                fN = z.n(sVar.d()) * f10;
            }
        }
        float f11 = fN;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a> eVar = list.get(i10);
            androidx.compose.ui.text.f.a aVarH = eVar.h();
            p pVar = aVarH instanceof p ? (p) aVarH : null;
            if (pVar != null) {
                float fH = h(pVar.m(), f10, dVar2);
                float fH2 = h(pVar.j(), f10, dVar2);
                float fH3 = h(pVar.k(), f10, dVar2);
                if (!Float.isNaN(fH) && !Float.isNaN(fH2) && !Float.isNaN(fH3)) {
                    y(spannable, new a1.c(pVar.l(), fH, fH2, fH3, pVar.h(), pVar.g(), pVar.i(), dVar2, f11), eVar.i(), eVar.g());
                }
            }
            i10++;
            dVar2 = dVar;
        }
    }

    public static final void n(@NotNull Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            y(spannable, new ForegroundColorSpan(s0.t(j10)), i10, i11);
        }
    }

    private static final void o(Spannable spannable, i iVar, int i10, int i11) {
        if (iVar != null) {
            y(spannable, new a1.d(iVar), i10, i11);
        }
    }

    private static final void p(final Spannable spannable, y3 y3Var, List<? extends androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a>> list, final o<? super y, ? super v0, ? super q0, ? super r0, ? extends Typeface> oVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.f.e<? extends androidx.compose.ui.text.f.a> eVar = list.get(i10);
            if ((eVar.h() instanceof c3) && (e.e((c3) eVar.h()) || ((c3) eVar.h()).s() != null)) {
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(eVar);
            }
        }
        c(e(y3Var) ? new c3(0L, 0L, y3Var.A(), y3Var.y(), y3Var.z(), y3Var.v(), (String) null, 0L, (androidx.compose.ui.text.style.a) null, (q) null, (y0.f) null, 0L, (k) null, (o3) null, (y0) null, (i) null, 65475, (DefaultConstructorMarker) null) : null, arrayList, new pj.n() { // from class: z0.c
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return d.q(spannable, oVar, (c3) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Spannable spannable, o oVar, c3 c3Var, int i10, int i11) {
        y yVarO = c3Var.o();
        v0 v0VarT = c3Var.t();
        if (v0VarT == null) {
            v0VarT = v0.f41742b.m();
        }
        q0 q0VarR = c3Var.r();
        q0 q0VarC = q0.c(q0VarR != null ? q0VarR.j() : q0.f41690b.c());
        r0 r0VarS = c3Var.s();
        spannable.setSpan(new w0.o((Typeface) oVar.invoke(yVarO, v0VarT, q0VarC, r0.e(r0VarS != null ? r0VarS.m() : r0.f41699b.a()))), i10, i11, 33);
        return Unit.f312394a;
    }

    private static final void r(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            y(spannable, new w0.b(str), i10, i11);
        }
    }

    public static final void s(@NotNull Spannable spannable, long j10, @NotNull androidx.compose.ui.unit.d dVar, int i10, int i11) {
        long jM = z.m(j10);
        b0.a aVar = b0.f42661b;
        if (b0.g(jM, aVar.b())) {
            y(spannable, new AbsoluteSizeSpan(kotlin.math.b.L0(dVar.p6(j10)), false), i10, i11);
        } else if (b0.g(jM, aVar.a())) {
            y(spannable, new RelativeSizeSpan(z.n(j10)), i10, i11);
        }
    }

    private static final void t(Spannable spannable, q qVar, int i10, int i11) {
        if (qVar != null) {
            y(spannable, new ScaleXSpan(qVar.d()), i10, i11);
            y(spannable, new m(qVar.e()), i10, i11);
        }
    }

    public static final void u(@NotNull Spannable spannable, long j10, float f10, @NotNull androidx.compose.ui.unit.d dVar, @NotNull h hVar) {
        float fI = i(j10, f10, dVar);
        if (Float.isNaN(fI)) {
            return;
        }
        y(spannable, new w0.h(fI, 0, (spannable.length() == 0 || StringsKt.t7(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), h.d.j(hVar.f()), h.d.k(hVar.f()), hVar.d(), h.c.f(hVar.e(), h.c.f42190b.b())), 0, spannable.length());
    }

    public static final void v(@NotNull Spannable spannable, long j10, float f10, @NotNull androidx.compose.ui.unit.d dVar) {
        float fI = i(j10, f10, dVar);
        if (Float.isNaN(fI)) {
            return;
        }
        y(spannable, new w0.g(fI), 0, spannable.length());
    }

    public static final void w(@NotNull Spannable spannable, @Nullable y0.f fVar, int i10, int i11) {
        if (fVar != null) {
            y(spannable, a.f399846a.a(fVar), i10, i11);
        }
    }

    private static final void x(Spannable spannable, o3 o3Var, int i10, int i11) {
        if (o3Var != null) {
            y(spannable, new w0.l(s0.t(o3Var.f()), Float.intBitsToFloat((int) (o3Var.h() >> 32)), Float.intBitsToFloat((int) (o3Var.h() & com.rabbitmq.client.k0.f265952a)), e.c(o3Var.d())), i10, i11);
        }
    }

    public static final void y(@NotNull Spannable spannable, @NotNull Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void z(Spannable spannable, c3 c3Var, int i10, int i11, androidx.compose.ui.unit.d dVar) {
        k(spannable, c3Var.k(), i10, i11);
        n(spannable, c3Var.m(), i10, i11);
        l(spannable, c3Var.l(), c3Var.i(), i10, i11);
        B(spannable, c3Var.y(), i10, i11);
        s(spannable, c3Var.q(), dVar, i10, i11);
        r(spannable, c3Var.p(), i10, i11);
        t(spannable, c3Var.A(), i10, i11);
        w(spannable, c3Var.v(), i10, i11);
        j(spannable, c3Var.j(), i10, i11);
        x(spannable, c3Var.x(), i10, i11);
        o(spannable, c3Var.n(), i10, i11);
    }
}
