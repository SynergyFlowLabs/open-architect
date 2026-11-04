package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
final class a implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f340460c = -8885321777449118786L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte f340461d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte f340462e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte f340463f = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f340464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f340465b;

    public a() {
    }

    static Object a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return c(dataInput.readByte(), dataInput);
    }

    static long b(DataInput dataInput) throws IOException {
        int i10 = dataInput.readByte() & 255;
        if (i10 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i10 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    private static Object c(byte b10, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b10 == 1) {
            return b.t(dataInput);
        }
        if (b10 == 2) {
            return e.z(dataInput);
        }
        if (b10 == 3) {
            return f.m(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    static s d(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? s.X(dataInput.readInt()) : s.X(b10 * 900);
    }

    static void e(Object obj, DataOutput dataOutput) throws IOException {
        g((byte) 1, obj, dataOutput);
    }

    static void f(long j10, DataOutput dataOutput) throws IOException {
        if (j10 < -4575744000L || j10 >= 10413792000L || j10 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j10);
        } else {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            dataOutput.writeByte((i10 >>> 16) & 255);
            dataOutput.writeByte((i10 >>> 8) & 255);
            dataOutput.writeByte(i10 & 255);
        }
    }

    private static void g(byte b10, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b10);
        if (b10 == 1) {
            ((b) obj).u(dataOutput);
        } else if (b10 == 2) {
            ((e) obj).D(dataOutput);
        } else {
            if (b10 != 3) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((f) obj).n(dataOutput);
        }
    }

    static void h(s sVar, DataOutput dataOutput) throws IOException {
        int iS = sVar.S();
        int i10 = iS % 900 == 0 ? iS / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(iS);
        }
    }

    private Object readResolve() {
        return this.f340465b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b10 = objectInput.readByte();
        this.f340464a = b10;
        this.f340465b = c(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        g(this.f340464a, this.f340465b, objectOutput);
    }

    a(byte b10, Object obj) {
        this.f340464a = b10;
        this.f340465b = obj;
    }
}
