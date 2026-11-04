package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final short f97863f = 256;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f97864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f97865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f97866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f97867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private short f97868e;

    public i() {
        this.f97866c = -1;
        this.f97864a = h.Y;
    }

    public byte a(AtomicInteger atomicInteger, AtomicInteger atomicInteger2) throws IOException {
        byte b10;
        byte b11;
        byte b12;
        ByteBuffer byteBuffer = this.f97865b;
        if (byteBuffer == null) {
            throw new IllegalStateException("Internal error: getNextInstruction() called before init()");
        }
        this.f97866c = byteBuffer.position();
        this.f97868e = this.f97867d;
        while (true) {
            short s10 = this.f97867d;
            if (s10 != 256) {
                this.f97867d = (short) 256;
                h hVar = this.f97864a;
                int i10 = ((byte) s10) & 255;
                b10 = hVar.f97857b[i10];
                b11 = hVar.f97859d[i10];
                b12 = hVar.f97861f[i10];
                break;
            }
            if (!this.f97865b.hasRemaining()) {
                return (byte) 5;
            }
            byte b13 = this.f97865b.get();
            h hVar2 = this.f97864a;
            int i11 = b13 & 255;
            if (hVar2.f97857b[i11] != 0) {
                this.f97867d = b13;
            }
            b10 = hVar2.f97856a[i11];
            byte b14 = hVar2.f97858c[i11];
            byte b15 = hVar2.f97860e[i11];
            if (b10 != 0) {
                b11 = b14;
                b12 = b15;
                break;
            }
        }
        if (b11 == 0) {
            try {
                atomicInteger.set(com.davidehrmann.vcdiff.util.b.c(this.f97865b));
            } catch (com.davidehrmann.vcdiff.util.b.a unused) {
                c();
                return (byte) 5;
            } catch (com.davidehrmann.vcdiff.util.b.C0884b unused2) {
                throw new IOException("Instruction size is not a valid variable-length integer");
            }
        } else {
            atomicInteger.set(b11);
        }
        atomicInteger2.set(b12);
        return b10;
    }

    public void b(ByteBuffer byteBuffer) {
        this.f97865b = byteBuffer;
        this.f97866c = -1;
        this.f97867d = (short) 256;
        this.f97868e = (short) 256;
    }

    public void c() {
        int i10 = this.f97866c;
        if (i10 >= 0) {
            if (i10 > this.f97865b.position()) {
                throw new IllegalStateException("Internal error: last_instruction_start past end of instructions_and_sizes in unGetInstruction");
            }
            this.f97865b.position(this.f97866c);
            if (this.f97867d != 256 && this.f97868e != 256) {
                throw new IllegalStateException("Internal error: two pending instructions in a row in unGetInstruction");
            }
            this.f97867d = this.f97868e;
        }
    }

    void d(ByteBuffer byteBuffer) {
        this.f97865b = byteBuffer;
        this.f97866c = -1;
        this.f97868e = this.f97867d;
    }

    public i(h hVar, short s10) {
        this.f97866c = -1;
        if (!hVar.c(s10)) {
            throw new IllegalArgumentException("Invalid code table data.");
        }
        this.f97864a = (h) com.davidehrmann.vcdiff.util.a.b(hVar, "codeTableData was null");
    }
}
