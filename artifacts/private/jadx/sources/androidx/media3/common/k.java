package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f60792h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f60793i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f60794j = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f60795k = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f60796l = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f60797m = androidx.media3.common.util.k1.c1(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f60798n = androidx.media3.common.util.k1.c1(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f60799o = androidx.media3.common.util.k1.c1(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final byte[] f60803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f60804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f60805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f60806g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f60808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f60809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f60810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f60811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f60812f;

        public k a() {
            return new k(this.f60807a, this.f60808b, this.f60809c, this.f60810d, this.f60811e, this.f60812f);
        }

        @z7.a
        public b b(int i10) {
            this.f60812f = i10;
            return this;
        }

        @z7.a
        public b c(int i10) {
            this.f60808b = i10;
            return this;
        }

        @z7.a
        public b d(int i10) {
            this.f60807a = i10;
            return this;
        }

        @z7.a
        public b e(int i10) {
            this.f60809c = i10;
            return this;
        }

        @z7.a
        public b f(@androidx.annotation.p0 byte[] bArr) {
            this.f60810d = bArr;
            return this;
        }

        @z7.a
        public b g(int i10) {
            this.f60811e = i10;
            return this;
        }

        public b() {
            this.f60807a = -1;
            this.f60808b = -1;
            this.f60809c = -1;
            this.f60811e = -1;
            this.f60812f = -1;
        }

        private b(k kVar) {
            this.f60807a = kVar.f60800a;
            this.f60808b = kVar.f60801b;
            this.f60809c = kVar.f60802c;
            this.f60810d = kVar.f60803d;
            this.f60811e = kVar.f60804e;
            this.f60812f = kVar.f60805f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    public static int d(int i10) {
        if (i10 != 2) {
            return i10 != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int e(int i10) {
        if (i10 != 2) {
            return i10 != 6 ? 1 : 9;
        }
        return 6;
    }

    private static String f(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 13;
        }
        if (i10 == 6) {
            return 16;
        }
        if (i10 != 7) {
            return i10 != 10 ? 1 : 4;
        }
        return 18;
    }

    private static String h(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static k i(Bundle bundle) {
        return new k(bundle.getInt(f60794j, -1), bundle.getInt(f60795k, -1), bundle.getInt(f60796l, -1), bundle.getByteArray(f60797m), bundle.getInt(f60798n, -1), bundle.getInt(f60799o, -1));
    }

    @il.e(expression = {"#1"}, result = false)
    public static boolean l(@androidx.annotation.p0 k kVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (kVar == null) {
            return true;
        }
        int i14 = kVar.f60800a;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = kVar.f60801b) == -1 || i10 == 2) && (((i11 = kVar.f60802c) == -1 || i11 == 3) && kVar.f60803d == null && (((i12 = kVar.f60805f) == -1 || i12 == 8) && ((i13 = kVar.f60804e) == -1 || i13 == 8)));
    }

    public static boolean m(@androidx.annotation.p0 k kVar) {
        int i10;
        return kVar != null && ((i10 = kVar.f60802c) == 7 || i10 == 6);
    }

    @xl.d
    public static int o(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            int i11 = 3 >> 7;
            if (i10 != 7) {
                return -1;
            }
        }
        return 2;
    }

    @xl.d
    public static int p(int i10) {
        if (i10 != 1) {
            if (i10 == 4) {
                return 10;
            }
            if (i10 == 13) {
                return 2;
            }
            if (i10 == 16) {
                return 6;
            }
            if (i10 == 18) {
                return 7;
            }
            if (i10 != 6 && i10 != 7) {
                return -1;
            }
        }
        return 3;
    }

    private static String q(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f60800a == kVar.f60800a && this.f60801b == kVar.f60801b && this.f60802c == kVar.f60802c && Arrays.equals(this.f60803d, kVar.f60803d) && this.f60804e == kVar.f60804e && this.f60805f == kVar.f60805f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f60806g == 0) {
            this.f60806g = ((((((((((527 + this.f60800a) * 31) + this.f60801b) * 31) + this.f60802c) * 31) + Arrays.hashCode(this.f60803d)) * 31) + this.f60804e) * 31) + this.f60805f;
        }
        return this.f60806g;
    }

    public boolean j() {
        return (this.f60804e == -1 || this.f60805f == -1) ? false : true;
    }

    public boolean k() {
        return (this.f60800a == -1 || this.f60801b == -1 || this.f60802c == -1) ? false : true;
    }

    public boolean n() {
        return j() || k();
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putInt(f60794j, this.f60800a);
        bundle.putInt(f60795k, this.f60801b);
        bundle.putInt(f60796l, this.f60802c);
        bundle.putByteArray(f60797m, this.f60803d);
        bundle.putInt(f60798n, this.f60804e);
        bundle.putInt(f60799o, this.f60805f);
        return bundle;
    }

    public String s() {
        String str;
        String strS = k() ? androidx.media3.common.util.k1.S("%s/%s/%s", f(this.f60800a), c(this.f60801b), h(this.f60802c)) : "NA/NA/NA";
        if (j()) {
            str = this.f60804e + "/" + this.f60805f;
        } else {
            str = "NA/NA";
        }
        return strS + "/" + str;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(f(this.f60800a));
        sb2.append(", ");
        sb2.append(c(this.f60801b));
        sb2.append(", ");
        sb2.append(h(this.f60802c));
        sb2.append(", ");
        if (this.f60803d != null) {
            z10 = true;
            int i10 = 6 >> 1;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        sb2.append(q(this.f60804e));
        sb2.append(", ");
        sb2.append(b(this.f60805f));
        sb2.append(")");
        return sb2.toString();
    }

    private k(int i10, int i11, int i12, @androidx.annotation.p0 byte[] bArr, int i13, int i14) {
        this.f60800a = i10;
        this.f60801b = i11;
        this.f60802c = i12;
        this.f60803d = bArr;
        this.f60804e = i13;
        this.f60805f = i14;
    }
}
