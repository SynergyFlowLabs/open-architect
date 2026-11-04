package com.google.vr.sdk.proto.nano;

import com.google.vr.sdk.deps.e7;
import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    public static final class a extends w6<a> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f129904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f129905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f129906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f129907g;

        public a() {
            p();
        }

        public final a A(float f10) {
            this.f129903c |= 1;
            this.f129904d = f10;
            return this;
        }

        public final a B(float f10) {
            this.f129903c |= 2;
            this.f129905e = f10;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            if ((this.f129903c & 1) != 0) {
                iB += u6.q(1) + 4;
            }
            if ((this.f129903c & 2) != 0) {
                iB += u6.q(2) + 4;
            }
            if ((this.f129903c & 4) != 0) {
                iB += u6.q(3) + 4;
            }
            float[] fArr = this.f129907g;
            if (fArr == null || fArr.length <= 0) {
                return iB;
            }
            int length = fArr.length * 4;
            return iB + length + 1 + u6.z(length);
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            if ((this.f129903c & 1) != 0) {
                u6Var.h(1, this.f129904d);
            }
            if ((this.f129903c & 2) != 0) {
                u6Var.h(2, this.f129905e);
            }
            if ((this.f129903c & 4) != 0) {
                u6Var.h(3, this.f129906f);
            }
            float[] fArr = this.f129907g;
            if (fArr != null && fArr.length > 0) {
                int length = fArr.length * 4;
                u6Var.x(34);
                u6Var.x(length);
                int i10 = 0;
                while (true) {
                    float[] fArr2 = this.f129907g;
                    if (i10 >= fArr2.length) {
                        break;
                    }
                    u6Var.g(fArr2[i10]);
                    i10++;
                }
            }
            super.k(u6Var);
        }

        public final a p() {
            this.f129903c = 0;
            this.f129904d = 0.0f;
            this.f129905e = 0.0f;
            this.f129906f = 0.0f;
            this.f129907g = e7.f129361b;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final a l() {
            try {
                a aVar = (a) super.l();
                float[] fArr = this.f129907g;
                if (fArr != null && fArr.length > 0) {
                    aVar.f129907g = (float[]) fArr.clone();
                }
                return aVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        public final float r() {
            return this.f129906f;
        }

        public final float s() {
            return this.f129904d;
        }

        public final float t() {
            return this.f129905e;
        }

        public final boolean u() {
            return (this.f129903c & 4) != 0;
        }

        public final boolean v() {
            return (this.f129903c & 1) != 0;
        }

        public final boolean w() {
            return (this.f129903c & 2) != 0;
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public final a e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 13) {
                    this.f129904d = Float.intBitsToFloat(t6Var.r());
                    this.f129903c |= 1;
                } else if (iA == 21) {
                    this.f129905e = Float.intBitsToFloat(t6Var.r());
                    this.f129903c |= 2;
                } else if (iA == 29) {
                    this.f129906f = Float.intBitsToFloat(t6Var.r());
                    this.f129903c |= 4;
                } else if (iA == 34) {
                    int iN = t6Var.n();
                    int iJ = t6Var.j(iN);
                    int i10 = iN / 4;
                    float[] fArr = this.f129907g;
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
                    this.f129907g = fArr2;
                    t6Var.m(iJ);
                } else if (iA == 37) {
                    int iA2 = e7.a(t6Var, 37);
                    float[] fArr3 = this.f129907g;
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
                    this.f129907g = fArr4;
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }

        public final a z(float f10) {
            this.f129903c |= 4;
            this.f129906f = f10;
            return this;
        }
    }
}
