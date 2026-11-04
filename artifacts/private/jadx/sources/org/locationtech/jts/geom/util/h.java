package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.s;

/* JADX INFO: loaded from: classes14.dex */
public class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f338238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338239b;

    public h(Class cls, List list) {
        this.f338238a = cls;
        this.f338239b = list;
    }

    public static List b(org.locationtech.jts.geom.n nVar, Class cls) {
        return c(nVar, cls, new ArrayList());
    }

    public static List c(org.locationtech.jts.geom.n nVar, Class cls, List list) {
        if (d(nVar, cls)) {
            list.add(nVar);
            return list;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            nVar.e(new h(cls, list));
        }
        return list;
    }

    protected static boolean d(Object obj, Class cls) {
        return cls.isAssignableFrom(obj.getClass());
    }

    @Override // org.locationtech.jts.geom.s
    public void a(org.locationtech.jts.geom.n nVar) {
        Class cls = this.f338238a;
        if (cls == null || d(nVar, cls)) {
            this.f338239b.add(nVar);
        }
    }
}
