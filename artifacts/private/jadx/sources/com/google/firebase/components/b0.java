package com.google.firebase.components;

import androidx.annotation.l1;

/* JADX INFO: loaded from: classes5.dex */
public class b0<T> implements z8.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f120745c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f120746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile z8.b<T> f120747b;

    b0(T t10) {
        this.f120746a = f120745c;
        this.f120746a = t10;
    }

    @l1
    boolean a() {
        return this.f120746a != f120745c;
    }

    @Override // z8.b
    public T get() {
        T t10;
        T t11 = (T) this.f120746a;
        Object obj = f120745c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f120746a;
                if (t10 == obj) {
                    t10 = this.f120747b.get();
                    this.f120746a = t10;
                    this.f120747b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public b0(z8.b<T> bVar) {
        this.f120746a = f120745c;
        this.f120747b = bVar;
    }
}
