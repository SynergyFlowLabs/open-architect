package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62428a = "custom_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62429b = "exo_redir";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62430c = "exo_len";

    @p0
    static Uri d(m mVar) {
        String strB = mVar.b(f62429b, null);
        if (strB == null) {
            return null;
        }
        return Uri.parse(strB);
    }

    static long f(m mVar) {
        return mVar.c(f62430c, -1L);
    }

    @p0
    String b(String str, @p0 String str2);

    long c(String str, long j10);

    boolean contains(String str);

    @p0
    byte[] e(String str, @p0 byte[] bArr);
}
