package com.google.vr.sdk.proto.nano;

import com.google.vr.sdk.deps.a7;
import com.google.vr.sdk.deps.e7;
import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: com.google.vr.sdk.proto.nano.a$a, reason: collision with other inner class name */
    public static final class C1409a extends w6<C1409a> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f129864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f129865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f129866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f129867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f129868h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f129869i;

        public C1409a() {
            q();
        }

        public static int p(int i10) {
            if (i10 >= 0 && i10 <= 7) {
                return i10;
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append(i10);
            sb2.append(" is not a valid enum OrientationType");
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            int[] iArr = this.f129864d;
            if (iArr != null && iArr.length > 0) {
                int i10 = 0;
                int iA = 0;
                while (true) {
                    int[] iArr2 = this.f129864d;
                    if (i10 >= iArr2.length) {
                        break;
                    }
                    iA += u6.a(iArr2[i10]);
                    i10++;
                }
                iB = iB + iA + 1 + u6.z(iA);
            }
            if ((this.f129863c & 1) != 0) {
                iB += u6.q(2) + 4;
            }
            if ((this.f129863c & 2) != 0) {
                iB += u6.q(3) + 4;
            }
            if ((this.f129863c & 4) != 0) {
                iB += u6.q(4) + 4;
            }
            if ((this.f129863c & 8) != 0) {
                iB += u6.u(5, this.f129868h);
            }
            return (this.f129863c & 16) != 0 ? iB + u6.u(6, this.f129869i) : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            int[] iArr = this.f129864d;
            if (iArr != null && iArr.length > 0) {
                int i10 = 0;
                int i11 = 0;
                int iA = 0;
                while (true) {
                    int[] iArr2 = this.f129864d;
                    if (i11 >= iArr2.length) {
                        break;
                    }
                    iA += u6.a(iArr2[i11]);
                    i11++;
                }
                u6Var.x(10);
                u6Var.x(iA);
                while (true) {
                    int[] iArr3 = this.f129864d;
                    if (i10 >= iArr3.length) {
                        break;
                    }
                    u6Var.x(iArr3[i10]);
                    i10++;
                }
            }
            if ((this.f129863c & 1) != 0) {
                u6Var.h(2, this.f129865e);
            }
            if ((this.f129863c & 2) != 0) {
                int i12 = 4 << 3;
                u6Var.h(3, this.f129866f);
            }
            if ((this.f129863c & 4) != 0) {
                u6Var.h(4, this.f129867g);
            }
            if ((this.f129863c & 8) != 0) {
                u6Var.m(5, this.f129868h);
            }
            if ((this.f129863c & 16) != 0) {
                u6Var.m(6, this.f129869i);
            }
            super.k(u6Var);
        }

        public final C1409a q() {
            this.f129863c = 0;
            this.f129864d = e7.f129360a;
            this.f129865e = 0.0f;
            this.f129866f = 0.0f;
            this.f129867g = 0.0f;
            this.f129868h = "";
            this.f129869i = "";
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final C1409a l() {
            try {
                C1409a c1409a = (C1409a) super.l();
                int[] iArr = this.f129864d;
                if (iArr != null && iArr.length > 0) {
                    c1409a.f129864d = (int[]) iArr.clone();
                }
                return c1409a;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final C1409a e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA != 8) {
                    if (iA != 10) {
                        if (iA != 21) {
                            if (iA != 29) {
                                if (iA != 37) {
                                    if (iA != 42) {
                                        if (iA != 50) {
                                            if (!super.n(t6Var, iA)) {
                                                break;
                                            }
                                        } else {
                                            this.f129869i = t6Var.l();
                                            this.f129863c |= 16;
                                        }
                                    } else {
                                        this.f129868h = t6Var.l();
                                        this.f129863c |= 8;
                                    }
                                } else {
                                    this.f129867g = Float.intBitsToFloat(t6Var.r());
                                    this.f129863c |= 4;
                                }
                            } else {
                                this.f129866f = Float.intBitsToFloat(t6Var.r());
                                this.f129863c |= 2;
                            }
                        } else {
                            this.f129865e = Float.intBitsToFloat(t6Var.r());
                            this.f129863c |= 1;
                        }
                    } else {
                        int iJ = t6Var.j(t6Var.n());
                        int iT = t6Var.t();
                        int i10 = 0;
                        while (t6Var.s() > 0) {
                            try {
                                p(t6Var.g());
                                i10++;
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        if (i10 != 0) {
                            t6Var.o(iT);
                            int[] iArr = this.f129864d;
                            int length = iArr == null ? 0 : iArr.length;
                            int[] iArr2 = new int[i10 + length];
                            if (length != 0) {
                                System.arraycopy(iArr, 0, iArr2, 0, length);
                            }
                            while (t6Var.s() > 0) {
                                int iT2 = t6Var.t();
                                try {
                                    iArr2[length] = p(t6Var.g());
                                    length++;
                                } catch (IllegalArgumentException unused2) {
                                    t6Var.o(iT2);
                                    n(t6Var, 8);
                                }
                            }
                            this.f129864d = iArr2;
                        }
                        t6Var.m(iJ);
                    }
                } else {
                    int iA2 = e7.a(t6Var, 8);
                    int[] iArr3 = new int[iA2];
                    int i11 = 0;
                    for (int i12 = 0; i12 < iA2; i12++) {
                        if (i12 != 0) {
                            t6Var.a();
                        }
                        int iT3 = t6Var.t();
                        try {
                            iArr3[i11] = p(t6Var.g());
                            i11++;
                        } catch (IllegalArgumentException unused3) {
                            t6Var.o(iT3);
                            n(t6Var, iA);
                        }
                    }
                    if (i11 != 0) {
                        int[] iArr4 = this.f129864d;
                        int length2 = iArr4 == null ? 0 : iArr4.length;
                        if (length2 == 0 && i11 == iA2) {
                            this.f129864d = iArr3;
                        } else {
                            int[] iArr5 = new int[length2 + i11];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            System.arraycopy(iArr3, 0, iArr5, length2, i11);
                            this.f129864d = iArr5;
                        }
                    }
                }
            }
            return this;
        }
    }

    public static final class b extends w6<b> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f129871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e[] f129872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f129873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f129874g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f f129875h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f129876i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f129877j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f129878k;

        public b() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            if ((this.f129870c & 1) != 0) {
                iB += u6.r(1, this.f129871d);
            }
            e[] eVarArr = this.f129872e;
            if (eVarArr != null && eVarArr.length > 0) {
                int i10 = 0;
                while (true) {
                    e[] eVarArr2 = this.f129872e;
                    if (i10 >= eVarArr2.length) {
                        break;
                    }
                    e eVar = eVarArr2[i10];
                    if (eVar != null) {
                        iB += u6.t(2, eVar);
                    }
                    i10++;
                }
            }
            if ((this.f129870c & 2) != 0) {
                iB += u6.q(3) + 1;
            }
            if ((this.f129870c & 4) != 0) {
                iB += u6.q(4) + 1;
            }
            f fVar = this.f129875h;
            if (fVar != null) {
                iB += u6.t(5, fVar);
            }
            if ((this.f129870c & 8) != 0) {
                iB += u6.r(6, this.f129876i);
            }
            if ((this.f129870c & 16) != 0) {
                iB += u6.q(7) + 1;
            }
            return (this.f129870c & 32) != 0 ? iB + u6.q(8) + 1 : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            if ((this.f129870c & 1) != 0) {
                u6Var.i(1, this.f129871d);
            }
            e[] eVarArr = this.f129872e;
            if (eVarArr != null && eVarArr.length > 0) {
                int i10 = 0;
                while (true) {
                    e[] eVarArr2 = this.f129872e;
                    if (i10 >= eVarArr2.length) {
                        break;
                    }
                    e eVar = eVarArr2[i10];
                    if (eVar != null) {
                        u6Var.l(2, eVar);
                    }
                    i10++;
                }
            }
            if ((this.f129870c & 2) != 0) {
                u6Var.n(3, this.f129873f);
            }
            if ((this.f129870c & 4) != 0) {
                u6Var.n(4, this.f129874g);
            }
            f fVar = this.f129875h;
            if (fVar != null) {
                u6Var.l(5, fVar);
            }
            if ((this.f129870c & 8) != 0) {
                u6Var.i(6, this.f129876i);
            }
            if ((this.f129870c & 16) != 0) {
                u6Var.n(7, this.f129877j);
            }
            if ((this.f129870c & 32) != 0) {
                u6Var.n(8, this.f129878k);
            }
            super.k(u6Var);
        }

        public final b p() {
            this.f129870c = 0;
            this.f129871d = 0;
            this.f129872e = e.r();
            this.f129873f = false;
            this.f129874g = false;
            this.f129875h = null;
            this.f129876i = 40;
            this.f129877j = true;
            this.f129878k = false;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final b l() {
            try {
                b bVar = (b) super.l();
                e[] eVarArr = this.f129872e;
                if (eVarArr != null && eVarArr.length > 0) {
                    bVar.f129872e = new e[eVarArr.length];
                    int i10 = 0;
                    while (true) {
                        e[] eVarArr2 = this.f129872e;
                        if (i10 >= eVarArr2.length) {
                            break;
                        }
                        e eVar = eVarArr2[i10];
                        if (eVar != null) {
                            bVar.f129872e[i10] = eVar.l();
                        }
                        i10++;
                    }
                }
                f fVar = this.f129875h;
                if (fVar != null) {
                    bVar.f129875h = fVar.l();
                }
                return bVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        public final boolean r() {
            return this.f129873f;
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final b e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 8) {
                    this.f129871d = t6Var.g();
                    this.f129870c |= 1;
                } else if (iA == 18) {
                    int iA2 = e7.a(t6Var, 18);
                    e[] eVarArr = this.f129872e;
                    int length = eVarArr == null ? 0 : eVarArr.length;
                    int i10 = iA2 + length;
                    e[] eVarArr2 = new e[i10];
                    if (length != 0) {
                        System.arraycopy(eVarArr, 0, eVarArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        e eVar = new e();
                        eVarArr2[length] = eVar;
                        t6Var.e(eVar);
                        t6Var.a();
                        length++;
                    }
                    e eVar2 = new e();
                    eVarArr2[length] = eVar2;
                    t6Var.e(eVar2);
                    this.f129872e = eVarArr2;
                } else if (iA == 24) {
                    this.f129873f = t6Var.k();
                    this.f129870c |= 2;
                } else if (iA == 32) {
                    this.f129874g = t6Var.k();
                    this.f129870c |= 4;
                } else if (iA == 42) {
                    if (this.f129875h == null) {
                        this.f129875h = new f();
                    }
                    t6Var.e(this.f129875h);
                } else if (iA == 48) {
                    this.f129876i = t6Var.g();
                    this.f129870c |= 8;
                } else if (iA == 56) {
                    this.f129877j = t6Var.k();
                    this.f129870c |= 16;
                } else if (iA == 64) {
                    this.f129878k = t6Var.k();
                    this.f129870c |= 32;
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class c extends w6<c> implements Cloneable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static volatile c[] f129879v;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f129881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f129882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f129883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f129884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float[] f129885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f129886i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f129887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float[] f129888k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float[] f129889l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float[] f129890m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f129891n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Integer f129892o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public C1409a f129893s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public b f129894t;

        public c() {
            p();
        }

        public static c[] r() {
            if (f129879v == null) {
                synchronized (a7.f127704b) {
                    try {
                        if (f129879v == null) {
                            f129879v = new c[0];
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f129879v;
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public final c e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                switch (iA) {
                    case 0:
                        break;
                    case 10:
                        this.f129881d = t6Var.l();
                        this.f129880c |= 1;
                        continue;
                    case 18:
                        this.f129882e = t6Var.l();
                        this.f129880c |= 2;
                        continue;
                    case 29:
                        this.f129883f = Float.intBitsToFloat(t6Var.r());
                        this.f129880c |= 4;
                        continue;
                    case 37:
                        this.f129884g = Float.intBitsToFloat(t6Var.r());
                        this.f129880c |= 8;
                        continue;
                    case 42:
                        int iN = t6Var.n();
                        int iJ = t6Var.j(iN);
                        int i10 = iN / 4;
                        float[] fArr = this.f129885h;
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
                        this.f129885h = fArr2;
                        t6Var.m(iJ);
                        continue;
                    case 45:
                        int iA2 = e7.a(t6Var, 45);
                        float[] fArr3 = this.f129885h;
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
                        this.f129885h = fArr4;
                        continue;
                    case 53:
                        this.f129887j = Float.intBitsToFloat(t6Var.r());
                        this.f129880c |= 32;
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                        int iN2 = t6Var.n();
                        int iJ2 = t6Var.j(iN2);
                        int i13 = iN2 / 4;
                        float[] fArr5 = this.f129888k;
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
                        this.f129888k = fArr6;
                        t6Var.m(iJ2);
                        continue;
                    case 61:
                        int iA3 = e7.a(t6Var, 61);
                        float[] fArr7 = this.f129888k;
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
                        this.f129888k = fArr8;
                        continue;
                    case 66:
                        int iN3 = t6Var.n();
                        int iJ3 = t6Var.j(iN3);
                        int i16 = iN3 / 4;
                        float[] fArr9 = this.f129889l;
                        int length5 = fArr9 == null ? 0 : fArr9.length;
                        int i17 = i16 + length5;
                        float[] fArr10 = new float[i17];
                        if (length5 != 0) {
                            System.arraycopy(fArr9, 0, fArr10, 0, length5);
                        }
                        while (length5 < i17) {
                            fArr10[length5] = Float.intBitsToFloat(t6Var.r());
                            length5++;
                        }
                        this.f129889l = fArr10;
                        t6Var.m(iJ3);
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        int iA4 = e7.a(t6Var, 69);
                        float[] fArr11 = this.f129889l;
                        int length6 = fArr11 == null ? 0 : fArr11.length;
                        int i18 = iA4 + length6;
                        float[] fArr12 = new float[i18];
                        if (length6 != 0) {
                            System.arraycopy(fArr11, 0, fArr12, 0, length6);
                        }
                        while (length6 < i18 - 1) {
                            fArr12[length6] = Float.intBitsToFloat(t6Var.r());
                            t6Var.a();
                            length6++;
                        }
                        fArr12[length6] = Float.intBitsToFloat(t6Var.r());
                        this.f129889l = fArr12;
                        continue;
                    case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                        int iN4 = t6Var.n();
                        int iJ4 = t6Var.j(iN4);
                        int i19 = iN4 / 4;
                        float[] fArr13 = this.f129890m;
                        int length7 = fArr13 == null ? 0 : fArr13.length;
                        int i20 = i19 + length7;
                        float[] fArr14 = new float[i20];
                        if (length7 != 0) {
                            System.arraycopy(fArr13, 0, fArr14, 0, length7);
                        }
                        while (length7 < i20) {
                            fArr14[length7] = Float.intBitsToFloat(t6Var.r());
                            length7++;
                        }
                        this.f129890m = fArr14;
                        t6Var.m(iJ4);
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                        int iA5 = e7.a(t6Var, 77);
                        float[] fArr15 = this.f129890m;
                        int length8 = fArr15 == null ? 0 : fArr15.length;
                        int i21 = iA5 + length8;
                        float[] fArr16 = new float[i21];
                        if (length8 != 0) {
                            System.arraycopy(fArr15, 0, fArr16, 0, length8);
                        }
                        while (length8 < i21 - 1) {
                            fArr16[length8] = Float.intBitsToFloat(t6Var.r());
                            t6Var.a();
                            length8++;
                        }
                        fArr16[length8] = Float.intBitsToFloat(t6Var.r());
                        this.f129890m = fArr16;
                        continue;
                    case 80:
                        this.f129891n = t6Var.k();
                        this.f129880c |= 64;
                        continue;
                    case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                        this.f129880c |= 16;
                        int iT = t6Var.t();
                        int iG = t6Var.g();
                        if (iG == 0 || iG == 1 || iG == 2) {
                            this.f129886i = Integer.valueOf(iG);
                            this.f129880c |= 16;
                            continue;
                        } else {
                            t6Var.o(iT);
                            n(t6Var, iA);
                        }
                        break;
                    case 96:
                        this.f129880c |= 128;
                        int iT2 = t6Var.t();
                        int iG2 = t6Var.g();
                        if (iG2 == 0 || iG2 == 1 || iG2 == 2 || iG2 == 3) {
                            this.f129892o = Integer.valueOf(iG2);
                            this.f129880c |= 128;
                            continue;
                        } else {
                            t6Var.o(iT2);
                            n(t6Var, iA);
                        }
                        break;
                    case 13834:
                        if (this.f129893s == null) {
                            this.f129893s = new C1409a();
                        }
                        t6Var.e(this.f129893s);
                        continue;
                    case 1575066:
                        if (this.f129894t == null) {
                            this.f129894t = new b();
                        }
                        t6Var.e(this.f129894t);
                        continue;
                    default:
                        if (!super.n(t6Var, iA)) {
                        }
                        break;
                }
            }
            return this;
        }

        public final c B(boolean z10) {
            this.f129880c |= 64;
            this.f129891n = z10;
            return this;
        }

        public final c C(float f10) {
            this.f129880c |= 8;
            this.f129884g = f10;
            return this;
        }

        public final c D(String str) {
            str.getClass();
            this.f129880c |= 2;
            this.f129882e = str;
            return this;
        }

        public final c E(float f10) {
            this.f129880c |= 4;
            this.f129883f = f10;
            return this;
        }

        public final c F(float f10) {
            this.f129880c |= 32;
            this.f129887j = f10;
            return this;
        }

        public final c G(String str) {
            str.getClass();
            this.f129880c |= 1;
            this.f129881d = str;
            return this;
        }

        public final c H(com.google.vr.sdk.proto.a.f.c cVar) {
            this.f129886i = cVar == null ? null : Integer.valueOf(cVar.i());
            this.f129880c |= 16;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            Integer num;
            Integer num2;
            int iB = super.b();
            if ((this.f129880c & 1) != 0) {
                iB += u6.u(1, this.f129881d);
            }
            if ((this.f129880c & 2) != 0) {
                iB += u6.u(2, this.f129882e);
            }
            if ((this.f129880c & 4) != 0) {
                iB += u6.q(3) + 4;
            }
            if ((this.f129880c & 8) != 0) {
                iB += u6.q(4) + 4;
            }
            float[] fArr = this.f129885h;
            if (fArr != null && fArr.length > 0) {
                int length = fArr.length * 4;
                iB = iB + length + 1 + u6.z(length);
            }
            if ((this.f129880c & 32) != 0) {
                iB += u6.q(6) + 4;
            }
            float[] fArr2 = this.f129888k;
            if (fArr2 != null && fArr2.length > 0) {
                int length2 = fArr2.length * 4;
                iB = iB + length2 + 1 + u6.z(length2);
            }
            float[] fArr3 = this.f129889l;
            if (fArr3 != null && fArr3.length > 0) {
                int length3 = fArr3.length * 4;
                iB = iB + length3 + 1 + u6.z(length3);
            }
            float[] fArr4 = this.f129890m;
            if (fArr4 != null && fArr4.length > 0) {
                int length4 = fArr4.length * 4;
                iB = iB + length4 + 1 + u6.z(length4);
            }
            if ((this.f129880c & 64) != 0) {
                iB += u6.q(10) + 1;
            }
            if ((this.f129880c & 16) != 0 && (num2 = this.f129886i) != null) {
                iB += u6.r(11, num2.intValue());
            }
            if ((this.f129880c & 128) != 0 && (num = this.f129892o) != null) {
                iB += u6.r(12, num.intValue());
            }
            C1409a c1409a = this.f129893s;
            if (c1409a != null) {
                iB += u6.t(1729, c1409a);
            }
            b bVar = this.f129894t;
            return bVar != null ? iB + u6.t(196883, bVar) : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            Integer num;
            Integer num2;
            if ((this.f129880c & 1) != 0) {
                u6Var.m(1, this.f129881d);
            }
            if ((this.f129880c & 2) != 0) {
                u6Var.m(2, this.f129882e);
            }
            if ((this.f129880c & 4) != 0) {
                u6Var.h(3, this.f129883f);
            }
            if ((this.f129880c & 8) != 0) {
                u6Var.h(4, this.f129884g);
            }
            float[] fArr = this.f129885h;
            int i10 = 0;
            if (fArr != null && fArr.length > 0) {
                int length = fArr.length * 4;
                u6Var.x(42);
                u6Var.x(length);
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.f129885h;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    u6Var.g(fArr2[i11]);
                    i11++;
                }
            }
            if ((this.f129880c & 32) != 0) {
                u6Var.h(6, this.f129887j);
            }
            float[] fArr3 = this.f129888k;
            if (fArr3 != null && fArr3.length > 0) {
                int length2 = fArr3.length * 4;
                u6Var.x(58);
                u6Var.x(length2);
                int i12 = 0;
                while (true) {
                    float[] fArr4 = this.f129888k;
                    if (i12 >= fArr4.length) {
                        break;
                    }
                    u6Var.g(fArr4[i12]);
                    i12++;
                }
            }
            float[] fArr5 = this.f129889l;
            if (fArr5 != null && fArr5.length > 0) {
                int length3 = fArr5.length * 4;
                u6Var.x(66);
                u6Var.x(length3);
                int i13 = 0;
                while (true) {
                    float[] fArr6 = this.f129889l;
                    if (i13 >= fArr6.length) {
                        break;
                    }
                    u6Var.g(fArr6[i13]);
                    i13++;
                }
            }
            float[] fArr7 = this.f129890m;
            if (fArr7 != null && fArr7.length > 0) {
                int length4 = fArr7.length * 4;
                u6Var.x(74);
                u6Var.x(length4);
                while (true) {
                    float[] fArr8 = this.f129890m;
                    if (i10 >= fArr8.length) {
                        break;
                    }
                    u6Var.g(fArr8[i10]);
                    i10++;
                }
            }
            if ((this.f129880c & 64) != 0) {
                u6Var.n(10, this.f129891n);
            }
            if ((this.f129880c & 16) != 0 && (num2 = this.f129886i) != null) {
                u6Var.i(11, num2.intValue());
            }
            if ((this.f129880c & 128) != 0 && (num = this.f129892o) != null) {
                u6Var.i(12, num.intValue());
            }
            C1409a c1409a = this.f129893s;
            if (c1409a != null) {
                u6Var.l(1729, c1409a);
            }
            b bVar = this.f129894t;
            if (bVar != null) {
                u6Var.l(196883, bVar);
            }
            super.k(u6Var);
        }

        public final c p() {
            this.f129880c = 0;
            this.f129881d = "";
            this.f129882e = "";
            this.f129883f = 0.0f;
            this.f129884g = 0.0f;
            float[] fArr = e7.f129361b;
            this.f129885h = fArr;
            com.google.vr.sdk.proto.a.f.c cVar = com.google.vr.sdk.proto.a.f.c.BOTTOM;
            this.f129886i = cVar == null ? null : Integer.valueOf(cVar.i());
            this.f129887j = 0.0f;
            this.f129888k = fArr;
            this.f129889l = fArr;
            this.f129890m = fArr;
            this.f129891n = false;
            com.google.vr.sdk.proto.a.f.b bVar = com.google.vr.sdk.proto.a.f.b.MAGNET;
            this.f129892o = bVar == null ? null : Integer.valueOf(bVar.i());
            this.f129893s = null;
            this.f129894t = null;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final c l() {
            try {
                c cVar = (c) super.l();
                float[] fArr = this.f129885h;
                if (fArr != null && fArr.length > 0) {
                    cVar.f129885h = (float[]) fArr.clone();
                }
                float[] fArr2 = this.f129888k;
                if (fArr2 != null && fArr2.length > 0) {
                    cVar.f129888k = (float[]) fArr2.clone();
                }
                float[] fArr3 = this.f129889l;
                if (fArr3 != null && fArr3.length > 0) {
                    cVar.f129889l = (float[]) fArr3.clone();
                }
                float[] fArr4 = this.f129890m;
                if (fArr4 != null && fArr4.length > 0) {
                    cVar.f129890m = (float[]) fArr4.clone();
                }
                C1409a c1409a = this.f129893s;
                if (c1409a != null) {
                    cVar.f129893s = c1409a.l();
                }
                b bVar = this.f129894t;
                if (bVar != null) {
                    cVar.f129894t = bVar.l();
                }
                return cVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        public final boolean s() {
            return this.f129891n;
        }

        public final float t() {
            return this.f129884g;
        }

        public final String u() {
            return this.f129882e;
        }

        public final float v() {
            return this.f129883f;
        }

        public final float w() {
            return this.f129887j;
        }

        public final String x() {
            return this.f129881d;
        }

        public final com.google.vr.sdk.proto.a.f.c z() {
            Integer num = this.f129886i;
            return num == null ? com.google.vr.sdk.proto.a.f.c.BOTTOM : com.google.vr.sdk.proto.a.f.c.b(num.intValue());
        }
    }

    public static final class d extends w6<d> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c[] f129895c;

        public d() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            c[] cVarArr = this.f129895c;
            if (cVarArr != null && cVarArr.length > 0) {
                int i10 = 0;
                while (true) {
                    c[] cVarArr2 = this.f129895c;
                    if (i10 >= cVarArr2.length) {
                        break;
                    }
                    c cVar = cVarArr2[i10];
                    if (cVar != null) {
                        iB += u6.t(1, cVar);
                    }
                    i10++;
                }
            }
            return iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            c[] cVarArr = this.f129895c;
            if (cVarArr != null && cVarArr.length > 0) {
                int i10 = 0;
                while (true) {
                    c[] cVarArr2 = this.f129895c;
                    if (i10 >= cVarArr2.length) {
                        break;
                    }
                    c cVar = cVarArr2[i10];
                    if (cVar != null) {
                        u6Var.l(1, cVar);
                    }
                    i10++;
                }
            }
            super.k(u6Var);
        }

        public final d p() {
            this.f129895c = c.r();
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final d l() {
            try {
                d dVar = (d) super.l();
                c[] cVarArr = this.f129895c;
                if (cVarArr != null && cVarArr.length > 0) {
                    dVar.f129895c = new c[cVarArr.length];
                    int i10 = 0;
                    while (true) {
                        c[] cVarArr2 = this.f129895c;
                        if (i10 >= cVarArr2.length) {
                            break;
                        }
                        c cVar = cVarArr2[i10];
                        if (cVar != null) {
                            dVar.f129895c[i10] = cVar.l();
                        }
                        i10++;
                    }
                }
                return dVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final d e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 10) {
                    int iA2 = e7.a(t6Var, 10);
                    c[] cVarArr = this.f129895c;
                    int length = cVarArr == null ? 0 : cVarArr.length;
                    int i10 = iA2 + length;
                    c[] cVarArr2 = new c[i10];
                    if (length != 0) {
                        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        c cVar = new c();
                        cVarArr2[length] = cVar;
                        t6Var.e(cVar);
                        t6Var.a();
                        length++;
                    }
                    c cVar2 = new c();
                    cVarArr2[length] = cVar2;
                    t6Var.e(cVar2);
                    this.f129895c = cVarArr2;
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class e extends w6<e> implements Cloneable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static volatile e[] f129896f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f129898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f129899e;

        public e() {
            p();
        }

        public static e[] r() {
            if (f129896f == null) {
                synchronized (a7.f127704b) {
                    try {
                        if (f129896f == null) {
                            f129896f = new e[0];
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f129896f;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            if ((this.f129897c & 1) != 0) {
                iB += u6.q(1) + 4;
            }
            return (this.f129897c & 2) != 0 ? iB + u6.q(2) + 4 : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            if ((this.f129897c & 1) != 0) {
                u6Var.h(1, this.f129898d);
            }
            if ((this.f129897c & 2) != 0) {
                u6Var.h(2, this.f129899e);
            }
            super.k(u6Var);
        }

        public final e p() {
            this.f129897c = 0;
            this.f129898d = 0.0f;
            this.f129899e = 0.0f;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final e l() {
            try {
                return (e) super.l();
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        public final float s() {
            return this.f129898d;
        }

        public final float t() {
            return this.f129899e;
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final e e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 13) {
                    this.f129898d = Float.intBitsToFloat(t6Var.r());
                    this.f129897c |= 1;
                } else if (iA == 21) {
                    this.f129899e = Float.intBitsToFloat(t6Var.r());
                    this.f129897c |= 2;
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class f extends w6<f> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f129901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f129902e;

        public f() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            Integer num;
            int iB = super.b();
            if ((this.f129900c & 1) != 0 && (num = this.f129901d) != null) {
                iB += u6.r(2, num.intValue());
            }
            return (this.f129900c & 2) != 0 ? iB + u6.q(3) + 4 : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            Integer num;
            if ((this.f129900c & 1) != 0 && (num = this.f129901d) != null) {
                u6Var.i(2, num.intValue());
            }
            if ((this.f129900c & 2) != 0) {
                u6Var.h(3, this.f129902e);
            }
            super.k(u6Var);
        }

        public final f p() {
            this.f129900c = 0;
            com.google.vr.sdk.proto.a.j.b bVar = com.google.vr.sdk.proto.a.j.b.NO_VIGNETTE_CONDITION;
            this.f129901d = bVar == null ? null : Integer.valueOf(bVar.i());
            this.f129902e = 0.0f;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final f l() {
            try {
                return (f) super.l();
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final f e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 16) {
                    this.f129900c |= 1;
                    int iT = t6Var.t();
                    int iG = t6Var.g();
                    if (iG == 0 || iG == 1) {
                        this.f129901d = Integer.valueOf(iG);
                        this.f129900c |= 1;
                    } else {
                        t6Var.o(iT);
                        n(t6Var, iA);
                    }
                } else if (iA == 29) {
                    this.f129902e = Float.intBitsToFloat(t6Var.r());
                    this.f129900c |= 2;
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }
}
