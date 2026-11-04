package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class j extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f337360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f337361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f337362d;

    public j() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static j g(int i10) {
        return j(0, i10);
    }

    public static j h(int i10) {
        return j(i10, Integer.MAX_VALUE);
    }

    public static j i(int i10, int i11) {
        return new j(i10, i11, true);
    }

    public static j j(int i10, int i11) {
        return new j(i10, i11, false);
    }

    @Override // org.apache.commons.lang3.text.translate.c
    public boolean f(int i10, Writer writer) throws IOException {
        if (this.f337362d) {
            if (i10 < this.f337360b || i10 > this.f337361c) {
                return false;
            }
        } else if (i10 >= this.f337360b && i10 <= this.f337361c) {
            return false;
        }
        if (i10 > 65535) {
            writer.write(k(i10));
        } else {
            writer.write("\\u");
            char[] cArr = b.f337337a;
            writer.write(cArr[(i10 >> 12) & 15]);
            writer.write(cArr[(i10 >> 8) & 15]);
            writer.write(cArr[(i10 >> 4) & 15]);
            writer.write(cArr[i10 & 15]);
        }
        return true;
    }

    protected String k(int i10) {
        return "\\u" + b.a(i10);
    }

    protected j(int i10, int i11, boolean z10) {
        this.f337360b = i10;
        this.f337361c = i11;
        this.f337362d = z10;
    }
}
