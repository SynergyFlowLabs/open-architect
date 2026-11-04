package w0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.x;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLineHeightStyleSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,157:1\n81#2,4:158\n*S KotlinDebug\n*F\n+ 1 LineHeightStyleSpan.android.kt\nandroidx/compose/ui/text/android/style/LineHeightStyleSpan\n*L\n68#1:158,4\n*E\n"})
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f385829n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f385830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f385831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f385832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f385833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f385834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f385835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f385836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f385837h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f385838i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f385839j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f385840k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f385841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f385842m;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, @x(from = -1.0d, to = 1.0d) float f11, boolean z12) {
        this.f385830a = f10;
        this.f385831b = i10;
        this.f385832c = i11;
        this.f385833d = z10;
        this.f385834e = z11;
        this.f385835f = f11;
        this.f385836g = z12;
        if ((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
            return;
        }
        x0.a.g("topRatio should be in [0..1] range or -1");
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iA = i.a(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.f385830a);
        int i10 = iCeil - iA;
        if (this.f385836g && i10 <= 0) {
            int i11 = fontMetricsInt.ascent;
            this.f385838i = i11;
            int i12 = fontMetricsInt.descent;
            this.f385839j = i12;
            this.f385837h = i11;
            this.f385840k = i12;
            this.f385841l = 0;
            this.f385842m = 0;
            return;
        }
        float fAbs = this.f385835f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (i10 <= 0 ? Math.ceil(i10 * fAbs) : Math.ceil(i10 * (1.0f - fAbs)));
        int i13 = fontMetricsInt.descent;
        int i14 = iCeil2 + i13;
        this.f385839j = i14;
        int i15 = i14 - iCeil;
        this.f385838i = i15;
        if (this.f385833d) {
            i15 = fontMetricsInt.ascent;
        }
        this.f385837h = i15;
        if (this.f385834e) {
            i14 = i13;
        }
        this.f385840k = i14;
        this.f385841l = fontMetricsInt.ascent - i15;
        this.f385842m = i14 - i13;
    }

    public static /* synthetic */ h c(h hVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = hVar.f385833d;
        }
        return hVar.b(i10, i11, z10);
    }

    @NotNull
    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f385830a, i10, i11, z10, this.f385834e, this.f385835f, this.f385836g);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence charSequence, int i10, int i11, int i12, int i13, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f385831b;
        boolean z11 = i11 == this.f385832c;
        if (z10 && z11 && this.f385833d && this.f385834e) {
            return;
        }
        if (this.f385837h == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f385837h : this.f385838i;
        fontMetricsInt.descent = z11 ? this.f385840k : this.f385839j;
    }

    public final int d() {
        return this.f385841l;
    }

    public final int e() {
        return this.f385842m;
    }

    public final float f() {
        return this.f385830a;
    }

    public final boolean g() {
        return this.f385834e;
    }
}
