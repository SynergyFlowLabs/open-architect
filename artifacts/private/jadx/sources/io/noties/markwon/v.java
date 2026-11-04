package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class v implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<r, Object> f298615a = new HashMap(3);

    v() {
    }

    @Override // io.noties.markwon.u
    @NonNull
    public <T> T a(@NonNull r<T> rVar, @NonNull T t10) {
        T t11 = (T) this.f298615a.get(rVar);
        return t11 != null ? t11 : t10;
    }

    @Override // io.noties.markwon.u
    public <T> void b(@NonNull r<T> rVar, @p0 T t10) {
        if (t10 == null) {
            this.f298615a.remove(rVar);
        } else {
            this.f298615a.put(rVar, t10);
        }
    }

    @Override // io.noties.markwon.u
    @p0
    public <T> T c(@NonNull r<T> rVar) {
        return (T) this.f298615a.get(rVar);
    }

    @Override // io.noties.markwon.u
    public void clearAll() {
        this.f298615a.clear();
    }

    @Override // io.noties.markwon.u
    public <T> void d(@NonNull r<T> rVar) {
        this.f298615a.remove(rVar);
    }
}
