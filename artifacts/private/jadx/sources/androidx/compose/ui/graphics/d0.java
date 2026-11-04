package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@androidx.compose.runtime.o2
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37693b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37694c = E(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37695d = E(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37696e = E(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f37697f = E(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f37698g = E(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f37699h = E(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f37700i = E(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f37701j = E(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f37702k = E(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f37703l = E(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f37704m = E(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f37705n = E(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f37706o = E(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f37707p = E(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f37708q = E(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f37709r = E(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f37710s = E(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f37711t = E(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f37712u = E(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f37713v = E(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f37714w = E(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f37715x = E(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f37716y = E(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f37717z = E(23);
    private static final int A = E(24);
    private static final int B = E(25);
    private static final int C = E(26);
    private static final int D = E(27);
    private static final int E = E(28);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return d0.f37701j;
        }

        public final int B() {
            return d0.f37697f;
        }

        public final int C() {
            return d0.f37705n;
        }

        public final int a() {
            return d0.f37694c;
        }

        public final int b() {
            return d0.D;
        }

        public final int c() {
            return d0.f37713v;
        }

        public final int d() {
            return d0.f37712u;
        }

        public final int e() {
            return d0.f37710s;
        }

        public final int f() {
            return d0.f37716y;
        }

        public final int g() {
            return d0.f37696e;
        }

        public final int h() {
            return d0.f37704m;
        }

        public final int i() {
            return d0.f37700i;
        }

        public final int j() {
            return d0.f37702k;
        }

        public final int k() {
            return d0.f37698g;
        }

        public final int l() {
            return d0.f37717z;
        }

        public final int m() {
            return d0.f37714w;
        }

        public final int n() {
            return d0.B;
        }

        public final int o() {
            return d0.f37711t;
        }

        public final int p() {
            return d0.E;
        }

        public final int q() {
            return d0.f37707p;
        }

        public final int r() {
            return d0.A;
        }

        public final int s() {
            return d0.f37709r;
        }

        public final int t() {
            return d0.f37706o;
        }

        public final int u() {
            return d0.C;
        }

        public final int v() {
            return d0.f37708q;
        }

        public final int w() {
            return d0.f37715x;
        }

        public final int x() {
            return d0.f37695d;
        }

        public final int y() {
            return d0.f37703l;
        }

        public final int z() {
            return d0.f37699h;
        }

        private a() {
        }
    }

    private /* synthetic */ d0(int i10) {
        this.f37718a = i10;
    }

    public static final /* synthetic */ d0 D(int i10) {
        return new d0(i10);
    }

    public static int E(int i10) {
        return i10;
    }

    public static boolean F(int i10, Object obj) {
        return (obj instanceof d0) && i10 == ((d0) obj).J();
    }

    public static final boolean G(int i10, int i11) {
        return i10 == i11;
    }

    public static int H(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String I(int i10) {
        if (G(i10, f37694c)) {
            return "Clear";
        }
        if (G(i10, f37695d)) {
            return "Src";
        }
        if (G(i10, f37696e)) {
            return "Dst";
        }
        if (G(i10, f37697f)) {
            return "SrcOver";
        }
        if (G(i10, f37698g)) {
            return "DstOver";
        }
        if (G(i10, f37699h)) {
            return "SrcIn";
        }
        if (G(i10, f37700i)) {
            return "DstIn";
        }
        if (G(i10, f37701j)) {
            return "SrcOut";
        }
        if (G(i10, f37702k)) {
            return "DstOut";
        }
        if (G(i10, f37703l)) {
            return "SrcAtop";
        }
        if (G(i10, f37704m)) {
            return "DstAtop";
        }
        if (G(i10, f37705n)) {
            return "Xor";
        }
        if (G(i10, f37706o)) {
            return "Plus";
        }
        if (G(i10, f37707p)) {
            return "Modulate";
        }
        if (G(i10, f37708q)) {
            return "Screen";
        }
        if (G(i10, f37709r)) {
            return "Overlay";
        }
        if (G(i10, f37710s)) {
            return "Darken";
        }
        if (G(i10, f37711t)) {
            return "Lighten";
        }
        if (G(i10, f37712u)) {
            return "ColorDodge";
        }
        if (G(i10, f37713v)) {
            return "ColorBurn";
        }
        if (G(i10, f37714w)) {
            return "HardLight";
        }
        if (G(i10, f37715x)) {
            return "Softlight";
        }
        if (G(i10, f37716y)) {
            return "Difference";
        }
        if (G(i10, f37717z)) {
            return "Exclusion";
        }
        if (G(i10, A)) {
            return "Multiply";
        }
        if (G(i10, B)) {
            return "Hue";
        }
        if (G(i10, C)) {
            return androidx.exifinterface.media.a.f51439m1;
        }
        if (G(i10, D)) {
            return "Color";
        }
        return G(i10, E) ? "Luminosity" : com.facebook.internal.a.f99697t;
    }

    public final /* synthetic */ int J() {
        return this.f37718a;
    }

    public boolean equals(Object obj) {
        return F(this.f37718a, obj);
    }

    public int hashCode() {
        return H(this.f37718a);
    }

    @NotNull
    public String toString() {
        return I(this.f37718a);
    }
}
