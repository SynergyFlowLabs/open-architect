package com.google.vr.sdk.proto.nano;

import com.google.vr.sdk.deps.e7;
import com.google.vr.sdk.deps.t2;
import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import com.planner5d.library.engine.input.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    public static final class a extends w6<a> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f129909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f129910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f129911f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f129912g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f129913h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f129914i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f129915j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f129916k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f129917l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public b f129918m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f129919n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Integer f129920o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f129921s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f129922t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public C1410c f129923v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.google.vr.sdk.proto.b.e f129924w;

        public a() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            Integer num;
            int iB = super.b();
            if ((this.f129908c & 1) != 0) {
                iB += u6.q(1) + 1;
            }
            if ((this.f129908c & 2) != 0) {
                iB += u6.q(2) + 1;
            }
            if ((this.f129908c & 4) != 0) {
                iB += u6.q(3) + 1;
            }
            if ((this.f129908c & 8) != 0) {
                iB += u6.q(4) + 1;
            }
            if ((this.f129908c & 16) != 0) {
                iB += u6.q(5) + 1;
            }
            if ((this.f129908c & 32) != 0) {
                iB += u6.q(6) + 1;
            }
            if ((this.f129908c & 64) != 0) {
                iB += u6.q(7) + 1;
            }
            if ((this.f129908c & 128) != 0) {
                iB += u6.q(8) + 1;
            }
            if ((this.f129908c & 256) != 0) {
                iB += u6.q(9) + 1;
            }
            b bVar = this.f129918m;
            if (bVar != null) {
                iB += u6.t(10, bVar);
            }
            if ((this.f129908c & 512) != 0) {
                iB += u6.q(11) + 1;
            }
            if ((this.f129908c & 1024) != 0 && (num = this.f129920o) != null) {
                iB += u6.r(12, num.intValue());
            }
            if ((this.f129908c & 2048) != 0) {
                iB += u6.q(13) + 1;
            }
            if ((this.f129908c & 4096) != 0) {
                iB += u6.q(14) + 1;
            }
            C1410c c1410c = this.f129923v;
            if (c1410c != null) {
                iB += u6.t(15, c1410c);
            }
            com.google.vr.sdk.proto.b.e eVar = this.f129924w;
            return eVar != null ? iB + t2.V(16, eVar) : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            Integer num;
            if ((this.f129908c & 1) != 0) {
                u6Var.n(1, this.f129909d);
            }
            if ((this.f129908c & 2) != 0) {
                u6Var.n(2, this.f129910e);
            }
            if ((this.f129908c & 4) != 0) {
                u6Var.n(3, this.f129911f);
            }
            if ((this.f129908c & 8) != 0) {
                u6Var.n(4, this.f129912g);
            }
            if ((this.f129908c & 16) != 0) {
                u6Var.n(5, this.f129913h);
            }
            if ((this.f129908c & 32) != 0) {
                u6Var.n(6, this.f129914i);
            }
            if ((this.f129908c & 64) != 0) {
                u6Var.n(7, this.f129915j);
            }
            if ((this.f129908c & 128) != 0) {
                u6Var.n(8, this.f129916k);
            }
            if ((this.f129908c & 256) != 0) {
                u6Var.n(9, this.f129917l);
            }
            b bVar = this.f129918m;
            if (bVar != null) {
                u6Var.l(10, bVar);
            }
            if ((this.f129908c & 512) != 0) {
                u6Var.n(11, this.f129919n);
            }
            if ((this.f129908c & 1024) != 0 && (num = this.f129920o) != null) {
                u6Var.i(12, num.intValue());
            }
            if ((this.f129908c & 2048) != 0) {
                u6Var.n(13, this.f129921s);
            }
            if ((this.f129908c & 4096) != 0) {
                u6Var.n(14, this.f129922t);
            }
            C1410c c1410c = this.f129923v;
            if (c1410c != null) {
                u6Var.l(15, c1410c);
            }
            com.google.vr.sdk.proto.b.e eVar = this.f129924w;
            if (eVar != null) {
                u6Var.k(16, eVar);
            }
            super.k(u6Var);
        }

        public final a p() {
            this.f129908c = 0;
            this.f129909d = false;
            this.f129910e = false;
            this.f129911f = false;
            this.f129912g = false;
            this.f129913h = false;
            this.f129914i = false;
            this.f129915j = false;
            this.f129916k = false;
            this.f129917l = false;
            this.f129918m = null;
            this.f129919n = false;
            com.google.vr.sdk.proto.b.c.EnumC1406b enumC1406b = com.google.vr.sdk.proto.b.c.EnumC1406b.NONE;
            this.f129920o = enumC1406b == null ? null : Integer.valueOf(enumC1406b.i());
            this.f129921s = false;
            this.f129922t = false;
            this.f129923v = null;
            this.f129924w = null;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final a l() {
            try {
                a aVar = (a) super.l();
                b bVar = this.f129918m;
                if (bVar != null) {
                    aVar.f129918m = bVar.l();
                }
                C1410c c1410c = this.f129923v;
                if (c1410c != null) {
                    aVar.f129923v = c1410c.l();
                }
                com.google.vr.sdk.proto.b.e eVar = this.f129924w;
                if (eVar != null) {
                    aVar.f129924w = eVar;
                }
                return aVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        public final boolean r() {
            return this.f129922t;
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final a e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                switch (iA) {
                    case 0:
                        break;
                    case 8:
                        this.f129909d = t6Var.k();
                        this.f129908c |= 1;
                        break;
                    case 16:
                        this.f129910e = t6Var.k();
                        this.f129908c |= 2;
                        break;
                    case 24:
                        this.f129911f = t6Var.k();
                        this.f129908c |= 4;
                        break;
                    case 32:
                        this.f129912g = t6Var.k();
                        this.f129908c |= 8;
                        break;
                    case 40:
                        this.f129913h = t6Var.k();
                        this.f129908c |= 16;
                        break;
                    case 48:
                        this.f129914i = t6Var.k();
                        this.f129908c |= 32;
                        break;
                    case f.b.f160729t0 /* 56 */:
                        this.f129915j = t6Var.k();
                        this.f129908c |= 64;
                        break;
                    case 64:
                        this.f129916k = t6Var.k();
                        this.f129908c |= 128;
                        break;
                    case 72:
                        this.f129917l = t6Var.k();
                        this.f129908c |= 256;
                        break;
                    case f.b.f160705l0 /* 82 */:
                        if (this.f129918m == null) {
                            this.f129918m = new b();
                        }
                        t6Var.e(this.f129918m);
                        break;
                    case f.b.f160696i0 /* 88 */:
                        this.f129919n = t6Var.k();
                        this.f129908c |= 512;
                        break;
                    case 96:
                        this.f129908c |= 1024;
                        int iT = t6Var.t();
                        int iG = t6Var.g();
                        if (iG == 0 || iG == 1 || iG == 2) {
                            this.f129920o = Integer.valueOf(iG);
                            this.f129908c |= 1024;
                        } else {
                            t6Var.o(iT);
                            n(t6Var, iA);
                        }
                        break;
                    case 104:
                        this.f129921s = t6Var.k();
                        this.f129908c |= 2048;
                        break;
                    case f.b.B /* 112 */:
                        this.f129922t = t6Var.k();
                        this.f129908c |= 4096;
                        break;
                    case 122:
                        if (this.f129923v == null) {
                            this.f129923v = new C1410c();
                        }
                        t6Var.e(this.f129923v);
                        break;
                    case 130:
                        com.google.vr.sdk.proto.b.e eVarBuild = (com.google.vr.sdk.proto.b.e) t6Var.b(com.google.vr.sdk.proto.b.e.C());
                        com.google.vr.sdk.proto.b.e eVar = this.f129924w;
                        if (eVar != null) {
                            eVarBuild = eVar.r1().l(eVarBuild).build();
                        }
                        this.f129924w = eVarBuild;
                        break;
                    default:
                        if (!super.n(t6Var, iA)) {
                        }
                        break;
                }
            }
            return this;
        }
    }

    public static final class b extends w6<b> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f129926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f129927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f129928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f129929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float[] f129930h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f129931i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f129932j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f129933k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f129934l;

        public b() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            if ((this.f129925c & 1) != 0) {
                iB += u6.q(1) + 4;
            }
            if ((this.f129925c & 2) != 0) {
                iB += u6.q(2) + 4;
            }
            if ((this.f129925c & 4) != 0) {
                iB += u6.q(3) + 4;
            }
            float[] fArr = this.f129929g;
            if (fArr != null && fArr.length > 0) {
                iB = iB + (fArr.length * 4) + fArr.length;
            }
            float[] fArr2 = this.f129930h;
            if (fArr2 != null && fArr2.length > 0) {
                iB = iB + (fArr2.length * 4) + fArr2.length;
            }
            if ((this.f129925c & 8) != 0) {
                iB += u6.q(6) + 4;
            }
            if ((this.f129925c & 16) != 0) {
                iB += u6.q(7) + 4;
            }
            if ((this.f129925c & 32) != 0) {
                iB += u6.q(8) + 4;
            }
            if ((this.f129925c & 64) != 0) {
                iB += u6.q(9) + 1;
            }
            return iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            if ((this.f129925c & 1) != 0) {
                u6Var.h(1, this.f129926d);
            }
            if ((this.f129925c & 2) != 0) {
                u6Var.h(2, this.f129927e);
            }
            if ((this.f129925c & 4) != 0) {
                u6Var.h(3, this.f129928f);
            }
            float[] fArr = this.f129929g;
            int i10 = 0;
            if (fArr != null && fArr.length > 0) {
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.f129929g;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    u6Var.h(4, fArr2[i11]);
                    i11++;
                }
            }
            float[] fArr3 = this.f129930h;
            if (fArr3 != null && fArr3.length > 0) {
                while (true) {
                    float[] fArr4 = this.f129930h;
                    if (i10 >= fArr4.length) {
                        break;
                    }
                    u6Var.h(5, fArr4[i10]);
                    i10++;
                }
            }
            if ((this.f129925c & 8) != 0) {
                u6Var.h(6, this.f129931i);
            }
            if ((this.f129925c & 16) != 0) {
                u6Var.h(7, this.f129932j);
            }
            if ((this.f129925c & 32) != 0) {
                u6Var.h(8, this.f129933k);
            }
            if ((this.f129925c & 64) != 0) {
                u6Var.n(9, this.f129934l);
            }
            super.k(u6Var);
        }

        public final b p() {
            this.f129925c = 0;
            this.f129926d = 0.0f;
            this.f129927e = 0.0f;
            this.f129928f = 0.0f;
            float[] fArr = e7.f129361b;
            this.f129929g = fArr;
            this.f129930h = fArr;
            this.f129931i = 0.0f;
            this.f129932j = 0.0f;
            this.f129933k = 0.0f;
            this.f129934l = true;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final b l() {
            try {
                b bVar = (b) super.l();
                float[] fArr = this.f129929g;
                if (fArr != null && fArr.length > 0) {
                    bVar.f129929g = (float[]) fArr.clone();
                }
                float[] fArr2 = this.f129930h;
                if (fArr2 != null && fArr2.length > 0) {
                    bVar.f129930h = (float[]) fArr2.clone();
                }
                return bVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final b e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                switch (iA) {
                    case 0:
                        break;
                    case 13:
                        this.f129926d = Float.intBitsToFloat(t6Var.r());
                        this.f129925c |= 1;
                        break;
                    case 21:
                        this.f129927e = Float.intBitsToFloat(t6Var.r());
                        this.f129925c |= 2;
                        break;
                    case 29:
                        this.f129928f = Float.intBitsToFloat(t6Var.r());
                        this.f129925c |= 4;
                        break;
                    case 34:
                        int iN = t6Var.n();
                        int iJ = t6Var.j(iN);
                        int i10 = iN / 4;
                        float[] fArr = this.f129929g;
                        int length = fArr == null ? 0 : fArr.length;
                        int i11 = i10 + length;
                        float[] fArr2 = new float[i11];
                        if (length != 0) {
                            System.arraycopy(fArr, 0, fArr2, 0, length);
                        }
                        while (length < i11) {
                            fArr2[length] = Float.intBitsToFloat(t6Var.r());
                            length++;
                        }
                        this.f129929g = fArr2;
                        t6Var.m(iJ);
                        break;
                    case 37:
                        int iA2 = e7.a(t6Var, 37);
                        float[] fArr3 = this.f129929g;
                        int length2 = fArr3 == null ? 0 : fArr3.length;
                        int i12 = iA2 + length2;
                        float[] fArr4 = new float[i12];
                        if (length2 != 0) {
                            System.arraycopy(fArr3, 0, fArr4, 0, length2);
                        }
                        while (length2 < i12 - 1) {
                            fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                            t6Var.a();
                            length2++;
                        }
                        fArr4[length2] = Float.intBitsToFloat(t6Var.r());
                        this.f129929g = fArr4;
                        break;
                    case 42:
                        int iN2 = t6Var.n();
                        int iJ2 = t6Var.j(iN2);
                        int i13 = iN2 / 4;
                        float[] fArr5 = this.f129930h;
                        int length3 = fArr5 == null ? 0 : fArr5.length;
                        int i14 = i13 + length3;
                        float[] fArr6 = new float[i14];
                        if (length3 != 0) {
                            System.arraycopy(fArr5, 0, fArr6, 0, length3);
                        }
                        while (length3 < i14) {
                            fArr6[length3] = Float.intBitsToFloat(t6Var.r());
                            length3++;
                        }
                        this.f129930h = fArr6;
                        t6Var.m(iJ2);
                        break;
                    case 45:
                        int iA3 = e7.a(t6Var, 45);
                        float[] fArr7 = this.f129930h;
                        int length4 = fArr7 == null ? 0 : fArr7.length;
                        int i15 = iA3 + length4;
                        float[] fArr8 = new float[i15];
                        if (length4 != 0) {
                            System.arraycopy(fArr7, 0, fArr8, 0, length4);
                        }
                        while (length4 < i15 - 1) {
                            fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                            t6Var.a();
                            length4++;
                        }
                        fArr8[length4] = Float.intBitsToFloat(t6Var.r());
                        this.f129930h = fArr8;
                        break;
                    case 53:
                        this.f129931i = Float.intBitsToFloat(t6Var.r());
                        this.f129925c |= 8;
                        break;
                    case 61:
                        this.f129932j = Float.intBitsToFloat(t6Var.r());
                        this.f129925c |= 16;
                        break;
                    case f.b.f160708m0 /* 69 */:
                        this.f129933k = Float.intBitsToFloat(t6Var.r());
                        this.f129925c |= 32;
                        break;
                    case 72:
                        this.f129934l = t6Var.k();
                        this.f129925c |= 64;
                        break;
                    default:
                        if (!super.n(t6Var, iA)) {
                        }
                        break;
                }
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.vr.sdk.proto.nano.c$c, reason: collision with other inner class name */
    public static final class C1410c extends w6<C1410c> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f129936d;

        public C1410c() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            Integer num;
            int iB = super.b();
            return ((this.f129935c & 1) == 0 || (num = this.f129936d) == null) ? iB : iB + u6.r(1, num.intValue());
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            Integer num;
            if ((this.f129935c & 1) != 0 && (num = this.f129936d) != null) {
                u6Var.i(1, num.intValue());
            }
            super.k(u6Var);
        }

        public final C1410c p() {
            this.f129935c = 0;
            com.google.vr.sdk.proto.b.EnumC1404b enumC1404b = com.google.vr.sdk.proto.b.EnumC1404b.GVR_CONTROLLER_CONFIGURATION_UNKNOWN;
            this.f129936d = enumC1404b == null ? null : Integer.valueOf(enumC1404b.i());
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final C1410c l() {
            try {
                return (C1410c) super.l();
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final C1410c e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 8) {
                    this.f129935c |= 1;
                    int iT = t6Var.t();
                    int iG = t6Var.g();
                    if (iG == 0 || iG == 1 || iG == 2 || iG == 3) {
                        this.f129936d = Integer.valueOf(iG);
                        this.f129935c |= 1;
                    } else {
                        t6Var.o(iT);
                        n(t6Var, iA);
                    }
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class d extends w6<d> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f129938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f129939e;

        public d() {
            q();
        }

        public static int p(int i10) {
            if (i10 >= 0 && i10 <= 1) {
                return i10;
            }
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append(i10);
            sb2.append(" is not a valid enum Handedness");
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            if ((this.f129937c & 1) != 0) {
                iB += u6.r(1, this.f129938d);
            }
            a aVar = this.f129939e;
            if (aVar != null) {
                iB += u6.t(2, aVar);
            }
            return iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            if ((this.f129937c & 1) != 0) {
                u6Var.i(1, this.f129938d);
            }
            a aVar = this.f129939e;
            if (aVar != null) {
                u6Var.l(2, aVar);
            }
            super.k(u6Var);
        }

        public final d q() {
            this.f129937c = 0;
            this.f129938d = 0;
            this.f129939e = null;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final d l() {
            try {
                d dVar = (d) super.l();
                a aVar = this.f129939e;
                if (aVar != null) {
                    dVar.f129939e = aVar.l();
                }
                return dVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        public final int s() {
            return this.f129938d;
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final d e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 8) {
                    this.f129937c |= 1;
                    int iT = t6Var.t();
                    try {
                        this.f129938d = p(t6Var.g());
                        this.f129937c |= 1;
                    } catch (IllegalArgumentException unused) {
                        t6Var.o(iT);
                        n(t6Var, iA);
                    }
                } else if (iA == 18) {
                    if (this.f129939e == null) {
                        this.f129939e = new a();
                    }
                    t6Var.e(this.f129939e);
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }

        public final d u(int i10) {
            this.f129938d = i10;
            this.f129937c |= 1;
            return this;
        }
    }
}
