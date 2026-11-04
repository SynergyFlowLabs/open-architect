package com.getkeepsafe.relinker.elf;

import com.rabbitmq.client.k0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.e2;

/* JADX INFO: loaded from: classes4.dex */
public class f implements Closeable, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102898a = 1179403647;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileChannel f102899b;

    public f(final File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f102899b = new FileInputStream(file).getChannel();
    }

    private long a(final c.b header, final long numEntries, final long vma) throws IOException {
        for (long j10 = 0; j10 < numEntries; j10++) {
            c.AbstractC0930c abstractC0930cB = header.b(j10);
            if (abstractC0930cB.f102891a == 1) {
                long j11 = abstractC0930cB.f102893c;
                if (j11 <= vma && vma <= abstractC0930cB.f102894d + j11) {
                    return (vma - j11) + abstractC0930cB.f102892b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public c.b b() throws IOException {
        this.f102899b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (j(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sE = e(byteBufferAllocate, 4L);
        boolean z10 = e(byteBufferAllocate, 5L) == 2;
        if (sE == 1) {
            return new d(z10, this);
        }
        if (sE == 2) {
            return new e(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> c() throws IOException {
        long j10;
        long j11;
        this.f102899b.position(0L);
        ArrayList arrayList = new ArrayList();
        c.b bVarB = b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVarB.f102880a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = bVarB.f102885f;
        int i10 = 0;
        if (j12 == okhttp3.internal.ws.g.f334653t) {
            j12 = bVarB.c(0).f102895a;
        }
        long j13 = 0;
        while (true) {
            j10 = 1;
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            c.AbstractC0930c abstractC0930cB = bVarB.b(j13);
            if (abstractC0930cB.f102891a == 2) {
                j11 = abstractC0930cB.f102892b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c.a aVarA = bVarB.a(j11, i10);
            long j15 = j10;
            long j16 = aVarA.f102875a;
            if (j16 == j15) {
                arrayList2.add(Long.valueOf(aVarA.f102876b));
            } else if (j16 == 5) {
                j14 = aVarA.f102876b;
            }
            i10++;
            if (aVarA.f102875a == 0) {
                break;
            }
            j10 = j15;
            j12 = j12;
        }
        if (j14 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(bVarB, j12, j14);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(h(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f102899b.close();
    }

    protected void d(final ByteBuffer buffer, long offset, final int length) throws IOException {
        buffer.position(0);
        buffer.limit(length);
        long j10 = 0;
        while (j10 < length) {
            int i10 = this.f102899b.read(buffer, offset + j10);
            if (i10 == -1) {
                throw new EOFException();
            }
            j10 += (long) i10;
        }
        buffer.position(0);
    }

    protected short e(final ByteBuffer buffer, final long offset) throws IOException {
        d(buffer, offset, 1);
        return (short) (buffer.get() & 255);
    }

    protected int f(final ByteBuffer buffer, final long offset) throws IOException {
        d(buffer, offset, 2);
        return buffer.getShort() & e2.f312492d;
    }

    protected long g(final ByteBuffer buffer, final long offset) throws IOException {
        d(buffer, offset, 8);
        return buffer.getLong();
    }

    protected String h(final ByteBuffer buffer, long offset) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j10 = 1 + offset;
            short sE = e(buffer, offset);
            if (sE == 0) {
                return sb2.toString();
            }
            sb2.append((char) sE);
            offset = j10;
        }
    }

    protected long j(final ByteBuffer buffer, final long offset) throws IOException {
        d(buffer, offset, 4);
        return ((long) buffer.getInt()) & k0.f265952a;
    }
}
