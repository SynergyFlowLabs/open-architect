package com.google.zxing.oned;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130575a = 103;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130576b = 104;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130577c = 105;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130578d = 101;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130579e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130580f = 99;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130581g = 106;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f130582h = 241;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f130583i = 242;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char f130584j = 243;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final char f130585k = 244;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f130586l = 102;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f130587m = 97;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f130588n = 96;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f130589o = 101;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f130590p = 100;

    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1;

        static {
            int i10 = 2 << 3;
        }
    }

    private static int g(CharSequence charSequence, int i10, int i11) {
        a aVarH;
        a aVarH2;
        char cCharAt;
        a aVarH3 = h(charSequence, i10);
        a aVar = a.ONE_DIGIT;
        if (aVarH3 == aVar) {
            return 100;
        }
        a aVar2 = a.UNCODABLE;
        if (aVarH3 == aVar2) {
            return (i10 >= charSequence.length() || ((cCharAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i11 == 99) {
            return 99;
        }
        if (i11 != 100) {
            if (aVarH3 == a.FNC_1) {
                aVarH3 = h(charSequence, i10 + 1);
            }
            return aVarH3 == a.TWO_DIGITS ? 99 : 100;
        }
        a aVar3 = a.FNC_1;
        if (aVarH3 == aVar3 || (aVarH = h(charSequence, i10 + 2)) == aVar2 || aVarH == aVar) {
            return 100;
        }
        if (aVarH == aVar3) {
            return h(charSequence, i10 + 3) == a.TWO_DIGITS ? 99 : 100;
        }
        int i12 = i10 + 4;
        while (true) {
            aVarH2 = h(charSequence, i12);
            if (aVarH2 != a.TWO_DIGITS) {
                break;
            }
            i12 += 2;
        }
        return aVarH2 == a.ONE_DIGIT ? 100 : 99;
    }

    private static a h(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == 241) {
            return a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i11);
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            return a.TWO_DIGITS;
        }
        return a.ONE_DIGIT;
    }

    @Override // com.google.zxing.oned.s, com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.CODE_128) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iC = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            switch (cCharAt) {
                case 241:
                case 242:
                case com.planner5d.library.engine.input.f.b.M1 /* 243 */:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                    }
                    break;
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (true) {
            int i15 = 103;
            if (i11 >= length) {
                int[][] iArr = c.f130559a;
                arrayList.add(iArr[i12 % 103]);
                arrayList.add(iArr[106]);
                int i16 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i17 : iArr2) {
                        i16 += i17;
                    }
                }
                boolean[] zArr = new boolean[i16];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iC += s.c(zArr, iC, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iG = g(str, i11, i13);
            int iCharAt = 100;
            if (iG == i13) {
                switch (str.charAt(i11)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case com.planner5d.library.engine.input.f.b.M1 /* 243 */:
                        iCharAt = 96;
                        break;
                    case 244:
                        if (i13 == 101) {
                            iCharAt = 101;
                        }
                        break;
                    default:
                        if (i13 == 100) {
                            iCharAt = str.charAt(i11) - ' ';
                        } else if (i13 != 101) {
                            iCharAt = Integer.parseInt(str.substring(i11, i11 + 2));
                            i11++;
                        } else {
                            char cCharAt2 = str.charAt(i11);
                            iCharAt = cCharAt2 - ' ';
                            if (iCharAt < 0) {
                                iCharAt = cCharAt2 + '@';
                            }
                        }
                        break;
                }
                i11++;
            } else {
                if (i13 != 0) {
                    i15 = iG;
                } else if (iG == 100) {
                    i15 = 104;
                } else if (iG != 101) {
                    i15 = 105;
                }
                iCharAt = i15;
                i13 = iG;
            }
            arrayList.add(c.f130559a[iCharAt]);
            i12 += iCharAt * i14;
            if (i11 != 0) {
                i14++;
            }
        }
    }
}
