package com.badlogic.gdx.utils;

import java.io.IOException;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class m1 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Writer f95704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b<String> f95705b = new b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95708e;

    public m1(Writer writer) {
        this.f95704a = writer;
    }

    private void d() throws IOException {
        int i10 = this.f95708e;
        if (this.f95706c != null) {
            i10++;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            this.f95704a.write(9);
        }
    }

    private boolean f() throws IOException {
        String str = this.f95706c;
        if (str == null) {
            return false;
        }
        this.f95708e++;
        this.f95705b.c(str);
        this.f95706c = null;
        this.f95704a.write(">");
        return true;
    }

    public m1 a(String str, Object obj) throws IOException {
        if (this.f95706c == null) {
            throw new IllegalStateException();
        }
        this.f95704a.write(32);
        this.f95704a.write(str);
        this.f95704a.write("=\"");
        this.f95704a.write(obj == null ? AbstractJsonLexerKt.NULL : obj.toString());
        this.f95704a.write(34);
        return this;
    }

    public m1 b(String str) throws IOException {
        if (f()) {
            this.f95704a.write(10);
        }
        d();
        this.f95704a.write(60);
        this.f95704a.write(str);
        this.f95706c = str;
        return this;
    }

    public m1 c(String str, Object obj) throws IOException {
        return b(str).g(obj).e();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f95705b.f95174b != 0) {
            e();
        }
        this.f95704a.close();
    }

    public m1 e() throws IOException {
        int i10 = 3 | 1;
        if (this.f95706c != null) {
            this.f95704a.write("/>\n");
            int i11 = 2 ^ 0;
            this.f95706c = null;
        } else {
            this.f95708e = Math.max(this.f95708e - 1, 0);
            if (this.f95707d) {
                d();
            }
            this.f95704a.write("</");
            this.f95704a.write(this.f95705b.pop());
            this.f95704a.write(">\n");
        }
        this.f95707d = true;
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f95704a.flush();
    }

    public m1 g(Object obj) throws IOException {
        f();
        String string = obj == null ? AbstractJsonLexerKt.NULL : obj.toString();
        boolean z10 = string.length() > 64;
        this.f95707d = z10;
        if (z10) {
            this.f95704a.write(10);
            d();
        }
        this.f95704a.write(string);
        if (this.f95707d) {
            this.f95704a.write(10);
        }
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        f();
        this.f95704a.write(cArr, i10, i11);
    }
}
