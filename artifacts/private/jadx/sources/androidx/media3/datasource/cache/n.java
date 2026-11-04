package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f62431a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f62432b = new ArrayList();

    @z7.a
    private n a(String str, Object obj) {
        this.f62431a.put((String) androidx.media3.common.util.a.g(str), androidx.media3.common.util.a.g(obj));
        this.f62432b.remove(str);
        return this;
    }

    public static n h(n nVar, long j10) {
        return nVar.e(m.f62430c, j10);
    }

    public static n i(n nVar, @p0 Uri uri) {
        return uri == null ? nVar.d(m.f62429b) : nVar.f(m.f62429b, uri.toString());
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f62431a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f62432b));
    }

    @z7.a
    public n d(String str) {
        this.f62432b.add(str);
        this.f62431a.remove(str);
        return this;
    }

    @z7.a
    public n e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    @z7.a
    public n f(String str, String str2) {
        return a(str, str2);
    }

    @z7.a
    public n g(String str, byte[] bArr) {
        return a(str, Arrays.copyOf(bArr, bArr.length));
    }
}
