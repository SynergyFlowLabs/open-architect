package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.t;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static final int A = 0;
    private static final int A0 = 28;
    private static final int A1 = 80;
    public static final int B = 1;
    private static final int B0 = 29;
    private static final int B1 = 81;
    public static final int C = 0;
    private static final int C0 = 30;
    private static final int C1 = 82;
    public static final int D = 1;
    private static final int D0 = 31;
    private static final int D1 = 83;
    public static final int E = 0;
    private static final int E0 = 32;
    private static final int E1 = 84;
    public static final int F = 4;
    private static final int F0 = 33;
    private static final int F1 = 85;
    public static final int G = 8;
    private static final int G0 = 34;
    private static final int G1 = 86;
    public static final int H = 1;
    private static final int H0 = 35;
    private static final int H1 = 87;
    public static final int I = 2;
    private static final int I0 = 36;
    private static final int I1 = 88;
    public static final int J = 3;
    private static final int J0 = 37;
    private static final int J1 = 89;
    public static final int K = 4;
    private static final int K0 = 38;
    private static final int K1 = 90;
    public static final int L = 5;
    private static final int L0 = 39;
    private static final int L1 = 91;
    public static final int M = 6;
    private static final int M0 = 40;
    private static final int M1 = 92;
    public static final int N = 7;
    private static final int N0 = 41;
    private static final int N1 = 93;
    public static final int O = 8;
    private static final int O0 = 42;
    private static final int O1 = 94;
    public static final int P = 0;
    private static final int P0 = 43;
    private static final int P1 = 95;
    public static final int Q = 1;
    private static final int Q0 = 44;
    private static final int Q1 = 96;
    public static final int R = 0;
    private static final int R0 = 45;
    private static final int R1 = 97;
    public static final int S = 1;
    private static final int S0 = 46;
    private static final int S1 = 98;
    public static final int T = 2;
    private static final int T0 = 47;
    private static final int T1 = 99;
    private static final boolean U = false;
    private static final int U0 = 48;
    private static final String U1 = "weight";
    private static final int V0 = 49;
    private static final String V1 = "ratio";
    private static final int W = 1;
    private static final int W0 = 50;
    private static final String W1 = "parent";
    private static final int X0 = 51;
    private static final int Y0 = 52;
    private static final int Z = 1;
    private static final int Z0 = 53;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f45844a0 = 2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int f45845a1 = 54;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f45846b0 = 3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final int f45847b1 = 55;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f45848c0 = 4;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int f45849c1 = 56;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f45850d0 = 5;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final int f45851d1 = 57;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f45852e0 = 6;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int f45853e1 = 58;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f45854f0 = 7;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final int f45855f1 = 59;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f45856g0 = 8;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f45857g1 = 60;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f45858h0 = 9;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final int f45859h1 = 61;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45860i = "ConstraintSet";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f45861i0 = 10;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f45862i1 = 62;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45863j = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f45864j0 = 11;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final int f45865j1 = 63;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f45866k = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f45867k0 = 12;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final int f45868k1 = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f45869l = -2;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f45870l0 = 13;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int f45871l1 = 65;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f45872m = -3;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f45873m0 = 14;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f45874m1 = 66;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f45875n = -4;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f45876n0 = 15;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final int f45877n1 = 67;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f45878o = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f45879o0 = 16;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int f45880o1 = 68;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f45881p = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f45882p0 = 17;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f45883p1 = 69;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f45884q = 2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f45885q0 = 18;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final int f45886q1 = 70;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f45887r = 3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f45888r0 = 19;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final int f45889r1 = 71;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f45890s = 4;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f45891s0 = 20;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final int f45892s1 = 72;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f45893t = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f45894t0 = 21;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int f45895t1 = 73;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f45896u = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f45897u0 = 22;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final int f45898u1 = 74;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f45899v = -2;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f45900v0 = 23;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final int f45901v1 = 75;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f45902w = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f45903w0 = 24;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final int f45904w1 = 76;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f45905x = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f45906x0 = 25;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f45907x1 = 77;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f45908y = 2;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f45909y0 = 26;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f45910y1 = 78;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f45911z = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f45912z0 = 27;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final int f45913z1 = 79;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45916c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f45917d = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45918e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f45919f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45920g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap<Integer, a> f45921h = new HashMap<>();
    private static final int[] V = {0, 4, 8};
    private static SparseIntArray X = new SparseIntArray();
    private static SparseIntArray Y = new SparseIntArray();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f45923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f45924c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f45925d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f45926e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f45927f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f45928g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C0370a f45929h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.f$a$a, reason: collision with other inner class name */
        static class C0370a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f45930m = 4;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final int f45931n = 10;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static final int f45932o = 10;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private static final int f45933p = 5;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f45934a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f45935b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f45936c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f45937d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f45938e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f45939f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int[] f45940g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            String[] f45941h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f45942i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int[] f45943j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            boolean[] f45944k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f45945l = 0;

            C0370a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f45939f;
                int[] iArr = this.f45937d;
                if (i11 >= iArr.length) {
                    this.f45937d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f45938e;
                    this.f45938e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f45937d;
                int i12 = this.f45939f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f45938e;
                this.f45939f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f45936c;
                int[] iArr = this.f45934a;
                if (i12 >= iArr.length) {
                    this.f45934a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f45935b;
                    this.f45935b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f45934a;
                int i13 = this.f45936c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f45935b;
                this.f45936c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f45942i;
                int[] iArr = this.f45940g;
                if (i11 >= iArr.length) {
                    this.f45940g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f45941h;
                    this.f45941h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f45940g;
                int i12 = this.f45942i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f45941h;
                this.f45942i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f45945l;
                int[] iArr = this.f45943j;
                if (i11 >= iArr.length) {
                    this.f45943j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f45944k;
                    this.f45944k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f45943j;
                int i12 = this.f45945l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f45944k;
                this.f45945l = i12 + 1;
                zArr2[i12] = z10;
            }

            void e(a aVar) {
                for (int i10 = 0; i10 < this.f45936c; i10++) {
                    f.V0(aVar, this.f45934a[i10], this.f45935b[i10]);
                }
                for (int i11 = 0; i11 < this.f45939f; i11++) {
                    f.U0(aVar, this.f45937d[i11], this.f45938e[i11]);
                }
                for (int i12 = 0; i12 < this.f45942i; i12++) {
                    f.W0(aVar, this.f45940g[i12], this.f45941h[i12]);
                }
                for (int i13 = 0; i13 < this.f45945l; i13++) {
                    f.X0(aVar, this.f45943j[i13], this.f45944k[i13]);
                }
            }

            @e.a({"LogConditional"})
            void f(String str) {
                for (int i10 = 0; i10 < this.f45936c; i10++) {
                    int i11 = this.f45934a[i10];
                    int i12 = this.f45935b[i10];
                }
                for (int i13 = 0; i13 < this.f45939f; i13++) {
                    int i14 = this.f45937d[i13];
                    float f10 = this.f45938e[i13];
                }
                for (int i15 = 0; i15 < this.f45942i; i15++) {
                    int i16 = this.f45940g[i15];
                    String str2 = this.f45941h[i15];
                }
                for (int i17 = 0; i17 < this.f45945l; i17++) {
                    int i18 = this.f45943j[i17];
                    boolean z10 = this.f45944k[i17];
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int i10, ConstraintLayout.b bVar) {
            this.f45922a = i10;
            b bVar2 = this.f45926e;
            bVar2.f45999j = bVar.f45681e;
            bVar2.f46001k = bVar.f45683f;
            bVar2.f46003l = bVar.f45685g;
            bVar2.f46005m = bVar.f45687h;
            bVar2.f46007n = bVar.f45689i;
            bVar2.f46009o = bVar.f45691j;
            bVar2.f46011p = bVar.f45693k;
            bVar2.f46013q = bVar.f45695l;
            bVar2.f46015r = bVar.f45697m;
            bVar2.f46016s = bVar.f45699n;
            bVar2.f46017t = bVar.f45701o;
            bVar2.f46018u = bVar.f45709s;
            bVar2.f46019v = bVar.f45711t;
            bVar2.f46020w = bVar.f45713u;
            bVar2.f46021x = bVar.f45715v;
            bVar2.f46022y = bVar.G;
            bVar2.f46023z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f45703p;
            bVar2.C = bVar.f45705q;
            bVar2.D = bVar.f45707r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f45995h = bVar.f45677c;
            bVar2.f45991f = bVar.f45673a;
            bVar2.f45993g = bVar.f45675b;
            bVar2.f45987d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f45989e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f46008n0 = bVar.f45674a0;
            bVar2.f46010o0 = bVar.f45676b0;
            bVar2.Z = bVar.P;
            bVar2.f45982a0 = bVar.Q;
            bVar2.f45984b0 = bVar.T;
            bVar2.f45986c0 = bVar.U;
            bVar2.f45988d0 = bVar.R;
            bVar2.f45990e0 = bVar.S;
            bVar2.f45992f0 = bVar.V;
            bVar2.f45994g0 = bVar.W;
            bVar2.f46006m0 = bVar.f45678c0;
            bVar2.P = bVar.f45719x;
            bVar2.R = bVar.f45721z;
            bVar2.O = bVar.f45717w;
            bVar2.Q = bVar.f45720y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f46014q0 = bVar.f45680d0;
            bVar2.L = bVar.getMarginEnd();
            this.f45926e.M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i10, androidx.constraintlayout.widget.g.a aVar) {
            k(i10, aVar);
            this.f45924c.f46053d = aVar.V0;
            e eVar = this.f45927f;
            eVar.f46068b = aVar.Y0;
            eVar.f46069c = aVar.Z0;
            eVar.f46070d = aVar.f46113a1;
            eVar.f46071e = aVar.f46114b1;
            eVar.f46072f = aVar.f46115c1;
            eVar.f46073g = aVar.f46116d1;
            eVar.f46074h = aVar.f46117e1;
            eVar.f46076j = aVar.f46118f1;
            eVar.f46077k = aVar.f46119g1;
            eVar.f46078l = aVar.f46120h1;
            eVar.f46080n = aVar.X0;
            eVar.f46079m = aVar.W0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(androidx.constraintlayout.widget.b bVar, int i10, androidx.constraintlayout.widget.g.a aVar) {
            l(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f45926e;
                bVar2.f46000j0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f45996h0 = barrier.getType();
                this.f45926e.f46002k0 = barrier.getReferencedIds();
                this.f45926e.f45998i0 = barrier.getMargin();
            }
        }

        private androidx.constraintlayout.widget.a n(String str, androidx.constraintlayout.widget.a.EnumC0369a enumC0369a) {
            if (!this.f45928g.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(str, enumC0369a);
                this.f45928g.put(str, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f45928g.get(str);
            if (aVar2.j() == enumC0369a) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.j().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(String str, int i10) {
            n(str, androidx.constraintlayout.widget.a.EnumC0369a.COLOR_TYPE).s(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String str, float f10) {
            n(str, androidx.constraintlayout.widget.a.EnumC0369a.FLOAT_TYPE).t(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(String str, int i10) {
            n(str, androidx.constraintlayout.widget.a.EnumC0369a.INT_TYPE).u(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(String str, String str2) {
            n(str, androidx.constraintlayout.widget.a.EnumC0369a.STRING_TYPE).v(str2);
        }

        public void h(a aVar) {
            C0370a c0370a = this.f45929h;
            if (c0370a != null) {
                c0370a.e(aVar);
            }
        }

        public void i(ConstraintLayout.b bVar) {
            b bVar2 = this.f45926e;
            bVar.f45681e = bVar2.f45999j;
            bVar.f45683f = bVar2.f46001k;
            bVar.f45685g = bVar2.f46003l;
            bVar.f45687h = bVar2.f46005m;
            bVar.f45689i = bVar2.f46007n;
            bVar.f45691j = bVar2.f46009o;
            bVar.f45693k = bVar2.f46011p;
            bVar.f45695l = bVar2.f46013q;
            bVar.f45697m = bVar2.f46015r;
            bVar.f45699n = bVar2.f46016s;
            bVar.f45701o = bVar2.f46017t;
            bVar.f45709s = bVar2.f46018u;
            bVar.f45711t = bVar2.f46019v;
            bVar.f45713u = bVar2.f46020w;
            bVar.f45715v = bVar2.f46021x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f45719x = bVar2.P;
            bVar.f45721z = bVar2.R;
            bVar.G = bVar2.f46022y;
            bVar.H = bVar2.f46023z;
            bVar.f45703p = bVar2.B;
            bVar.f45705q = bVar2.C;
            bVar.f45707r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f45674a0 = bVar2.f46008n0;
            bVar.f45676b0 = bVar2.f46010o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f45982a0;
            bVar.T = bVar2.f45984b0;
            bVar.U = bVar2.f45986c0;
            bVar.R = bVar2.f45988d0;
            bVar.S = bVar2.f45990e0;
            bVar.V = bVar2.f45992f0;
            bVar.W = bVar2.f45994g0;
            bVar.Z = bVar2.G;
            bVar.f45677c = bVar2.f45995h;
            bVar.f45673a = bVar2.f45991f;
            bVar.f45675b = bVar2.f45993g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f45987d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f45989e;
            String str = bVar2.f46006m0;
            if (str != null) {
                bVar.f45678c0 = str;
            }
            bVar.f45680d0 = bVar2.f46014q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f45926e.L);
            bVar.e();
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f45926e.a(this.f45926e);
            aVar.f45925d.a(this.f45925d);
            aVar.f45924c.a(this.f45924c);
            aVar.f45927f.a(this.f45927f);
            aVar.f45922a = this.f45922a;
            aVar.f45929h = this.f45929h;
            return aVar;
        }

        public void o(String str) {
            C0370a c0370a = this.f45929h;
            if (c0370a != null) {
                c0370a.f(str);
            }
        }
    }

    public static class b {
        private static final int A0 = 7;
        private static final int A1 = 82;
        private static final int B0 = 8;
        private static final int B1 = 83;
        private static final int C0 = 9;
        private static final int C1 = 84;
        private static final int D0 = 10;
        private static final int D1 = 85;
        private static final int E0 = 11;
        private static final int E1 = 86;
        private static final int F0 = 12;
        private static final int F1 = 87;
        private static final int G0 = 13;
        private static final int G1 = 88;
        private static final int H0 = 14;
        private static final int H1 = 89;
        private static final int I0 = 15;
        private static final int I1 = 90;
        private static final int J0 = 16;
        private static final int J1 = 91;
        private static final int K0 = 17;
        private static final int L0 = 18;
        private static final int M0 = 19;
        private static final int N0 = 20;
        private static final int O0 = 21;
        private static final int P0 = 22;
        private static final int Q0 = 23;
        private static final int R0 = 24;
        private static final int S0 = 25;
        private static final int T0 = 26;
        private static final int U0 = 27;
        private static final int V0 = 28;
        private static final int W0 = 29;
        private static final int X0 = 30;
        private static final int Y0 = 31;
        private static final int Z0 = 32;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final int f45946a1 = 33;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        private static final int f45947b1 = 34;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        private static final int f45948c1 = 35;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        private static final int f45949d1 = 36;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static final int f45950e1 = 37;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        private static final int f45951f1 = 38;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private static final int f45952g1 = 39;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private static final int f45953h1 = 40;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        private static final int f45954i1 = 41;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        private static final int f45955j1 = 42;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private static final int f45956k1 = 61;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        private static final int f45957l1 = 62;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        private static final int f45958m1 = 63;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        private static final int f45959n1 = 69;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        private static final int f45960o1 = 70;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private static final int f45961p1 = 71;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        private static final int f45962q1 = 72;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f45963r0 = -1;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        private static final int f45964r1 = 73;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f45965s0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        private static final int f45966s1 = 74;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        private static SparseIntArray f45967t0 = null;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        private static final int f45968t1 = 75;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        private static final int f45969u0 = 1;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        private static final int f45970u1 = 76;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private static final int f45971v0 = 2;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private static final int f45972v1 = 77;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private static final int f45973w0 = 3;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        private static final int f45974w1 = 78;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private static final int f45975x0 = 4;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        private static final int f45976x1 = 79;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private static final int f45977y0 = 5;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        private static final int f45978y1 = 80;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private static final int f45979z0 = 6;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        private static final int f45980z1 = 81;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45989e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f46002k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f46004l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f46006m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45981a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45983b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45985c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45991f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45993g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f45995h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f45997i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f45999j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f46001k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f46003l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f46005m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46007n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f46009o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f46011p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f46013q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f46015r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f46016s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f46017t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f46018u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f46019v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f46020w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f46021x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f46022y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f46023z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f45982a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f45984b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f45986c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f45988d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f45990e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f45992f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f45994g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f45996h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f45998i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f46000j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f46008n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f46010o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f46012p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f46014q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f45967t0 = sparseIntArray;
            sparseIntArray.append(j.c.Vb, 24);
            f45967t0.append(j.c.Wb, 25);
            f45967t0.append(j.c.Yb, 28);
            f45967t0.append(j.c.Zb, 29);
            f45967t0.append(j.c.f46428ec, 35);
            f45967t0.append(j.c.f46411dc, 34);
            f45967t0.append(j.c.Cb, 4);
            f45967t0.append(j.c.Bb, 3);
            f45967t0.append(j.c.f46749xb, 1);
            f45967t0.append(j.c.f46580nc, 6);
            f45967t0.append(j.c.f46597oc, 7);
            f45967t0.append(j.c.Jb, 17);
            f45967t0.append(j.c.Kb, 18);
            f45967t0.append(j.c.Lb, 19);
            f45967t0.append(j.c.f46681tb, 90);
            f45967t0.append(j.c.f46427eb, 26);
            f45967t0.append(j.c.f46360ac, 31);
            f45967t0.append(j.c.f46377bc, 32);
            f45967t0.append(j.c.Ib, 10);
            f45967t0.append(j.c.Hb, 9);
            f45967t0.append(j.c.f46665sc, 13);
            f45967t0.append(j.c.f46716vc, 16);
            f45967t0.append(j.c.f46682tc, 14);
            f45967t0.append(j.c.f46631qc, 11);
            f45967t0.append(j.c.f46699uc, 15);
            f45967t0.append(j.c.f46648rc, 12);
            f45967t0.append(j.c.f46479hc, 38);
            f45967t0.append(j.c.Tb, 37);
            f45967t0.append(j.c.Sb, 39);
            f45967t0.append(j.c.f46462gc, 40);
            f45967t0.append(j.c.Rb, 20);
            f45967t0.append(j.c.f46445fc, 36);
            f45967t0.append(j.c.Gb, 5);
            f45967t0.append(j.c.Ub, 91);
            f45967t0.append(j.c.f46394cc, 91);
            f45967t0.append(j.c.Xb, 91);
            f45967t0.append(j.c.Ab, 91);
            f45967t0.append(j.c.f46732wb, 91);
            f45967t0.append(j.c.f46478hb, 23);
            f45967t0.append(j.c.f46511jb, 27);
            f45967t0.append(j.c.f46545lb, 30);
            f45967t0.append(j.c.f46562mb, 8);
            f45967t0.append(j.c.f46495ib, 33);
            f45967t0.append(j.c.f46528kb, 2);
            f45967t0.append(j.c.f46444fb, 22);
            f45967t0.append(j.c.f46461gb, 21);
            f45967t0.append(j.c.f46496ic, 41);
            f45967t0.append(j.c.Mb, 42);
            f45967t0.append(j.c.f46715vb, 87);
            f45967t0.append(j.c.f46698ub, 88);
            f45967t0.append(j.c.f46750xc, 76);
            f45967t0.append(j.c.Db, 61);
            f45967t0.append(j.c.Fb, 62);
            f45967t0.append(j.c.Eb, 63);
            f45967t0.append(j.c.f46563mc, 69);
            f45967t0.append(j.c.Qb, 70);
            f45967t0.append(j.c.f46630qb, 71);
            f45967t0.append(j.c.f46596ob, 72);
            f45967t0.append(j.c.f46613pb, 73);
            f45967t0.append(j.c.f46647rb, 74);
            f45967t0.append(j.c.f46579nb, 75);
            f45967t0.append(j.c.f46529kc, 84);
            f45967t0.append(j.c.f46546lc, 86);
            f45967t0.append(j.c.f46529kc, 83);
            f45967t0.append(j.c.Pb, 85);
            f45967t0.append(j.c.f46496ic, 87);
            f45967t0.append(j.c.Mb, 88);
            f45967t0.append(j.c.f46707v3, 89);
            f45967t0.append(j.c.f46681tb, 90);
        }

        public b() {
            int i10 = 7 ^ 1;
        }

        public void a(b bVar) {
            this.f45981a = bVar.f45981a;
            this.f45987d = bVar.f45987d;
            this.f45983b = bVar.f45983b;
            this.f45989e = bVar.f45989e;
            this.f45991f = bVar.f45991f;
            this.f45993g = bVar.f45993g;
            this.f45995h = bVar.f45995h;
            this.f45997i = bVar.f45997i;
            this.f45999j = bVar.f45999j;
            this.f46001k = bVar.f46001k;
            this.f46003l = bVar.f46003l;
            this.f46005m = bVar.f46005m;
            this.f46007n = bVar.f46007n;
            this.f46009o = bVar.f46009o;
            this.f46011p = bVar.f46011p;
            this.f46013q = bVar.f46013q;
            this.f46015r = bVar.f46015r;
            this.f46016s = bVar.f46016s;
            this.f46017t = bVar.f46017t;
            this.f46018u = bVar.f46018u;
            this.f46019v = bVar.f46019v;
            this.f46020w = bVar.f46020w;
            this.f46021x = bVar.f46021x;
            this.f46022y = bVar.f46022y;
            this.f46023z = bVar.f46023z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f45982a0 = bVar.f45982a0;
            this.f45984b0 = bVar.f45984b0;
            this.f45986c0 = bVar.f45986c0;
            this.f45988d0 = bVar.f45988d0;
            this.f45990e0 = bVar.f45990e0;
            this.f45992f0 = bVar.f45992f0;
            this.f45994g0 = bVar.f45994g0;
            this.f45996h0 = bVar.f45996h0;
            this.f45998i0 = bVar.f45998i0;
            this.f46000j0 = bVar.f46000j0;
            this.f46006m0 = bVar.f46006m0;
            int[] iArr = bVar.f46002k0;
            if (iArr == null || bVar.f46004l0 != null) {
                this.f46002k0 = null;
            } else {
                this.f46002k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f46004l0 = bVar.f46004l0;
            this.f46008n0 = bVar.f46008n0;
            this.f46010o0 = bVar.f46010o0;
            this.f46012p0 = bVar.f46012p0;
            this.f46014q0 = bVar.f46014q0;
        }

        public void b(t tVar, StringBuilder sb2) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objY = tVar.Y(num.intValue());
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(objY == null ? num : objY);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f10 = (Float) obj;
                            if (f10.floatValue() != -1.0f) {
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f10);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }

        void c(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.f46410db);
            this.f45983b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f45967t0.get(index);
                switch (i11) {
                    case 1:
                        this.f46015r = f.A0(typedArrayObtainStyledAttributes, index, this.f46015r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f46013q = f.A0(typedArrayObtainStyledAttributes, index, this.f46013q);
                        break;
                    case 4:
                        this.f46011p = f.A0(typedArrayObtainStyledAttributes, index, this.f46011p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f46021x = f.A0(typedArrayObtainStyledAttributes, index, this.f46021x);
                        break;
                    case 10:
                        this.f46020w = f.A0(typedArrayObtainStyledAttributes, index, this.f46020w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f45991f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f45991f);
                        break;
                    case 18:
                        this.f45993g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f45993g);
                        break;
                    case 19:
                        this.f45995h = typedArrayObtainStyledAttributes.getFloat(index, this.f45995h);
                        break;
                    case 20:
                        this.f46022y = typedArrayObtainStyledAttributes.getFloat(index, this.f46022y);
                        break;
                    case 21:
                        this.f45989e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f45989e);
                        break;
                    case 22:
                        this.f45987d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f45987d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f45999j = f.A0(typedArrayObtainStyledAttributes, index, this.f45999j);
                        break;
                    case 25:
                        this.f46001k = f.A0(typedArrayObtainStyledAttributes, index, this.f46001k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f46003l = f.A0(typedArrayObtainStyledAttributes, index, this.f46003l);
                        break;
                    case 29:
                        this.f46005m = f.A0(typedArrayObtainStyledAttributes, index, this.f46005m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f46018u = f.A0(typedArrayObtainStyledAttributes, index, this.f46018u);
                        break;
                    case 32:
                        this.f46019v = f.A0(typedArrayObtainStyledAttributes, index, this.f46019v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f46009o = f.A0(typedArrayObtainStyledAttributes, index, this.f46009o);
                        break;
                    case 35:
                        this.f46007n = f.A0(typedArrayObtainStyledAttributes, index, this.f46007n);
                        break;
                    case 36:
                        this.f46023z = typedArrayObtainStyledAttributes.getFloat(index, this.f46023z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        f.D0(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        f.D0(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = f.A0(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f45992f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f45994g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f45996h0 = typedArrayObtainStyledAttributes.getInt(index, this.f45996h0);
                                        break;
                                    case 73:
                                        this.f45998i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45998i0);
                                        break;
                                    case 74:
                                        this.f46004l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f46012p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f46012p0);
                                        break;
                                    case 76:
                                        this.f46014q0 = typedArrayObtainStyledAttributes.getInt(index, this.f46014q0);
                                        break;
                                    case 77:
                                        this.f46016s = f.A0(typedArrayObtainStyledAttributes, index, this.f46016s);
                                        break;
                                    case 78:
                                        this.f46017t = f.A0(typedArrayObtainStyledAttributes, index, this.f46017t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f45982a0 = typedArrayObtainStyledAttributes.getInt(index, this.f45982a0);
                                        break;
                                    case 83:
                                        this.f45986c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45986c0);
                                        break;
                                    case 84:
                                        this.f45984b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45984b0);
                                        break;
                                    case 85:
                                        this.f45990e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45990e0);
                                        break;
                                    case 86:
                                        this.f45988d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f45988d0);
                                        break;
                                    case 87:
                                        this.f46008n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f46008n0);
                                        break;
                                    case 88:
                                        this.f46010o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f46010o0);
                                        break;
                                    case 89:
                                        this.f46006m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f45997i = typedArrayObtainStyledAttributes.getBoolean(index, this.f45997i);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        f45967t0.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        f45967t0.get(index);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {
        private static final int A = 9;
        private static final int B = 10;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f46024o = -2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f46025p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f46026q = -3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static SparseIntArray f46027r = null;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f46028s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f46029t = 2;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f46030u = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f46031v = 4;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f46032w = 5;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f46033x = 6;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f46034y = 7;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f46035z = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46036a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46037b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46038c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f46039d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46040e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46041f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f46042g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f46043h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f46044i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f46045j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f46046k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f46047l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f46048m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46049n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f46027r = sparseIntArray;
            sparseIntArray.append(j.c.Nc, 1);
            f46027r.append(j.c.Pc, 2);
            f46027r.append(j.c.Tc, 3);
            f46027r.append(j.c.Mc, 4);
            f46027r.append(j.c.Lc, 5);
            f46027r.append(j.c.Kc, 6);
            f46027r.append(j.c.Oc, 7);
            f46027r.append(j.c.Sc, 8);
            f46027r.append(j.c.Rc, 9);
            f46027r.append(j.c.Qc, 10);
        }

        public void a(c cVar) {
            this.f46036a = cVar.f46036a;
            this.f46037b = cVar.f46037b;
            this.f46039d = cVar.f46039d;
            this.f46040e = cVar.f46040e;
            this.f46041f = cVar.f46041f;
            this.f46044i = cVar.f46044i;
            this.f46042g = cVar.f46042g;
            this.f46043h = cVar.f46043h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Jc);
            this.f46036a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f46027r.get(index)) {
                    case 1:
                        this.f46044i = typedArrayObtainStyledAttributes.getFloat(index, this.f46044i);
                        break;
                    case 2:
                        this.f46040e = typedArrayObtainStyledAttributes.getInt(index, this.f46040e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f46039d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f46039d = androidx.constraintlayout.core.motion.utils.d.f43750o[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f46041f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f46037b = f.A0(typedArrayObtainStyledAttributes, index, this.f46037b);
                        break;
                    case 6:
                        this.f46038c = typedArrayObtainStyledAttributes.getInteger(index, this.f46038c);
                        break;
                    case 7:
                        this.f46042g = typedArrayObtainStyledAttributes.getFloat(index, this.f46042g);
                        break;
                    case 8:
                        this.f46046k = typedArrayObtainStyledAttributes.getInteger(index, this.f46046k);
                        break;
                    case 9:
                        this.f46045j = typedArrayObtainStyledAttributes.getFloat(index, this.f46045j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        int i12 = (-2) ^ (-1);
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f46049n = resourceId;
                            if (resourceId != -1) {
                                this.f46048m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f46047l = string;
                            if (string.indexOf("/") > 0) {
                                this.f46049n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f46048m = -2;
                            } else {
                                this.f46048m = -1;
                            }
                        } else {
                            this.f46048m = typedArrayObtainStyledAttributes.getInteger(index, this.f46049n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46050a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46051b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46052c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f46053d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f46054e = Float.NaN;

        public void a(d dVar) {
            this.f46050a = dVar.f46050a;
            this.f46051b = dVar.f46051b;
            this.f46053d = dVar.f46053d;
            this.f46054e = dVar.f46054e;
            this.f46052c = dVar.f46052c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.f46650re);
            this.f46050a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == j.c.f46684te) {
                    this.f46053d = typedArrayObtainStyledAttributes.getFloat(index, this.f46053d);
                } else if (index == j.c.f46667se) {
                    this.f46051b = typedArrayObtainStyledAttributes.getInt(index, this.f46051b);
                    this.f46051b = f.V[this.f46051b];
                } else if (index == j.c.f46735we) {
                    this.f46052c = typedArrayObtainStyledAttributes.getInt(index, this.f46052c);
                } else if (index == j.c.f46718ve) {
                    this.f46054e = typedArrayObtainStyledAttributes.getFloat(index, this.f46054e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        private static final int A = 12;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static SparseIntArray f46055o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f46056p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f46057q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f46058r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final int f46059s = 4;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f46060t = 5;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final int f46061u = 6;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f46062v = 7;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f46063w = 8;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f46064x = 9;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f46065y = 10;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f46066z = 11;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46067a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f46068b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f46069c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f46070d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f46071e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f46072f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f46073g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f46074h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f46075i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f46076j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f46077k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f46078l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f46079m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f46080n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f46055o = sparseIntArray;
            sparseIntArray.append(j.c.Ye, 1);
            f46055o.append(j.c.Ze, 2);
            f46055o.append(j.c.f46363af, 3);
            f46055o.append(j.c.We, 4);
            f46055o.append(j.c.Xe, 5);
            f46055o.append(j.c.Se, 6);
            f46055o.append(j.c.Te, 7);
            f46055o.append(j.c.Ue, 8);
            f46055o.append(j.c.Ve, 9);
            f46055o.append(j.c.f46380bf, 10);
            f46055o.append(j.c.f46397cf, 11);
            f46055o.append(j.c.f46414df, 12);
        }

        public void a(e eVar) {
            this.f46067a = eVar.f46067a;
            this.f46068b = eVar.f46068b;
            this.f46069c = eVar.f46069c;
            this.f46070d = eVar.f46070d;
            this.f46071e = eVar.f46071e;
            this.f46072f = eVar.f46072f;
            this.f46073g = eVar.f46073g;
            this.f46074h = eVar.f46074h;
            this.f46075i = eVar.f46075i;
            this.f46076j = eVar.f46076j;
            this.f46077k = eVar.f46077k;
            this.f46078l = eVar.f46078l;
            this.f46079m = eVar.f46079m;
            this.f46080n = eVar.f46080n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Re);
            this.f46067a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f46055o.get(index)) {
                    case 1:
                        this.f46068b = typedArrayObtainStyledAttributes.getFloat(index, this.f46068b);
                        break;
                    case 2:
                        this.f46069c = typedArrayObtainStyledAttributes.getFloat(index, this.f46069c);
                        break;
                    case 3:
                        this.f46070d = typedArrayObtainStyledAttributes.getFloat(index, this.f46070d);
                        break;
                    case 4:
                        this.f46071e = typedArrayObtainStyledAttributes.getFloat(index, this.f46071e);
                        break;
                    case 5:
                        this.f46072f = typedArrayObtainStyledAttributes.getFloat(index, this.f46072f);
                        break;
                    case 6:
                        this.f46073g = typedArrayObtainStyledAttributes.getDimension(index, this.f46073g);
                        break;
                    case 7:
                        this.f46074h = typedArrayObtainStyledAttributes.getDimension(index, this.f46074h);
                        break;
                    case 8:
                        this.f46076j = typedArrayObtainStyledAttributes.getDimension(index, this.f46076j);
                        break;
                    case 9:
                        this.f46077k = typedArrayObtainStyledAttributes.getDimension(index, this.f46077k);
                        break;
                    case 10:
                        this.f46078l = typedArrayObtainStyledAttributes.getDimension(index, this.f46078l);
                        break;
                    case 11:
                        this.f46079m = true;
                        this.f46080n = typedArrayObtainStyledAttributes.getDimension(index, this.f46080n);
                        break;
                    case 12:
                        this.f46075i = f.A0(typedArrayObtainStyledAttributes, index, this.f46075i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.f$f, reason: collision with other inner class name */
    class C0371f {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f46081o = "       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Writer f46082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ConstraintLayout f46083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Context f46084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f46085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46086e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f46087f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f46088g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f46089h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final String f46090i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final String f46091j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final String f46092k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final String f46093l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f46094m = new HashMap<>();

        C0371f(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
            this.f46082a = writer;
            this.f46083b = constraintLayout;
            this.f46084c = constraintLayout.getContext();
            this.f46085d = i10;
        }

        private void e(String str, int i10, int i11, float f10, int i12, int i13, boolean z10) throws IOException {
            if (i10 != 0) {
                if (i10 == -2) {
                    this.f46082a.write(f46081o + str + ": 'wrap'\n");
                    return;
                }
                if (i10 == -1) {
                    this.f46082a.write(f46081o + str + ": 'parent'\n");
                    return;
                }
                this.f46082a.write(f46081o + str + ": " + i10 + ",\n");
                return;
            }
            if (i13 == -1 && i12 == -1) {
                if (i11 == 1) {
                    this.f46082a.write(f46081o + str + ": '???????????',\n");
                    return;
                }
                if (i11 == 2) {
                    this.f46082a.write(f46081o + str + ": '" + f10 + "%',\n");
                }
            } else {
                if (i11 == 0) {
                    this.f46082a.write(f46081o + str + ": {'spread' ," + i12 + ", " + i13 + "}\n");
                    return;
                }
                if (i11 == 1) {
                    this.f46082a.write(f46081o + str + ": {'wrap' ," + i12 + ", " + i13 + "}\n");
                    return;
                }
                if (i11 == 2) {
                    this.f46082a.write(f46081o + str + ": {'" + f10 + "'% ," + i12 + ", " + i13 + "}\n");
                }
            }
        }

        private void f(int i10, int i11, int i12, float f10) throws IOException {
            j("'orientation'", i10);
            j("'guideBegin'", i11);
            j("'guideEnd'", i12);
            h("'guidePercent'", f10);
        }

        String a(int i10) {
            if (this.f46094m.containsKey(Integer.valueOf(i10))) {
                return "'" + this.f46094m.get(Integer.valueOf(i10)) + "'";
            }
            if (i10 == 0) {
                return "'parent'";
            }
            String strB = b(i10);
            this.f46094m.put(Integer.valueOf(i10), strB);
            return "'" + strB + "'";
        }

        String b(int i10) {
            try {
                if (i10 != -1) {
                    return this.f46084c.getResources().getResourceEntryName(i10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i11 = this.f46086e + 1;
                this.f46086e = i11;
                sb2.append(i11);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i12 = this.f46086e + 1;
                this.f46086e = i12;
                sb3.append(i12);
                return sb3.toString();
            }
        }

        void c(int i10, float f10, int i11) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f46082a.write("       circle");
            this.f46082a.write(":[");
            this.f46082a.write(a(i10));
            this.f46082a.write(", " + f10);
            this.f46082a.write(i11 + "]");
        }

        void d(String str, int i10, String str2, int i11, int i12) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(":[");
            this.f46082a.write(a(i10));
            this.f46082a.write(" , ");
            this.f46082a.write(str2);
            if (i11 != 0) {
                this.f46082a.write(" , " + i11);
            }
            this.f46082a.write("],\n");
        }

        void g() throws IOException {
            this.f46082a.write("\n'ConstraintSet':{\n");
            for (Integer num : f.this.f45921h.keySet()) {
                a aVar = (a) f.this.f45921h.get(num);
                String strA = a(num.intValue());
                this.f46082a.write(strA + ":{\n");
                b bVar = aVar.f45926e;
                e("height", bVar.f45989e, bVar.f45982a0, bVar.f45994g0, bVar.f45990e0, bVar.f45986c0, bVar.f46010o0);
                e("width", bVar.f45987d, bVar.Z, bVar.f45992f0, bVar.f45988d0, bVar.f45984b0, bVar.f46008n0);
                d("'left'", bVar.f45999j, "'left'", bVar.H, bVar.O);
                d("'left'", bVar.f46001k, "'right'", bVar.H, bVar.O);
                d("'right'", bVar.f46003l, "'left'", bVar.I, bVar.Q);
                d("'right'", bVar.f46005m, "'right'", bVar.I, bVar.Q);
                d("'baseline'", bVar.f46015r, "'baseline'", -1, bVar.U);
                d("'baseline'", bVar.f46016s, "'top'", -1, bVar.U);
                d("'baseline'", bVar.f46017t, "'bottom'", -1, bVar.U);
                d("'top'", bVar.f46009o, "'bottom'", bVar.J, bVar.P);
                d("'top'", bVar.f46007n, "'top'", bVar.J, bVar.P);
                d("'bottom'", bVar.f46013q, "'bottom'", bVar.K, bVar.R);
                d("'bottom'", bVar.f46011p, "'top'", bVar.K, bVar.R);
                d("'start'", bVar.f46019v, "'start'", bVar.M, bVar.T);
                d("'start'", bVar.f46018u, "'end'", bVar.M, bVar.T);
                d("'end'", bVar.f46020w, "'start'", bVar.L, bVar.S);
                d("'end'", bVar.f46021x, "'end'", bVar.L, bVar.S);
                i("'horizontalBias'", bVar.f46022y, 0.5f);
                i("'verticalBias'", bVar.f46023z, 0.5f);
                c(bVar.B, bVar.D, bVar.C);
                f(bVar.G, bVar.f45991f, bVar.f45993g, bVar.f45995h);
                k("'dimensionRatio'", bVar.A);
                j("'barrierMargin'", bVar.f45998i0);
                j("'type'", bVar.f46000j0);
                k("'ReferenceId'", bVar.f46004l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f46012p0, true);
                j("'WrapBehavior'", bVar.f46014q0);
                h("'verticalWeight'", bVar.V);
                h("'horizontalWeight'", bVar.W);
                j("'horizontalChainStyle'", bVar.X);
                j("'verticalChainStyle'", bVar.Y);
                j("'barrierDirection'", bVar.f45996h0);
                int[] iArr = bVar.f46002k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f46082a.write("}\n");
            }
            this.f46082a.write("}\n");
        }

        void h(String str, float f10) throws IOException {
            if (f10 == -1.0f) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(": " + f10);
            this.f46082a.write(",\n");
        }

        void i(String str, float f10, float f11) throws IOException {
            if (f10 == f11) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(": " + f10);
            this.f46082a.write(",\n");
        }

        void j(String str, int i10) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(":");
            this.f46082a.write(", " + i10);
            this.f46082a.write("\n");
        }

        void k(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(":");
            this.f46082a.write(", " + str2);
            this.f46082a.write("\n");
        }

        void l(String str, boolean z10) throws IOException {
            if (z10) {
                this.f46082a.write(f46081o + str);
                this.f46082a.write(": " + z10);
                this.f46082a.write(",\n");
            }
        }

        void m(String str, boolean z10, boolean z11) throws IOException {
            if (z10 == z11) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(": " + z10);
            this.f46082a.write(",\n");
        }

        void n(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.f46082a.write(f46081o + str);
            this.f46082a.write(": ");
            int i10 = 0;
            while (i10 < iArr.length) {
                Writer writer = this.f46082a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "[" : ", ");
                sb2.append(a(iArr[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f46082a.write("],\n");
        }
    }

    class g {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f46096o = "\n       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Writer f46097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ConstraintLayout f46098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Context f46099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f46100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46101e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f46102f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f46103g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f46104h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final String f46105i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final String f46106j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final String f46107k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final String f46108l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f46109m = new HashMap<>();

        g(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
            this.f46097a = writer;
            this.f46098b = constraintLayout;
            this.f46099c = constraintLayout.getContext();
            this.f46100d = i10;
        }

        private void c(String str, int i10, int i11) throws IOException {
            if (i10 != i11) {
                if (i10 == -2) {
                    this.f46097a.write(f46096o + str + "=\"wrap_content\"");
                    return;
                }
                if (i10 == -1) {
                    this.f46097a.write(f46096o + str + "=\"match_parent\"");
                    return;
                }
                this.f46097a.write(f46096o + str + "=\"" + i10 + "dp\"");
            }
        }

        private void d(String str, boolean z10, boolean z11) throws IOException {
            if (z10 != z11) {
                this.f46097a.write(f46096o + str + "=\"" + z10 + "dp\"");
            }
        }

        private void g(String str, int i10, int i11) throws IOException {
            if (i10 != i11) {
                this.f46097a.write(f46096o + str + "=\"" + i10 + "dp\"");
            }
        }

        private void h(String str, int i10, String[] strArr, int i11) throws IOException {
            if (i10 != i11) {
                this.f46097a.write(f46096o + str + "=\"" + strArr[i10] + "\"");
            }
        }

        String a(int i10) {
            if (this.f46109m.containsKey(Integer.valueOf(i10))) {
                return "@+id/" + this.f46109m.get(Integer.valueOf(i10)) + "";
            }
            if (i10 == 0) {
                return f.W1;
            }
            String strB = b(i10);
            this.f46109m.put(Integer.valueOf(i10), strB);
            return "@+id/" + strB + "";
        }

        String b(int i10) {
            try {
                if (i10 != -1) {
                    return this.f46099c.getResources().getResourceEntryName(i10);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown");
                int i11 = this.f46101e + 1;
                this.f46101e = i11;
                sb2.append(i11);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unknown");
                int i12 = this.f46101e + 1;
                this.f46101e = i12;
                sb3.append(i12);
                return sb3.toString();
            }
        }

        void e(int i10, float f10, int i11) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f46097a.write(androidx.media3.extractor.text.ttml.c.A0);
            this.f46097a.write(":[");
            this.f46097a.write(a(i10));
            this.f46097a.write(", " + f10);
            this.f46097a.write(i11 + "]");
        }

        void f(String str, int i10, String str2, int i11, int i12) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f46097a.write(f46096o + str);
            this.f46097a.write(":[");
            this.f46097a.write(a(i10));
            this.f46097a.write(" , ");
            this.f46097a.write(str2);
            if (i11 != 0) {
                this.f46097a.write(" , " + i11);
            }
            this.f46097a.write("],\n");
        }

        void i() throws IOException {
            this.f46097a.write("\n<ConstraintSet>\n");
            for (Integer num : f.this.f45921h.keySet()) {
                a aVar = (a) f.this.f45921h.get(num);
                String strA = a(num.intValue());
                this.f46097a.write("  <Constraint");
                this.f46097a.write("\n       android:id=\"" + strA + "\"");
                b bVar = aVar.f45926e;
                c("android:layout_width", bVar.f45987d, -5);
                c("android:layout_height", bVar.f45989e, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.f45991f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f45993g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f45995h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f46022y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f46023z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.A, null);
                o("app:layout_constraintCircle", bVar.B);
                j("app:layout_constraintCircleRadius", bVar.C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.D, 0.0f);
                j("android:orientation", bVar.G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.Y, 0.0f);
                j("app:barrierDirection", bVar.f45996h0, -1.0f);
                j("app:barrierMargin", bVar.f45998i0, 0.0f);
                g("app:layout_marginLeft", bVar.H, 0);
                g("app:layout_goneMarginLeft", bVar.O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.I, 0);
                g("app:layout_goneMarginRight", bVar.Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.M, 0);
                g("app:layout_goneMarginStart", bVar.T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.L, 0);
                g("app:layout_goneMarginEnd", bVar.S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.J, 0);
                g("app:layout_goneMarginTop", bVar.P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.K, 0);
                g("app:layout_goneMarginBottom", bVar.R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.N, 0);
                d("app:layout_constrainedWidth", bVar.f46008n0, false);
                d("app:layout_constrainedHeight", bVar.f46010o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f46012p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f46014q0, 0.0f);
                o("app:baselineToBaseline", bVar.f46015r);
                o("app:baselineToBottom", bVar.f46017t);
                o("app:baselineToTop", bVar.f46016s);
                o("app:layout_constraintBottom_toBottomOf", bVar.f46013q);
                o("app:layout_constraintBottom_toTopOf", bVar.f46011p);
                o("app:layout_constraintEnd_toEndOf", bVar.f46021x);
                o("app:layout_constraintEnd_toStartOf", bVar.f46020w);
                o("app:layout_constraintLeft_toLeftOf", bVar.f45999j);
                o("app:layout_constraintLeft_toRightOf", bVar.f46001k);
                o("app:layout_constraintRight_toLeftOf", bVar.f46003l);
                o("app:layout_constraintRight_toRightOf", bVar.f46005m);
                o("app:layout_constraintStart_toEndOf", bVar.f46018u);
                o("app:layout_constraintStart_toStartOf", bVar.f46019v);
                o("app:layout_constraintTop_toBottomOf", bVar.f46009o);
                o("app:layout_constraintTop_toTopOf", bVar.f46007n);
                String[] strArr = {"spread", "wrap", io.sentry.profilemeasurements.a.f306071n};
                h("app:layout_constraintHeight_default", bVar.f45982a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f45994g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f45990e0, 0);
                g("app:layout_constraintHeight_max", bVar.f45986c0, 0);
                d("android:layout_constrainedHeight", bVar.f46010o0, false);
                h("app:layout_constraintWidth_default", bVar.Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f45992f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f45988d0, 0);
                g("app:layout_constraintWidth_max", bVar.f45984b0, 0);
                d("android:layout_constrainedWidth", bVar.f46008n0, false);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.X);
                k("app:layout_constraintVertical_chainStyle", bVar.Y);
                h("app:barrierDirection", bVar.f45996h0, new String[]{"left", "right", "top", VerticalAlignment.BOTTOM, "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.f46006m0, null);
                int[] iArr = bVar.f46002k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f46097a.write(" />\n");
            }
            this.f46097a.write("</ConstraintSet>\n");
        }

        void j(String str, float f10, float f11) throws IOException {
            if (f10 == f11) {
                return;
            }
            this.f46097a.write(f46096o + str);
            this.f46097a.write("=\"" + f10 + "\"");
        }

        void k(String str, int i10) throws IOException {
            if (i10 != 0) {
                int i11 = 2 & (-1);
                if (i10 == -1) {
                    return;
                }
                this.f46097a.write(f46096o + str + "=\"" + i10 + "\"\n");
            }
        }

        void l(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f46097a.write(str);
            this.f46097a.write(":");
            this.f46097a.write(", " + str2);
            this.f46097a.write("\n");
        }

        void m(String str, String str2, String str3) throws IOException {
            if (str2 != null && !str2.equals(str3)) {
                this.f46097a.write(f46096o + str);
                this.f46097a.write("=\"" + str2 + "\"");
            }
        }

        void n(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.f46097a.write(f46096o + str);
            this.f46097a.write(":");
            int i10 = 0;
            while (i10 < iArr.length) {
                Writer writer = this.f46097a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "[" : ", ");
                sb2.append(a(iArr[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f46097a.write("],\n");
        }

        void o(String str, int i10) throws IOException {
            if (i10 == -1) {
                return;
            }
            this.f46097a.write(f46096o + str);
            this.f46097a.write("=\"" + a(i10) + "\"");
        }
    }

    static {
        X.append(j.c.R0, 25);
        X.append(j.c.S0, 26);
        X.append(j.c.U0, 29);
        X.append(j.c.V0, 30);
        X.append(j.c.f46366b1, 36);
        X.append(j.c.f46349a1, 35);
        X.append(j.c.f46755y0, 4);
        X.append(j.c.f46738x0, 3);
        X.append(j.c.f46670t0, 1);
        X.append(j.c.f46704v0, 91);
        X.append(j.c.f46687u0, 92);
        X.append(j.c.f46518k1, 6);
        X.append(j.c.f46535l1, 7);
        X.append(j.c.F0, 17);
        X.append(j.c.G0, 18);
        X.append(j.c.H0, 19);
        X.append(j.c.f46602p0, 99);
        X.append(j.c.f46567n, 27);
        X.append(j.c.W0, 32);
        X.append(j.c.X0, 33);
        X.append(j.c.E0, 10);
        X.append(j.c.D0, 9);
        X.append(j.c.f46603p1, 13);
        X.append(j.c.f46654s1, 16);
        X.append(j.c.f46620q1, 14);
        X.append(j.c.f46569n1, 11);
        X.append(j.c.f46637r1, 15);
        X.append(j.c.f46586o1, 12);
        X.append(j.c.f46417e1, 40);
        X.append(j.c.P0, 39);
        X.append(j.c.O0, 41);
        X.append(j.c.f46400d1, 42);
        X.append(j.c.N0, 20);
        X.append(j.c.f46383c1, 37);
        X.append(j.c.C0, 5);
        X.append(j.c.Q0, 87);
        X.append(j.c.Z0, 87);
        X.append(j.c.T0, 87);
        X.append(j.c.f46721w0, 87);
        X.append(j.c.f46653s0, 87);
        X.append(j.c.f46652s, 24);
        X.append(j.c.f46686u, 28);
        X.append(j.c.K, 31);
        X.append(j.c.L, 8);
        X.append(j.c.f46669t, 34);
        X.append(j.c.f46703v, 2);
        X.append(j.c.f46618q, 23);
        X.append(j.c.f46635r, 21);
        X.append(j.c.f46434f1, 95);
        X.append(j.c.I0, 96);
        X.append(j.c.f46601p, 22);
        X.append(j.c.A, 43);
        X.append(j.c.N, 44);
        X.append(j.c.I, 45);
        X.append(j.c.J, 46);
        X.append(j.c.H, 60);
        X.append(j.c.F, 47);
        X.append(j.c.G, 48);
        X.append(j.c.B, 49);
        X.append(j.c.C, 50);
        X.append(j.c.D, 51);
        X.append(j.c.E, 52);
        X.append(j.c.M, 53);
        X.append(j.c.f46451g1, 54);
        X.append(j.c.J0, 55);
        X.append(j.c.f46468h1, 56);
        X.append(j.c.K0, 57);
        X.append(j.c.f46485i1, 58);
        X.append(j.c.L0, 59);
        X.append(j.c.f46772z0, 61);
        X.append(j.c.B0, 62);
        X.append(j.c.A0, 63);
        X.append(j.c.P, 64);
        X.append(j.c.E1, 65);
        X.append(j.c.W, 66);
        X.append(j.c.F1, 67);
        X.append(j.c.f46722w1, 79);
        X.append(j.c.f46584o, 38);
        X.append(j.c.f46705v1, 68);
        X.append(j.c.f46501j1, 69);
        X.append(j.c.M0, 70);
        X.append(j.c.f46688u1, 97);
        X.append(j.c.T, 71);
        X.append(j.c.R, 72);
        X.append(j.c.S, 73);
        X.append(j.c.U, 74);
        X.append(j.c.Q, 75);
        X.append(j.c.f46739x1, 76);
        X.append(j.c.Y0, 77);
        X.append(j.c.G1, 78);
        X.append(j.c.f46636r0, 80);
        X.append(j.c.f46619q0, 81);
        X.append(j.c.f46773z1, 82);
        X.append(j.c.D1, 83);
        X.append(j.c.C1, 84);
        X.append(j.c.B1, 85);
        X.append(j.c.A1, 86);
        Y.append(j.c.J5, 6);
        Y.append(j.c.J5, 7);
        Y.append(j.c.f46386c4, 27);
        Y.append(j.c.N5, 13);
        Y.append(j.c.Q5, 16);
        Y.append(j.c.O5, 14);
        Y.append(j.c.L5, 11);
        Y.append(j.c.P5, 15);
        Y.append(j.c.M5, 12);
        Y.append(j.c.C5, 40);
        Y.append(j.c.f46709v5, 39);
        Y.append(j.c.f46692u5, 41);
        Y.append(j.c.B5, 42);
        Y.append(j.c.f46675t5, 20);
        Y.append(j.c.A5, 37);
        Y.append(j.c.f46522k5, 5);
        Y.append(j.c.f46726w5, 87);
        Y.append(j.c.f46777z5, 87);
        Y.append(j.c.f46743x5, 87);
        Y.append(j.c.f46472h5, 87);
        Y.append(j.c.f46455g5, 87);
        Y.append(j.c.f46471h4, 24);
        Y.append(j.c.f46504j4, 28);
        Y.append(j.c.f46776z4, 31);
        Y.append(j.c.A4, 8);
        Y.append(j.c.f46488i4, 34);
        Y.append(j.c.f46521k4, 2);
        Y.append(j.c.f46437f4, 23);
        Y.append(j.c.f46454g4, 21);
        Y.append(j.c.D5, 95);
        Y.append(j.c.f46590o5, 96);
        Y.append(j.c.f46420e4, 22);
        Y.append(j.c.f46606p4, 43);
        Y.append(j.c.C4, 44);
        Y.append(j.c.f46742x4, 45);
        Y.append(j.c.f46759y4, 46);
        Y.append(j.c.f46725w4, 60);
        Y.append(j.c.f46691u4, 47);
        Y.append(j.c.f46708v4, 48);
        Y.append(j.c.f46623q4, 49);
        Y.append(j.c.f46640r4, 50);
        Y.append(j.c.f46657s4, 51);
        Y.append(j.c.f46674t4, 52);
        Y.append(j.c.B4, 53);
        Y.append(j.c.E5, 54);
        Y.append(j.c.f46607p5, 55);
        Y.append(j.c.F5, 56);
        Y.append(j.c.f46624q5, 57);
        Y.append(j.c.G5, 58);
        Y.append(j.c.f46641r5, 59);
        Y.append(j.c.f46505j5, 62);
        Y.append(j.c.f46489i5, 63);
        Y.append(j.c.E4, 64);
        Y.append(j.c.f46405d6, 65);
        Y.append(j.c.K4, 66);
        Y.append(j.c.f46422e6, 67);
        Y.append(j.c.U5, 79);
        Y.append(j.c.f46403d4, 38);
        Y.append(j.c.V5, 98);
        Y.append(j.c.T5, 68);
        Y.append(j.c.H5, 69);
        Y.append(j.c.f46658s5, 70);
        Y.append(j.c.I4, 71);
        Y.append(j.c.G4, 72);
        Y.append(j.c.H4, 73);
        Y.append(j.c.J4, 74);
        Y.append(j.c.F4, 75);
        Y.append(j.c.W5, 76);
        Y.append(j.c.f46760y5, 77);
        Y.append(j.c.f46439f6, 78);
        Y.append(j.c.f46438f5, 80);
        Y.append(j.c.f46421e5, 81);
        Y.append(j.c.Y5, 82);
        Y.append(j.c.f46388c6, 83);
        Y.append(j.c.f46371b6, 84);
        Y.append(j.c.f46354a6, 85);
        Y.append(j.c.Z5, 86);
        Y.append(j.c.S5, 97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int A0(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    static void D0(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        a.C0370a c0370a;
        b bVar;
        ConstraintLayout.b bVar2;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            E0(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (obj instanceof ConstraintLayout.b) {
                bVar2 = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                    bVar2.f45674a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                    bVar2.f45676b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f45987d = i13;
                    bVar.f46008n0 = z10;
                    return;
                } else {
                    bVar.f45989e = i13;
                    bVar.f46010o0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0370a) {
                c0370a = (a.C0370a) obj;
                if (i11 == 0) {
                    c0370a.b(23, i13);
                    c0370a.d(80, z10);
                } else {
                    c0370a.b(21, i13);
                    c0370a.d(81, z10);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (obj instanceof ConstraintLayout.b) {
            bVar2 = (ConstraintLayout.b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar2).width = i13;
                bVar2.f45674a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar2).height = i13;
                bVar2.f45676b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i11 == 0) {
                bVar.f45987d = i13;
                bVar.f46008n0 = z10;
                return;
            } else {
                bVar.f45989e = i13;
                bVar.f46010o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0370a) {
            c0370a = (a.C0370a) obj;
            if (i11 == 0) {
                c0370a.b(23, i13);
                c0370a.d(80, z10);
            } else {
                c0370a.b(21, i13);
                c0370a.d(81, z10);
            }
        }
    }

    static void E0(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if (V1.equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    F0(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0370a) {
                        ((a.C0370a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if (U1.equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f45987d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f45989e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0370a) {
                        a.C0370a c0370a = (a.C0370a) obj;
                        if (i10 == 0) {
                            c0370a.b(23, 0);
                            c0370a.a(39, f10);
                            return;
                        } else {
                            c0370a.b(21, 0);
                            c0370a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if (W1.equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f45987d = 0;
                            bVar5.f45992f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f45989e = 0;
                            bVar5.f45994g0 = fMax;
                            bVar5.f45982a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0370a) {
                        a.C0370a c0370a2 = (a.C0370a) obj;
                        if (i10 == 0) {
                            c0370a2.b(23, 0);
                            c0370a2.b(54, 2);
                        } else {
                            c0370a2.b(21, 0);
                            c0370a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void F0(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            int i12 = 3 << 1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(androidx.exifinterface.media.a.U4)) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    private void J0(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            K0(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != j.c.f46584o && j.c.K != index && j.c.L != index) {
                aVar.f45925d.f46036a = true;
                aVar.f45926e.f45983b = true;
                aVar.f45924c.f46050a = true;
                aVar.f45927f.f46067a = true;
            }
            switch (X.get(index)) {
                case 1:
                    b bVar = aVar.f45926e;
                    bVar.f46015r = A0(typedArray, index, bVar.f46015r);
                    break;
                case 2:
                    b bVar2 = aVar.f45926e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f45926e;
                    bVar3.f46013q = A0(typedArray, index, bVar3.f46013q);
                    break;
                case 4:
                    b bVar4 = aVar.f45926e;
                    bVar4.f46011p = A0(typedArray, index, bVar4.f46011p);
                    break;
                case 5:
                    aVar.f45926e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f45926e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f45926e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f45926e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f45926e;
                    bVar8.f46021x = A0(typedArray, index, bVar8.f46021x);
                    break;
                case 10:
                    b bVar9 = aVar.f45926e;
                    bVar9.f46020w = A0(typedArray, index, bVar9.f46020w);
                    break;
                case 11:
                    b bVar10 = aVar.f45926e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f45926e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f45926e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f45926e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f45926e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f45926e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f45926e;
                    bVar16.f45991f = typedArray.getDimensionPixelOffset(index, bVar16.f45991f);
                    break;
                case 18:
                    b bVar17 = aVar.f45926e;
                    bVar17.f45993g = typedArray.getDimensionPixelOffset(index, bVar17.f45993g);
                    break;
                case 19:
                    b bVar18 = aVar.f45926e;
                    bVar18.f45995h = typedArray.getFloat(index, bVar18.f45995h);
                    break;
                case 20:
                    b bVar19 = aVar.f45926e;
                    bVar19.f46022y = typedArray.getFloat(index, bVar19.f46022y);
                    break;
                case 21:
                    b bVar20 = aVar.f45926e;
                    bVar20.f45989e = typedArray.getLayoutDimension(index, bVar20.f45989e);
                    break;
                case 22:
                    d dVar = aVar.f45924c;
                    dVar.f46051b = typedArray.getInt(index, dVar.f46051b);
                    d dVar2 = aVar.f45924c;
                    dVar2.f46051b = V[dVar2.f46051b];
                    break;
                case 23:
                    b bVar21 = aVar.f45926e;
                    bVar21.f45987d = typedArray.getLayoutDimension(index, bVar21.f45987d);
                    break;
                case 24:
                    b bVar22 = aVar.f45926e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f45926e;
                    bVar23.f45999j = A0(typedArray, index, bVar23.f45999j);
                    break;
                case 26:
                    b bVar24 = aVar.f45926e;
                    bVar24.f46001k = A0(typedArray, index, bVar24.f46001k);
                    break;
                case 27:
                    b bVar25 = aVar.f45926e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f45926e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f45926e;
                    bVar27.f46003l = A0(typedArray, index, bVar27.f46003l);
                    break;
                case 30:
                    b bVar28 = aVar.f45926e;
                    bVar28.f46005m = A0(typedArray, index, bVar28.f46005m);
                    break;
                case 31:
                    b bVar29 = aVar.f45926e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f45926e;
                    bVar30.f46018u = A0(typedArray, index, bVar30.f46018u);
                    break;
                case 33:
                    b bVar31 = aVar.f45926e;
                    bVar31.f46019v = A0(typedArray, index, bVar31.f46019v);
                    break;
                case 34:
                    b bVar32 = aVar.f45926e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f45926e;
                    bVar33.f46009o = A0(typedArray, index, bVar33.f46009o);
                    break;
                case 36:
                    b bVar34 = aVar.f45926e;
                    bVar34.f46007n = A0(typedArray, index, bVar34.f46007n);
                    break;
                case 37:
                    b bVar35 = aVar.f45926e;
                    bVar35.f46023z = typedArray.getFloat(index, bVar35.f46023z);
                    break;
                case 38:
                    aVar.f45922a = typedArray.getResourceId(index, aVar.f45922a);
                    break;
                case 39:
                    b bVar36 = aVar.f45926e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f45926e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f45926e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f45926e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f45924c;
                    dVar3.f46053d = typedArray.getFloat(index, dVar3.f46053d);
                    break;
                case 44:
                    e eVar = aVar.f45927f;
                    eVar.f46079m = true;
                    eVar.f46080n = typedArray.getDimension(index, eVar.f46080n);
                    break;
                case 45:
                    e eVar2 = aVar.f45927f;
                    eVar2.f46069c = typedArray.getFloat(index, eVar2.f46069c);
                    break;
                case 46:
                    e eVar3 = aVar.f45927f;
                    eVar3.f46070d = typedArray.getFloat(index, eVar3.f46070d);
                    break;
                case 47:
                    e eVar4 = aVar.f45927f;
                    eVar4.f46071e = typedArray.getFloat(index, eVar4.f46071e);
                    break;
                case 48:
                    e eVar5 = aVar.f45927f;
                    eVar5.f46072f = typedArray.getFloat(index, eVar5.f46072f);
                    break;
                case 49:
                    e eVar6 = aVar.f45927f;
                    eVar6.f46073g = typedArray.getDimension(index, eVar6.f46073g);
                    break;
                case 50:
                    e eVar7 = aVar.f45927f;
                    eVar7.f46074h = typedArray.getDimension(index, eVar7.f46074h);
                    break;
                case 51:
                    e eVar8 = aVar.f45927f;
                    eVar8.f46076j = typedArray.getDimension(index, eVar8.f46076j);
                    break;
                case 52:
                    e eVar9 = aVar.f45927f;
                    eVar9.f46077k = typedArray.getDimension(index, eVar9.f46077k);
                    break;
                case 53:
                    e eVar10 = aVar.f45927f;
                    eVar10.f46078l = typedArray.getDimension(index, eVar10.f46078l);
                    break;
                case 54:
                    b bVar40 = aVar.f45926e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f45926e;
                    bVar41.f45982a0 = typedArray.getInt(index, bVar41.f45982a0);
                    break;
                case 56:
                    b bVar42 = aVar.f45926e;
                    bVar42.f45984b0 = typedArray.getDimensionPixelSize(index, bVar42.f45984b0);
                    break;
                case 57:
                    b bVar43 = aVar.f45926e;
                    bVar43.f45986c0 = typedArray.getDimensionPixelSize(index, bVar43.f45986c0);
                    break;
                case 58:
                    b bVar44 = aVar.f45926e;
                    bVar44.f45988d0 = typedArray.getDimensionPixelSize(index, bVar44.f45988d0);
                    break;
                case 59:
                    b bVar45 = aVar.f45926e;
                    bVar45.f45990e0 = typedArray.getDimensionPixelSize(index, bVar45.f45990e0);
                    break;
                case 60:
                    e eVar11 = aVar.f45927f;
                    eVar11.f46068b = typedArray.getFloat(index, eVar11.f46068b);
                    break;
                case 61:
                    b bVar46 = aVar.f45926e;
                    bVar46.B = A0(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f45926e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f45926e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f45925d;
                    cVar.f46037b = A0(typedArray, index, cVar.f46037b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f45925d.f46039d = typedArray.getString(index);
                    } else {
                        aVar.f45925d.f46039d = androidx.constraintlayout.core.motion.utils.d.f43750o[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f45925d.f46041f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f45925d;
                    cVar2.f46044i = typedArray.getFloat(index, cVar2.f46044i);
                    break;
                case 68:
                    d dVar4 = aVar.f45924c;
                    dVar4.f46054e = typedArray.getFloat(index, dVar4.f46054e);
                    break;
                case 69:
                    aVar.f45926e.f45992f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f45926e.f45994g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f45926e;
                    bVar49.f45996h0 = typedArray.getInt(index, bVar49.f45996h0);
                    break;
                case 73:
                    b bVar50 = aVar.f45926e;
                    bVar50.f45998i0 = typedArray.getDimensionPixelSize(index, bVar50.f45998i0);
                    break;
                case 74:
                    aVar.f45926e.f46004l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f45926e;
                    bVar51.f46012p0 = typedArray.getBoolean(index, bVar51.f46012p0);
                    break;
                case 76:
                    c cVar3 = aVar.f45925d;
                    cVar3.f46040e = typedArray.getInt(index, cVar3.f46040e);
                    break;
                case 77:
                    aVar.f45926e.f46006m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f45924c;
                    dVar5.f46052c = typedArray.getInt(index, dVar5.f46052c);
                    break;
                case 79:
                    c cVar4 = aVar.f45925d;
                    cVar4.f46042g = typedArray.getFloat(index, cVar4.f46042g);
                    break;
                case 80:
                    b bVar52 = aVar.f45926e;
                    bVar52.f46008n0 = typedArray.getBoolean(index, bVar52.f46008n0);
                    break;
                case 81:
                    b bVar53 = aVar.f45926e;
                    bVar53.f46010o0 = typedArray.getBoolean(index, bVar53.f46010o0);
                    break;
                case 82:
                    c cVar5 = aVar.f45925d;
                    cVar5.f46038c = typedArray.getInteger(index, cVar5.f46038c);
                    break;
                case 83:
                    e eVar12 = aVar.f45927f;
                    eVar12.f46075i = A0(typedArray, index, eVar12.f46075i);
                    break;
                case 84:
                    c cVar6 = aVar.f45925d;
                    cVar6.f46046k = typedArray.getInteger(index, cVar6.f46046k);
                    break;
                case 85:
                    c cVar7 = aVar.f45925d;
                    cVar7.f46045j = typedArray.getFloat(index, cVar7.f46045j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f45925d.f46049n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f45925d;
                        if (cVar8.f46049n != -1) {
                            cVar8.f46048m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f45925d.f46047l = typedArray.getString(index);
                        if (aVar.f45925d.f46047l.indexOf("/") > 0) {
                            aVar.f45925d.f46049n = typedArray.getResourceId(index, -1);
                            aVar.f45925d.f46048m = -2;
                        } else {
                            aVar.f45925d.f46048m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f45925d;
                        cVar9.f46048m = typedArray.getInteger(index, cVar9.f46049n);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    X.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    X.get(index);
                    break;
                case 91:
                    b bVar54 = aVar.f45926e;
                    bVar54.f46016s = A0(typedArray, index, bVar54.f46016s);
                    break;
                case 92:
                    b bVar55 = aVar.f45926e;
                    bVar55.f46017t = A0(typedArray, index, bVar55.f46017t);
                    break;
                case 93:
                    b bVar56 = aVar.f45926e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f45926e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    D0(aVar.f45926e, typedArray, index, 0);
                    break;
                case 96:
                    D0(aVar.f45926e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f45926e;
                    bVar58.f46014q0 = typedArray.getInt(index, bVar58.f46014q0);
                    break;
            }
        }
        b bVar59 = aVar.f45926e;
        if (bVar59.f46004l0 != null) {
            bVar59.f46002k0 = null;
        }
    }

    private static void K0(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0370a c0370a = new a.C0370a();
        aVar.f45929h = c0370a;
        aVar.f45925d.f46036a = false;
        aVar.f45926e.f45983b = false;
        aVar.f45924c.f46050a = false;
        aVar.f45927f.f46067a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (Y.get(index)) {
                case 2:
                    c0370a.b(2, typedArray.getDimensionPixelSize(index, aVar.f45926e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    X.get(index);
                    break;
                case 5:
                    c0370a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0370a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f45926e.E));
                    break;
                case 7:
                    c0370a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f45926e.F));
                    break;
                case 8:
                    c0370a.b(8, typedArray.getDimensionPixelSize(index, aVar.f45926e.L));
                    break;
                case 11:
                    c0370a.b(11, typedArray.getDimensionPixelSize(index, aVar.f45926e.R));
                    break;
                case 12:
                    c0370a.b(12, typedArray.getDimensionPixelSize(index, aVar.f45926e.S));
                    break;
                case 13:
                    c0370a.b(13, typedArray.getDimensionPixelSize(index, aVar.f45926e.O));
                    break;
                case 14:
                    c0370a.b(14, typedArray.getDimensionPixelSize(index, aVar.f45926e.Q));
                    break;
                case 15:
                    c0370a.b(15, typedArray.getDimensionPixelSize(index, aVar.f45926e.T));
                    break;
                case 16:
                    c0370a.b(16, typedArray.getDimensionPixelSize(index, aVar.f45926e.P));
                    break;
                case 17:
                    c0370a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f45926e.f45991f));
                    break;
                case 18:
                    c0370a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f45926e.f45993g));
                    break;
                case 19:
                    c0370a.a(19, typedArray.getFloat(index, aVar.f45926e.f45995h));
                    break;
                case 20:
                    c0370a.a(20, typedArray.getFloat(index, aVar.f45926e.f46022y));
                    break;
                case 21:
                    c0370a.b(21, typedArray.getLayoutDimension(index, aVar.f45926e.f45989e));
                    break;
                case 22:
                    c0370a.b(22, V[typedArray.getInt(index, aVar.f45924c.f46051b)]);
                    break;
                case 23:
                    c0370a.b(23, typedArray.getLayoutDimension(index, aVar.f45926e.f45987d));
                    break;
                case 24:
                    c0370a.b(24, typedArray.getDimensionPixelSize(index, aVar.f45926e.H));
                    break;
                case 27:
                    c0370a.b(27, typedArray.getInt(index, aVar.f45926e.G));
                    break;
                case 28:
                    c0370a.b(28, typedArray.getDimensionPixelSize(index, aVar.f45926e.I));
                    break;
                case 31:
                    c0370a.b(31, typedArray.getDimensionPixelSize(index, aVar.f45926e.M));
                    break;
                case 34:
                    c0370a.b(34, typedArray.getDimensionPixelSize(index, aVar.f45926e.J));
                    break;
                case 37:
                    c0370a.a(37, typedArray.getFloat(index, aVar.f45926e.f46023z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f45922a);
                    aVar.f45922a = resourceId;
                    c0370a.b(38, resourceId);
                    break;
                case 39:
                    c0370a.a(39, typedArray.getFloat(index, aVar.f45926e.W));
                    break;
                case 40:
                    c0370a.a(40, typedArray.getFloat(index, aVar.f45926e.V));
                    break;
                case 41:
                    c0370a.b(41, typedArray.getInt(index, aVar.f45926e.X));
                    break;
                case 42:
                    c0370a.b(42, typedArray.getInt(index, aVar.f45926e.Y));
                    break;
                case 43:
                    c0370a.a(43, typedArray.getFloat(index, aVar.f45924c.f46053d));
                    break;
                case 44:
                    c0370a.d(44, true);
                    c0370a.a(44, typedArray.getDimension(index, aVar.f45927f.f46080n));
                    break;
                case 45:
                    c0370a.a(45, typedArray.getFloat(index, aVar.f45927f.f46069c));
                    break;
                case 46:
                    c0370a.a(46, typedArray.getFloat(index, aVar.f45927f.f46070d));
                    break;
                case 47:
                    c0370a.a(47, typedArray.getFloat(index, aVar.f45927f.f46071e));
                    break;
                case 48:
                    c0370a.a(48, typedArray.getFloat(index, aVar.f45927f.f46072f));
                    break;
                case 49:
                    c0370a.a(49, typedArray.getDimension(index, aVar.f45927f.f46073g));
                    break;
                case 50:
                    c0370a.a(50, typedArray.getDimension(index, aVar.f45927f.f46074h));
                    break;
                case 51:
                    c0370a.a(51, typedArray.getDimension(index, aVar.f45927f.f46076j));
                    break;
                case 52:
                    c0370a.a(52, typedArray.getDimension(index, aVar.f45927f.f46077k));
                    break;
                case 53:
                    c0370a.a(53, typedArray.getDimension(index, aVar.f45927f.f46078l));
                    break;
                case 54:
                    c0370a.b(54, typedArray.getInt(index, aVar.f45926e.Z));
                    break;
                case 55:
                    c0370a.b(55, typedArray.getInt(index, aVar.f45926e.f45982a0));
                    break;
                case 56:
                    c0370a.b(56, typedArray.getDimensionPixelSize(index, aVar.f45926e.f45984b0));
                    break;
                case 57:
                    c0370a.b(57, typedArray.getDimensionPixelSize(index, aVar.f45926e.f45986c0));
                    break;
                case 58:
                    c0370a.b(58, typedArray.getDimensionPixelSize(index, aVar.f45926e.f45988d0));
                    break;
                case 59:
                    c0370a.b(59, typedArray.getDimensionPixelSize(index, aVar.f45926e.f45990e0));
                    break;
                case 60:
                    c0370a.a(60, typedArray.getFloat(index, aVar.f45927f.f46068b));
                    break;
                case 62:
                    c0370a.b(62, typedArray.getDimensionPixelSize(index, aVar.f45926e.C));
                    break;
                case 63:
                    c0370a.a(63, typedArray.getFloat(index, aVar.f45926e.D));
                    break;
                case 64:
                    c0370a.b(64, A0(typedArray, index, aVar.f45925d.f46037b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0370a.c(65, typedArray.getString(index));
                    } else {
                        c0370a.c(65, androidx.constraintlayout.core.motion.utils.d.f43750o[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0370a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0370a.a(67, typedArray.getFloat(index, aVar.f45925d.f46044i));
                    break;
                case 68:
                    c0370a.a(68, typedArray.getFloat(index, aVar.f45924c.f46054e));
                    break;
                case 69:
                    c0370a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0370a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0370a.b(72, typedArray.getInt(index, aVar.f45926e.f45996h0));
                    break;
                case 73:
                    c0370a.b(73, typedArray.getDimensionPixelSize(index, aVar.f45926e.f45998i0));
                    break;
                case 74:
                    c0370a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0370a.d(75, typedArray.getBoolean(index, aVar.f45926e.f46012p0));
                    break;
                case 76:
                    c0370a.b(76, typedArray.getInt(index, aVar.f45925d.f46040e));
                    break;
                case 77:
                    c0370a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0370a.b(78, typedArray.getInt(index, aVar.f45924c.f46052c));
                    break;
                case 79:
                    c0370a.a(79, typedArray.getFloat(index, aVar.f45925d.f46042g));
                    break;
                case 80:
                    c0370a.d(80, typedArray.getBoolean(index, aVar.f45926e.f46008n0));
                    break;
                case 81:
                    c0370a.d(81, typedArray.getBoolean(index, aVar.f45926e.f46010o0));
                    break;
                case 82:
                    c0370a.b(82, typedArray.getInteger(index, aVar.f45925d.f46038c));
                    break;
                case 83:
                    c0370a.b(83, A0(typedArray, index, aVar.f45927f.f46075i));
                    break;
                case 84:
                    c0370a.b(84, typedArray.getInteger(index, aVar.f45925d.f46046k));
                    break;
                case 85:
                    c0370a.a(85, typedArray.getFloat(index, aVar.f45925d.f46045j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f45925d.f46049n = typedArray.getResourceId(index, -1);
                        c0370a.b(89, aVar.f45925d.f46049n);
                        c cVar = aVar.f45925d;
                        if (cVar.f46049n != -1) {
                            cVar.f46048m = -2;
                            c0370a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f45925d.f46047l = typedArray.getString(index);
                        c0370a.c(90, aVar.f45925d.f46047l);
                        if (aVar.f45925d.f46047l.indexOf("/") > 0) {
                            aVar.f45925d.f46049n = typedArray.getResourceId(index, -1);
                            c0370a.b(89, aVar.f45925d.f46049n);
                            aVar.f45925d.f46048m = -2;
                            c0370a.b(88, -2);
                        } else {
                            aVar.f45925d.f46048m = -1;
                            c0370a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f45925d;
                        cVar2.f46048m = typedArray.getInteger(index, cVar2.f46049n);
                        c0370a.b(88, aVar.f45925d.f46048m);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    X.get(index);
                    break;
                case 93:
                    c0370a.b(93, typedArray.getDimensionPixelSize(index, aVar.f45926e.N));
                    break;
                case 94:
                    c0370a.b(94, typedArray.getDimensionPixelSize(index, aVar.f45926e.U));
                    break;
                case 95:
                    D0(c0370a, typedArray, index, 0);
                    break;
                case 96:
                    D0(c0370a, typedArray, index, 1);
                    break;
                case 97:
                    c0370a.b(97, typedArray.getInt(index, aVar.f45926e.f46014q0));
                    break;
                case 98:
                    if (MotionLayout.f44987u4) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f45922a);
                        aVar.f45922a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f45923b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f45923b = typedArray.getString(index);
                    } else {
                        aVar.f45922a = typedArray.getResourceId(index, aVar.f45922a);
                    }
                    break;
                case 99:
                    c0370a.d(99, typedArray.getBoolean(index, aVar.f45926e.f45997i));
                    break;
            }
        }
    }

    private String K1(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return VerticalAlignment.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private static String[] L1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U0(a aVar, int i10, float f10) {
        if (i10 == 19) {
            aVar.f45926e.f45995h = f10;
            return;
        }
        if (i10 == 20) {
            aVar.f45926e.f46022y = f10;
            return;
        }
        if (i10 == 37) {
            aVar.f45926e.f46023z = f10;
            return;
        }
        if (i10 == 60) {
            aVar.f45927f.f46068b = f10;
            return;
        }
        if (i10 == 63) {
            aVar.f45926e.D = f10;
            return;
        }
        if (i10 == 79) {
            aVar.f45925d.f46042g = f10;
            return;
        }
        if (i10 == 85) {
            aVar.f45925d.f46045j = f10;
            return;
        }
        if (i10 == 39) {
            aVar.f45926e.W = f10;
            return;
        }
        if (i10 == 40) {
            aVar.f45926e.V = f10;
            return;
        }
        switch (i10) {
            case 43:
                aVar.f45924c.f46053d = f10;
                break;
            case 44:
                e eVar = aVar.f45927f;
                eVar.f46080n = f10;
                eVar.f46079m = true;
                break;
            case 45:
                aVar.f45927f.f46069c = f10;
                break;
            case 46:
                aVar.f45927f.f46070d = f10;
                break;
            case 47:
                aVar.f45927f.f46071e = f10;
                break;
            case 48:
                aVar.f45927f.f46072f = f10;
                break;
            case 49:
                aVar.f45927f.f46073g = f10;
                break;
            case 50:
                aVar.f45927f.f46074h = f10;
                break;
            case 51:
                aVar.f45927f.f46076j = f10;
                break;
            case 52:
                aVar.f45927f.f46077k = f10;
                break;
            case 53:
                aVar.f45927f.f46078l = f10;
                break;
            default:
                switch (i10) {
                    case 67:
                        aVar.f45925d.f46044i = f10;
                        break;
                    case 68:
                        aVar.f45924c.f46054e = f10;
                        break;
                    case 69:
                        aVar.f45926e.f45992f0 = f10;
                        break;
                    case 70:
                        aVar.f45926e.f45994g0 = f10;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V0(a aVar, int i10, int i11) {
        if (i10 == 6) {
            aVar.f45926e.E = i11;
            return;
        }
        if (i10 == 7) {
            aVar.f45926e.F = i11;
            return;
        }
        if (i10 == 8) {
            aVar.f45926e.L = i11;
            return;
        }
        if (i10 == 27) {
            aVar.f45926e.G = i11;
            return;
        }
        if (i10 == 28) {
            aVar.f45926e.I = i11;
            return;
        }
        if (i10 == 41) {
            aVar.f45926e.X = i11;
            return;
        }
        if (i10 == 42) {
            aVar.f45926e.Y = i11;
            return;
        }
        if (i10 == 61) {
            aVar.f45926e.B = i11;
            return;
        }
        if (i10 == 62) {
            aVar.f45926e.C = i11;
            return;
        }
        if (i10 == 72) {
            aVar.f45926e.f45996h0 = i11;
            return;
        }
        if (i10 == 73) {
            aVar.f45926e.f45998i0 = i11;
            return;
        }
        if (i10 == 88) {
            aVar.f45925d.f46048m = i11;
            return;
        }
        if (i10 == 89) {
            aVar.f45925d.f46049n = i11;
            return;
        }
        switch (i10) {
            case 2:
                aVar.f45926e.K = i11;
                break;
            case 11:
                aVar.f45926e.R = i11;
                break;
            case 12:
                aVar.f45926e.S = i11;
                break;
            case 13:
                aVar.f45926e.O = i11;
                break;
            case 14:
                aVar.f45926e.Q = i11;
                break;
            case 15:
                aVar.f45926e.T = i11;
                break;
            case 16:
                aVar.f45926e.P = i11;
                break;
            case 17:
                aVar.f45926e.f45991f = i11;
                break;
            case 18:
                aVar.f45926e.f45993g = i11;
                break;
            case 31:
                aVar.f45926e.M = i11;
                break;
            case 34:
                aVar.f45926e.J = i11;
                break;
            case 38:
                aVar.f45922a = i11;
                break;
            case 64:
                aVar.f45925d.f46037b = i11;
                break;
            case 66:
                aVar.f45925d.f46041f = i11;
                break;
            case 76:
                aVar.f45925d.f46040e = i11;
                break;
            case 78:
                aVar.f45924c.f46052c = i11;
                break;
            case 93:
                aVar.f45926e.N = i11;
                break;
            case 94:
                aVar.f45926e.U = i11;
                break;
            case 97:
                aVar.f45926e.f46014q0 = i11;
                break;
            default:
                switch (i10) {
                    case 21:
                        aVar.f45926e.f45989e = i11;
                        break;
                    case 22:
                        aVar.f45924c.f46051b = i11;
                        break;
                    case 23:
                        aVar.f45926e.f45987d = i11;
                        break;
                    case 24:
                        aVar.f45926e.H = i11;
                        break;
                    default:
                        switch (i10) {
                            case 54:
                                aVar.f45926e.Z = i11;
                                break;
                            case 55:
                                aVar.f45926e.f45982a0 = i11;
                                break;
                            case 56:
                                aVar.f45926e.f45984b0 = i11;
                                break;
                            case 57:
                                aVar.f45926e.f45986c0 = i11;
                                break;
                            case 58:
                                aVar.f45926e.f45988d0 = i11;
                                break;
                            case 59:
                                aVar.f45926e.f45990e0 = i11;
                                break;
                            default:
                                switch (i10) {
                                    case 82:
                                        aVar.f45925d.f46038c = i11;
                                        break;
                                    case 83:
                                        aVar.f45927f.f46075i = i11;
                                        break;
                                    case 84:
                                        aVar.f45925d.f46046k = i11;
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W0(a aVar, int i10, String str) {
        if (i10 == 5) {
            aVar.f45926e.A = str;
            return;
        }
        if (i10 == 65) {
            aVar.f45925d.f46039d = str;
            return;
        }
        if (i10 == 74) {
            b bVar = aVar.f45926e;
            bVar.f46004l0 = str;
            bVar.f46002k0 = null;
        } else if (i10 == 77) {
            aVar.f45926e.f46006m0 = str;
        } else {
            if (i10 != 90) {
                return;
            }
            aVar.f45925d.f46047l = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X0(a aVar, int i10, boolean z10) {
        if (i10 == 44) {
            aVar.f45927f.f46079m = z10;
            return;
        }
        if (i10 == 75) {
            aVar.f45926e.f46012p0 = z10;
        } else if (i10 == 80) {
            aVar.f45926e.f46008n0 = z10;
        } else {
            if (i10 != 81) {
                return;
            }
            aVar.f45926e.f46010o0 = z10;
        }
    }

    private int[] Z(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = j.b.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private void d0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            i0(iArr[0]).f45926e.W = fArr[0];
        }
        i0(iArr[0]).f45926e.X = i14;
        L(iArr[0], i15, i10, i11, -1);
        for (int i17 = 1; i17 < iArr.length; i17++) {
            int i18 = i17 - 1;
            L(iArr[i17], i15, iArr[i18], i16, -1);
            L(iArr[i18], i16, iArr[i17], i15, -1);
            if (fArr != null) {
                i0(iArr[i17]).f45926e.W = fArr[i17];
            }
        }
        L(iArr[iArr.length - 1], i16, i12, i13, -1);
    }

    private void h(androidx.constraintlayout.widget.a.EnumC0369a enumC0369a, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (this.f45919f.containsKey(strArr[i10])) {
                androidx.constraintlayout.widget.a aVar = this.f45919f.get(strArr[i10]);
                if (aVar != null && aVar.j() != enumC0369a) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.j().name());
                }
            } else {
                this.f45919f.put(strArr[i10], new androidx.constraintlayout.widget.a(strArr[i10], enumC0369a));
            }
        }
    }

    private a h0(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? j.c.f46369b4 : j.c.f46550m);
        J0(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a i0(int i10) {
        if (!this.f45921h.containsKey(Integer.valueOf(i10))) {
            this.f45921h.put(Integer.valueOf(i10), new a());
        }
        return this.f45921h.get(Integer.valueOf(i10));
    }

    static String m0(int i10) {
        for (Field field : f.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i10) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return "UNKNOWN";
    }

    static String p0(Context context, int i10, XmlPullParser xmlPullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.c.i(context, i10) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, j.c.f46369b4);
        K0(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void A(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(i10, i11, 7, 0, i11, 6, 0, 0.5f);
        }
    }

    public void A1(int i10, float f10, float f11) {
        e eVar = i0(i10).f45927f;
        eVar.f46076j = f10;
        eVar.f46077k = f11;
    }

    public void B(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 6, i11, i12, i13);
        L(i10, 7, i14, i15, i16);
        a aVar = this.f45921h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f45926e.f46022y = f10;
        }
    }

    public boolean B0(String... strArr) {
        for (String str : strArr) {
            for (String str2 : this.f45917d) {
                if (str2.equals(str)) {
                }
            }
            return false;
        }
        return true;
    }

    public void B1(int i10, float f10) {
        i0(i10).f45927f.f46076j = f10;
    }

    public void C(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(i10, i11, 4, 0, i11, 3, 0, 0.5f);
        }
    }

    public void C0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                String str2 = strArrSplit[i10];
            } else {
                aVar.p(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void C1(int i10, float f10) {
        i0(i10).f45927f.f46077k = f10;
    }

    public void D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 3, i11, i12, i13);
        L(i10, 4, i14, i15, i16);
        a aVar = this.f45921h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f45926e.f46023z = f10;
        }
    }

    public void D1(int i10, float f10) {
        i0(i10).f45927f.f46078l = f10;
    }

    public void E(int i10) {
        this.f45921h.remove(Integer.valueOf(i10));
    }

    public void E1(boolean z10) {
        this.f45914a = z10;
    }

    public void F(int i10, int i11) {
        a aVar;
        if (this.f45921h.containsKey(Integer.valueOf(i10)) && (aVar = this.f45921h.get(Integer.valueOf(i10))) != null) {
            switch (i11) {
                case 1:
                    b bVar = aVar.f45926e;
                    bVar.f46001k = -1;
                    bVar.f45999j = -1;
                    bVar.H = -1;
                    bVar.O = Integer.MIN_VALUE;
                    break;
                case 2:
                    b bVar2 = aVar.f45926e;
                    bVar2.f46005m = -1;
                    bVar2.f46003l = -1;
                    bVar2.I = -1;
                    bVar2.Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    b bVar3 = aVar.f45926e;
                    bVar3.f46009o = -1;
                    bVar3.f46007n = -1;
                    bVar3.J = 0;
                    bVar3.P = Integer.MIN_VALUE;
                    return;
                case 4:
                    b bVar4 = aVar.f45926e;
                    bVar4.f46011p = -1;
                    bVar4.f46013q = -1;
                    bVar4.K = 0;
                    bVar4.R = Integer.MIN_VALUE;
                    return;
                case 5:
                    b bVar5 = aVar.f45926e;
                    bVar5.f46015r = -1;
                    bVar5.f46016s = -1;
                    bVar5.f46017t = -1;
                    bVar5.N = 0;
                    bVar5.U = Integer.MIN_VALUE;
                    return;
                case 6:
                    b bVar6 = aVar.f45926e;
                    bVar6.f46018u = -1;
                    bVar6.f46019v = -1;
                    bVar6.M = 0;
                    bVar6.T = Integer.MIN_VALUE;
                    return;
                case 7:
                    b bVar7 = aVar.f45926e;
                    bVar7.f46020w = -1;
                    bVar7.f46021x = -1;
                    bVar7.L = 0;
                    bVar7.S = Integer.MIN_VALUE;
                    return;
                case 8:
                    b bVar8 = aVar.f45926e;
                    bVar8.D = -1.0f;
                    bVar8.C = -1;
                    bVar8.B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void F1(int i10, float f10) {
        i0(i10).f45926e.f46023z = f10;
    }

    public void G(Context context, int i10) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void G0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                String str2 = strArrSplit[i10];
            } else {
                aVar.q(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void G1(int i10, int i11) {
        i0(i10).f45926e.Y = i11;
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f45921h.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f45920g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f45921h.containsKey(Integer.valueOf(id2))) {
                this.f45921h.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f45921h.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f45928g = androidx.constraintlayout.widget.a.d(this.f45919f, childAt);
                aVar.k(id2, bVar);
                aVar.f45924c.f46051b = childAt.getVisibility();
                aVar.f45924c.f46053d = childAt.getAlpha();
                aVar.f45927f.f46068b = childAt.getRotation();
                aVar.f45927f.f46069c = childAt.getRotationX();
                aVar.f45927f.f46070d = childAt.getRotationY();
                aVar.f45927f.f46071e = childAt.getScaleX();
                aVar.f45927f.f46072f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f45927f;
                    eVar.f46073g = pivotX;
                    eVar.f46074h = pivotY;
                }
                aVar.f45927f.f46076j = childAt.getTranslationX();
                aVar.f45927f.f46077k = childAt.getTranslationY();
                aVar.f45927f.f46078l = childAt.getTranslationZ();
                e eVar2 = aVar.f45927f;
                if (eVar2.f46079m) {
                    eVar2.f46080n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f45926e.f46012p0 = barrier.getAllowsGoneWidget();
                    aVar.f45926e.f46002k0 = barrier.getReferencedIds();
                    aVar.f45926e.f45996h0 = barrier.getType();
                    aVar.f45926e.f45998i0 = barrier.getMargin();
                }
            }
        }
    }

    public void H0(a aVar, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                String str2 = strArrSplit[i10];
            } else {
                aVar.q(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void H1(int i10, float f10) {
        i0(i10).f45926e.V = f10;
    }

    public void I(f fVar) {
        this.f45921h.clear();
        for (Integer num : fVar.f45921h.keySet()) {
            a aVar = fVar.f45921h.get(num);
            if (aVar != null) {
                this.f45921h.put(num, aVar.clone());
            }
        }
    }

    public void I0(a aVar, String str) {
        String[] strArrL1 = L1(str);
        for (int i10 = 0; i10 < strArrL1.length; i10++) {
            String[] strArrSplit = strArrL1[i10].split("=");
            String str2 = strArrL1[i10];
            aVar.s(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void I1(int i10, int i11) {
        i0(i10).f45924c.f46051b = i11;
    }

    public void J(androidx.constraintlayout.widget.g gVar) {
        int childCount = gVar.getChildCount();
        this.f45921h.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = gVar.getChildAt(i10);
            androidx.constraintlayout.widget.g.a aVar = (androidx.constraintlayout.widget.g.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f45920g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f45921h.containsKey(Integer.valueOf(id2))) {
                this.f45921h.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f45921h.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.m((androidx.constraintlayout.widget.b) childAt, id2, aVar);
                }
                aVar2.l(id2, aVar);
            }
        }
    }

    public void J1(int i10, int i11) {
        i0(i10).f45924c.f46052c = i11;
    }

    public void K(int i10, int i11, int i12, int i13) {
        if (!this.f45921h.containsKey(Integer.valueOf(i10))) {
            this.f45921h.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f45921h.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f45926e;
                    bVar.f45999j = i12;
                    bVar.f46001k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f45926e;
                    bVar2.f46001k = i12;
                    bVar2.f45999j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + K1(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f45926e;
                    bVar3.f46003l = i12;
                    bVar3.f46005m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f45926e;
                    bVar4.f46005m = i12;
                    bVar4.f46003l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f45926e;
                    bVar5.f46007n = i12;
                    bVar5.f46009o = -1;
                    bVar5.f46015r = -1;
                    bVar5.f46016s = -1;
                    bVar5.f46017t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar6 = aVar.f45926e;
                bVar6.f46009o = i12;
                bVar6.f46007n = -1;
                bVar6.f46015r = -1;
                bVar6.f46016s = -1;
                bVar6.f46017t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f45926e;
                    bVar7.f46013q = i12;
                    bVar7.f46011p = -1;
                    bVar7.f46015r = -1;
                    bVar7.f46016s = -1;
                    bVar7.f46017t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar8 = aVar.f45926e;
                bVar8.f46011p = i12;
                bVar8.f46013q = -1;
                bVar8.f46015r = -1;
                bVar8.f46016s = -1;
                bVar8.f46017t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f45926e;
                    bVar9.f46015r = i12;
                    bVar9.f46013q = -1;
                    bVar9.f46011p = -1;
                    bVar9.f46007n = -1;
                    bVar9.f46009o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f45926e;
                    bVar10.f46016s = i12;
                    bVar10.f46013q = -1;
                    bVar10.f46011p = -1;
                    bVar10.f46007n = -1;
                    bVar10.f46009o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar11 = aVar.f45926e;
                bVar11.f46017t = i12;
                bVar11.f46013q = -1;
                bVar11.f46011p = -1;
                bVar11.f46007n = -1;
                bVar11.f46009o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f45926e;
                    bVar12.f46019v = i12;
                    bVar12.f46018u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f45926e;
                    bVar13.f46018u = i12;
                    bVar13.f46019v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f45926e;
                    bVar14.f46021x = i12;
                    bVar14.f46020w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f45926e;
                    bVar15.f46020w = i12;
                    bVar15.f46021x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(K1(i11) + " to " + K1(i13) + " unknown");
        }
    }

    public void L(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f45921h.containsKey(Integer.valueOf(i10))) {
            this.f45921h.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f45921h.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f45926e;
                    bVar.f45999j = i12;
                    bVar.f46001k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + K1(i13) + " undefined");
                    }
                    b bVar2 = aVar.f45926e;
                    bVar2.f46001k = i12;
                    bVar2.f45999j = -1;
                }
                aVar.f45926e.H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f45926e;
                    bVar3.f46003l = i12;
                    bVar3.f46005m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar4 = aVar.f45926e;
                    bVar4.f46005m = i12;
                    bVar4.f46003l = -1;
                }
                aVar.f45926e.I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f45926e;
                    bVar5.f46007n = i12;
                    bVar5.f46009o = -1;
                    bVar5.f46015r = -1;
                    bVar5.f46016s = -1;
                    bVar5.f46017t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar6 = aVar.f45926e;
                    bVar6.f46009o = i12;
                    bVar6.f46007n = -1;
                    bVar6.f46015r = -1;
                    bVar6.f46016s = -1;
                    bVar6.f46017t = -1;
                }
                aVar.f45926e.J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f45926e;
                    bVar7.f46013q = i12;
                    bVar7.f46011p = -1;
                    bVar7.f46015r = -1;
                    bVar7.f46016s = -1;
                    bVar7.f46017t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar8 = aVar.f45926e;
                    bVar8.f46011p = i12;
                    bVar8.f46013q = -1;
                    bVar8.f46015r = -1;
                    bVar8.f46016s = -1;
                    bVar8.f46017t = -1;
                }
                aVar.f45926e.K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f45926e;
                    bVar9.f46015r = i12;
                    bVar9.f46013q = -1;
                    bVar9.f46011p = -1;
                    bVar9.f46007n = -1;
                    bVar9.f46009o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f45926e;
                    bVar10.f46016s = i12;
                    bVar10.f46013q = -1;
                    bVar10.f46011p = -1;
                    bVar10.f46007n = -1;
                    bVar10.f46009o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                }
                b bVar11 = aVar.f45926e;
                bVar11.f46017t = i12;
                bVar11.f46013q = -1;
                bVar11.f46011p = -1;
                bVar11.f46007n = -1;
                bVar11.f46009o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f45926e;
                    bVar12.f46019v = i12;
                    bVar12.f46018u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar13 = aVar.f45926e;
                    bVar13.f46018u = i12;
                    bVar13.f46019v = -1;
                }
                aVar.f45926e.M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f45926e;
                    bVar14.f46021x = i12;
                    bVar14.f46020w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + K1(i13) + " undefined");
                    }
                    b bVar15 = aVar.f45926e;
                    bVar15.f46020w = i12;
                    bVar15.f46021x = -1;
                }
                aVar.f45926e.L = i14;
                return;
            default:
                throw new IllegalArgumentException(K1(i11) + " to " + K1(i13) + " unknown");
        }
    }

    public void L0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f45920g && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f45921h.containsKey(Integer.valueOf(id2))) {
                this.f45921h.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f45921h.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f45926e.f45983b) {
                    aVar.k(id2, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.f45926e.f46002k0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f45926e.f46012p0 = barrier.getAllowsGoneWidget();
                            aVar.f45926e.f45996h0 = barrier.getType();
                            aVar.f45926e.f45998i0 = barrier.getMargin();
                        }
                    }
                    aVar.f45926e.f45983b = true;
                }
                d dVar = aVar.f45924c;
                if (!dVar.f46050a) {
                    dVar.f46051b = childAt.getVisibility();
                    aVar.f45924c.f46053d = childAt.getAlpha();
                    aVar.f45924c.f46050a = true;
                }
                e eVar = aVar.f45927f;
                if (!eVar.f46067a) {
                    eVar.f46067a = true;
                    eVar.f46068b = childAt.getRotation();
                    aVar.f45927f.f46069c = childAt.getRotationX();
                    aVar.f45927f.f46070d = childAt.getRotationY();
                    aVar.f45927f.f46071e = childAt.getScaleX();
                    aVar.f45927f.f46072f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f45927f;
                        eVar2.f46073g = pivotX;
                        eVar2.f46074h = pivotY;
                    }
                    aVar.f45927f.f46076j = childAt.getTranslationX();
                    aVar.f45927f.f46077k = childAt.getTranslationY();
                    aVar.f45927f.f46078l = childAt.getTranslationZ();
                    e eVar3 = aVar.f45927f;
                    if (eVar3.f46079m) {
                        eVar3.f46080n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void M(int i10, int i11, int i12, float f10) {
        b bVar = i0(i10).f45926e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void M0(f fVar) {
        for (Integer num : fVar.f45921h.keySet()) {
            num.intValue();
            a aVar = fVar.f45921h.get(num);
            if (!this.f45921h.containsKey(num)) {
                this.f45921h.put(num, new a());
            }
            a aVar2 = this.f45921h.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f45926e;
                if (!bVar.f45983b) {
                    bVar.a(aVar.f45926e);
                }
                d dVar = aVar2.f45924c;
                if (!dVar.f46050a) {
                    dVar.a(aVar.f45924c);
                }
                e eVar = aVar2.f45927f;
                if (!eVar.f46067a) {
                    eVar.a(aVar.f45927f);
                }
                c cVar = aVar2.f45925d;
                if (!cVar.f46036a) {
                    cVar.a(aVar.f45925d);
                }
                for (String str : aVar.f45928g.keySet()) {
                    if (!aVar2.f45928g.containsKey(str)) {
                        aVar2.f45928g.put(str, aVar.f45928g.get(str));
                    }
                }
            }
        }
    }

    public void M1(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i10 & 1) == 1) {
            new g(writer, constraintLayout, i10).i();
        } else {
            new C0371f(writer, constraintLayout, i10).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void N(int i10, int i11) {
        i0(i10).f45926e.f45982a0 = i11;
    }

    public void N0(String str) {
        this.f45919f.remove(str);
    }

    public void O(int i10, int i11) {
        i0(i10).f45926e.Z = i11;
    }

    public void O0(int i10) {
        a aVar;
        f fVar;
        f fVar2;
        f fVar3;
        if (!this.f45921h.containsKey(Integer.valueOf(i10)) || (aVar = this.f45921h.get(Integer.valueOf(i10))) == null) {
            return;
        }
        b bVar = aVar.f45926e;
        int i11 = bVar.f46001k;
        int i12 = bVar.f46003l;
        if (i11 != -1 || i12 != -1) {
            if (i11 == -1 || i12 == -1) {
                int i13 = bVar.f46005m;
                if (i13 != -1) {
                    fVar = this;
                    fVar.L(i11, 2, i13, 2, 0);
                } else {
                    int i14 = bVar.f45999j;
                    if (i14 != -1) {
                        L(i12, 1, i14, 1, 0);
                    }
                    fVar = this;
                }
            } else {
                fVar = this;
                fVar.L(i11, 2, i12, 1, 0);
                fVar.L(i12, 1, i11, 2, 0);
            }
            fVar.F(i10, 1);
            fVar.F(i10, 2);
            return;
        }
        int i15 = bVar.f46018u;
        int i16 = bVar.f46020w;
        if (i15 == -1 && i16 == -1) {
            fVar2 = this;
        } else {
            if (i15 == -1 || i16 == -1) {
                fVar2 = this;
                if (i16 != -1) {
                    int i17 = bVar.f46005m;
                    if (i17 != -1) {
                        fVar3 = fVar2;
                        fVar3.L(i11, 7, i17, 7, 0);
                    } else {
                        int i18 = bVar.f45999j;
                        if (i18 != -1) {
                            fVar2.L(i16, 6, i18, 6, 0);
                        }
                    }
                }
            } else {
                L(i15, 7, i16, 6, 0);
                fVar3 = this;
                fVar3.L(i16, 6, i11, 7, 0);
            }
            fVar2 = fVar3;
        }
        fVar2.F(i10, 6);
        fVar2.F(i10, 7);
    }

    public void P(int i10, int i11) {
        i0(i10).f45926e.f45989e = i11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public void P0(int i10) {
        f fVar;
        if (this.f45921h.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f45921h.get(Integer.valueOf(i10));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.f45926e;
            int i11 = bVar.f46009o;
            int i12 = bVar.f46011p;
            if (i11 == -1 && i12 == -1) {
                fVar = this;
            } else if (i11 == -1 || i12 == -1) {
                int i13 = bVar.f46013q;
                if (i13 != -1) {
                    fVar = this;
                    fVar.L(i11, 4, i13, 4, 0);
                } else {
                    int i14 = bVar.f46007n;
                    if (i14 != -1) {
                        L(i12, 3, i14, 3, 0);
                    }
                    fVar = this;
                }
            } else {
                fVar = this;
                fVar.L(i11, 4, i12, 3, 0);
                fVar.L(i12, 3, i11, 4, 0);
            }
        } else {
            fVar = this;
        }
        fVar.F(i10, 3);
        fVar.F(i10, 4);
    }

    public void Q(int i10, int i11) {
        i0(i10).f45926e.f45986c0 = i11;
    }

    public void Q0(int i10, float f10) {
        i0(i10).f45924c.f46053d = f10;
    }

    public void R(int i10, int i11) {
        i0(i10).f45926e.f45984b0 = i11;
    }

    public void R0(int i10, boolean z10) {
        i0(i10).f45927f.f46079m = z10;
    }

    public void S(int i10, int i11) {
        i0(i10).f45926e.f45990e0 = i11;
    }

    public void S0(int i10, int i11) {
        i0(i10).f45926e.f46000j0 = i11;
    }

    public void T(int i10, int i11) {
        i0(i10).f45926e.f45988d0 = i11;
    }

    public void T0(int i10, String str, int i11) {
        i0(i10).p(str, i11);
    }

    public void U(int i10, float f10) {
        i0(i10).f45926e.f45994g0 = f10;
    }

    public void V(int i10, float f10) {
        i0(i10).f45926e.f45992f0 = f10;
    }

    public void W(int i10, int i11) {
        i0(i10).f45926e.f45987d = i11;
    }

    public void X(int i10, boolean z10) {
        i0(i10).f45926e.f46010o0 = z10;
    }

    public void Y(int i10, boolean z10) {
        i0(i10).f45926e.f46008n0 = z10;
    }

    public void Y0(int i10, String str) {
        i0(i10).f45926e.A = str;
    }

    public void Z0(int i10, int i11) {
        i0(i10).f45926e.E = i11;
    }

    public void a0(int i10, int i11) {
        b bVar = i0(i10).f45926e;
        bVar.f45981a = true;
        bVar.G = i11;
    }

    public void a1(int i10, int i11) {
        i0(i10).f45926e.F = i11;
    }

    public void b0(int i10, int i11, int i12, int... iArr) {
        b bVar = i0(i10).f45926e;
        bVar.f46000j0 = 1;
        bVar.f45996h0 = i11;
        bVar.f45998i0 = i12;
        bVar.f45981a = false;
        bVar.f46002k0 = iArr;
    }

    public void b1(int i10, float f10) {
        i0(i10).f45927f.f46080n = f10;
        i0(i10).f45927f.f46079m = true;
    }

    public void c0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d0(i10, i11, i12, i13, iArr, fArr, i14, 1, 2);
    }

    public void c1(int i10, String str, float f10) {
        i0(i10).q(str, f10);
    }

    public void d1(boolean z10) {
        this.f45920g = z10;
    }

    public void e0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d0(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public void e1(int i10, int i11, int i12) {
        a aVarI0 = i0(i10);
        switch (i11) {
            case 1:
                aVarI0.f45926e.O = i12;
                return;
            case 2:
                aVarI0.f45926e.Q = i12;
                return;
            case 3:
                aVarI0.f45926e.P = i12;
                return;
            case 4:
                aVarI0.f45926e.R = i12;
                return;
            case 5:
                aVarI0.f45926e.U = i12;
                return;
            case 6:
                aVarI0.f45926e.T = i12;
                return;
            case 7:
                aVarI0.f45926e.S = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f0(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            i0(iArr[0]).f45926e.V = fArr[0];
        }
        i0(iArr[0]).f45926e.Y = i14;
        L(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            L(iArr[i15], 3, iArr[i16], 4, 0);
            L(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                i0(iArr[i15]).f45926e.V = fArr[i15];
            }
        }
        L(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    public void f1(int i10, int i11) {
        i0(i10).f45926e.f45991f = i11;
        i0(i10).f45926e.f45993g = -1;
        i0(i10).f45926e.f45995h = -1.0f;
    }

    public void g0(t tVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f45921h.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f45921h.get(num);
            if (aVar != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                aVar.f45926e.b(tVar, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public void g1(int i10, int i11) {
        i0(i10).f45926e.f45993g = i11;
        int i12 = 2 & (-1);
        i0(i10).f45926e.f45991f = -1;
        i0(i10).f45926e.f45995h = -1.0f;
    }

    public void h1(int i10, float f10) {
        i0(i10).f45926e.f45995h = f10;
        i0(i10).f45926e.f45993g = -1;
        i0(i10).f45926e.f45991f = -1;
    }

    public void i(String... strArr) {
        h(androidx.constraintlayout.widget.a.EnumC0369a.COLOR_TYPE, strArr);
    }

    public void i1(int i10, float f10) {
        i0(i10).f45926e.f46022y = f10;
    }

    public void j(String... strArr) {
        h(androidx.constraintlayout.widget.a.EnumC0369a.FLOAT_TYPE, strArr);
    }

    public boolean j0(int i10) {
        return i0(i10).f45927f.f46079m;
    }

    public void j1(int i10, int i11) {
        i0(i10).f45926e.X = i11;
    }

    public void k(String... strArr) {
        h(androidx.constraintlayout.widget.a.EnumC0369a.INT_TYPE, strArr);
    }

    public a k0(int i10) {
        if (this.f45921h.containsKey(Integer.valueOf(i10))) {
            return this.f45921h.get(Integer.valueOf(i10));
        }
        return null;
    }

    public void k1(int i10, float f10) {
        i0(i10).f45926e.W = f10;
    }

    public void l(String... strArr) {
        h(androidx.constraintlayout.widget.a.EnumC0369a.STRING_TYPE, strArr);
    }

    public HashMap<String, androidx.constraintlayout.widget.a> l0() {
        return this.f45919f;
    }

    public void l1(int i10, String str, int i11) {
        i0(i10).r(str, i11);
    }

    public void m(int i10, int i11, int i12) {
        L(i10, 1, i11, i11 == 0 ? 1 : 2, 0);
        L(i10, 2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            L(i11, 2, i10, 1, 0);
        }
        if (i12 != 0) {
            L(i12, 1, i10, 2, 0);
        }
    }

    public void m1(int i10, int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        i0(i10).f45926e.f46014q0 = i11;
    }

    public void n(int i10, int i11, int i12) {
        L(i10, 6, i11, i11 == 0 ? 6 : 7, 0);
        L(i10, 7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            L(i11, 7, i10, 6, 0);
        }
        if (i12 != 0) {
            L(i12, 6, i10, 7, 0);
        }
    }

    public int n0(int i10) {
        return i0(i10).f45926e.f45989e;
    }

    public void n1(int i10, int i11, int i12) {
        a aVarI0 = i0(i10);
        switch (i11) {
            case 1:
                aVarI0.f45926e.H = i12;
                return;
            case 2:
                aVarI0.f45926e.I = i12;
                return;
            case 3:
                aVarI0.f45926e.J = i12;
                return;
            case 4:
                aVarI0.f45926e.K = i12;
                return;
            case 5:
                aVarI0.f45926e.N = i12;
                return;
            case 6:
                aVarI0.f45926e.M = i12;
                return;
            case 7:
                aVarI0.f45926e.L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o(int i10, int i11, int i12) {
        L(i10, 3, i11, i11 == 0 ? 3 : 4, 0);
        L(i10, 4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            L(i11, 4, i10, 3, 0);
        }
        if (i12 != 0) {
            L(i12, 3, i10, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f45921h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public void o1(int i10, int... iArr) {
        i0(i10).f45926e.f46002k0 = iArr;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f45921h.containsKey(Integer.valueOf(id2))) {
                androidx.constraintlayout.motion.widget.c.k(childAt);
            } else {
                if (this.f45920g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f45921h.containsKey(Integer.valueOf(id2)) && (aVar = this.f45921h.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.r(childAt, aVar.f45928g);
                }
            }
        }
    }

    public void p1(int i10, float f10) {
        i0(i10).f45927f.f46068b = f10;
    }

    public void q(f fVar) {
        for (a aVar : fVar.f45921h.values()) {
            if (aVar.f45929h != null) {
                if (aVar.f45923b == null) {
                    aVar.f45929h.e(k0(aVar.f45922a));
                } else {
                    Iterator<Integer> it = this.f45921h.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarK0 = k0(it.next().intValue());
                        String str = aVarK0.f45926e.f46006m0;
                        if (str != null && aVar.f45923b.matches(str)) {
                            aVar.f45929h.e(aVarK0);
                            aVarK0.f45928g.putAll((HashMap) aVar.f45928g.clone());
                        }
                    }
                }
            }
        }
    }

    public a q0(int i10) {
        return i0(i10);
    }

    public void q1(int i10, float f10) {
        i0(i10).f45927f.f46069c = f10;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int i10) {
        int[] iArr = i0(i10).f45926e.f46002k0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int i10, float f10) {
        i0(i10).f45927f.f46070d = f10;
    }

    public void s(androidx.constraintlayout.widget.b bVar, androidx.constraintlayout.core.widgets.e eVar, ConstraintLayout.b bVar2, SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        a aVar;
        int id2 = bVar.getId();
        if (this.f45921h.containsKey(Integer.valueOf(id2)) && (aVar = this.f45921h.get(Integer.valueOf(id2))) != null && (eVar instanceof androidx.constraintlayout.core.widgets.j)) {
            bVar.B(aVar, (androidx.constraintlayout.core.widgets.j) eVar, bVar2, sparseArray);
        }
    }

    public String[] s0() {
        String[] strArr = this.f45917d;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void s1(int i10, float f10) {
        i0(i10).f45927f.f46071e = f10;
    }

    void t(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f45921h.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f45921h.containsKey(Integer.valueOf(id2))) {
                androidx.constraintlayout.motion.widget.c.k(childAt);
            } else {
                if (this.f45920g && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && this.f45921h.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f45921h.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f45926e.f46000j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f45926e.f45996h0);
                            barrier.setMargin(aVar.f45926e.f45998i0);
                            barrier.setAllowsGoneWidget(aVar.f45926e.f46012p0);
                            b bVar = aVar.f45926e;
                            int[] iArr = bVar.f46002k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f46004l0;
                                if (str != null) {
                                    bVar.f46002k0 = Z(barrier, str);
                                    barrier.setReferencedIds(aVar.f45926e.f46002k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.e();
                        aVar.i(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.r(childAt, aVar.f45928g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f45924c;
                        if (dVar.f46052c == 0) {
                            childAt.setVisibility(dVar.f46051b);
                        }
                        childAt.setAlpha(aVar.f45924c.f46053d);
                        childAt.setRotation(aVar.f45927f.f46068b);
                        childAt.setRotationX(aVar.f45927f.f46069c);
                        childAt.setRotationY(aVar.f45927f.f46070d);
                        childAt.setScaleX(aVar.f45927f.f46071e);
                        childAt.setScaleY(aVar.f45927f.f46072f);
                        e eVar = aVar.f45927f;
                        if (eVar.f46075i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f45927f.f46075i);
                            if (viewFindViewById != null) {
                                float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left2 = left - childAt.getLeft();
                                    float top2 = top - childAt.getTop();
                                    childAt.setPivotX(left2);
                                    childAt.setPivotY(top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f46073g)) {
                                childAt.setPivotX(aVar.f45927f.f46073g);
                            }
                            if (!Float.isNaN(aVar.f45927f.f46074h)) {
                                childAt.setPivotY(aVar.f45927f.f46074h);
                            }
                        }
                        childAt.setTranslationX(aVar.f45927f.f46076j);
                        childAt.setTranslationY(aVar.f45927f.f46077k);
                        childAt.setTranslationZ(aVar.f45927f.f46078l);
                        e eVar2 = aVar.f45927f;
                        if (eVar2.f46079m) {
                            childAt.setElevation(eVar2.f46080n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f45921h.get(num);
            if (aVar2 != null) {
                if (aVar2.f45926e.f46000j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f45926e;
                    int[] iArr2 = bVar3.f46002k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f46004l0;
                        if (str2 != null) {
                            bVar3.f46002k0 = Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f45926e.f46002k0);
                        }
                    }
                    barrier2.setType(aVar2.f45926e.f45996h0);
                    barrier2.setMargin(aVar2.f45926e.f45998i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.K();
                    aVar2.i(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f45926e.f45981a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).s(constraintLayout);
            }
        }
    }

    public int t0(int i10) {
        return i0(i10).f45924c.f46051b;
    }

    public void t1(int i10, float f10) {
        i0(i10).f45927f.f46072f = f10;
    }

    public void u(int i10, ConstraintLayout.b bVar) {
        a aVar;
        if (!this.f45921h.containsKey(Integer.valueOf(i10)) || (aVar = this.f45921h.get(Integer.valueOf(i10))) == null) {
            return;
        }
        aVar.i(bVar);
    }

    public int u0(int i10) {
        return i0(i10).f45924c.f46052c;
    }

    public void u1(String str) {
        this.f45917d = str.split(",");
        int i10 = 0;
        while (true) {
            String[] strArr = this.f45917d;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = strArr[i10].trim();
            i10++;
        }
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public int v0(int i10) {
        return i0(i10).f45926e.f45987d;
    }

    public void v1(String... strArr) {
        this.f45917d = strArr;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f45917d;
            if (i10 >= strArr2.length) {
                return;
            }
            strArr2[i10] = strArr2[i10].trim();
            i10++;
        }
    }

    public boolean w0() {
        return this.f45920g;
    }

    public void w1(int i10, String str, String str2) {
        i0(i10).s(str, str2);
    }

    public void x(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i12 == 1 || i12 == 2) {
            L(i10, 1, i11, i12, i13);
            L(i10, 2, i14, i15, i16);
            a aVar = this.f45921h.get(Integer.valueOf(i10));
            if (aVar != null) {
                aVar.f45926e.f46022y = f10;
                return;
            }
            return;
        }
        if (i12 == 6 || i12 == 7) {
            L(i10, 6, i11, i12, i13);
            L(i10, 7, i14, i15, i16);
            a aVar2 = this.f45921h.get(Integer.valueOf(i10));
            if (aVar2 != null) {
                aVar2.f45926e.f46022y = f10;
                return;
            }
            return;
        }
        L(i10, 3, i11, i12, i13);
        L(i10, 4, i14, i15, i16);
        a aVar3 = this.f45921h.get(Integer.valueOf(i10));
        if (aVar3 != null) {
            aVar3.f45926e.f46023z = f10;
        }
    }

    public boolean x0() {
        return this.f45914a;
    }

    public void x1(int i10, float f10, float f11) {
        e eVar = i0(i10).f45927f;
        eVar.f46074h = f11;
        eVar.f46073g = f10;
    }

    public void y(int i10, int i11) {
        if (i11 == 0) {
            x(i10, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(i10, i11, 2, 0, i11, 1, 0, 0.5f);
        }
    }

    public void y0(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarH0 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarH0.f45926e.f45981a = true;
                    }
                    this.f45921h.put(Integer.valueOf(aVarH0.f45922a), aVarH0);
                }
                eventType = xml.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void y1(int i10, float f10) {
        i0(i10).f45927f.f46073g = f10;
    }

    public void z(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        L(i10, 1, i11, i12, i13);
        L(i10, 2, i14, i15, i16);
        a aVar = this.f45921h.get(Integer.valueOf(i10));
        if (aVar != null) {
            aVar.f45926e.f46022y = f10;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void z0(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarH0 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            b bVar = aVarH0.f45926e;
                            bVar.f45981a = true;
                            bVar.f45983b = true;
                            break;
                        case "Barrier":
                            aVarH0 = h0(context, Xml.asAttributeSet(xmlPullParser), false);
                            aVarH0.f45926e.f46000j0 = 1;
                            break;
                        case "PropertySet":
                            if (aVarH0 == null) {
                                throw new RuntimeException(f45863j + xmlPullParser.getLineNumber());
                            }
                            aVarH0.f45924c.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Transform":
                            if (aVarH0 == null) {
                                throw new RuntimeException(f45863j + xmlPullParser.getLineNumber());
                            }
                            aVarH0.f45927f.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Layout":
                            if (aVarH0 == null) {
                                throw new RuntimeException(f45863j + xmlPullParser.getLineNumber());
                            }
                            aVarH0.f45926e.c(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Motion":
                            if (aVarH0 == null) {
                                throw new RuntimeException(f45863j + xmlPullParser.getLineNumber());
                            }
                            aVarH0.f45925d.b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVarH0 == null) {
                                throw new RuntimeException(f45863j + xmlPullParser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.a.q(context, xmlPullParser, aVarH0.f45928g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f45921h.put(Integer.valueOf(aVarH0.f45922a), aVarH0);
                        aVarH0 = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void z1(int i10, float f10) {
        i0(i10).f45927f.f46074h = f10;
    }
}
