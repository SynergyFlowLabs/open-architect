package com.google.zxing.oned;

import com.canhub.cropper.core.CropImageOptions;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r implements com.google.zxing.p {
    private com.google.zxing.r d(com.google.zxing.c cVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m {
        Map<com.google.zxing.e, ?> map2;
        int i10;
        Map<com.google.zxing.e, ?> map3 = map;
        int iE = cVar.e();
        int iD = cVar.d();
        com.google.zxing.common.a aVar = new com.google.zxing.common.a(iE);
        int i11 = 1;
        boolean z10 = map3 != null && map3.containsKey(com.google.zxing.e.TRY_HARDER);
        int iMax = Math.max(1, iD >> (z10 ? 8 : 5));
        int i12 = z10 ? iD : 15;
        int i13 = iD / 2;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = i14 + 1;
            int i16 = i15 / 2;
            if ((i14 & 1) != 0) {
                i16 = -i16;
            }
            int i17 = (i16 * iMax) + i13;
            if (i17 < 0 || i17 >= iD) {
                break;
            }
            try {
                aVar = cVar.c(i17, aVar);
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == i11) {
                        aVar.q();
                        if (map3 != null) {
                            com.google.zxing.e eVar = com.google.zxing.e.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(eVar)) {
                                EnumMap enumMap = new EnumMap(com.google.zxing.e.class);
                                enumMap.putAll(map3);
                                enumMap.remove(eVar);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        com.google.zxing.r rVarB = b(i17, aVar, map3);
                        if (i18 == i11) {
                            try {
                                rVarB.j(com.google.zxing.s.ORIENTATION, 180);
                                com.google.zxing.t[] tVarArrF = rVarB.f();
                                if (tVarArrF != null) {
                                    i10 = i11;
                                    float f10 = iE;
                                    try {
                                        map2 = map3;
                                        try {
                                            try {
                                                tVarArrF[0] = new com.google.zxing.t((f10 - tVarArrF[0].c()) - 1.0f, tVarArrF[0].d());
                                                tVarArrF[i10] = new com.google.zxing.t((f10 - tVarArrF[i10].c()) - 1.0f, tVarArrF[i10].d());
                                            } catch (com.google.zxing.q unused) {
                                                continue;
                                                i18++;
                                                map3 = map2;
                                                i11 = i10;
                                                iE = iE;
                                            }
                                        } catch (com.google.zxing.q unused2) {
                                            i18++;
                                            map3 = map2;
                                            i11 = i10;
                                            iE = iE;
                                        }
                                    } catch (com.google.zxing.q unused3) {
                                        map2 = map3;
                                    }
                                }
                            } catch (com.google.zxing.q unused4) {
                                map2 = map3;
                                i10 = i11;
                            }
                        }
                        return rVarB;
                    } catch (com.google.zxing.q unused5) {
                        map2 = map3;
                        i10 = i11;
                    }
                }
            } catch (com.google.zxing.m unused6) {
            }
            i14 = i15;
            i11 = i11;
            iE = iE;
        }
        throw com.google.zxing.m.a();
    }

    protected static float e(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = iArr2[i13] * f12;
            float f16 = i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    protected static void f(com.google.zxing.common.a aVar, int i10, int[] iArr) throws com.google.zxing.m {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iL = aVar.l();
        if (i10 >= iL) {
            throw com.google.zxing.m.a();
        }
        int i12 = 3 ^ 1;
        boolean z10 = !aVar.h(i10);
        while (i10 < iL) {
            if (aVar.h(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != iL) {
                throw com.google.zxing.m.a();
            }
        }
    }

    protected static void g(com.google.zxing.common.a aVar, int i10, int[] iArr) throws com.google.zxing.m {
        int length = iArr.length;
        boolean zH = aVar.h(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.h(i10) != zH) {
                length--;
                zH = !zH;
            }
        }
        if (length >= 0) {
            throw com.google.zxing.m.a();
        }
        f(aVar, i10 + 1, iArr);
    }

    @Override // com.google.zxing.p
    public com.google.zxing.r a(com.google.zxing.c cVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.h {
        try {
            return d(cVar, map);
        } catch (com.google.zxing.m e10) {
            if (map == null || !map.containsKey(com.google.zxing.e.TRY_HARDER) || !cVar.g()) {
                throw e10;
            }
            com.google.zxing.c cVarH = cVar.h();
            com.google.zxing.r rVarD = d(cVarH, map);
            Map<com.google.zxing.s, Object> mapE = rVarD.e();
            int iIntValue = 270;
            if (mapE != null) {
                com.google.zxing.s sVar = com.google.zxing.s.ORIENTATION;
                if (mapE.containsKey(sVar)) {
                    iIntValue = (((Integer) mapE.get(sVar)).intValue() + 270) % CropImageOptions.S3;
                }
            }
            rVarD.j(com.google.zxing.s.ORIENTATION, Integer.valueOf(iIntValue));
            com.google.zxing.t[] tVarArrF = rVarD.f();
            if (tVarArrF != null) {
                int iD = cVarH.d();
                for (int i10 = 0; i10 < tVarArrF.length; i10++) {
                    tVarArrF[i10] = new com.google.zxing.t((iD - tVarArrF[i10].d()) - 1.0f, tVarArrF[i10].c());
                }
            }
            return rVarD;
        }
    }

    public abstract com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h;

    @Override // com.google.zxing.p
    public com.google.zxing.r c(com.google.zxing.c cVar) throws com.google.zxing.m, com.google.zxing.h {
        return a(cVar, null);
    }

    @Override // com.google.zxing.p
    public void reset() {
    }
}
