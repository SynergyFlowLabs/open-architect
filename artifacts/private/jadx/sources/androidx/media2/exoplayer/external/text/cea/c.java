package androidx.media2.exoplayer.external.text.cea;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.text.i;
import androidx.media2.exoplayer.external.text.j;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.w;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.b0;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c extends e {
    private static final int A = 31;
    private static final int A0 = 51;
    private static final int B = 127;
    private static final int B0 = 52;
    private static final int C = 159;
    private static final int C0 = 53;
    private static final int D = 255;
    private static final int D0 = 57;
    private static final int E = 0;
    private static final int E0 = 58;
    private static final int F = 3;
    private static final int F0 = 60;
    private static final int G = 8;
    private static final int G0 = 61;
    private static final int H = 12;
    private static final int H0 = 63;
    private static final int I = 13;
    private static final int I0 = 118;
    private static final int J = 14;
    private static final int J0 = 119;
    private static final int K = 16;
    private static final int K0 = 120;
    private static final int L = 17;
    private static final int L0 = 121;
    private static final int M = 23;
    private static final int M0 = 122;
    private static final int N = 24;
    private static final int N0 = 123;
    private static final int O = 31;
    private static final int O0 = 124;
    private static final int P = 128;
    private static final int P0 = 125;
    private static final int Q = 129;
    private static final int Q0 = 126;
    private static final int R = 130;
    private static final int R0 = 127;
    private static final int S = 131;
    private static final int T = 132;
    private static final int U = 133;
    private static final int V = 134;
    private static final int W = 135;
    private static final int X = 136;
    private static final int Y = 137;
    private static final int Z = 138;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f56601a0 = 139;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f56602b0 = 140;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f56603c0 = 141;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f56604d0 = 142;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f56605e0 = 143;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f56606f0 = 144;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f56607g0 = 145;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f56608h0 = 146;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f56609i0 = 151;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f56610j0 = 152;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f56611k0 = 153;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f56612l0 = 154;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f56613m0 = 155;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f56614n0 = 156;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f56615o0 = 157;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f56616p0 = 158;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f56617q0 = 159;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f56618r = "Cea708Decoder";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f56619r0 = 127;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f56620s = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f56621s0 = 32;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f56622t = 2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f56623t0 = 33;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f56624u = 3;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f56625u0 = 37;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f56626v = 4;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f56627v0 = 42;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f56628w = 31;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f56629w0 = 44;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f56630x = 127;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f56631x0 = 48;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f56632y = 159;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f56633y0 = 49;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f56634z = 255;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f56635z0 = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f56636i = new x();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f56637j = new w();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f56638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a[] f56639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f56640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<androidx.media2.exoplayer.external.text.b> f56641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<androidx.media2.exoplayer.external.text.b> f56642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f56643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f56644q;

    private static final class a {
        private static final int A = 15;
        private static final int B = 0;
        private static final int C = 1;
        private static final int D = 2;
        private static final int E = 3;
        private static final int F = 0;
        private static final int G = 1;
        private static final int H = 2;
        private static final int I = 3;
        private static final int J = 0;
        private static final int K = 3;
        public static final int L = h(2, 2, 2, 0);
        public static final int M;
        public static final int N;
        private static final int O = 1;
        private static final int P = 0;
        private static final int Q = 1;
        private static final int R = 2;
        private static final int S = 3;
        private static final int T = 4;
        private static final int U = 1;
        private static final int[] V;
        private static final int[] W;
        private static final int[] X;
        private static final boolean[] Y;
        private static final int[] Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private static final int[] f56645a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private static final int[] f56646b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private static final int[] f56647c0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f56648w = 99;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f56649x = 74;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f56650y = 209;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f56651z = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f56652a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f56653b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f56654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f56655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f56656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f56657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f56658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f56659h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f56660i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f56661j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f56662k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f56663l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f56664m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f56665n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f56666o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f56667p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f56668q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f56669r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f56670s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f56671t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f56672u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f56673v;

        static {
            int iH = h(0, 0, 0, 0);
            M = iH;
            int iH2 = h(0, 0, 0, 3);
            N = iH2;
            int i10 = 6 ^ 7;
            V = new int[]{0, 0, 0, 0, 0, 2, 0};
            W = new int[]{0, 0, 0, 0, 0, 0, 2};
            X = new int[]{3, 3, 3, 3, 3, 3, 1};
            Y = new boolean[]{false, false, false, true, true, true, false};
            Z = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f56645a0 = new int[]{0, 1, 2, 3, 4, 3, 4};
            f56646b0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            f56647c0 = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public a() {
            l();
        }

        public static int g(int red, int green, int blue) {
            return h(red, green, blue, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0022  */
        public static int h(int red, int green, int blue, int opacity) {
            int i10;
            androidx.media2.exoplayer.external.util.a.c(red, 0, 4);
            androidx.media2.exoplayer.external.util.a.c(green, 0, 4);
            androidx.media2.exoplayer.external.util.a.c(blue, 0, 4);
            androidx.media2.exoplayer.external.util.a.c(opacity, 0, 4);
            if (opacity == 0 || opacity == 1) {
                i10 = 255;
            } else if (opacity == 2) {
                i10 = 127;
            } else if (opacity != 3) {
                i10 = 255;
            } else {
                i10 = 0;
            }
            return Color.argb(i10, red > 1 ? 255 : 0, green > 1 ? 255 : 0, blue > 1 ? 255 : 0);
        }

        public void a(char text) {
            if (text != '\n') {
                this.f56653b.append(text);
                return;
            }
            this.f56652a.add(d());
            this.f56653b.clear();
            if (this.f56667p != -1) {
                this.f56667p = 0;
            }
            if (this.f56668q != -1) {
                this.f56668q = 0;
            }
            if (this.f56669r != -1) {
                this.f56669r = 0;
            }
            if (this.f56671t != -1) {
                this.f56671t = 0;
            }
            while (true) {
                if ((!this.f56662k || this.f56652a.size() < this.f56661j) && this.f56652a.size() < 15) {
                    return;
                } else {
                    this.f56652a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f56653b.length();
            if (length > 0) {
                this.f56653b.delete(length - 1, length);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: LoopRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: No SSA var for result arg: (r9 I:??) from 0x00cb: PHI (r9 I:??) = (r9v8 boolean) binds: [B:43:0x00ca] A[DONT_GENERATE, DONT_INLINE, REMOVE]
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
        public androidx.media2.exoplayer.external.text.cea.b c() {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media2.exoplayer.external.text.cea.c.a.c():androidx.media2.exoplayer.external.text.cea.b");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f56653b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f56667p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f56667p, length, 33);
                }
                if (this.f56668q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f56668q, length, 33);
                }
                if (this.f56669r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f56670s), this.f56669r, length, 33);
                }
                if (this.f56671t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f56672u), this.f56671t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f56652a.clear();
            this.f56653b.clear();
            this.f56667p = -1;
            this.f56668q = -1;
            this.f56669r = -1;
            this.f56671t = -1;
            this.f56673v = 0;
        }

        public void f(boolean visible, boolean rowLock, boolean columnLock, int priority, boolean relativePositioning, int verticalAnchor, int horizontalAnchor, int rowCount, int columnCount, int anchorId, int windowStyleId, int penStyleId) {
            this.f56654c = true;
            this.f56655d = visible;
            this.f56662k = rowLock;
            this.f56656e = priority;
            this.f56657f = relativePositioning;
            this.f56658g = verticalAnchor;
            this.f56659h = horizontalAnchor;
            this.f56660i = anchorId;
            int i10 = rowCount + 1;
            if (this.f56661j != i10) {
                this.f56661j = i10;
                while (true) {
                    if ((!rowLock || this.f56652a.size() < this.f56661j) && this.f56652a.size() < 15) {
                        break;
                    } else {
                        this.f56652a.remove(0);
                    }
                }
            }
            if (windowStyleId != 0 && this.f56664m != windowStyleId) {
                this.f56664m = windowStyleId;
                int i11 = windowStyleId - 1;
                q(Z[i11], N, Y[i11], 0, W[i11], X[i11], V[i11]);
            }
            if (penStyleId == 0 || this.f56665n == penStyleId) {
                return;
            }
            this.f56665n = penStyleId;
            int i12 = penStyleId - 1;
            m(0, 1, 1, false, false, f56646b0[i12], f56645a0[i12]);
            n(L, f56647c0[i12], M);
        }

        public boolean i() {
            return this.f56654c;
        }

        public boolean j() {
            return !i() || (this.f56652a.isEmpty() && this.f56653b.length() == 0);
        }

        public boolean k() {
            return this.f56655d;
        }

        public void l() {
            e();
            this.f56654c = false;
            this.f56655d = false;
            this.f56656e = 4;
            this.f56657f = false;
            this.f56658g = 0;
            this.f56659h = 0;
            this.f56660i = 0;
            this.f56661j = 15;
            this.f56662k = true;
            this.f56663l = 0;
            this.f56664m = 0;
            this.f56665n = 0;
            int i10 = M;
            this.f56666o = i10;
            this.f56670s = L;
            this.f56672u = i10;
        }

        public void m(int textTag, int offset, int penSize, boolean italicsToggle, boolean underlineToggle, int edgeType, int fontStyle) {
            if (this.f56667p != -1) {
                if (!italicsToggle) {
                    this.f56653b.setSpan(new StyleSpan(2), this.f56667p, this.f56653b.length(), 33);
                    this.f56667p = -1;
                }
            } else if (italicsToggle) {
                this.f56667p = this.f56653b.length();
            }
            if (this.f56668q == -1) {
                if (underlineToggle) {
                    this.f56668q = this.f56653b.length();
                }
            } else {
                if (underlineToggle) {
                    return;
                }
                this.f56653b.setSpan(new UnderlineSpan(), this.f56668q, this.f56653b.length(), 33);
                this.f56668q = -1;
            }
        }

        public void n(int foregroundColor, int backgroundColor, int edgeColor) {
            if (this.f56669r != -1 && this.f56670s != foregroundColor) {
                this.f56653b.setSpan(new ForegroundColorSpan(this.f56670s), this.f56669r, this.f56653b.length(), 33);
            }
            if (foregroundColor != L) {
                this.f56669r = this.f56653b.length();
                this.f56670s = foregroundColor;
            }
            if (this.f56671t != -1 && this.f56672u != backgroundColor) {
                this.f56653b.setSpan(new BackgroundColorSpan(this.f56672u), this.f56671t, this.f56653b.length(), 33);
            }
            if (backgroundColor != M) {
                this.f56671t = this.f56653b.length();
                this.f56672u = backgroundColor;
            }
        }

        public void o(int row, int column) {
            if (this.f56673v != row) {
                a('\n');
            }
            this.f56673v = row;
        }

        public void p(boolean visible) {
            this.f56655d = visible;
        }

        public void q(int fillColor, int borderColor, boolean wordWrapToggle, int borderType, int printDirection, int scrollDirection, int justification) {
            this.f56666o = fillColor;
            this.f56663l = justification;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f56674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f56675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f56676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f56677d = 0;

        public b(int sequenceNumber, int packetSize) {
            this.f56674a = sequenceNumber;
            this.f56675b = packetSize;
            this.f56676c = new byte[(packetSize * 2) - 1];
        }
    }

    public c(int accessibilityChannel, List<byte[]> initializationData) {
        this.f56638k = accessibilityChannel == -1 ? 1 : accessibilityChannel;
        this.f56639l = new a[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f56639l[i10] = new a();
        }
        this.f56640m = this.f56639l[0];
        C();
    }

    private void A() {
        int iH = a.h(this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2));
        int iH2 = this.f56637j.h(2);
        int iG = a.g(this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2));
        if (this.f56637j.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f56637j.g();
        int iH3 = this.f56637j.h(2);
        int iH4 = this.f56637j.h(2);
        int iH5 = this.f56637j.h(2);
        this.f56637j.p(8);
        this.f56640m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void B() {
        b bVar = this.f56643p;
        int i10 = bVar.f56677d;
        int i11 = bVar.f56675b;
        if (i10 != (i11 * 2) - 1) {
            int i12 = bVar.f56674a;
            StringBuilder sb2 = new StringBuilder(131);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i11 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i10);
            sb2.append(" (sequence number ");
            sb2.append(i12);
            sb2.append("); ignoring packet");
            p.l(f56618r, sb2.toString());
            return;
        }
        this.f56637j.m(bVar.f56676c, i10);
        int iH = this.f56637j.h(3);
        int iH2 = this.f56637j.h(5);
        if (iH == 7) {
            this.f56637j.p(2);
            iH = this.f56637j.h(6);
            if (iH < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(iH);
                p.l(f56618r, sb3.toString());
            }
        }
        if (iH2 == 0) {
            if (iH != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(iH);
                sb4.append(") when blockSize is 0");
                p.l(f56618r, sb4.toString());
                return;
            }
            return;
        }
        if (iH != this.f56638k) {
            return;
        }
        boolean z10 = false;
        while (this.f56637j.b() > 0) {
            int iH3 = this.f56637j.h(8);
            if (iH3 == 16) {
                int iH4 = this.f56637j.h(8);
                if (iH4 <= 31) {
                    q(iH4);
                } else {
                    if (iH4 <= 127) {
                        v(iH4);
                    } else if (iH4 <= 159) {
                        r(iH4);
                    } else if (iH4 <= 255) {
                        w(iH4);
                    } else {
                        StringBuilder sb5 = new StringBuilder(37);
                        sb5.append("Invalid extended command: ");
                        sb5.append(iH4);
                        p.l(f56618r, sb5.toString());
                    }
                    z10 = true;
                }
            } else if (iH3 <= 31) {
                o(iH3);
            } else {
                if (iH3 <= 127) {
                    t(iH3);
                } else if (iH3 <= 159) {
                    p(iH3);
                } else if (iH3 <= 255) {
                    u(iH3);
                } else {
                    StringBuilder sb6 = new StringBuilder(33);
                    sb6.append("Invalid base command: ");
                    sb6.append(iH3);
                    p.l(f56618r, sb6.toString());
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f56641n = n();
        }
    }

    private void C() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f56639l[i10].l();
        }
    }

    private void m() {
        if (this.f56643p == null) {
            return;
        }
        B();
        this.f56643p = null;
    }

    private List<androidx.media2.exoplayer.external.text.b> n() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f56639l[i10].j() && this.f56639l[i10].k()) {
                arrayList.add(this.f56639l[i10].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void o(int command) {
        if (command != 0) {
            if (command == 3) {
                this.f56641n = n();
                return;
            }
            if (command == 8) {
                this.f56640m.b();
                return;
            }
            switch (command) {
                case 12:
                    C();
                    break;
                case 13:
                    this.f56640m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (command >= 17 && command <= 23) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb2.append(command);
                        p.l(f56618r, sb2.toString());
                        this.f56637j.p(8);
                    } else if (command >= 24 && command <= 31) {
                        StringBuilder sb3 = new StringBuilder(54);
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(command);
                        p.l(f56618r, sb3.toString());
                        this.f56637j.p(16);
                    } else {
                        StringBuilder sb4 = new StringBuilder(31);
                        sb4.append("Invalid C0 command: ");
                        sb4.append(command);
                        p.l(f56618r, sb4.toString());
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void p(int command) {
        int i10 = 1;
        switch (command) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i11 = command - 128;
                if (this.f56644q != i11) {
                    this.f56644q = i11;
                    this.f56640m = this.f56639l[i11];
                }
                break;
            case 136:
                while (i10 <= 8) {
                    if (this.f56637j.g()) {
                        this.f56639l[8 - i10].e();
                    }
                    i10++;
                }
                break;
            case 137:
                for (int i12 = 1; i12 <= 8; i12++) {
                    if (this.f56637j.g()) {
                        this.f56639l[8 - i12].p(true);
                    }
                }
                break;
            case 138:
                while (i10 <= 8) {
                    if (this.f56637j.g()) {
                        int i13 = 7 ^ 0;
                        this.f56639l[8 - i10].p(false);
                    }
                    i10++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f56637j.g()) {
                        a aVar = this.f56639l[8 - i14];
                        aVar.p(!aVar.k());
                    }
                }
                break;
            case 140:
                while (i10 <= 8) {
                    if (this.f56637j.g()) {
                        this.f56639l[8 - i10].l();
                    }
                    i10++;
                }
                break;
            case 141:
                this.f56637j.p(8);
                break;
            case 142:
                break;
            case 143:
                C();
                break;
            case 144:
                if (this.f56640m.i()) {
                    x();
                } else {
                    this.f56637j.p(16);
                }
                break;
            case 145:
                if (this.f56640m.i()) {
                    y();
                } else {
                    this.f56637j.p(24);
                }
                break;
            case 146:
                if (this.f56640m.i()) {
                    z();
                } else {
                    this.f56637j.p(16);
                }
                break;
            case com.planner5d.library.engine.input.f.b.F1 /* 147 */:
            case com.planner5d.library.engine.input.f.b.G1 /* 148 */:
            case com.planner5d.library.engine.input.f.b.H1 /* 149 */:
            case 150:
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid C1 command: ");
                sb2.append(command);
                p.l(f56618r, sb2.toString());
                break;
            case 151:
                if (this.f56640m.i()) {
                    A();
                } else {
                    this.f56637j.p(32);
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
                int i15 = command - 152;
                s(i15);
                if (this.f56644q != i15) {
                    this.f56644q = i15;
                    this.f56640m = this.f56639l[i15];
                }
                break;
        }
    }

    private void q(int command) {
        if (command <= 7) {
            return;
        }
        if (command <= 15) {
            this.f56637j.p(8);
        } else if (command <= 23) {
            this.f56637j.p(16);
        } else if (command <= 31) {
            this.f56637j.p(24);
        }
    }

    private void r(int command) {
        if (command <= 135) {
            this.f56637j.p(32);
            return;
        }
        if (command <= 143) {
            this.f56637j.p(40);
            return;
        }
        if (command <= 159) {
            this.f56637j.p(2);
            this.f56637j.p(this.f56637j.h(6) * 8);
        }
    }

    private void s(int window) {
        a aVar = this.f56639l[window];
        this.f56637j.p(2);
        boolean zG = this.f56637j.g();
        boolean zG2 = this.f56637j.g();
        boolean zG3 = this.f56637j.g();
        int iH = this.f56637j.h(3);
        boolean zG4 = this.f56637j.g();
        int iH2 = this.f56637j.h(7);
        int iH3 = this.f56637j.h(8);
        int iH4 = this.f56637j.h(4);
        int iH5 = this.f56637j.h(4);
        this.f56637j.p(2);
        int iH6 = this.f56637j.h(6);
        this.f56637j.p(2);
        aVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f56637j.h(3), this.f56637j.h(3));
    }

    private void t(int characterCode) {
        if (characterCode == 127) {
            this.f56640m.a((char) 9835);
        } else {
            this.f56640m.a((char) (characterCode & 255));
        }
    }

    private void u(int characterCode) {
        this.f56640m.a((char) (characterCode & 255));
    }

    private void v(int characterCode) {
        if (characterCode == 32) {
            this.f56640m.a(' ');
            return;
        }
        if (characterCode == 33) {
            this.f56640m.a(b0.f313282g);
            return;
        }
        if (characterCode == 37) {
            this.f56640m.a(b0.F);
            return;
        }
        if (characterCode == 42) {
            this.f56640m.a((char) 352);
            return;
        }
        if (characterCode == 44) {
            this.f56640m.a((char) 338);
            return;
        }
        if (characterCode == 63) {
            this.f56640m.a((char) 376);
            return;
        }
        if (characterCode == 57) {
            this.f56640m.a(b0.J);
            return;
        }
        if (characterCode == 58) {
            this.f56640m.a((char) 353);
            return;
        }
        if (characterCode == 60) {
            this.f56640m.a((char) 339);
            return;
        }
        if (characterCode == 61) {
            this.f56640m.a((char) 8480);
            return;
        }
        switch (characterCode) {
            case 48:
                this.f56640m.a((char) 9608);
                break;
            case 49:
                this.f56640m.a(b0.f313298w);
                break;
            case 50:
                this.f56640m.a(b0.f313299x);
                break;
            case 51:
                this.f56640m.a(b0.f313301z);
                break;
            case 52:
                this.f56640m.a(b0.A);
                break;
            case 53:
                this.f56640m.a(b0.E);
                break;
            default:
                switch (characterCode) {
                    case I0 /* 118 */:
                        this.f56640m.a((char) 8539);
                        break;
                    case J0 /* 119 */:
                        this.f56640m.a((char) 8540);
                        break;
                    case 120:
                        this.f56640m.a((char) 8541);
                        break;
                    case L0 /* 121 */:
                        this.f56640m.a((char) 8542);
                        break;
                    case M0 /* 122 */:
                        this.f56640m.a((char) 9474);
                        break;
                    case N0 /* 123 */:
                        this.f56640m.a((char) 9488);
                        break;
                    case O0 /* 124 */:
                        this.f56640m.a((char) 9492);
                        break;
                    case P0 /* 125 */:
                        this.f56640m.a((char) 9472);
                        break;
                    case 126:
                        this.f56640m.a((char) 9496);
                        break;
                    case 127:
                        this.f56640m.a((char) 9484);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Invalid G2 character: ");
                        sb2.append(characterCode);
                        p.l(f56618r, sb2.toString());
                        break;
                }
                break;
        }
    }

    private void w(int characterCode) {
        if (characterCode == 160) {
            this.f56640m.a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(characterCode);
        p.l(f56618r, sb2.toString());
        this.f56640m.a('_');
    }

    private void x() {
        int i10 = 6 >> 3;
        this.f56640m.m(this.f56637j.h(4), this.f56637j.h(2), this.f56637j.h(2), this.f56637j.g(), this.f56637j.g(), this.f56637j.h(3), this.f56637j.h(3));
    }

    private void y() {
        int iH = a.h(this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2));
        int iH2 = a.h(this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2));
        this.f56637j.p(2);
        this.f56640m.n(iH, iH2, a.g(this.f56637j.h(2), this.f56637j.h(2), this.f56637j.h(2)));
    }

    private void z() {
        this.f56637j.p(4);
        int iH = this.f56637j.h(4);
        this.f56637j.p(2);
        this.f56640m.o(iH, this.f56637j.h(6));
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.text.f
    public /* bridge */ /* synthetic */ void d(long positionUs) {
        super.d(positionUs);
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    protected androidx.media2.exoplayer.external.text.e e() {
        List<androidx.media2.exoplayer.external.text.b> list = this.f56641n;
        this.f56642o = list;
        return new f(list);
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    protected void f(i inputBuffer) {
        this.f56636i.O(inputBuffer.f53789c.array(), inputBuffer.f53789c.limit());
        while (this.f56636i.a() >= 3) {
            int iD = this.f56636i.D();
            int i10 = iD & 3;
            boolean z10 = (iD & 4) == 4;
            byte bD = (byte) this.f56636i.D();
            byte bD2 = (byte) this.f56636i.D();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        m();
                        int i11 = (bD & h.a.f339269e) >> 6;
                        int i12 = bD & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        b bVar = new b(i11, i12);
                        this.f56643p = bVar;
                        byte[] bArr = bVar.f56676c;
                        int i13 = bVar.f56677d;
                        bVar.f56677d = i13 + 1;
                        bArr[i13] = bD2;
                    } else {
                        androidx.media2.exoplayer.external.util.a.a(i10 == 2);
                        b bVar2 = this.f56643p;
                        if (bVar2 == null) {
                            p.d(f56618r, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = bVar2.f56676c;
                            int i14 = bVar2.f56677d;
                            int i15 = i14 + 1;
                            bVar2.f56677d = i15;
                            bArr2[i14] = bD;
                            bVar2.f56677d = i14 + 2;
                            bArr2[i15] = bD2;
                        }
                    }
                    b bVar3 = this.f56643p;
                    if (bVar3.f56677d == (bVar3.f56675b * 2) - 1) {
                        m();
                    }
                }
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.decoder.c
    public void flush() {
        super.flush();
        this.f56641n = null;
        this.f56642o = null;
        this.f56644q = 0;
        this.f56640m = this.f56639l[0];
        C();
        this.f56643p = null;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ i c() throws androidx.media2.exoplayer.external.text.g {
        return super.c();
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.decoder.c
    public String getName() {
        return f56618r;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ j a() throws androidx.media2.exoplayer.external.text.g {
        return super.a();
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    protected boolean i() {
        return this.f56641n != this.f56642o;
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void b(i inputBuffer) throws androidx.media2.exoplayer.external.text.g {
        super.b(inputBuffer);
    }

    @Override // androidx.media2.exoplayer.external.text.cea.e, androidx.media2.exoplayer.external.decoder.c
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
