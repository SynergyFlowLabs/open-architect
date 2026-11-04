package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class i implements Comparable<i> {
    public static final int H1 = 4;
    private static final boolean X = false;
    public static final int Y = 0;
    public static final int Z = 1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f43417g3 = 6;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f43418h3 = 7;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f43419i3 = 8;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static int f43420j3 = 1;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static int f43421k3 = 1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static int f43422l3 = 1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static int f43423m3 = 1;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static int f43424n3 = 1;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    static final int f43425o3 = 9;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f43426p0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f43427p1 = 3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f43428p2 = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f43429v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f43430w = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f43434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f43436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f43438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f43439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f43440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f43441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f43442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f43444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f43445o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f43446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    HashSet<b> f43447t;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, a aVar) {
        this.f43433c = -1;
        this.f43434d = -1;
        this.f43435e = 0;
        this.f43437g = false;
        this.f43438h = new float[9];
        this.f43439i = new float[9];
        this.f43441k = new b[16];
        this.f43442l = 0;
        this.f43443m = 0;
        this.f43444n = false;
        this.f43445o = -1;
        this.f43446s = 0.0f;
        this.f43447t = null;
        this.f43432b = str;
        this.f43440j = aVar;
    }

    private static String o(a aVar, String str) {
        if (str != null) {
            return str + f43421k3;
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("U");
            int i10 = f43422l3 + 1;
            f43422l3 = i10;
            sb2.append(i10);
            return sb2.toString();
        }
        if (iOrdinal == 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("C");
            int i11 = f43423m3 + 1;
            f43423m3 = i11;
            sb3.append(i11);
            return sb3.toString();
        }
        if (iOrdinal == 2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(androidx.exifinterface.media.a.S4);
            int i12 = f43420j3 + 1;
            f43420j3 = i12;
            sb4.append(i12);
            return sb4.toString();
        }
        if (iOrdinal == 3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("e");
            int i13 = f43421k3 + 1;
            f43421k3 = i13;
            sb5.append(i13);
            return sb5.toString();
        }
        if (iOrdinal != 4) {
            throw new AssertionError(aVar.name());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(androidx.exifinterface.media.a.Y4);
        int i14 = f43424n3 + 1;
        f43424n3 = i14;
        sb6.append(i14);
        return sb6.toString();
    }

    static void p() {
        f43421k3++;
    }

    public final void b(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f43442l;
            if (i10 >= i11) {
                b[] bVarArr = this.f43441k;
                if (i11 >= bVarArr.length) {
                    this.f43441k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f43441k;
                int i12 = this.f43442l;
                bVarArr2[i12] = bVar;
                this.f43442l = i12 + 1;
                return;
            }
            if (this.f43441k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    void k() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f43438h[i10] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f43433c - iVar.f43433c;
    }

    public String n() {
        return this.f43432b;
    }

    public final void q(b bVar) {
        int i10 = this.f43442l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f43441k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f43441k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f43442l--;
                return;
            }
            i11++;
        }
    }

    public void r() {
        this.f43432b = null;
        this.f43440j = a.UNKNOWN;
        this.f43435e = 0;
        this.f43433c = -1;
        this.f43434d = -1;
        this.f43436f = 0.0f;
        this.f43437g = false;
        this.f43444n = false;
        this.f43445o = -1;
        this.f43446s = 0.0f;
        int i10 = this.f43442l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f43441k[i11] = null;
        }
        this.f43442l = 0;
        this.f43443m = 0;
        this.f43431a = false;
        Arrays.fill(this.f43439i, 0.0f);
    }

    public void s(e eVar, float f10) {
        this.f43436f = f10;
        this.f43437g = true;
        this.f43444n = false;
        this.f43445o = -1;
        int i10 = 3 | 0;
        this.f43446s = 0.0f;
        int i11 = this.f43442l;
        this.f43434d = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f43441k[i12].a(eVar, this, false);
        }
        this.f43442l = 0;
    }

    public void t(String str) {
        this.f43432b = str;
    }

    public String toString() {
        if (this.f43432b != null) {
            return "" + this.f43432b;
        }
        return "" + this.f43433c;
    }

    public void v(e eVar, i iVar, float f10) {
        this.f43444n = true;
        this.f43445o = iVar.f43433c;
        this.f43446s = f10;
        int i10 = this.f43442l;
        this.f43434d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f43441k[i11].G(eVar, this, false);
        }
        this.f43442l = 0;
        eVar.x();
    }

    public void w(a aVar, String str) {
        this.f43440j = aVar;
    }

    String x() {
        String str = this + "[";
        boolean z10 = false;
        boolean z11 = true;
        for (int i10 = 0; i10 < this.f43438h.length; i10++) {
            String str2 = str + this.f43438h[i10];
            float[] fArr = this.f43438h;
            float f10 = fArr[i10];
            if (f10 > 0.0f) {
                z10 = false;
            } else if (f10 < 0.0f) {
                z10 = true;
            }
            if (f10 != 0.0f) {
                z11 = false;
            }
            str = i10 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z10) {
            str = str + " (-)";
        }
        if (!z11) {
            return str;
        }
        return str + " (*)";
    }

    public final void z(e eVar, b bVar) {
        int i10 = this.f43442l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f43441k[i11].b(eVar, bVar, false);
        }
        this.f43442l = 0;
    }

    public i(a aVar, String str) {
        this.f43433c = -1;
        this.f43434d = -1;
        this.f43435e = 0;
        this.f43437g = false;
        this.f43438h = new float[9];
        this.f43439i = new float[9];
        this.f43441k = new b[16];
        this.f43442l = 0;
        this.f43443m = 0;
        this.f43444n = false;
        this.f43445o = -1;
        this.f43446s = 0.0f;
        this.f43447t = null;
        this.f43440j = aVar;
    }
}
