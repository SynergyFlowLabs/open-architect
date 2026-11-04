package com.google.firebase.crashlytics.internal.metadata;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f121285g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f121286h = 4096;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f121287i = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f121288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f121289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f121290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f121291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f121292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f121293f;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f121294a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f121295b;

        a(StringBuilder sb2) {
            this.f121295b = sb2;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f121294a) {
                this.f121294a = false;
            } else {
                this.f121295b.append(", ");
            }
            this.f121295b.append(i10);
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f121297c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final b f121298d = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f121299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f121300b;

        b(int i10, int i11) {
            this.f121299a = i10;
            this.f121300b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f121299a + ", length = " + this.f121300b + "]";
        }
    }

    private final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f121301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f121302b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.o(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f121302b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.N(this.f121301a, bArr, i10, i11);
            this.f121301a = h.this.d0(this.f121301a + i11);
            this.f121302b -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f121301a = h.this.d0(bVar.f121299a + 4);
            this.f121302b = bVar.f121300b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f121302b == 0) {
                int i10 = 7 | (-1);
                return -1;
            }
            h.this.f121288a.seek(this.f121301a);
            int i11 = h.this.f121288a.read();
            this.f121301a = h.this.d0(this.f121301a + 1);
            this.f121302b--;
            return i11;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    public h(File file) throws IOException {
        this.f121293f = new byte[16];
        if (!file.exists()) {
            l(file);
        }
        this.f121288a = q(file);
        y();
    }

    private static int E(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int H() {
        return this.f121289b - Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iD0 = d0(i10);
        int i13 = iD0 + i12;
        int i14 = this.f121289b;
        if (i13 <= i14) {
            this.f121288a.seek(iD0);
            this.f121288a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iD0;
        this.f121288a.seek(iD0);
        this.f121288a.readFully(bArr, i11, i15);
        this.f121288a.seek(16L);
        this.f121288a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void R(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iD0 = d0(i10);
        int i13 = iD0 + i12;
        int i14 = this.f121289b;
        if (i13 <= i14) {
            this.f121288a.seek(iD0);
            this.f121288a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iD0;
        this.f121288a.seek(iD0);
        this.f121288a.write(bArr, i11, i15);
        this.f121288a.seek(16L);
        this.f121288a.write(bArr, i11 + i15, i12 - i15);
    }

    private void T(int i10) throws IOException {
        this.f121288a.setLength(i10);
        this.f121288a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d0(int i10) {
        int i11 = this.f121289b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void f0(int i10, int i11, int i12, int i13) throws IOException {
        j0(this.f121293f, i10, i11, i12, i13);
        this.f121288a.seek(0L);
        this.f121288a.write(this.f121293f);
    }

    private void g(int i10) throws IOException {
        int i11 = i10 + 4;
        int iH = H();
        if (iH >= i11) {
            return;
        }
        int i12 = this.f121289b;
        do {
            iH += i12;
            i12 <<= 1;
        } while (iH < i11);
        T(i12);
        b bVar = this.f121292e;
        int iD0 = d0(bVar.f121299a + 4 + bVar.f121300b);
        if (iD0 < this.f121291d.f121299a) {
            FileChannel channel = this.f121288a.getChannel();
            channel.position(this.f121289b);
            long j10 = iD0 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f121292e.f121299a;
        int i14 = this.f121291d.f121299a;
        if (i13 < i14) {
            int i15 = (this.f121289b + i13) - 16;
            f0(i12, this.f121290c, i14, i15);
            this.f121292e = new b(i15, this.f121292e.f121300b);
        } else {
            f0(i12, this.f121290c, i14, i13);
        }
        this.f121289b = i12;
    }

    private static void g0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void j0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            g0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private static void l(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileQ = q(file2);
        try {
            randomAccessFileQ.setLength(PlaybackStateCompat.H1);
            randomAccessFileQ.seek(0L);
            byte[] bArr = new byte[16];
            j0(bArr, 4096, 0, 0, 0);
            randomAccessFileQ.write(bArr);
            randomAccessFileQ.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            randomAccessFileQ.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T o(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile q(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b x(int i10) throws IOException {
        if (i10 == 0) {
            return b.f121298d;
        }
        this.f121288a.seek(i10);
        return new b(i10, this.f121288a.readInt());
    }

    private void y() throws IOException {
        this.f121288a.seek(0L);
        this.f121288a.readFully(this.f121293f);
        int iE = E(this.f121293f, 0);
        this.f121289b = iE;
        if (iE <= this.f121288a.length()) {
            this.f121290c = E(this.f121293f, 4);
            int iE2 = E(this.f121293f, 8);
            int iE3 = E(this.f121293f, 12);
            this.f121291d = x(iE2);
            this.f121292e = x(iE3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f121289b + ", Actual length: " + this.f121288a.length());
    }

    public synchronized void I() throws IOException {
        try {
            if (m()) {
                throw new NoSuchElementException();
            }
            if (this.f121290c == 1) {
                f();
            } else {
                b bVar = this.f121291d;
                int iD0 = d0(bVar.f121299a + 4 + bVar.f121300b);
                N(iD0, this.f121293f, 0, 4);
                int iE = E(this.f121293f, 0);
                f0(this.f121289b, this.f121290c - 1, iD0, this.f121292e.f121299a);
                this.f121290c--;
                this.f121291d = new b(iD0, iE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void P0(byte[] bArr, int i10, int i11) throws IOException {
        int iD0;
        try {
            o(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            g(i11);
            boolean zM = m();
            if (zM) {
                iD0 = 16;
            } else {
                b bVar = this.f121292e;
                iD0 = d0(bVar.f121299a + 4 + bVar.f121300b);
            }
            b bVar2 = new b(iD0, i11);
            g0(this.f121293f, 0, i11);
            R(bVar2.f121299a, this.f121293f, 0, 4);
            R(bVar2.f121299a + 4, bArr, i10, i11);
            f0(this.f121289b, this.f121290c + 1, zM ? bVar2.f121299a : this.f121291d.f121299a, bVar2.f121299a);
            this.f121292e = bVar2;
            this.f121290c++;
            if (zM) {
                this.f121291d = bVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int X() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f121290c;
    }

    public int Y() {
        if (this.f121290c == 0) {
            return 16;
        }
        b bVar = this.f121292e;
        int i10 = bVar.f121299a;
        int i11 = this.f121291d.f121299a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f121300b + 16 : (((i10 + 4) + bVar.f121300b) + this.f121289b) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            this.f121288a.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void e(byte[] bArr) throws IOException {
        P0(bArr, 0, bArr.length);
    }

    public synchronized void f() throws IOException {
        try {
            f0(4096, 0, 0, 0);
            this.f121290c = 0;
            b bVar = b.f121298d;
            this.f121291d = bVar;
            this.f121292e = bVar;
            if (this.f121289b > 4096) {
                T(4096);
            }
            this.f121289b = 4096;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(d dVar) throws IOException {
        try {
            int iD0 = this.f121291d.f121299a;
            for (int i10 = 0; i10 < this.f121290c; i10++) {
                b bVarX = x(iD0);
                dVar.a(new c(this, bVarX, null), bVarX.f121300b);
                iD0 = d0(bVarX.f121299a + 4 + bVarX.f121300b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean j(int i10, int i11) {
        return (Y() + 4) + i10 <= i11;
    }

    public synchronized boolean m() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f121290c == 0;
    }

    public synchronized void r(d dVar) throws IOException {
        if (this.f121290c > 0) {
            dVar.a(new c(this, this.f121291d, null), this.f121291d.f121300b);
        }
    }

    public synchronized byte[] t() throws IOException {
        if (m()) {
            return null;
        }
        b bVar = this.f121291d;
        int i10 = bVar.f121300b;
        byte[] bArr = new byte[i10];
        N(bVar.f121299a + 4, bArr, 0, i10);
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append("fileLength=");
        sb2.append(this.f121289b);
        sb2.append(", size=");
        sb2.append(this.f121290c);
        sb2.append(", first=");
        sb2.append(this.f121291d);
        sb2.append(", last=");
        sb2.append(this.f121292e);
        sb2.append(", element lengths=[");
        try {
            h(new a(sb2));
        } catch (IOException e10) {
            f121285g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    h(RandomAccessFile randomAccessFile) throws IOException {
        this.f121293f = new byte[16];
        this.f121288a = randomAccessFile;
        y();
    }
}
