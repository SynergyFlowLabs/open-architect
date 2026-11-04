package com.google.api.client.util.store;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface d<V extends Serializable> {
    d<V> a(String str) throws IOException;

    d<V> b(String str, V v10) throws IOException;

    boolean c(V v10) throws IOException;

    d<V> clear() throws IOException;

    e d();

    boolean e(String str) throws IOException;

    V get(String str) throws IOException;

    String getId();

    boolean isEmpty() throws IOException;

    Set<String> keySet() throws IOException;

    int size() throws IOException;

    Collection<V> values() throws IOException;
}
