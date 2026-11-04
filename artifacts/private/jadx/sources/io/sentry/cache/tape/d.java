package io.sentry.cache.tape;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d implements Closeable, Iterable<byte[]> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f305225m = -2147483647;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f305226n = 4096;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f305227o = new byte[4096];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RandomAccessFile f305228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f305229b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f305231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f305232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b f305233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f305234g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f305237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f305238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f305239l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f305230c = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f305235h = new byte[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f305236i = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f305240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f305241b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f305242c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f305240a = file;
        }

        public d a() throws IOException {
            RandomAccessFile randomAccessFileT = d.t(this.f305240a);
            try {
                return new d(this.f305240a, randomAccessFileT, this.f305241b, this.f305242c);
            } catch (Throwable th2) {
                randomAccessFileT.close();
                throw th2;
            }
        }

        public a b(int i10) {
            this.f305242c = i10;
            return this;
        }

        public a c(boolean z10) {
            this.f305241b = z10;
            return this;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f305243c = new b(0, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f305244d = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f305245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f305246b;

        b(long j10, int i10) {
            this.f305245a = j10;
            this.f305246b = i10;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f305245a + ", length=" + this.f305246b + "]";
        }
    }

    private final class c implements Iterator<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f305247a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f305248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f305249c;

        c() {
            this.f305248b = d.this.f305233f.f305245a;
            this.f305249c = d.this.f305236i;
        }

        private void b() {
            if (d.this.f305236i != this.f305249c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f305239l) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            b();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f305247a;
            d dVar = d.this;
            if (i10 >= dVar.f305232e) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b bVarY = dVar.Y(this.f305248b);
                    byte[] bArr = new byte[bVarY.f305246b];
                    long jP2 = d.this.p2(bVarY.f305245a + 4);
                    this.f305248b = jP2;
                    if (!d.this.b2(jP2, bArr, 0, bVarY.f305246b)) {
                        this.f305247a = d.this.f305232e;
                        return d.f305227o;
                    }
                    this.f305248b = d.this.p2(bVarY.f305245a + 4 + ((long) bVarY.f305246b));
                    this.f305247a++;
                    return bArr;
                } catch (IOException e10) {
                    throw ((Error) d.r(e10));
                }
            } catch (IOException e11) {
                throw ((Error) d.r(e11));
            } catch (OutOfMemoryError unused) {
                d.this.O1();
                this.f305247a = d.this.f305232e;
                return d.f305227o;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f305239l) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            b();
            return this.f305247a != d.this.f305232e;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f305247a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.u1();
                this.f305249c = d.this.f305236i;
                this.f305247a--;
            } catch (IOException e10) {
                throw ((Error) d.r(e10));
            }
        }
    }

    d(File file, RandomAccessFile randomAccessFile, boolean z10, int i10) throws IOException {
        this.f305229b = file;
        this.f305228a = randomAccessFile;
        this.f305237j = z10;
        this.f305238k = i10;
        H0();
    }

    private void H0() throws IOException {
        this.f305228a.seek(0L);
        this.f305228a.readFully(this.f305235h);
        this.f305231d = d1(this.f305235h, 4);
        this.f305232e = O0(this.f305235h, 12);
        long jD1 = d1(this.f305235h, 16);
        long jD2 = d1(this.f305235h, 24);
        if (this.f305231d > this.f305228a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f305231d + ", Actual length: " + this.f305228a.length());
        }
        if (this.f305231d > 32) {
            this.f305233f = Y(jD1);
            this.f305234g = Y(jD2);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f305231d + ") is invalid.");
        }
    }

    private static int O0(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1() throws IOException {
        this.f305228a.close();
        this.f305229b.delete();
        this.f305228a = t(this.f305229b);
        H0();
    }

    private static RandomAccessFile R(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private void T1(long j10, long j11) throws IOException {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = f305227o;
            int iMin = (int) Math.min(j11, bArr.length);
            d dVar = this;
            dVar.e2(j12, bArr, 0, iMin);
            long j13 = iMin;
            j11 -= j13;
            j12 += j13;
            this = dVar;
        }
    }

    private static long d1(byte[] bArr, int i10) {
        return ((((long) bArr[i10]) & 255) << 56) + ((((long) bArr[i10 + 1]) & 255) << 48) + ((((long) bArr[i10 + 2]) & 255) << 40) + ((((long) bArr[i10 + 3]) & 255) << 32) + ((((long) bArr[i10 + 4]) & 255) << 24) + ((((long) bArr[i10 + 5]) & 255) << 16) + ((((long) bArr[i10 + 6]) & 255) << 8) + (((long) bArr[i10 + 7]) & 255);
    }

    private void e2(long j10, byte[] bArr, int i10, int i11) throws IOException {
        long jP2 = p2(j10);
        long j11 = ((long) i11) + jP2;
        long j12 = this.f305231d;
        if (j11 <= j12) {
            this.f305228a.seek(jP2);
            this.f305228a.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - jP2);
        this.f305228a.seek(jP2);
        this.f305228a.write(bArr, i10, i12);
        this.f305228a.seek(32L);
        this.f305228a.write(bArr, i10 + i12, i11 - i12);
    }

    private void f2(long j10) throws IOException {
        this.f305228a.setLength(j10);
        this.f305228a.getChannel().force(true);
    }

    private void l(long j10) throws IOException {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long jO1 = o1();
        if (jO1 >= j13) {
            return;
        }
        long j14 = this.f305231d;
        do {
            jO1 += j14;
            j14 <<= 1;
        } while (jO1 < j13);
        f2(j14);
        b bVar = this.f305234g;
        long jP2 = p2(bVar.f305245a + 4 + ((long) bVar.f305246b));
        if (jP2 <= this.f305233f.f305245a) {
            FileChannel channel = this.f305228a.getChannel();
            channel.position(this.f305231d);
            j11 = jP2 - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.f305234g.f305245a;
        long j16 = this.f305233f.f305245a;
        if (j15 < j16) {
            long j17 = (this.f305231d + j15) - 32;
            q2(j14, this.f305232e, j16, j17);
            this.f305234g = new b(j17, this.f305234g.f305246b);
            j12 = j14;
        } else {
            q2(j14, this.f305232e, j16, j15);
            j12 = j14;
        }
        this.f305231d = j12;
        if (this.f305237j) {
            T1(32L, j11);
        }
    }

    private long n2() {
        if (this.f305232e == 0) {
            return 32L;
        }
        b bVar = this.f305234g;
        long j10 = bVar.f305245a;
        long j11 = this.f305233f.f305245a;
        return j10 >= j11 ? (j10 - j11) + 4 + ((long) bVar.f305246b) + 32 : (((j10 + 4) + ((long) bVar.f305246b)) + this.f305231d) - j11;
    }

    private long o1() {
        return this.f305231d - n2();
    }

    private void q2(long j10, int i10, long j11, long j12) throws IOException {
        this.f305228a.seek(0L);
        int i11 = 2 | 0;
        s2(this.f305235h, 0, -2147483647);
        u2(this.f305235h, 4, j10);
        s2(this.f305235h, 12, i10);
        u2(this.f305235h, 16, j11);
        u2(this.f305235h, 24, j12);
        this.f305228a.write(this.f305235h, 0, 32);
    }

    static <T extends Throwable> T r(Throwable th2) throws Throwable {
        throw th2;
    }

    private static void s2(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    static RandomAccessFile t(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileR = R(file2);
            try {
                randomAccessFileR.setLength(PlaybackStateCompat.H1);
                randomAccessFileR.seek(0L);
                randomAccessFileR.writeInt(-2147483647);
                randomAccessFileR.writeLong(PlaybackStateCompat.H1);
                randomAccessFileR.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFileR.close();
                throw th2;
            }
        }
        return R(file);
    }

    private static void u2(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    public void B1(int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f305232e) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.f305232e) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.f305232e + ").");
        }
        b bVar = this.f305233f;
        long j10 = bVar.f305245a;
        int iO0 = bVar.f305246b;
        long j11 = 0;
        int i11 = 0;
        long j12 = j10;
        while (i11 < i10) {
            j11 += (long) (iO0 + 4);
            long jP2 = p2(j12 + 4 + ((long) iO0));
            if (!b2(jP2, this.f305235h, 0, 4)) {
                return;
            }
            iO0 = O0(this.f305235h, 0);
            i11++;
            j12 = jP2;
        }
        q2(this.f305231d, this.f305232e - i10, j12, this.f305234g.f305245a);
        this.f305232e -= i10;
        this.f305236i++;
        this.f305233f = new b(j12, iO0);
        if (this.f305237j) {
            T1(j10, j11);
        }
    }

    public boolean N() {
        if (this.f305238k != -1 && size() == this.f305238k) {
            return true;
        }
        return false;
    }

    public void P0(byte[] bArr, int i10, int i11) throws IOException {
        long jP2;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f305239l) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (N()) {
            u1();
        }
        l(i11);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jP2 = 32;
        } else {
            b bVar = this.f305234g;
            jP2 = p2(bVar.f305245a + 4 + ((long) bVar.f305246b));
        }
        b bVar2 = new b(jP2, i11);
        s2(this.f305235h, 0, i11);
        e2(bVar2.f305245a, this.f305235h, 0, 4);
        e2(bVar2.f305245a + 4, bArr, i10, i11);
        q2(this.f305231d, this.f305232e + 1, zIsEmpty ? bVar2.f305245a : this.f305233f.f305245a, bVar2.f305245a);
        this.f305234g = bVar2;
        this.f305232e++;
        this.f305236i++;
        if (zIsEmpty) {
            this.f305233f = bVar2;
        }
    }

    @Nullable
    public byte[] T() throws IOException {
        if (this.f305239l) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (isEmpty()) {
            return null;
        }
        b bVar = this.f305233f;
        int i10 = bVar.f305246b;
        byte[] bArr = new byte[i10];
        if (b2(bVar.f305245a + 4, bArr, 0, i10)) {
            return bArr;
        }
        return null;
    }

    b Y(long j10) throws IOException {
        if (j10 != 0 && b2(j10, this.f305235h, 0, 4)) {
            return new b(j10, O0(this.f305235h, 0));
        }
        return b.f305243c;
    }

    boolean b2(long j10, byte[] bArr, int i10, int i11) throws IOException {
        try {
            long jP2 = p2(j10);
            long j11 = ((long) i11) + jP2;
            long j12 = this.f305231d;
            if (j11 <= j12) {
                this.f305228a.seek(jP2);
                this.f305228a.readFully(bArr, i10, i11);
            } else {
                int i12 = (int) (j12 - jP2);
                this.f305228a.seek(jP2);
                this.f305228a.readFully(bArr, i10, i12);
                this.f305228a.seek(32L);
                this.f305228a.readFully(bArr, i10 + i12, i11 - i12);
            }
            return true;
        } catch (EOFException unused) {
            O1();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            O1();
            return false;
        }
    }

    public void clear() throws IOException {
        if (this.f305239l) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        q2(PlaybackStateCompat.H1, 0, 0L, 0L);
        int i10 = 3 & 0;
        if (this.f305237j) {
            this.f305228a.seek(32L);
            this.f305228a.write(f305227o, 0, 4064);
        }
        this.f305232e = 0;
        b bVar = b.f305243c;
        this.f305233f = bVar;
        this.f305234g = bVar;
        if (this.f305231d > PlaybackStateCompat.H1) {
            f2(PlaybackStateCompat.H1);
        }
        this.f305231d = PlaybackStateCompat.H1;
        this.f305236i++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f305239l = true;
        this.f305228a.close();
    }

    public boolean isEmpty() {
        return this.f305232e == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new c();
    }

    public File m() {
        return this.f305229b;
    }

    long p2(long j10) {
        long j11 = this.f305231d;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public int size() {
        return this.f305232e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f305229b + ", zero=" + this.f305237j + ", length=" + this.f305231d + ", size=" + this.f305232e + ", first=" + this.f305233f + ", last=" + this.f305234g + AbstractJsonLexerKt.END_OBJ;
    }

    public void u1() throws IOException {
        B1(1);
    }

    public void x(byte[] bArr) throws IOException {
        P0(bArr, 0, bArr.length);
    }
}
