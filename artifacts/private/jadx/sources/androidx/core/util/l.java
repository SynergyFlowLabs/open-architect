package androidx.core.util;

import androidx.annotation.b1;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class l extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f48400b = new StringBuilder(128);

    public l(String str) {
        this.f48399a = str;
    }

    private void a() {
        if (this.f48400b.length() > 0) {
            this.f48400b.toString();
            StringBuilder sb2 = this.f48400b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f48400b.append(c10);
            }
        }
    }
}
