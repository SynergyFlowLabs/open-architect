package com.google.common.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f119066a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f119067b;

    y() {
    }

    @z7.a
    private boolean c(boolean sawNewline) throws IOException {
        String str;
        if (this.f119067b) {
            str = sawNewline ? "\r\n" : org.apache.commons.lang3.z.f337565d;
        } else {
            str = sawNewline ? "\n" : "";
        }
        d(this.f119066a.toString(), str);
        this.f119066a = new StringBuilder();
        this.f119067b = false;
        return sawNewline;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    protected void a(char[] cbuf, int off, int len) throws IOException {
        int i10;
        if (!this.f119067b || len <= 0) {
            i10 = off;
        } else {
            if (c(cbuf[off] == '\n')) {
                i10 = off + 1;
            } else {
                i10 = off;
            }
        }
        int i11 = off + len;
        int i12 = i10;
        while (i10 < i11) {
            char c10 = cbuf[i10];
            if (c10 != '\n') {
                if (c10 == '\r') {
                    this.f119066a.append(cbuf, i12, i10 - i12);
                    this.f119067b = true;
                    int i13 = i10 + 1;
                    if (i13 < i11) {
                        if (c(cbuf[i13] == '\n')) {
                            i10 = i13;
                        }
                    }
                }
                i10++;
            } else {
                this.f119066a.append(cbuf, i12, i10 - i12);
                c(true);
            }
            i12 = i10 + 1;
            i10++;
        }
        this.f119066a.append(cbuf, i12, i11 - i12);
    }

    protected void b() throws IOException {
        if (!this.f119067b && this.f119066a.length() <= 0) {
            return;
        }
        c(false);
    }

    protected abstract void d(String line, String end) throws IOException;
}
