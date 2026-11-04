package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<d, Integer> f96715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f96716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96718d;

    public c(Map<d, Integer> map) {
        this.f96715a = map;
        this.f96716b = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f96717c += it.next().intValue();
        }
    }

    public int a() {
        return this.f96717c;
    }

    public boolean b() {
        return this.f96717c == 0;
    }

    public d c() {
        d dVar = this.f96716b.get(this.f96718d);
        Integer num = this.f96715a.get(dVar);
        if (num.intValue() == 1) {
            this.f96715a.remove(dVar);
            this.f96716b.remove(this.f96718d);
        } else {
            this.f96715a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f96717c--;
        this.f96718d = this.f96716b.isEmpty() ? 0 : (this.f96718d + 1) % this.f96716b.size();
        return dVar;
    }
}
