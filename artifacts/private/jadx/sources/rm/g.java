package rm;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f366682a;

    public g(OutputStream outputStream) {
        this.f366682a = outputStream;
    }

    @Override // rm.f
    public void a(byte[] bArr, int i10) throws IOException {
        this.f366682a.write(bArr, 0, i10);
    }
}
