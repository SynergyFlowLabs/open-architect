package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class j2<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50389d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f50390e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<K, V> f50391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f50392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f50393c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50394a;

        static {
            int[] iArr = new int[a5.b.values().length];
            f50394a = iArr;
            try {
                iArr[a5.b.f49977m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50394a[a5.b.f49980s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50394a[a5.b.f49976l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a5.b f50395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f50396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a5.b f50397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f50398d;

        public b(a5.b keyType, K defaultKey, a5.b valueType, V defaultValue) {
            this.f50395a = keyType;
            this.f50396b = defaultKey;
            this.f50397c = valueType;
            this.f50398d = defaultValue;
        }
    }

    private j2(a5.b keyType, K defaultKey, a5.b valueType, V defaultValue) {
        this.f50391a = new b<>(keyType, defaultKey, valueType, defaultValue);
        this.f50392b = defaultKey;
        this.f50393c = defaultValue;
    }

    static <K, V> int b(b<K, V> metadata, K key, V value) {
        return f1.o(metadata.f50395a, 1, key) + f1.o(metadata.f50397c, 2, value);
    }

    public static <K, V> j2<K, V> f(a5.b keyType, K defaultKey, a5.b valueType, V defaultValue) {
        return new j2<>(keyType, defaultKey, valueType, defaultValue);
    }

    static <K, V> Map.Entry<K, V> h(z input, b<K, V> metadata, v0 extensionRegistry) throws IOException {
        Object objI = metadata.f50396b;
        Object objI2 = metadata.f50398d;
        while (true) {
            int iZ = input.Z();
            if (iZ == 0) {
                break;
            }
            if (iZ == a5.c(1, metadata.f50395a.l())) {
                objI = i(input, extensionRegistry, metadata.f50395a, objI);
            } else if (iZ == a5.c(2, metadata.f50397c.l())) {
                objI2 = i(input, extensionRegistry, metadata.f50397c, objI2);
            } else if (!input.h0(iZ)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objI, objI2);
    }

    static <T> T i(z zVar, v0 v0Var, a5.b bVar, T t10) throws IOException {
        int i10 = a.f50394a[bVar.ordinal()];
        if (i10 == 1) {
            q2.a aVarR1 = ((q2) t10).r1();
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
        f1.S(output, metadata.f50395a, 1, key);
        f1.S(output, metadata.f50397c, 2, value);
    }

    public int a(int fieldNumber, K key, V value) {
        return b0.X0(fieldNumber) + b0.D0(b(this.f50391a, key, value));
    }

    public K c() {
        return this.f50392b;
    }

    b<K, V> d() {
        return this.f50391a;
    }

    public V e() {
        return this.f50393c;
    }

    public Map.Entry<K, V> g(u bytes, v0 extensionRegistry) throws IOException {
        return h(bytes.V(), this.f50391a, extensionRegistry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(k2<K, V> map, z input, v0 extensionRegistry) throws IOException {
        int iU = input.u(input.O());
        b<K, V> bVar = this.f50391a;
        Object objI = bVar.f50396b;
        Object objI2 = bVar.f50398d;
        while (true) {
            int iZ = input.Z();
            if (iZ == 0) {
                break;
            }
            if (iZ == a5.c(1, this.f50391a.f50395a.l())) {
                objI = i(input, extensionRegistry, this.f50391a.f50395a, objI);
            } else if (iZ == a5.c(2, this.f50391a.f50397c.l())) {
                objI2 = i(input, extensionRegistry, this.f50391a.f50397c, objI2);
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
        output.h2(b(this.f50391a, key, value));
        l(output, this.f50391a, key, value);
    }

    private j2(b<K, V> metadata, K key, V value) {
        this.f50391a = metadata;
        this.f50392b = key;
        this.f50393c = value;
    }
}
