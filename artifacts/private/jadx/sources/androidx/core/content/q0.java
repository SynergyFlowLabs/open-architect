package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class q0 {
    private q0() {
    }

    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }

    @NonNull
    public static androidx.core.util.z<Uri> b(@NonNull final UriMatcher uriMatcher) {
        return new androidx.core.util.z() { // from class: androidx.core.content.p0
            @Override // androidx.core.util.z
            public final boolean test(Object obj) {
                return q0.a(uriMatcher, (Uri) obj);
            }
        };
    }
}
