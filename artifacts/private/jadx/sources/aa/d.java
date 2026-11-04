package aa;

import com.google.zxing.g;
import com.google.zxing.pdf417.encoder.e;
import com.google.zxing.v;
import com.google.zxing.w;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f584a = 30;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f585b = 2;

    private static com.google.zxing.common.b c(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(bArr[0].length + i11, bArr.length + i11);
        bVar.b();
        int iH = (bVar.h() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.q(i13 + i10, iH);
                }
            }
            i12++;
            iH--;
        }
        return bVar;
    }

    private static com.google.zxing.common.b d(e eVar, String str, int i10, int i11, int i12, int i13) throws w {
        boolean z10;
        eVar.e(str, i10);
        byte[][] bArrC = eVar.f().c(1, 4);
        if ((i12 > i11) != (bArrC[0].length < bArrC.length)) {
            bArrC = e(bArrC);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = i11 / bArrC[0].length;
        int length2 = i12 / bArrC.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return c(bArrC, i13);
        }
        byte[][] bArrC2 = eVar.f().c(length, length << 2);
        if (z10) {
            bArrC2 = e(bArrC2);
        }
        return c(bArrC2, i13);
    }

    private static byte[][] e(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<g, ?> map) throws w {
        if (aVar != com.google.zxing.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
        }
        e eVar = new e();
        int i12 = 30;
        int i13 = 2;
        if (map != null) {
            g gVar = g.PDF417_COMPACT;
            if (map.containsKey(gVar)) {
                eVar.h(Boolean.valueOf(map.get(gVar).toString()).booleanValue());
            }
            g gVar2 = g.PDF417_COMPACTION;
            if (map.containsKey(gVar2)) {
                eVar.i(com.google.zxing.pdf417.encoder.c.valueOf(map.get(gVar2).toString()));
            }
            g gVar3 = g.PDF417_DIMENSIONS;
            if (map.containsKey(gVar3)) {
                com.google.zxing.pdf417.encoder.d dVar = (com.google.zxing.pdf417.encoder.d) map.get(gVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            g gVar4 = g.MARGIN;
            i12 = map.containsKey(gVar4) ? Integer.parseInt(map.get(gVar4).toString()) : 30;
            g gVar5 = g.ERROR_CORRECTION;
            i13 = map.containsKey(gVar5) ? Integer.parseInt(map.get(gVar5).toString()) : 2;
            g gVar6 = g.CHARACTER_SET;
            if (map.containsKey(gVar6)) {
                eVar.k(Charset.forName(map.get(gVar6).toString()));
            }
        }
        return d(eVar, str, i13, i10, i11, i12);
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i10, int i11) throws w {
        return a(str, aVar, i10, i11, null);
    }
}
