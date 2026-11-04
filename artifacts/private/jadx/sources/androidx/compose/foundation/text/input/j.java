package androidx.compose.foundation.text.input;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.text.input.internal.g4;
import androidx.compose.foundation.text.input.internal.j4;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBufferKt\n*L\n1#1,770:1\n1#2:771\n1102#3,2:772\n1107#3:774\n1085#3,2:775\n35#4,5:777\n97#5,4:782\n97#5,4:786\n97#5,4:835\n97#5,4:839\n51#5,4:843\n715#6,45:790\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text/input/TextFieldBuffer\n*L\n170#1:772,2\n222#1:774\n222#1:775,2\n224#1:777,5\n308#1:782,4\n309#1:786,4\n469#1:835,4\n474#1:839,4\n485#1:843,4\n324#1:790,45\n*E\n"})
public final class j implements Appendable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f20279k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f20280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final g4 f20281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final j4 f20282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.input.internal.q f20283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private w3 f20285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> f20286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Pair<s, w3> f20287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> f20289j;

    public interface a {
        int a();

        long b(int i10);

        long c(int i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull final l lVar, @Nullable androidx.compose.foundation.text.input.internal.q qVar, @NotNull l lVar2, @Nullable g4 g4Var) {
        this.f20280a = lVar2;
        this.f20281b = g4Var;
        this.f20282c = new j4(lVar);
        androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> dVar = null;
        this.f20283d = qVar != null ? new androidx.compose.foundation.text.input.internal.q(qVar) : null;
        this.f20284e = lVar.h();
        this.f20285f = lVar.d();
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> listC = lVar.c();
        if (listC != null && !listC.isEmpty()) {
            int size = lVar.c().size();
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.input.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j.j(lVar, ((Integer) obj).intValue());
                }
            };
            androidx.compose.ui.text.f.e[] eVarArr = new androidx.compose.ui.text.f.e[size];
            for (int i10 = 0; i10 < size; i10++) {
                eVarArr[i10] = function1.invoke(Integer.valueOf(i10));
            }
            dVar = new androidx.compose.runtime.collection.d<>(eVarArr, size);
        }
        this.f20286g = dVar;
        this.f20288i = this.f20281b != null;
    }

    public static /* synthetic */ void E(j jVar, int i10, int i11, CharSequence charSequence, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        int i15 = i12;
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        jVar.D(i10, i11, charSequence, i15, i13);
    }

    private final void F(int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        int i11 = z10 ? 0 : -1;
        int iR = r();
        if (!z11) {
            iR++;
        }
        if (i11 <= i10 && i10 < iR) {
            z12 = true;
        }
        if (!z12) {
            androidx.compose.foundation.internal.e.g("Expected " + i10 + " to be in [" + i11 + ", " + iR + ')');
        }
    }

    private final void G(long j10) {
        long jB = x3.b(0, r());
        if (w3.d(jB, j10)) {
            return;
        }
        androidx.compose.foundation.internal.e.g("Expected " + ((Object) w3.q(j10)) + " to be in " + ((Object) w3.q(jB)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void K(j jVar, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = null;
            int i13 = 3 ^ 0;
        }
        jVar.J(i10, i11, list);
    }

    private final void L(w3 w3Var) {
        if (w3Var != null && !w3.h(w3Var.r())) {
            this.f20285f = w3Var;
            return;
        }
        this.f20285f = null;
        androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> dVar = this.f20286g;
        if (dVar != null) {
            dVar.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l R(j jVar, long j10, w3 w3Var, List list, List list2, int i10, Object obj) {
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> listQ;
        if ((i10 & 1) != 0) {
            j10 = jVar.w();
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            w3Var = jVar.f20285f;
        }
        w3 w3Var2 = w3Var;
        if ((i10 & 4) != 0) {
            androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> dVar = jVar.f20286g;
            list = (dVar == null || (listQ = dVar.q()) == null || listQ.isEmpty()) ? null : listQ;
        }
        return jVar.Q(j11, w3Var2, list, (i10 & 8) != 0 ? null : list2);
    }

    private final void g() {
        l().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.f.e j(l lVar, int i10) {
        return lVar.c().get(i10);
    }

    @b2
    public static /* synthetic */ void n() {
    }

    private final void z(int i10, int i11, int i12) {
        l().f(i10, i11, i12);
        g4 g4Var = this.f20281b;
        if (g4Var != null) {
            g4Var.e(i10, i11, i12);
        }
        this.f20284e = k.a(w(), i10, i11, i12);
    }

    public final void A(int i10) {
        F(i10, false, true);
        this.f20284e = x3.a(kotlin.ranges.r.B(i10 + 1, r()));
    }

    public final void B(int i10) {
        F(i10, true, false);
        this.f20284e = x3.a(i10);
    }

    public final void C(int i10, int i11, @NotNull CharSequence charSequence) {
        D(i10, i11, charSequence, 0, charSequence.length());
    }

    public final void D(int i10, int i11, @NotNull CharSequence charSequence, int i12, int i13) {
        if (!(i10 <= i11)) {
            androidx.compose.foundation.internal.e.g("Expected start=" + i10 + " <= end=" + i11);
        }
        if (!(i12 <= i13)) {
            androidx.compose.foundation.internal.e.g("Expected textStart=" + i12 + " <= textEnd=" + i13);
        }
        z(i10, i11, i13 - i12);
        this.f20282c.d(i10, i11, charSequence, i12, i13);
        i();
        h();
    }

    public final void H() {
        C(0, r(), this.f20280a.toString());
        O(this.f20280a.h());
        g();
    }

    public final void I(boolean z10) {
        this.f20288i = z10;
    }

    public final void J(int i10, int i11, @Nullable List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list) {
        if (i10 < 0 || i10 > this.f20282c.length()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f20282c.length());
        }
        if (i11 < 0 || i11 > this.f20282c.length()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f20282c.length());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
        }
        L(w3.b(x3.b(i10, i11)));
        androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> dVar = this.f20286g;
        if (dVar != null) {
            dVar.r();
        }
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.f20286g == null) {
            this.f20286g = new androidx.compose.runtime.collection.d<>(new androidx.compose.ui.text.f.e[16], 0);
        }
        int size = list2.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a> eVar = list.get(i12);
            androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> dVar2 = this.f20286g;
            if (dVar2 != null) {
                int i13 = 3 & 0;
                dVar2.d(androidx.compose.ui.text.f.e.f(eVar, null, eVar.i() + i10, eVar.g() + i10, null, 9, null));
            }
        }
    }

    public final void M(int i10, int i11, int i12) {
        if (i11 < i12) {
            this.f20287h = new Pair<>(s.c(i10), w3.b(x3.b(kotlin.ranges.r.I(i11, 0, r()), kotlin.ranges.r.I(i12, 0, r()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i11 + " > " + i12);
        }
    }

    public final void N(@Nullable List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list) {
        this.f20289j = list;
    }

    public final void O(long j10) {
        G(j10);
        this.f20284e = j10;
        this.f20287h = null;
    }

    public final void P(@NotNull CharSequence charSequence) {
        int i10;
        int i11;
        j4 j4Var = this.f20282c;
        int length = j4Var.length();
        int length2 = charSequence.length();
        boolean z10 = false;
        if (j4Var.length() <= 0 || charSequence.length() <= 0) {
            i10 = 0;
            i11 = 0;
        } else {
            int i12 = 0;
            int i13 = 0;
            boolean z11 = false;
            while (true) {
                if (!z10) {
                    if (j4Var.charAt(i12) == charSequence.charAt(i13)) {
                        i12++;
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                if (!z11) {
                    if (j4Var.charAt(length - 1) == charSequence.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z11 = true;
                    }
                }
                if (i12 >= length || i13 >= length2 || (z10 && z11)) {
                    break;
                }
            }
            i10 = i12;
            i11 = i13;
        }
        int i14 = length;
        int i15 = length2;
        if (i10 < i14 || i11 < i15) {
            D(i10, i14, charSequence, i11, i15);
        }
    }

    @NotNull
    public final l Q(long j10, @Nullable w3 w3Var, @Nullable List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list, @Nullable List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list2) {
        return new l(this.f20282c.toString(), j10, w3Var, null, list, list2, 8, null);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence) {
        if (charSequence != null) {
            z(r(), r(), charSequence.length());
            j4 j4Var = this.f20282c;
            j4.e(j4Var, j4Var.length(), this.f20282c.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    public final void b(@NotNull androidx.compose.ui.text.f.a aVar, int i10, int i11) {
        if (!this.f20288i) {
            androidx.compose.foundation.internal.e.i("You can add styling to a [TextFieldBuffer] only from an [OutputTransformation].");
        }
        if (this.f20289j == null) {
            this.f20289j = new ArrayList();
        }
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list = this.f20289j;
        if (list != null) {
            list.add(new androidx.compose.ui.text.f.e<>(aVar, i10, i11));
        }
    }

    public final void c(@NotNull t0 t0Var, int i10, int i11) {
        b(t0Var, i10, i11);
    }

    public final void d(@NotNull c3 c3Var, int i10, int i11) {
        b(c3Var, i10, i11);
    }

    @NotNull
    public final CharSequence e() {
        return this.f20282c;
    }

    public final char f(int i10) {
        return this.f20282c.charAt(i10);
    }

    public final void h() {
        this.f20287h = null;
    }

    public final void i() {
        L(null);
    }

    public final boolean k() {
        return this.f20288i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final androidx.compose.foundation.text.input.internal.q l() {
        androidx.compose.foundation.text.input.internal.q qVar = this.f20283d;
        if (qVar != null) {
            return qVar;
        }
        androidx.compose.foundation.text.input.internal.q qVar2 = new androidx.compose.foundation.text.input.internal.q(null, 1, 0 == true ? 1 : 0);
        this.f20283d = qVar2;
        return qVar2;
    }

    @NotNull
    public final a m() {
        return l();
    }

    @Nullable
    public final androidx.compose.runtime.collection.d<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> o() {
        return this.f20286g;
    }

    @Nullable
    public final w3 p() {
        return this.f20285f;
    }

    @Nullable
    public final Pair<s, w3> q() {
        return this.f20287h;
    }

    public final int r() {
        return this.f20282c.length();
    }

    public final long s() {
        return this.f20280a.h();
    }

    @NotNull
    public final CharSequence t() {
        return this.f20280a.i();
    }

    @NotNull
    public String toString() {
        return this.f20282c.toString();
    }

    @NotNull
    public final l u() {
        return this.f20280a;
    }

    @Nullable
    public final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> v() {
        return this.f20289j;
    }

    public final long w() {
        return this.f20284e;
    }

    public final boolean x() {
        return this.f20285f != null;
    }

    @oj.i(name = "hasSelection")
    public final boolean y() {
        return !w3.h(w());
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence, int i10, int i11) {
        if (charSequence != null) {
            z(r(), r(), i11 - i10);
            j4 j4Var = this.f20282c;
            j4.e(j4Var, j4Var.length(), this.f20282c.length(), charSequence.subSequence(i10, i11), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char c10) {
        z(r(), r(), 1);
        j4 j4Var = this.f20282c;
        j4.e(j4Var, j4Var.length(), this.f20282c.length(), String.valueOf(c10), 0, 0, 24, null);
        return this;
    }

    public /* synthetic */ j(l lVar, androidx.compose.foundation.text.input.internal.q qVar, l lVar2, g4 g4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i10 & 2) != 0 ? null : qVar, (i10 & 4) != 0 ? lVar : lVar2, (i10 & 8) != 0 ? null : g4Var);
    }
}
