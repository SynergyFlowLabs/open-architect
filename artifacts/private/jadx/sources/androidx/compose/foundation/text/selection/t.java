package androidx.compose.foundation.text.selection;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,739:1\n51#2,4:740\n51#2,4:744\n51#2,4:749\n1#3:748\n71#4,5:753\n*S KotlinDebug\n*F\n+ 1 SelectionLayout.kt\nandroidx/compose/foundation/text/selection/MultiSelectionLayout\n*L\n147#1:740,4\n224#1:744,4\n264#1:749,4\n281#1:753,5\n*E\n"})
final class t implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.q0 f21367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f0> f21368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final h0 f21372f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21373a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21373a = iArr;
        }
    }

    public t(@NotNull androidx.collection.q0 q0Var, @NotNull List<f0> list, int i10, int i11, boolean z10, @Nullable h0 h0Var) {
        this.f21367a = q0Var;
        this.f21368b = list;
        this.f21369c = i10;
        this.f21370d = i11;
        this.f21371e = z10;
        this.f21372f = h0Var;
        boolean z11 = true;
        if (list.size() <= 1) {
            z11 = false;
        }
        if (z11) {
            return;
        }
        androidx.compose.foundation.internal.e.i("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    private final void o(androidx.collection.a2<h0> a2Var, h0 h0Var, f0 f0Var, int i10, int i11) {
        h0 h0VarM = h0Var.g() ? f0Var.m(i11, i10) : f0Var.m(i10, i11);
        if (!(i10 <= i11)) {
            androidx.compose.foundation.internal.e.i("minOffset should be less than or equal to maxOffset: " + h0VarM);
        }
        a2Var.c0(f0Var.h(), h0VarM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(t tVar, androidx.collection.a2 a2Var, h0 h0Var, f0 f0Var) {
        tVar.o(a2Var, h0Var, f0Var, 0, f0Var.l());
        return Unit.f312394a;
    }

    private final int r(long j10) {
        try {
            return this.f21367a.n(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException("Invalid selectableId: " + j10, e10);
        }
    }

    private final boolean t(t tVar) {
        if (getSize() != tVar.getSize()) {
            return true;
        }
        int size = this.f21368b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f21368b.get(i10).n(tVar.f21368b.get(i10))) {
                return true;
            }
        }
        return false;
    }

    private final int u(int i10, boolean z10) {
        return (i10 - (!z10 ? 1 : 0)) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    private final int v(int i10, boolean z10) {
        int i11 = a.f21373a[d().ordinal()];
        if (i11 == 1) {
            z10 = true;
        } else if (i11 != 2) {
            if (i11 != 3) {
                throw new kotlin.k0();
            }
            if (z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return u(i10, z10);
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public boolean a() {
        return this.f21371e;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 b() {
        return d() == m.CROSSED ? h() : g();
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 c() {
        return a() ? h() : g();
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public m d() {
        if (i() < k()) {
            return m.NOT_CROSSED;
        }
        return i() > k() ? m.CROSSED : this.f21368b.get(i() / 2).d();
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @Nullable
    public h0 e() {
        return this.f21372f;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public boolean f(@Nullable o1 o1Var) {
        if (e() != null && o1Var != null && (o1Var instanceof t)) {
            t tVar = (t) o1Var;
            if (a() == tVar.a() && i() == tVar.i() && k() == tVar.k() && !t(tVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 g() {
        return this.f21368b.get(v(k(), false));
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public int getSize() {
        return this.f21368b.size();
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 h() {
        return this.f21368b.get(v(i(), true));
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public int i() {
        return this.f21369c;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public f0 j() {
        return d() == m.CROSSED ? g() : h();
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public int k() {
        return this.f21370d;
    }

    @Override // androidx.compose.foundation.text.selection.o1
    public void l(@NotNull Function1<? super f0, Unit> function1) {
        int iR = r(j().h());
        int iR2 = r(b().h());
        int i10 = iR + 1;
        if (i10 >= iR2) {
            return;
        }
        while (i10 < iR2) {
            function1.invoke(this.f21368b.get(i10));
            i10++;
        }
    }

    @Override // androidx.compose.foundation.text.selection.o1
    @NotNull
    public androidx.collection.x0<h0> m(@NotNull final h0 h0Var) {
        if (h0Var.h().h() != h0Var.f().h()) {
            final androidx.collection.a2<h0> a2VarJ = androidx.collection.y0.j();
            o(a2VarJ, h0Var, j(), (h0Var.g() ? h0Var.f() : h0Var.h()).g(), j().l());
            l(new Function1() { // from class: androidx.compose.foundation.text.selection.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t.p(this.f21361a, a2VarJ, h0Var, (f0) obj);
                }
            });
            o(a2VarJ, h0Var, b(), 0, (h0Var.g() ? h0Var.h() : h0Var.f()).g());
            return a2VarJ;
        }
        if (!((h0Var.g() && h0Var.h().g() >= h0Var.f().g()) || (!h0Var.g() && h0Var.h().g() <= h0Var.f().g()))) {
            androidx.compose.foundation.internal.e.i("unexpectedly miss-crossed selection: " + h0Var);
        }
        return androidx.collection.y0.e(h0Var.h().h(), h0Var);
    }

    @NotNull
    public final List<f0> q() {
        return this.f21368b;
    }

    @NotNull
    public final androidx.collection.q0 s() {
        return this.f21367a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiSelectionLayout(isStartHandle=");
        sb2.append(a());
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb2.append((i() + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((k() + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(d());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[\n\t");
        List<f0> list = this.f21368b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            f0 f0Var = list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(f0Var);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        String string = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }
}
