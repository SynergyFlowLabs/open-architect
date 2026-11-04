package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48367d = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f48369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f48370c;

    public c(@NonNull File file) {
        this.f48368a = file;
        this.f48369b = new File(file.getPath() + ".new");
        this.f48370c = new File(file.getPath() + ".bak");
    }

    private static void g(@NonNull File file, @NonNull File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            file2.toString();
        }
        if (file.renameTo(file2)) {
            return;
        }
        file.toString();
        file2.toString();
    }

    private static boolean i(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f48368a.delete();
        this.f48369b.delete();
        this.f48370c.delete();
    }

    public void b(@p0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            i(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            if (!this.f48369b.delete()) {
                Objects.toString(this.f48369b);
            }
        }
    }

    public void c(@p0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        i(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        g(this.f48369b, this.f48368a);
    }

    @NonNull
    public File d() {
        return this.f48368a;
    }

    @NonNull
    public FileInputStream e() throws FileNotFoundException {
        if (this.f48370c.exists()) {
            g(this.f48370c, this.f48368a);
        }
        if (this.f48369b.exists() && this.f48368a.exists() && !this.f48369b.delete()) {
            Objects.toString(this.f48369b);
        }
        return new FileInputStream(this.f48368a);
    }

    @NonNull
    public byte[] f() throws IOException {
        FileInputStream fileInputStreamE = e();
        try {
            byte[] bArr = new byte[fileInputStreamE.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamE.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    fileInputStreamE.close();
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamE.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th2) {
            fileInputStreamE.close();
            throw th2;
        }
    }

    @NonNull
    public FileOutputStream h() throws IOException {
        if (this.f48370c.exists()) {
            g(this.f48370c, this.f48368a);
        }
        try {
            return new FileOutputStream(this.f48369b);
        } catch (FileNotFoundException unused) {
            if (!this.f48369b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f48369b);
            }
            try {
                return new FileOutputStream(this.f48369b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f48369b, e10);
            }
        }
    }
}
