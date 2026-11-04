package androidx.media2.exoplayer.external.source;

import android.net.Uri;
import androidx.media2.exoplayer.external.offline.StreamKey;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public interface m0 {
    int[] c();

    z d(Uri uri);

    m0 e(List<StreamKey> streamKeys);
}
