package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.util.List;
import kotlin.e1;
import qj.e;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = j.f266120g)
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements List<E>, e {
    protected AbstractMutableList() {
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i10, E e10);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return removeAt(i10);
    }

    public abstract E removeAt(int i10);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i10, E e10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
