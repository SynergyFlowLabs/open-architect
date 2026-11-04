package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61424c = k1.c1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61425d = k1.c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61427b;

    public h(String str, int i10) {
        this.f61426a = str;
        this.f61427b = i10;
    }

    public static h a(Bundle bundle) {
        return new h((String) androidx.media3.common.util.a.g(bundle.getString(f61424c)), bundle.getInt(f61425d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f61424c, this.f61426a);
        bundle.putInt(f61425d, this.f61427b);
        return bundle;
    }
}
