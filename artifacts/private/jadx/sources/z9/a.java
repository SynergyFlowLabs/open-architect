package z9;

import com.google.zxing.d;
import com.google.zxing.e;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.p;
import com.google.zxing.r;
import com.google.zxing.t;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f400235a;

    public a(p pVar) {
        this.f400235a = pVar;
    }

    private static void b(t[] tVarArr, int i10, int i11) {
        if (tVarArr != null) {
            for (int i12 = 0; i12 < tVarArr.length; i12++) {
                t tVar = tVarArr[i12];
                tVarArr[i12] = new t(tVar.c() + i10, tVar.d() + i11);
            }
        }
    }

    @Override // com.google.zxing.p
    public r a(com.google.zxing.c cVar, Map<e, ?> map) throws m, d, h {
        int iE = cVar.e() / 2;
        int iD = cVar.d() / 2;
        try {
            try {
                try {
                    try {
                        return this.f400235a.a(cVar.a(0, 0, iE, iD), map);
                    } catch (m unused) {
                        r rVarA = this.f400235a.a(cVar.a(iE, 0, iE, iD), map);
                        b(rVarA.f(), iE, 0);
                        return rVarA;
                    }
                } catch (m unused2) {
                    r rVarA2 = this.f400235a.a(cVar.a(0, iD, iE, iD), map);
                    b(rVarA2.f(), 0, iD);
                    return rVarA2;
                }
            } catch (m unused3) {
                r rVarA3 = this.f400235a.a(cVar.a(iE, iD, iE, iD), map);
                b(rVarA3.f(), iE, iD);
                return rVarA3;
            }
        } catch (m unused4) {
            int i10 = iE / 2;
            int i11 = iD / 2;
            r rVarA4 = this.f400235a.a(cVar.a(i10, i11, iE, iD), map);
            b(rVarA4.f(), i10, i11);
            return rVarA4;
        }
    }

    @Override // com.google.zxing.p
    public r c(com.google.zxing.c cVar) throws m, d, h {
        return a(cVar, null);
    }

    @Override // com.google.zxing.p
    public void reset() {
        this.f400235a.reset();
    }
}
