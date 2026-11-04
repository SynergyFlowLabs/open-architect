package androidx.media2.exoplayer.external.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.b1;
import androidx.compose.runtime.m0;
import androidx.media2.exoplayer.external.text.i;
import androidx.media2.exoplayer.external.text.j;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.x;
import com.rabbitmq.client.impl.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a extends e {
    private static final int A = 2;
    private static final int B = 1;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 0;
    private static final int F = 1;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 3;
    private static final int N = 7;
    private static final int O = 8;
    private static final int P = 4;
    private static final byte Q = -4;
    private static final byte R = 32;
    private static final byte S = 33;
    private static final byte T = 36;
    private static final byte U = 37;
    private static final byte V = 38;
    private static final byte W = 39;
    private static final byte X = 41;
    private static final byte Y = 42;
    private static final byte Z = 43;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final byte f56559a0 = 44;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final byte f56560b0 = 45;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final byte f56561c0 = 46;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte f56562d0 = 47;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f56568y = "Cea608Decoder";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f56569z = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f56571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f56572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f56573l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<androidx.media2.exoplayer.external.text.b> f56576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<androidx.media2.exoplayer.external.text.b> f56577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f56578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f56579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f56580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f56581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f56582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f56583v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f56585x;
    private static final int[] K = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] L = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] M = {-1, -16711936, -16776961, -16711681, l1.a.f316127c, -256, -65281};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int[] f56563e0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, com.planner5d.library.engine.input.f.b.M1, 250, 97, 98, 99, 100, 101, 102, com.planner5d.library.engine.input.f.b.f160733u1, 104, 105, com.planner5d.library.engine.input.f.b.f160742x1, com.planner5d.library.engine.input.f.b.f160745y1, 108, 109, 110, k.b.p.f265340a, com.planner5d.library.engine.input.f.b.B, 113, 114, 115, androidx.media3.extractor.metadata.dvbsi.b.f67479d, me.relex.circleindicator.a.f332619e, 118, 119, 120, 121, 122, 231, com.planner5d.library.engine.input.f.b.Q1, 209, 241, 9632};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int[] f56564f0 = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, com.planner5d.library.engine.input.f.b.U1};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int[] f56565g0 = {193, 201, 211, 218, 220, com.planner5d.library.engine.input.f.b.V1, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, m0.f36245r, 239, 212, 217, com.planner5d.library.engine.input.f.b.S1, 219, 171, 187};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int[] f56566h0 = {195, 227, 205, 204, 236, 210, 242, 213, com.planner5d.library.engine.input.f.b.O1, 123, 125, 92, 94, 95, 124, okhttp3.internal.ws.g.f334652s, 196, 228, 214, com.planner5d.library.engine.input.f.b.P1, 223, 165, 164, 9474, 197, 229, 216, com.planner5d.library.engine.input.f.b.R1, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final boolean[] f56567i0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f56570i = new x();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<C0523a> f56574m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0523a f56575n = new C0523a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f56584w = 0;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.cea.a$a, reason: collision with other inner class name */
    private static class C0523a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f56586i = 32;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f56587j = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0524a> f56588a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f56589b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f56590c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f56591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f56592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f56593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f56594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f56595h;

        /* JADX INFO: renamed from: androidx.media2.exoplayer.external.text.cea.a$a$a, reason: collision with other inner class name */
        private static class C0524a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f56596a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f56597b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f56598c;

            public C0524a(int style, boolean underline, int start) {
                this.f56596a = style;
                this.f56597b = underline;
                this.f56598c = start;
            }
        }

        public C0523a(int captionMode, int captionRowCount) {
            j(captionMode);
            m(captionRowCount);
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f56590c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f56588a.size()) {
                C0524a c0524a = this.f56588a.get(i14);
                boolean z11 = c0524a.f56597b;
                int i16 = c0524a.f56596a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.M[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0524a.f56598c;
                i14++;
                if (i17 != (i14 < this.f56588a.size() ? this.f56588a.get(i14).f56598c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder builder, int start, int end, int color) {
            if (color == -1) {
                return;
            }
            builder.setSpan(new ForegroundColorSpan(color), start, end, 33);
        }

        private static void o(SpannableStringBuilder builder, int start, int end) {
            builder.setSpan(new StyleSpan(2), start, end, 33);
        }

        private static void q(SpannableStringBuilder builder, int start, int end) {
            builder.setSpan(new UnderlineSpan(), start, end, 33);
        }

        public void e(char text) {
            this.f56590c.append(text);
        }

        public void f() {
            int length = this.f56590c.length();
            if (length > 0) {
                this.f56590c.delete(length - 1, length);
                for (int size = this.f56588a.size() - 1; size >= 0; size--) {
                    C0524a c0524a = this.f56588a.get(size);
                    int i10 = c0524a.f56598c;
                    if (i10 != length) {
                        break;
                    }
                    c0524a.f56598c = i10 - 1;
                }
            }
        }

        public androidx.media2.exoplayer.external.text.b g(int forcedPositionAnchor) {
            float f10;
            int i10;
            int i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i12 = 0; i12 < this.f56589b.size(); i12++) {
                spannableStringBuilder.append((CharSequence) this.f56589b.get(i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i13 = this.f56592e + this.f56593f;
            int length = (32 - i13) - spannableStringBuilder.length();
            int i14 = i13 - length;
            if (forcedPositionAnchor == Integer.MIN_VALUE) {
                forcedPositionAnchor = (this.f56594g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f56594g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (forcedPositionAnchor != 1) {
                if (forcedPositionAnchor == 2) {
                    i13 = 32 - length;
                }
                f10 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            if (this.f56594g == 1 || (i10 = this.f56591d) > 7) {
                i10 = this.f56591d - 17;
                i11 = 2;
            } else {
                i11 = 0;
            }
            return new androidx.media2.exoplayer.external.text.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i10, 1, i11, f10, forcedPositionAnchor, Float.MIN_VALUE);
        }

        public boolean i() {
            return this.f56588a.isEmpty() && this.f56589b.isEmpty() && this.f56590c.length() == 0;
        }

        public void j(int captionMode) {
            this.f56594g = captionMode;
            this.f56588a.clear();
            this.f56589b.clear();
            this.f56590c.setLength(0);
            this.f56591d = 15;
            this.f56592e = 0;
            this.f56593f = 0;
        }

        public void k() {
            this.f56589b.add(h());
            this.f56590c.setLength(0);
            this.f56588a.clear();
            int iMin = Math.min(this.f56595h, this.f56591d);
            while (this.f56589b.size() >= iMin) {
                this.f56589b.remove(0);
            }
        }

        public void l(int captionMode) {
            this.f56594g = captionMode;
        }

        public void m(int captionRowCount) {
            this.f56595h = captionRowCount;
        }

        public void p(int style, boolean underline) {
            this.f56588a.add(new C0524a(style, underline, this.f56590c.length()));
        }
    }

    public a(String mimeType, int accessibilityChannel) {
        this.f56571j = "application/x-mp4-cea-608".equals(mimeType) ? 2 : 3;
        if (accessibilityChannel == 1) {
            this.f56573l = 0;
            this.f56572k = 0;
        } else if (accessibilityChannel == 2) {
            this.f56573l = 1;
            this.f56572k = 0;
        } else if (accessibilityChannel == 3) {
            this.f56573l = 0;
            this.f56572k = 1;
        } else if (accessibilityChannel != 4) {
            p.l(f56568y, "Invalid channel. Defaulting to CC1.");
            this.f56573l = 0;
            this.f56572k = 0;
        } else {
            this.f56573l = 1;
            this.f56572k = 1;
        }
        K(0);
        J();
        this.f56585x = true;
    }

    private static boolean A(byte cc1, byte cc2) {
        return (cc1 & 246) == 20 && (cc2 & 240) == 32;
    }

    private static boolean B(byte cc1, byte cc2) {
        return (cc1 & 240) == 16 && (cc2 & h.a.f339269e) == 64;
    }

    private static boolean C(byte cc1) {
        if ((cc1 & 240) != 16) {
            return false;
        }
        int i10 = 5 << 1;
        return true;
    }

    private boolean D(boolean captionValid, byte cc1, byte cc2) {
        if (!captionValid || !C(cc1)) {
            this.f56581t = false;
        } else {
            if (this.f56581t && this.f56582u == cc1 && this.f56583v == cc2) {
                this.f56581t = false;
                return true;
            }
            this.f56581t = true;
            this.f56582u = cc1;
            this.f56583v = cc2;
        }
        return false;
    }

    private static boolean E(byte cc1) {
        return (cc1 & 247) == 20;
    }

    private static boolean F(byte cc1, byte cc2) {
        return (cc1 & 247) == 17 && (cc2 & 240) == 48;
    }

    private static boolean G(byte cc1, byte cc2) {
        return (cc1 & 247) == 23 && cc2 >= 33 && cc2 <= 35;
    }

    private static boolean H(byte cc1) {
        return 1 <= cc1 && cc1 <= 15;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027 A[FALL_THROUGH] */
    private void I(byte cc1, byte cc2) {
        if (H(cc1)) {
            this.f56585x = false;
            return;
        }
        if (E(cc1)) {
            if (cc2 != 32 && cc2 != 47) {
                switch (cc2) {
                    default:
                        switch (cc2) {
                            case 42:
                            case 43:
                                this.f56585x = false;
                                break;
                        }
                    case 37:
                    case 38:
                    case 39:
                        this.f56585x = true;
                        break;
                }
                return;
            }
            this.f56585x = true;
        }
    }

    private void J() {
        this.f56575n.j(this.f56578q);
        this.f56574m.clear();
        this.f56574m.add(this.f56575n);
    }

    private void K(int captionMode) {
        int i10 = this.f56578q;
        if (i10 != captionMode) {
            this.f56578q = captionMode;
            if (captionMode != 3) {
                J();
                if (i10 != 3) {
                    if (captionMode != 1) {
                        if (captionMode == 0) {
                        }
                    }
                }
                this.f56576o = Collections.EMPTY_LIST;
                return;
            }
            for (int i11 = 0; i11 < this.f56574m.size(); i11++) {
                this.f56574m.get(i11).l(captionMode);
            }
        }
    }

    private void L(int captionRowCount) {
        this.f56579r = captionRowCount;
        this.f56575n.m(captionRowCount);
    }

    private boolean M(byte cc1) {
        if (x(cc1)) {
            this.f56584w = o(cc1);
        }
        return this.f56584w == this.f56573l;
    }

    private static char n(byte ccData) {
        return (char) f56563e0[(ccData & 127) - 32];
    }

    private static int o(byte cc1) {
        return (cc1 >> 3) & 1;
    }

    private List<androidx.media2.exoplayer.external.text.b> p() {
        int size = this.f56574m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.media2.exoplayer.external.text.b bVarG = this.f56574m.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f56551h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media2.exoplayer.external.text.b bVarG2 = (androidx.media2.exoplayer.external.text.b) arrayList.get(i11);
            if (bVarG2 != null) {
                if (bVarG2.f56551h != iMin) {
                    bVarG2 = this.f56574m.get(i11).g(iMin);
                }
                arrayList2.add(bVarG2);
            }
        }
        return arrayList2;
    }

    private static char q(byte ccData) {
        return (char) f56565g0[ccData & com.google.common.base.c.I];
    }

    private static char r(byte ccData) {
        return (char) f56566h0[ccData & com.google.common.base.c.I];
    }

    private static char s(byte cc1, byte cc2) {
        return (cc1 & 1) == 0 ? q(cc2) : r(cc2);
    }

    private static char t(byte ccData) {
        return (char) f56564f0[ccData & com.google.common.base.c.f116464q];
    }

    private void u(byte cc2) {
        this.f56575n.e(' ');
        this.f56575n.p((cc2 >> 1) & 7, (cc2 & 1) == 1);
    }

    private void v(byte cc2) {
        if (cc2 == 32) {
            K(2);
            return;
        }
        if (cc2 == 41) {
            K(3);
            return;
        }
        switch (cc2) {
            case 37:
                K(1);
                L(2);
                break;
            case 38:
                K(1);
                L(3);
                break;
            case 39:
                K(1);
                L(4);
                break;
            default:
                int i10 = this.f56578q;
                if (i10 != 0) {
                    if (cc2 == 33) {
                        this.f56575n.f();
                        break;
                    } else {
                        switch (cc2) {
                            case 44:
                                this.f56576o = Collections.EMPTY_LIST;
                                if (i10 != 1 && i10 != 3) {
                                }
                                J();
                                break;
                            case 45:
                                if (i10 == 1 && !this.f56575n.i()) {
                                    this.f56575n.k();
                                    break;
                                }
                                break;
                            case 46:
                                J();
                                break;
                            case 47:
                                this.f56576o = p();
                                J();
                                break;
                            default:
                                break;
                        }
                    }
                }
                break;
        }
    }

    private void w(byte cc1, byte cc2) {
        int i10 = K[cc1 & 7];
        if ((cc2 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f56575n.f56591d) {
            if (this.f56578q != 1 && !this.f56575n.i()) {
                C0523a c0523a = new C0523a(this.f56578q, this.f56579r);
                this.f56575n = c0523a;
                this.f56574m.add(c0523a);
            }
            this.f56575n.f56591d = i10;
        }
        boolean z10 = (cc2 & com.google.common.base.c.f116465r) == 16;
        boolean z11 = (cc2 & 1) == 1;
        int i11 = (cc2 >> 1) & 7;
        this.f56575n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f56575n.f56592e = L[i11];
        }
    }

    private static boolean x(byte cc1) {
        return (cc1 & h.a.K) == 0;
    }

    private static boolean y(byte cc1, byte cc2) {
        return (cc1 & 246) == 18 && (cc2 & h.a.K) == 32;
    }

    private static boolean z(byte cc1, byte cc2) {
        return (cc1 & 247) == 17 && (cc2 & 240) == 32;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.text.f
    public /* bridge */ /* synthetic */ void d(long positionUs) {
        super.d(positionUs);
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    protected androidx.media2.exoplayer.external.text.e e() {
        List<androidx.media2.exoplayer.external.text.b> list = this.f56576o;
        this.f56577p = list;
        return new f(list);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    @Override // androidx.media2.exoplayer.external.text.cea.e
    protected void f(i inputBuffer) {
        boolean z10;
        this.f56570i.O(inputBuffer.f53789c.array(), inputBuffer.f53789c.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f56570i.a();
            int i10 = this.f56571j;
            if (iA < i10) {
                break;
            }
            byte bD = i10 == 2 ? Q : (byte) this.f56570i.D();
            int iD = this.f56570i.D();
            int iD2 = this.f56570i.D();
            if ((bD & 2) == 0 && (bD & 1) == this.f56572k) {
                byte b10 = (byte) (iD & 127);
                byte b11 = (byte) (iD2 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f56580s;
                    if ((bD & 4) == 4) {
                        boolean[] zArr = f56567i0;
                        if (zArr[iD] && zArr[iD2]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f56580s = z10;
                    if (!D(z10, b10, b11)) {
                        if (this.f56580s) {
                            I(b10, b11);
                            if (this.f56585x && M(b10)) {
                                if (!x(b10)) {
                                    this.f56575n.e(n(b10));
                                    if ((b11 & h.a.K) != 0) {
                                        this.f56575n.e(n(b11));
                                    }
                                } else if (F(b10, b11)) {
                                    this.f56575n.e(t(b11));
                                } else if (y(b10, b11)) {
                                    this.f56575n.f();
                                    this.f56575n.e(s(b10, b11));
                                } else if (z(b10, b11)) {
                                    u(b11);
                                } else if (B(b10, b11)) {
                                    w(b10, b11);
                                } else if (G(b10, b11)) {
                                    this.f56575n.f56593f = b11 + h.a.K;
                                } else if (A(b10, b11)) {
                                    v(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            J();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f56578q;
            if (i11 == 1 || i11 == 3) {
                this.f56576o = p();
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.decoder.c
    public void flush() {
        super.flush();
        this.f56576o = null;
        this.f56577p = null;
        K(0);
        L(4);
        J();
        this.f56580s = false;
        this.f56581t = false;
        this.f56582u = (byte) 0;
        this.f56583v = (byte) 0;
        this.f56584w = 0;
        this.f56585x = true;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ i c() throws androidx.media2.exoplayer.external.text.g {
        return super.c();
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.decoder.c
    public String getName() {
        return f56568y;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws androidx.media2.exoplayer.external.text.g {
        return super.a();
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    protected boolean i() {
        return this.f56576o != this.f56577p;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void b(i inputBuffer) throws androidx.media2.exoplayer.external.text.g {
        super.b(inputBuffer);
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.decoder.c
    public void release() {
    }
}
