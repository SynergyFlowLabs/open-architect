package androidx.media2.common;

import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Closeable {
    public abstract long a() throws IOException;

    public abstract int b(long j10, @NonNull byte[] bArr, int i10, int i11) throws IOException;
}
