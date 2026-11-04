package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@t0
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<l> f290176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<o2> f290177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<u2.a> f290178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f290179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f290180e;

    private m0() {
    }

    static synchronized List<l> a() {
        try {
            f290180e = true;
        } catch (Throwable th2) {
            throw th2;
        }
        return f290176a;
    }

    static synchronized List<o2> b() {
        f290180e = true;
        return f290177b;
    }

    static synchronized List<u2.a> c() {
        try {
            f290180e = true;
        } catch (Throwable th2) {
            throw th2;
        }
        return f290178c;
    }

    static synchronized void d(List<l> list, List<o2> list2, List<u2.a> list3) {
        if (f290180e) {
            throw new IllegalStateException("Set cannot be called after any get call");
        }
        if (f290179d) {
            throw new IllegalStateException("Global interceptors and tracers are already set");
        }
        com.google.common.base.j0.E(list);
        com.google.common.base.j0.E(list2);
        com.google.common.base.j0.E(list3);
        f290176a = Collections.unmodifiableList(new ArrayList(list));
        f290177b = Collections.unmodifiableList(new ArrayList(list2));
        f290178c = Collections.unmodifiableList(new ArrayList(list3));
        f290179d = true;
    }
}
