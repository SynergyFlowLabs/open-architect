package org.apache.commons.collections4.multimap;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.g0;

/* JADX INFO: loaded from: classes14.dex */
public class e<K, V> extends a<K, V> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f336187g = 20151118;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f336188h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f336189i = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f336190f;

    public e() {
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
    @Override // org.apache.commons.collections4.multimap.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ArrayList<V> d() {
        return new ArrayList<>(this.f336190f);
    }

    public void o() {
        Iterator<List<V>> it = g().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    public e(int i10) {
        this(16, i10);
    }

    public e(int i10, int i11) {
        super(new HashMap(i10));
        this.f336190f = i11;
    }

    public e(g0<? extends K, ? extends V> g0Var) {
        this(g0Var.size(), 3);
        super.b(g0Var);
    }

    public e(Map<? extends K, ? extends V> map) {
        this(map.size(), 3);
        super.putAll(map);
    }
}
