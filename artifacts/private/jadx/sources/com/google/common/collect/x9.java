package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@a4
final class x9 {

    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f118312a;

        void a(T instance, int value) {
            try {
                this.f118312a.set(instance, Integer.valueOf(value));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        void b(T instance, Object value) {
            try {
                this.f118312a.set(instance, value);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        private b(Field field) {
            this.f118312a = field;
            field.setAccessible(true);
        }
    }

    private x9() {
    }

    static <T> b<T> a(Class<T> clazz, String fieldName) {
        try {
            return new b<>(clazz.getDeclaredField(fieldName));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    static <K, V> void b(Map<K, V> map, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        c(map, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void c(Map<K, V> map, ObjectInputStream stream, int size) throws IOException, ClassNotFoundException {
        for (int i10 = 0; i10 < size; i10++) {
            map.put(stream.readObject(), stream.readObject());
        }
    }

    static <K, V> void d(k8<K, V> multimap, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        e(multimap, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void e(k8<K, V> multimap, ObjectInputStream stream, int distinctKeys) throws IOException, ClassNotFoundException {
        for (int i10 = 0; i10 < distinctKeys; i10++) {
            Collection collection = multimap.get(stream.readObject());
            int i11 = stream.readInt();
            for (int i12 = 0; i12 < i11; i12++) {
                collection.add(stream.readObject());
            }
        }
    }

    static <E> void f(q8<E> multiset, ObjectInputStream stream) throws IOException, ClassNotFoundException {
        g(multiset, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void g(q8<E> multiset, ObjectInputStream stream, int distinctElements) throws IOException, ClassNotFoundException {
        for (int i10 = 0; i10 < distinctElements; i10++) {
            multiset.H(stream.readObject(), stream.readInt());
        }
    }

    static int h(ObjectInputStream stream) throws IOException {
        return stream.readInt();
    }

    static <K, V> void i(Map<K, V> map, ObjectOutputStream stream) throws IOException {
        stream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    static <K, V> void j(k8<K, V> multimap, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multimap.l().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.l().entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                stream.writeObject(it.next());
            }
        }
    }

    static <E> void k(q8<E> multiset, ObjectOutputStream stream) throws IOException {
        stream.writeInt(multiset.entrySet().size());
        for (q8.a<E> aVar : multiset.entrySet()) {
            stream.writeObject(aVar.X0());
            stream.writeInt(aVar.getCount());
        }
    }
}
