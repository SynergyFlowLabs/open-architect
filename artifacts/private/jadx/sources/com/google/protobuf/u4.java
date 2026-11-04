package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f126413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f126414b = -9187201950435737472L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f126415c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f126416d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f126417e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f126418f = 16;

    private static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws t1 {
            if (m(byte2) || (((byte1 << com.google.common.base.c.F) + (byte2 + 112)) >> 30) != 0 || m(byte3) || m(byte4)) {
                throw t1.e();
            }
            int iR = ((byte1 & 7) << 18) | (r(byte2) << 12) | (r(byte3) << 6) | r(byte4);
            resultArr[resultPos] = l(iR);
            resultArr[resultPos + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws t1 {
            if (m(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || m(byte3)))) {
                throw t1.e();
            }
            resultArr[resultPos] = (char) (((byte1 & com.google.common.base.c.f116464q) << 12) | (r(byte2) << 6) | r(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte byte1, byte byte2, char[] resultArr, int resultPos) throws t1 {
            if (byte1 < -62 || m(byte2)) {
                throw t1.e();
            }
            resultArr[resultPos] = (char) (((byte1 & com.google.common.base.c.I) << 6) | r(byte2));
        }

        private static char l(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }

        private static int r(byte b10) {
            return b10 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        private static int m(final ByteBuffer buffer, int index, final int limit) {
            int iM = index + u4.m(buffer, index, limit);
            while (iM < limit) {
                int i10 = iM + 1;
                byte b10 = buffer.get(iM);
                if (b10 >= 0) {
                    iM = i10;
                } else if (b10 < -32) {
                    if (i10 >= limit) {
                        return b10;
                    }
                    if (b10 < -62 || buffer.get(i10) > -65) {
                        return -1;
                    }
                    iM += 2;
                } else {
                    if (b10 >= -16) {
                        if (i10 >= limit - 2) {
                            return u4.q(buffer, b10, i10, limit - i10);
                        }
                        int i11 = iM + 2;
                        byte b11 = buffer.get(i10);
                        if (b11 <= -65 && (((b10 << com.google.common.base.c.F) + (b11 + 112)) >> 30) == 0) {
                            int i12 = iM + 3;
                            if (buffer.get(i11) <= -65) {
                                iM += 4;
                                if (buffer.get(i12) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= limit - 1) {
                        return u4.q(buffer, b10, i10, limit - i10);
                    }
                    int i13 = iM + 2;
                    byte b12 = buffer.get(i10);
                    if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || buffer.get(i13) > -65))) {
                        return -1;
                    }
                    iM += 3;
                }
            }
            return 0;
        }

        final String a(ByteBuffer buffer, int index, int size) throws t1 {
            if (buffer.hasArray()) {
                return b(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? d(buffer, index, size) : c(buffer, index, size);
        }

        abstract String b(byte[] bytes, int index, int size) throws t1;

        final String c(ByteBuffer buffer, int index, int size) throws t1 {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i10 = index + size;
            char[] cArr = new char[size];
            int i11 = 0;
            while (index < i10) {
                byte b10 = buffer.get(index);
                if (!a.n(b10)) {
                    break;
                }
                index++;
                a.i(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (index < i10) {
                int i13 = index + 1;
                byte b11 = buffer.get(index);
                if (a.n(b11)) {
                    int i14 = i12 + 1;
                    a.i(b11, cArr, i12);
                    int i15 = i13;
                    while (i15 < i10) {
                        byte b12 = buffer.get(i15);
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    index = i15;
                } else if (a.p(b11)) {
                    if (i13 >= i10) {
                        throw t1.e();
                    }
                    index += 2;
                    a.k(b11, buffer.get(i13), cArr, i12);
                    i12++;
                } else if (a.o(b11)) {
                    if (i13 >= i10 - 1) {
                        throw t1.e();
                    }
                    int i16 = index + 2;
                    index += 3;
                    a.j(b11, buffer.get(i13), buffer.get(i16), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw t1.e();
                    }
                    byte b13 = buffer.get(i13);
                    int i17 = index + 3;
                    byte b14 = buffer.get(index + 2);
                    index += 4;
                    a.h(b11, b13, b14, buffer.get(i17), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        abstract String d(ByteBuffer buffer, int index, int size) throws t1;

        abstract int e(CharSequence in, byte[] out, int offset, int length);

        final void f(CharSequence in, ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                v1.e(out, u4.i(in, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                h(in, out);
            } else {
                g(in, out);
            }
        }

        final void g(CharSequence in, ByteBuffer out) {
            int length = in.length();
            int iPosition = out.position();
            int i10 = 0;
            while (i10 < length) {
                try {
                    char cCharAt = in.charAt(i10);
                    if (cCharAt >= 128) {
                        break;
                    }
                    out.put(iPosition + i10, (byte) cCharAt);
                    i10++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i10 == length) {
                v1.e(out, iPosition + i10);
                return;
            }
            iPosition += i10;
            while (i10 < length) {
                char cCharAt2 = in.charAt(i10);
                if (cCharAt2 < 128) {
                    out.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i11 = iPosition + 1;
                    try {
                        out.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        out.put(i11, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i11;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i11;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i12 = i10 + 1;
                        if (i12 != length) {
                            try {
                                char cCharAt3 = in.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i13 = iPosition + 1;
                                    try {
                                        out.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i14 = iPosition + 2;
                                        try {
                                            out.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            out.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                            out.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i10 = i12;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i10 = i12;
                                            iPosition = i14;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i13;
                                        i10 = i12;
                                    }
                                } else {
                                    i10 = i12;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i10 = i12;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i10) + " at index " + (out.position() + Math.max(i10, (iPosition - out.position()) + 1)));
                        }
                        throw new d(i10, length);
                    }
                    int i15 = iPosition + 1;
                    out.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    out.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    out.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i10++;
                iPosition++;
            }
            v1.e(out, iPosition);
        }

        abstract void h(CharSequence in, ByteBuffer out);

        final boolean i(ByteBuffer buffer, int index, int limit) {
            return k(0, buffer, index, limit) == 0;
        }

        final boolean j(byte[] bytes, int index, int limit) {
            return l(0, bytes, index, limit) == 0;
        }

        final int k(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? o(state, buffer, index, limit) : n(state, buffer, index, limit);
            }
            int iArrayOffset = buffer.arrayOffset();
            return l(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
        }

        abstract int l(int state, byte[] bytes, int index, int limit);

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            if (r8.get(r9) > (-65)) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        
            if (r8.get(r9) > (-65)) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
        
            if (r8.get(r7) > (-65)) goto L57;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int n(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto Lb1
                if (r9 < r10) goto L6
                r5 = 7
                return r7
            L6:
                byte r6 = (byte) r7
                r0 = -32
                r1 = -5
                r1 = -1
                r5 = 4
                r2 = -65
                if (r6 >= r0) goto L25
                r5 = 1
                r7 = -62
                r5 = 7
                if (r6 < r7) goto L23
                int r6 = r9 + 1
                r5 = 0
                byte r7 = r8.get(r9)
                if (r7 <= r2) goto L20
                goto L23
            L20:
                r9 = r6
                goto Lb1
            L23:
                r5 = 7
                return r1
            L25:
                r3 = -16
                if (r6 >= r3) goto L5d
                int r7 = r7 >> 8
                r5 = 4
                int r7 = ~r7
                r5 = 2
                byte r7 = (byte) r7
                if (r7 != 0) goto L44
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                r5 = 5
                if (r7 < r10) goto L40
                r5 = 2
                int r6 = com.google.protobuf.u4.a(r6, r9)
                return r6
            L40:
                r4 = r9
                r9 = r7
                r9 = r7
                r7 = r4
            L44:
                if (r7 > r2) goto L5c
                r5 = 0
                r3 = -96
                if (r6 != r0) goto L4d
                if (r7 < r3) goto L5c
            L4d:
                r0 = -19
                if (r6 != r0) goto L53
                if (r7 >= r3) goto L5c
            L53:
                int r6 = r9 + 1
                r5 = 2
                byte r7 = r8.get(r9)
                if (r7 <= r2) goto L20
            L5c:
                return r1
            L5d:
                int r0 = r7 >> 8
                r5 = 5
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L76
                int r7 = r9 + 1
                r5 = 4
                byte r0 = r8.get(r9)
                r5 = 0
                if (r7 < r10) goto L74
                r5 = 7
                int r6 = com.google.protobuf.u4.a(r6, r0)
                return r6
            L74:
                r9 = 0
                goto L7f
            L76:
                int r7 = r7 >> 16
                r5 = 6
                byte r7 = (byte) r7
                r4 = r9
                r9 = r7
                r5 = 5
                r7 = r4
                r7 = r4
            L7f:
                r5 = 7
                if (r9 != 0) goto L96
                int r9 = r7 + 1
                r5 = 6
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L91
                int r6 = com.google.protobuf.u4.b(r6, r0, r7)
                r5 = 4
                return r6
            L91:
                r4 = r9
                r4 = r9
                r9 = r7
                r9 = r7
                r7 = r4
            L96:
                if (r0 > r2) goto Laf
                int r6 = r6 << 28
                r5 = 6
                int r0 = r0 + 112
                int r6 = r6 + r0
                r5 = 7
                int r6 = r6 >> 30
                if (r6 != 0) goto Laf
                r5 = 5
                if (r9 > r2) goto Laf
                r5 = 1
                int r9 = r7 + 1
                byte r6 = r8.get(r7)
                if (r6 <= r2) goto Lb1
            Laf:
                r5 = 5
                return r1
            Lb1:
                int r6 = m(r8, r9, r10)
                r5 = 6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u4.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int o(final int state, final ByteBuffer buffer, int index, final int limit);
    }

    static final class c extends b {
        c() {
        }

        private static int p(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return q(bytes, index, limit);
        }

        private static int q(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i10 = index + 1;
                byte b10 = bytes[index];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i10 >= limit) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            index += 2;
                            if (bytes[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i10 >= limit - 2) {
                            return u4.r(bytes, i10, limit);
                        }
                        int i11 = index + 2;
                        byte b11 = bytes[i10];
                        if (b11 <= -65 && (((b10 << com.google.common.base.c.F) + (b11 + 112)) >> 30) == 0) {
                            int i12 = index + 3;
                            if (bytes[i11] <= -65) {
                                index += 4;
                                if (bytes[i12] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= limit - 1) {
                        return u4.r(bytes, i10, limit);
                    }
                    int i13 = index + 2;
                    byte b12 = bytes[i10];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        index += 3;
                        if (bytes[i13] > -65) {
                        }
                    }
                    return -1;
                }
                index = i10;
            }
            return 0;
        }

        @Override // com.google.protobuf.u4.b
        String b(byte[] bytes, int index, int size) throws t1 {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i10 = index + size;
            char[] cArr = new char[size];
            int i11 = 0;
            while (index < i10) {
                byte b10 = bytes[index];
                if (!a.n(b10)) {
                    break;
                }
                index++;
                a.i(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (index < i10) {
                int i13 = index + 1;
                byte b11 = bytes[index];
                if (a.n(b11)) {
                    int i14 = i12 + 1;
                    a.i(b11, cArr, i12);
                    int i15 = i13;
                    while (i15 < i10) {
                        byte b12 = bytes[i15];
                        if (!a.n(b12)) {
                            break;
                        }
                        i15++;
                        a.i(b12, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    index = i15;
                } else if (a.p(b11)) {
                    if (i13 >= i10) {
                        throw t1.e();
                    }
                    index += 2;
                    a.k(b11, bytes[i13], cArr, i12);
                    i12++;
                } else if (a.o(b11)) {
                    if (i13 >= i10 - 1) {
                        throw t1.e();
                    }
                    int i16 = index + 2;
                    index += 3;
                    a.j(b11, bytes[i13], bytes[i16], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw t1.e();
                    }
                    byte b13 = bytes[i13];
                    int i17 = index + 3;
                    byte b14 = bytes[index + 2];
                    index += 4;
                    a.h(b11, b13, b14, bytes[i17], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.u4.b
        String d(ByteBuffer buffer, int index, int size) throws t1 {
            return c(buffer, index, size);
        }

        @Override // com.google.protobuf.u4.b
        int e(CharSequence in, byte[] out, int offset, int length) {
            int i10;
            int i11;
            char cCharAt;
            int length2 = in.length();
            int i12 = length + offset;
            int i13 = 0;
            while (i13 < length2 && (i11 = i13 + offset) < i12 && (cCharAt = in.charAt(i13)) < 128) {
                out[i11] = (byte) cCharAt;
                i13++;
            }
            if (i13 == length2) {
                return offset + length2;
            }
            int i14 = offset + i13;
            while (i13 < length2) {
                char cCharAt2 = in.charAt(i13);
                if (cCharAt2 < 128 && i14 < i12) {
                    out[i14] = (byte) cCharAt2;
                    i14++;
                } else if (cCharAt2 < 2048 && i14 <= i12 - 2) {
                    int i15 = i14 + 1;
                    out[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                    i14 += 2;
                    out[i15] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i14 > i12 - 3) {
                        if (i14 > i12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i13 + 1) == in.length() || !Character.isSurrogatePair(cCharAt2, in.charAt(i10)))) {
                                throw new d(i13, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                        }
                        int i16 = i13 + 1;
                        if (i16 != in.length()) {
                            char cCharAt3 = in.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                out[i14] = (byte) ((codePoint >>> 18) | 240);
                                out[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                out[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                out[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        throw new d(i13 - 1, length2);
                    }
                    out[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i18 = i14 + 2;
                    out[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i14 += 3;
                    out[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
                i13++;
            }
            return i14;
        }

        @Override // com.google.protobuf.u4.b
        void h(CharSequence in, ByteBuffer out) {
            g(in, out);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        
            if (r8[r9] > (-65)) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
        
            if (r8[r7] > (-65)) goto L54;
         */
        @Override // com.google.protobuf.u4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L99
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r6 = (byte) r7
                r0 = -32
                r1 = -1
                r5 = r1
                r2 = -65
                if (r6 >= r0) goto L1f
                r5 = 5
                r7 = -62
                r5 = 6
                if (r6 < r7) goto L1e
                int r6 = r9 + 1
                r7 = r8[r9]
                if (r7 <= r2) goto L1b
                goto L1e
            L1b:
                r9 = r6
                goto L99
            L1e:
                return r1
            L1f:
                r3 = -16
                if (r6 >= r3) goto L52
                r5 = 1
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L3a
                int r7 = r9 + 1
                r5 = 0
                r9 = r8[r9]
                if (r7 < r10) goto L36
                int r6 = com.google.protobuf.u4.a(r6, r9)
                return r6
            L36:
                r4 = r9
                r5 = 2
                r9 = r7
                r7 = r4
            L3a:
                r5 = 2
                if (r7 > r2) goto L51
                r3 = -96
                if (r6 != r0) goto L43
                if (r7 < r3) goto L51
            L43:
                r0 = -19
                if (r6 != r0) goto L49
                if (r7 >= r3) goto L51
            L49:
                r5 = 2
                int r6 = r9 + 1
                r7 = r8[r9]
                r5 = 4
                if (r7 <= r2) goto L1b
            L51:
                return r1
            L52:
                r5 = 1
                int r0 = r7 >> 8
                r5 = 3
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L69
                int r7 = r9 + 1
                r0 = r8[r9]
                if (r7 < r10) goto L66
                r5 = 3
                int r6 = com.google.protobuf.u4.a(r6, r0)
                return r6
            L66:
                r9 = 0
                r5 = r9
                goto L71
            L69:
                r5 = 7
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r4 = r9
                r4 = r9
                r9 = r7
                r7 = r4
            L71:
                if (r9 != 0) goto L82
                int r9 = r7 + 1
                r7 = r8[r7]
                r5 = 7
                if (r9 < r10) goto L7f
                int r6 = com.google.protobuf.u4.b(r6, r0, r7)
                return r6
            L7f:
                r4 = r9
                r9 = r7
                r7 = r4
            L82:
                if (r0 > r2) goto L97
                int r6 = r6 << 28
                int r0 = r0 + 112
                r5 = 6
                int r6 = r6 + r0
                r5 = 2
                int r6 = r6 >> 30
                if (r6 != 0) goto L97
                if (r9 > r2) goto L97
                int r9 = r7 + 1
                r6 = r8[r7]
                if (r6 <= r2) goto L99
            L97:
                r5 = 5
                return r1
            L99:
                int r6 = p(r8, r9, r10)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u4.c.l(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.u4.b
        int o(int state, ByteBuffer buffer, int index, int limit) {
            return n(state, buffer, index, limit);
        }
    }

    static class d extends IllegalArgumentException {
        d(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean p() {
            return t4.U() && t4.V();
        }

        private static int q(long address, int remaining) {
            int iS = s(address, remaining);
            long j10 = address + ((long) iS);
            int i10 = remaining - iS;
            while (true) {
                byte bA = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    bA = t4.A(j10);
                    if (bA < 0) {
                        j10 = j11;
                        break;
                    }
                    i10--;
                    j10 = j11;
                }
                if (i10 == 0) {
                    return 0;
                }
                int i11 = i10 - 1;
                if (bA < -32) {
                    if (i11 == 0) {
                        return bA;
                    }
                    i10 -= 2;
                    if (bA >= -62) {
                        long j12 = 1 + j10;
                        if (t4.A(j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (bA >= -16) {
                    if (i11 < 3) {
                        return u(j10, bA, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte bA2 = t4.A(j10);
                    if (bA2 <= -65 && (((bA << com.google.common.base.c.F) + (bA2 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (t4.A(j13) <= -65) {
                            j10 += 3;
                            if (t4.A(j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return u(j10, bA, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte bA3 = t4.A(j10);
                if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                    j10 += 2;
                    if (t4.A(j15) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int r(final byte[] bytes, long offset, int remaining) {
            int iT = t(bytes, offset, remaining);
            int i10 = remaining - iT;
            long j10 = offset + ((long) iT);
            while (true) {
                byte bC = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    bC = t4.C(bytes, j10);
                    if (bC < 0) {
                        j10 = j11;
                        break;
                    }
                    i10--;
                    j10 = j11;
                }
                if (i10 == 0) {
                    return 0;
                }
                int i11 = i10 - 1;
                if (bC < -32) {
                    if (i11 == 0) {
                        return bC;
                    }
                    i10 -= 2;
                    if (bC >= -62) {
                        long j12 = 1 + j10;
                        if (t4.C(bytes, j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (bC >= -16) {
                    if (i11 < 3) {
                        return v(bytes, bC, j10, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte bC2 = t4.C(bytes, j10);
                    if (bC2 <= -65 && (((bC << com.google.common.base.c.F) + (bC2 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (t4.C(bytes, j13) <= -65) {
                            j10 += 3;
                            if (t4.C(bytes, j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return v(bytes, bC, j10, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte bC3 = t4.C(bytes, j10);
                if (bC3 <= -65 && ((bC != -32 || bC3 >= -96) && (bC != -19 || bC3 < -96))) {
                    j10 += 2;
                    if (t4.C(bytes, j15) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int s(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i10 = (int) ((-address) & 7);
            int i11 = i10;
            while (i11 > 0) {
                long j10 = 1 + address;
                if (t4.A(address) < 0) {
                    return i10 - i11;
                }
                i11--;
                address = j10;
            }
            int i12 = maxChars - i10;
            while (i12 >= 8 && (t4.M(address) & (-9187201950435737472L)) == 0) {
                address += 8;
                i12 -= 8;
            }
            return maxChars - i12;
        }

        private static int t(byte[] bytes, long offset, final int maxChars) {
            int i10 = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i11 = 8 - (((int) offset) & 7);
            while (i10 < i11) {
                long j10 = 1 + offset;
                if (t4.C(bytes, offset) < 0) {
                    return i10;
                }
                i10++;
                offset = j10;
            }
            while (true) {
                int i12 = i10 + 8;
                if (i12 > maxChars || (t4.N(bytes, t4.f126355h + offset) & (-9187201950435737472L)) != 0) {
                    break;
                    break;
                }
                offset += 8;
                i10 = i12;
            }
            while (i10 < maxChars) {
                long j11 = offset + 1;
                if (t4.C(bytes, offset) < 0) {
                    return i10;
                }
                i10++;
                offset = j11;
            }
            return maxChars;
        }

        private static int u(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return u4.n(byte1);
            }
            if (remaining == 1) {
                return u4.o(byte1, t4.A(address));
            }
            if (remaining == 2) {
                return u4.p(byte1, t4.A(address), t4.A(address + 1));
            }
            throw new AssertionError();
        }

        private static int v(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return u4.n(byte1);
            }
            if (remaining == 1) {
                return u4.o(byte1, t4.C(bytes, offset));
            }
            if (remaining == 2) {
                return u4.p(byte1, t4.C(bytes, offset), t4.C(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.u4.b
        String b(byte[] bytes, int index, int size) throws t1 {
            Charset charset = s1.f126324b;
            String str = new String(bytes, index, size, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bytes, index, size + index))) {
                throw t1.e();
            }
            return str;
        }

        @Override // com.google.protobuf.u4.b
        String d(ByteBuffer buffer, int index, int size) throws t1 {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long jK = t4.k(buffer) + ((long) index);
            long j10 = ((long) size) + jK;
            char[] cArr = new char[size];
            int i10 = 0;
            while (jK < j10) {
                byte bA = t4.A(jK);
                if (!a.n(bA)) {
                    break;
                }
                jK++;
                a.i(bA, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (jK < j10) {
                long j11 = jK + 1;
                byte bA2 = t4.A(jK);
                if (a.n(bA2)) {
                    int i12 = i11 + 1;
                    a.i(bA2, cArr, i11);
                    long j12 = j11;
                    while (j12 < j10) {
                        byte bA3 = t4.A(j12);
                        if (!a.n(bA3)) {
                            break;
                        }
                        j12++;
                        a.i(bA3, cArr, i12);
                        i12++;
                    }
                    i11 = i12;
                    jK = j12;
                } else if (a.p(bA2)) {
                    if (j11 >= j10) {
                        throw t1.e();
                    }
                    jK += 2;
                    a.k(bA2, t4.A(j11), cArr, i11);
                    i11++;
                } else if (a.o(bA2)) {
                    if (j11 >= j10 - 1) {
                        throw t1.e();
                    }
                    long j13 = 2 + jK;
                    jK += 3;
                    a.j(bA2, t4.A(j11), t4.A(j13), cArr, i11);
                    i11++;
                } else {
                    if (j11 >= j10 - 2) {
                        throw t1.e();
                    }
                    byte bA4 = t4.A(j11);
                    long j14 = jK + 3;
                    byte bA5 = t4.A(2 + jK);
                    jK += 4;
                    a.h(bA2, bA4, bA5, t4.A(j14), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // com.google.protobuf.u4.b
        int e(final CharSequence in, final byte[] out, final int offset, final int length) {
            long j10;
            long j11;
            long j12;
            int i10;
            char cCharAt;
            long j13 = offset;
            long j14 = ((long) length) + j13;
            int length2 = in.length();
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i11 = 0;
            while (true) {
                j10 = 1;
                if (i11 >= length2 || (cCharAt = in.charAt(i11)) >= 128) {
                    break;
                }
                t4.g0(out, j13, (byte) cCharAt);
                i11++;
                j13 = 1 + j13;
            }
            if (i11 == length2) {
                return (int) j13;
            }
            while (i11 < length2) {
                char cCharAt2 = in.charAt(i11);
                if (cCharAt2 < 128 && j13 < j14) {
                    t4.g0(out, j13, (byte) cCharAt2);
                    j12 = j14;
                    j11 = j10;
                    j13 += j10;
                } else if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    j11 = j10;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        j12 = j14;
                        if (j13 > j12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length2 || !Character.isSurrogatePair(cCharAt2, in.charAt(i10)))) {
                                throw new d(i11, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i12 = i11 + 1;
                        if (i12 != length2) {
                            char cCharAt3 = in.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                t4.g0(out, j13, (byte) ((codePoint >>> 18) | 240));
                                t4.g0(out, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                t4.g0(out, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                t4.g0(out, j15, (byte) ((codePoint & 63) | 128));
                                i11 = i12;
                            } else {
                                i11 = i12;
                            }
                        }
                        throw new d(i11 - 1, length2);
                    }
                    t4.g0(out, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    t4.g0(out, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    t4.g0(out, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    t4.g0(out, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    t4.g0(out, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i11++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        @Override // com.google.protobuf.u4.b
        void h(CharSequence in, ByteBuffer out) {
            long j10;
            char c10;
            long j11;
            int i10;
            char c11;
            char cCharAt;
            long jK = t4.k(out);
            long jPosition = ((long) out.position()) + jK;
            long jLimit = ((long) out.limit()) + jK;
            int length = in.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length - 1) + " at index " + out.limit());
            }
            int i11 = 0;
            while (true) {
                j10 = 1;
                c10 = 128;
                if (i11 >= length || (cCharAt = in.charAt(i11)) >= 128) {
                    break;
                }
                t4.e0(jPosition, (byte) cCharAt);
                i11++;
                jPosition = 1 + jPosition;
            }
            if (i11 == length) {
                v1.e(out, (int) (jPosition - jK));
                return;
            }
            while (i11 < length) {
                char cCharAt2 = in.charAt(i11);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    j11 = j10;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j12 = jPosition + j11;
                        t4.e0(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        t4.e0(j12, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jK = jK;
                            jLimit = jLimit;
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, in.charAt(i10)))) {
                                    throw new d(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char cCharAt3 = in.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    t4.e0(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    t4.e0(jPosition + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = jPosition + 3;
                                    t4.e0(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    t4.e0(j13, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new d(i11 - 1, length);
                        }
                        t4.e0(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = jPosition + 2;
                        t4.e0(jPosition + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        t4.e0(j14, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c11 = 128;
                } else {
                    t4.e0(jPosition, (byte) cCharAt2);
                    jK = jK;
                    jLimit = jLimit;
                    c11 = c10;
                    jPosition += j10;
                    j11 = j10;
                }
                i11++;
                c10 = c11;
                j10 = j11;
                jK = jK;
                jLimit = jLimit;
            }
            v1.e(out, (int) (jPosition - jK));
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
        
            if (com.google.protobuf.t4.C(r12, r0) > (-65)) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
        
            if (com.google.protobuf.t4.C(r12, r0) > (-65)) goto L61;
         */
        @Override // com.google.protobuf.u4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r11, byte[] r12, final int r13, final int r14) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u4.e.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        
            if (com.google.protobuf.t4.A(r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ca, code lost:
        
            if (com.google.protobuf.t4.A(r0) > (-65)) goto L60;
         */
        @Override // com.google.protobuf.u4.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int o(final int r10, java.nio.ByteBuffer r11, final int r12, final int r13) {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u4.e.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f126413a = (!e.p() || com.google.protobuf.e.c()) ? new c() : new e();
    }

    private u4() {
    }

    static String g(ByteBuffer buffer, int index, int size) throws t1 {
        return f126413a.a(buffer, index, size);
    }

    static String h(byte[] bytes, int index, int size) throws t1 {
        return f126413a.b(bytes, index, size);
    }

    static int i(CharSequence in, byte[] out, int offset, int length) {
        return f126413a.e(in, out, offset, length);
    }

    static void j(CharSequence in, ByteBuffer out) {
        f126413a.f(in, out);
    }

    static int k(CharSequence sequence) {
        int length = sequence.length();
        int i10 = 0;
        while (i10 < length && sequence.charAt(i10) < 128) {
            i10++;
        }
        int iL = length;
        while (i10 < length) {
            char cCharAt = sequence.charAt(i10);
            if (cCharAt >= 2048) {
                iL += l(sequence, i10);
                break;
            }
            iL += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iL >= length) {
            return iL;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iL) + 4294967296L));
    }

    private static int l(CharSequence sequence, int start) {
        int length = sequence.length();
        int i10 = 0;
        while (start < length) {
            char cCharAt = sequence.charAt(start);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(sequence, start) < 65536) {
                        throw new d(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(ByteBuffer buffer, int index, int limit) {
        int i10 = limit - 7;
        int i11 = index;
        while (i11 < i10 && (buffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        return i11 - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return n(byte1);
        }
        if (remaining == 1) {
            return o(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return p(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte[] bytes, int index, int limit) {
        byte b10 = bytes[index - 1];
        int i10 = limit - index;
        if (i10 == 0) {
            return n(b10);
        }
        if (i10 == 1) {
            return o(b10, bytes[index]);
        }
        if (i10 == 2) {
            return p(b10, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    static boolean s(ByteBuffer buffer) {
        return f126413a.i(buffer, buffer.position(), buffer.remaining());
    }

    static boolean t(byte[] bytes) {
        return f126413a.j(bytes, 0, bytes.length);
    }

    static boolean u(byte[] bytes, int index, int limit) {
        return f126413a.j(bytes, index, limit);
    }

    static int v(int state, ByteBuffer buffer, int index, int limit) {
        return f126413a.k(state, buffer, index, limit);
    }

    static int w(int state, byte[] bytes, int index, int limit) {
        return f126413a.l(state, bytes, index, limit);
    }
}
