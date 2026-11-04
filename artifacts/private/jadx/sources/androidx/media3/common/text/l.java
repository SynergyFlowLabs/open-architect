package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f61444b = k1.c1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61445a;

    public l(String str) {
        this.f61445a = str;
    }

    public static l a(Bundle bundle) {
        return new l((String) androidx.media3.common.util.a.g(bundle.getString(f61444b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f61444b, this.f61445a);
        return bundle;
    }
}
