package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.w0;
import com.rabbitmq.client.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.e2;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.d
@w0(19)
@b1({b1.a.LIBRARY})
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f51276a = 1164798569;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f51277b = 1701669481;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f51278c = 1835365473;

    private static class a implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final ByteBuffer f51279c;

        a(@NonNull ByteBuffer byteBuffer) {
            this.f51279c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.o.d
        public void b(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f51279c;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.o.d
        public int c() throws IOException {
            return this.f51279c.getInt();
        }

        @Override // androidx.emoji2.text.o.d
        public long d() throws IOException {
            return o.e(this.f51279c.getInt());
        }

        @Override // androidx.emoji2.text.o.d
        public long getPosition() {
            return this.f51279c.position();
        }

        @Override // androidx.emoji2.text.o.d
        public int readUnsignedShort() throws IOException {
            return o.f(this.f51279c.getShort());
        }
    }

    private static class b implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        private final byte[] f51280c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final ByteBuffer f51281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        private final InputStream f51282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f51283f = 0;

        b(@NonNull InputStream inputStream) {
            this.f51282e = inputStream;
            byte[] bArr = new byte[4];
            this.f51280c = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f51281d = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void a(@g0(from = 0, to = 4) int i10) throws IOException {
            if (this.f51282e.read(this.f51280c, 0, i10) != i10) {
                throw new IOException("read failed");
            }
            this.f51283f += (long) i10;
        }

        @Override // androidx.emoji2.text.o.d
        public void b(int i10) throws IOException {
            while (i10 > 0) {
                int iSkip = (int) this.f51282e.skip(i10);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i10 -= iSkip;
                this.f51283f += (long) iSkip;
            }
        }

        @Override // androidx.emoji2.text.o.d
        public int c() throws IOException {
            this.f51281d.position(0);
            a(4);
            return this.f51281d.getInt();
        }

        @Override // androidx.emoji2.text.o.d
        public long d() throws IOException {
            this.f51281d.position(0);
            a(4);
            return o.e(this.f51281d.getInt());
        }

        @Override // androidx.emoji2.text.o.d
        public long getPosition() {
            return this.f51283f;
        }

        @Override // androidx.emoji2.text.o.d
        public int readUnsignedShort() throws IOException {
            this.f51281d.position(0);
            a(2);
            return o.f(this.f51281d.getShort());
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f51284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f51285b;

        c(long j10, long j11) {
            this.f51284a = j10;
            this.f51285b = j11;
        }

        long a() {
            return this.f51285b;
        }

        long b() {
            return this.f51284a;
        }
    }

    private interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f51286a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f51287b = 4;

        void b(int i10) throws IOException;

        int c() throws IOException;

        long d() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private o() {
    }

    private static c a(d dVar) throws IOException {
        long jD;
        dVar.b(4);
        int unsignedShort = dVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        int i10 = 3 & 6;
        dVar.b(6);
        int i11 = 0;
        while (true) {
            if (i11 >= unsignedShort) {
                jD = -1;
                break;
            }
            int iC = dVar.c();
            dVar.b(4);
            jD = dVar.d();
            dVar.b(4);
            if (1835365473 == iC) {
                break;
            }
            i11++;
        }
        if (jD != -1) {
            dVar.b((int) (jD - dVar.getPosition()));
            dVar.b(12);
            long jD2 = dVar.d();
            for (int i12 = 0; i12 < jD2; i12++) {
                int iC2 = dVar.c();
                long jD3 = dVar.d();
                long jD4 = dVar.d();
                if (f51276a == iC2 || f51277b == iC2) {
                    return new c(jD3 + jD, jD4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static androidx.emoji2.text.flatbuffer.p b(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            androidx.emoji2.text.flatbuffer.p pVarC = c(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return pVarC;
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    static androidx.emoji2.text.flatbuffer.p c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c cVarA = a(bVar);
        bVar.b((int) (cVarA.b() - bVar.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) cVarA.a());
        int i10 = inputStream.read(byteBufferAllocate.array());
        if (i10 == cVarA.a()) {
            return androidx.emoji2.text.flatbuffer.p.G(byteBufferAllocate);
        }
        throw new IOException("Needed " + cVarA.a() + " bytes, got " + i10);
    }

    static androidx.emoji2.text.flatbuffer.p d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).b());
        return androidx.emoji2.text.flatbuffer.p.G(byteBufferDuplicate);
    }

    static long e(int i10) {
        return ((long) i10) & k0.f265952a;
    }

    static int f(short s10) {
        return s10 & e2.f312492d;
    }
}
