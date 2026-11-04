package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
@k
@z7.j
final class g0 extends c implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final q f118797c = new g0(0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final q f118798d = new g0(0, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final q f118799e = new g0(s.f118903a, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f118800f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f118801g = -862048943;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f118802h = 461845907;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f118803i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f118804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f118805b;

    private static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f118806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f118807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f118808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f118809d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f118810e = false;

        a(int seed) {
            this.f118806a = seed;
        }

        private void p(int nBytes, long update) {
            long j10 = this.f118807b;
            long j11 = update & com.rabbitmq.client.k0.f265952a;
            int i10 = this.f118808c;
            long j12 = (j11 << i10) | j10;
            this.f118807b = j12;
            int i11 = i10 + (nBytes * 8);
            this.f118808c = i11;
            this.f118809d += nBytes;
            if (i11 >= 32) {
                this.f118806a = g0.x(this.f118806a, g0.y((int) j12));
                this.f118807b >>>= 32;
                this.f118808c -= 32;
            }
        }

        @Override // com.google.common.hash.r
        public p n() {
            com.google.common.base.j0.g0(!this.f118810e);
            this.f118810e = true;
            int iY = this.f118806a ^ g0.y((int) this.f118807b);
            this.f118806a = iY;
            return g0.v(iY, this.f118809d);
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r b(int i10) {
            p(4, i10);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r c(long l10) {
            p(4, (int) l10);
            p(4, l10 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r g(byte b10) {
            p(1, b10 & 255);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r i(char c10) {
            p(2, c10);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r k(byte[] bytes, int off, int len) {
            com.google.common.base.j0.f0(off, off + len, bytes.length);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 4;
                if (i11 > len) {
                    break;
                }
                p(4, g0.w(bytes, i10 + off));
                i10 = i11;
            }
            while (i10 < len) {
                g(bytes[off + i10]);
                i10++;
            }
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r l(ByteBuffer buffer) {
            ByteOrder byteOrderOrder = buffer.order();
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            while (buffer.remaining() >= 4) {
                b(buffer.getInt());
            }
            while (buffer.hasRemaining()) {
                g(buffer.get());
            }
            buffer.order(byteOrderOrder);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.i0
        @z7.a
        public r m(CharSequence input, Charset charset) {
            if (!StandardCharsets.UTF_8.equals(charset)) {
                return super.m(input, charset);
            }
            int length = input.length();
            int i10 = 0;
            while (true) {
                int i11 = i10 + 4;
                if (i11 > length) {
                    break;
                }
                char cCharAt = input.charAt(i10);
                char cCharAt2 = input.charAt(i10 + 1);
                char cCharAt3 = input.charAt(i10 + 2);
                char cCharAt4 = input.charAt(i10 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                p(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i10 = i11;
            }
            while (i10 < length) {
                char cCharAt5 = input.charAt(i10);
                if (cCharAt5 < 128) {
                    p(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    p(2, g0.t(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    p(3, g0.s(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(input, i10);
                    if (iCodePointAt == cCharAt5) {
                        h(input.subSequence(i10, length).toString().getBytes(charset));
                        return this;
                    }
                    i10++;
                    p(4, g0.u(iCodePointAt));
                }
                i10++;
            }
            return this;
        }
    }

    g0(int seed, boolean supplementaryPlaneFix) {
        this.f118804a = seed;
        this.f118805b = supplementaryPlaneFix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long s(char c10) {
        return ((long) (c10 >>> '\f')) | 224 | ((long) ((((c10 >>> 6) & 63) | 128) << 8)) | ((long) (((c10 & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long t(char c10) {
        return ((long) (c10 >>> 6)) | 192 | ((long) (((c10 & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long u(int codePoint) {
        return ((long) (codePoint >>> 18)) | 240 | ((((long) ((codePoint >>> 12) & 63)) | 128) << 8) | ((((long) ((codePoint >>> 6) & 63)) | 128) << 16) | ((((long) (codePoint & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p v(int h10, int length) {
        int i10 = h10 ^ length;
        int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
        return p.i(i12 ^ (i12 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte[] input, int offset) {
        return com.google.common.primitives.l.l(input[offset + 3], input[offset + 2], input[offset + 1], input[offset]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(int h10, int k10) {
        return (Integer.rotateLeft(h10 ^ k10, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(int k10) {
        return Integer.rotateLeft(k10 * (-862048943), 15) * f118802h;
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p c(int input) {
        return v(x(this.f118804a, y(input)), 4);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p e(long input) {
        return v(x(x(this.f118804a, y((int) input)), y((int) (input >>> 32))), 8);
    }

    public boolean equals(@fj.a Object object) {
        if (object instanceof g0) {
            g0 g0Var = (g0) object;
            if (this.f118804a == g0Var.f118804a && this.f118805b == g0Var.f118805b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p f(CharSequence input, Charset charset) {
        if (!StandardCharsets.UTF_8.equals(charset)) {
            return b(input.toString().getBytes(charset));
        }
        int length = input.length();
        int iX = this.f118804a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 4;
            if (i13 > length) {
                break;
            }
            char cCharAt = input.charAt(i11);
            char cCharAt2 = input.charAt(i11 + 1);
            char cCharAt3 = input.charAt(i11 + 2);
            char cCharAt4 = input.charAt(i11 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iX = x(iX, y((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i12 += 4;
            i11 = i13;
        }
        long jS = 0;
        while (i11 < length) {
            char cCharAt5 = input.charAt(i11);
            if (cCharAt5 < 128) {
                jS |= ((long) cCharAt5) << i10;
                i10 += 8;
                i12++;
            } else if (cCharAt5 < 2048) {
                jS |= t(cCharAt5) << i10;
                i10 += 16;
                i12 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jS |= s(cCharAt5) << i10;
                i10 += 24;
                i12 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(input, i11);
                if (iCodePointAt == cCharAt5) {
                    return b(input.toString().getBytes(charset));
                }
                i11++;
                jS |= u(iCodePointAt) << i10;
                if (this.f118805b) {
                    i10 += 32;
                }
                i12 += 4;
            }
            if (i10 >= 32) {
                iX = x(iX, y((int) jS));
                jS >>>= 32;
                i10 -= 32;
            }
            i11++;
        }
        return v(y((int) jS) ^ iX, i12);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p g(CharSequence input) {
        int iY = this.f118804a;
        for (int i10 = 1; i10 < input.length(); i10 += 2) {
            iY = x(iY, y(input.charAt(i10 - 1) | (input.charAt(i10) << 16)));
        }
        if ((input.length() & 1) == 1) {
            iY ^= y(input.charAt(input.length() - 1));
        }
        return v(iY, input.length() * 2);
    }

    @Override // com.google.common.hash.q
    public int h() {
        return 32;
    }

    public int hashCode() {
        return this.f118804a ^ g0.class.hashCode();
    }

    @Override // com.google.common.hash.q
    public r i() {
        return new a(this.f118804a);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p k(byte[] input, int off, int len) {
        com.google.common.base.j0.f0(off, off + len, input.length);
        int iX = this.f118804a;
        int iP = 0;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 4;
            if (i11 > len) {
                break;
            }
            iX = x(iX, y(w(input, i10 + off)));
            i10 = i11;
        }
        int i12 = i10;
        int i13 = 0;
        while (i12 < len) {
            iP ^= com.google.common.primitives.u.p(input[off + i12]) << i13;
            i12++;
            i13 += 8;
        }
        return v(iX ^ y(iP), len);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.f118804a + ")";
    }
}
