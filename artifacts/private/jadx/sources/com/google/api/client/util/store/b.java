package com.google.api.client.util.store;

import com.google.api.client.util.b0;
import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f116169c = Pattern.compile("\\w{1,30}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f116170a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, d<? extends Serializable>> f116171b = b0.a();

    @Override // com.google.api.client.util.store.e
    public final <V extends Serializable> d<V> a(String str) throws IOException {
        Pattern pattern = f116169c;
        h0.c(pattern.matcher(str).matches(), "%s does not match pattern %s", str, pattern);
        this.f116170a.lock();
        try {
            d<V> dVarB = (d) this.f116171b.get(str);
            if (dVarB == null) {
                dVarB = b(str);
                this.f116171b.put(str, dVarB);
            }
            return dVarB;
        } finally {
            this.f116170a.unlock();
        }
    }

    protected abstract <V extends Serializable> d<V> b(String str) throws IOException;
}
