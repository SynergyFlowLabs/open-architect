package org.msgpack.core;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f339179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f339180b;

    public a(byte b10, int i10) {
        p.e(i10 >= 0, "length must be >= 0");
        this.f339179a = b10;
        this.f339180b = i10;
    }

    public static byte a(int i10) {
        p.e(-128 <= i10 && i10 <= 127, "Extension type code must be within the range of byte");
        return (byte) i10;
    }

    public int b() {
        return this.f339180b;
    }

    public byte c() {
        return this.f339179a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f339179a == aVar.f339179a && this.f339180b == aVar.f339180b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f339179a + com.google.common.base.c.I) * 31) + this.f339180b;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.f339179a), Integer.valueOf(this.f339180b));
    }
}
