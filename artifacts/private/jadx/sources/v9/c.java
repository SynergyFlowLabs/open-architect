package v9;

import com.google.zxing.g;
import com.google.zxing.v;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements v {
    private static com.google.zxing.common.b c(String str, com.google.zxing.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == com.google.zxing.a.AZTEC) {
            return d(com.google.zxing.aztec.encoder.c.e(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static com.google.zxing.common.b d(com.google.zxing.aztec.encoder.a aVar, int i10, int i11) {
        com.google.zxing.common.b bVarC = aVar.c();
        if (bVarC == null) {
            throw new IllegalStateException();
        }
        int iL = bVarC.l();
        int iH = bVarC.h();
        int iMax = Math.max(i10, iL);
        int iMax2 = Math.max(i11, iH);
        int iMin = Math.min(iMax / iL, iMax2 / iH);
        int i12 = (iMax - (iL * iMin)) / 2;
        int i13 = (iMax2 - (iH * iMin)) / 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(iMax, iMax2);
        int i14 = 0;
        while (i14 < iH) {
            int i15 = 0;
            int i16 = i12;
            while (i15 < iL) {
                if (bVarC.e(i15, i14)) {
                    bVar.r(i16, i13, iMin, iMin);
                }
                i15++;
                i16 += iMin;
            }
            i14++;
            i13 += iMin;
        }
        return bVar;
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<g, ?> map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            g gVar = g.CHARACTER_SET;
            if (map.containsKey(gVar)) {
                charsetForName = Charset.forName(map.get(gVar).toString());
            }
            g gVar2 = g.ERROR_CORRECTION;
            i12 = map.containsKey(gVar2) ? Integer.parseInt(map.get(gVar2).toString()) : 33;
            g gVar3 = g.AZTEC_LAYERS;
            if (map.containsKey(gVar3)) {
                i13 = Integer.parseInt(map.get(gVar3).toString());
            }
        }
        return c(str, aVar, i10, i11, charsetForName, i12, i13);
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i10, int i11) {
        return a(str, aVar, i10, i11, null);
    }
}
