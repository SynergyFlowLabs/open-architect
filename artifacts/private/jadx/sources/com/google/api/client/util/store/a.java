package com.google.api.client.util.store;

import com.google.api.client.util.h0;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<V extends Serializable> implements d<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f116167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f116168b;

    protected a(e eVar, String str) {
        this.f116167a = (e) h0.d(eVar);
        this.f116168b = (String) h0.d(str);
    }

    @Override // com.google.api.client.util.store.d
    public boolean c(V v10) throws IOException {
        return values().contains(v10);
    }

    @Override // com.google.api.client.util.store.d
    public e d() {
        return this.f116167a;
    }

    @Override // com.google.api.client.util.store.d
    public boolean e(String str) throws IOException {
        return get(str) != null;
    }

    @Override // com.google.api.client.util.store.d
    public final String getId() {
        return this.f116168b;
    }

    @Override // com.google.api.client.util.store.d
    public boolean isEmpty() throws IOException {
        return size() == 0;
    }

    @Override // com.google.api.client.util.store.d
    public int size() throws IOException {
        return keySet().size();
    }
}
