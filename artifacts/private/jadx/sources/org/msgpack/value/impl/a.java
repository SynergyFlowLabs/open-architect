package org.msgpack.value.impl;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.p;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a extends b implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f339376d = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f339377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f339378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile CharacterCodingException f339379c;

    public a(byte[] bArr) {
        this.f339377a = bArr;
    }

    private void A0() {
        synchronized (this.f339377a) {
            try {
                if (this.f339378b != null) {
                    return;
                }
                try {
                    CharsetDecoder charsetDecoderNewDecoder = org.msgpack.core.h.f339262a.newDecoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                    this.f339378b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(D()).toString();
                } catch (CharacterCodingException e10) {
                    try {
                        CharsetDecoder charsetDecoderNewDecoder2 = org.msgpack.core.h.f339262a.newDecoder();
                        CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                        this.f339378b = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(D()).toString();
                        this.f339379c = e10;
                    } catch (CharacterCodingException e11) {
                        throw new org.msgpack.core.l(e11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void C0(StringBuilder sb2, int i10) {
        sb2.append("\\u");
        char[] cArr = f339376d;
        sb2.append(cArr[(i10 >> 12) & 15]);
        sb2.append(cArr[(i10 >> 8) & 15]);
        sb2.append(cArr[(i10 >> 4) & 15]);
        sb2.append(cArr[i10 & 15]);
    }

    static void z0(StringBuilder sb2, String str) {
        sb2.append("\"");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    case 11:
                    default:
                        C0(sb2, cCharAt);
                        break;
                    case '\f':
                        sb2.append("\\f");
                        break;
                    case '\r':
                        sb2.append("\\r");
                        break;
                }
            } else if (cCharAt <= 127) {
                if (cCharAt == '\"') {
                    sb2.append("\\\"");
                } else if (cCharAt != '\\') {
                    sb2.append(cCharAt);
                } else {
                    sb2.append("\\\\");
                }
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                sb2.append(cCharAt);
            } else {
                C0(sb2, cCharAt);
            }
        }
        sb2.append("\"");
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean A() {
        return super.A();
    }

    @Override // org.msgpack.value.v
    public ByteBuffer D() {
        return ByteBuffer.wrap(this.f339377a).asReadOnlyBuffer();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean J() {
        return super.J();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean K() {
        return super.K();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean L() {
        return super.L();
    }

    @Override // org.msgpack.value.x
    public String O() {
        StringBuilder sb2 = new StringBuilder();
        z0(sb2, toString());
        return sb2.toString();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean W() {
        return super.W();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean Y() {
        return super.Y();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.l i() {
        return super.i();
    }

    @Override // org.msgpack.value.v
    public byte[] k() {
        byte[] bArr = this.f339377a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.k l() {
        return super.l();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean m0() {
        return super.m0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.g n() {
        return super.n();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ m p() {
        return super.p();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean p0() {
        return super.p0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public /* bridge */ /* synthetic */ boolean q0() {
        return super.q0();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ p r() {
        return super.r();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.h s() {
        return super.s();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.f t() {
        return super.t();
    }

    @Override // org.msgpack.value.v
    public String toString() {
        if (this.f339378b == null) {
            A0();
        }
        return this.f339378b;
    }

    @Override // org.msgpack.value.v
    public String u() {
        if (this.f339378b == null) {
            A0();
        }
        if (this.f339379c == null) {
            return this.f339378b;
        }
        throw new org.msgpack.core.l(this.f339379c);
    }

    @Override // org.msgpack.value.impl.b
    /* JADX INFO: renamed from: u0 */
    public /* bridge */ /* synthetic */ org.msgpack.value.i V() {
        return super.V();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.x
    public o v() {
        return this;
    }

    @Override // org.msgpack.value.impl.b
    /* JADX INFO: renamed from: v0 */
    public /* bridge */ /* synthetic */ n Z() {
        return super.Z();
    }

    @Override // org.msgpack.value.impl.b, org.msgpack.value.q, org.msgpack.value.x
    public /* bridge */ /* synthetic */ org.msgpack.value.j w() {
        return super.w();
    }

    public a(String str) {
        this.f339378b = str;
        this.f339377a = str.getBytes(org.msgpack.core.h.f339262a);
    }
}
