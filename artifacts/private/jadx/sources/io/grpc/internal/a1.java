package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
public abstract class a1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<T> f288839a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f288839a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    protected abstract void b();

    protected abstract void c();

    public final boolean d() {
        return !this.f288839a.isEmpty();
    }

    public final void e(T t10, boolean z10) {
        int size = this.f288839a.size();
        if (z10) {
            this.f288839a.add(t10);
            if (size == 0) {
                b();
            }
        } else if (this.f288839a.remove(t10) && size == 1) {
            c();
        }
    }
}
