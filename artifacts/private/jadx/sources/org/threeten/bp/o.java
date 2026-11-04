package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes14.dex */
final class o implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f340277c = -7683839454370182990L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final byte f340278d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final byte f340279e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final byte f340280f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final byte f340281g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final byte f340282h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final byte f340283i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final byte f340284j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final byte f340285k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final byte f340286l = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final byte f340287m = 66;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte f340288n = 67;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final byte f340289o = 68;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final byte f340290s = 69;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f340291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f340292b;

    public o() {
    }

    static Object a(DataInput dataInput) throws IOException {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b10, DataInput dataInput) throws IOException {
        if (b10 == 64) {
            return k.Y(dataInput);
        }
        switch (b10) {
            case 1:
                return e.n0(dataInput);
            case 2:
                return f.j0(dataInput);
            case 3:
                return g.O0(dataInput);
            case 4:
                return h.X0(dataInput);
            case 5:
                return i.s0(dataInput);
            case 6:
                return u.Y0(dataInput);
            case 7:
                return t.R(dataInput);
            case 8:
                return s.Z(dataInput);
            default:
                switch (b10) {
                    case 66:
                        return m.o0(dataInput);
                    case 67:
                        return p.h0(dataInput);
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        return q.j0(dataInput);
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        return l.E0(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    static void c(byte b10, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b10);
        if (b10 == 64) {
            ((k) obj).d0(dataOutput);
            return;
        }
        switch (b10) {
            case 1:
                ((e) obj).C0(dataOutput);
                return;
            case 2:
                ((f) obj).p0(dataOutput);
                return;
            case 3:
                ((g) obj).X0(dataOutput);
                return;
            case 4:
                ((h) obj).l1(dataOutput);
                return;
            case 5:
                ((i) obj).C0(dataOutput);
                return;
            case 6:
                ((u) obj).w1(dataOutput);
                return;
            case 7:
                ((t) obj).S(dataOutput);
                return;
            case 8:
                ((s) obj).d0(dataOutput);
                return;
            default:
                switch (b10) {
                    case 66:
                        ((m) obj).B0(dataOutput);
                        return;
                    case 67:
                        ((p) obj).k0(dataOutput);
                        return;
                    case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        ((q) obj).p0(dataOutput);
                        return;
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        ((l) obj).Z0(dataOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f340292b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        this.f340291a = b10;
        this.f340292b = b(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.f340291a, this.f340292b, objectOutput);
    }

    o(byte b10, Object obj) {
        this.f340291a = b10;
        this.f340292b = obj;
    }
}
