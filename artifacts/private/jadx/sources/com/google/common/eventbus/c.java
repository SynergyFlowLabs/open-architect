package com.google.common.eventbus;

import androidx.core.app.w;
import com.google.common.base.b0;
import com.google.common.base.j0;

/* JADX INFO: loaded from: classes5.dex */
@e
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f118519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f118520b;

    public c(Object source, Object event) {
        this.f118519a = j0.E(source);
        this.f118520b = j0.E(event);
    }

    public Object a() {
        return this.f118520b;
    }

    public Object b() {
        return this.f118519a;
    }

    public String toString() {
        return b0.c(this).f("source", this.f118519a).f(w.I0, this.f118520b).toString();
    }
}
