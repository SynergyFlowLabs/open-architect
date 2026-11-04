package org.threeten.bp.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes14.dex */
final class w implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f339978c = 7857518227608961174L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte f339979d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte f339980e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte f339981f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte f339982g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte f339983h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final byte f339984i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final byte f339985j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final byte f339986k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final byte f339987l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final byte f339988m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte f339989n = 13;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f339990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f339991b;

    public w() {
    }

    static Object a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return b(objectInput.readByte(), objectInput);
    }

    private static Object b(byte b10, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b10) {
            case 1:
                return r.z0(objectInput);
            case 2:
                return s.E(objectInput);
            case 3:
                return m.Y0(objectInput);
            case 4:
                return n.z(objectInput);
            case 5:
                return u.x0(objectInput);
            case 6:
                return v.x(objectInput);
            case 7:
                return y.x0(objectInput);
            case 8:
                return z.x(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return j.M(objectInput);
            case 12:
                return e.i0(objectInput);
            case 13:
                return i.i0(objectInput);
        }
    }

    private static void c(byte b10, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                ((r) obj).F0(objectOutput);
                return;
            case 2:
                ((s) obj).N(objectOutput);
                return;
            case 3:
                ((m) obj).c1(objectOutput);
                return;
            case 4:
                ((n) obj).D(objectOutput);
                return;
            case 5:
                ((u) obj).B0(objectOutput);
                return;
            case 6:
                ((v) obj).z(objectOutput);
                return;
            case 7:
                ((y) obj).B0(objectOutput);
                return;
            case 8:
                ((z) obj).z(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((j) obj).S(objectOutput);
                return;
            case 12:
                ((e) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((i) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.f339991b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b10 = objectInput.readByte();
        this.f339990a = b10;
        this.f339991b = b(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.f339990a, this.f339991b, objectOutput);
    }

    w(byte b10, Object obj) {
        this.f339990a = b10;
        this.f339991b = obj;
    }
}
