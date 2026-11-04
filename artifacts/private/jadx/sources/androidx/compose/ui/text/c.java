package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n118#2,4:711\n118#2,4:715\n118#2,4:737\n118#2,4:742\n118#2,4:746\n33#3:719\n33#3:723\n33#3:750\n53#4,3:720\n53#4,3:724\n70#4:732\n60#4:735\n53#4,3:751\n11165#5:727\n11500#5,3:728\n69#6:731\n65#6:734\n22#7:733\n22#7:736\n1#8:741\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n139#1:711,4\n143#1:715,4\n389#1:737,4\n430#1:742,4\n440#1:746,4\n255#1:719\n259#1:723\n569#1:750\n255#1:720,3\n259#1:724,3\n361#1:732\n362#1:735\n569#1:751,3\n299#1:727\n299#1:728,3\n361#1:731\n362#1:734\n361#1:733\n362#1:736\n*E\n"})
public final class c implements n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41472h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.platform.h f41473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f41476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.android.f1 f41477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final CharSequence f41478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<n0.j> f41479g;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41480a;

        static {
            int[] iArr = new int[androidx.compose.ui.text.style.i.values().length];
            try {
                iArr[androidx.compose.ui.text.style.i.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.text.style.i.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41480a = iArr;
        }
    }

    public /* synthetic */ c(androidx.compose.ui.text.platform.h hVar, int i10, int i11, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, i10, i11, j10);
    }

    private final androidx.compose.ui.text.android.f1 L(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        return new androidx.compose.ui.text.android.f1(charSequence, getWidth(), b0(), i10, truncateAt, this.f41473a.n(), 1.0f, 0.0f, androidx.compose.ui.text.platform.f.b(this.f41473a.l()), true, i12, i14, i15, i16, i13, i11, null, null, this.f41473a.j(), 196736, null);
    }

    static /* synthetic */ androidx.compose.ui.text.android.f1 M(c cVar, int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, Object obj) {
        return cVar.L(i10, i11, truncateAt, i12, i13, i14, i15, i16, (i17 & 256) != 0 ? cVar.f41478f : charSequence);
    }

    @androidx.annotation.l1
    public static /* synthetic */ void O() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(m3 m3Var, RectF rectF, RectF rectF2) {
        return m3Var.a(androidx.compose.ui.graphics.c3.f(rectF), androidx.compose.ui.graphics.c3.f(rectF2));
    }

    private final a1.g[] Y(androidx.compose.ui.text.android.f1 f1Var) {
        if (!(f1Var.P() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceP = f1Var.P();
        Intrinsics.checkNotNull(charSequenceP, "null cannot be cast to non-null type android.text.Spanned");
        if (!d0((Spanned) charSequenceP, a1.g.class)) {
            return null;
        }
        CharSequence charSequenceP2 = f1Var.P();
        Intrinsics.checkNotNull(charSequenceP2, "null cannot be cast to non-null type android.text.Spanned");
        return (a1.g[]) ((Spanned) charSequenceP2).getSpans(0, f1Var.P().length(), a1.g.class);
    }

    @androidx.annotation.l1
    public static /* synthetic */ void a0() {
    }

    @androidx.annotation.l1
    public static /* synthetic */ void c0() {
    }

    private final boolean d0(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void e0(androidx.compose.ui.graphics.k0 k0Var) {
        Canvas canvasD = androidx.compose.ui.graphics.c.d(k0Var);
        if (z()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f41477e.X(canvasD);
        if (z()) {
            canvasD.restore();
        }
    }

    @Override // androidx.compose.ui.text.n0
    @NotNull
    public androidx.compose.ui.graphics.k2 A(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f41478f.length())) {
            x0.a.e("start(" + i10 + ") or end(" + i11 + ") is out of range [0.." + this.f41478f.length() + "], or start > end!");
        }
        Path path = new Path();
        this.f41477e.O(i10, i11, path);
        return androidx.compose.ui.graphics.u.d(path);
    }

    @Override // androidx.compose.ui.text.n0
    public float B(int i10, boolean z10) {
        return z10 ? androidx.compose.ui.text.android.f1.K(this.f41477e, i10, false, 2, null) : androidx.compose.ui.text.android.f1.N(this.f41477e, i10, false, 2, null);
    }

    @Override // androidx.compose.ui.text.n0
    public void D(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, float f10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        int iC = b0().c();
        androidx.compose.ui.text.platform.o oVarB0 = b0();
        float width = getWidth();
        oVarB0.n(i0Var, n0.n.f((((long) Float.floatToRawIntBits(getHeight())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(width) << 32)), f10);
        oVarB0.u(o3Var);
        oVarB0.w(kVar);
        oVarB0.s(iVar);
        oVarB0.l(i10);
        e0(k0Var);
        b0().l(iC);
    }

    @Override // androidx.compose.ui.text.n0
    public float E() {
        return p(g() - 1);
    }

    @Override // androidx.compose.ui.text.n0
    public int F(int i10) {
        return this.f41477e.w(i10);
    }

    @Override // androidx.compose.ui.text.n0
    @NotNull
    public androidx.compose.ui.text.style.i G(int i10) {
        return this.f41477e.W(i10) ? androidx.compose.ui.text.style.i.Rtl : androidx.compose.ui.text.style.i.Ltr;
    }

    @Override // androidx.compose.ui.text.n0
    @NotNull
    public List<n0.j> H() {
        return this.f41479g;
    }

    @Override // androidx.compose.ui.text.n0
    public float I(int i10) {
        return this.f41477e.E(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public void J(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar) {
        androidx.compose.ui.text.platform.o oVarB0 = b0();
        oVarB0.r(j10);
        oVarB0.u(o3Var);
        oVarB0.w(kVar);
        e0(k0Var);
    }

    @NotNull
    public final CharSequence N() {
        return this.f41478f;
    }

    public final long P() {
        return this.f41476d;
    }

    public final float Q(int i10) {
        return this.f41477e.o(i10);
    }

    public final float R(int i10) {
        return this.f41477e.s(i10);
    }

    public final int S(int i10) {
        return this.f41477e.t(i10);
    }

    public final int T(int i10) {
        return this.f41477e.u(i10);
    }

    public final int U() {
        return this.f41474b;
    }

    public final int V() {
        return this.f41475c;
    }

    @NotNull
    public final androidx.compose.ui.text.platform.h W() {
        return this.f41473a;
    }

    @NotNull
    public final Locale Z() {
        return this.f41473a.o().getTextLocale();
    }

    @Override // androidx.compose.ui.text.n0
    public float a(int i10) {
        return this.f41477e.C(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public int b(int i10) {
        return this.f41477e.B(i10);
    }

    @NotNull
    public final androidx.compose.ui.text.platform.o b0() {
        return this.f41473a.o();
    }

    @Override // androidx.compose.ui.text.n0
    public float c(int i10) {
        return this.f41477e.y(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public float d(int i10) {
        return this.f41477e.z(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public float e(int i10) {
        return this.f41477e.q(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public float f() {
        return this.f41473a.f();
    }

    @Override // androidx.compose.ui.text.n0
    public int g() {
        return this.f41477e.r();
    }

    @Override // androidx.compose.ui.text.n0
    public float getHeight() {
        return this.f41477e.h();
    }

    @Override // androidx.compose.ui.text.n0
    public float getWidth() {
        return androidx.compose.ui.unit.b.p(this.f41476d);
    }

    @Override // androidx.compose.ui.text.n0
    public float h(int i10) {
        return this.f41477e.A(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public float i() {
        return this.f41473a.i();
    }

    @Override // androidx.compose.ui.text.n0
    @NotNull
    public n0.j j(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f41478f.length()) {
            z10 = true;
        }
        if (!z10) {
            x0.a.e("offset(" + i10 + ") is out of bounds [0," + this.f41478f.length() + ')');
        }
        RectF rectFE = this.f41477e.e(i10);
        return new n0.j(rectFE.left, rectFE.top, rectFE.right, rectFE.bottom);
    }

    @Override // androidx.compose.ui.text.n0
    @NotNull
    public androidx.compose.ui.text.style.i k(int i10) {
        return this.f41477e.I(this.f41477e.w(i10)) == 1 ? androidx.compose.ui.text.style.i.Ltr : androidx.compose.ui.text.style.i.Rtl;
    }

    @Override // androidx.compose.ui.text.n0
    public long l(int i10) {
        androidx.compose.ui.text.android.selection.h hVarT = this.f41477e.T();
        return x3.b(androidx.compose.ui.text.android.selection.g.b(hVarT, i10), androidx.compose.ui.text.android.selection.g.a(hVarT, i10));
    }

    @Override // androidx.compose.ui.text.n0
    public float m() {
        return p(0);
    }

    @Override // androidx.compose.ui.text.n0
    public int n(long j10) {
        return this.f41477e.H(this.f41477e.x((int) Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & j10))), Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Override // androidx.compose.ui.text.n0
    public int o(int i10, boolean z10) {
        return z10 ? this.f41477e.D(i10) : this.f41477e.v(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public float p(int i10) {
        return this.f41477e.p(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public int q(float f10) {
        return this.f41477e.x((int) f10);
    }

    @Override // androidx.compose.ui.text.n0
    public long r(@NotNull n0.j jVar, int i10, @NotNull final m3 m3Var) {
        int[] iArrL = this.f41477e.L(androidx.compose.ui.graphics.c3.c(jVar), d.r(i10), new Function2() { // from class: androidx.compose.ui.text.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(c.X(m3Var, (RectF) obj, (RectF) obj2));
            }
        });
        return iArrL == null ? w3.f42333b.a() : x3.b(iArrL[0], iArrL[1]);
    }

    @Override // androidx.compose.ui.text.n0
    public void s(long j10, @NotNull float[] fArr, @androidx.annotation.g0(from = 0) int i10) {
        this.f41477e.a(w3.l(j10), w3.k(j10), fArr, i10);
    }

    @Override // androidx.compose.ui.text.n0
    @NotNull
    public n0.j w(int i10) {
        if (!(i10 >= 0 && i10 <= this.f41478f.length())) {
            x0.a.e("offset(" + i10 + ") is out of bounds [0," + this.f41478f.length() + AbstractJsonLexerKt.END_LIST);
        }
        float fK = androidx.compose.ui.text.android.f1.K(this.f41477e, i10, false, 2, null);
        int iW = this.f41477e.w(i10);
        return new n0.j(fK, this.f41477e.C(iW), fK, this.f41477e.q(iW));
    }

    @Override // androidx.compose.ui.text.n0
    public void x(@NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.drawscope.i iVar, int i10) {
        int iC = b0().c();
        androidx.compose.ui.text.platform.o oVarB0 = b0();
        oVarB0.r(j10);
        oVarB0.u(o3Var);
        oVarB0.w(kVar);
        oVarB0.s(iVar);
        oVarB0.l(i10);
        e0(k0Var);
        b0().l(iC);
    }

    @Override // androidx.compose.ui.text.n0
    public boolean y(int i10) {
        return this.f41477e.V(i10);
    }

    @Override // androidx.compose.ui.text.n0
    public boolean z() {
        return this.f41477e.f();
    }

    public /* synthetic */ c(String str, y3 y3Var, List list, List list2, int i10, int i11, long j10, androidx.compose.ui.text.font.y.b bVar, androidx.compose.ui.unit.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, list, list2, i10, i11, j10, bVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0310  */
    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0198  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01df A[LOOP:0: B:57:0x01d9->B:59:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0208  */
    /* JADX WARN: Code duplicated, block: B:63:0x020e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0225  */
    /* JADX WARN: Code duplicated, block: B:67:0x023b  */
    /* JADX WARN: Code duplicated, block: B:68:0x023d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0251  */
    /* JADX WARN: Code duplicated, block: B:77:0x025a  */
    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x020e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.text.c] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private c(androidx.compose.ui.text.platform.h hVar, int i10, int i11, long j10) {
        CharSequence charSequenceE;
        TextUtils.TruncateAt truncateAt;
        androidx.compose.ui.text.android.f1 f1VarM;
        int i12;
        int i13;
        int i14;
        ?? r13;
        ?? r10;
        a1.g[] gVarArrY;
        CharSequence charSequence;
        Spanned spanned;
        ArrayList arrayList;
        int i15;
        List<n0.j> listEmptyList;
        int spanEnd;
        int iW;
        ?? r11;
        ?? r12;
        ?? r14;
        n0.j jVar;
        float fB;
        float fP;
        int iB;
        float fC;
        float fB2;
        float fP2;
        Iterator itA;
        c cVar;
        int i16;
        this.f41473a = hVar;
        this.f41474b = i10;
        this.f41475c = i11;
        this.f41476d = j10;
        if (!(androidx.compose.ui.unit.b.q(j10) == 0 && androidx.compose.ui.unit.b.r(j10) == 0)) {
            x0.a.e("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (!(i10 >= 1)) {
            x0.a.e("maxLines should be greater than 0");
        }
        y3 y3VarL = hVar.l();
        androidx.compose.ui.text.style.v.a aVar = androidx.compose.ui.text.style.v.f42256b;
        if (d.l(y3VarL, androidx.compose.ui.text.style.v.i(i11, aVar.c()))) {
            charSequenceE = d.j(hVar.e());
        } else {
            charSequenceE = hVar.e();
        }
        this.f41478f = charSequenceE;
        int iM = d.m(y3VarL.R());
        boolean zK = androidx.compose.ui.text.style.j.k(y3VarL.R(), androidx.compose.ui.text.style.j.f42206b.c());
        int iO = d.o(y3VarL.L().m());
        int iN = d.n(androidx.compose.ui.text.style.f.l(y3VarL.H()));
        int iP = d.p(androidx.compose.ui.text.style.f.m(y3VarL.H()));
        int iQ = d.q(androidx.compose.ui.text.style.f.n(y3VarL.H()));
        if (androidx.compose.ui.text.style.v.i(i11, aVar.c())) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            if (!androidx.compose.ui.text.style.v.i(i11, aVar.e())) {
                if (androidx.compose.ui.text.style.v.i(i11, aVar.g())) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                TextUtils.TruncateAt truncateAt2 = truncateAt;
                CharSequence charSequence2 = charSequenceE;
                f1VarM = M(this, iM, zK, truncateAt2, i10, iO, iN, iP, iQ, null, 256, null);
                if (Build.VERSION.SDK_INT < 35 || b0().getLetterSpacing() == 0.0f || (!(androidx.compose.ui.text.style.v.i(i11, aVar.g()) || androidx.compose.ui.text.style.v.i(i11, aVar.e())) || f1VarM.t(0) <= 0)) {
                    i12 = i10;
                    i13 = 1;
                } else {
                    int iU = f1VarM.u(0);
                    i13 = 1;
                    i12 = i10;
                    f1VarM = L(iM, zK, truncateAt2, i12, iO, iN, iP, iQ, TextUtils.concat(charSequence2.subSequence(0, iU), "…", charSequence2.subSequence(f1VarM.t(0) + iU, charSequence2.length())));
                }
                if (!androidx.compose.ui.text.style.v.i(i11, aVar.c()) && f1VarM.h() > androidx.compose.ui.unit.b.o(j10) && i12 > i13) {
                    int iK = d.k(f1VarM, androidx.compose.ui.unit.b.o(j10));
                    if (iK < 0 || iK == i12) {
                        cVar = this;
                        i14 = 2;
                        i16 = i13;
                    } else {
                        int iU2 = kotlin.ranges.r.u(iK, i13);
                        i14 = 2;
                        i16 = i13;
                        c cVar2 = this;
                        f1VarM = M(cVar2, iM, zK, truncateAt2, iU2, iO, iN, iP, iQ, null, 256, null);
                        cVar = cVar2;
                    }
                    cVar.f41477e = f1VarM;
                    r10 = cVar;
                    r13 = i16;
                } else {
                    c cVar3 = this;
                    i14 = 2;
                    r13 = i13;
                    cVar3.f41477e = f1VarM;
                    r10 = cVar3;
                }
                r10.b0().n(y3VarL.s(), n0.n.f((((long) Float.floatToRawIntBits(r10.getHeight())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(r10.getWidth())) << 32)), y3VarL.p());
                gVarArrY = r10.Y(r10.f41477e);
                if (gVarArrY != null) {
                    itA = kotlin.jvm.internal.i.a(gVarArrY);
                    while (itA.hasNext()) {
                        ((a1.g) itA.next()).e(n0.n.f((((long) Float.floatToRawIntBits(r10.getHeight())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(r10.getWidth())) << 32)));
                    }
                }
                charSequence = r10.f41478f;
                if (charSequence instanceof Spanned) {
                    spanned = (Spanned) charSequence;
                    Object[] spans = spanned.getSpans(0, charSequence.length(), w0.j.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        w0.j jVar2 = (w0.j) obj;
                        int spanStart = spanned.getSpanStart(jVar2);
                        spanEnd = spanned.getSpanEnd(jVar2);
                        iW = r10.f41477e.w(spanStart);
                        if (iW >= r10.f41474b) {
                            r11 = r13;
                        } else {
                            r11 = 0;
                        }
                        if (r10.f41477e.t(iW) > 0 || spanEnd <= r10.f41477e.u(iW)) {
                            r12 = 0;
                        } else {
                            r12 = r13;
                        }
                        if (spanEnd > r10.f41477e.v(iW)) {
                            r14 = r13;
                        } else {
                            r14 = 0;
                        }
                        if (r12 != 0 && r14 == 0 && r11 == 0) {
                            int i17 = a.f41480a[r10.G(spanStart).ordinal()];
                            if (i17 == r13) {
                                fB = r10.B(spanStart, r13);
                            } else if (i17 == i14) {
                                fB = r10.B(spanStart, r13) - jVar2.d();
                            } else {
                                throw new kotlin.k0();
                            }
                            float fD = jVar2.d() + fB;
                            androidx.compose.ui.text.android.f1 f1Var = r10.f41477e;
                            switch (jVar2.c()) {
                                case 0:
                                    fP = f1Var.p(iW);
                                    iB = jVar2.b();
                                    fC = fP - iB;
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                case 1:
                                    fC = f1Var.C(iW);
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                case 2:
                                    fP = f1Var.q(iW);
                                    iB = jVar2.b();
                                    fC = fP - iB;
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                case 3:
                                    fC = ((f1Var.C(iW) + f1Var.q(iW)) - jVar2.b()) / i14;
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                case 4:
                                    fB2 = jVar2.a().ascent;
                                    fP2 = f1Var.p(iW);
                                    fC = fB2 + fP2;
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                case 5:
                                    fC = (jVar2.a().descent + f1Var.p(iW)) - jVar2.b();
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetricsIntA = jVar2.a();
                                    fB2 = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - jVar2.b()) / i14;
                                    fP2 = f1Var.p(iW);
                                    fC = fB2 + fP2;
                                    jVar = new n0.j(fB, fC, fD, jVar2.b() + fC);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                        } else {
                            jVar = null;
                        }
                        arrayList.add(jVar);
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                r10.f41479g = listEmptyList;
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        TextUtils.TruncateAt truncateAt3 = truncateAt;
        CharSequence charSequence3 = charSequenceE;
        f1VarM = M(this, iM, zK, truncateAt3, i10, iO, iN, iP, iQ, null, 256, null);
        if (Build.VERSION.SDK_INT < 35) {
            i12 = i10;
            i13 = 1;
        } else {
            i12 = i10;
            i13 = 1;
        }
        if (!androidx.compose.ui.text.style.v.i(i11, aVar.c())) {
            c cVar4 = this;
            i14 = 2;
            r13 = i13;
            cVar4.f41477e = f1VarM;
            r10 = cVar4;
        } else {
            c cVar5 = this;
            i14 = 2;
            r13 = i13;
            cVar5.f41477e = f1VarM;
            r10 = cVar5;
        }
        r10.b0().n(y3VarL.s(), n0.n.f((((long) Float.floatToRawIntBits(r10.getHeight())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(r10.getWidth())) << 32)), y3VarL.p());
        gVarArrY = r10.Y(r10.f41477e);
        if (gVarArrY != null) {
            itA = kotlin.jvm.internal.i.a(gVarArrY);
            while (itA.hasNext()) {
                ((a1.g) itA.next()).e(n0.n.f((((long) Float.floatToRawIntBits(r10.getHeight())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(r10.getWidth())) << 32)));
            }
        }
        charSequence = r10.f41478f;
        if (charSequence instanceof Spanned) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            spanned = (Spanned) charSequence;
            Object[] spans2 = spanned.getSpans(0, charSequence.length(), w0.j.class);
            arrayList = new ArrayList(spans2.length);
            while (i15 < r4) {
                w0.j jVar3 = (w0.j) obj;
                int spanStart2 = spanned.getSpanStart(jVar3);
                spanEnd = spanned.getSpanEnd(jVar3);
                iW = r10.f41477e.w(spanStart2);
                if (iW >= r10.f41474b) {
                    r11 = r13;
                } else {
                    r11 = 0;
                }
                if (r10.f41477e.t(iW) > 0) {
                    r12 = 0;
                } else {
                    r12 = 0;
                }
                if (spanEnd > r10.f41477e.v(iW)) {
                    r14 = r13;
                } else {
                    r14 = 0;
                }
                if (r12 != 0) {
                    jVar = null;
                } else {
                    jVar = null;
                }
                arrayList.add(jVar);
            }
            listEmptyList = arrayList;
        }
        r10.f41479g = listEmptyList;
    }

    private c(String str, y3 y3Var, List<? extends f.e<? extends f.a>> list, List<f.e<v0>> list2, int i10, int i11, long j10, androidx.compose.ui.text.font.y.b bVar, androidx.compose.ui.unit.d dVar) {
        this(new androidx.compose.ui.text.platform.h(str, y3Var, list, list2, bVar, dVar), i10, i11, j10, null);
    }
}
