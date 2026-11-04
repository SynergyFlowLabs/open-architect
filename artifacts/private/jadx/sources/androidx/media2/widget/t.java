package androidx.media2.widget;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.superwall.sdk.network.Api;

/* JADX INFO: loaded from: classes.dex */
class t {
    private t() {
    }

    static boolean a(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        return scheme.equals("http") || scheme.equals(Api.scheme) || scheme.equals("rtsp");
    }
}
