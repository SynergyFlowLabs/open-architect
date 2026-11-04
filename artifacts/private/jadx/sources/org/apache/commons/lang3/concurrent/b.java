package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b<T> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<T> f337081a = new AtomicReference<>();

    protected abstract T a() throws j;

    @Override // org.apache.commons.lang3.concurrent.k
    public T get() throws j {
        T tA = this.f337081a.get();
        if (tA == null) {
            tA = a();
            if (!z1.a(this.f337081a, null, tA)) {
                return this.f337081a.get();
            }
        }
        return tA;
    }
}
