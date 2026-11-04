package com.google.common.eventbus;

import com.google.common.base.j0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
@e
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f118544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f118545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f118546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f118547d;

    k(f eventBus, Object event, Object subscriber, Method subscriberMethod) {
        this.f118544a = (f) j0.E(eventBus);
        this.f118545b = j0.E(event);
        this.f118546c = j0.E(subscriber);
        this.f118547d = (Method) j0.E(subscriberMethod);
    }

    public Object a() {
        return this.f118545b;
    }

    public f b() {
        return this.f118544a;
    }

    public Object c() {
        return this.f118546c;
    }

    public Method d() {
        return this.f118547d;
    }
}
