package com.fasterxml.jackson.core.sym;

import androidx.compose.animation.core.z1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f102688q = 64;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f102689r = 65536;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f102690s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f102691t = 6000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f102692u = 33;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f102693v = 65599;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f102694w = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f102695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<C0927a> f102696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f102697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f102698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f102699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f102700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f102703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f102704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f102705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String[] f102706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f102708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient boolean f102709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f102710p;

    private a(int i10, boolean z10, int i11, boolean z11) {
        this.f102695a = null;
        this.f102697c = i11;
        this.f102698d = z10;
        this.f102699e = z11;
        int i12 = 16;
        if (i10 < 16) {
            i10 = i12;
        } else if (((i10 - 1) & i10) != 0) {
            while (i12 < i10) {
                i12 += i12;
            }
            i10 = i12;
        }
        this.f102696b = new AtomicReference<>(C0927a.a(i10));
    }

    public static a E() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return F((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static a F(int i10) {
        return new a(64, true, i10, true);
    }

    private void N(C0927a c0927a) {
        int i10 = c0927a.f102712b;
        C0927a c0927a2 = this.f102696b.get();
        if (i10 == c0927a2.f102712b) {
            return;
        }
        if (i10 > 6000) {
            c0927a = C0927a.a(64);
        }
        z1.a(this.f102696b, c0927a2, c0927a);
    }

    private void O(boolean z10) {
        this.f102705k = 0;
        this.f102707m = j();
        this.f102708n = this.f102701g << 3;
        if (z10) {
            Arrays.fill(this.f102700f, 0);
            Arrays.fill(this.f102706l, (Object) null);
        }
    }

    private void Q() {
        this.f102709o = false;
        this.f102710p = false;
        int[] iArr = this.f102700f;
        String[] strArr = this.f102706l;
        int i10 = this.f102701g;
        int i11 = this.f102705k;
        int i12 = i10 + i10;
        int i13 = this.f102707m;
        if (i12 > 65536) {
            O(true);
            return;
        }
        this.f102700f = new int[iArr.length + (i10 << 3)];
        this.f102701g = i12;
        int i14 = i12 << 2;
        this.f102702h = i14;
        this.f102703i = i14 + (i14 >> 1);
        this.f102704j = c(i12);
        this.f102706l = new String[strArr.length << 1];
        O(false);
        int[] iArr2 = new int[16];
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += 4) {
            int i17 = iArr[i16 + 3];
            if (i17 != 0) {
                i15++;
                String str = strArr[i16 >> 2];
                if (i17 == 1) {
                    iArr2[0] = iArr[i16];
                    y(str, iArr2, 1);
                } else if (i17 == 2) {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    y(str, iArr2, 2);
                } else if (i17 != 3) {
                    if (i17 > iArr2.length) {
                        iArr2 = new int[i17];
                    }
                    System.arraycopy(iArr, iArr[i16 + 1], iArr2, 0, i17);
                    y(str, iArr2, i17);
                } else {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    iArr2[2] = iArr[i16 + 2];
                    y(str, iArr2, 3);
                }
            }
        }
        if (i15 == i11) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i11 + ", copyCount=" + i15);
    }

    private int a(int[] iArr, int i10) {
        int i11 = this.f102708n;
        int i12 = i11 + i10;
        int[] iArr2 = this.f102700f;
        if (i12 > iArr2.length) {
            this.f102700f = Arrays.copyOf(this.f102700f, this.f102700f.length + Math.max(i12 - iArr2.length, Math.min(4096, this.f102701g)));
        }
        System.arraycopy(iArr, 0, this.f102700f, i11, i10);
        this.f102708n += i10;
        return i11;
    }

    private final int b(int i10) {
        return ((this.f102701g - 1) & i10) << 2;
    }

    static int c(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private int d(int i10) {
        int iB = b(i10);
        int[] iArr = this.f102700f;
        if (iArr[iB + 3] == 0) {
            return iB;
        }
        int i11 = this.f102702h + ((iB >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this.f102703i;
        int i13 = this.f102704j;
        int i14 = i12 + ((iB >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this.f102707m;
        int i17 = i16 + 4;
        this.f102707m = i17;
        if (i17 >= (this.f102701g << 3)) {
            if (this.f102699e) {
                i();
            }
            this.f102709o = true;
        }
        return i16;
    }

    private String e(int i10, int i11) {
        int i12 = this.f102703i;
        int i13 = this.f102704j;
        int i14 = i12 + ((i10 >> (i13 + 2)) << i13);
        int[] iArr = this.f102700f;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr[i14 + 3];
            if (i11 == iArr[i14] && 1 == i16) {
                return this.f102706l[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int iJ = j(); iJ < this.f102707m; iJ += 4) {
            if (i11 == iArr[iJ] && 1 == iArr[iJ + 3]) {
                return this.f102706l[iJ >> 2];
            }
        }
        return null;
    }

    private String f(int i10, int i11, int i12) {
        int i13 = this.f102703i;
        int i14 = this.f102704j;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr = this.f102700f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i11 == iArr[i15] && i12 == iArr[i15 + 1] && 2 == i17) {
                return this.f102706l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int iJ = j(); iJ < this.f102707m; iJ += 4) {
            if (i11 == iArr[iJ] && i12 == iArr[iJ + 1] && 2 == iArr[iJ + 3]) {
                return this.f102706l[iJ >> 2];
            }
        }
        return null;
    }

    private String g(int i10, int i11, int i12, int i13) {
        int i14 = this.f102703i;
        int i15 = this.f102704j;
        int i16 = i14 + ((i10 >> (i15 + 2)) << i15);
        int[] iArr = this.f102700f;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i11 == iArr[i16] && i12 == iArr[i16 + 1] && i13 == iArr[i16 + 2] && 3 == i18) {
                return this.f102706l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int iJ = j(); iJ < this.f102707m; iJ += 4) {
            if (i11 == iArr[iJ] && i12 == iArr[iJ + 1] && i13 == iArr[iJ + 2] && 3 == iArr[iJ + 3]) {
                return this.f102706l[iJ >> 2];
            }
        }
        return null;
    }

    private String h(int i10, int i11, int[] iArr, int i12) {
        int i13 = this.f102703i;
        int i14 = this.f102704j;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr2 = this.f102700f;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr2[i15 + 3];
            if (i11 == iArr2[i15] && i12 == i17 && k(iArr, i12, iArr2[i15 + 1])) {
                return this.f102706l[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int iJ = j(); iJ < this.f102707m; iJ += 4) {
            if (i11 == iArr2[iJ] && i12 == iArr2[iJ + 3] && k(iArr, i12, iArr2[iJ + 1])) {
                return this.f102706l[iJ >> 2];
            }
        }
        return null;
    }

    private final int j() {
        int i10 = this.f102701g;
        return (i10 << 3) - i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    private boolean k(int[] iArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int[] iArr2 = this.f102700f;
        switch (i10) {
            case 4:
                i12 = 0;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                return iArr[i18] != iArr2[i19] && iArr[i12 + 3] == iArr2[i11 + 3];
            case 5:
                i13 = 0;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 6:
                i14 = 0;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 7:
                i15 = 0;
                i14 = i15 + 1;
                i22 = i11 + 1;
                if (iArr[i15] != iArr2[i11]) {
                    return false;
                }
                i11 = i22;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            case 8:
                int i23 = i11 + 1;
                if (iArr[0] != iArr2[i11]) {
                    return false;
                }
                i11 = i23;
                i15 = 1;
                i14 = i15 + 1;
                i22 = i11 + 1;
                if (iArr[i15] != iArr2[i11]) {
                    return false;
                }
                i11 = i22;
                i13 = i14 + 1;
                i21 = i11 + 1;
                if (iArr[i14] != iArr2[i11]) {
                    return false;
                }
                i11 = i21;
                i12 = i13 + 1;
                i20 = i11 + 1;
                if (iArr[i13] != iArr2[i11]) {
                    return false;
                }
                i11 = i20;
                i16 = i12 + 1;
                i17 = i11 + 1;
                if (iArr[i12] != iArr2[i11]) {
                    return false;
                }
                i18 = i12 + 2;
                i19 = i11 + 2;
                if (iArr[i16] != iArr2[i17]) {
                    return false;
                }
                if (iArr[i18] != iArr2[i19]) {
                    return false;
                }
            default:
                return l(iArr, i10, i11);
        }
    }

    private boolean l(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            if (iArr[i12] != this.f102700f[i11]) {
                return false;
            }
            if (i13 >= i10) {
                return true;
            }
            i12 = i13;
            i11 = i14;
        }
    }

    private void m() {
        if (this.f102705k > (this.f102701g >> 1)) {
            int iJ = (this.f102707m - j()) >> 2;
            int i10 = this.f102705k;
            if (iJ > ((i10 + 1) >> 7) || i10 > ((double) this.f102701g) * 0.8d) {
                this.f102709o = true;
            }
        }
    }

    private void n() {
        if (this.f102710p) {
            int[] iArr = this.f102700f;
            this.f102700f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f102706l;
            this.f102706l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f102710p = false;
            m();
        }
        if (this.f102709o) {
            Q();
        }
    }

    public int A(int i10) {
        int i11 = this.f102697c ^ i10;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public int B(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = this.f102697c ^ ((i12 ^ (i12 >>> 9)) + (i11 * 33));
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public int C(int i10, int i11, int i12) {
        int i13 = this.f102697c ^ i10;
        int i14 = (((i13 + (i13 >>> 9)) * 31) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    public int D(int[] iArr, int i10) {
        if (i10 < 4) {
            throw new IllegalArgumentException();
        }
        int i11 = this.f102697c ^ iArr[0];
        int i12 = i11 + (i11 >>> 9) + iArr[1];
        int i13 = 6 | 2;
        int i14 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
        int i15 = i14 + (i14 >>> 4);
        for (int i16 = 3; i16 < i10; i16++) {
            int i17 = iArr[i16];
            i15 += i17 ^ (i17 >> 21);
        }
        int i18 = i15 * f102693v;
        int i19 = i18 + (i18 >>> 19);
        return i19 ^ (i19 << 5);
    }

    public String G(int i10) {
        int iB = b(A(i10));
        int[] iArr = this.f102700f;
        int i11 = iArr[iB + 3];
        if (i11 == 1) {
            if (iArr[iB] == i10) {
                return this.f102706l[iB >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this.f102702h + ((iB >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this.f102706l[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        return e(iB, i10);
    }

    public String H(int i10, int i11) {
        int iB = b(B(i10, i11));
        int[] iArr = this.f102700f;
        int i12 = iArr[iB + 3];
        if (i12 == 2) {
            if (i10 == iArr[iB] && i11 == iArr[iB + 1]) {
                return this.f102706l[iB >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f102702h + ((iB >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this.f102706l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return f(iB, i10, i11);
    }

    public String I(int i10, int i11, int i12) {
        int iB = b(C(i10, i11, i12));
        int[] iArr = this.f102700f;
        int i13 = iArr[iB + 3];
        if (i13 == 3) {
            if (i10 == iArr[iB] && iArr[iB + 1] == i11 && iArr[iB + 2] == i12) {
                return this.f102706l[iB >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f102702h + ((iB >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this.f102706l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        return g(iB, i10, i11, i12);
    }

    public String J(int[] iArr, int i10) {
        if (i10 < 4) {
            if (i10 == 1) {
                return G(iArr[0]);
            }
            if (i10 != 2) {
                return i10 != 3 ? "" : I(iArr[0], iArr[1], iArr[2]);
            }
            return H(iArr[0], iArr[1]);
        }
        int iD = D(iArr, i10);
        int iB = b(iD);
        int[] iArr2 = this.f102700f;
        int i11 = iArr2[iB + 3];
        if (iD == iArr2[iB] && i11 == i10 && k(iArr, i10, iArr2[iB + 1])) {
            return this.f102706l[iB >> 2];
        }
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f102702h + ((iB >> 3) << 2);
        return (iD == iArr2[i12] && iArr2[i12 + 3] == i10 && k(iArr, i10, iArr2[i12 + 1])) ? this.f102706l[i12 >> 2] : h(iB, iD, iArr, i10);
    }

    public int K() {
        return this.f102697c;
    }

    public a L(int i10) {
        return new a(this, com.fasterxml.jackson.core.f.a.INTERN_FIELD_NAMES.n(i10), this.f102697c, com.fasterxml.jackson.core.f.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.n(i10), this.f102696b.get());
    }

    public boolean M() {
        return !this.f102710p;
    }

    public int P() {
        int i10 = this.f102702h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f102700f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public void R() {
        if (this.f102695a != null && M()) {
            this.f102695a.N(new C0927a(this));
            this.f102710p = true;
        }
    }

    public int S() {
        int i10 = this.f102703i;
        int i11 = 0;
        for (int i12 = this.f102702h + 3; i12 < i10; i12 += 4) {
            if (this.f102700f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int T() {
        AtomicReference<C0927a> atomicReference = this.f102696b;
        return atomicReference != null ? atomicReference.get().f102712b : this.f102705k;
    }

    public int U() {
        return (this.f102707m - j()) >> 2;
    }

    public int V() {
        int i10 = this.f102703i + 3;
        int i11 = this.f102701g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f102700f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public int W() {
        int i10 = this.f102701g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f102700f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    protected void i() {
        if (this.f102701g <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.f102705k + " entries, hash area of " + this.f102701g + " slots is now full (all " + (this.f102701g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String toString() {
        int iP = P();
        int iS = S();
        int iV = V();
        int iU = U();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f102705k), Integer.valueOf(this.f102701g), Integer.valueOf(iP), Integer.valueOf(iS), Integer.valueOf(iV), Integer.valueOf(iU), Integer.valueOf(iP + iS + iV + iU), Integer.valueOf(W()));
    }

    public String v(String str, int i10) {
        n();
        if (this.f102698d) {
            str = com.fasterxml.jackson.core.util.g.f102818d.a(str);
        }
        int iD = d(A(i10));
        int[] iArr = this.f102700f;
        iArr[iD] = i10;
        iArr[iD + 3] = 1;
        this.f102706l[iD >> 2] = str;
        this.f102705k++;
        m();
        return str;
    }

    public String w(String str, int i10, int i11) {
        n();
        if (this.f102698d) {
            str = com.fasterxml.jackson.core.util.g.f102818d.a(str);
        }
        int iD = d(i11 == 0 ? A(i10) : B(i10, i11));
        int[] iArr = this.f102700f;
        iArr[iD] = i10;
        iArr[iD + 1] = i11;
        iArr[iD + 3] = 2;
        this.f102706l[iD >> 2] = str;
        this.f102705k++;
        m();
        return str;
    }

    public String x(String str, int i10, int i11, int i12) {
        n();
        if (this.f102698d) {
            str = com.fasterxml.jackson.core.util.g.f102818d.a(str);
        }
        int iD = d(C(i10, i11, i12));
        int[] iArr = this.f102700f;
        iArr[iD] = i10;
        iArr[iD + 1] = i11;
        iArr[iD + 2] = i12;
        iArr[iD + 3] = 3;
        this.f102706l[iD >> 2] = str;
        this.f102705k++;
        m();
        return str;
    }

    public String y(String str, int[] iArr, int i10) {
        int iD;
        n();
        if (this.f102698d) {
            str = com.fasterxml.jackson.core.util.g.f102818d.a(str);
        }
        if (i10 == 1) {
            iD = d(A(iArr[0]));
            int[] iArr2 = this.f102700f;
            iArr2[iD] = iArr[0];
            iArr2[iD + 3] = 1;
        } else if (i10 != 2) {
            int i11 = 5 ^ 3;
            if (i10 != 3) {
                int iD2 = D(iArr, i10);
                iD = d(iD2);
                this.f102700f[iD] = iD2;
                int iA = a(iArr, i10);
                int[] iArr3 = this.f102700f;
                iArr3[iD + 1] = iA;
                iArr3[iD + 3] = i10;
            } else {
                int iD3 = d(C(iArr[0], iArr[1], iArr[2]));
                int[] iArr4 = this.f102700f;
                iArr4[iD3] = iArr[0];
                iArr4[iD3 + 1] = iArr[1];
                iArr4[iD3 + 2] = iArr[2];
                iArr4[iD3 + 3] = 3;
                iD = iD3;
            }
        } else {
            iD = d(B(iArr[0], iArr[1]));
            int[] iArr5 = this.f102700f;
            iArr5[iD] = iArr[0];
            iArr5[iD + 1] = iArr[1];
            iArr5[iD + 3] = 2;
        }
        this.f102706l[iD >> 2] = str;
        this.f102705k++;
        m();
        return str;
    }

    public int z() {
        return this.f102701g;
    }

    private a(a aVar, boolean z10, int i10, boolean z11, C0927a c0927a) {
        this.f102695a = aVar;
        this.f102697c = i10;
        this.f102698d = z10;
        this.f102699e = z11;
        this.f102696b = null;
        this.f102705k = c0927a.f102712b;
        int i11 = c0927a.f102711a;
        this.f102701g = i11;
        int i12 = i11 << 2;
        this.f102702h = i12;
        this.f102703i = i12 + (i12 >> 1);
        this.f102704j = c0927a.f102713c;
        this.f102700f = c0927a.f102714d;
        this.f102706l = c0927a.f102715e;
        this.f102707m = c0927a.f102716f;
        this.f102708n = c0927a.f102717g;
        this.f102709o = false;
        this.f102710p = true;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.sym.a$a, reason: collision with other inner class name */
    private static final class C0927a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f102711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f102712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f102713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f102714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f102715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f102716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f102717g;

        public C0927a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.f102711a = i10;
            this.f102712b = i11;
            this.f102713c = i12;
            this.f102714d = iArr;
            this.f102715e = strArr;
            this.f102716f = i13;
            this.f102717g = i14;
        }

        public static C0927a a(int i10) {
            int i11 = i10 << 3;
            int i12 = 2 & 0;
            return new C0927a(i10, 0, a.c(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }

        public C0927a(a aVar) {
            this.f102711a = aVar.f102701g;
            this.f102712b = aVar.f102705k;
            this.f102713c = aVar.f102704j;
            this.f102714d = aVar.f102700f;
            this.f102715e = aVar.f102706l;
            this.f102716f = aVar.f102707m;
            this.f102717g = aVar.f102708n;
        }
    }
}
