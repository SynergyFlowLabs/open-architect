package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class g2<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125994d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125995e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<K, V> f125996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f125997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f125998c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125999a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f125999a = iArr;
            try {
                iArr[x4.b.f126492m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125999a[x4.b.f126495s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125999a[x4.b.f126491l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x4.b f126000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f126001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x4.b f126002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f126003d;

        public b(x4.b keyType, K defaultKey, x4.b valueType, V defaultValue) {
            this.f126000a = keyType;
            this.f126001b = defaultKey;
            this.f126002c = valueType;
            this.f126003d = defaultValue;
        }
    }

    private g2(x4.b keyType, K defaultKey, x4.b valueType, V defaultValue) {
        this.f125996a = new b<>(keyType, defaultKey, valueType, defaultValue);
        this.f125997b = defaultKey;
        this.f125998c = defaultValue;
    }

    static <K, V> int b(b<K, V> metadata, K key, V value) {
        return f1.o(metadata.f126000a, 1, key) + f1.o(metadata.f126002c, 2, value);
    }

    public static <K, V> g2<K, V> f(x4.b keyType, K defaultKey, x4.b valueType, V defaultValue) {
        return new g2<>(keyType, defaultKey, valueType, defaultValue);
    }

    static <K, V> Map.Entry<K, V> h(z input, b<K, V> metadata, v0 extensionRegistry) throws IOException {
        Object objI = metadata.f126001b;
        Object objI2 = metadata.f126003d;
        while (true) {
            int iZ = input.Z();
            if (iZ == 0) {
                break;
            }
            if (iZ == x4.c(1, metadata.f126000a.l())) {
                objI = i(input, extensionRegistry, metadata.f126000a, objI);
            } else if (iZ == x4.c(2, metadata.f126002c.l())) {
                objI2 = i(input, extensionRegistry, metadata.f126002c, objI2);
            } else if (!input.h0(iZ)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objI, objI2);
    }

    static <T> T i(z zVar, v0 v0Var, x4.b bVar, T t10) throws IOException {
        int i10 = a.f125999a[bVar.ordinal()];
        if (i10 == 1) {
            n2.a aVarR1 = ((n2) t10).r1();
            zVar.J(aVarR1, v0Var);
            return (T) aVarR1.B1();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(zVar.A());
        }
        if (i10 != 3) {
            return (T) f1.O(zVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void l(b0 output, b<K, V> metadata, K key, V value) throws IOException {
        f1.S(output, metadata.f126000a, 1, key);
        f1.S(output, metadata.f126002c, 2, value);
    }

    public int a(int fieldNumber, K key, V value) {
        return b0.X0(fieldNumber) + b0.D0(b(this.f125996a, key, value));
    }

    public K c() {
        return this.f125997b;
    }

    b<K, V> d() {
        return this.f125996a;
    }

    public V e() {
        return this.f125998c;
    }

    public Map.Entry<K, V> g(u bytes, v0 extensionRegistry) throws IOException {
        return h(bytes.V(), this.f125996a, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(h2<K, V> map, z input, v0 extensionRegistry) throws IOException {
        int iU = input.u(input.O());
        b<K, V> bVar = this.f125996a;
        Object objI = bVar.f126001b;
        Object objI2 = bVar.f126003d;
        while (true) {
            int iZ = input.Z();
            if (iZ == 0) {
                break;
            }
            if (iZ == x4.c(1, this.f125996a.f126000a.l())) {
                objI = i(input, extensionRegistry, this.f125996a.f126000a, objI);
            } else if (iZ == x4.c(2, this.f125996a.f126002c.l())) {
                objI2 = i(input, extensionRegistry, this.f125996a.f126002c, objI2);
            } else if (!input.h0(iZ)) {
                break;
            }
        }
        input.a(0);
        input.t(iU);
        map.put(objI, objI2);
    }

    public void k(b0 output, int fieldNumber, K key, V value) throws IOException {
        output.g2(fieldNumber, 2);
        output.h2(b(this.f125996a, key, value));
        l(output, this.f125996a, key, value);
    }

    private g2(b<K, V> metadata, K key, V value) {
        this.f125996a = metadata;
        this.f125997b = key;
        this.f125998c = value;
    }
}
