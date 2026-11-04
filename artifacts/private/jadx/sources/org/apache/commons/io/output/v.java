package org.apache.commons.io.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.input.a0;

/* JADX INFO: loaded from: classes14.dex */
public class v extends Writer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f336787f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Pattern f336788g = a0.f336572t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f336789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f336790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringWriter f336791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Writer f336792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f336793e;

    public v(OutputStream outputStream) {
        this(outputStream, (String) null);
    }

    private void a(char[] cArr, int i10, int i11) throws IOException {
        StringBuffer buffer = this.f336791c.getBuffer();
        int length = buffer.length() + i11 > 4096 ? 4096 - buffer.length() : i11;
        this.f336791c.write(cArr, i10, length);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int iIndexOf = buffer.indexOf("?>");
                if (iIndexOf > 0) {
                    Matcher matcher = f336788g.matcher(buffer.substring(0, iIndexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase();
                        this.f336793e = upperCase;
                        this.f336793e = upperCase.substring(1, upperCase.length() - 1);
                    } else {
                        this.f336793e = this.f336790b;
                    }
                } else if (buffer.length() >= 4096) {
                    this.f336793e = this.f336790b;
                }
            } else {
                this.f336793e = this.f336790b;
            }
            if (this.f336793e != null) {
                this.f336791c = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f336789a, this.f336793e);
                this.f336792d = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i11 > length) {
                    this.f336792d.write(cArr, i10 + length, i11 - length);
                }
            }
        }
    }

    public String b() {
        return this.f336790b;
    }

    public String c() {
        return this.f336793e;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f336792d == null) {
            this.f336793e = this.f336790b;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f336789a, this.f336793e);
            this.f336792d = outputStreamWriter;
            outputStreamWriter.write(this.f336791c.toString());
        }
        this.f336792d.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.f336792d;
        if (writer != null) {
            writer.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        if (this.f336791c != null) {
            a(cArr, i10, i11);
        } else {
            this.f336792d.write(cArr, i10, i11);
        }
    }

    public v(OutputStream outputStream, String str) {
        this.f336791c = new StringWriter(4096);
        this.f336789a = outputStream;
        if (str == null) {
            str = "UTF-8";
        }
        this.f336790b = str;
    }

    public v(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    public v(File file, String str) throws FileNotFoundException {
        this(new FileOutputStream(file), str);
    }
}
