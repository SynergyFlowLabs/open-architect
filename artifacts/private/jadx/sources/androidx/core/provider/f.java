package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.util.t;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f48112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f48114f;

    public f(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f48109a = (String) t.l(str);
        this.f48110b = (String) t.l(str2);
        this.f48111c = (String) t.l(str3);
        this.f48112d = (List) t.l(list);
        this.f48113e = 0;
        this.f48114f = a(str, str2, str3);
    }

    private String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @p0
    public List<List<byte[]>> b() {
        return this.f48112d;
    }

    @androidx.annotation.e
    public int c() {
        return this.f48113e;
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    String d() {
        return this.f48114f;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f48114f;
    }

    @NonNull
    public String f() {
        return this.f48109a;
    }

    @NonNull
    public String g() {
        return this.f48110b;
    }

    @NonNull
    public String h() {
        return this.f48111c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f48109a + ", mProviderPackage: " + this.f48110b + ", mQuery: " + this.f48111c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f48112d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f48112d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f48113e);
        return sb2.toString();
    }

    public f(@NonNull String str, @NonNull String str2, @NonNull String str3, @androidx.annotation.e int i10) {
        this.f48109a = (String) t.l(str);
        this.f48110b = (String) t.l(str2);
        this.f48111c = (String) t.l(str3);
        this.f48112d = null;
        t.a(i10 != 0);
        this.f48113e = i10;
        this.f48114f = a(str, str2, str3);
    }
}
