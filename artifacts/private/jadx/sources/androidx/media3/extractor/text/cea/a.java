package androidx.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import androidx.compose.runtime.m0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.j;
import androidx.media3.extractor.text.l;
import androidx.media3.extractor.text.o;
import androidx.media3.extractor.text.p;
import com.rabbitmq.client.impl.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a extends e {
    public static final long B = 16000;
    private static final String C = "Cea608Decoder";
    private static final int D = 4;
    private static final int E = 2;
    private static final int F = 1;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private static final int R = 7;
    private static final int S = 8;
    private static final int T = 4;
    private static final byte U = -4;
    private static final byte V = 32;
    private static final byte W = 33;
    private static final byte X = 36;
    private static final byte Y = 37;
    private static final byte Z = 38;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final byte f68310a0 = 39;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final byte f68311b0 = 41;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final byte f68312c0 = 42;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte f68313d0 = 43;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final byte f68314e0 = 44;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte f68315f0 = 45;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte f68316g0 = 46;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte f68317h0 = 47;
    private long A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f68324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f68325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f68326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f68327n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private List<androidx.media3.common.text.a> f68330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private List<androidx.media3.common.text.a> f68331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f68332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f68333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f68334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte f68336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte f68337x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f68339z;
    private static final int[] O = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] P = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] Q = {-1, -16711936, -16776961, -16711681, l1.a.f316127c, -256, -65281};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int[] f68318i0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, com.planner5d.library.engine.input.f.b.M1, 250, 97, 98, 99, 100, 101, 102, com.planner5d.library.engine.input.f.b.f160733u1, 104, 105, com.planner5d.library.engine.input.f.b.f160742x1, com.planner5d.library.engine.input.f.b.f160745y1, 108, 109, 110, k.b.p.f265340a, com.planner5d.library.engine.input.f.b.B, 113, 114, 115, androidx.media3.extractor.metadata.dvbsi.b.f67479d, me.relex.circleindicator.a.f332619e, 118, 119, 120, 121, 122, 231, com.planner5d.library.engine.input.f.b.Q1, 209, 241, 9632};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int[] f68319j0 = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, com.planner5d.library.engine.input.f.b.U1};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int[] f68320k0 = {193, 201, 211, 218, 220, com.planner5d.library.engine.input.f.b.V1, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, m0.f36245r, 239, 212, 217, com.planner5d.library.engine.input.f.b.S1, 219, 171, 187};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int[] f68321l0 = {195, 227, 205, 204, 236, 210, 242, 213, com.planner5d.library.engine.input.f.b.O1, 123, 125, 92, 94, 95, 124, okhttp3.internal.ws.g.f334652s, 196, 228, 214, com.planner5d.library.engine.input.f.b.P1, 223, 165, 164, 9474, 197, 229, 216, com.planner5d.library.engine.input.f.b.R1, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final boolean[] f68322m0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o0 f68323j = new o0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList<C0611a> f68328o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C0611a f68329p = new C0611a(0, 4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f68338y = 0;

    /* JADX INFO: renamed from: androidx.media3.extractor.text.cea.a$a, reason: collision with other inner class name */
    private static final class C0611a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f68340i = 32;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f68341j = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0612a> f68342a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f68343b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f68344c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f68345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f68347f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f68348g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f68349h;

        /* JADX INFO: renamed from: androidx.media3.extractor.text.cea.a$a$a, reason: collision with other inner class name */
        private static class C0612a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f68350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f68351b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f68352c;

            public C0612a(int i10, boolean z10, int i11) {
                this.f68350a = i10;
                this.f68351b = z10;
                this.f68352c = i11;
            }
        }

        public C0611a(int i10, int i11) {
            j(i10);
            this.f68349h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f68344c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f68342a.size()) {
                C0612a c0612a = this.f68342a.get(i14);
                boolean z11 = c0612a.f68351b;
                int i16 = c0612a.f68350a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.Q[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0612a.f68352c;
                i14++;
                if (i17 != (i14 < this.f68342a.size() ? this.f68342a.get(i14).f68352c : length)) {
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

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f68344c.length() < 32) {
                this.f68344c.append(c10);
            }
        }

        public void f() {
            int length = this.f68344c.length();
            if (length > 0) {
                this.f68344c.delete(length - 1, length);
                for (int size = this.f68342a.size() - 1; size >= 0; size--) {
                    C0612a c0612a = this.f68342a.get(size);
                    int i10 = c0612a.f68352c;
                    if (i10 != length) {
                        return;
                    }
                    c0612a.f68352c = i10 - 1;
                }
            }
        }

        @p0
        public androidx.media3.common.text.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f68343b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f68343b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f68346e + this.f68347f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f68348g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f68348g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f68345d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f68348g == 1) {
                i14 -= this.f68349h - 1;
            }
            return new androidx.media3.common.text.a.c().A(spannableStringBuilder).B(Layout.Alignment.ALIGN_NORMAL).t(i14, 1).w(f10).x(i10).a();
        }

        public boolean i() {
            return this.f68342a.isEmpty() && this.f68343b.isEmpty() && this.f68344c.length() == 0;
        }

        public void j(int i10) {
            this.f68348g = i10;
            this.f68342a.clear();
            this.f68343b.clear();
            this.f68344c.setLength(0);
            this.f68345d = 15;
            this.f68346e = 0;
            this.f68347f = 0;
        }

        public void k() {
            this.f68343b.add(h());
            this.f68344c.setLength(0);
            this.f68342a.clear();
            int iMin = Math.min(this.f68349h, this.f68345d);
            while (this.f68343b.size() >= iMin) {
                this.f68343b.remove(0);
            }
        }

        public void l(int i10) {
            this.f68348g = i10;
        }

        public void m(int i10) {
            this.f68349h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f68342a.add(new C0612a(i10, z10, this.f68344c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            androidx.media3.common.util.a.a(j10 >= 16000);
            this.f68327n = j10 * 1000;
        } else {
            this.f68327n = -9223372036854775807L;
        }
        this.f68324k = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f68326m = 0;
            this.f68325l = 0;
        } else if (i10 == 2) {
            this.f68326m = 1;
            this.f68325l = 0;
        } else if (i10 == 3) {
            this.f68326m = 0;
            this.f68325l = 1;
        } else if (i10 != 4) {
            z.n(C, "Invalid channel. Defaulting to CC1.");
            this.f68326m = 0;
            this.f68325l = 0;
        } else {
            this.f68326m = 1;
            this.f68325l = 1;
        }
        O(0);
        N();
        this.f68339z = true;
        this.A = -9223372036854775807L;
    }

    private void A(byte b10, byte b11) {
        int i10 = O[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f68329p.f68345d) {
            if (this.f68332s != 1 && !this.f68329p.i()) {
                C0611a c0611a = new C0611a(this.f68332s, this.f68333t);
                this.f68329p = c0611a;
                this.f68328o.add(c0611a);
            }
            this.f68329p.f68345d = i10;
        }
        boolean z10 = (b11 & com.google.common.base.c.f116465r) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f68329p.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f68329p.f68346e = P[i11];
        }
    }

    private static boolean B(byte b10) {
        return (b10 & h.a.K) == 0;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & h.a.K) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & h.a.f339269e) == 64;
    }

    private static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f68335v = false;
        } else {
            if (this.f68335v && this.f68336w == b10 && this.f68337x == b11) {
                this.f68335v = false;
                return true;
            }
            this.f68335v = true;
            this.f68336w = b10;
            this.f68337x = b11;
        }
        return false;
    }

    private static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027 A[FALL_THROUGH] */
    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f68339z = false;
            return;
        }
        if (I(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f68339z = false;
                                break;
                        }
                    case 37:
                    case 38:
                    case 39:
                        this.f68339z = true;
                        break;
                }
                return;
            }
            this.f68339z = true;
        }
    }

    private void N() {
        this.f68329p.j(this.f68332s);
        this.f68328o.clear();
        this.f68328o.add(this.f68329p);
    }

    private void O(int i10) {
        int i11 = this.f68332s;
        if (i11 == i10) {
            return;
        }
        this.f68332s = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f68328o.size(); i12++) {
                this.f68328o.get(i12).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f68330q = Collections.EMPTY_LIST;
        }
    }

    private void P(int i10) {
        this.f68333t = i10;
        this.f68329p.m(i10);
    }

    private boolean Q() {
        return (this.f68327n == -9223372036854775807L || this.A == -9223372036854775807L || l() - this.A < this.f68327n) ? false : true;
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f68338y = s(b10);
        }
        return this.f68338y == this.f68326m;
    }

    private static char r(byte b10) {
        return (char) f68318i0[(b10 & 127) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<androidx.media3.common.text.a> t() {
        int size = this.f68328o.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.media3.common.text.a aVarG = this.f68328o.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f61383i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            androidx.media3.common.text.a aVar = (androidx.media3.common.text.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f61383i != iMin) {
                    aVar = (androidx.media3.common.text.a) androidx.media3.common.util.a.g(this.f68328o.get(i11).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) f68320k0[b10 & com.google.common.base.c.I];
    }

    private static char v(byte b10) {
        return (char) f68321l0[b10 & com.google.common.base.c.I];
    }

    private static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    private static char x(byte b10) {
        return (char) f68319j0[b10 & com.google.common.base.c.f116464q];
    }

    private void y(byte b10) {
        this.f68329p.e(' ');
        this.f68329p.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void z(byte b10) {
        if (b10 == 32) {
            O(2);
            return;
        }
        if (b10 == 41) {
            O(3);
            return;
        }
        int i10 = 5 | 1;
        switch (b10) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i11 = this.f68332s;
                if (i11 != 0) {
                    if (b10 == 33) {
                        this.f68329p.f();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f68330q = Collections.EMPTY_LIST;
                                if (i11 != 1 && i11 != 3) {
                                }
                                N();
                                break;
                            case 45:
                                if (i11 == 1 && !this.f68329p.i()) {
                                    this.f68329p.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f68330q = t();
                                N();
                                break;
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.extractor.text.k
    public /* bridge */ /* synthetic */ void d(long j10) {
        super.d(j10);
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.decoder.e
    public void flush() {
        super.flush();
        this.f68330q = null;
        this.f68331r = null;
        O(0);
        P(4);
        N();
        this.f68334u = false;
        this.f68335v = false;
        this.f68336w = (byte) 0;
        this.f68337x = (byte) 0;
        this.f68338y = 0;
        this.f68339z = true;
        this.A = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.text.cea.e
    protected j g() {
        List<androidx.media3.common.text.a> list = this.f68330q;
        this.f68331r = list;
        return new f((List) androidx.media3.common.util.a.g(list));
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.decoder.e
    public String getName() {
        return C;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    @Override // androidx.media3.extractor.text.cea.e
    protected void h(o oVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(oVar.f62700d);
        this.f68323j.Y(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f68323j.a();
            int i10 = this.f68324k;
            if (iA < i10) {
                break;
            }
            int iL = i10 == 2 ? -4 : this.f68323j.L();
            int iL2 = this.f68323j.L();
            int iL3 = this.f68323j.L();
            if ((iL & 2) == 0 && (iL & 1) == this.f68325l) {
                byte b10 = (byte) (iL2 & 127);
                byte b11 = (byte) (iL3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f68334u;
                    if ((iL & 4) == 4) {
                        boolean[] zArr = f68322m0;
                        if (zArr[iL2] && zArr[iL3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f68334u = z10;
                    if (!H(z10, b10, b11)) {
                        if (this.f68334u) {
                            M(b10, b11);
                            if (this.f68339z && R(b10)) {
                                if (!B(b10)) {
                                    this.f68329p.e(r(b10));
                                    if ((b11 & h.a.K) != 0) {
                                        this.f68329p.e(r(b11));
                                    }
                                } else if (J(b10, b11)) {
                                    this.f68329p.e(x(b11));
                                } else if (C(b10, b11)) {
                                    this.f68329p.f();
                                    this.f68329p.e(w(b10, b11));
                                } else if (D(b10, b11)) {
                                    y(b11);
                                } else if (F(b10, b11)) {
                                    A(b10, b11);
                                } else if (K(b10, b11)) {
                                    this.f68329p.f68347f = b11 + h.a.K;
                                } else if (E(b10, b11)) {
                                    z(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            N();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f68332s;
            if (i11 == 1 || i11 == 3) {
                this.f68330q = t();
                this.A = l();
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.e
    @p0
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ o c() throws l {
        return super.c();
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.decoder.e
    @p0
    /* JADX INFO: renamed from: j */
    public p a() throws l {
        p pVarK;
        p pVarA = super.a();
        if (pVarA != null) {
            return pVarA;
        }
        if (!Q() || (pVarK = k()) == null) {
            return null;
        }
        this.f68330q = Collections.EMPTY_LIST;
        this.A = -9223372036854775807L;
        pVarK.E(l(), g(), Long.MAX_VALUE);
        return pVarK;
    }

    @Override // androidx.media3.extractor.text.cea.e
    protected boolean m() {
        return this.f68330q != this.f68331r;
    }

    @Override // androidx.media3.extractor.text.cea.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void b(o oVar) throws l {
        super.b(oVar);
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.decoder.e
    public void release() {
    }
}
