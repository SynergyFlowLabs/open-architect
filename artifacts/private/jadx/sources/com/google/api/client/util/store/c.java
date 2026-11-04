package com.google.api.client.util.store;

import com.google.api.client.util.b0;
import com.google.api.client.util.h0;
import com.google.api.client.util.t;
import com.google.api.client.util.w;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class c<V extends Serializable> extends a<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f116172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HashMap<String, byte[]> f116173d;

    protected c(e eVar, String str) {
        super(eVar, str);
        this.f116172c = new ReentrantLock();
        this.f116173d = b0.a();
    }

    @Override // com.google.api.client.util.store.d
    public d<V> a(String str) throws IOException {
        if (str == null) {
            return this;
        }
        this.f116172c.lock();
        try {
            this.f116173d.remove(str);
            f();
            Lock lock = this.f116172c;
            return this;
        } finally {
            this.f116172c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.d
    public final d<V> b(String str, V v10) throws IOException {
        h0.d(str);
        h0.d(v10);
        this.f116172c.lock();
        try {
            this.f116173d.put(str, t.h(v10));
            f();
            return this;
        } finally {
            this.f116172c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.a, com.google.api.client.util.store.d
    public boolean c(V v10) throws IOException {
        if (v10 == null) {
            return false;
        }
        this.f116172c.lock();
        try {
            byte[] bArrH = t.h(v10);
            Iterator<byte[]> it = this.f116173d.values().iterator();
            while (it.hasNext()) {
                if (Arrays.equals(bArrH, it.next())) {
                    this.f116172c.unlock();
                    return true;
                }
            }
            this.f116172c.unlock();
            return false;
        } catch (Throwable th2) {
            this.f116172c.unlock();
            throw th2;
        }
    }

    @Override // com.google.api.client.util.store.d
    public final d<V> clear() throws IOException {
        this.f116172c.lock();
        try {
            this.f116173d.clear();
            f();
            Lock lock = this.f116172c;
            return this;
        } finally {
            this.f116172c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.a, com.google.api.client.util.store.d
    public boolean e(String str) throws IOException {
        if (str == null) {
            return false;
        }
        this.f116172c.lock();
        try {
            boolean zContainsKey = this.f116173d.containsKey(str);
            Lock lock = this.f116172c;
            return zContainsKey;
        } finally {
            this.f116172c.unlock();
        }
    }

    public void f() throws IOException {
    }

    @Override // com.google.api.client.util.store.d
    public final V get(String str) throws IOException {
        if (str == null) {
            return null;
        }
        this.f116172c.lock();
        try {
            V v10 = (V) t.e(this.f116173d.get(str));
            return v10;
        } finally {
            this.f116172c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.a, com.google.api.client.util.store.d
    public boolean isEmpty() throws IOException {
        this.f116172c.lock();
        try {
            boolean zIsEmpty = this.f116173d.isEmpty();
            Lock lock = this.f116172c;
            return zIsEmpty;
        } finally {
            this.f116172c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.d
    public final Set<String> keySet() throws IOException {
        this.f116172c.lock();
        try {
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(this.f116173d.keySet());
            return setUnmodifiableSet;
        } finally {
            this.f116172c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.a, com.google.api.client.util.store.d
    public int size() throws IOException {
        this.f116172c.lock();
        try {
            int size = this.f116173d.size();
            return size;
        } finally {
            this.f116172c.unlock();
        }
    }

    public String toString() {
        return f.a(this);
    }

    @Override // com.google.api.client.util.store.d
    public final Collection<V> values() throws IOException {
        this.f116172c.lock();
        try {
            ArrayList arrayListA = w.a();
            Iterator<byte[]> it = this.f116173d.values().iterator();
            while (it.hasNext()) {
                arrayListA.add(t.e(it.next()));
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayListA);
            this.f116172c.unlock();
            return listUnmodifiableList;
        } catch (Throwable th2) {
            this.f116172c.unlock();
            throw th2;
        }
    }
}
