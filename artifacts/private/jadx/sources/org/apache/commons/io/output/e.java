package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
public class e extends FilterWriter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f336756b = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f336757a;

    public e(Writer writer, int i10) {
        super(writer);
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f336757a = i10;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int iMin = Math.min(i11, this.f336757a);
            ((FilterWriter) this).out.write(cArr, i10, iMin);
            i11 -= iMin;
            i10 += iMin;
        }
    }

    public e(Writer writer) {
        this(writer, 4096);
    }
}
