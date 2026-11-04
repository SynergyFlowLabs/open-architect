package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.EmptyStackException;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class a<E> extends ArrayList<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f335489a = 2130079159931574599L;

    public a() {
    }

    public boolean c() {
        return isEmpty();
    }

    public E d(int i10) throws EmptyStackException {
        int size = (size() - i10) - 1;
        if (size >= 0) {
            return get(size);
        }
        throw new EmptyStackException();
    }

    public E i(E e10) {
        add(e10);
        return e10;
    }

    public int k(Object obj) {
        int i10 = 1;
        int size = size() - 1;
        while (size >= 0) {
            E e10 = get(size);
            if ((obj == null && e10 == null) || (obj != null && obj.equals(e10))) {
                return i10;
            }
            size--;
            i10++;
        }
        return -1;
    }

    public E peek() throws EmptyStackException {
        int size = size();
        if (size > 0) {
            return get(size - 1);
        }
        throw new EmptyStackException();
    }

    public E pop() throws EmptyStackException {
        int size = size();
        if (size > 0) {
            return remove(size - 1);
        }
        throw new EmptyStackException();
    }

    public a(int i10) {
        super(i10);
    }
}
