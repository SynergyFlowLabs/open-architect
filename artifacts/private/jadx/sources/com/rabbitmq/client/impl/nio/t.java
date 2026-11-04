package com.rabbitmq.client.impl.nio;

import java.nio.channels.Selector;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Selector f265604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<x> f265605b = Collections.newSetFromMap(new ConcurrentHashMap());

    t(Selector selector) {
        this.f265604a = selector;
    }

    public void a(w wVar, int i10) {
        this.f265605b.add(new x(wVar, i10));
        this.f265604a.wakeup();
    }
}
