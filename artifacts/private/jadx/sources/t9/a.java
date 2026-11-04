package t9;

import com.google.vr.sdk.base.sensors.internal.c;
import com.google.vr.sdk.base.sensors.internal.d;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private a() {
    }

    public static double a(c cVar, c cVar2) {
        c cVar3 = new c(cVar);
        cVar3.g(cVar2);
        return cVar3.f();
    }

    public static double b(d dVar, d dVar2) {
        d dVar3 = new d();
        d.o(dVar, dVar2, dVar3);
        return dVar3.f();
    }

    public static d c(double d10) {
        return new d(d10, d10 * (-0.5d), d10 * 0.8d);
    }
}
