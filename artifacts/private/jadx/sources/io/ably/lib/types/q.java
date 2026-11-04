package io.ably.lib.types;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f288148c = "io.ably.lib.types.q";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f288149d = "vcdiff";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f288150e = "from";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f288151f = "format";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f288152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f288153b;

    private q(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("format cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("from cannot be null.");
        }
        this.f288152a = str;
        this.f288153b = str2;
    }

    static q c(com.google.gson.o oVar) {
        return new q(oVar.S(f288151f).D(), oVar.S("from").D());
    }

    static q d(Map<org.msgpack.value.x, org.msgpack.value.x> map) throws IOException {
        return new q(map.get(org.msgpack.value.y.z(f288151f)).r().u(), map.get(org.msgpack.value.y.z("from")).r().u());
    }

    public String a() {
        return this.f288152a;
    }

    public String b() {
        return this.f288153b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f288152a.equals(qVar.f288152a) && this.f288153b.equals(qVar.f288153b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f288152a, this.f288153b);
    }
}
