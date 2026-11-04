package org.apache.commons.collections4.multimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.apache.commons.collections4.g0;

/* JADX INFO: loaded from: classes14.dex */
public class f<K, V> extends d<K, V> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f336191g = 20151118;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f336192h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f336193i = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f336194f;

    public f() {
        this(16, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        h(new HashMap());
        e(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        f(objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.multimap.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public HashSet<V> d() {
        return new HashSet<>(this.f336194f);
    }

    public f(int i10) {
        this(16, i10);
    }

    public f(int i10, int i11) {
        super(new HashMap(i10));
        this.f336194f = i11;
    }

    public f(g0<? extends K, ? extends V> g0Var) {
        this(g0Var.size(), 3);
        super.b(g0Var);
    }

    public f(Map<? extends K, ? extends V> map) {
        this(map.size(), 3);
        super.putAll(map);
    }
}
