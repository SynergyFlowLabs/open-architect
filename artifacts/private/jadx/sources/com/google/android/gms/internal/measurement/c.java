package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f108321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f108322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f108323c;

    public c() {
        this.f108321a = new b("", 0L, null);
        this.f108322b = new b("", 0L, null);
        this.f108323c = new ArrayList();
    }

    public final b a() {
        return this.f108321a;
    }

    public final void b(b bVar) {
        this.f108321a = bVar;
        this.f108322b = bVar.clone();
        this.f108323c.clear();
    }

    public final b c() {
        return this.f108322b;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        c cVar = new c(this.f108321a.clone());
        Iterator it = this.f108323c.iterator();
        while (it.hasNext()) {
            cVar.f108323c.add(((b) it.next()).clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.f108322b = bVar;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, b.h(str2, this.f108321a.e(str2), map.get(str2)));
        }
        this.f108323c.add(new b(str, j10, map2));
    }

    public final List f() {
        return this.f108323c;
    }

    public c(b bVar) {
        this.f108321a = bVar;
        this.f108322b = bVar.clone();
        this.f108323c = new ArrayList();
    }
}
