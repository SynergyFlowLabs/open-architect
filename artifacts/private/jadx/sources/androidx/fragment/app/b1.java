package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
final class b1 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f51785b = new StringBuilder(128);

    b1(String str) {
        this.f51784a = str;
    }

    private void a() {
        if (this.f51785b.length() > 0) {
            this.f51785b.toString();
            StringBuilder sb2 = this.f51785b;
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
                this.f51785b.append(c10);
            }
        }
    }
}
