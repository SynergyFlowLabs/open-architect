package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface j {
    int b(int length) throws InterruptedException, IOException;

    boolean d(int length, boolean allowEndOfInput) throws InterruptedException, IOException;

    boolean e(byte[] target, int offset, int length, boolean allowEndOfInput) throws InterruptedException, IOException;

    <E extends Throwable> void g(long position, E e10) throws Throwable;

    long getLength();

    long getPosition();

    void i(byte[] target, int offset, int length) throws InterruptedException, IOException;

    boolean k(byte[] target, int offset, int length, boolean allowEndOfInput) throws InterruptedException, IOException;

    void l();

    long m();

    void n(int length) throws InterruptedException, IOException;

    void o(int length) throws InterruptedException, IOException;

    boolean p(int length, boolean allowEndOfInput) throws InterruptedException, IOException;

    int read(byte[] target, int offset, int length) throws InterruptedException, IOException;

    void readFully(byte[] target, int offset, int length) throws InterruptedException, IOException;
}
