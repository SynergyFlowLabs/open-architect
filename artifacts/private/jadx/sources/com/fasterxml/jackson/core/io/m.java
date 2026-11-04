package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.s;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class m implements s, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f102455f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f102456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f102457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected byte[] f102458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected char[] f102459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected transient String f102460e;

    public m(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f102456a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.f102460e = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f102456a);
    }

    @Override // com.fasterxml.jackson.core.s
    public int a(OutputStream outputStream) throws IOException {
        byte[] bArrF = this.f102457b;
        if (bArrF == null) {
            bArrF = com.fasterxml.jackson.core.util.b.f(this.f102456a);
            this.f102457b = bArrF;
        }
        int length = bArrF.length;
        outputStream.write(bArrF, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.s
    public final int b() {
        return this.f102456a.length();
    }

    @Override // com.fasterxml.jackson.core.s
    public final char[] c() {
        char[] cArrE = this.f102459d;
        if (cArrE == null) {
            cArrE = com.fasterxml.jackson.core.util.b.e(this.f102456a);
            this.f102459d = cArrE;
        }
        return cArrE;
    }

    @Override // com.fasterxml.jackson.core.s
    public final byte[] d() {
        byte[] bArr = this.f102457b;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrF = com.fasterxml.jackson.core.util.b.f(this.f102456a);
        this.f102457b = bArrF;
        return bArrF;
    }

    @Override // com.fasterxml.jackson.core.s
    public int e(byte[] bArr, int i10) {
        byte[] bArrF = this.f102457b;
        if (bArrF == null) {
            bArrF = com.fasterxml.jackson.core.util.b.f(this.f102456a);
            this.f102457b = bArrF;
        }
        int length = bArrF.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrF, 0, bArr, i10, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f102456a.equals(((m) obj).f102456a);
    }

    @Override // com.fasterxml.jackson.core.s
    public int f(char[] cArr, int i10) {
        String str = this.f102456a;
        int length = str.length();
        if (i10 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i10);
        return length;
    }

    @Override // com.fasterxml.jackson.core.s
    public int g(byte[] bArr, int i10) {
        byte[] bArrA = this.f102458c;
        if (bArrA == null) {
            bArrA = com.fasterxml.jackson.core.util.b.a(this.f102456a);
            this.f102458c = bArrA;
        }
        int length = bArrA.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrA, 0, bArr, i10, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.s
    public final String getValue() {
        return this.f102456a;
    }

    @Override // com.fasterxml.jackson.core.s
    public int h(ByteBuffer byteBuffer) {
        byte[] bArrA = this.f102458c;
        if (bArrA == null) {
            bArrA = com.fasterxml.jackson.core.util.b.a(this.f102456a);
            this.f102458c = bArrA;
        }
        int length = bArrA.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrA, 0, length);
        return length;
    }

    public final int hashCode() {
        return this.f102456a.hashCode();
    }

    @Override // com.fasterxml.jackson.core.s
    public int i(char[] cArr, int i10) {
        char[] cArrE = this.f102459d;
        if (cArrE == null) {
            cArrE = com.fasterxml.jackson.core.util.b.e(this.f102456a);
            this.f102459d = cArrE;
        }
        int length = cArrE.length;
        if (i10 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrE, 0, cArr, i10, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.s
    public int j(OutputStream outputStream) throws IOException {
        byte[] bArrA = this.f102458c;
        if (bArrA == null) {
            bArrA = com.fasterxml.jackson.core.util.b.a(this.f102456a);
            this.f102458c = bArrA;
        }
        int length = bArrA.length;
        outputStream.write(bArrA, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.s
    public int k(ByteBuffer byteBuffer) {
        byte[] bArrF = this.f102457b;
        if (bArrF == null) {
            bArrF = com.fasterxml.jackson.core.util.b.f(this.f102456a);
            this.f102457b = bArrF;
        }
        int length = bArrF.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArrF, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.s
    public final byte[] l() {
        byte[] bArr = this.f102458c;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrA = com.fasterxml.jackson.core.util.b.a(this.f102456a);
        this.f102458c = bArrA;
        return bArrA;
    }

    protected Object readResolve() {
        return new m(this.f102460e);
    }

    public final String toString() {
        return this.f102456a;
    }
}
