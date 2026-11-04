package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<T> implements k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<c<T>> f337082a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f337083b = new AtomicReference<>();

    protected abstract T a() throws j;

    @Override // org.apache.commons.lang3.concurrent.k
    public final T get() throws j {
        while (true) {
            T t10 = this.f337083b.get();
            if (t10 != null) {
                return t10;
            }
            if (z1.a(this.f337082a, null, this)) {
                this.f337083b.set(a());
            }
        }
    }
}
