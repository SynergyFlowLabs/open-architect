package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
public class p extends FilterWriter {
    public p(Writer writer) {
        super(writer);
    }

    protected void a(int i10) throws IOException {
    }

    protected void b(int i10) throws IOException {
    }

    protected void c(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterWriter) this).out.close();
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i10) throws IOException {
        try {
            b(1);
            ((FilterWriter) this).out.write(i10);
            a(1);
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        try {
            b(1);
            ((FilterWriter) this).out.append(c10);
            a(1);
            return this;
        } catch (IOException e10) {
            c(e10);
            return this;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        int length;
        if (cArr != null) {
            try {
                length = cArr.length;
            } catch (IOException e10) {
                c(e10);
                return;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterWriter) this).out.write(cArr);
        a(length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        int i12 = i11 - i10;
        try {
            b(i12);
            ((FilterWriter) this).out.append(charSequence, i10, i11);
            a(i12);
            return this;
        } catch (IOException e10) {
            c(e10);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        try {
            b(i11);
            ((FilterWriter) this).out.write(cArr, i10, i11);
            a(i11);
        } catch (IOException e10) {
            c(e10);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        int length;
        if (charSequence != null) {
            try {
                length = charSequence.length();
            } catch (IOException e10) {
                c(e10);
                return this;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterWriter) this).out.append(charSequence);
        a(length);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        int length;
        if (str != null) {
            try {
                length = str.length();
            } catch (IOException e10) {
                c(e10);
                return;
            }
        } else {
            length = 0;
        }
        b(length);
        ((FilterWriter) this).out.write(str);
        a(length);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        try {
            b(i11);
            ((FilterWriter) this).out.write(str, i10, i11);
            a(i11);
        } catch (IOException e10) {
            c(e10);
        }
    }
}
