package io.ably.lib.types;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public enum k {
    presence(e0.d.presence),
    publish(e0.d.publish),
    subscribe(e0.d.subscribe),
    presence_subscribe(e0.d.presence_subscribe),
    object_publish(e0.d.object_publish),
    object_subscribe(e0.d.object_subscribe),
    annotation_publish(e0.d.annotation_publish),
    annotation_subscribe(e0.d.annotation_subscribe);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f288055a;

    k(e0.d dVar) {
        this.f288055a = dVar.l();
    }

    public static Set<k> n(int i10) {
        HashSet hashSet = new HashSet();
        for (k kVar : values()) {
            int iL = kVar.l();
            if ((i10 & iL) == iL) {
                hashSet.add(kVar);
            }
        }
        return hashSet;
    }

    public int l() {
        return this.f288055a;
    }
}
