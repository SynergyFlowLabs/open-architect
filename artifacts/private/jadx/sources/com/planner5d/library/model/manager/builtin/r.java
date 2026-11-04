package com.planner5d.library.model.manager.builtin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, com.planner5d.library.model.v> f181202a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f181203b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, com.planner5d.library.model.y> f181204c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, com.planner5d.library.model.x[]> f181205d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f181206e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u.a f181207f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f181208g = new Object();

    @ij.a
    r() {
    }

    void a() {
        synchronized (this.f181208g) {
            this.f181206e.clear();
            this.f181202a = null;
            this.f181203b = null;
            this.f181204c = null;
            this.f181205d = null;
            this.f181207f = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    Map<Integer, com.planner5d.library.model.v> b(String str) {
        Map<Integer, com.planner5d.library.model.v> map;
        synchronized (this.f181208g) {
            if (str != null) {
                try {
                    if (str.equals(this.f181203b)) {
                        map = this.f181202a;
                    } else {
                        map = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                map = null;
            }
        }
        return map;
    }

    Map<String, com.planner5d.library.model.x[]> c() {
        Map<String, com.planner5d.library.model.x[]> map;
        synchronized (this.f181208g) {
            try {
                if (this.f181205d == null) {
                    this.f181205d = new HashMap();
                }
                map = this.f181205d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    Map<String, com.planner5d.library.model.y> d() {
        Map<String, com.planner5d.library.model.y> map;
        synchronized (this.f181208g) {
            try {
                map = this.f181204c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    List<String> e() {
        List<String> list;
        synchronized (this.f181208g) {
            list = this.f181206e;
        }
        return list;
    }

    u.a f() {
        u.a aVar;
        synchronized (this.f181208g) {
            try {
                if (this.f181207f == null) {
                    this.f181207f = new u.a();
                }
                aVar = this.f181207f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    void g(String str, Map<Integer, com.planner5d.library.model.v> map) {
        synchronized (this.f181208g) {
            try {
                this.f181203b = str;
                this.f181202a = map;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void h(Map<String, com.planner5d.library.model.y> map, List<String> list) {
        synchronized (this.f181208g) {
            this.f181204c = map;
            this.f181206e.clear();
            this.f181206e.addAll(list);
        }
    }
}
