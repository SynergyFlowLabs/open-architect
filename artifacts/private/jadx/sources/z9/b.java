package z9;

import com.google.zxing.e;
import com.google.zxing.m;
import com.google.zxing.p;
import com.google.zxing.q;
import com.google.zxing.r;
import com.google.zxing.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f400236b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f400237c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f400238a;

    public b(p pVar) {
        this.f400238a = pVar;
    }

    private void a(com.google.zxing.c cVar, Map<e, ?> map, List<r> list, int i10, int i11, int i12) {
        int i13;
        if (i12 > 4) {
            return;
        }
        try {
            r rVarA = this.f400238a.a(cVar, map);
            Iterator<r> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    list.add(c(rVarA, i10, i11));
                    break;
                }
            } while (!it.next().g().equals(rVarA.g()));
            t[] tVarArrF = rVarA.f();
            if (tVarArrF == null || tVarArrF.length == 0) {
                return;
            }
            int iE = cVar.e();
            int iD = cVar.d();
            float f10 = iE;
            float f11 = iD;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (t tVar : tVarArrF) {
                if (tVar != null) {
                    float fC = tVar.c();
                    float fD = tVar.d();
                    if (fC < f10) {
                        f10 = fC;
                    }
                    if (fD < f11) {
                        f11 = fD;
                    }
                    if (fC > f12) {
                        f12 = fC;
                    }
                    if (fD > f13) {
                        f13 = fD;
                    }
                }
            }
            if (f10 > 100.0f) {
                i13 = 0;
                a(cVar.a(0, 0, (int) f10, iD), map, list, i10, i11, i12 + 1);
            } else {
                i13 = 0;
            }
            if (f11 > 100.0f) {
                a(cVar.a(i13, i13, iE, (int) f11), map, list, i10, i11, i12 + 1);
            }
            if (f12 < iE - 100) {
                int i14 = (int) f12;
                a(cVar.a(i14, 0, iE - i14, iD), map, list, i10 + i14, i11, i12 + 1);
            }
            if (f13 < iD - 100) {
                int i15 = (int) f13;
                a(cVar.a(0, i15, iE, iD - i15), map, list, i10, i11 + i15, i12 + 1);
            }
        } catch (q unused) {
        }
    }

    private static r c(r rVar, int i10, int i11) {
        t[] tVarArrF = rVar.f();
        if (tVarArrF == null) {
            return rVar;
        }
        t[] tVarArr = new t[tVarArrF.length];
        for (int i12 = 0; i12 < tVarArrF.length; i12++) {
            t tVar = tVarArrF[i12];
            if (tVar != null) {
                tVarArr[i12] = new t(tVar.c() + i10, tVar.d() + i11);
            }
        }
        r rVar2 = new r(rVar.g(), rVar.d(), rVar.c(), tVarArr, rVar.b(), rVar.h());
        rVar2.i(rVar.e());
        return rVar2;
    }

    @Override // z9.c
    public r[] b(com.google.zxing.c cVar) throws m {
        return d(cVar, null);
    }

    @Override // z9.c
    public r[] d(com.google.zxing.c cVar, Map<e, ?> map) throws m {
        ArrayList arrayList = new ArrayList();
        a(cVar, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw m.a();
        }
        return (r[]) arrayList.toArray(new r[arrayList.size()]);
    }
}
