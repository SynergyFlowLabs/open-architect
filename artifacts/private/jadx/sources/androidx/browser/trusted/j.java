package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final byte[] f11976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private String f11977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private List<byte[]> f11978c;

    private j(@NonNull byte[] bArr) {
        this.f11976a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i10 = 0; i10 < Math.min(bArr.length, bArr2.length); i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    @NonNull
    static j c(String str, List<byte[]> list) throws IOException {
        return new j(d(str, list), str, list);
    }

    @NonNull
    private static byte[] d(@NonNull String str, @NonNull List<byte[]> list) throws IOException {
        Collections.sort(list, new Comparator() { // from class: androidx.browser.trusted.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.b((byte[]) obj, (byte[]) obj2);
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @NonNull
    static j e(@NonNull byte[] bArr) {
        return new j(bArr);
    }

    private void i() throws IOException {
        if (this.f11977b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f11976a));
        this.f11977b = dataInputStream.readUTF();
        int i10 = dataInputStream.readInt();
        this.f11978c = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = dataInputStream.readInt();
            byte[] bArr = new byte[i12];
            if (dataInputStream.read(bArr) != i12) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.f11978c.add(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11976a, ((j) obj).f11976a);
    }

    @NonNull
    public byte[] f(int i10) throws IOException {
        i();
        List<byte[]> list = this.f11978c;
        if (list != null) {
            return Arrays.copyOf(list.get(i10), this.f11978c.get(i10).length);
        }
        throw new IllegalStateException();
    }

    public int g() throws IOException {
        i();
        List<byte[]> list = this.f11978c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @NonNull
    public String h() throws IOException {
        i();
        String str = this.f11977b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11976a);
    }

    @NonNull
    public byte[] j() {
        byte[] bArr = this.f11976a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private j(@NonNull byte[] bArr, @NonNull String str, @NonNull List<byte[]> list) {
        this.f11976a = bArr;
        this.f11977b = str;
        this.f11978c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.f11978c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
