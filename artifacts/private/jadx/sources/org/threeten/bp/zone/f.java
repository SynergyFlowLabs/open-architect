package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.chrono.o;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f340518j = 6889046316657758795L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f340519k = 86400;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.threeten.bp.j f340520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f340521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.threeten.bp.d f340522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.i f340523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f340524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f340525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s f340526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f340527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s f340528i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340529a;

        static {
            int[] iArr = new int[b.values().length];
            f340529a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340529a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        UTC,
        WALL,
        STANDARD;

        static {
            int i10 = 5 >> 0;
        }

        public org.threeten.bp.h b(org.threeten.bp.h hVar, s sVar, s sVar2) {
            int i10 = a.f340529a[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? hVar : hVar.T0(sVar2.S() - sVar.S());
            }
            return hVar.T0(sVar2.S() - s.f340320n.S());
        }
    }

    f(org.threeten.bp.j jVar, int i10, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i11, b bVar, s sVar, s sVar2, s sVar3) {
        this.f340520a = jVar;
        this.f340521b = (byte) i10;
        this.f340522c = dVar;
        this.f340523d = iVar;
        this.f340524e = i11;
        this.f340525f = bVar;
        this.f340526g = sVar;
        this.f340527h = sVar2;
        this.f340528i = sVar3;
    }

    private void a(StringBuilder sb2, long j10) {
        if (j10 < 10) {
            sb2.append(0);
        }
        sb2.append(j10);
    }

    public static f l(org.threeten.bp.j jVar, int i10, org.threeten.bp.d dVar, org.threeten.bp.i iVar, boolean z10, b bVar, s sVar, s sVar2, s sVar3) {
        cn.d.j(jVar, "month");
        cn.d.j(iVar, "time");
        cn.d.j(bVar, "timeDefnition");
        cn.d.j(sVar, "standardOffset");
        cn.d.j(sVar2, "offsetBefore");
        cn.d.j(sVar3, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z10 || iVar.equals(org.threeten.bp.i.f340214g)) {
            return new f(jVar, i10, dVar, iVar, z10 ? 1 : 0, bVar, sVar, sVar2, sVar3);
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    static f m(DataInput dataInput) throws IOException {
        int i10 = dataInput.readInt();
        org.threeten.bp.j jVarL = org.threeten.bp.j.L(i10 >>> 28);
        int i11 = ((264241152 & i10) >>> 22) - 32;
        int i12 = (3670016 & i10) >>> 19;
        org.threeten.bp.d dVarZ = i12 == 0 ? null : org.threeten.bp.d.z(i12);
        int i13 = (507904 & i10) >>> 14;
        b bVar = b.values()[(i10 & 12288) >>> 12];
        int i14 = (i10 & 4080) >>> 4;
        int i15 = (i10 & 12) >>> 2;
        int i16 = i10 & 3;
        int i17 = i13 == 31 ? dataInput.readInt() : i13 * 3600;
        s sVarX = s.X(i14 == 255 ? dataInput.readInt() : (i14 - 128) * 900);
        s sVarX2 = i15 == 3 ? s.X(dataInput.readInt()) : s.X(sVarX.S() + (i15 * 1800));
        s sVarX3 = s.X(i16 == 3 ? dataInput.readInt() : sVarX.S() + (i16 * 1800));
        if (i11 < -28 || i11 > 31 || i11 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new f(jVarL, i11, dVarZ, org.threeten.bp.i.i0(cn.d.f(i17, f340519k)), cn.d.d(i17, f340519k), bVar, sVarX, sVarX2, sVarX3);
    }

    private Object writeReplace() {
        return new org.threeten.bp.zone.a((byte) 3, this);
    }

    public e b(int i10) {
        org.threeten.bp.g gVarD0;
        byte b10 = this.f340521b;
        if (b10 < 0) {
            org.threeten.bp.j jVar = this.f340520a;
            gVarD0 = org.threeten.bp.g.D0(i10, jVar, jVar.D(o.f339936e.isLeapYear(i10)) + 1 + this.f340521b);
            org.threeten.bp.d dVar = this.f340522c;
            if (dVar != null) {
                gVarD0 = gVarD0.s(org.threeten.bp.temporal.h.m(dVar));
            }
        } else {
            gVarD0 = org.threeten.bp.g.D0(i10, this.f340520a, b10);
            org.threeten.bp.d dVar2 = this.f340522c;
            if (dVar2 != null) {
                gVarD0 = gVarD0.s(org.threeten.bp.temporal.h.k(dVar2));
            }
        }
        return new e(this.f340525f.b(org.threeten.bp.h.H0(gVarD0.K0(this.f340524e), this.f340523d), this.f340526g, this.f340527h), this.f340527h, this.f340528i);
    }

    public int c() {
        return this.f340521b;
    }

    public org.threeten.bp.d d() {
        return this.f340522c;
    }

    public org.threeten.bp.i e() {
        return this.f340523d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f340520a == fVar.f340520a && this.f340521b == fVar.f340521b && this.f340522c == fVar.f340522c && this.f340525f == fVar.f340525f && this.f340524e == fVar.f340524e && this.f340523d.equals(fVar.f340523d) && this.f340526g.equals(fVar.f340526g) && this.f340527h.equals(fVar.f340527h) && this.f340528i.equals(fVar.f340528i)) {
                return true;
            }
        }
        return false;
    }

    public org.threeten.bp.j f() {
        return this.f340520a;
    }

    public s g() {
        return this.f340528i;
    }

    public s h() {
        return this.f340527h;
    }

    public int hashCode() {
        int iU0 = ((this.f340523d.u0() + this.f340524e) << 15) + (this.f340520a.ordinal() << 11) + ((this.f340521b + 32) << 5);
        org.threeten.bp.d dVar = this.f340522c;
        return this.f340528i.hashCode() ^ ((((iU0 + ((dVar == null ? 7 : dVar.ordinal()) << 2)) + this.f340525f.ordinal()) ^ this.f340526g.hashCode()) ^ this.f340527h.hashCode());
    }

    public s i() {
        return this.f340526g;
    }

    public b j() {
        return this.f340525f;
    }

    public boolean k() {
        return this.f340524e == 1 && this.f340523d.equals(org.threeten.bp.i.f340214g);
    }

    void n(DataOutput dataOutput) throws IOException {
        int iL;
        int iU0 = this.f340523d.u0() + (this.f340524e * f340519k);
        int iS = this.f340526g.S();
        int iS2 = this.f340527h.S() - iS;
        int iS3 = this.f340528i.S() - iS;
        if (iU0 % 3600 != 0 || iU0 > f340519k) {
            iL = 31;
        } else {
            iL = iU0 == f340519k ? 24 : this.f340523d.L();
        }
        int i10 = iS % 900 == 0 ? (iS / 900) + 128 : 255;
        int i11 = (iS2 == 0 || iS2 == 1800 || iS2 == 3600) ? iS2 / 1800 : 3;
        int i12 = (iS3 == 0 || iS3 == 1800 || iS3 == 3600) ? iS3 / 1800 : 3;
        org.threeten.bp.d dVar = this.f340522c;
        dataOutput.writeInt((this.f340520a.getValue() << 28) + ((this.f340521b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (iL << 14) + (this.f340525f.ordinal() << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (iL == 31) {
            dataOutput.writeInt(iU0);
        }
        if (i10 == 255) {
            dataOutput.writeInt(iS);
        }
        if (i11 == 3) {
            dataOutput.writeInt(this.f340527h.S());
        }
        if (i12 == 3) {
            dataOutput.writeInt(this.f340528i.S());
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TransitionRule[");
        sb2.append(this.f340527h.compareTo(this.f340528i) > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f340527h);
        sb2.append(" to ");
        sb2.append(this.f340528i);
        sb2.append(", ");
        org.threeten.bp.d dVar = this.f340522c;
        if (dVar != null) {
            byte b10 = this.f340521b;
            if (b10 == -1) {
                sb2.append(dVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f340520a.name());
            } else if (b10 < 0) {
                sb2.append(dVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f340521b) - 1);
                sb2.append(" of ");
                sb2.append(this.f340520a.name());
            } else {
                sb2.append(dVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f340520a.name());
                sb2.append(' ');
                sb2.append((int) this.f340521b);
            }
        } else {
            sb2.append(this.f340520a.name());
            sb2.append(' ');
            sb2.append((int) this.f340521b);
        }
        sb2.append(" at ");
        if (this.f340524e == 0) {
            sb2.append(this.f340523d);
        } else {
            long jU0 = (this.f340523d.u0() / 60) + (this.f340524e * 1440);
            a(sb2, cn.d.e(jU0, 60L));
            sb2.append(AbstractJsonLexerKt.COLON);
            a(sb2, cn.d.g(jU0, 60));
        }
        sb2.append(" ");
        sb2.append(this.f340525f);
        sb2.append(", standard offset ");
        sb2.append(this.f340526g);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
