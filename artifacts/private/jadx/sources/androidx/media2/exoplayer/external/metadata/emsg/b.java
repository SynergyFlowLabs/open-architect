package androidx.media2.exoplayer.external.metadata.emsg;

import androidx.annotation.b1;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f55436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f55437b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f55436a = byteArrayOutputStream;
        this.f55437b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String value) throws IOException {
        dataOutputStream.writeBytes(value);
        dataOutputStream.writeByte(0);
    }

    private static void c(DataOutputStream outputStream, long value) throws IOException {
        outputStream.writeByte(((int) (value >>> 24)) & 255);
        outputStream.writeByte(((int) (value >>> 16)) & 255);
        outputStream.writeByte(((int) (value >>> 8)) & 255);
        outputStream.writeByte(((int) value) & 255);
    }

    public byte[] a(EventMessage eventMessage) {
        this.f55436a.reset();
        try {
            b(this.f55437b, eventMessage.f55430a);
            String str = eventMessage.f55431b;
            if (str == null) {
                str = "";
            }
            b(this.f55437b, str);
            c(this.f55437b, eventMessage.f55432c);
            c(this.f55437b, eventMessage.f55433d);
            this.f55437b.write(eventMessage.f55434e);
            this.f55437b.flush();
            return this.f55436a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
