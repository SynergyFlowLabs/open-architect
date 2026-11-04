package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.k;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a extends androidx.constraintlayout.core.state.f {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f44282q0;

    public a(k kVar) {
        super(kVar, k.d.ALIGN_VERTICALLY);
        this.f44282q0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.f, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.h
    public void apply() {
        Iterator<Object> it = this.f44280o0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a aVarF = this.f44278m0.f(it.next());
            aVarF.x();
            Object obj = this.O;
            if (obj != null) {
                aVarF.D0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    aVarF.C0(obj2);
                } else {
                    aVarF.D0(k.f44330o);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                aVarF.D(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    aVarF.C(obj4);
                } else {
                    aVarF.C(k.f44330o);
                }
            }
            float f10 = this.f44282q0;
            if (f10 != 0.5f) {
                aVarF.a0(f10);
            }
        }
    }
}
