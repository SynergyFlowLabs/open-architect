package org.locationtech.jts.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f339150a = new HashMap();

    public void a(Object obj) {
        a aVar = (a) this.f339150a.get(obj);
        if (aVar == null) {
            this.f339150a.put(obj, new a(1));
        } else {
            aVar.b();
        }
    }

    public int b(Object obj) {
        a aVar = (a) this.f339150a.get(obj);
        if (aVar == null) {
            return 0;
        }
        return aVar.a();
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f339151a;

        public a() {
            this.f339151a = 0;
        }

        public int a() {
            return this.f339151a;
        }

        public void b() {
            this.f339151a++;
        }

        public a(int i10) {
            this.f339151a = i10;
        }
    }
}
