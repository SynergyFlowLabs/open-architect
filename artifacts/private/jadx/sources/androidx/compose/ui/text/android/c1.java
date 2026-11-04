package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nStaticLayoutFactory.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,358:1\n118#2,4:359\n118#2,4:363\n118#2,4:367\n118#2,4:371\n118#2,4:375\n118#2,4:379\n*S KotlinDebug\n*F\n+ 1 StaticLayoutFactory.android.kt\nandroidx/compose/ui/text/android/StaticLayoutParams\n*L\n143#1:359,4\n144#1:363,4\n145#1:367,4\n146#1:371,4\n147#1:375,4\n148#1:379,4\n*E\n"})
final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f41330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextPaint f41333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final TextDirectionHeuristic f41335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Layout.Alignment f41336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final TextUtils.TruncateAt f41338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f41339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f41340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f41341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f41342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f41343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f41344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f41345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f41346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f41347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f41348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private final int[] f41349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    private final int[] f41350u;

    public c1(@NotNull CharSequence charSequence, int i10, int i11, @NotNull TextPaint textPaint, int i12, @NotNull TextDirectionHeuristic textDirectionHeuristic, @NotNull Layout.Alignment alignment, int i13, @Nullable TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, @Nullable int[] iArr, @Nullable int[] iArr2) {
        this.f41330a = charSequence;
        this.f41331b = i10;
        this.f41332c = i11;
        this.f41333d = textPaint;
        this.f41334e = i12;
        this.f41335f = textDirectionHeuristic;
        this.f41336g = alignment;
        this.f41337h = i13;
        this.f41338i = truncateAt;
        this.f41339j = i14;
        this.f41340k = f10;
        this.f41341l = f11;
        this.f41342m = i15;
        this.f41343n = z10;
        this.f41344o = z11;
        this.f41345p = i16;
        this.f41346q = i17;
        this.f41347r = i18;
        this.f41348s = i19;
        this.f41349t = iArr;
        this.f41350u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            x0.a.e("invalid start value");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            x0.a.e("invalid end value");
        }
        if (!(i13 >= 0)) {
            x0.a.e("invalid maxLines value");
        }
        if (!(i12 >= 0)) {
            x0.a.e("invalid width value");
        }
        if (!(i14 >= 0)) {
            x0.a.e("invalid ellipsizedWidth value");
        }
        if (f10 >= 0.0f) {
            return;
        }
        x0.a.e("invalid lineSpacingMultiplier value");
    }

    @NotNull
    public final Layout.Alignment a() {
        return this.f41336g;
    }

    public final int b() {
        return this.f41345p;
    }

    @Nullable
    public final TextUtils.TruncateAt c() {
        return this.f41338i;
    }

    public final int d() {
        return this.f41339j;
    }

    public final int e() {
        return this.f41332c;
    }

    public final int f() {
        return this.f41348s;
    }

    public final boolean g() {
        return this.f41343n;
    }

    public final int h() {
        return this.f41342m;
    }

    @Nullable
    public final int[] i() {
        return this.f41349t;
    }

    public final int j() {
        return this.f41346q;
    }

    public final int k() {
        return this.f41347r;
    }

    public final float l() {
        return this.f41341l;
    }

    public final float m() {
        return this.f41340k;
    }

    public final int n() {
        return this.f41337h;
    }

    @NotNull
    public final TextPaint o() {
        return this.f41333d;
    }

    @Nullable
    public final int[] p() {
        return this.f41350u;
    }

    public final int q() {
        return this.f41331b;
    }

    @NotNull
    public final CharSequence r() {
        return this.f41330a;
    }

    @NotNull
    public final TextDirectionHeuristic s() {
        return this.f41335f;
    }

    public final boolean t() {
        return this.f41344o;
    }

    public final int u() {
        return this.f41334e;
    }

    public /* synthetic */ c1(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i20 & 2) != 0 ? 0 : i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2);
    }
}
