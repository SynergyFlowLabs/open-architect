package com.google.protobuf;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@y
abstract class n extends t implements z4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f126084e = 4096;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f126085f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f126086g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f126087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayDeque<com.google.protobuf.d> f126089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f126090d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126091a;

        static {
            int[] iArr = new int[x4.b.values().length];
            f126091a = iArr;
            try {
                iArr[x4.b.f126489j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126091a[x4.b.f126488i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126091a[x4.b.f126487h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126091a[x4.b.f126486g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126091a[x4.b.f126484e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126091a[x4.b.f126496t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126091a[x4.b.f126497v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f126091a[x4.b.f126498w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f126091a[x4.b.X.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f126091a[x4.b.f126490k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f126091a[x4.b.f126494o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f126091a[x4.b.f126485f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f126091a[x4.b.f126483d.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f126091a[x4.b.f126482c.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f126091a[x4.b.f126492m.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f126091a[x4.b.f126493n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f126091a[x4.b.f126495s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class b extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteBuffer f126092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f126093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126094j;

        b(r alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            Z0();
        }

        private int Y0() {
            return this.f126093i - this.f126094j;
        }

        private void Z0() {
            b1(f0());
        }

        private void a1(int capacity) {
            b1(g0(capacity));
        }

        private void b1(com.google.protobuf.d allocatedBuffer) {
            if (!allocatedBuffer.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = allocatedBuffer.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f126089c.addFirst(allocatedBuffer);
            this.f126092h = byteBufferF;
            v1.c(byteBufferF, byteBufferF.capacity());
            v1.e(this.f126092h, 0);
            this.f126092h.order(ByteOrder.LITTLE_ENDIAN);
            int iLimit = this.f126092h.limit() - 1;
            this.f126093i = iLimit;
            this.f126094j = iLimit;
        }

        private int c1() {
            return this.f126094j + 1;
        }

        private void d1(int value) {
            ByteBuffer byteBuffer = this.f126092h;
            int i10 = this.f126094j;
            this.f126094j = i10 - 1;
            byteBuffer.put(i10, (byte) (value >>> 28));
            int i11 = this.f126094j;
            this.f126094j = i11 - 4;
            this.f126092h.putInt(i11 - 3, (value & 127) | 128 | ((((value >>> 21) & 127) | 128) << 24) | ((((value >>> 14) & 127) | 128) << 16) | ((((value >>> 7) & 127) | 128) << 8));
        }

        private void e1(int value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 4;
            this.f126092h.putInt(i10 - 3, (value & 127) | 128 | ((266338304 & value) << 3) | (((2080768 & value) | 2097152) << 2) | (((value & 16256) | 16384) << 1));
        }

        private void f1(int value) {
            ByteBuffer byteBuffer = this.f126092h;
            int i10 = this.f126094j;
            this.f126094j = i10 - 1;
            byteBuffer.put(i10, (byte) value);
        }

        private void g1(int value) {
            int i10 = this.f126094j - 3;
            this.f126094j = i10;
            this.f126092h.putInt(i10, (((value & 127) | 128) << 8) | ((2080768 & value) << 10) | (((value & 16256) | 16384) << 9));
        }

        private void h1(int value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 2;
            this.f126092h.putShort(i10 - 1, (short) ((value & 127) | 128 | ((value & 16256) << 1)));
        }

        private void i1(long value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 8;
            int i11 = 2 ^ 2;
            this.f126092h.putLong(i10 - 7, (value & 127) | 128 | ((71494644084506624L & value) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | PlaybackStateCompat.f9660n3) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void j1(long value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 8;
            this.f126092h.putLong(i10 - 7, (value & 127) | 128 | (((71494644084506624L & value) | 72057594037927936L) << 7) | (((558551906910208L & value) | 562949953421312L) << 6) | (((4363686772736L & value) | 4398046511104L) << 5) | (((34091302912L & value) | 34359738368L) << 4) | (((266338304 & value) | 268435456) << 3) | (((2080768 & value) | PlaybackStateCompat.f9660n3) << 2) | (((16256 & value) | 16384) << 1));
        }

        private void k1(long value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 5;
            this.f126092h.putLong(i10 - 7, (((value & 127) | 128) << 24) | ((34091302912L & value) << 28) | (((266338304 & value) | 268435456) << 27) | (((2080768 & value) | PlaybackStateCompat.f9660n3) << 26) | (((16256 & value) | 16384) << 25));
        }

        private void l1(long value) {
            e1((int) value);
        }

        private void m1(long value) {
            ByteBuffer byteBuffer = this.f126092h;
            int i10 = this.f126094j;
            this.f126094j = i10 - 1;
            byteBuffer.put(i10, (byte) (value >>> 56));
            j1(value & 72057594037927935L);
        }

        private void n1(long value) {
            f1((int) value);
        }

        private void o1(long value) {
            int i10 = this.f126094j - 7;
            this.f126094j = i10;
            this.f126092h.putLong(i10, (((value & 127) | 128) << 8) | ((558551906910208L & value) << 14) | (((4363686772736L & value) | 4398046511104L) << 13) | (((34091302912L & value) | 34359738368L) << 12) | (((266338304 & value) | 268435456) << 11) | (((2080768 & value) | PlaybackStateCompat.f9660n3) << 10) | (((16256 & value) | 16384) << 9));
        }

        private void p1(long value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 6;
            this.f126092h.putLong(i10 - 7, (((value & 127) | 128) << 16) | ((4363686772736L & value) << 21) | (((34091302912L & value) | 34359738368L) << 20) | (((266338304 & value) | 268435456) << 19) | (((2080768 & value) | PlaybackStateCompat.f9660n3) << 18) | (((16256 & value) | 16384) << 17));
        }

        private void q1(long value) {
            ByteBuffer byteBuffer = this.f126092h;
            int i10 = this.f126094j;
            this.f126094j = i10 - 1;
            byteBuffer.put(i10, (byte) (value >>> 63));
            ByteBuffer byteBuffer2 = this.f126092h;
            int i11 = this.f126094j;
            this.f126094j = i11 - 1;
            byteBuffer2.put(i11, (byte) (((value >>> 56) & 127) | 128));
            j1(value & 72057594037927935L);
        }

        private void r1(long value) {
            g1((int) value);
        }

        private void s1(long value) {
            h1((int) value);
        }

        @Override // com.google.protobuf.n
        void A0(long value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 8;
            this.f126092h.putLong(i10 - 7, value);
        }

        @Override // com.google.protobuf.z4
        public void E(int fieldNumber, Object value) throws IOException {
            int iC0 = c0();
            i3.a().k(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.n
        void F0(int value) {
            if (value >= 0) {
                W0(value);
            } else {
                X0(value);
            }
        }

        @Override // com.google.protobuf.z4
        @Deprecated
        public void I(int fieldNumber, Object value) throws IOException {
            R0(fieldNumber, 4);
            i3.a().k(value, this);
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void K0(int value) {
            W0(b0.c1(value));
        }

        @Override // com.google.protobuf.z4
        public void M(int fieldNumber, int value) {
            r0(10);
            K0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void N(int fieldNumber, u value) {
            try {
                value.K0(this);
                r0(10);
                W0(value.size());
                R0(fieldNumber, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // com.google.protobuf.n
        void N0(long value) {
            X0(b0.d1(value));
        }

        @Override // com.google.protobuf.z4
        public void Q(int fieldNumber, Object value, o3 schema) throws IOException {
            R0(fieldNumber, 4);
            schema.h(value, this);
            int i10 = 1 >> 3;
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void Q0(String in) {
            int i10;
            int i11;
            int i12;
            char cCharAt;
            r0(in.length());
            int length = in.length() - 1;
            this.f126094j -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.f126092h.put(this.f126094j + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f126094j--;
                return;
            }
            this.f126094j += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i12 = this.f126094j) >= 0) {
                    ByteBuffer byteBuffer = this.f126092h;
                    this.f126094j = i12 - 1;
                    byteBuffer.put(i12, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i11 = this.f126094j) > 0) {
                    ByteBuffer byteBuffer2 = this.f126092h;
                    this.f126094j = i11 - 1;
                    byteBuffer2.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f126092h;
                    int i13 = this.f126094j;
                    this.f126094j = i13 - 1;
                    byteBuffer3.put(i13, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i10 = this.f126094j) > 1) {
                    ByteBuffer byteBuffer4 = this.f126092h;
                    this.f126094j = i10 - 1;
                    byteBuffer4.put(i10, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f126092h;
                    int i14 = this.f126094j;
                    this.f126094j = i14 - 1;
                    byteBuffer5.put(i14, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f126092h;
                    int i15 = this.f126094j;
                    this.f126094j = i15 - 1;
                    byteBuffer6.put(i15, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.f126094j > 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.f126092h;
                                int i16 = this.f126094j;
                                this.f126094j = i16 - 1;
                                byteBuffer7.put(i16, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.f126092h;
                                int i17 = this.f126094j;
                                this.f126094j = i17 - 1;
                                byteBuffer8.put(i17, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.f126092h;
                                int i18 = this.f126094j;
                                this.f126094j = i18 - 1;
                                byteBuffer9.put(i18, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.f126092h;
                                int i19 = this.f126094j;
                                this.f126094j = i19 - 1;
                                byteBuffer10.put(i19, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new u4.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.n
        void R0(int fieldNumber, int wireType) {
            W0(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.z4
        public void S(int fieldNumber, Object value, o3 schema) throws IOException {
            int iC0 = c0();
            schema.h(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            int i10 = 6 & 2;
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.t
        public void T(byte value) {
            ByteBuffer byteBuffer = this.f126092h;
            int i10 = this.f126094j;
            this.f126094j = i10 - 1;
            byteBuffer.put(i10, value);
        }

        @Override // com.google.protobuf.t
        public void U(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (c1() < iRemaining) {
                a1(iRemaining);
            }
            int i10 = this.f126094j - iRemaining;
            this.f126094j = i10;
            v1.e(this.f126092h, i10 + 1);
            this.f126092h.put(value);
        }

        @Override // com.google.protobuf.t
        public void V(byte[] value, int offset, int length) {
            if (c1() < length) {
                a1(length);
            }
            int i10 = this.f126094j - length;
            this.f126094j = i10;
            v1.e(this.f126092h, i10 + 1);
            this.f126092h.put(value, offset, length);
        }

        @Override // com.google.protobuf.t
        public void W(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (c1() < iRemaining) {
                this.f126090d += iRemaining;
                this.f126089c.addFirst(com.google.protobuf.d.j(value));
                Z0();
            } else {
                int i10 = this.f126094j - iRemaining;
                this.f126094j = i10;
                v1.e(this.f126092h, i10 + 1);
                this.f126092h.put(value);
            }
        }

        @Override // com.google.protobuf.n
        void W0(int value) {
            if ((value & (-128)) == 0) {
                f1(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                h1(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                g1(value);
            } else if (((-268435456) & value) == 0) {
                e1(value);
            } else {
                d1(value);
            }
        }

        @Override // com.google.protobuf.t
        public void X(byte[] value, int offset, int length) {
            if (c1() < length) {
                this.f126090d += length;
                this.f126089c.addFirst(com.google.protobuf.d.l(value, offset, length));
                Z0();
            } else {
                int i10 = this.f126094j - length;
                this.f126094j = i10;
                v1.e(this.f126092h, i10 + 1);
                this.f126092h.put(value, offset, length);
            }
        }

        @Override // com.google.protobuf.n
        void X0(long value) {
            switch (n.a0(value)) {
                case 1:
                    n1(value);
                    break;
                case 2:
                    s1(value);
                    break;
                case 3:
                    r1(value);
                    break;
                case 4:
                    l1(value);
                    break;
                case 5:
                    k1(value);
                    break;
                case 6:
                    p1(value);
                    break;
                case 7:
                    o1(value);
                    break;
                case 8:
                    i1(value);
                    break;
                case 9:
                    m1(value);
                    break;
                case 10:
                    q1(value);
                    break;
            }
        }

        @Override // com.google.protobuf.n
        void b0() {
            if (this.f126092h != null) {
                this.f126090d += Y0();
                v1.e(this.f126092h, this.f126094j + 1);
                this.f126092h = null;
                this.f126094j = 0;
                this.f126093i = 0;
            }
        }

        @Override // com.google.protobuf.z4
        public void c(int fieldNumber, int value) {
            r0(9);
            x0(value);
            R0(fieldNumber, 5);
        }

        @Override // com.google.protobuf.n
        public int c0() {
            return this.f126090d + Y0();
        }

        @Override // com.google.protobuf.z4
        public void e(int fieldNumber, String value) {
            int iC0 = c0();
            Q0(value);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.z4
        public void f(int fieldNumber, long value) {
            r0(15);
            X0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void h(int fieldNumber, int value) {
            r0(15);
            F0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void k(int fieldNumber, long value) {
            r0(15);
            N0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void l(int fieldNumber, int value) {
            r0(10);
            W0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void n(int fieldNumber, long value) {
            r0(13);
            A0(value);
            R0(fieldNumber, 1);
        }

        @Override // com.google.protobuf.z4
        public void p(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // com.google.protobuf.z4
        @Deprecated
        public void r(int fieldNumber) {
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void r0(int size) {
            if (c1() < size) {
                a1(size);
            }
        }

        @Override // com.google.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.z4
        @Deprecated
        public void t(int fieldNumber) {
            R0(fieldNumber, 4);
        }

        @Override // com.google.protobuf.n
        void x0(int value) {
            int i10 = this.f126094j;
            this.f126094j = i10 - 4;
            this.f126092h.putInt(i10 - 3, value);
        }
    }

    private static final class c extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.protobuf.d f126095h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f126096i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f126097j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f126098k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f126099l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f126100m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f126101n;

        c(r alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            Z0();
        }

        private void Z0() {
            b1(j0());
        }

        private void a1(int capacity) {
            b1(k0(capacity));
        }

        private void b1(com.google.protobuf.d allocatedBuffer) {
            if (!allocatedBuffer.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f126089c.addFirst(allocatedBuffer);
            this.f126095h = allocatedBuffer;
            this.f126096i = allocatedBuffer.a();
            int iB = allocatedBuffer.b();
            this.f126098k = allocatedBuffer.e() + iB;
            int iG = iB + allocatedBuffer.g();
            this.f126097j = iG;
            this.f126099l = iG - 1;
            int i10 = this.f126098k - 1;
            this.f126100m = i10;
            this.f126101n = i10;
        }

        private void d1(int value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 28);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 21) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 14) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 5;
            bArr[i14] = (byte) ((value & 127) | 128);
        }

        private void e1(int value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 21);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 14) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 4;
            bArr[i13] = (byte) ((value & 127) | 128);
        }

        private void f1(int value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            this.f126101n = i10 - 1;
            bArr[i10] = (byte) value;
        }

        private void g1(int value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 14);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 3;
            bArr[i12] = (byte) ((value & 127) | 128);
        }

        private void h1(int value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 7);
            this.f126101n = i10 - 2;
            bArr[i11] = (byte) ((value & 127) | 128);
        }

        private void i1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 49);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 42) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 35) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 28) & 127) | 128);
            int i15 = i10 - 5;
            this.f126101n = i15;
            bArr[i14] = (byte) (((value >>> 21) & 127) | 128);
            int i16 = i10 - 6;
            this.f126101n = i16;
            bArr[i15] = (byte) (((value >>> 14) & 127) | 128);
            int i17 = i10 - 7;
            this.f126101n = i17;
            bArr[i16] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 8;
            bArr[i17] = (byte) ((value & 127) | 128);
        }

        private void j1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 28);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 21) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 14) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 5;
            bArr[i14] = (byte) ((value & 127) | 128);
        }

        private void k1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 21);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 14) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 4;
            bArr[i13] = (byte) ((value & 127) | 128);
        }

        private void l1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 56);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 49) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 42) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 35) & 127) | 128);
            int i15 = i10 - 5;
            this.f126101n = i15;
            bArr[i14] = (byte) (((value >>> 28) & 127) | 128);
            int i16 = i10 - 6;
            this.f126101n = i16;
            bArr[i15] = (byte) (((value >>> 21) & 127) | 128);
            int i17 = i10 - 7;
            this.f126101n = i17;
            bArr[i16] = (byte) (((value >>> 14) & 127) | 128);
            int i18 = i10 - 8;
            this.f126101n = i18;
            bArr[i17] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 9;
            bArr[i18] = (byte) ((value & 127) | 128);
        }

        private void m1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            this.f126101n = i10 - 1;
            bArr[i10] = (byte) value;
        }

        private void n1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 42);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 35) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 28) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 21) & 127) | 128);
            int i15 = i10 - 5;
            this.f126101n = i15;
            bArr[i14] = (byte) (((value >>> 14) & 127) | 128);
            int i16 = i10 - 6;
            this.f126101n = i16;
            bArr[i15] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 7;
            bArr[i16] = (byte) ((value & 127) | 128);
        }

        private void o1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 35);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 28) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 21) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 14) & 127) | 128);
            int i15 = i10 - 5;
            this.f126101n = i15;
            bArr[i14] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 6;
            bArr[i15] = (byte) ((value & 127) | 128);
        }

        private void p1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 63);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 56) & 127) | 128);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((value >>> 49) & 127) | 128);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((value >>> 42) & 127) | 128);
            int i15 = i10 - 5;
            this.f126101n = i15;
            bArr[i14] = (byte) (((value >>> 35) & 127) | 128);
            int i16 = i10 - 6;
            this.f126101n = i16;
            bArr[i15] = (byte) (((value >>> 28) & 127) | 128);
            int i17 = i10 - 7;
            this.f126101n = i17;
            bArr[i16] = (byte) (((value >>> 21) & 127) | 128);
            int i18 = i10 - 8;
            this.f126101n = i18;
            bArr[i17] = (byte) (((value >>> 14) & 127) | 128);
            int i19 = i10 - 9;
            this.f126101n = i19;
            bArr[i18] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 10;
            bArr[i19] = (byte) ((value & 127) | 128);
        }

        private void q1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (((int) value) >>> 14);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((value >>> 7) & 127) | 128);
            this.f126101n = i10 - 3;
            bArr[i12] = (byte) ((value & 127) | 128);
        }

        private void r1(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (value >>> 7);
            this.f126101n = i10 - 2;
            bArr[i11] = (byte) ((((int) value) & 127) | 128);
        }

        @Override // com.google.protobuf.n
        void A0(long value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) (((int) (value >> 56)) & 255);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) (((int) (value >> 48)) & 255);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) (((int) (value >> 40)) & 255);
            int i14 = i10 - 4;
            this.f126101n = i14;
            bArr[i13] = (byte) (((int) (value >> 32)) & 255);
            int i15 = i10 - 5;
            this.f126101n = i15;
            bArr[i14] = (byte) (((int) (value >> 24)) & 255);
            int i16 = i10 - 6;
            this.f126101n = i16;
            bArr[i15] = (byte) (((int) (value >> 16)) & 255);
            int i17 = i10 - 7;
            this.f126101n = i17;
            bArr[i16] = (byte) (((int) (value >> 8)) & 255);
            this.f126101n = i10 - 8;
            bArr[i17] = (byte) (((int) value) & 255);
        }

        @Override // com.google.protobuf.z4
        public void E(int fieldNumber, Object value) throws IOException {
            int iC0 = c0();
            i3.a().k(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.n
        void F0(int value) {
            if (value >= 0) {
                W0(value);
            } else {
                X0(value);
            }
        }

        @Override // com.google.protobuf.z4
        @Deprecated
        public void I(int fieldNumber, Object value) throws IOException {
            R0(fieldNumber, 4);
            i3.a().k(value, this);
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void K0(int value) {
            W0(b0.c1(value));
        }

        @Override // com.google.protobuf.z4
        public void M(int fieldNumber, int value) throws IOException {
            r0(10);
            K0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void N(int fieldNumber, u value) throws IOException {
            try {
                value.K0(this);
                r0(10);
                W0(value.size());
                R0(fieldNumber, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // com.google.protobuf.n
        void N0(long value) {
            X0(b0.d1(value));
        }

        @Override // com.google.protobuf.z4
        public void Q(int fieldNumber, Object value, o3 schema) throws IOException {
            R0(fieldNumber, 4);
            schema.h(value, this);
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void Q0(String in) {
            int i10;
            int i11;
            int i12;
            char cCharAt;
            r0(in.length());
            int length = in.length() - 1;
            this.f126101n -= length;
            while (length >= 0 && (cCharAt = in.charAt(length)) < 128) {
                this.f126096i[this.f126101n + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f126101n--;
                return;
            }
            this.f126101n += length;
            while (length >= 0) {
                char cCharAt2 = in.charAt(length);
                if (cCharAt2 < 128 && (i12 = this.f126101n) > this.f126099l) {
                    byte[] bArr = this.f126096i;
                    this.f126101n = i12 - 1;
                    bArr[i12] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i11 = this.f126101n) > this.f126097j) {
                    byte[] bArr2 = this.f126096i;
                    int i13 = i11 - 1;
                    this.f126101n = i13;
                    bArr2[i11] = (byte) ((cCharAt2 & '?') | 128);
                    this.f126101n = i11 - 2;
                    bArr2[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i10 = this.f126101n) > this.f126097j + 1) {
                    byte[] bArr3 = this.f126096i;
                    int i14 = i10 - 1;
                    this.f126101n = i14;
                    bArr3[i10] = (byte) ((cCharAt2 & '?') | 128);
                    int i15 = i10 - 2;
                    this.f126101n = i15;
                    bArr3[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.f126101n = i10 - 3;
                    bArr3[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.f126101n > this.f126097j + 2) {
                        if (length != 0) {
                            char cCharAt3 = in.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.f126096i;
                                int i16 = this.f126101n;
                                int i17 = i16 - 1;
                                this.f126101n = i17;
                                bArr4[i16] = (byte) ((codePoint & 63) | 128);
                                int i18 = i16 - 2;
                                this.f126101n = i18;
                                bArr4[i17] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i19 = i16 - 3;
                                this.f126101n = i19;
                                bArr4[i18] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.f126101n = i16 - 4;
                                bArr4[i19] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new u4.d(length - 1, length);
                    }
                    r0(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.protobuf.n
        void R0(int fieldNumber, int wireType) {
            W0(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.z4
        public void S(int fieldNumber, Object value, o3 schema) throws IOException {
            int iC0 = c0();
            schema.h(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.t
        public void T(byte value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            this.f126101n = i10 - 1;
            bArr[i10] = value;
        }

        @Override // com.google.protobuf.t
        public void U(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (c1() < iRemaining) {
                a1(iRemaining);
            }
            int i10 = this.f126101n - iRemaining;
            this.f126101n = i10;
            value.get(this.f126096i, i10 + 1, iRemaining);
        }

        @Override // com.google.protobuf.t
        public void V(byte[] value, int offset, int length) {
            if (c1() < length) {
                a1(length);
            }
            int i10 = this.f126101n - length;
            this.f126101n = i10;
            System.arraycopy(value, offset, this.f126096i, i10 + 1, length);
        }

        @Override // com.google.protobuf.t
        public void W(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (c1() < iRemaining) {
                this.f126090d += iRemaining;
                this.f126089c.addFirst(com.google.protobuf.d.j(value));
                Z0();
            }
            int i10 = this.f126101n - iRemaining;
            this.f126101n = i10;
            value.get(this.f126096i, i10 + 1, iRemaining);
        }

        @Override // com.google.protobuf.n
        void W0(int value) {
            if ((value & (-128)) == 0) {
                f1(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                h1(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                g1(value);
            } else if (((-268435456) & value) == 0) {
                e1(value);
            } else {
                d1(value);
            }
        }

        @Override // com.google.protobuf.t
        public void X(byte[] value, int offset, int length) {
            if (c1() < length) {
                this.f126090d += length;
                this.f126089c.addFirst(com.google.protobuf.d.l(value, offset, length));
                Z0();
            } else {
                int i10 = this.f126101n - length;
                this.f126101n = i10;
                System.arraycopy(value, offset, this.f126096i, i10 + 1, length);
            }
        }

        @Override // com.google.protobuf.n
        void X0(long value) {
            switch (n.a0(value)) {
                case 1:
                    m1(value);
                    break;
                case 2:
                    r1(value);
                    break;
                case 3:
                    q1(value);
                    break;
                case 4:
                    k1(value);
                    break;
                case 5:
                    j1(value);
                    break;
                case 6:
                    o1(value);
                    break;
                case 7:
                    n1(value);
                    break;
                case 8:
                    i1(value);
                    break;
                case 9:
                    l1(value);
                    break;
                case 10:
                    p1(value);
                    break;
            }
        }

        int Y0() {
            return this.f126100m - this.f126101n;
        }

        @Override // com.google.protobuf.n
        void b0() {
            if (this.f126095h != null) {
                this.f126090d += Y0();
                com.google.protobuf.d dVar = this.f126095h;
                dVar.h((this.f126101n - dVar.b()) + 1);
                this.f126095h = null;
                this.f126101n = 0;
                this.f126100m = 0;
            }
        }

        @Override // com.google.protobuf.z4
        public void c(int fieldNumber, int value) throws IOException {
            r0(9);
            x0(value);
            int i10 = 0 & 5;
            R0(fieldNumber, 5);
        }

        @Override // com.google.protobuf.n
        public int c0() {
            return this.f126090d + Y0();
        }

        int c1() {
            return this.f126101n - this.f126099l;
        }

        @Override // com.google.protobuf.z4
        public void e(int fieldNumber, String value) throws IOException {
            int iC0 = c0();
            Q0(value);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.z4
        public void f(int fieldNumber, long value) throws IOException {
            r0(15);
            X0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void h(int fieldNumber, int value) throws IOException {
            r0(15);
            F0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void k(int fieldNumber, long value) throws IOException {
            r0(15);
            N0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void l(int fieldNumber, int value) throws IOException {
            r0(10);
            W0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void n(int fieldNumber, long value) throws IOException {
            r0(13);
            A0(value);
            R0(fieldNumber, 1);
        }

        @Override // com.google.protobuf.z4
        public void p(int i10, boolean z10) throws IOException {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // com.google.protobuf.z4
        public void r(int fieldNumber) {
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void r0(int size) {
            if (c1() < size) {
                a1(size);
            }
        }

        @Override // com.google.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.z4
        public void t(int fieldNumber) {
            R0(fieldNumber, 4);
        }

        @Override // com.google.protobuf.n
        void x0(int value) {
            byte[] bArr = this.f126096i;
            int i10 = this.f126101n;
            int i11 = i10 - 1;
            this.f126101n = i11;
            bArr[i10] = (byte) ((value >> 24) & 255);
            int i12 = i10 - 2;
            this.f126101n = i12;
            bArr[i11] = (byte) ((value >> 16) & 255);
            int i13 = i10 - 3;
            this.f126101n = i13;
            bArr[i12] = (byte) ((value >> 8) & 255);
            this.f126101n = i10 - 4;
            bArr[i13] = (byte) (value & 255);
        }
    }

    private static final class d extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ByteBuffer f126102h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f126103i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f126104j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f126105k;

        d(r alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            c1();
        }

        private int Z0() {
            return (int) (this.f126105k - this.f126103i);
        }

        private int a1() {
            return (int) (this.f126104j - this.f126105k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b1() {
            return t4.V();
        }

        private void c1() {
            e1(f0());
        }

        private void d1(int capacity) {
            e1(g0(capacity));
        }

        private void e1(com.google.protobuf.d allocatedBuffer) {
            if (!allocatedBuffer.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = allocatedBuffer.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            b0();
            this.f126089c.addFirst(allocatedBuffer);
            this.f126102h = byteBufferF;
            v1.c(byteBufferF, byteBufferF.capacity());
            v1.e(this.f126102h, 0);
            long jK = t4.k(this.f126102h);
            this.f126103i = jK;
            long jLimit = jK + ((long) (this.f126102h.limit() - 1));
            this.f126104j = jLimit;
            this.f126105k = jLimit;
        }

        private int f1() {
            return Z0() + 1;
        }

        private void g1(int value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 28));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 21) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 14) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 7) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) ((value & 127) | 128));
        }

        private void h1(int value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 21));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 14) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 7) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) ((value & 127) | 128));
        }

        private void i1(int value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) value);
        }

        private void j1(int value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 14));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 7) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) ((value & 127) | 128));
        }

        private void k1(int value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 7));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) ((value & 127) | 128));
        }

        private void l1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 49));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 42) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 35) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 28) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) (((value >>> 21) & 127) | 128));
            long j15 = this.f126105k;
            this.f126105k = j15 - 1;
            t4.e0(j15, (byte) (((value >>> 14) & 127) | 128));
            long j16 = this.f126105k;
            this.f126105k = j16 - 1;
            t4.e0(j16, (byte) (((value >>> 7) & 127) | 128));
            long j17 = this.f126105k;
            this.f126105k = j17 - 1;
            t4.e0(j17, (byte) ((value & 127) | 128));
        }

        private void m1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 28));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 21) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 14) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 7) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) ((value & 127) | 128));
        }

        private void n1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 21));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 14) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            int i10 = 2 & 7;
            t4.e0(j12, (byte) (((value >>> 7) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) ((value & 127) | 128));
        }

        private void o1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 56));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 49) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 42) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 35) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) (((value >>> 28) & 127) | 128));
            long j15 = this.f126105k;
            this.f126105k = j15 - 1;
            t4.e0(j15, (byte) (((value >>> 21) & 127) | 128));
            long j16 = this.f126105k;
            this.f126105k = j16 - 1;
            t4.e0(j16, (byte) (((value >>> 14) & 127) | 128));
            long j17 = this.f126105k;
            this.f126105k = j17 - 1;
            t4.e0(j17, (byte) (((value >>> 7) & 127) | 128));
            long j18 = this.f126105k;
            this.f126105k = j18 - 1;
            t4.e0(j18, (byte) ((value & 127) | 128));
        }

        private void p1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) value);
        }

        private void q1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 42));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 35) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 28) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 21) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) (((value >>> 14) & 127) | 128));
            long j15 = this.f126105k;
            this.f126105k = j15 - 1;
            t4.e0(j15, (byte) (((value >>> 7) & 127) | 128));
            long j16 = this.f126105k;
            this.f126105k = j16 - 1;
            t4.e0(j16, (byte) ((value & 127) | 128));
        }

        private void r1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 35));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 28) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 21) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 14) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) (((value >>> 7) & 127) | 128));
            long j15 = this.f126105k;
            this.f126105k = j15 - 1;
            t4.e0(j15, (byte) ((value & 127) | 128));
        }

        private void s1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 63));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 56) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((value >>> 49) & 127) | 128));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((value >>> 42) & 127) | 128));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) (((value >>> 35) & 127) | 128));
            long j15 = this.f126105k;
            this.f126105k = j15 - 1;
            t4.e0(j15, (byte) (((value >>> 28) & 127) | 128));
            long j16 = this.f126105k;
            this.f126105k = j16 - 1;
            t4.e0(j16, (byte) (((value >>> 21) & 127) | 128));
            long j17 = this.f126105k;
            this.f126105k = j17 - 1;
            t4.e0(j17, (byte) (((value >>> 14) & 127) | 128));
            long j18 = this.f126105k;
            this.f126105k = j18 - 1;
            t4.e0(j18, (byte) (((value >>> 7) & 127) | 128));
            long j19 = this.f126105k;
            this.f126105k = j19 - 1;
            t4.e0(j19, (byte) ((value & 127) | 128));
        }

        private void t1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (((int) value) >>> 14));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((value >>> 7) & 127) | 128));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) ((value & 127) | 128));
        }

        private void u1(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (value >>> 7));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) ((((int) value) & 127) | 128));
        }

        @Override // com.google.protobuf.n
        void A0(long value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) (((int) (value >> 56)) & 255));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) (((int) (value >> 48)) & 255));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) (((int) (value >> 40)) & 255));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (((int) (value >> 32)) & 255));
            long j14 = this.f126105k;
            this.f126105k = j14 - 1;
            t4.e0(j14, (byte) (((int) (value >> 24)) & 255));
            long j15 = this.f126105k;
            this.f126105k = j15 - 1;
            t4.e0(j15, (byte) (((int) (value >> 16)) & 255));
            long j16 = this.f126105k;
            this.f126105k = j16 - 1;
            t4.e0(j16, (byte) (((int) (value >> 8)) & 255));
            long j17 = this.f126105k;
            this.f126105k = j17 - 1;
            t4.e0(j17, (byte) (((int) value) & 255));
        }

        @Override // com.google.protobuf.z4
        public void E(int fieldNumber, Object value) throws IOException {
            int iC0 = c0();
            i3.a().k(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.n
        void F0(int value) {
            if (value >= 0) {
                W0(value);
            } else {
                X0(value);
            }
        }

        @Override // com.google.protobuf.z4
        public void I(int fieldNumber, Object value) throws IOException {
            R0(fieldNumber, 4);
            i3.a().k(value, this);
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void K0(int value) {
            W0(b0.c1(value));
        }

        @Override // com.google.protobuf.z4
        public void M(int fieldNumber, int value) {
            r0(10);
            K0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void N(int fieldNumber, u value) {
            try {
                value.K0(this);
                r0(10);
                W0(value.size());
                R0(fieldNumber, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // com.google.protobuf.n
        void N0(long value) {
            X0(b0.d1(value));
        }

        @Override // com.google.protobuf.z4
        public void Q(int fieldNumber, Object value, o3 schema) throws IOException {
            R0(fieldNumber, 4);
            schema.h(value, this);
            R0(fieldNumber, 3);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0053  */
        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
        /* JADX WARN: Code duplicated, block: B:21:0x0061  */
        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:24:0x0085  */
        /* JADX WARN: Code duplicated, block: B:26:0x008b  */
        /* JADX WARN: Code duplicated, block: B:28:0x0096  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:38:0x0131  */
        /* JADX WARN: Code duplicated, block: B:44:0x0129 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x0129 A[SYNTHETIC] */
        @Override // com.google.protobuf.n
        void Q0(String in) {
            long j10;
            char cCharAt;
            long j11;
            char cCharAt2;
            r0(in.length());
            int length = in.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = in.charAt(length)) >= 128) {
                    break;
                }
                long j12 = this.f126105k;
                this.f126105k = j12 - 1;
                t4.e0(j12, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = in.charAt(length);
                if (cCharAt3 < 128) {
                    long j13 = this.f126105k;
                    if (j13 >= this.f126103i) {
                        this.f126105k = j13 - 1;
                        t4.e0(j13, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j11 = this.f126105k;
                        if (j11 > this.f126103i) {
                            this.f126105k = j11 - 1;
                            t4.e0(j11, (byte) ((cCharAt3 & '?') | 128));
                            long j14 = this.f126105k;
                            this.f126105k = j14 - 1;
                            t4.e0(j14, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j10 = this.f126105k;
                            if (j10 > this.f126103i + 1) {
                                this.f126105k = j10 - 1;
                                t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                                long j15 = this.f126105k;
                                this.f126105k = j15 - 1;
                                t4.e0(j15, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                long j16 = this.f126105k;
                                this.f126105k = j16 - 1;
                                t4.e0(j16, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f126105k > this.f126103i + 2) {
                                    if (length != 0) {
                                        cCharAt = in.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            long j17 = this.f126105k;
                                            this.f126105k = j17 - 1;
                                            t4.e0(j17, (byte) ((codePoint & 63) | 128));
                                            long j18 = this.f126105k;
                                            this.f126105k = j18 - 1;
                                            t4.e0(j18, (byte) (((codePoint >>> 6) & 63) | 128));
                                            long j19 = this.f126105k;
                                            this.f126105k = j19 - 1;
                                            t4.e0(j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                            long j20 = this.f126105k;
                                            this.f126105k = j20 - 1;
                                            t4.e0(j20, (byte) ((codePoint >>> 18) | 240));
                                        }
                                    }
                                    throw new u4.d(length - 1, length);
                                }
                                r0(length);
                                length++;
                            }
                        } else {
                            if (this.f126105k > this.f126103i + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j110 = this.f126105k;
                                        this.f126105k = j110 - 1;
                                        t4.e0(j110, (byte) ((codePoint2 & 63) | 128));
                                        long j111 = this.f126105k;
                                        this.f126105k = j111 - 1;
                                        t4.e0(j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        long j112 = this.f126105k;
                                        this.f126105k = j112 - 1;
                                        t4.e0(j112, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j21 = this.f126105k;
                                        this.f126105k = j21 - 1;
                                        t4.e0(j21, (byte) ((codePoint2 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f126105k;
                        if (j10 > this.f126103i + 1) {
                            this.f126105k = j10 - 1;
                            t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j113 = this.f126105k;
                            this.f126105k = j113 - 1;
                            t4.e0(j113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j114 = this.f126105k;
                            this.f126105k = j114 - 1;
                            t4.e0(j114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126105k > this.f126103i + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j115 = this.f126105k;
                                        this.f126105k = j115 - 1;
                                        t4.e0(j115, (byte) ((codePoint3 & 63) | 128));
                                        long j116 = this.f126105k;
                                        this.f126105k = j116 - 1;
                                        t4.e0(j116, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                        long j117 = this.f126105k;
                                        this.f126105k = j117 - 1;
                                        t4.e0(j117, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                        long j22 = this.f126105k;
                                        this.f126105k = j22 - 1;
                                        t4.e0(j22, (byte) ((codePoint3 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f126105k;
                        if (j10 > this.f126103i + 1) {
                            this.f126105k = j10 - 1;
                            t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j118 = this.f126105k;
                            this.f126105k = j118 - 1;
                            t4.e0(j118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j119 = this.f126105k;
                            this.f126105k = j119 - 1;
                            t4.e0(j119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126105k > this.f126103i + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j1110 = this.f126105k;
                                        this.f126105k = j1110 - 1;
                                        t4.e0(j1110, (byte) ((codePoint4 & 63) | 128));
                                        long j1111 = this.f126105k;
                                        this.f126105k = j1111 - 1;
                                        t4.e0(j1111, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                        long j1112 = this.f126105k;
                                        this.f126105k = j1112 - 1;
                                        t4.e0(j1112, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                        long j23 = this.f126105k;
                                        this.f126105k = j23 - 1;
                                        t4.e0(j23, (byte) ((codePoint4 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j11 = this.f126105k;
                    if (j11 > this.f126103i) {
                        this.f126105k = j11 - 1;
                        t4.e0(j11, (byte) ((cCharAt3 & '?') | 128));
                        long j120 = this.f126105k;
                        this.f126105k = j120 - 1;
                        t4.e0(j120, (byte) ((cCharAt3 >>> 6) | 960));
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f126105k;
                        if (j10 > this.f126103i + 1) {
                            this.f126105k = j10 - 1;
                            t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j1113 = this.f126105k;
                            this.f126105k = j1113 - 1;
                            t4.e0(j1113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1114 = this.f126105k;
                            this.f126105k = j1114 - 1;
                            t4.e0(j1114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126105k > this.f126103i + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j1115 = this.f126105k;
                                        this.f126105k = j1115 - 1;
                                        t4.e0(j1115, (byte) ((codePoint5 & 63) | 128));
                                        long j1116 = this.f126105k;
                                        this.f126105k = j1116 - 1;
                                        t4.e0(j1116, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                        long j1117 = this.f126105k;
                                        this.f126105k = j1117 - 1;
                                        t4.e0(j1117, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                        long j24 = this.f126105k;
                                        this.f126105k = j24 - 1;
                                        t4.e0(j24, (byte) ((codePoint5 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f126105k;
                        if (j10 > this.f126103i + 1) {
                            this.f126105k = j10 - 1;
                            t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                            long j1118 = this.f126105k;
                            this.f126105k = j1118 - 1;
                            t4.e0(j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            long j1119 = this.f126105k;
                            this.f126105k = j1119 - 1;
                            t4.e0(j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126105k > this.f126103i + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        long j11110 = this.f126105k;
                                        this.f126105k = j11110 - 1;
                                        t4.e0(j11110, (byte) ((codePoint6 & 63) | 128));
                                        long j11111 = this.f126105k;
                                        this.f126105k = j11111 - 1;
                                        t4.e0(j11111, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        long j11112 = this.f126105k;
                                        this.f126105k = j11112 - 1;
                                        t4.e0(j11112, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        long j25 = this.f126105k;
                                        this.f126105k = j25 - 1;
                                        t4.e0(j25, (byte) ((codePoint6 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j10 = this.f126105k;
                    if (j10 > this.f126103i + 1) {
                        this.f126105k = j10 - 1;
                        t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                        long j11113 = this.f126105k;
                        this.f126105k = j11113 - 1;
                        t4.e0(j11113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        long j11114 = this.f126105k;
                        this.f126105k = j11114 - 1;
                        t4.e0(j11114, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f126105k > this.f126103i + 2) {
                            if (length != 0) {
                                cCharAt = in.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j11115 = this.f126105k;
                                    this.f126105k = j11115 - 1;
                                    t4.e0(j11115, (byte) ((codePoint7 & 63) | 128));
                                    long j11116 = this.f126105k;
                                    this.f126105k = j11116 - 1;
                                    t4.e0(j11116, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                    long j11117 = this.f126105k;
                                    this.f126105k = j11117 - 1;
                                    t4.e0(j11117, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                    long j26 = this.f126105k;
                                    this.f126105k = j26 - 1;
                                    t4.e0(j26, (byte) ((codePoint7 >>> 18) | 240));
                                }
                            }
                            throw new u4.d(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                } else {
                    j10 = this.f126105k;
                    if (j10 > this.f126103i + 1) {
                        this.f126105k = j10 - 1;
                        t4.e0(j10, (byte) ((cCharAt3 & '?') | 128));
                        long j11118 = this.f126105k;
                        this.f126105k = j11118 - 1;
                        t4.e0(j11118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        long j11119 = this.f126105k;
                        this.f126105k = j11119 - 1;
                        t4.e0(j11119, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f126105k > this.f126103i + 2) {
                            if (length != 0) {
                                cCharAt = in.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    long j111110 = this.f126105k;
                                    this.f126105k = j111110 - 1;
                                    t4.e0(j111110, (byte) ((codePoint8 & 63) | 128));
                                    long j111111 = this.f126105k;
                                    this.f126105k = j111111 - 1;
                                    t4.e0(j111111, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                    long j111112 = this.f126105k;
                                    this.f126105k = j111112 - 1;
                                    t4.e0(j111112, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                    long j27 = this.f126105k;
                                    this.f126105k = j27 - 1;
                                    t4.e0(j27, (byte) ((codePoint8 >>> 18) | 240));
                                }
                            }
                            throw new u4.d(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // com.google.protobuf.n
        void R0(int fieldNumber, int wireType) {
            W0(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.z4
        public void S(int fieldNumber, Object value, o3 schema) throws IOException {
            int iC0 = c0();
            schema.h(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.t
        public void T(byte value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, value);
        }

        @Override // com.google.protobuf.t
        public void U(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (f1() < iRemaining) {
                d1(iRemaining);
            }
            this.f126105k -= (long) iRemaining;
            v1.e(this.f126102h, Z0() + 1);
            this.f126102h.put(value);
        }

        @Override // com.google.protobuf.t
        public void V(byte[] value, int offset, int length) {
            if (f1() < length) {
                d1(length);
            }
            this.f126105k -= (long) length;
            v1.e(this.f126102h, Z0() + 1);
            this.f126102h.put(value, offset, length);
        }

        @Override // com.google.protobuf.t
        public void W(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (f1() < iRemaining) {
                this.f126090d += iRemaining;
                this.f126089c.addFirst(com.google.protobuf.d.j(value));
                c1();
            } else {
                this.f126105k -= (long) iRemaining;
                v1.e(this.f126102h, Z0() + 1);
                this.f126102h.put(value);
            }
        }

        @Override // com.google.protobuf.n
        void W0(int value) {
            if ((value & (-128)) == 0) {
                i1(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                k1(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                j1(value);
            } else if (((-268435456) & value) == 0) {
                h1(value);
            } else {
                g1(value);
            }
        }

        @Override // com.google.protobuf.t
        public void X(byte[] value, int offset, int length) {
            if (f1() < length) {
                this.f126090d += length;
                this.f126089c.addFirst(com.google.protobuf.d.l(value, offset, length));
                c1();
            } else {
                this.f126105k -= (long) length;
                v1.e(this.f126102h, Z0() + 1);
                this.f126102h.put(value, offset, length);
            }
        }

        @Override // com.google.protobuf.n
        void X0(long value) {
            switch (n.a0(value)) {
                case 1:
                    p1(value);
                    break;
                case 2:
                    u1(value);
                    break;
                case 3:
                    t1(value);
                    break;
                case 4:
                    n1(value);
                    break;
                case 5:
                    m1(value);
                    break;
                case 6:
                    r1(value);
                    break;
                case 7:
                    q1(value);
                    break;
                case 8:
                    l1(value);
                    break;
                case 9:
                    o1(value);
                    break;
                case 10:
                    s1(value);
                    break;
            }
        }

        @Override // com.google.protobuf.n
        void b0() {
            if (this.f126102h != null) {
                this.f126090d += a1();
                v1.e(this.f126102h, Z0() + 1);
                this.f126102h = null;
                this.f126105k = 0L;
                this.f126104j = 0L;
            }
        }

        @Override // com.google.protobuf.z4
        public void c(int fieldNumber, int value) {
            r0(9);
            x0(value);
            R0(fieldNumber, 5);
        }

        @Override // com.google.protobuf.n
        public int c0() {
            return this.f126090d + a1();
        }

        @Override // com.google.protobuf.z4
        public void e(int fieldNumber, String value) {
            int iC0 = c0();
            Q0(value);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.z4
        public void f(int fieldNumber, long value) {
            r0(15);
            X0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void h(int fieldNumber, int value) {
            r0(15);
            F0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void k(int fieldNumber, long value) {
            r0(15);
            N0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void l(int fieldNumber, int value) {
            r0(10);
            W0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void n(int fieldNumber, long value) {
            r0(13);
            A0(value);
            R0(fieldNumber, 1);
        }

        @Override // com.google.protobuf.z4
        public void p(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // com.google.protobuf.z4
        @Deprecated
        public void r(int fieldNumber) {
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void r0(int size) {
            if (f1() < size) {
                d1(size);
            }
        }

        @Override // com.google.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.z4
        @Deprecated
        public void t(int fieldNumber) {
            R0(fieldNumber, 4);
        }

        @Override // com.google.protobuf.n
        void x0(int value) {
            long j10 = this.f126105k;
            this.f126105k = j10 - 1;
            t4.e0(j10, (byte) ((value >> 24) & 255));
            long j11 = this.f126105k;
            this.f126105k = j11 - 1;
            t4.e0(j11, (byte) ((value >> 16) & 255));
            long j12 = this.f126105k;
            this.f126105k = j12 - 1;
            t4.e0(j12, (byte) ((value >> 8) & 255));
            long j13 = this.f126105k;
            this.f126105k = j13 - 1;
            t4.e0(j13, (byte) (value & 255));
        }
    }

    private static final class e extends n {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.protobuf.d f126106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f126107i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f126108j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f126109k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f126110l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f126111m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f126112n;

        e(r alloc, int chunkSize) {
            super(alloc, chunkSize, null);
            b1();
        }

        private int Y0() {
            return (int) this.f126112n;
        }

        static boolean a1() {
            return t4.U();
        }

        private void b1() {
            d1(j0());
        }

        private void c1(int capacity) {
            d1(k0(capacity));
        }

        private void d1(com.google.protobuf.d allocatedBuffer) {
            if (!allocatedBuffer.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            b0();
            this.f126089c.addFirst(allocatedBuffer);
            this.f126106h = allocatedBuffer;
            this.f126107i = allocatedBuffer.a();
            long jB = allocatedBuffer.b();
            this.f126109k = ((long) allocatedBuffer.e()) + jB;
            long jG = jB + ((long) allocatedBuffer.g());
            this.f126108j = jG;
            this.f126110l = jG - 1;
            long j10 = this.f126109k - 1;
            this.f126111m = j10;
            this.f126112n = j10;
        }

        private void f1(int value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 28));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) ((value & 127) | 128));
        }

        private void g1(int value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 21));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) ((value & 127) | 128));
        }

        private void h1(int value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) value);
        }

        private void i1(int value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 14));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) ((value & 127) | 128));
        }

        private void j1(int value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 7));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) ((value & 127) | 128));
        }

        private void k1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 49));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr6 = this.f126107i;
            long j15 = this.f126112n;
            this.f126112n = j15 - 1;
            t4.g0(bArr6, j15, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr7 = this.f126107i;
            long j16 = this.f126112n;
            this.f126112n = j16 - 1;
            t4.g0(bArr7, j16, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr8 = this.f126107i;
            long j17 = this.f126112n;
            this.f126112n = j17 - 1;
            t4.g0(bArr8, j17, (byte) ((value & 127) | 128));
        }

        private void l1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 28));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) ((value & 127) | 128));
        }

        private void m1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 21));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) ((value & 127) | 128));
        }

        private void n1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 56));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr6 = this.f126107i;
            long j15 = this.f126112n;
            this.f126112n = j15 - 1;
            t4.g0(bArr6, j15, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr7 = this.f126107i;
            long j16 = this.f126112n;
            this.f126112n = j16 - 1;
            t4.g0(bArr7, j16, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr8 = this.f126107i;
            long j17 = this.f126112n;
            this.f126112n = j17 - 1;
            t4.g0(bArr8, j17, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr9 = this.f126107i;
            long j18 = this.f126112n;
            this.f126112n = j18 - 1;
            t4.g0(bArr9, j18, (byte) ((value & 127) | 128));
        }

        private void o1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) value);
        }

        private void p1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 42));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr6 = this.f126107i;
            long j15 = this.f126112n;
            this.f126112n = j15 - 1;
            t4.g0(bArr6, j15, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr7 = this.f126107i;
            long j16 = this.f126112n;
            this.f126112n = j16 - 1;
            t4.g0(bArr7, j16, (byte) ((value & 127) | 128));
        }

        private void q1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 35));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr6 = this.f126107i;
            long j15 = this.f126112n;
            this.f126112n = j15 - 1;
            t4.g0(bArr6, j15, (byte) ((value & 127) | 128));
        }

        private void r1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 63));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 56) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((value >>> 49) & 127) | 128));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((value >>> 42) & 127) | 128));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) (((value >>> 35) & 127) | 128));
            byte[] bArr6 = this.f126107i;
            long j15 = this.f126112n;
            this.f126112n = j15 - 1;
            t4.g0(bArr6, j15, (byte) (((value >>> 28) & 127) | 128));
            byte[] bArr7 = this.f126107i;
            long j16 = this.f126112n;
            this.f126112n = j16 - 1;
            t4.g0(bArr7, j16, (byte) (((value >>> 21) & 127) | 128));
            byte[] bArr8 = this.f126107i;
            long j17 = this.f126112n;
            this.f126112n = j17 - 1;
            t4.g0(bArr8, j17, (byte) (((value >>> 14) & 127) | 128));
            byte[] bArr9 = this.f126107i;
            long j18 = this.f126112n;
            this.f126112n = j18 - 1;
            t4.g0(bArr9, j18, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr10 = this.f126107i;
            long j19 = this.f126112n;
            this.f126112n = j19 - 1;
            t4.g0(bArr10, j19, (byte) ((value & 127) | 128));
        }

        private void s1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (((int) value) >>> 14));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((value >>> 7) & 127) | 128));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) ((value & 127) | 128));
        }

        private void t1(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (value >>> 7));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) ((((int) value) & 127) | 128));
        }

        @Override // com.google.protobuf.n
        void A0(long value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) (((int) (value >> 56)) & 255));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) (((int) (value >> 48)) & 255));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) (((int) (value >> 40)) & 255));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (((int) (value >> 32)) & 255));
            byte[] bArr5 = this.f126107i;
            long j14 = this.f126112n;
            this.f126112n = j14 - 1;
            t4.g0(bArr5, j14, (byte) (((int) (value >> 24)) & 255));
            byte[] bArr6 = this.f126107i;
            long j15 = this.f126112n;
            this.f126112n = j15 - 1;
            t4.g0(bArr6, j15, (byte) (((int) (value >> 16)) & 255));
            byte[] bArr7 = this.f126107i;
            long j16 = this.f126112n;
            this.f126112n = j16 - 1;
            t4.g0(bArr7, j16, (byte) (((int) (value >> 8)) & 255));
            byte[] bArr8 = this.f126107i;
            long j17 = this.f126112n;
            this.f126112n = j17 - 1;
            t4.g0(bArr8, j17, (byte) (((int) value) & 255));
        }

        @Override // com.google.protobuf.z4
        public void E(int fieldNumber, Object value) throws IOException {
            int iC0 = c0();
            i3.a().k(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.n
        void F0(int value) {
            if (value >= 0) {
                W0(value);
            } else {
                X0(value);
            }
        }

        @Override // com.google.protobuf.z4
        public void I(int fieldNumber, Object value) throws IOException {
            R0(fieldNumber, 4);
            i3.a().k(value, this);
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void K0(int value) {
            W0(b0.c1(value));
        }

        @Override // com.google.protobuf.z4
        public void M(int fieldNumber, int value) {
            r0(10);
            K0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void N(int fieldNumber, u value) {
            try {
                value.K0(this);
                r0(10);
                W0(value.size());
                R0(fieldNumber, 2);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // com.google.protobuf.n
        void N0(long value) {
            X0(b0.d1(value));
        }

        @Override // com.google.protobuf.z4
        public void Q(int fieldNumber, Object value, o3 schema) throws IOException {
            R0(fieldNumber, 4);
            schema.h(value, this);
            R0(fieldNumber, 3);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0057  */
        /* JADX WARN: Code duplicated, block: B:19:0x005c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0065  */
        /* JADX WARN: Code duplicated, block: B:22:0x0087  */
        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0092  */
        /* JADX WARN: Code duplicated, block: B:28:0x009b  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:31:0x00db A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:37:0x0143  */
        /* JADX WARN: Code duplicated, block: B:43:0x013a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x013a A[SYNTHETIC] */
        @Override // com.google.protobuf.n
        void Q0(String in) {
            long j10;
            char cCharAt;
            long j11;
            char cCharAt2;
            r0(in.length());
            int length = in.length();
            while (true) {
                length--;
                if (length < 0 || (cCharAt2 = in.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.f126107i;
                long j12 = this.f126112n;
                this.f126112n = j12 - 1;
                t4.g0(bArr, j12, (byte) cCharAt2);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char cCharAt3 = in.charAt(length);
                if (cCharAt3 < 128) {
                    long j13 = this.f126112n;
                    if (j13 > this.f126110l) {
                        byte[] bArr2 = this.f126107i;
                        this.f126112n = j13 - 1;
                        t4.g0(bArr2, j13, (byte) cCharAt3);
                    } else if (cCharAt3 < 2048) {
                        j11 = this.f126112n;
                        if (j11 > this.f126108j) {
                            byte[] bArr3 = this.f126107i;
                            this.f126112n = j11 - 1;
                            t4.g0(bArr3, j11, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr4 = this.f126107i;
                            long j14 = this.f126112n;
                            this.f126112n = j14 - 1;
                            t4.g0(bArr4, j14, (byte) ((cCharAt3 >>> 6) | 960));
                        } else if (cCharAt3 >= 55296 || 57343 < cCharAt3) {
                            j10 = this.f126112n;
                            if (j10 > this.f126108j + 1) {
                                byte[] bArr5 = this.f126107i;
                                this.f126112n = j10 - 1;
                                t4.g0(bArr5, j10, (byte) ((cCharAt3 & '?') | 128));
                                byte[] bArr6 = this.f126107i;
                                long j15 = this.f126112n;
                                this.f126112n = j15 - 1;
                                t4.g0(bArr6, j15, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                                byte[] bArr7 = this.f126107i;
                                long j16 = this.f126112n;
                                this.f126112n = j16 - 1;
                                t4.g0(bArr7, j16, (byte) ((cCharAt3 >>> '\f') | 480));
                            } else {
                                if (this.f126112n > this.f126108j + 2) {
                                    if (length != 0) {
                                        cCharAt = in.charAt(length - 1);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                            length--;
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt3);
                                            byte[] bArr8 = this.f126107i;
                                            long j17 = this.f126112n;
                                            this.f126112n = j17 - 1;
                                            t4.g0(bArr8, j17, (byte) ((codePoint & 63) | 128));
                                            byte[] bArr9 = this.f126107i;
                                            long j18 = this.f126112n;
                                            this.f126112n = j18 - 1;
                                            t4.g0(bArr9, j18, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byte[] bArr10 = this.f126107i;
                                            long j19 = this.f126112n;
                                            this.f126112n = j19 - 1;
                                            t4.g0(bArr10, j19, (byte) (((codePoint >>> 12) & 63) | 128));
                                            byte[] bArr11 = this.f126107i;
                                            long j20 = this.f126112n;
                                            this.f126112n = j20 - 1;
                                            t4.g0(bArr11, j20, (byte) ((codePoint >>> 18) | 240));
                                        }
                                    }
                                    throw new u4.d(length - 1, length);
                                }
                                r0(length);
                                length++;
                            }
                        } else {
                            if (this.f126112n > this.f126108j + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint2 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr12 = this.f126107i;
                                        long j110 = this.f126112n;
                                        this.f126112n = j110 - 1;
                                        t4.g0(bArr12, j110, (byte) ((codePoint2 & 63) | 128));
                                        byte[] bArr13 = this.f126107i;
                                        long j111 = this.f126112n;
                                        this.f126112n = j111 - 1;
                                        t4.g0(bArr13, j111, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        byte[] bArr14 = this.f126107i;
                                        long j112 = this.f126112n;
                                        this.f126112n = j112 - 1;
                                        t4.g0(bArr14, j112, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        byte[] bArr15 = this.f126107i;
                                        long j21 = this.f126112n;
                                        this.f126112n = j21 - 1;
                                        t4.g0(bArr15, j21, (byte) ((codePoint2 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f126112n;
                        if (j10 > this.f126108j + 1) {
                            byte[] bArr16 = this.f126107i;
                            this.f126112n = j10 - 1;
                            t4.g0(bArr16, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr17 = this.f126107i;
                            long j113 = this.f126112n;
                            this.f126112n = j113 - 1;
                            t4.g0(bArr17, j113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr18 = this.f126107i;
                            long j114 = this.f126112n;
                            this.f126112n = j114 - 1;
                            t4.g0(bArr18, j114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126112n > this.f126108j + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint3 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr19 = this.f126107i;
                                        long j115 = this.f126112n;
                                        this.f126112n = j115 - 1;
                                        t4.g0(bArr19, j115, (byte) ((codePoint3 & 63) | 128));
                                        byte[] bArr110 = this.f126107i;
                                        long j116 = this.f126112n;
                                        this.f126112n = j116 - 1;
                                        t4.g0(bArr110, j116, (byte) (((codePoint3 >>> 6) & 63) | 128));
                                        byte[] bArr111 = this.f126107i;
                                        long j117 = this.f126112n;
                                        this.f126112n = j117 - 1;
                                        t4.g0(bArr111, j117, (byte) (((codePoint3 >>> 12) & 63) | 128));
                                        byte[] bArr112 = this.f126107i;
                                        long j22 = this.f126112n;
                                        this.f126112n = j22 - 1;
                                        t4.g0(bArr112, j22, (byte) ((codePoint3 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f126112n;
                        if (j10 > this.f126108j + 1) {
                            byte[] bArr113 = this.f126107i;
                            this.f126112n = j10 - 1;
                            t4.g0(bArr113, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr114 = this.f126107i;
                            long j118 = this.f126112n;
                            this.f126112n = j118 - 1;
                            t4.g0(bArr114, j118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr115 = this.f126107i;
                            long j119 = this.f126112n;
                            this.f126112n = j119 - 1;
                            t4.g0(bArr115, j119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126112n > this.f126108j + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint4 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr116 = this.f126107i;
                                        long j1110 = this.f126112n;
                                        this.f126112n = j1110 - 1;
                                        t4.g0(bArr116, j1110, (byte) ((codePoint4 & 63) | 128));
                                        byte[] bArr117 = this.f126107i;
                                        long j1111 = this.f126112n;
                                        this.f126112n = j1111 - 1;
                                        t4.g0(bArr117, j1111, (byte) (((codePoint4 >>> 6) & 63) | 128));
                                        byte[] bArr118 = this.f126107i;
                                        long j1112 = this.f126112n;
                                        this.f126112n = j1112 - 1;
                                        t4.g0(bArr118, j1112, (byte) (((codePoint4 >>> 12) & 63) | 128));
                                        byte[] bArr119 = this.f126107i;
                                        long j23 = this.f126112n;
                                        this.f126112n = j23 - 1;
                                        t4.g0(bArr119, j23, (byte) ((codePoint4 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 < 2048) {
                    j11 = this.f126112n;
                    if (j11 > this.f126108j) {
                        byte[] bArr20 = this.f126107i;
                        this.f126112n = j11 - 1;
                        t4.g0(bArr20, j11, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr21 = this.f126107i;
                        long j120 = this.f126112n;
                        this.f126112n = j120 - 1;
                        t4.g0(bArr21, j120, (byte) ((cCharAt3 >>> 6) | 960));
                    } else if (cCharAt3 >= 55296) {
                        j10 = this.f126112n;
                        if (j10 > this.f126108j + 1) {
                            byte[] bArr1110 = this.f126107i;
                            this.f126112n = j10 - 1;
                            t4.g0(bArr1110, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr1111 = this.f126107i;
                            long j1113 = this.f126112n;
                            this.f126112n = j1113 - 1;
                            t4.g0(bArr1111, j1113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr1112 = this.f126107i;
                            long j1114 = this.f126112n;
                            this.f126112n = j1114 - 1;
                            t4.g0(bArr1112, j1114, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126112n > this.f126108j + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint5 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr1113 = this.f126107i;
                                        long j1115 = this.f126112n;
                                        this.f126112n = j1115 - 1;
                                        t4.g0(bArr1113, j1115, (byte) ((codePoint5 & 63) | 128));
                                        byte[] bArr1114 = this.f126107i;
                                        long j1116 = this.f126112n;
                                        this.f126112n = j1116 - 1;
                                        t4.g0(bArr1114, j1116, (byte) (((codePoint5 >>> 6) & 63) | 128));
                                        byte[] bArr1115 = this.f126107i;
                                        long j1117 = this.f126112n;
                                        this.f126112n = j1117 - 1;
                                        t4.g0(bArr1115, j1117, (byte) (((codePoint5 >>> 12) & 63) | 128));
                                        byte[] bArr1116 = this.f126107i;
                                        long j24 = this.f126112n;
                                        this.f126112n = j24 - 1;
                                        t4.g0(bArr1116, j24, (byte) ((codePoint5 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    } else {
                        j10 = this.f126112n;
                        if (j10 > this.f126108j + 1) {
                            byte[] bArr1117 = this.f126107i;
                            this.f126112n = j10 - 1;
                            t4.g0(bArr1117, j10, (byte) ((cCharAt3 & '?') | 128));
                            byte[] bArr1118 = this.f126107i;
                            long j1118 = this.f126112n;
                            this.f126112n = j1118 - 1;
                            t4.g0(bArr1118, j1118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byte[] bArr1119 = this.f126107i;
                            long j1119 = this.f126112n;
                            this.f126112n = j1119 - 1;
                            t4.g0(bArr1119, j1119, (byte) ((cCharAt3 >>> '\f') | 480));
                        } else {
                            if (this.f126112n > this.f126108j + 2) {
                                if (length != 0) {
                                    cCharAt = in.charAt(length - 1);
                                    if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                        length--;
                                        int codePoint6 = Character.toCodePoint(cCharAt, cCharAt3);
                                        byte[] bArr11110 = this.f126107i;
                                        long j11110 = this.f126112n;
                                        this.f126112n = j11110 - 1;
                                        t4.g0(bArr11110, j11110, (byte) ((codePoint6 & 63) | 128));
                                        byte[] bArr11111 = this.f126107i;
                                        long j11111 = this.f126112n;
                                        this.f126112n = j11111 - 1;
                                        t4.g0(bArr11111, j11111, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                        byte[] bArr11112 = this.f126107i;
                                        long j11112 = this.f126112n;
                                        this.f126112n = j11112 - 1;
                                        t4.g0(bArr11112, j11112, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                        byte[] bArr11113 = this.f126107i;
                                        long j25 = this.f126112n;
                                        this.f126112n = j25 - 1;
                                        t4.g0(bArr11113, j25, (byte) ((codePoint6 >>> 18) | 240));
                                    }
                                }
                                throw new u4.d(length - 1, length);
                            }
                            r0(length);
                            length++;
                        }
                    }
                } else if (cCharAt3 >= 55296) {
                    j10 = this.f126112n;
                    if (j10 > this.f126108j + 1) {
                        byte[] bArr11114 = this.f126107i;
                        this.f126112n = j10 - 1;
                        t4.g0(bArr11114, j10, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr11115 = this.f126107i;
                        long j11113 = this.f126112n;
                        this.f126112n = j11113 - 1;
                        t4.g0(bArr11115, j11113, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        byte[] bArr11116 = this.f126107i;
                        long j11114 = this.f126112n;
                        this.f126112n = j11114 - 1;
                        t4.g0(bArr11116, j11114, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f126112n > this.f126108j + 2) {
                            if (length != 0) {
                                cCharAt = in.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint7 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr11117 = this.f126107i;
                                    long j11115 = this.f126112n;
                                    this.f126112n = j11115 - 1;
                                    t4.g0(bArr11117, j11115, (byte) ((codePoint7 & 63) | 128));
                                    byte[] bArr11118 = this.f126107i;
                                    long j11116 = this.f126112n;
                                    this.f126112n = j11116 - 1;
                                    t4.g0(bArr11118, j11116, (byte) (((codePoint7 >>> 6) & 63) | 128));
                                    byte[] bArr11119 = this.f126107i;
                                    long j11117 = this.f126112n;
                                    this.f126112n = j11117 - 1;
                                    t4.g0(bArr11119, j11117, (byte) (((codePoint7 >>> 12) & 63) | 128));
                                    byte[] bArr111110 = this.f126107i;
                                    long j26 = this.f126112n;
                                    this.f126112n = j26 - 1;
                                    t4.g0(bArr111110, j26, (byte) ((codePoint7 >>> 18) | 240));
                                }
                            }
                            throw new u4.d(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                } else {
                    j10 = this.f126112n;
                    if (j10 > this.f126108j + 1) {
                        byte[] bArr111111 = this.f126107i;
                        this.f126112n = j10 - 1;
                        t4.g0(bArr111111, j10, (byte) ((cCharAt3 & '?') | 128));
                        byte[] bArr111112 = this.f126107i;
                        long j11118 = this.f126112n;
                        this.f126112n = j11118 - 1;
                        t4.g0(bArr111112, j11118, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        byte[] bArr111113 = this.f126107i;
                        long j11119 = this.f126112n;
                        this.f126112n = j11119 - 1;
                        t4.g0(bArr111113, j11119, (byte) ((cCharAt3 >>> '\f') | 480));
                    } else {
                        if (this.f126112n > this.f126108j + 2) {
                            if (length != 0) {
                                cCharAt = in.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt, cCharAt3)) {
                                    length--;
                                    int codePoint8 = Character.toCodePoint(cCharAt, cCharAt3);
                                    byte[] bArr111114 = this.f126107i;
                                    long j111110 = this.f126112n;
                                    this.f126112n = j111110 - 1;
                                    t4.g0(bArr111114, j111110, (byte) ((codePoint8 & 63) | 128));
                                    byte[] bArr111115 = this.f126107i;
                                    long j111111 = this.f126112n;
                                    this.f126112n = j111111 - 1;
                                    t4.g0(bArr111115, j111111, (byte) (((codePoint8 >>> 6) & 63) | 128));
                                    byte[] bArr111116 = this.f126107i;
                                    long j111112 = this.f126112n;
                                    this.f126112n = j111112 - 1;
                                    t4.g0(bArr111116, j111112, (byte) (((codePoint8 >>> 12) & 63) | 128));
                                    byte[] bArr111117 = this.f126107i;
                                    long j27 = this.f126112n;
                                    this.f126112n = j27 - 1;
                                    t4.g0(bArr111117, j27, (byte) ((codePoint8 >>> 18) | 240));
                                }
                            }
                            throw new u4.d(length - 1, length);
                        }
                        r0(length);
                        length++;
                    }
                }
                length--;
            }
        }

        @Override // com.google.protobuf.n
        void R0(int fieldNumber, int wireType) {
            W0(x4.c(fieldNumber, wireType));
        }

        @Override // com.google.protobuf.z4
        public void S(int fieldNumber, Object value, o3 schema) throws IOException {
            int iC0 = c0();
            schema.h(value, this);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        @Override // com.google.protobuf.t
        public void T(byte value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, value);
        }

        @Override // com.google.protobuf.t
        public void U(ByteBuffer value) {
            int iRemaining = value.remaining();
            r0(iRemaining);
            this.f126112n -= (long) iRemaining;
            value.get(this.f126107i, Y0() + 1, iRemaining);
        }

        @Override // com.google.protobuf.t
        public void V(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            r0(length);
            this.f126112n -= (long) length;
            System.arraycopy(value, offset, this.f126107i, Y0() + 1, length);
        }

        @Override // com.google.protobuf.t
        public void W(ByteBuffer value) {
            int iRemaining = value.remaining();
            if (e1() < iRemaining) {
                this.f126090d += iRemaining;
                this.f126089c.addFirst(com.google.protobuf.d.j(value));
                b1();
            }
            this.f126112n -= (long) iRemaining;
            value.get(this.f126107i, Y0() + 1, iRemaining);
        }

        @Override // com.google.protobuf.n
        void W0(int value) {
            if ((value & (-128)) == 0) {
                h1(value);
                return;
            }
            if ((value & (-16384)) == 0) {
                j1(value);
                return;
            }
            if (((-2097152) & value) == 0) {
                i1(value);
            } else if (((-268435456) & value) == 0) {
                g1(value);
            } else {
                f1(value);
            }
        }

        @Override // com.google.protobuf.t
        public void X(byte[] value, int offset, int length) {
            if (offset < 0 || offset + length > value.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(value.length), Integer.valueOf(offset), Integer.valueOf(length)));
            }
            if (e1() >= length) {
                this.f126112n -= (long) length;
                System.arraycopy(value, offset, this.f126107i, Y0() + 1, length);
            } else {
                this.f126090d += length;
                this.f126089c.addFirst(com.google.protobuf.d.l(value, offset, length));
                b1();
            }
        }

        @Override // com.google.protobuf.n
        void X0(long value) {
            switch (n.a0(value)) {
                case 1:
                    o1(value);
                    break;
                case 2:
                    t1(value);
                    break;
                case 3:
                    s1(value);
                    break;
                case 4:
                    m1(value);
                    break;
                case 5:
                    l1(value);
                    break;
                case 6:
                    q1(value);
                    break;
                case 7:
                    p1(value);
                    break;
                case 8:
                    k1(value);
                    break;
                case 9:
                    n1(value);
                    break;
                case 10:
                    r1(value);
                    break;
            }
        }

        int Z0() {
            return (int) (this.f126111m - this.f126112n);
        }

        @Override // com.google.protobuf.n
        void b0() {
            if (this.f126106h != null) {
                this.f126090d += Z0();
                this.f126106h.h((Y0() - this.f126106h.b()) + 1);
                this.f126106h = null;
                this.f126112n = 0L;
                this.f126111m = 0L;
            }
        }

        @Override // com.google.protobuf.z4
        public void c(int fieldNumber, int value) {
            r0(9);
            x0(value);
            R0(fieldNumber, 5);
        }

        @Override // com.google.protobuf.n
        public int c0() {
            return this.f126090d + Z0();
        }

        @Override // com.google.protobuf.z4
        public void e(int fieldNumber, String value) {
            int iC0 = c0();
            Q0(value);
            int iC1 = c0() - iC0;
            r0(10);
            W0(iC1);
            R0(fieldNumber, 2);
        }

        int e1() {
            return (int) (this.f126112n - this.f126110l);
        }

        @Override // com.google.protobuf.z4
        public void f(int fieldNumber, long value) {
            r0(15);
            X0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void h(int fieldNumber, int value) {
            r0(15);
            F0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void k(int fieldNumber, long value) {
            r0(15);
            N0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void l(int fieldNumber, int value) {
            r0(10);
            W0(value);
            R0(fieldNumber, 0);
        }

        @Override // com.google.protobuf.z4
        public void n(int fieldNumber, long value) {
            r0(13);
            A0(value);
            int i10 = 6 | 1;
            R0(fieldNumber, 1);
        }

        @Override // com.google.protobuf.z4
        public void p(int i10, boolean z10) {
            r0(6);
            T(z10 ? (byte) 1 : (byte) 0);
            R0(i10, 0);
        }

        @Override // com.google.protobuf.z4
        public void r(int fieldNumber) {
            R0(fieldNumber, 3);
        }

        @Override // com.google.protobuf.n
        void r0(int size) {
            if (e1() < size) {
                c1(size);
            }
        }

        @Override // com.google.protobuf.n
        void s0(boolean z10) {
            T(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.z4
        public void t(int fieldNumber) {
            R0(fieldNumber, 4);
        }

        @Override // com.google.protobuf.n
        void x0(int value) {
            byte[] bArr = this.f126107i;
            long j10 = this.f126112n;
            this.f126112n = j10 - 1;
            t4.g0(bArr, j10, (byte) ((value >> 24) & 255));
            byte[] bArr2 = this.f126107i;
            long j11 = this.f126112n;
            this.f126112n = j11 - 1;
            t4.g0(bArr2, j11, (byte) ((value >> 16) & 255));
            byte[] bArr3 = this.f126107i;
            long j12 = this.f126112n;
            this.f126112n = j12 - 1;
            t4.g0(bArr3, j12, (byte) ((value >> 8) & 255));
            byte[] bArr4 = this.f126107i;
            long j13 = this.f126112n;
            this.f126112n = j13 - 1;
            t4.g0(bArr4, j13, (byte) (value & 255));
        }
    }

    /* synthetic */ n(r rVar, int i10, a aVar) {
        this(rVar, i10);
    }

    private void B0(int fieldNumber, e2 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                n(fieldNumber, list.getLong(size));
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(list.getLong(size2));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void C0(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                n(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(list.get(size2).longValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void D0(int fieldNumber, h1 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                J(fieldNumber, list.getFloat(size));
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(Float.floatToRawIntBits(list.getFloat(size2)));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void E0(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                J(fieldNumber, list.get(size).floatValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                W0(c0() - iC0);
                R0(fieldNumber, 2);
                return;
            }
            x0(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
    }

    private void G0(int fieldNumber, r1 list, boolean packed) throws IOException {
        if (packed) {
            r0((list.size() * 10) + 10);
            int iC0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                F0(list.getInt(size));
            }
            W0(c0() - iC0);
            R0(fieldNumber, 2);
            return;
        }
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                h(fieldNumber, list.getInt(size2));
            }
        }
    }

    private void H0(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                h(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            F0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void I0(int fieldNumber, Object value) throws IOException {
        if (value instanceof String) {
            e(fieldNumber, (String) value);
        } else {
            N(fieldNumber, (u) value);
        }
    }

    static final void J0(z4 writer, int fieldNumber, x4.b fieldType, Object object) throws IOException {
        switch (a.f126091a[fieldType.ordinal()]) {
            case 1:
                writer.p(fieldNumber, ((Boolean) object).booleanValue());
                return;
            case 2:
                writer.c(fieldNumber, ((Integer) object).intValue());
                return;
            case 3:
                writer.n(fieldNumber, ((Long) object).longValue());
                return;
            case 4:
                writer.h(fieldNumber, ((Integer) object).intValue());
                return;
            case 5:
                writer.F(fieldNumber, ((Long) object).longValue());
                return;
            case 6:
                writer.q(fieldNumber, ((Integer) object).intValue());
                return;
            case 7:
                writer.y(fieldNumber, ((Long) object).longValue());
                return;
            case 8:
                writer.M(fieldNumber, ((Integer) object).intValue());
                return;
            case 9:
                writer.k(fieldNumber, ((Long) object).longValue());
                return;
            case 10:
                writer.e(fieldNumber, (String) object);
                return;
            case 11:
                writer.l(fieldNumber, ((Integer) object).intValue());
                return;
            case 12:
                writer.f(fieldNumber, ((Long) object).longValue());
                return;
            case 13:
                writer.J(fieldNumber, ((Float) object).floatValue());
                return;
            case 14:
                writer.B(fieldNumber, ((Double) object).doubleValue());
                return;
            case 15:
                writer.E(fieldNumber, object);
                return;
            case 16:
                writer.N(fieldNumber, (u) object);
                return;
            case 17:
                if (object instanceof s1.c) {
                    writer.K(fieldNumber, ((s1.c) object).i());
                    return;
                } else {
                    if (!(object instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.K(fieldNumber, ((Integer) object).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void L0(int fieldNumber, r1 list, boolean packed) throws IOException {
        if (packed) {
            r0((list.size() * 5) + 10);
            int iC0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                K0(list.getInt(size));
            }
            W0(c0() - iC0);
            R0(fieldNumber, 2);
            return;
        }
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                M(fieldNumber, list.getInt(size2));
            }
        }
    }

    private void M0(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                M(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            K0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void O0(int fieldNumber, e2 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                k(fieldNumber, list.getLong(size));
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            N0(list.getLong(size2));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void P0(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                k(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            N0(list.get(size2).longValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void S0(int fieldNumber, r1 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                l(fieldNumber, list.getInt(size));
            }
            return;
        }
        r0((list.size() * 5) + 10);
        int iC0 = c0();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                W0(c0() - iC0);
                R0(fieldNumber, 2);
                return;
            }
            W0(list.getInt(size2));
        }
    }

    private void T0(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (packed) {
            r0((list.size() * 5) + 10);
            int iC0 = c0();
            for (int size = list.size() - 1; size >= 0; size--) {
                W0(list.get(size).intValue());
            }
            W0(c0() - iC0);
            R0(fieldNumber, 2);
            return;
        }
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                l(fieldNumber, list.get(size2).intValue());
            }
        }
    }

    private void U0(int fieldNumber, e2 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                f(fieldNumber, list.getLong(size));
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            X0(list.getLong(size2));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void V0(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                f(fieldNumber, list.get(size).longValue());
            }
            return;
        }
        r0((list.size() * 10) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            X0(list.get(size2).longValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte a0(long value) {
        byte b10;
        if (((-128) & value) == 0) {
            return (byte) 1;
        }
        if (value < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & value) != 0) {
            b10 = (byte) 6;
            value >>>= 28;
        } else {
            b10 = 2;
        }
        if (((-2097152) & value) != 0) {
            b10 = (byte) (b10 + 2);
            value >>>= 14;
        }
        return (value & (-16384)) != 0 ? (byte) (b10 + 1) : b10;
    }

    static boolean d0() {
        return d.b1();
    }

    static boolean e0() {
        return e.a1();
    }

    public static n h0(r alloc) {
        return i0(alloc, 4096);
    }

    public static n i0(r alloc, int chunkSize) {
        return d0() ? p0(alloc, chunkSize) : n0(alloc, chunkSize);
    }

    public static n l0(r alloc) {
        return m0(alloc, 4096);
    }

    public static n m0(r alloc, int chunkSize) {
        return e0() ? q0(alloc, chunkSize) : o0(alloc, chunkSize);
    }

    static n n0(r alloc, int chunkSize) {
        return new b(alloc, chunkSize);
    }

    static n o0(r alloc, int chunkSize) {
        return new c(alloc, chunkSize);
    }

    static n p0(r alloc, int chunkSize) {
        if (d0()) {
            return new d(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static n q0(r alloc, int chunkSize) {
        if (e0()) {
            return new e(alloc, chunkSize);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private void t0(int fieldNumber, q list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                p(fieldNumber, list.j0(size));
            }
            return;
        }
        r0(list.size() + 10);
        int iC0 = c0();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                W0(c0() - iC0);
                R0(fieldNumber, 2);
                return;
            }
            s0(list.j0(size2));
        }
    }

    private void u0(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                p(fieldNumber, list.get(size).booleanValue());
            }
            return;
        }
        r0(list.size() + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s0(list.get(size2).booleanValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void v0(int fieldNumber, f0 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                B(fieldNumber, list.getDouble(size));
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(list.getDouble(size2)));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void w0(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                B(fieldNumber, list.get(size).doubleValue());
            }
            return;
        }
        r0((list.size() * 8) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A0(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void y0(int fieldNumber, r1 list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c(fieldNumber, list.getInt(size));
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(list.getInt(size2));
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    private void z0(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (!packed) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c(fieldNumber, list.get(size).intValue());
            }
            return;
        }
        r0((list.size() * 4) + 10);
        int iC0 = c0();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            x0(list.get(size2).intValue());
        }
        W0(c0() - iC0);
        R0(fieldNumber, 2);
    }

    @Override // com.google.protobuf.z4
    public final void A(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        g(fieldNumber, list, packed);
    }

    abstract void A0(long value);

    @Override // com.google.protobuf.z4
    public final void B(int fieldNumber, double value) throws IOException {
        n(fieldNumber, Double.doubleToRawLongBits(value));
    }

    @Override // com.google.protobuf.z4
    public final void C(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        s(fieldNumber, list, packed);
    }

    @Override // com.google.protobuf.z4
    public final z4.a D() {
        return z4.a.DESCENDING;
    }

    @Override // com.google.protobuf.z4
    public final void F(int fieldNumber, long value) throws IOException {
        f(fieldNumber, value);
    }

    abstract void F0(int value);

    @Override // com.google.protobuf.z4
    public final void G(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        i(fieldNumber, list, packed);
    }

    @Override // com.google.protobuf.z4
    public final void H(int fieldNumber, List<Boolean> list, boolean packed) throws IOException {
        if (list instanceof q) {
            t0(fieldNumber, (q) list, packed);
        } else {
            u0(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.z4
    public final void J(int fieldNumber, float value) throws IOException {
        c(fieldNumber, Float.floatToRawIntBits(value));
    }

    @Override // com.google.protobuf.z4
    public final void K(int fieldNumber, int value) throws IOException {
        h(fieldNumber, value);
    }

    abstract void K0(int value);

    @Override // com.google.protobuf.z4
    public final void L(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        m(fieldNumber, list, packed);
    }

    abstract void N0(long value);

    @Override // com.google.protobuf.z4
    public <K, V> void O(int fieldNumber, g2.b<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int iC0 = c0();
            J0(this, 2, metadata.f126002c, entry.getValue());
            int i10 = 7 << 1;
            J0(this, 1, metadata.f126000a, entry.getKey());
            W0(c0() - iC0);
            R0(fieldNumber, 2);
        }
    }

    @Override // com.google.protobuf.z4
    public final void P(int fieldNumber, List<?> list, o3 schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            S(fieldNumber, list.get(size), schema);
        }
    }

    abstract void Q0(String in);

    @Override // com.google.protobuf.z4
    @Deprecated
    public final void R(int fieldNumber, List<?> list, o3 schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            Q(fieldNumber, list.get(size), schema);
        }
    }

    abstract void R0(int fieldNumber, int wireType);

    abstract void W0(int value);

    abstract void X0(long value);

    @x
    public final Queue<com.google.protobuf.d> Z() {
        b0();
        return this.f126089c;
    }

    @Override // com.google.protobuf.z4
    public final void a(int fieldNumber, List<Float> list, boolean packed) throws IOException {
        if (list instanceof h1) {
            D0(fieldNumber, (h1) list, packed);
        } else {
            E0(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.z4
    public final void b(int fieldNumber, Object value) throws IOException {
        R0(1, 4);
        if (value instanceof u) {
            N(3, (u) value);
        } else {
            E(3, value);
        }
        l(2, fieldNumber);
        R0(1, 3);
    }

    abstract void b0();

    public abstract int c0();

    @Override // com.google.protobuf.z4
    @Deprecated
    public final void d(int fieldNumber, List<?> list) throws IOException {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                I(fieldNumber, list.get(size));
            }
        }
    }

    final com.google.protobuf.d f0() {
        return this.f126087a.a(this.f126088b);
    }

    @Override // com.google.protobuf.z4
    public final void g(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof r1) {
            G0(fieldNumber, (r1) list, packed);
        } else {
            H0(fieldNumber, list, packed);
        }
    }

    final com.google.protobuf.d g0(int capacity) {
        return this.f126087a.a(Math.max(capacity, this.f126088b));
    }

    @Override // com.google.protobuf.z4
    public final void i(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof r1) {
            y0(fieldNumber, (r1) list, packed);
        } else {
            z0(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.z4
    public final void j(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof r1) {
            S0(fieldNumber, (r1) list, packed);
        } else {
            T0(fieldNumber, list, packed);
        }
    }

    final com.google.protobuf.d j0() {
        return this.f126087a.b(this.f126088b);
    }

    final com.google.protobuf.d k0(int capacity) {
        return this.f126087a.b(Math.max(capacity, this.f126088b));
    }

    @Override // com.google.protobuf.z4
    public final void m(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof e2) {
            U0(fieldNumber, (e2) list, packed);
        } else {
            V0(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.z4
    public final void o(int fieldNumber, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            E(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.protobuf.z4
    public final void q(int fieldNumber, int value) throws IOException {
        c(fieldNumber, value);
    }

    abstract void r0(int size);

    @Override // com.google.protobuf.z4
    public final void s(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof e2) {
            B0(fieldNumber, (e2) list, packed);
        } else {
            C0(fieldNumber, list, packed);
        }
    }

    abstract void s0(boolean value);

    @Override // com.google.protobuf.z4
    public final void u(int fieldNumber, List<Integer> list, boolean packed) throws IOException {
        if (list instanceof r1) {
            L0(fieldNumber, (r1) list, packed);
        } else {
            M0(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.z4
    public final void v(int fieldNumber, List<Double> list, boolean packed) throws IOException {
        if (list instanceof f0) {
            v0(fieldNumber, (f0) list, packed);
        } else {
            w0(fieldNumber, list, packed);
        }
    }

    @Override // com.google.protobuf.z4
    public final void w(int fieldNumber, List<u> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            N(fieldNumber, list.get(size));
        }
    }

    @Override // com.google.protobuf.z4
    public final void x(int fieldNumber, List<String> list) throws IOException {
        if (!(list instanceof a2)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                e(fieldNumber, list.get(size));
            }
            return;
        }
        a2 a2Var = (a2) list;
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                I0(fieldNumber, a2Var.J1(size2));
            }
        }
    }

    abstract void x0(int value);

    @Override // com.google.protobuf.z4
    public final void y(int fieldNumber, long value) throws IOException {
        n(fieldNumber, value);
    }

    @Override // com.google.protobuf.z4
    public final void z(int fieldNumber, List<Long> list, boolean packed) throws IOException {
        if (list instanceof e2) {
            O0(fieldNumber, (e2) list, packed);
        } else {
            P0(fieldNumber, list, packed);
        }
    }

    private n(r alloc, int chunkSize) {
        this.f126089c = new ArrayDeque<>(4);
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.f126087a = (r) s1.e(alloc, "alloc");
        this.f126088b = chunkSize;
    }
}
