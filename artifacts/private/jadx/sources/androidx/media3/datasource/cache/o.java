package androidx.media3.datasource.cache;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class o implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f62433f = new o(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, byte[]> f62435e;

    public o() {
        this(Collections.EMPTY_MAP);
    }

    private static void a(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), j(entry.getValue()));
        }
    }

    private static Map<String, byte[]> g(Map<String, byte[]> map, n nVar) {
        HashMap map2 = new HashMap(map);
        l(map2, nVar.c());
        a(map2, nVar.b());
        return map2;
    }

    private static byte[] j(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean k(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void l(HashMap<String, byte[]> map, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    @Override // androidx.media3.datasource.cache.m
    @p0
    public final String b(String str, @p0 String str2) {
        byte[] bArr = this.f62435e.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    @Override // androidx.media3.datasource.cache.m
    public final long c(String str, long j10) {
        byte[] bArr = this.f62435e.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    @Override // androidx.media3.datasource.cache.m
    public final boolean contains(String str) {
        return this.f62435e.containsKey(str);
    }

    @Override // androidx.media3.datasource.cache.m
    @p0
    public final byte[] e(String str, @p0 byte[] bArr) {
        byte[] bArr2 = this.f62435e.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return k(this.f62435e, ((o) obj).f62435e);
    }

    public o h(n nVar) {
        Map<String, byte[]> mapG = g(this.f62435e, nVar);
        return k(this.f62435e, mapG) ? this : new o(mapG);
    }

    public int hashCode() {
        if (this.f62434d == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f62435e.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f62434d = iHashCode;
        }
        return this.f62434d;
    }

    public Set<Map.Entry<String, byte[]>> i() {
        return this.f62435e.entrySet();
    }

    public o(Map<String, byte[]> map) {
        this.f62435e = Collections.unmodifiableMap(map);
    }
}
