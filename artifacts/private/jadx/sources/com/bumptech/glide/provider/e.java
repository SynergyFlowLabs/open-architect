package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f97251a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f97252b = new HashMap();

    private static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f97253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f97254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final l<T, R> f97255c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, l<T, R> lVar) {
            this.f97253a = cls;
            this.f97254b = cls2;
            this.f97255c = lVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f97253a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f97254b);
        }
    }

    @NonNull
    private synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f97251a.contains(str)) {
                this.f97251a.add(str);
            }
            arrayList = this.f97252b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f97252b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull l<T, R> lVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, lVar));
    }

    @NonNull
    public synchronized <T, R> List<l<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<String> it = this.f97251a.iterator();
            while (it.hasNext()) {
                List<a<?, ?>> list = this.f97252b.get(it.next());
                if (list != null) {
                    for (a<?, ?> aVar : list) {
                        if (aVar.a(cls, cls2)) {
                            arrayList.add(aVar.f97255c);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<String> it = this.f97251a.iterator();
            while (it.hasNext()) {
                List<a<?, ?>> list = this.f97252b.get(it.next());
                if (list != null) {
                    for (a<?, ?> aVar : list) {
                        if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f97254b)) {
                            arrayList.add(aVar.f97254b);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@NonNull String str, @NonNull l<T, R> lVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        try {
            c(str).add(0, new a<>(cls, cls2, lVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void f(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f97251a);
            this.f97251a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f97251a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f97251a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
