package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.util.Collection;
import kotlin.e1;
import qj.b;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = j.f266120g)
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements Collection<E>, b {
    protected AbstractMutableCollection() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e10);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
