package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class i extends d {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44322a;

        static {
            int[] iArr = new int[k.a.values().length];
            f44322a = iArr;
            try {
                iArr[k.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44322a[k.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44322a[k.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(k kVar) {
        super(kVar, k.d.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        Iterator<Object> it = this.f44280o0.iterator();
        while (it.hasNext()) {
            this.f44278m0.f(it.next()).x();
        }
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        for (Object obj : this.f44280o0) {
            androidx.constraintlayout.core.state.a aVarF = this.f44278m0.f(obj);
            if (aVar2 == null) {
                Object obj2 = this.O;
                if (obj2 != null) {
                    aVarF.D0(obj2).e0(this.f44218m).g0(this.f44224s);
                } else {
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        aVarF.C0(obj3).e0(this.f44218m).g0(this.f44224s);
                    } else {
                        Object obj4 = this.K;
                        if (obj4 != null) {
                            aVarF.D0(obj4).e0(this.f44214k).g0(this.f44222q);
                        } else {
                            Object obj5 = this.L;
                            if (obj5 != null) {
                                aVarF.C0(obj5).e0(this.f44214k).g0(this.f44222q);
                            } else {
                                String string = aVarF.getKey().toString();
                                aVarF.D0(k.f44330o).f0(Float.valueOf(b1(string))).h0(Float.valueOf(a1(string)));
                            }
                        }
                    }
                }
                aVar2 = aVarF;
            }
            if (aVar != null) {
                String string2 = aVar.getKey().toString();
                String string3 = aVarF.getKey().toString();
                aVar.D(aVarF.getKey()).f0(Float.valueOf(Z0(string2))).h0(Float.valueOf(Y0(string2)));
                aVarF.C0(aVar.getKey()).f0(Float.valueOf(b1(string3))).h0(Float.valueOf(a1(string3)));
            }
            float fD1 = d1(obj.toString());
            if (fD1 != -1.0f) {
                aVarF.v0(fD1);
            }
            aVar = aVarF;
        }
        if (aVar != null) {
            Object obj6 = this.Q;
            if (obj6 != null) {
                aVar.D(obj6).e0(this.f44219n).g0(this.f44225t);
            } else {
                Object obj7 = this.R;
                if (obj7 != null) {
                    aVar.C(obj7).e0(this.f44219n).g0(this.f44225t);
                } else {
                    Object obj8 = this.M;
                    if (obj8 != null) {
                        aVar.D(obj8).e0(this.f44216l).g0(this.f44223r);
                    } else {
                        Object obj9 = this.N;
                        if (obj9 != null) {
                            aVar.C(obj9).e0(this.f44216l).g0(this.f44223r);
                        } else {
                            String string4 = aVar.getKey().toString();
                            aVar.C(k.f44330o).f0(Float.valueOf(Z0(string4))).h0(Float.valueOf(Y0(string4)));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f10 = this.f44288q0;
        if (f10 != 0.5f) {
            aVar2.a0(f10);
        }
        int i10 = a.f44322a[this.f44294w0.ordinal()];
        if (i10 == 1) {
            aVar2.u0(0);
        } else if (i10 == 2) {
            aVar2.u0(1);
        } else {
            if (i10 != 3) {
                return;
            }
            aVar2.u0(2);
        }
    }
}
