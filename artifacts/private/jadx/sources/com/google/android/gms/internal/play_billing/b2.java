package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class b2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f109051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private Object f109053c;

    public b2(Iterator it) {
        it.getClass();
        this.f109051a = it;
    }

    @Override // com.google.android.gms.internal.play_billing.j2
    public final Object a() {
        if (!this.f109052b) {
            this.f109053c = this.f109051a.next();
            this.f109052b = true;
        }
        return this.f109053c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f109052b || this.f109051a.hasNext();
    }

    @Override // com.google.android.gms.internal.play_billing.j2, java.util.Iterator
    public final Object next() {
        if (!this.f109052b) {
            return this.f109051a.next();
        }
        Object obj = this.f109053c;
        this.f109052b = false;
        this.f109053c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f109052b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f109051a.remove();
    }
}
