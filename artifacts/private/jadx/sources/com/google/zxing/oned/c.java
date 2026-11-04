package com.google.zxing.oned;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[][] f130559a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f130560b = 0.25f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f130561c = 0.7f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130562d = 98;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130563e = 99;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130564f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130565g = 101;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f130566h = 102;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f130567i = 97;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f130568j = 96;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f130569k = 101;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f130570l = 100;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f130571m = 103;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f130572n = 104;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f130573o = 105;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f130574p = 106;

    private static int h(com.google.zxing.common.a aVar, int[] iArr, int i10) throws com.google.zxing.m {
        r.f(aVar, i10, iArr);
        float f10 = f130560b;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f130559a;
            if (i12 >= iArr2.length) {
                break;
            }
            float fE = r.e(iArr, iArr2[i12], 0.7f);
            if (fE < f10) {
                i11 = i12;
                f10 = fE;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw com.google.zxing.m.a();
    }

    private static int[] i(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        int[] iArr = new int[6];
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.h(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == 5) {
                    int i12 = -1;
                    float f10 = f130560b;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float fE = r.e(iArr, f130559a[i13], 0.7f);
                        if (fE < f10) {
                            i12 = i13;
                            f10 = fE;
                        }
                    }
                    if (i12 >= 0 && aVar.o(Math.max(0, i11 - ((iJ - i11) / 2)), i11, false)) {
                        return new int[]{i11, iJ, i12};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i14 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iJ++;
        }
        throw com.google.zxing.m.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x016e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:103:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x017d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0186  */
    /* JADX WARN: Code duplicated, block: B:109:0x0188  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[LOOP:1: B:23:0x0082->B:24:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[PHI: r3 r9 r16 r20
      0x00aa: PHI (r3v7 boolean) = 
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v11 boolean)
      (r3v12 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
      (r3v1 boolean)
     binds: [B:27:0x0092, B:70:0x011c, B:72:0x0120, B:76:0x012d, B:75:0x0128, B:62:0x0101, B:57:0x00eb, B:53:0x00e1, B:34:0x00a9, B:44:0x00c7, B:46:0x00cb, B:50:0x00d7, B:49:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r9v4 boolean) = 
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v11 boolean)
      (r9v12 boolean)
      (r9v13 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
      (r9v3 boolean)
     binds: [B:27:0x0092, B:70:0x011c, B:72:0x0120, B:76:0x012d, B:75:0x0128, B:62:0x0101, B:57:0x00eb, B:53:0x00e1, B:34:0x00a9, B:44:0x00c7, B:46:0x00cb, B:50:0x00d7, B:49:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r16v2 boolean) = 
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v5 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
     binds: [B:27:0x0092, B:70:0x011c, B:72:0x0120, B:76:0x012d, B:75:0x0128, B:62:0x0101, B:57:0x00eb, B:53:0x00e1, B:34:0x00a9, B:44:0x00c7, B:46:0x00cb, B:50:0x00d7, B:49:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r20v3 boolean) = 
      (r20v2 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v9 boolean)
      (r20v11 boolean)
      (r20v14 boolean)
      (r20v16 boolean)
      (r20v17 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
      (r20v18 boolean)
     binds: [B:27:0x0092, B:70:0x011c, B:72:0x0120, B:76:0x012d, B:75:0x0128, B:62:0x0101, B:57:0x00eb, B:53:0x00e1, B:34:0x00a9, B:44:0x00c7, B:46:0x00cb, B:50:0x00d7, B:49:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[PHI: r20
      0x00e1: PHI (r20v16 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:81:0x013c, B:52:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9 A[PHI: r20
      0x00e9: PHI (r20v15 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:84:0x0141, B:55:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb A[PHI: r20
      0x00eb: PHI (r20v14 boolean) = (r20v9 boolean), (r20v9 boolean), (r20v18 boolean), (r20v18 boolean) binds: [B:83:0x013f, B:84:0x0141, B:54:0x00e5, B:55:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5 A[PHI: r20
      0x00f5: PHI (r20v12 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:70:0x011c, B:44:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101 A[PHI: r20
      0x0101: PHI (r20v11 boolean) = (r20v9 boolean), (r20v18 boolean) binds: [B:69:0x011a, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136 A[PHI: r10 r20
      0x0136: PHI (r10v7 char) = (r10v5 char), (r10v9 char) binds: [B:96:0x0161, B:77:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r20v8 boolean) = (r20v5 boolean), (r20v9 boolean) binds: [B:96:0x0161, B:77:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0161  */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x0168  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:40:0x00ba
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int r26, com.google.zxing.common.a r27, java.util.Map<com.google.zxing.e, ?> r28) throws com.google.zxing.m, com.google.zxing.h, com.google.zxing.d {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.c.b(int, com.google.zxing.common.a, java.util.Map):com.google.zxing.r");
    }
}
