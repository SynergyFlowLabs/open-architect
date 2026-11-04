package androidx.media2.exoplayer.external.source.hls;

import androidx.annotation.b1;
import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o extends IOException {
    public o(@p0 String mimeType) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(mimeType).length() + 60);
        sb2.append("Unable to bind a sample queue to TrackGroup with mime type ");
        sb2.append(mimeType);
        sb2.append(".");
        super(sb2.toString());
    }
}
