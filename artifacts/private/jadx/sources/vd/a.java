package vd;

import android.os.Bundle;
import com.planner5d.library.math.m;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f385722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f385723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f385724c;

    public a(m mVar, m mVar2, float f10) {
        this.f385722a = new m(mVar);
        this.f385723b = new m(mVar2);
        this.f385724c = f10;
    }

    public m a() {
        return new m(this.f385722a);
    }

    public m b() {
        return new m(this.f385723b);
    }

    public Bundle c() {
        i iVar = new i();
        r rVar = r.position;
        m mVar = this.f385722a;
        i iVarO = iVar.o(rVar, new float[]{mVar.f180482a, mVar.f180483b, mVar.f180484c});
        r rVar2 = r.target;
        m mVar2 = this.f385723b;
        return iVarO.o(rVar2, new float[]{mVar2.f180482a, mVar2.f180483b, mVar2.f180484c}).e(r.nearClip, this.f385724c).a();
    }

    public a(Bundle bundle) {
        j jVar = new j(bundle);
        r rVar = r.position;
        r rVar2 = r.target;
        r rVar3 = r.nearClip;
        if (jVar.a(rVar, rVar2, rVar3)) {
            float[] fArrK = jVar.k(rVar, null);
            float[] fArrK2 = jVar.k(rVar2, null);
            if (fArrK == null || fArrK.length != 3 || fArrK2 == null || fArrK2.length != 3) {
                throw new RuntimeException("Invalid or empty camera position");
            }
            this.f385722a = new m(fArrK);
            this.f385723b = new m(fArrK2);
            this.f385724c = jVar.b(rVar3, 0.0f);
            return;
        }
        throw new RuntimeException("Invalid camera data");
    }
}
