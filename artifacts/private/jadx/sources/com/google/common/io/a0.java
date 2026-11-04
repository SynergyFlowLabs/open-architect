package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Readable f118928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private final Reader f118929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharBuffer f118930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char[] f118931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue<String> f118932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f118933f;

    class a extends y {
        a() {
        }

        @Override // com.google.common.io.y
        protected void d(String line, String end) {
            a0.this.f118932e.add(line);
        }
    }

    public a0(Readable readable) {
        CharBuffer charBufferE = l.e();
        this.f118930c = charBufferE;
        this.f118931d = charBufferE.array();
        this.f118932e = new ArrayDeque();
        this.f118933f = new a();
        this.f118928a = (Readable) com.google.common.base.j0.E(readable);
        this.f118929b = readable instanceof Reader ? (Reader) readable : null;
    }

    @z7.a
    @fj.a
    public String b() throws IOException {
        int i10;
        while (this.f118932e.peek() == null) {
            x.a(this.f118930c);
            Reader reader = this.f118929b;
            if (reader != null) {
                char[] cArr = this.f118931d;
                i10 = reader.read(cArr, 0, cArr.length);
            } else {
                i10 = this.f118928a.read(this.f118930c);
            }
            if (i10 == -1) {
                this.f118933f.b();
                break;
            }
            this.f118933f.a(this.f118931d, 0, i10);
        }
        return this.f118932e.poll();
    }
}
