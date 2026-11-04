package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a<?> f96313b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f96314a = new HashMap();

    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<Object> b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f96315a;

        b(@NonNull Object obj) {
            this.f96315a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public Object a() {
            return this.f96315a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    @NonNull
    public synchronized <T> e<T> a(@NonNull T t10) {
        e.a<?> aVar;
        try {
            com.bumptech.glide.util.k.d(t10);
            aVar = this.f96314a.get(t10.getClass());
            if (aVar == null) {
                for (e.a<?> aVar2 : this.f96314a.values()) {
                    if (aVar2.a().isAssignableFrom(t10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f96313b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (e<T>) aVar.b(t10);
    }

    public synchronized void b(@NonNull e.a<?> aVar) {
        this.f96314a.put(aVar.a(), aVar);
    }
}
