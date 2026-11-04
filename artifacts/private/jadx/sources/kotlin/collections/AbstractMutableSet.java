package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.util.Set;
import kotlin.e1;
import qj.h;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = j.f266120g)
public abstract class AbstractMutableSet<E> extends java.util.AbstractSet<E> implements Set<E>, h {
    protected AbstractMutableSet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e10);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
