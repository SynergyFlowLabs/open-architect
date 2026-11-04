package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.google.common.collect.z9;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class e0 extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set<FileDescriptor> f62476m = z9.p();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FileDescriptor f62477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f62478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f62479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private Uri f62480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private FileInputStream f62481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f62482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f62483l;

    public e0(FileDescriptor fileDescriptor, long j10, long j11) {
        super(false);
        this.f62477f = (FileDescriptor) androidx.media3.common.util.a.g(fileDescriptor);
        this.f62478g = j10;
        this.f62479h = j11;
    }

    private static void y(FileDescriptor fileDescriptor, long j10) throws u {
        try {
            Os.lseek(fileDescriptor, j10, OsConstants.SEEK_SET);
        } catch (ErrnoException e10) {
            throw new u(e10, 2000);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws u {
        try {
            this.f62480i = xVar.f62594a;
            w(xVar);
            if (!f62476m.add(this.f62477f)) {
                throw new u(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j10 = this.f62479h;
            if (j10 != -1 && xVar.f62600g > j10) {
                throw new u(2008);
            }
            y(this.f62477f, this.f62478g + xVar.f62600g);
            FileInputStream fileInputStream = new FileInputStream(this.f62477f);
            this.f62481j = fileInputStream;
            long j11 = this.f62479h;
            if (j11 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f62482k = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f62482k = jPosition;
                    if (jPosition < 0) {
                        throw new u(2008);
                    }
                }
            } else {
                long j12 = j11 - xVar.f62600g;
                this.f62482k = j12;
                if (j12 < 0) {
                    throw new u(2008);
                }
            }
            long jMin = xVar.f62601h;
            if (jMin != -1) {
                long j13 = this.f62482k;
                if (j13 != -1) {
                    jMin = Math.min(j13, jMin);
                }
                this.f62482k = jMin;
            }
            this.f62483l = true;
            x(xVar);
            long j14 = xVar.f62601h;
            return j14 != -1 ? j14 : this.f62482k;
        } catch (u e10) {
            throw e10;
        } catch (IOException e11) {
            throw new u(e11, e11 instanceof FileNotFoundException ? androidx.media3.common.x0.f61818h3 : 2000);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public void close() throws u {
        this.f62480i = null;
        f62476m.remove(this.f62477f);
        try {
            try {
                FileInputStream fileInputStream = this.f62481j;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f62481j = null;
                if (this.f62483l) {
                    this.f62483l = false;
                    v();
                }
            } catch (IOException e10) {
                throw new u(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f62481j = null;
            if (this.f62483l) {
                this.f62483l = false;
                v();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        return this.f62480i;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws u {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62482k;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            i11 = (int) Math.min(j10, i11);
        }
        try {
            int i12 = ((FileInputStream) androidx.media3.common.util.k1.o(this.f62481j)).read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            long j11 = this.f62482k;
            if (j11 != -1) {
                this.f62482k = j11 - ((long) i12);
            }
            u(i12);
            return i12;
        } catch (IOException e10) {
            throw new u(e10, 2000);
        }
    }
}
