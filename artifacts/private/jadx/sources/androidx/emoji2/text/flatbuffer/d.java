package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f51112a;

    public d(ByteBuffer byteBuffer) {
        this.f51112a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void E(int i10, boolean z10) {
        h(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public byte[] K() {
        return this.f51112a.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void X(int i10, int i11) {
        g(i10 + 4);
        this.f51112a.putInt(i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void a(float f10) {
        this.f51112a.putFloat(f10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void b(int i10) {
        this.f51112a.putInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void c(long j10) {
        this.f51112a.putLong(j10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void d(double d10) {
        this.f51112a.putDouble(d10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void d0(int i10, float f10) {
        g(i10 + 4);
        this.f51112a.putFloat(i10, f10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void e(short s10) {
        this.f51112a.putShort(s10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void f(boolean z10) {
        this.f51112a.put(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public boolean g(int i10) {
        return i10 <= this.f51112a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void g0(int i10, double d10) {
        g(i10 + 8);
        this.f51112a.putDouble(i10, d10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public byte get(int i10) {
        return this.f51112a.get(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public double getDouble(int i10) {
        return this.f51112a.getDouble(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public float getFloat(int i10) {
        return this.f51112a.getFloat(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int getInt(int i10) {
        return this.f51112a.getInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public long getLong(int i10) {
        return this.f51112a.getLong(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public short getShort(int i10) {
        return this.f51112a.getShort(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void h(int i10, byte b10) {
        g(i10 + 1);
        this.f51112a.put(i10, b10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public int i() {
        return this.f51112a.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void j(byte b10) {
        this.f51112a.put(b10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean j0(int i10) {
        return get(i10) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void k(int i10, byte[] bArr, int i11, int i12) {
        g((i12 - i11) + i10);
        int iPosition = this.f51112a.position();
        this.f51112a.position(i10);
        this.f51112a.put(bArr, i11, i12);
        this.f51112a.position(iPosition);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void k0(int i10, long j10) {
        g(i10 + 8);
        this.f51112a.putLong(i10, j10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public String l(int i10, int i11) {
        return a0.h(this.f51112a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.r, androidx.emoji2.text.flatbuffer.q
    public int limit() {
        return this.f51112a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void m(int i10, short s10) {
        g(i10 + 2);
        this.f51112a.putShort(i10, s10);
    }

    @Override // androidx.emoji2.text.flatbuffer.r
    public void n(byte[] bArr, int i10, int i11) {
        this.f51112a.put(bArr, i10, i11);
    }
}
