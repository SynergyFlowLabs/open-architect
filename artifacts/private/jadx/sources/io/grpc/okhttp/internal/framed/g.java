package io.grpc.okhttp.internal.framed;

import androidx.collection.g3;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.b1;
import okio.e1;
import okio.l;
import okio.m;
import okio.n;
import okio.o;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f290545a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f290546b = o.x("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f290547c = 16384;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte f290548d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte f290549e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte f290550f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte f290551g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte f290552h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final byte f290553i = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final byte f290554j = 6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final byte f290555k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final byte f290556l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final byte f290557m = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte f290558n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final byte f290559o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final byte f290560p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final byte f290561q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final byte f290562r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final byte f290563s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final byte f290564t = 32;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final byte f290565u = 32;

    static final class a implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f290566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f290567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        byte f290568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f290569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f290570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        short f290571f;

        public a(n nVar) {
            this.f290566a = nVar;
        }

        private void a() throws IOException {
            int i10 = this.f290569d;
            int iM = g.m(this.f290566a);
            this.f290570e = iM;
            this.f290567b = iM;
            byte b10 = (byte) (this.f290566a.readByte() & 255);
            this.f290568c = (byte) (this.f290566a.readByte() & 255);
            if (g.f290545a.isLoggable(Level.FINE)) {
                g.f290545a.fine(b.b(true, this.f290569d, this.f290567b, b10, this.f290568c));
            }
            int i11 = this.f290566a.readInt() & Integer.MAX_VALUE;
            this.f290569d = i11;
            if (b10 != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(b10));
            }
            if (i11 != i10) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.b1
        public long read(l lVar, long j10) throws IOException {
            while (true) {
                int i10 = this.f290570e;
                if (i10 != 0) {
                    long j11 = this.f290566a.read(lVar, Math.min(j10, i10));
                    if (j11 == -1) {
                        return -1L;
                    }
                    this.f290570e -= (int) j11;
                    return j11;
                }
                this.f290566a.skip(this.f290571f);
                this.f290571f = (short) 0;
                if ((this.f290568c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        @Override // okio.b1
        public e1 timeout() {
            return this.f290566a.timeout();
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f290572a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f290573b = new String[64];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f290574c = new String[256];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f290574c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', org.locationtech.jts.geom.l.f338160j);
                i11++;
            }
            String[] strArr2 = f290573b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i12 = iArr[0];
            strArr2[i12 | 8] = strArr2[i12] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = iArr2[i13];
                int i15 = iArr[0];
                String[] strArr3 = f290573b;
                int i16 = i15 | i14;
                strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
                strArr3[i16 | 8] = strArr3[i15] + '|' + strArr3[i14] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f290573b;
                if (i10 >= strArr4.length) {
                    return;
                }
                if (strArr4[i10] == null) {
                    strArr4[i10] = f290574c[i10];
                }
                i10++;
            }
        }

        b() {
        }

        static String a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    return b11 == 1 ? "ACK" : f290574c[b11];
                }
                if (b10 != 7 && b10 != 8) {
                    String[] strArr = f290573b;
                    String str = b11 < strArr.length ? strArr[b11] : f290574c[b11];
                    if (b10 != 5 || (b11 & 4) == 0) {
                        return (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f290574c[b11];
        }

        static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f290572a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b10 < strArr.length ? strArr[b10] : String.format("0x%02x", Byte.valueOf(b10)), a(b10, b11));
        }
    }

    static final class c implements io.grpc.okhttp.internal.framed.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f290575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f290576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f290577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final f.a f290578d;

        c(n nVar, int i10, boolean z10) {
            this.f290575a = nVar;
            this.f290577c = z10;
            a aVar = new a(nVar);
            this.f290576b = aVar;
            this.f290578d = new f.a(i10, aVar);
        }

        private void a(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 32) != 0) {
                throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s10 = (b10 & 8) != 0 ? (short) (this.f290575a.readByte() & 255) : (short) 0;
            aVar.P1(z10, i11, this.f290575a, g.l(i10, b10, s10), i10);
            this.f290575a.skip(s10);
        }

        private void b(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i12 = this.f290575a.readInt();
            int i13 = this.f290575a.readInt();
            int i14 = i10 - 8;
            io.grpc.okhttp.internal.framed.a aVarB = io.grpc.okhttp.internal.framed.a.b(i13);
            if (aVarB == null) {
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i13));
            }
            o oVarE5 = o.f335048f;
            if (i14 > 0) {
                oVarE5 = this.f290575a.E5(i14);
            }
            aVar.Q1(i12, aVarB, oVarE5);
        }

        private List<io.grpc.okhttp.internal.framed.d> c(int i10, short s10, byte b10, int i11) throws IOException {
            a aVar = this.f290576b;
            aVar.f290570e = i10;
            aVar.f290567b = i10;
            aVar.f290571f = s10;
            aVar.f290568c = b10;
            aVar.f290569d = i11;
            this.f290578d.m();
            return this.f290578d.e();
        }

        private void d(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z10 = (b10 & 1) != 0;
            short s10 = (b10 & 8) != 0 ? (short) (this.f290575a.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                f(aVar, i11);
                i10 -= 5;
            }
            aVar.N1(false, z10, i11, -1, c(g.l(i10, b10, s10), s10, b10, i11), e.HTTP_20_HEADERS);
        }

        private void e(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.W((b10 & 1) != 0, this.f290575a.readInt(), this.f290575a.readInt());
        }

        private void f(io.grpc.okhttp.internal.framed.b.a aVar, int i10) throws IOException {
            int i11 = this.f290575a.readInt();
            aVar.f0(i10, i11 & Integer.MAX_VALUE, (this.f290575a.readByte() & 255) + 1, (Integer.MIN_VALUE & i11) != 0);
        }

        private void g(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            f(aVar, i11);
        }

        private void h(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s10 = (b10 & 8) != 0 ? (short) (this.f290575a.readByte() & 255) : (short) 0;
            aVar.Q(i11, this.f290575a.readInt() & Integer.MAX_VALUE, c(g.l(i10 - 4, b10, s10), s10, b10, i11));
        }

        private void j(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i12 = this.f290575a.readInt();
            io.grpc.okhttp.internal.framed.a aVarB = io.grpc.okhttp.internal.framed.a.b(i12);
            if (aVarB == null) {
                throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i12));
            }
            aVar.M1(i11, aVarB);
        }

        private void l(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.e0();
                return;
            }
            if (i10 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
            i iVar = new i();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short s10 = this.f290575a.readShort();
                int i13 = this.f290575a.readInt();
                switch (s10) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (i13 != 0 && i13 != 1) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    case 3:
                        s10 = 4;
                        break;
                    case 4:
                        if (i13 < 0) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s10 = 7;
                        break;
                        break;
                    case 5:
                        if (i13 < 16384 || i13 > 16777215) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i13));
                        }
                        break;
                        break;
                    default:
                        continue;
                        break;
                }
                iVar.u(s10, 0, i13);
            }
            aVar.O1(false, iVar);
            if (iVar.i() >= 0) {
                this.f290578d.g(iVar.i());
            }
        }

        private void m(io.grpc.okhttp.internal.framed.b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 4) {
                throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
            long j10 = ((long) this.f290575a.readInt()) & g3.f12256c;
            if (j10 == 0) {
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.c0(i11, j10);
        }

        @Override // io.grpc.okhttp.internal.framed.b
        public void Y3() throws IOException {
            if (!this.f290577c) {
                o oVarE5 = this.f290575a.E5(g.f290546b.v0());
                if (g.f290545a.isLoggable(Level.FINE)) {
                    g.f290545a.fine(String.format("<< CONNECTION %s", oVarE5.N()));
                }
                if (!g.f290546b.equals(oVarE5)) {
                    throw g.k("Expected a connection header but was %s", oVarE5.G0());
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f290575a.close();
        }

        @Override // io.grpc.okhttp.internal.framed.b
        public boolean x9(io.grpc.okhttp.internal.framed.b.a aVar) throws IOException {
            try {
                this.f290575a.q1(9L);
                int iM = g.m(this.f290575a);
                if (iM < 0 || iM > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM));
                }
                byte b10 = (byte) (this.f290575a.readByte() & 255);
                byte b11 = (byte) (this.f290575a.readByte() & 255);
                int i10 = this.f290575a.readInt() & Integer.MAX_VALUE;
                int i11 = 1 << 1;
                if (g.f290545a.isLoggable(Level.FINE)) {
                    g.f290545a.fine(b.b(true, i10, iM, b10, b11));
                }
                switch (b10) {
                    case 0:
                        a(aVar, iM, b11, i10);
                        break;
                    case 1:
                        d(aVar, iM, b11, i10);
                        break;
                    case 2:
                        g(aVar, iM, b11, i10);
                        break;
                    case 3:
                        j(aVar, iM, b11, i10);
                        break;
                    case 4:
                        l(aVar, iM, b11, i10);
                        break;
                    case 5:
                        h(aVar, iM, b11, i10);
                        break;
                    case 6:
                        e(aVar, iM, b11, i10);
                        break;
                    case 7:
                        b(aVar, iM, b11, i10);
                        break;
                    case 8:
                        m(aVar, iM, b11, i10);
                        break;
                    default:
                        this.f290575a.skip(iM);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    static final class d implements io.grpc.okhttp.internal.framed.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f290579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f290580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l f290581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f.b f290582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f290583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f290584f;

        d(m mVar, boolean z10) {
            this.f290579a = mVar;
            this.f290580b = z10;
            l lVar = new l();
            this.f290581c = lVar;
            this.f290582d = new f.b(lVar);
            this.f290583e = 16384;
        }

        private void d(int i10, long j10) throws IOException {
            while (j10 > 0) {
                int iMin = (int) Math.min(this.f290583e, j10);
                long j11 = iMin;
                j10 -= j11;
                b(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f290579a.Ga(this.f290581c, j11);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void A2() throws IOException {
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                if (this.f290580b) {
                    if (g.f290545a.isLoggable(Level.FINE)) {
                        g.f290545a.fine(String.format(">> CONNECTION %s", g.f290546b.N()));
                    }
                    this.f290579a.write(g.f290546b.F0());
                    this.f290579a.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void C8(boolean z10, int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            if (this.f290584f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            c(z10, i10, list);
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void Da(i iVar) throws IOException {
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                this.f290583e = iVar.l(this.f290583e);
                int i10 = 2 & 1;
                b(0, 0, (byte) 4, (byte) 1);
                this.f290579a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void F9(boolean z10, int i10, l lVar, int i11) throws IOException {
            if (this.f290584f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            a(i10, z10 ? (byte) 1 : (byte) 0, lVar, i11);
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void M1(int i10, io.grpc.okhttp.internal.framed.a aVar) throws IOException {
            if (this.f290584f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (aVar.f290500a == -1) {
                throw new IllegalArgumentException();
            }
            b(i10, 4, (byte) 3, (byte) 0);
            this.f290579a.writeInt(aVar.f290500a);
            this.f290579a.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void Q(int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                this.f290582d.h(list);
                long size = this.f290581c.size();
                int iMin = (int) Math.min(this.f290583e - 4, size);
                long j10 = iMin;
                b(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
                this.f290579a.writeInt(i11 & Integer.MAX_VALUE);
                this.f290579a.Ga(this.f290581c, j10);
                if (size > j10) {
                    d(i10, size - j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void Q3(i iVar) throws IOException {
            int i10;
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                int i11 = 0;
                b(0, iVar.v() * 6, (byte) 4, (byte) 0);
                while (i11 < 10) {
                    if (iVar.r(i11)) {
                        if (i11 == 4) {
                            i10 = 3;
                        } else {
                            i10 = i11 == 7 ? 4 : i11;
                        }
                        this.f290579a.writeShort(i10);
                        this.f290579a.writeInt(iVar.c(i11));
                    }
                    i11++;
                }
                this.f290579a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public int Tb() {
            return this.f290583e;
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void U1(int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                c(false, i10, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void W(boolean z10, int i10, int i11) throws IOException {
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                b(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
                this.f290579a.writeInt(i10);
                this.f290579a.writeInt(i11);
                this.f290579a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        void a(int i10, byte b10, l lVar, int i11) throws IOException {
            b(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f290579a.Ga(lVar, i11);
            }
        }

        void b(int i10, int i11, byte b10, byte b11) throws IOException {
            if (g.f290545a.isLoggable(Level.FINE)) {
                g.f290545a.fine(b.b(false, i10, i11, b10, b11));
            }
            int i12 = this.f290583e;
            if (i11 > i12) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw g.j("reserved bit set: %s", Integer.valueOf(i10));
            }
            g.n(this.f290579a, i11);
            this.f290579a.writeByte(b10 & 255);
            this.f290579a.writeByte(b11 & 255);
            this.f290579a.writeInt(i10 & Integer.MAX_VALUE);
        }

        void c(boolean z10, int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            if (this.f290584f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.f290582d.h(list);
            long size = this.f290581c.size();
            int iMin = (int) Math.min(this.f290583e, size);
            long j10 = iMin;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            b(i10, iMin, (byte) 1, b10);
            this.f290579a.Ga(this.f290581c, j10);
            if (size > j10) {
                d(i10, size - j10);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void c0(int i10, long j10) throws IOException {
            if (this.f290584f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (j10 == 0 || j10 > g3.f12256c) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            }
            b(i10, 4, (byte) 8, (byte) 0);
            this.f290579a.writeInt((int) j10);
            this.f290579a.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            try {
                this.f290584f = true;
                this.f290579a.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void df(boolean z10, boolean z11, int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
            try {
                if (z11) {
                    throw new UnsupportedOperationException();
                }
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                c(z10, i10, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void flush() throws IOException {
            if (this.f290584f) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            this.f290579a.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.c
        public synchronized void tf(int i10, io.grpc.okhttp.internal.framed.a aVar, byte[] bArr) throws IOException {
            try {
                if (this.f290584f) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                if (aVar.f290500a == -1) {
                    throw g.j("errorCode.httpCode == -1", new Object[0]);
                }
                b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f290579a.writeInt(i10);
                this.f290579a.writeInt(aVar.f290500a);
                if (bArr.length > 0) {
                    this.f290579a.write(bArr);
                }
                this.f290579a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z7.h
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @z7.h
    public static IOException k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(n nVar) throws IOException {
        return (nVar.readByte() & 255) | ((nVar.readByte() & 255) << 16) | ((nVar.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(m mVar, int i10) throws IOException {
        mVar.writeByte((i10 >>> 16) & 255);
        mVar.writeByte((i10 >>> 8) & 255);
        mVar.writeByte(i10 & 255);
    }

    @Override // io.grpc.okhttp.internal.framed.j
    public io.grpc.okhttp.internal.framed.b a(n nVar, boolean z10) {
        return new c(nVar, 4096, z10);
    }

    @Override // io.grpc.okhttp.internal.framed.j
    public io.grpc.okhttp.internal.framed.c b(m mVar, boolean z10) {
        return new d(mVar, z10);
    }

    @Override // io.grpc.okhttp.internal.framed.j
    public io.grpc.okhttp.internal.i getProtocol() {
        return io.grpc.okhttp.internal.i.HTTP_2;
    }
}
