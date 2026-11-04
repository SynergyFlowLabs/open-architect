package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.util.b1;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f67491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f67492b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f67491a = byteArrayOutputStream;
        this.f67492b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f67491a.reset();
        try {
            b(this.f67492b, aVar.f67485a);
            String str = aVar.f67486b;
            if (str == null) {
                str = "";
            }
            b(this.f67492b, str);
            this.f67492b.writeLong(aVar.f67487c);
            this.f67492b.writeLong(aVar.f67488d);
            this.f67492b.write(aVar.f67489e);
            this.f67492b.flush();
            return this.f67491a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
