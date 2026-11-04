package androidx.media2.exoplayer.external.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.c;
import androidx.media2.exoplayer.external.text.e;
import androidx.media2.exoplayer.external.text.g;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.x;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends c {
    private static final int A = 8;
    private static final int B = 2;
    private static final int C = 2;
    private static final int D = 12;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 4;
    private static final int H = 16711680;
    private static final int I = 0;
    private static final int J = 0;
    private static final int K = -1;
    private static final String L = "sans-serif";
    private static final float M = 0.85f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final char f56916v = 65279;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final char f56917w = 65534;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f56918x = 1937013100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f56919y = 1952608120;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f56920z = "Serif";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x f56921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f56922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f56923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f56924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f56925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f56926t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f56927u;

    public a(List<byte[]> initializationData) {
        super("Tx3gDecoder");
        this.f56921o = new x();
        if (initializationData == null || initializationData.size() != 1 || (initializationData.get(0).length != 48 && initializationData.get(0).length != 53)) {
            this.f56923q = 0;
            this.f56924r = -1;
            this.f56925s = "sans-serif";
            this.f56922p = false;
            this.f56926t = 0.85f;
            return;
        }
        byte[] bArr = initializationData.get(0);
        this.f56923q = bArr[24];
        this.f56924r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f56925s = f56920z.equals(q0.D(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * com.google.common.base.c.f116471x;
        this.f56927u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f56922p = z10;
        if (!z10) {
            this.f56926t = 0.85f;
            return;
        }
        float f10 = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10;
        this.f56926t = f10;
        this.f56926t = q0.q(f10, 0.0f, 0.95f);
    }

    private void B(x parsableByteArray, SpannableStringBuilder cueText) throws g {
        C(parsableByteArray.a() >= 12);
        int iJ = parsableByteArray.J();
        int iJ2 = parsableByteArray.J();
        parsableByteArray.R(2);
        int iD = parsableByteArray.D();
        parsableByteArray.R(1);
        int iL = parsableByteArray.l();
        E(cueText, iD, this.f56923q, iJ, iJ2, 0);
        D(cueText, iL, this.f56924r, iJ, iJ2, 0);
    }

    private static void C(boolean checkValue) throws g {
        if (!checkValue) {
            throw new g("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder cueText, int colorRgba, int defaultColorRgba, int start, int end, int spanPriority) {
        if (colorRgba != defaultColorRgba) {
            cueText.setSpan(new ForegroundColorSpan((colorRgba >>> 8) | ((colorRgba & 255) << 24)), start, end, spanPriority | 33);
        }
    }

    private static void E(SpannableStringBuilder cueText, int fontFace, int defaultFontFace, int start, int end, int spanPriority) {
        if (fontFace != defaultFontFace) {
            int i10 = spanPriority | 33;
            boolean z10 = true;
            boolean z11 = (fontFace & 1) != 0;
            boolean z12 = (fontFace & 2) != 0;
            if (z11) {
                if (z12) {
                    cueText.setSpan(new StyleSpan(3), start, end, i10);
                } else {
                    cueText.setSpan(new StyleSpan(1), start, end, i10);
                }
            } else if (z12) {
                cueText.setSpan(new StyleSpan(2), start, end, i10);
            }
            if ((fontFace & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                cueText.setSpan(new UnderlineSpan(), start, end, i10);
            }
            if (z10 || z11 || z12) {
                return;
            }
            cueText.setSpan(new StyleSpan(0), start, end, i10);
        }
    }

    private static void F(SpannableStringBuilder cueText, String fontFamily, String defaultFontFamily, int start, int end, int spanPriority) {
        if (fontFamily != defaultFontFamily) {
            cueText.setSpan(new TypefaceSpan(fontFamily), start, end, spanPriority | 33);
        }
    }

    private static String G(x parsableByteArray) throws g {
        char cE;
        C(parsableByteArray.a() >= 2);
        int iJ = parsableByteArray.J();
        if (iJ == 0) {
            return "";
        }
        return (parsableByteArray.a() < 2 || !((cE = parsableByteArray.e()) == 65279 || cE == 65534)) ? parsableByteArray.B(iJ, Charset.forName("UTF-8")) : parsableByteArray.B(iJ, Charset.forName("UTF-16"));
    }

    @Override // androidx.media2.exoplayer.external.text.c
    protected e y(byte[] bArr, int i10, boolean z10) throws g {
        this.f56921o.O(bArr, i10);
        String strG = G(this.f56921o);
        if (strG.isEmpty()) {
            return b.f56928b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strG);
        E(spannableStringBuilder, this.f56923q, 0, 0, spannableStringBuilder.length(), H);
        D(spannableStringBuilder, this.f56924r, -1, 0, spannableStringBuilder.length(), H);
        F(spannableStringBuilder, this.f56925s, "sans-serif", 0, spannableStringBuilder.length(), H);
        float fQ = this.f56926t;
        while (this.f56921o.a() >= 8) {
            int iC = this.f56921o.c();
            int iL = this.f56921o.l();
            int iL2 = this.f56921o.l();
            boolean z11 = true;
            if (iL2 == f56918x) {
                if (this.f56921o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                int iJ = this.f56921o.J();
                for (int i11 = 0; i11 < iJ; i11++) {
                    B(this.f56921o, spannableStringBuilder);
                }
            } else if (iL2 == f56919y && this.f56922p) {
                C(this.f56921o.a() >= 2);
                fQ = q0.q(this.f56921o.J() / this.f56927u, 0.0f, 0.95f);
            }
            this.f56921o.Q(iC + iL);
        }
        return new b(new androidx.media2.exoplayer.external.text.b(spannableStringBuilder, null, fQ, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
