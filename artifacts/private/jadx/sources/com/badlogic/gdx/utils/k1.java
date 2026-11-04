package com.badlogic.gdx.utils;

import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class k1 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final DataOutputStream f95637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f95638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f95639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b<a> f95640d = new b<>();

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f95641a;

        a(boolean z10) throws IOException {
            this.f95641a = z10;
            k1.this.f95637a.writeByte(z10 ? 91 : 123);
        }

        void a() throws IOException {
            k1.this.f95637a.writeByte(this.f95641a ? 93 : 125);
        }
    }

    public k1(OutputStream outputStream) {
        this.f95637a = (DataOutputStream) (outputStream instanceof DataOutputStream ? outputStream : new DataOutputStream(outputStream));
    }

    private void c() {
        a aVar = this.f95638b;
        if (aVar == null || aVar.f95641a) {
            return;
        }
        if (!this.f95639c) {
            throw new IllegalStateException("Name must be set.");
        }
        this.f95639c = false;
    }

    public k1 B0(Object obj) throws IOException {
        if (obj == null) {
            return g0();
        }
        if (!(obj instanceof Number)) {
            if (obj instanceof Character) {
                return k0(((Character) obj).charValue());
            }
            if (obj instanceof CharSequence) {
                return H0(obj.toString());
            }
            throw new IOException("Unknown object type.");
        }
        Number number = (Number) obj;
        if (obj instanceof Byte) {
            return j0(number.byteValue());
        }
        if (obj instanceof Short) {
            return M0(number.shortValue());
        }
        if (obj instanceof Integer) {
            return w0(number.intValue());
        }
        if (obj instanceof Long) {
            return x0(number.longValue());
        }
        if (obj instanceof Float) {
            return r0(number.floatValue());
        }
        return obj instanceof Double ? o0(number.doubleValue()) : this;
    }

    public k1 E(String str, boolean z10) throws IOException {
        return d(str).O0(z10);
    }

    public k1 H(String str, byte[] bArr) throws IOException {
        return d(str).Q0(bArr);
    }

    public k1 H0(String str) throws IOException {
        c();
        byte[] bytes = str.getBytes("UTF-8");
        this.f95637a.writeByte(83);
        if (bytes.length <= 127) {
            this.f95637a.writeByte(105);
            this.f95637a.writeByte(bytes.length);
        } else if (bytes.length <= 32767) {
            this.f95637a.writeByte(73);
            this.f95637a.writeShort(bytes.length);
        } else {
            this.f95637a.writeByte(108);
            this.f95637a.writeInt(bytes.length);
        }
        this.f95637a.write(bytes);
        return this;
    }

    public k1 I(String str, char[] cArr) throws IOException {
        return d(str).R0(cArr);
    }

    public k1 M0(short s10) throws IOException {
        c();
        this.f95637a.writeByte(73);
        this.f95637a.writeShort(s10);
        return this;
    }

    public k1 N(String str, double[] dArr) throws IOException {
        return d(str).T0(dArr);
    }

    public k1 O0(boolean z10) throws IOException {
        c();
        this.f95637a.writeByte(z10 ? 84 : 70);
        return this;
    }

    public k1 Q0(byte[] bArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(105);
        this.f95637a.writeByte(35);
        w0(bArr.length);
        for (byte b10 : bArr) {
            this.f95637a.writeByte(b10);
        }
        h(true);
        return this;
    }

    public k1 R(String str, float[] fArr) throws IOException {
        return d(str).U0(fArr);
    }

    public k1 R0(char[] cArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(73);
        this.f95637a.writeByte(35);
        w0(cArr.length);
        for (char c10 : cArr) {
            this.f95637a.writeChar(c10);
        }
        h(true);
        return this;
    }

    public k1 T(String str, int[] iArr) throws IOException {
        return d(str).b1(iArr);
    }

    public k1 T0(double[] dArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(100);
        this.f95637a.writeByte(35);
        w0(dArr.length);
        for (double d10 : dArr) {
            this.f95637a.writeDouble(d10);
        }
        h(true);
        return this;
    }

    public k1 U0(float[] fArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(100);
        this.f95637a.writeByte(35);
        w0(fArr.length);
        for (float f10 : fArr) {
            this.f95637a.writeFloat(f10);
        }
        h(true);
        return this;
    }

    public k1 X(String str, long[] jArr) throws IOException {
        return d(str).d1(jArr);
    }

    public k1 Y(String str, String[] strArr) throws IOException {
        return d(str).e1(strArr);
    }

    public k1 a() throws IOException {
        a aVar = this.f95638b;
        if (aVar != null && !aVar.f95641a) {
            if (!this.f95639c) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f95639c = false;
        }
        b<a> bVar = this.f95640d;
        a aVar2 = new a(true);
        this.f95638b = aVar2;
        bVar.c(aVar2);
        return this;
    }

    public k1 b(String str) throws IOException {
        d(str).a();
        return this;
    }

    public k1 b1(int[] iArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(108);
        this.f95637a.writeByte(35);
        w0(iArr.length);
        for (int i10 : iArr) {
            this.f95637a.writeInt(i10);
        }
        h(true);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        while (this.f95640d.f95174b > 0) {
            g();
        }
        this.f95637a.close();
    }

    public k1 d(String str) throws IOException {
        a aVar = this.f95638b;
        if (aVar == null || aVar.f95641a) {
            throw new IllegalStateException("Current item must be an object.");
        }
        byte[] bytes = str.getBytes("UTF-8");
        if (bytes.length <= 127) {
            this.f95637a.writeByte(105);
            this.f95637a.writeByte(bytes.length);
        } else if (bytes.length <= 32767) {
            this.f95637a.writeByte(73);
            this.f95637a.writeShort(bytes.length);
        } else {
            this.f95637a.writeByte(108);
            this.f95637a.writeInt(bytes.length);
        }
        this.f95637a.write(bytes);
        this.f95639c = true;
        return this;
    }

    public k1 d0(String str, short[] sArr) throws IOException {
        return d(str).g1(sArr);
    }

    public k1 d1(long[] jArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(73);
        this.f95637a.writeByte(35);
        w0(jArr.length);
        for (long j10 : jArr) {
            this.f95637a.writeLong(j10);
        }
        h(true);
        return this;
    }

    public k1 e() throws IOException {
        a aVar = this.f95638b;
        if (aVar != null && !aVar.f95641a) {
            if (!this.f95639c) {
                throw new IllegalStateException("Name must be set.");
            }
            this.f95639c = false;
        }
        b<a> bVar = this.f95640d;
        a aVar2 = new a(false);
        this.f95638b = aVar2;
        bVar.c(aVar2);
        return this;
    }

    public k1 e1(String[] strArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(83);
        this.f95637a.writeByte(35);
        w0(strArr.length);
        for (String str : strArr) {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= 127) {
                this.f95637a.writeByte(105);
                this.f95637a.writeByte(bytes.length);
            } else if (bytes.length <= 32767) {
                this.f95637a.writeByte(73);
                this.f95637a.writeShort(bytes.length);
            } else {
                this.f95637a.writeByte(108);
                this.f95637a.writeInt(bytes.length);
            }
            this.f95637a.write(bytes);
        }
        h(true);
        return this;
    }

    public k1 f(String str) throws IOException {
        d(str).e();
        return this;
    }

    public k1 f0(String str, boolean[] zArr) throws IOException {
        return d(str).h1(zArr);
    }

    public void flush() throws IOException {
        this.f95637a.flush();
    }

    public k1 g() throws IOException {
        return h(false);
    }

    public k1 g0() throws IOException {
        c();
        this.f95637a.writeByte(90);
        return this;
    }

    public k1 g1(short[] sArr) throws IOException {
        a();
        this.f95637a.writeByte(36);
        this.f95637a.writeByte(73);
        this.f95637a.writeByte(35);
        w0(sArr.length);
        for (short s10 : sArr) {
            this.f95637a.writeShort(s10);
        }
        h(true);
        return this;
    }

    protected k1 h(boolean z10) throws IOException {
        if (this.f95639c) {
            throw new IllegalStateException("Expected an object, array, or value since a name was set.");
        }
        if (z10) {
            this.f95640d.pop();
        } else {
            this.f95640d.pop().a();
        }
        b<a> bVar = this.f95640d;
        this.f95638b = bVar.f95174b == 0 ? null : bVar.peek();
        return this;
    }

    public k1 h1(boolean[] zArr) throws IOException {
        a();
        for (boolean z10 : zArr) {
            this.f95637a.writeByte(z10 ? 84 : 70);
        }
        g();
        return this;
    }

    public k1 j(String str) throws IOException {
        return d(str).g0();
    }

    public k1 j0(byte b10) throws IOException {
        c();
        this.f95637a.writeByte(105);
        this.f95637a.writeByte(b10);
        return this;
    }

    public k1 k0(char c10) throws IOException {
        c();
        this.f95637a.writeByte(73);
        this.f95637a.writeChar(c10);
        return this;
    }

    public k1 l(String str, byte b10) throws IOException {
        return d(str).j0(b10);
    }

    public k1 m(String str, char c10) throws IOException {
        return d(str).k0(c10);
    }

    public k1 o(String str, double d10) throws IOException {
        return d(str).o0(d10);
    }

    public k1 o0(double d10) throws IOException {
        c();
        this.f95637a.writeByte(68);
        this.f95637a.writeDouble(d10);
        return this;
    }

    public k1 q(String str, float f10) throws IOException {
        return d(str).r0(f10);
    }

    public k1 r(String str, int i10) throws IOException {
        return d(str).w0(i10);
    }

    public k1 r0(float f10) throws IOException {
        c();
        this.f95637a.writeByte(100);
        this.f95637a.writeFloat(f10);
        return this;
    }

    public k1 t(String str, long j10) throws IOException {
        return d(str).x0(j10);
    }

    public k1 w0(int i10) throws IOException {
        c();
        this.f95637a.writeByte(108);
        this.f95637a.writeInt(i10);
        return this;
    }

    public k1 x(String str, String str2) throws IOException {
        return d(str).H0(str2);
    }

    public k1 x0(long j10) throws IOException {
        c();
        this.f95637a.writeByte(76);
        this.f95637a.writeLong(j10);
        return this;
    }

    public k1 y(String str, short s10) throws IOException {
        return d(str).M0(s10);
    }

    public k1 y0(c0 c0Var) throws IOException {
        if (c0Var.F0()) {
            String str = c0Var.f95233e;
            if (str != null) {
                f(str);
            } else {
                e();
            }
            for (c0 c0Var2 = c0Var.f95234f; c0Var2 != null; c0Var2 = c0Var2.f95235g) {
                y0(c0Var2);
            }
            g();
            return this;
        }
        if (c0Var.t0()) {
            String str2 = c0Var.f95233e;
            if (str2 != null) {
                b(str2);
            } else {
                a();
            }
            for (c0 c0Var3 = c0Var.f95234f; c0Var3 != null; c0Var3 = c0Var3.f95235g) {
                y0(c0Var3);
            }
            g();
            return this;
        }
        if (c0Var.u0()) {
            String str3 = c0Var.f95233e;
            if (str3 != null) {
                d(str3);
            }
            O0(c0Var.c());
            return this;
        }
        if (c0Var.v0()) {
            String str4 = c0Var.f95233e;
            if (str4 != null) {
                d(str4);
            }
            o0(c0Var.p());
            return this;
        }
        if (c0Var.A0()) {
            String str5 = c0Var.f95233e;
            if (str5 != null) {
                d(str5);
            }
            x0(c0Var.w());
            return this;
        }
        if (c0Var.G0()) {
            String str6 = c0Var.f95233e;
            if (str6 != null) {
                d(str6);
            }
            H0(c0Var.D());
            return this;
        }
        if (!c0Var.C0()) {
            throw new IOException("Unhandled JsonValue type");
        }
        String str7 = c0Var.f95233e;
        if (str7 != null) {
            d(str7);
        }
        g0();
        return this;
    }
}
