package androidx.media3.extractor.avi;

import androidx.annotation.p0;
import androidx.media3.common.util.o0;
import com.google.common.collect.l6;
import com.google.common.collect.nb;

/* JADX INFO: loaded from: classes3.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6<a> f67108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f67109b;

    private f(int i10, l6<a> l6Var) {
        this.f67109b = i10;
        this.f67108a = l6Var;
    }

    @p0
    private static a a(int i10, int i11, o0 o0Var) {
        switch (i10) {
            case b.D /* 1718776947 */:
                return g.e(i11, o0Var);
            case b.f67053x /* 1751742049 */:
                return c.b(o0Var);
            case b.F /* 1752331379 */:
                return d.e(o0Var);
            case b.E /* 1852994675 */:
                return h.a(o0Var);
            default:
                return null;
        }
    }

    public static f d(int i10, o0 o0Var) {
        l6.a aVar = new l6.a();
        int iG = o0Var.g();
        int iD = -2;
        while (o0Var.a() > 8) {
            int iW = o0Var.w();
            int iF = o0Var.f() + o0Var.w();
            o0Var.Z(iF);
            a aVarD = iW == 1414744396 ? d(o0Var.w(), o0Var) : a(iW, iD, o0Var);
            if (aVarD != null) {
                if (aVarD.c() == 1752331379) {
                    iD = ((d) aVarD).d();
                }
                aVar.a(aVarD);
            }
            o0Var.a0(iF);
            o0Var.Z(iG);
        }
        return new f(i10, aVar.e());
    }

    @p0
    public <T extends a> T b(Class<T> cls) {
        nb<a> it = this.f67108a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.a
    public int c() {
        return this.f67109b;
    }
}
