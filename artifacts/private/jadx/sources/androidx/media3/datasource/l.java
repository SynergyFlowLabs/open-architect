package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.x0(extension = 31, version = 7)
final class l extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f62522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62523b;

    public l(byte[] bArr) {
        this.f62522a = bArr;
    }

    public long getLength() {
        return this.f62522a.length;
    }

    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int iMin = Math.min(byteBuffer.remaining(), this.f62522a.length - this.f62523b);
        byteBuffer.put(this.f62522a, this.f62523b, iMin);
        this.f62523b += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.f62523b = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
