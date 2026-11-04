package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class j extends d {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44323a;

        static {
            int[] iArr = new int[k.a.values().length];
            f44323a = iArr;
            try {
                iArr[k.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44323a[k.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44323a[k.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(k kVar) {
        super(kVar, k.d.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        Iterator<Object> it = this.f44280o0.iterator();
        while (it.hasNext()) {
            this.f44278m0.f(it.next()).y();
        }
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        for (Object obj : this.f44280o0) {
            androidx.constraintlayout.core.state.a aVarF = this.f44278m0.f(obj);
            if (aVar2 == null) {
                Object obj2 = this.S;
                if (obj2 != null) {
                    aVarF.H0(obj2).e0(this.f44220o).g0(this.f44226u);
                } else {
                    Object obj3 = this.T;
                    if (obj3 != null) {
                        aVarF.G0(obj3).e0(this.f44220o).g0(this.f44226u);
                    } else {
                        String string = aVarF.getKey().toString();
                        aVarF.H0(k.f44330o).f0(Float.valueOf(b1(string))).h0(Float.valueOf(a1(string)));
                    }
                }
                aVar2 = aVarF;
            }
            if (aVar != null) {
                String string2 = aVar.getKey().toString();
                String string3 = aVarF.getKey().toString();
                aVar.r(aVarF.getKey()).f0(Float.valueOf(Z0(string2))).h0(Float.valueOf(Y0(string2)));
                aVarF.G0(aVar.getKey()).f0(Float.valueOf(b1(string3))).h0(Float.valueOf(a1(string3)));
            }
            float fD1 = d1(obj.toString());
            if (fD1 != -1.0f) {
                aVarF.y0(fD1);
            }
            aVar = aVarF;
        }
        if (aVar != null) {
            Object obj4 = this.V;
            if (obj4 != null) {
                aVar.r(obj4).e0(this.f44221p).g0(this.f44227v);
            } else {
                Object obj5 = this.W;
                if (obj5 != null) {
                    aVar.q(obj5).e0(this.f44221p).g0(this.f44227v);
                } else {
                    String string4 = aVar.getKey().toString();
                    aVar.q(k.f44330o).f0(Float.valueOf(Z0(string4))).h0(Float.valueOf(Y0(string4)));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f10 = this.f44288q0;
        if (f10 != 0.5f) {
            aVar2.M0(f10);
        }
        int i10 = a.f44323a[this.f44294w0.ordinal()];
        if (i10 == 1) {
            aVar2.x0(0);
        } else if (i10 == 2) {
            aVar2.x0(1);
        } else {
            if (i10 != 3) {
                return;
            }
            aVar2.x0(2);
        }
    }
}
