package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.l1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1124:1\n1#2:1125\n118#3,4:1126\n118#3,4:1130\n118#3,4:1134\n118#3,4:1138\n118#3,4:1142\n118#3,4:1146\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n*L\n604#1:1126,4\n671#1:1130,4\n672#1:1134,4\n675#1:1138,4\n678#1:1142,4\n685#1:1146,4\n*E\n"})
public final class f1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f41372t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final TextPaint f41373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final TextUtils.TruncateAt f41374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final g0 f41377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f41378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.android.selection.h f41379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Layout f41380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f41382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f41383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f41384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f41385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f41386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final Paint.FontMetricsInt f41387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f41388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private final w0.h[] f41389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Rect f41390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private d0 f41391s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public f1(@NotNull CharSequence charSequence, float f10, @NotNull TextPaint textPaint, int i10, @Nullable TextUtils.TruncateAt truncateAt, int i11, float f11, @androidx.annotation.t0 float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull g0 g0Var) {
        int i18;
        boolean z12;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        TextPaint textPaint2;
        this.f41373a = textPaint;
        this.f41374b = truncateAt;
        this.f41375c = z10;
        this.f41376d = z11;
        this.f41377e = g0Var;
        this.f41390r = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = h1.k(i11);
        Layout.Alignment alignmentA = d1.f41362a.a(i10);
        boolean z13 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, w0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        boolean z14 = z13;
        try {
            BoringLayout.Metrics metricsE = g0Var.e();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsE == null || g0Var.i() > f10 || z14) {
                this.f41386n = false;
                i18 = i12;
                z12 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                layoutA = y0.f41451a.a(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentA, i18, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
                textPaint2 = textPaint;
            } else {
                this.f41386n = true;
                textPaint2 = textPaint;
                i18 = i12;
                layoutA = k.f41407a.a(charSequence, textPaint, iCeil, metricsE, alignmentA, z10, z11, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicK;
                z12 = false;
            }
            this.f41380h = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i18);
            this.f41381i = iMin;
            int i19 = iMin - 1;
            this.f41378f = (iMin >= i18 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length())) ? true : z12;
            long jL = h1.l(this);
            w0.h[] hVarArrJ = h1.j(this);
            this.f41389q = hVarArrJ;
            long jI = hVarArrJ != null ? h1.i(hVarArrJ) : h1.f41403b;
            this.f41382j = Math.max(i1.f(jL), i1.f(jI));
            this.f41383k = Math.max(i1.e(jL), i1.e(jI));
            Paint.FontMetricsInt fontMetricsIntH = h1.h(this, textPaint2, textDirectionHeuristic, hVarArrJ);
            this.f41388p = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) y(i19)) : z12;
            this.f41387o = fontMetricsIntH;
            this.f41384l = w0.d.b(layoutA, i19, null, 2, null);
            this.f41385m = w0.d.d(layoutA, i19, null, 2, null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float K(f1 f1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f1Var.J(i10, z10);
    }

    public static /* synthetic */ float N(f1 f1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f1Var.M(i10, z10);
    }

    @l1
    public static /* synthetic */ void S() {
    }

    @l1
    public static /* synthetic */ void d() {
    }

    private final float i(int i10) {
        if (i10 == this.f41381i - 1) {
            return this.f41384l + this.f41385m;
        }
        return 0.0f;
    }

    @l1
    public static /* synthetic */ void l() {
    }

    private final d0 m() {
        d0 d0Var = this.f41391s;
        if (d0Var != null) {
            Intrinsics.checkNotNull(d0Var);
            return d0Var;
        }
        d0 d0Var2 = new d0(this.f41380h);
        this.f41391s = d0Var2;
        return d0Var2;
    }

    public final float A(int i10) {
        return this.f41380h.getLineRight(i10) + (i10 == this.f41381i + (-1) ? this.f41385m : 0.0f);
    }

    public final int B(int i10) {
        return this.f41380h.getLineStart(i10);
    }

    public final float C(int i10) {
        return this.f41380h.getLineTop(i10) + (i10 == 0 ? 0 : this.f41382j);
    }

    public final int D(int i10) {
        return (h1.m(this.f41380h, i10) && this.f41374b == TextUtils.TruncateAt.END) ? this.f41380h.getLineStart(i10) + this.f41380h.getEllipsisStart(i10) : m().f(i10);
    }

    public final float E(int i10) {
        return this.f41380h.getLineWidth(i10);
    }

    public final float F() {
        return this.f41377e.i();
    }

    public final float G() {
        return this.f41377e.j();
    }

    public final int H(int i10, float f10) {
        return this.f41380h.getOffsetForHorizontal(i10, f10 + ((-1) * i(i10)));
    }

    public final int I(int i10) {
        return this.f41380h.getParagraphDirection(i10);
    }

    public final float J(int i10, boolean z10) {
        return m().c(i10, true, z10) + i(w(i10));
    }

    @Nullable
    public final int[] L(@NotNull RectF rectF, int i10, @NotNull Function2<? super RectF, ? super RectF, Boolean> function2) {
        return Build.VERSION.SDK_INT >= 34 ? f.f41370a.c(this, rectF, i10, function2) : g1.d(this, this.f41380h, m(), rectF, i10, function2);
    }

    public final float M(int i10, boolean z10) {
        return m().c(i10, false, z10) + i(w(i10));
    }

    public final void O(int i10, int i11, @NotNull Path path) {
        this.f41380h.getSelectionPath(i10, i11, path);
        if (this.f41382j != 0 && !path.isEmpty()) {
            path.offset(0.0f, this.f41382j);
        }
    }

    @NotNull
    public final CharSequence P() {
        return this.f41380h.getText();
    }

    @NotNull
    public final TextPaint Q() {
        return this.f41373a;
    }

    public final int R() {
        return this.f41382j;
    }

    @NotNull
    public final androidx.compose.ui.text.android.selection.h T() {
        androidx.compose.ui.text.android.selection.h hVar = this.f41379g;
        if (hVar != null) {
            return hVar;
        }
        androidx.compose.ui.text.android.selection.h hVar2 = new androidx.compose.ui.text.android.selection.h(this.f41380h.getText(), 0, this.f41380h.getText().length(), this.f41373a.getTextLocale());
        this.f41379g = hVar2;
        return hVar2;
    }

    public final boolean U() {
        if (this.f41386n) {
            k kVar = k.f41407a;
            Layout layout = this.f41380h;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return kVar.c((BoringLayout) layout);
        }
        y0 y0Var = y0.f41451a;
        Layout layout2 = this.f41380h;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return y0Var.c((StaticLayout) layout2, this.f41376d);
    }

    public final boolean V(int i10) {
        return h1.m(this.f41380h, i10);
    }

    public final boolean W(int i10) {
        return this.f41380h.isRtlCharAt(i10);
    }

    public final void X(@NotNull Canvas canvas) {
        if (canvas.getClipBounds(this.f41390r)) {
            int i10 = this.f41382j;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            e1 e1Var = h1.f41402a;
            e1Var.a(canvas);
            this.f41380h.draw(e1Var);
            int i11 = this.f41382j;
            if (i11 != 0) {
                int i12 = 3 ^ (-1);
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i10, int i11, @NotNull float[] fArr, int i12) {
        float fE;
        float f10;
        int length = P().length();
        if (!(i10 >= 0)) {
            x0.a.e("startOffset must be > 0");
        }
        if (!(i10 < length)) {
            x0.a.e("startOffset must be less than text length");
        }
        if (!(i11 > i10)) {
            x0.a.e("endOffset must be greater than startOffset");
        }
        if (!(i11 <= length)) {
            x0.a.e("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            x0.a.e("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iW = w(i10);
        int iW2 = w(i11 - 1);
        y yVar = new y(this);
        if (iW > iW2) {
            return;
        }
        int i13 = iW;
        int i14 = i12;
        while (true) {
            int iB = B(i13);
            int iV = v(i13);
            int iMin = Math.min(i11, iV);
            float fC = C(i13);
            float fQ = q(i13);
            boolean z10 = I(i13) == 1;
            for (int iMax = Math.max(i10, iB); iMax < iMin; iMax++) {
                boolean zW = W(iMax);
                if (z10 && !zW) {
                    fE = yVar.c(iMax);
                    f10 = yVar.d(iMax + 1);
                } else if (z10 && zW) {
                    f10 = yVar.e(iMax);
                    fE = yVar.f(iMax + 1);
                } else if (z10 || !zW) {
                    fE = yVar.e(iMax);
                    f10 = yVar.f(iMax + 1);
                } else {
                    f10 = yVar.c(iMax);
                    fE = yVar.d(iMax + 1);
                }
                fArr[i14] = fE;
                fArr[i14 + 1] = fC;
                fArr[i14 + 2] = f10;
                fArr[i14 + 3] = fQ;
                i14 += 4;
            }
            if (i13 == iW2) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void b(int i10, @NotNull float[] fArr) {
        float fE;
        float f10;
        int iB = B(i10);
        int iV = v(i10);
        int i11 = 0;
        boolean z10 = true;
        if (!(fArr.length >= (iV - iB) * 2)) {
            x0.a.e("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        y yVar = new y(this);
        if (I(i10) != 1) {
            z10 = false;
        }
        while (iB < iV) {
            boolean zW = W(iB);
            if (z10 && !zW) {
                fE = yVar.c(iB);
                f10 = yVar.d(iB + 1);
            } else if (z10 && zW) {
                f10 = yVar.e(iB);
                fE = yVar.f(iB + 1);
            } else if (zW) {
                f10 = yVar.c(iB);
                fE = yVar.d(iB + 1);
            } else {
                fE = yVar.e(iB);
                f10 = yVar.f(iB + 1);
            }
            fArr[i11] = fE;
            fArr[i11 + 1] = f10;
            i11 += 2;
            iB++;
        }
    }

    public final int c() {
        return this.f41383k;
    }

    @NotNull
    public final RectF e(int i10) {
        float fM;
        float fM2;
        float fJ;
        float fJ2;
        int iW = w(i10);
        float fC = C(iW);
        float fQ = q(iW);
        boolean z10 = I(iW) == 1;
        boolean zIsRtlCharAt = this.f41380h.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fJ = M(i10, false);
                fJ2 = M(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = J(i10, false);
                fJ2 = J(i10 + 1, true);
            } else {
                fM = M(i10, false);
                fM2 = M(i10 + 1, true);
            }
            float f10 = fJ;
            fM = fJ2;
            fM2 = f10;
        } else {
            fM = J(i10, false);
            fM2 = J(i10 + 1, true);
        }
        return new RectF(fM, fC, fM2, fQ);
    }

    public final boolean f() {
        return this.f41378f;
    }

    public final boolean g() {
        return this.f41376d;
    }

    public final int h() {
        return (this.f41378f ? this.f41380h.getLineBottom(this.f41381i - 1) : this.f41380h.getHeight()) + this.f41382j + this.f41383k + this.f41388p;
    }

    public final boolean j() {
        return this.f41375c;
    }

    @NotNull
    public final Layout k() {
        return this.f41380h;
    }

    @NotNull
    public final g0 n() {
        return this.f41377e;
    }

    public final float o(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i10 != this.f41381i + (-1) || (fontMetricsInt = this.f41387o) == null) ? this.f41380h.getLineAscent(i10) : fontMetricsInt.ascent;
    }

    public final float p(int i10) {
        return this.f41382j + ((i10 != this.f41381i + (-1) || this.f41387o == null) ? this.f41380h.getLineBaseline(i10) : C(i10) - this.f41387o.ascent);
    }

    public final float q(int i10) {
        if (i10 != this.f41381i - 1 || this.f41387o == null) {
            return this.f41382j + this.f41380h.getLineBottom(i10) + (i10 == this.f41381i + (-1) ? this.f41383k : 0);
        }
        return this.f41380h.getLineBottom(i10 - 1) + this.f41387o.bottom;
    }

    public final int r() {
        return this.f41381i;
    }

    public final float s(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i10 != this.f41381i + (-1) || (fontMetricsInt = this.f41387o) == null) ? this.f41380h.getLineDescent(i10) : fontMetricsInt.descent;
    }

    public final int t(int i10) {
        return this.f41380h.getEllipsisCount(i10);
    }

    public final int u(int i10) {
        return this.f41380h.getEllipsisStart(i10);
    }

    public final int v(int i10) {
        return (h1.m(this.f41380h, i10) && this.f41374b == TextUtils.TruncateAt.END) ? this.f41380h.getText().length() : this.f41380h.getLineEnd(i10);
    }

    public final int w(int i10) {
        return this.f41380h.getLineForOffset(i10);
    }

    public final int x(int i10) {
        return this.f41380h.getLineForVertical(i10 - this.f41382j);
    }

    public final float y(int i10) {
        return q(i10) - C(i10);
    }

    public final float z(int i10) {
        return this.f41380h.getLineLeft(i10) + (i10 == this.f41381i + (-1) ? this.f41384l : 0.0f);
    }

    public /* synthetic */ f1(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, g0 g0Var, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        g0 g0Var2;
        int i19 = (i18 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i18 & 16) != 0 ? null : truncateAt;
        int i20 = (i18 & 32) != 0 ? 2 : i11;
        float f13 = (i18 & 64) != 0 ? 1.0f : f11;
        float f14 = (i18 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i18 & 256) != 0 ? false : z10;
        boolean z13 = (i18 & 512) != 0 ? true : z11;
        int i21 = (i18 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i22 = (i18 & 2048) != 0 ? 0 : i13;
        int i23 = (i18 & 4096) != 0 ? 0 : i14;
        int i24 = (i18 & 8192) != 0 ? 0 : i15;
        int i25 = (i18 & 16384) != 0 ? 0 : i16;
        int i26 = (32768 & i18) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i18) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i18) != 0 ? null : iArr2;
        if ((i18 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            g0Var2 = new g0(charSequence2, textPaint2, i20);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            g0Var2 = g0Var;
        }
        this(charSequence2, f10, textPaint2, i19, truncateAt2, i20, f13, f14, z12, z13, i21, i22, i23, i24, i25, i26, iArr3, iArr4, g0Var2);
    }
}
