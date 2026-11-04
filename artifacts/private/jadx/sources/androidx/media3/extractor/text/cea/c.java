package androidx.media3.extractor.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.j;
import androidx.media3.extractor.text.l;
import androidx.media3.extractor.text.o;
import androidx.media3.extractor.text.p;
import il.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.b0;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c extends e {
    private static final int A = 127;
    private static final int A0 = 48;
    private static final int B = 159;
    private static final int B0 = 49;
    private static final int C = 255;
    private static final int C0 = 50;
    private static final int D = 31;
    private static final int D0 = 51;
    private static final int E = 127;
    private static final int E0 = 52;
    private static final int F = 159;
    private static final int F0 = 53;
    private static final int G = 255;
    private static final int G0 = 57;
    private static final int H = 0;
    private static final int H0 = 58;
    private static final int I = 3;
    private static final int I0 = 60;
    private static final int J = 8;
    private static final int J0 = 61;
    private static final int K = 12;
    private static final int K0 = 63;
    private static final int L = 13;
    private static final int L0 = 118;
    private static final int M = 14;
    private static final int M0 = 119;
    private static final int N = 16;
    private static final int N0 = 120;
    private static final int O = 17;
    private static final int O0 = 121;
    private static final int P = 23;
    private static final int P0 = 122;
    private static final int Q = 24;
    private static final int Q0 = 123;
    private static final int R = 31;
    private static final int R0 = 124;
    private static final int S = 128;
    private static final int S0 = 125;
    private static final int T = 129;
    private static final int T0 = 126;
    private static final int U = 130;
    private static final int U0 = 127;
    private static final int V = 131;
    private static final int W = 132;
    private static final int X = 133;
    private static final int Y = 134;
    private static final int Z = 135;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f68353a0 = 136;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f68354b0 = 137;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f68355c0 = 138;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f68356d0 = 139;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f68357e0 = 140;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f68358f0 = 141;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f68359g0 = 142;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f68360h0 = 143;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f68361i0 = 144;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f68362j0 = 145;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f68363k0 = 146;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f68364l0 = 151;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f68365m0 = 152;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f68366n0 = 153;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f68367o0 = 154;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f68368p0 = 155;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f68369q0 = 156;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f68370r0 = 157;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f68371s0 = 158;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f68372t0 = 159;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f68373u = "Cea708Decoder";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f68374u0 = 127;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f68375v = 8;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f68376v0 = 32;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f68377w = 2;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f68378w0 = 33;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f68379x = 3;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f68380x0 = 37;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f68381y = 4;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f68382y0 = 42;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f68383z = 31;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f68384z0 = 44;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final o0 f68385j = new o0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n0 f68386k = new n0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68387l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f68388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f68389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b[] f68390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f68391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private List<androidx.media3.common.text.a> f68392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private List<androidx.media3.common.text.a> f68393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private C0613c f68394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f68395t;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f68396c = new Comparator() { // from class: androidx.media3.extractor.text.cea.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f68398b, ((c.a) obj).f68398b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.text.a f68397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68398b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            androidx.media3.common.text.a.c cVarZ = new androidx.media3.common.text.a.c().A(charSequence).B(alignment).t(f10, i10).u(i11).w(f11).x(i12).z(f12);
            if (z10) {
                cVarZ.E(i13);
            }
            this.f68397a = cVarZ.a();
            this.f68398b = i14;
        }
    }

    private static final class b {
        private static final int A = 0;
        private static final int B = 1;
        private static final int C = 2;
        private static final int D = 3;
        private static final int E = 0;
        private static final int F = 1;
        private static final int G = 2;
        private static final int H = 3;
        private static final int I = 0;
        private static final int J = 3;
        public static final int K = h(2, 2, 2, 0);
        public static final int L;
        public static final int M;
        private static final int N = 1;
        private static final int O = 0;
        private static final int P = 1;
        private static final int Q = 2;
        private static final int R = 3;
        private static final int S = 4;
        private static final int T = 1;
        private static final int[] U;
        private static final int[] V;
        private static final int[] W;
        private static final boolean[] X;
        private static final int[] Y;
        private static final int[] Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private static final int[] f68399a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private static final int[] f68400b0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f68401v = 99;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f68402w = 74;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f68403x = 209;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f68404y = 4;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f68405z = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f68406a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f68407b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f68408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f68409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f68411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f68412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f68413h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f68414i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f68415j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f68416k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f68417l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f68418m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f68419n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f68420o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f68421p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f68422q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f68423r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f68424s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f68425t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f68426u;

        static {
            int iH = h(0, 0, 0, 0);
            L = iH;
            int iH2 = h(0, 0, 0, 3);
            M = iH2;
            U = new int[]{0, 0, 0, 0, 0, 2, 0};
            V = new int[]{0, 0, 0, 0, 0, 0, 2};
            W = new int[]{3, 3, 3, 3, 3, 3, 1};
            X = new boolean[]{false, false, false, true, true, true, false};
            Y = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            Z = new int[]{0, 1, 2, 3, 4, 3, 4};
            f68399a0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            f68400b0 = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001f  */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            androidx.media3.common.util.a.c(i10, 0, 4);
            androidx.media3.common.util.a.c(i11, 0, 4);
            androidx.media3.common.util.a.c(i12, 0, 4);
            androidx.media3.common.util.a.c(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f68407b.append(c10);
                return;
            }
            this.f68406a.add(d());
            this.f68407b.clear();
            if (this.f68420o != -1) {
                this.f68420o = 0;
            }
            if (this.f68421p != -1) {
                this.f68421p = 0;
            }
            if (this.f68422q != -1) {
                this.f68422q = 0;
            }
            if (this.f68424s != -1) {
                this.f68424s = 0;
            }
            while (true) {
                if (this.f68406a.size() < this.f68415j && this.f68406a.size() < 15) {
                    this.f68426u = this.f68406a.size();
                    return;
                }
                this.f68406a.remove(0);
            }
        }

        public void b() {
            int length = this.f68407b.length();
            if (length > 0) {
                this.f68407b.delete(length - 1, length);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: LoopRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: No SSA var for result arg: (r9 I:??) from 0x00c6: PHI (r9 I:??) = (r9v9 boolean) binds: [B:42:0x00c4] A[DONT_GENERATE, DONT_INLINE, REMOVE]
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
            	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:517)
            	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:96)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:134)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:56)
            */
        @androidx.annotation.p0
        public androidx.media3.extractor.text.cea.c.a c() {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.cea.c.b.c():androidx.media3.extractor.text.cea.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f68407b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f68420o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f68420o, length, 33);
                }
                if (this.f68421p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f68421p, length, 33);
                }
                if (this.f68422q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f68423r), this.f68422q, length, 33);
                }
                if (this.f68424s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f68425t), this.f68424s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f68406a.clear();
            this.f68407b.clear();
            this.f68420o = -1;
            this.f68421p = -1;
            this.f68422q = -1;
            this.f68424s = -1;
            this.f68426u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f68408c = true;
            this.f68409d = z10;
            this.f68410e = i10;
            this.f68411f = z11;
            this.f68412g = i11;
            this.f68413h = i12;
            this.f68414i = i14;
            int i17 = i13 + 1;
            if (this.f68415j != i17) {
                this.f68415j = i17;
                while (true) {
                    if (this.f68406a.size() < this.f68415j && this.f68406a.size() < 15) {
                        break;
                    } else {
                        this.f68406a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f68417l != i15) {
                this.f68417l = i15;
                int i18 = i15 - 1;
                q(Y[i18], M, X[i18], 0, V[i18], W[i18], U[i18]);
            }
            if (i16 == 0 || this.f68418m == i16) {
                return;
            }
            this.f68418m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f68399a0[i19], Z[i19]);
            n(K, f68400b0[i19], L);
        }

        public boolean i() {
            return this.f68408c;
        }

        public boolean j() {
            return !i() || (this.f68406a.isEmpty() && this.f68407b.length() == 0);
        }

        public boolean k() {
            return this.f68409d;
        }

        public void l() {
            e();
            this.f68408c = false;
            this.f68409d = false;
            this.f68410e = 4;
            this.f68411f = false;
            this.f68412g = 0;
            this.f68413h = 0;
            this.f68414i = 0;
            this.f68415j = 15;
            this.f68416k = 0;
            this.f68417l = 0;
            this.f68418m = 0;
            int i10 = L;
            this.f68419n = i10;
            this.f68423r = K;
            this.f68425t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f68420o != -1) {
                if (!z10) {
                    this.f68407b.setSpan(new StyleSpan(2), this.f68420o, this.f68407b.length(), 33);
                    this.f68420o = -1;
                }
            } else if (z10) {
                this.f68420o = this.f68407b.length();
            }
            if (this.f68421p == -1) {
                if (z11) {
                    this.f68421p = this.f68407b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f68407b.setSpan(new UnderlineSpan(), this.f68421p, this.f68407b.length(), 33);
                this.f68421p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f68422q != -1 && this.f68423r != i10) {
                this.f68407b.setSpan(new ForegroundColorSpan(this.f68423r), this.f68422q, this.f68407b.length(), 33);
            }
            if (i10 != K) {
                this.f68422q = this.f68407b.length();
                this.f68423r = i10;
            }
            if (this.f68424s != -1 && this.f68425t != i11) {
                this.f68407b.setSpan(new BackgroundColorSpan(this.f68425t), this.f68424s, this.f68407b.length(), 33);
            }
            if (i11 != L) {
                this.f68424s = this.f68407b.length();
                this.f68425t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f68426u != i10) {
                a('\n');
            }
            this.f68426u = i10;
        }

        public void p(boolean z10) {
            this.f68409d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f68419n = i10;
            this.f68416k = i15;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.extractor.text.cea.c$c, reason: collision with other inner class name */
    private static final class C0613c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f68429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f68430d = 0;

        public C0613c(int i10, int i11) {
            this.f68427a = i10;
            this.f68428b = i11;
            this.f68429c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, @p0 List<byte[]> list) {
        boolean z10 = true;
        this.f68389n = i10 == -1 ? 1 : i10;
        if (list == null || !k.z(list)) {
            z10 = false;
        }
        this.f68388m = z10;
        this.f68390o = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f68390o[i11] = new b();
        }
        this.f68391p = this.f68390o[0];
    }

    private void A(int i10) {
        if (i10 == 160) {
            this.f68391p.a((char) 13252);
            return;
        }
        z.n(f68373u, "Invalid G3 character: " + i10);
        this.f68391p.a('_');
    }

    private void B() {
        this.f68391p.m(this.f68386k.h(4), this.f68386k.h(2), this.f68386k.h(2), this.f68386k.g(), this.f68386k.g(), this.f68386k.h(3), this.f68386k.h(3));
    }

    private void C() {
        int iH = b.h(this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2));
        int iH2 = b.h(this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2));
        this.f68386k.s(2);
        this.f68391p.n(iH, iH2, b.g(this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2)));
    }

    private void D() {
        this.f68386k.s(4);
        int iH = this.f68386k.h(4);
        this.f68386k.s(2);
        this.f68391p.o(iH, this.f68386k.h(6));
    }

    private void E() {
        int iH = b.h(this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2));
        int iH2 = this.f68386k.h(2);
        int iG = b.g(this.f68386k.h(2), this.f68386k.h(2), this.f68386k.h(2));
        if (this.f68386k.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f68386k.g();
        int iH3 = this.f68386k.h(2);
        int iH4 = this.f68386k.h(2);
        int iH5 = this.f68386k.h(2);
        this.f68386k.s(8);
        this.f68391p.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    @m({"currentDtvCcPacket"})
    private void F() {
        C0613c c0613c = this.f68394s;
        if (c0613c.f68430d != (c0613c.f68428b * 2) - 1) {
            z.b(f68373u, "DtvCcPacket ended prematurely; size is " + ((this.f68394s.f68428b * 2) - 1) + ", but current index is " + this.f68394s.f68430d + " (sequence number " + this.f68394s.f68427a + ");");
        }
        n0 n0Var = this.f68386k;
        C0613c c0613c2 = this.f68394s;
        n0Var.p(c0613c2.f68429c, c0613c2.f68430d);
        boolean z10 = false;
        while (this.f68386k.b() > 0) {
            int iH = this.f68386k.h(3);
            int i10 = 0 << 5;
            int iH2 = this.f68386k.h(5);
            if (iH == 7) {
                this.f68386k.s(2);
                iH = this.f68386k.h(6);
                if (iH < 7) {
                    z.n(f68373u, "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                z.n(f68373u, "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f68389n) {
                this.f68386k.t(iH2);
            } else {
                int iE = this.f68386k.e() + (iH2 * 8);
                while (this.f68386k.e() < iE) {
                    int iH3 = this.f68386k.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f68386k.h(8);
                        if (iH4 <= 31) {
                            u(iH4);
                        } else {
                            if (iH4 <= 127) {
                                z(iH4);
                            } else if (iH4 <= 159) {
                                v(iH4);
                            } else if (iH4 <= 255) {
                                A(iH4);
                            } else {
                                z.n(f68373u, "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        s(iH3);
                    } else {
                        if (iH3 <= 127) {
                            x(iH3);
                        } else if (iH3 <= 159) {
                            t(iH3);
                        } else if (iH3 <= 255) {
                            y(iH3);
                        } else {
                            z.n(f68373u, "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f68392q = r();
        }
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f68390o[i10].l();
        }
    }

    private void q() {
        if (this.f68394s == null) {
            return;
        }
        F();
        this.f68394s = null;
    }

    private List<androidx.media3.common.text.a> r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f68390o[i10].j() && this.f68390o[i10].k() && (aVarC = this.f68390o[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f68396c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f68397a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f68392q = r();
                return;
            }
            if (i10 == 8) {
                this.f68391p.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f68391p.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        z.n(f68373u, "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f68386k.s(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        z.n(f68373u, "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f68386k.s(16);
                    } else {
                        z.n(f68373u, "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void t(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f68395t != i12) {
                    this.f68395t = i12;
                    this.f68391p = this.f68390o[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f68386k.g()) {
                        this.f68390o[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f68386k.g()) {
                        this.f68390o[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f68386k.g()) {
                        this.f68390o[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f68386k.g()) {
                        b bVar = this.f68390o[8 - i14];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f68386k.g()) {
                        this.f68390o[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f68386k.s(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f68391p.i()) {
                    B();
                } else {
                    this.f68386k.s(16);
                }
                break;
            case 145:
                if (this.f68391p.i()) {
                    C();
                } else {
                    this.f68386k.s(24);
                }
                break;
            case 146:
                if (this.f68391p.i()) {
                    D();
                } else {
                    this.f68386k.s(16);
                }
                break;
            case com.planner5d.library.engine.input.f.b.F1 /* 147 */:
            case com.planner5d.library.engine.input.f.b.G1 /* 148 */:
            case com.planner5d.library.engine.input.f.b.H1 /* 149 */:
            case 150:
            default:
                z.n(f68373u, "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f68391p.i()) {
                    E();
                } else {
                    this.f68386k.s(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                w(i15);
                if (this.f68395t != i15) {
                    this.f68395t = i15;
                    this.f68391p = this.f68390o[i15];
                }
                break;
        }
    }

    private void u(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f68386k.s(8);
            } else if (i10 <= 23) {
                this.f68386k.s(16);
            } else if (i10 <= 31) {
                this.f68386k.s(24);
            }
        }
    }

    private void v(int i10) {
        if (i10 <= 135) {
            this.f68386k.s(32);
            return;
        }
        if (i10 <= 143) {
            this.f68386k.s(40);
            return;
        }
        if (i10 <= 159) {
            this.f68386k.s(2);
            this.f68386k.s(this.f68386k.h(6) * 8);
        }
    }

    private void w(int i10) {
        b bVar = this.f68390o[i10];
        this.f68386k.s(2);
        boolean zG = this.f68386k.g();
        this.f68386k.s(2);
        int iH = this.f68386k.h(3);
        boolean zG2 = this.f68386k.g();
        int iH2 = this.f68386k.h(7);
        int iH3 = this.f68386k.h(8);
        int iH4 = this.f68386k.h(4);
        int iH5 = this.f68386k.h(4);
        this.f68386k.s(2);
        this.f68386k.s(6);
        this.f68386k.s(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f68386k.h(3), this.f68386k.h(3));
    }

    private void x(int i10) {
        if (i10 == 127) {
            this.f68391p.a((char) 9835);
        } else {
            this.f68391p.a((char) (i10 & 255));
        }
    }

    private void y(int i10) {
        this.f68391p.a((char) (i10 & 255));
    }

    private void z(int i10) {
        if (i10 == 32) {
            this.f68391p.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f68391p.a(b0.f313282g);
            return;
        }
        if (i10 == 37) {
            this.f68391p.a(b0.F);
            return;
        }
        if (i10 == 42) {
            this.f68391p.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f68391p.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f68391p.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f68391p.a(b0.J);
            return;
        }
        if (i10 == 58) {
            this.f68391p.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f68391p.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f68391p.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f68391p.a((char) 9608);
                break;
            case 49:
                this.f68391p.a(b0.f313298w);
                break;
            case 50:
                this.f68391p.a(b0.f313299x);
                break;
            case 51:
                this.f68391p.a(b0.f313301z);
                break;
            case 52:
                this.f68391p.a(b0.A);
                break;
            case 53:
                this.f68391p.a(b0.E);
                break;
            default:
                switch (i10) {
                    case L0 /* 118 */:
                        this.f68391p.a((char) 8539);
                        break;
                    case M0 /* 119 */:
                        this.f68391p.a((char) 8540);
                        break;
                    case 120:
                        this.f68391p.a((char) 8541);
                        break;
                    case O0 /* 121 */:
                        this.f68391p.a((char) 8542);
                        break;
                    case P0 /* 122 */:
                        this.f68391p.a((char) 9474);
                        break;
                    case Q0 /* 123 */:
                        this.f68391p.a((char) 9488);
                        break;
                    case R0 /* 124 */:
                        this.f68391p.a((char) 9492);
                        break;
                    case S0 /* 125 */:
                        this.f68391p.a((char) 9472);
                        break;
                    case 126:
                        this.f68391p.a((char) 9496);
                        break;
                    case 127:
                        this.f68391p.a((char) 9484);
                        break;
                    default:
                        z.n(f68373u, "Invalid G2 character: " + i10);
                        break;
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
        this.f68392q = null;
        this.f68393r = null;
        this.f68395t = 0;
        this.f68391p = this.f68390o[0];
        G();
        this.f68394s = null;
    }

    @Override // androidx.media3.extractor.text.cea.e
    protected j g() {
        List<androidx.media3.common.text.a> list = this.f68392q;
        this.f68393r = list;
        return new f((List) androidx.media3.common.util.a.g(list));
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.decoder.e
    public String getName() {
        return f68373u;
    }

    @Override // androidx.media3.extractor.text.cea.e
    protected void h(o oVar) {
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(oVar.f62700d);
        this.f68385j.Y(byteBuffer.array(), byteBuffer.limit());
        while (this.f68385j.a() >= 3) {
            int iL = this.f68385j.L();
            int i10 = iL & 3;
            boolean z10 = (iL & 4) == 4;
            byte bL = (byte) this.f68385j.L();
            byte bL2 = (byte) this.f68385j.L();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (bL & h.a.f339269e) >> 6;
                        int i12 = this.f68387l;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            z.n(f68373u, "Sequence number discontinuity. previous=" + this.f68387l + " current=" + i11);
                        }
                        this.f68387l = i11;
                        int i13 = bL & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0613c c0613c = new C0613c(i11, i13);
                        this.f68394s = c0613c;
                        byte[] bArr = c0613c.f68429c;
                        int i14 = c0613c.f68430d;
                        c0613c.f68430d = i14 + 1;
                        bArr[i14] = bL2;
                    } else {
                        androidx.media3.common.util.a.a(i10 == 2);
                        C0613c c0613c2 = this.f68394s;
                        if (c0613c2 == null) {
                            z.d(f68373u, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0613c2.f68429c;
                            int i15 = c0613c2.f68430d;
                            int i16 = i15 + 1;
                            c0613c2.f68430d = i16;
                            bArr2[i15] = bL;
                            c0613c2.f68430d = i15 + 2;
                            bArr2[i16] = bL2;
                        }
                    }
                    C0613c c0613c3 = this.f68394s;
                    if (c0613c3.f68430d == (c0613c3.f68428b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.text.cea.e
    @p0
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ o c() throws l {
        return super.c();
    }

    @Override // androidx.media3.extractor.text.cea.e
    @p0
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ p a() throws l {
        return super.a();
    }

    @Override // androidx.media3.extractor.text.cea.e
    protected boolean m() {
        return this.f68392q != this.f68393r;
    }

    @Override // androidx.media3.extractor.text.cea.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void b(o oVar) throws l {
        super.b(oVar);
    }

    @Override // androidx.media3.extractor.text.cea.e, androidx.media3.decoder.e
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
