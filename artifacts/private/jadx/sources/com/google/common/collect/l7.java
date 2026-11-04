package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b(emulated = true)
abstract class l7<E> extends z6<E> {

    class a extends l6<E> {
        a() {
        }

        @Override // java.util.List
        public E get(int i10) {
            return (E) l7.this.get(i10);
        }

        @Override // com.google.common.collect.h6
        boolean m() {
            return l7.this.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return l7.this.size();
        }

        @Override // com.google.common.collect.l6, com.google.common.collect.h6
        @com.google.common.annotations.c
        @com.google.common.annotations.d
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    l7() {
    }

    @Override // com.google.common.collect.z6
    l6<E> D() {
        return new a();
    }

    @Override // com.google.common.collect.h6
    @com.google.common.annotations.c
    int d(Object[] dst, int offset) {
        return c().d(dst, offset);
    }

    abstract E get(int index);

    @Override // com.google.common.collect.z6, com.google.common.collect.h6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public nb<E> iterator() {
        return c().iterator();
    }

    @Override // com.google.common.collect.z6, com.google.common.collect.h6
    @com.google.common.annotations.c
    @com.google.common.annotations.d
    Object writeReplace() {
        return super.writeReplace();
    }
}
