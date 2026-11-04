package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f130129c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f130130d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f130131e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f130132f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f130133g = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[][] f130135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int[][] f130136j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f130137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String[] f130128b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[][] f130134h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        int i10 = 7 & 1;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f130135i = iArr;
        iArr[0][32] = 1;
        for (int i11 = 65; i11 <= 90; i11++) {
            f130135i[0][i11] = i11 - 63;
        }
        f130135i[1][32] = 1;
        for (int i12 = 97; i12 <= 122; i12++) {
            f130135i[1][i12] = i12 - 95;
        }
        f130135i[2][32] = 1;
        for (int i13 = 48; i13 <= 57; i13++) {
            f130135i[2][i13] = i13 - 46;
        }
        int[] iArr2 = f130135i[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, okhttp3.internal.ws.g.f334652s, 127};
        for (int i14 = 0; i14 < 28; i14++) {
            f130135i[3][iArr3[i14]] = i14;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i15 = 0; i15 < 31; i15++) {
            int i16 = iArr4[i15];
            if (i16 > 0) {
                f130135i[4][i16] = i15;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f130136j = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f130136j;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public d(byte[] bArr) {
        this.f130137a = bArr;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(fVar);
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.g(fVar)) {
                    break;
                }
                if (fVar.g(fVar2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i10, Collection<f> collection) {
        char c10 = (char) (this.f130137a[i10] & 255);
        boolean z10 = f130135i[fVar.e()][c10] > 0;
        f fVarB = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f130135i[i11][c10];
            if (i12 > 0) {
                if (fVarB == null) {
                    fVarB = fVar.b(i10);
                }
                if (!z10 || i11 == fVar.e() || i11 == 2) {
                    collection.add(fVarB.h(i11, i12));
                }
                if (!z10 && f130136j[fVar.e()][i11] >= 0) {
                    collection.add(fVarB.i(i11, i12));
                }
            }
        }
        if (fVar.c() > 0 || f130135i[fVar.e()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    private static void d(f fVar, int i10, int i11, Collection<f> collection) {
        f fVarB = fVar.b(i10);
        collection.add(fVarB.h(4, i11));
        if (fVar.e() != 4) {
            collection.add(fVarB.i(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(fVarB.h(2, 16 - i11).h(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i10, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    public com.google.zxing.common.a a() {
        int i10;
        Collection<f> collectionSingletonList = Collections.singletonList(f.f130141e);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f130137a;
            if (i11 >= bArr.length) {
                return ((f) Collections.min(collectionSingletonList, new a())).j(this.f130137a);
            }
            int i12 = i11 + 1;
            byte b10 = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b11 = bArr[i11];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 == 58 && b10 == 32) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                    } else if (b10 == 32) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                } else if (b10 == 32) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            } else if (b10 == 10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                collectionSingletonList = f(collectionSingletonList, i11, i10);
                i11 = i12;
            } else {
                collectionSingletonList = e(collectionSingletonList, i11);
            }
            i11++;
        }
    }
}
