package com.google.zxing.multi.qrcode;

import com.google.zxing.common.g;
import com.google.zxing.e;
import com.google.zxing.m;
import com.google.zxing.q;
import com.google.zxing.qrcode.decoder.i;
import com.google.zxing.r;
import com.google.zxing.s;
import com.google.zxing.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z9.c;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends com.google.zxing.qrcode.a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r[] f130522c = new r[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t[] f130523d = new t[0];

    private static final class b implements Serializable, Comparator<r> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(r rVar, r rVar2) {
            Map<s, Object> mapE = rVar.e();
            s sVar = s.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) mapE.get(sVar)).intValue(), ((Integer) rVar2.e().get(sVar)).intValue());
        }
    }

    private static List<r> h(List<r> list) {
        Iterator<r> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().e().containsKey(s.STRUCTURED_APPEND_SEQUENCE)) {
                ArrayList arrayList = new ArrayList();
                ArrayList<r> arrayList2 = new ArrayList();
                for (r rVar : list) {
                    arrayList.add(rVar);
                    if (rVar.e().containsKey(s.STRUCTURED_APPEND_SEQUENCE)) {
                        arrayList2.add(rVar);
                    }
                }
                Collections.sort(arrayList2, new b());
                StringBuilder sb2 = new StringBuilder();
                int length = 0;
                int length2 = 0;
                for (r rVar2 : arrayList2) {
                    sb2.append(rVar2.g());
                    length += rVar2.d().length;
                    Map<s, Object> mapE = rVar2.e();
                    s sVar = s.BYTE_SEGMENTS;
                    if (mapE.containsKey(sVar)) {
                        Iterator it2 = ((Iterable) rVar2.e().get(sVar)).iterator();
                        while (it2.hasNext()) {
                            length2 += ((byte[]) it2.next()).length;
                        }
                    }
                }
                byte[] bArr = new byte[length];
                byte[] bArr2 = new byte[length2];
                int length3 = 0;
                int length4 = 0;
                for (r rVar3 : arrayList2) {
                    System.arraycopy(rVar3.d(), 0, bArr, length3, rVar3.d().length);
                    length3 += rVar3.d().length;
                    Map<s, Object> mapE2 = rVar3.e();
                    s sVar2 = s.BYTE_SEGMENTS;
                    if (mapE2.containsKey(sVar2)) {
                        for (byte[] bArr3 : (Iterable) rVar3.e().get(sVar2)) {
                            System.arraycopy(bArr3, 0, bArr2, length4, bArr3.length);
                            length4 += bArr3.length;
                        }
                    }
                }
                r rVar4 = new r(sb2.toString(), bArr, f130523d, com.google.zxing.a.QR_CODE);
                if (length2 > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(bArr2);
                    rVar4.j(s.BYTE_SEGMENTS, arrayList3);
                }
                arrayList.add(rVar4);
                return arrayList;
            }
        }
        return list;
    }

    @Override // z9.c
    public r[] b(com.google.zxing.c cVar) throws m {
        return d(cVar, null);
    }

    @Override // z9.c
    public r[] d(com.google.zxing.c cVar, Map<e, ?> map) throws m {
        ArrayList arrayList = new ArrayList();
        for (g gVar : new com.google.zxing.multi.qrcode.detector.a(cVar.b()).n(map)) {
            try {
                com.google.zxing.common.e eVarC = f().c(gVar.a(), map);
                t[] tVarArrB = gVar.b();
                if (eVarC.f() instanceof i) {
                    ((i) eVarC.f()).a(tVarArrB);
                }
                r rVar = new r(eVarC.j(), eVarC.g(), tVarArrB, com.google.zxing.a.QR_CODE);
                List<byte[]> listA = eVarC.a();
                if (listA != null) {
                    rVar.j(s.BYTE_SEGMENTS, listA);
                }
                String strB = eVarC.b();
                if (strB != null) {
                    rVar.j(s.ERROR_CORRECTION_LEVEL, strB);
                }
                if (eVarC.k()) {
                    rVar.j(s.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVarC.i()));
                    rVar.j(s.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVarC.h()));
                }
                arrayList.add(rVar);
            } catch (q unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return f130522c;
        }
        List<r> listH = h(arrayList);
        return (r[]) listH.toArray(new r[listH.size()]);
    }
}
