package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f307010a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f307011b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f307012c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f307013d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f307014e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f307015f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f307016g = false;

    /* JADX INFO: renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    static abstract class AbstractC2235a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f307017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f307018b;

        AbstractC2235a() {
        }

        public abstract int a(int i10);

        public abstract boolean b(byte[] bArr, int i10, int i11, boolean z10);
    }

    static class b extends AbstractC2235a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f307019f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f307020g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f307021h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f307022i = -2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f307023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f307024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f307025e;

        public b(int i10, byte[] bArr) {
            this.f307017a = bArr;
            this.f307025e = (i10 & 8) == 0 ? f307019f : f307020g;
            this.f307023c = 0;
            this.f307024d = 0;
        }

        @Override // io.sentry.vendor.a.AbstractC2235a
        public int a(int i10) {
            return ((i10 * 3) / 4) + 10;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
        @Override // io.sentry.vendor.a.AbstractC2235a
        public boolean b(byte[] bArr, int i10, int i11, boolean z10) {
            int i12 = this.f307023c;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f307024d;
            byte[] bArr2 = this.f307017a;
            int[] iArr = this.f307025e;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & 255] << 18) | (iArr[bArr[i18 + 1] & 255] << 12) | (iArr[bArr[i18 + 2] & 255] << 6) | iArr[bArr[i18 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & 255];
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 != 4) {
                                    if (i17 == 5 && i21 != -1) {
                                        this.f307023c = 6;
                                        return false;
                                    }
                                } else if (i21 == -2) {
                                    i17++;
                                } else if (i21 != -1) {
                                    this.f307023c = 6;
                                    return false;
                                }
                            } else if (i21 >= 0) {
                                int i22 = i21 | (i16 << 6);
                                bArr2[i15 + 2] = (byte) i22;
                                bArr2[i15 + 1] = (byte) (i22 >> 8);
                                bArr2[i15] = (byte) (i22 >> 16);
                                i15 += 3;
                                i16 = i22;
                                i17 = 0;
                            } else if (i21 == -2) {
                                bArr2[i15 + 1] = (byte) (i16 >> 2);
                                bArr2[i15] = (byte) (i16 >> 10);
                                i15 += 2;
                                i17 = 5;
                            } else if (i21 != -1) {
                                this.f307023c = 6;
                                return false;
                            }
                        } else if (i21 >= 0) {
                            i21 |= i16 << 6;
                            i17++;
                            i16 = i21;
                        } else if (i21 == -2) {
                            bArr2[i15] = (byte) (i16 >> 4);
                            i15++;
                            i17 = 4;
                        } else if (i21 != -1) {
                            this.f307023c = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        i21 |= i16 << 6;
                        i17++;
                        i16 = i21;
                    } else if (i21 != -1) {
                        this.f307023c = 6;
                        return false;
                    }
                } else if (i21 >= 0) {
                    i17++;
                    i16 = i21;
                } else if (i21 != -1) {
                    this.f307023c = 6;
                    return false;
                }
                i18 = i20;
            }
            if (!z10) {
                this.f307023c = i17;
                this.f307024d = i16;
                this.f307018b = i15;
                return true;
            }
            if (i17 == 1) {
                this.f307023c = 6;
                return false;
            }
            if (i17 == 2) {
                bArr2[i15] = (byte) (i16 >> 4);
                i15++;
            } else if (i17 == 3) {
                int i23 = i15 + 1;
                bArr2[i15] = (byte) (i16 >> 10);
                i15 += 2;
                bArr2[i23] = (byte) (i16 >> 2);
            } else if (i17 == 4) {
                this.f307023c = 6;
                return false;
            }
            this.f307023c = i17;
            this.f307018b = i15;
            return true;
        }
    }

    static class c extends AbstractC2235a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f307026j = 19;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final byte[] f307027k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final byte[] f307028l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ boolean f307029m = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f307030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f307031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f307032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f307033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f307034g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f307035h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f307036i;

        public c(int i10, byte[] bArr) {
            this.f307017a = bArr;
            this.f307033f = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f307034g = z10;
            this.f307035h = (i10 & 4) != 0;
            this.f307036i = (i10 & 8) == 0 ? f307027k : f307028l;
            this.f307030c = new byte[2];
            this.f307031d = 0;
            this.f307032e = z10 ? 19 : -1;
        }

        @Override // io.sentry.vendor.a.AbstractC2235a
        public int a(int i10) {
            return ((i10 * 8) / 5) + 10;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0053  */
        @Override // io.sentry.vendor.a.AbstractC2235a
        public boolean b(byte[] bArr, int i10, int i11, boolean z10) {
            int i12;
            int i13;
            int i14;
            int i15;
            byte b10;
            byte b11;
            byte b12;
            int i16;
            int i17;
            byte[] bArr2 = this.f307036i;
            byte[] bArr3 = this.f307017a;
            int i18 = this.f307032e;
            int i19 = i11 + i10;
            int i20 = this.f307031d;
            char c10 = 2;
            int i21 = 0;
            if (i20 != 1) {
                if (i20 == 2 && (i17 = i10 + 1) <= i19) {
                    byte[] bArr4 = this.f307030c;
                    i13 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i10] & 255);
                    this.f307031d = 0;
                    i12 = i17;
                } else {
                    i12 = i10;
                    i13 = -1;
                }
            } else if (i10 + 2 <= i19) {
                i12 = i10 + 2;
                i13 = (bArr[i10 + 1] & 255) | ((this.f307030c[0] & 255) << 16) | ((bArr[i10] & 255) << 8);
                this.f307031d = 0;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (i13 != -1) {
                bArr3[0] = bArr2[(i13 >> 18) & 63];
                bArr3[1] = bArr2[(i13 >> 12) & 63];
                bArr3[2] = bArr2[(i13 >> 6) & 63];
                bArr3[3] = bArr2[i13 & 63];
                i18--;
                if (i18 == 0) {
                    if (this.f307035h) {
                        bArr3[4] = com.google.common.base.c.f116462o;
                        i16 = 5;
                    } else {
                        i16 = 4;
                    }
                    i14 = i16 + 1;
                    bArr3[i16] = 10;
                    i18 = 19;
                } else {
                    i14 = 4;
                }
            } else {
                i14 = 0;
            }
            while (true) {
                i12 += 3;
                if (i12 > i19) {
                    break;
                }
                c10 = c10;
                int i22 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | (bArr[i12 + 2] & 255);
                bArr3[i14] = bArr2[(i22 >> 18) & 63];
                bArr3[i14 + 1] = bArr2[(i22 >> 12) & 63];
                bArr3[i14 + 2] = bArr2[(i22 >> 6) & 63];
                bArr3[i14 + 3] = bArr2[i22 & 63];
                int i23 = i14 + 4;
                i18--;
                if (i18 == 0) {
                    if (this.f307035h) {
                        bArr3[i23] = com.google.common.base.c.f116462o;
                        i23 = i14 + 5;
                    }
                    i14 = i23 + 1;
                    bArr3[i23] = 10;
                    i18 = 19;
                } else {
                    i14 = i23;
                }
            }
            if (z10) {
                int i24 = this.f307031d;
                if (i12 - i24 == i19 - 1) {
                    if (i24 > 0) {
                        b12 = this.f307030c[0];
                        i21 = 1;
                    } else {
                        b12 = bArr[i12];
                    }
                    int i25 = (b12 & 255) << 4;
                    this.f307031d = i24 - i21;
                    bArr3[i14] = bArr2[(i25 >> 6) & 63];
                    int i26 = i14 + 2;
                    bArr3[i14 + 1] = bArr2[i25 & 63];
                    if (this.f307033f) {
                        bArr3[i26] = kotlin.io.encoding.a.f312535i;
                        i26 = i14 + 4;
                        bArr3[i14 + 3] = kotlin.io.encoding.a.f312535i;
                    }
                    if (this.f307034g) {
                        if (this.f307035h) {
                            bArr3[i26] = com.google.common.base.c.f116462o;
                            i26++;
                        }
                        i15 = i26 + 1;
                        bArr3[i26] = 10;
                        i14 = i15;
                    } else {
                        i14 = i26;
                    }
                } else if (i12 - i24 == i19 - 2) {
                    if (i24 > 1) {
                        b10 = this.f307030c[0];
                        i21 = 1;
                    } else {
                        byte b13 = bArr[i12];
                        i12++;
                        b10 = b13;
                    }
                    int i27 = (b10 & 255) << 10;
                    if (i24 > 0) {
                        b11 = this.f307030c[i21];
                        i21++;
                    } else {
                        b11 = bArr[i12];
                    }
                    int i28 = i27 | ((b11 & 255) << 2);
                    this.f307031d = i24 - i21;
                    bArr3[i14] = bArr2[(i28 >> 12) & 63];
                    bArr3[i14 + 1] = bArr2[(i28 >> 6) & 63];
                    int i29 = i14 + 3;
                    bArr3[i14 + 2] = bArr2[i28 & 63];
                    if (this.f307033f) {
                        bArr3[i29] = kotlin.io.encoding.a.f312535i;
                        i29 = i14 + 4;
                    }
                    if (this.f307034g) {
                        if (this.f307035h) {
                            bArr3[i29] = com.google.common.base.c.f116462o;
                            i29++;
                        }
                        i15 = i29 + 1;
                        bArr3[i29] = 10;
                        i14 = i15;
                    } else {
                        i14 = i29;
                    }
                } else if (this.f307034g && i14 > 0 && i18 != 19) {
                    if (this.f307035h) {
                        bArr3[i14] = com.google.common.base.c.f116462o;
                        i14++;
                    }
                    i15 = i14 + 1;
                    bArr3[i14] = 10;
                    i14 = i15;
                }
            } else if (i12 == i19 - 1) {
                byte[] bArr5 = this.f307030c;
                int i30 = this.f307031d;
                this.f307031d = i30 + 1;
                bArr5[i30] = bArr[i12];
            } else if (i12 == i19 - 2) {
                byte[] bArr6 = this.f307030c;
                int i31 = this.f307031d;
                int i32 = i31 + 1;
                this.f307031d = i32;
                bArr6[i31] = bArr[i12];
                this.f307031d = i31 + 2;
                bArr6[i32] = bArr[i12 + 1];
            }
            this.f307018b = i14;
            this.f307032e = i18;
            return true;
        }
    }

    private a() {
    }

    public static byte[] a(String str, int i10) {
        return b(str.getBytes(), i10);
    }

    public static byte[] b(byte[] bArr, int i10) {
        return c(bArr, 0, bArr.length, i10);
    }

    public static byte[] c(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[(i11 * 3) / 4]);
        if (!bVar.b(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = bVar.f307018b;
        byte[] bArr2 = bVar.f307017a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    public static byte[] d(byte[] bArr, int i10) {
        return e(bArr, 0, bArr.length, i10);
    }

    public static byte[] e(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!cVar.f307033f) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f307034g && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (cVar.f307035h ? 2 : 1);
        }
        cVar.f307017a = new byte[i13];
        cVar.b(bArr, i10, i11, true);
        return cVar.f307017a;
    }

    public static String f(byte[] bArr, int i10) {
        try {
            return new String(d(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static String g(byte[] bArr, int i10, int i11, int i12) {
        try {
            return new String(e(bArr, i10, i11, i12), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
