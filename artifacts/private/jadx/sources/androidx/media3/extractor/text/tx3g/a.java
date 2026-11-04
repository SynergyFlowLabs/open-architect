package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.o;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.d;
import androidx.media3.extractor.text.r;
import com.google.common.base.c;
import com.google.common.collect.l6;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f68792h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f68793i = "Tx3gParser";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68794j = 1937013100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68795k = 1952608120;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f68796l = "Serif";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f68797m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68798n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68799o = 12;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68800p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68801q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68802r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f68803s = 16711680;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f68804t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f68805u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f68806v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f68807w = "sans-serif";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f68808x = 0.85f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f68809a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f68810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f68811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f68812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f68813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f68814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f68815g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f68811c = 0;
            this.f68812d = -1;
            this.f68813e = "sans-serif";
            this.f68810b = false;
            this.f68814f = 0.85f;
            this.f68815g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f68811c = bArr[24];
        this.f68812d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f68813e = f68796l.equals(k1.U(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * c.f116471x;
        this.f68815g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f68810b = z10;
        if (z10) {
            this.f68814f = k1.v(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f68814f = 0.85f;
        }
    }

    private void e(o0 o0Var, SpannableStringBuilder spannableStringBuilder) {
        androidx.media3.common.util.a.a(o0Var.a() >= 12);
        int iT = o0Var.T();
        int iT2 = o0Var.T();
        int i10 = 5 ^ 2;
        o0Var.b0(2);
        int iL = o0Var.L();
        o0Var.b0(1);
        int iS = o0Var.s();
        if (iT2 > spannableStringBuilder.length()) {
            z.n(f68793i, "Truncating styl end (" + iT2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iT2 = spannableStringBuilder.length();
        }
        int i11 = iT2;
        if (iT < i11) {
            g(spannableStringBuilder, iL, this.f68811c, iT, i11, 0);
            f(spannableStringBuilder, iS, this.f68812d, iT, i11, 0);
            return;
        }
        z.n(f68793i, "Ignoring styl with start (" + iT + ") >= end (" + i11 + ").");
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String i(o0 o0Var) {
        androidx.media3.common.util.a.a(o0Var.a() >= 2);
        int iT = o0Var.T();
        if (iT == 0) {
            return "";
        }
        int iF = o0Var.f();
        Charset charsetV = o0Var.V();
        int iF2 = iT - (o0Var.f() - iF);
        if (charsetV == null) {
            charsetV = StandardCharsets.UTF_8;
        }
        return o0Var.J(iF2, charsetV);
    }

    @Override // androidx.media3.extractor.text.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, o<d> oVar) {
        this.f68809a.Y(bArr, i11 + i10);
        this.f68809a.a0(i10);
        String strI = i(this.f68809a);
        if (strI.isEmpty()) {
            oVar.accept(new d(l6.F(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strI);
        g(spannableStringBuilder, this.f68811c, 0, 0, spannableStringBuilder.length(), f68803s);
        f(spannableStringBuilder, this.f68812d, -1, 0, spannableStringBuilder.length(), f68803s);
        h(spannableStringBuilder, this.f68813e, 0, spannableStringBuilder.length());
        float fV = this.f68814f;
        while (this.f68809a.a() >= 8) {
            int iF = this.f68809a.f();
            int iS = this.f68809a.s();
            int iS2 = this.f68809a.s();
            if (iS2 == f68794j) {
                androidx.media3.common.util.a.a(this.f68809a.a() >= 2);
                int iT = this.f68809a.T();
                for (int i12 = 0; i12 < iT; i12++) {
                    e(this.f68809a, spannableStringBuilder);
                }
            } else if (iS2 == f68795k && this.f68810b) {
                androidx.media3.common.util.a.a(this.f68809a.a() >= 2);
                fV = k1.v(this.f68809a.T() / this.f68815g, 0.0f, 0.95f);
            }
            this.f68809a.a0(iF + iS);
        }
        oVar.accept(new d(l6.G(new androidx.media3.common.text.a.c().A(spannableStringBuilder).t(fV, 0).u(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // androidx.media3.extractor.text.r
    public int b() {
        return 2;
    }
}
