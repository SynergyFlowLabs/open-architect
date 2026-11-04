package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.collection.g3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f97456a = 16384;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f97457b = new AtomicReference<>();

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f97461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f97462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f97463c;

        b(@NonNull byte[] bArr, int i10, int i11) {
            this.f97463c = bArr;
            this.f97461a = i10;
            this.f97462b = i11;
        }
    }

    private a() {
    }

    @NonNull
    public static ByteBuffer a(@NonNull File file) throws Throwable {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > g3.f12256c) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static ByteBuffer b(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f97457b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i10 = inputStream.read(andSet);
            if (i10 < 0) {
                f97457b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(andSet, 0, i10);
        }
    }

    @p0
    private static b c(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    @NonNull
    public static byte[] d(@NonNull ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f97461a == 0 && bVarC.f97462b == bVarC.f97463c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static InputStream f(@NonNull ByteBuffer byteBuffer) {
        return new C0873a(byteBuffer);
    }

    public static void g(@NonNull ByteBuffer byteBuffer, @NonNull OutputStream outputStream) throws IOException {
        b bVarC = c(byteBuffer);
        if (bVarC != null) {
            byte[] bArr = bVarC.f97463c;
            int i10 = bVarC.f97461a;
            outputStream.write(bArr, i10, bVarC.f97462b + i10);
            return;
        }
        byte[] andSet = f97457b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int iMin = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, iMin);
            outputStream.write(andSet, 0, iMin);
        }
        f97457b.set(andSet);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.a$a, reason: collision with other inner class name */
    private static class C0873a extends InputStream {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f97458c = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final ByteBuffer f97459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f97460b = -1;

        C0873a(@NonNull ByteBuffer byteBuffer) {
            this.f97459a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f97459a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f97460b = this.f97459a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f97459a.hasRemaining()) {
                return this.f97459a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i10 = this.f97460b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f97459a.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            if (!this.f97459a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            ByteBuffer byteBuffer = this.f97459a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
            if (!this.f97459a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f97459a.get(bArr, i10, iMin);
            return iMin;
        }
    }
}
