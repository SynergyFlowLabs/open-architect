package rm;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f366681a;

    public e(InputStream inputStream) {
        this.f366681a = inputStream;
    }

    @Override // rm.d
    public void read(byte[] bArr) throws IOException {
        this.f366681a.read(bArr);
    }
}
