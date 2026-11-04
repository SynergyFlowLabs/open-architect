package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface f0 {
    int a(int dataType);

    long b(int dataType, long loadDurationMs, IOException exception, int errorCount);

    long c(int dataType, long loadDurationMs, IOException exception, int errorCount);
}
