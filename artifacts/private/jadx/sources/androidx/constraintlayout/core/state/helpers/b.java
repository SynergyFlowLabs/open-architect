package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class b extends androidx.constraintlayout.core.state.f {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f44283q0;

    public b(k kVar) {
        super(kVar, k.d.ALIGN_VERTICALLY);
        this.f44283q0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        Iterator<Object> it = this.f44280o0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a aVarF = this.f44278m0.f(it.next());
            aVarF.y();
            Object obj = this.S;
            if (obj != null) {
                aVarF.H0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    aVarF.G0(obj2);
                } else {
                    aVarF.H0(k.f44330o);
                }
            }
            Object obj3 = this.V;
            if (obj3 != null) {
                aVarF.r(obj3);
            } else {
                Object obj4 = this.W;
                if (obj4 != null) {
                    aVarF.q(obj4);
                } else {
                    aVarF.q(k.f44330o);
                }
            }
            float f10 = this.f44283q0;
            if (f10 != 0.5f) {
                aVarF.M0(f10);
            }
        }
    }
}
