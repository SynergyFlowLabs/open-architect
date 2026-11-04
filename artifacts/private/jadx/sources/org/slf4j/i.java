package org.slf4j;

import org.slf4j.helpers.p;
import org.slf4j.spi.j;

/* JADX INFO: loaded from: classes14.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static b f339683a;

    static {
        j jVarM = e.m();
        if (jVarM != null) {
            f339683a = jVarM.b();
            return;
        }
        p.b("Failed to find provider");
        p.b("Defaulting to BasicMarkerFactory.");
        f339683a = new org.slf4j.helpers.d();
    }

    private i() {
    }

    public static h a(String str) {
        return f339683a.d(str);
    }

    public static b b() {
        return f339683a;
    }

    public static h c(String str) {
        return f339683a.b(str);
    }
}
