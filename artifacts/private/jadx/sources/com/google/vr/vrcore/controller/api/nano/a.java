package com.google.vr.vrcore.controller.api.nano;

import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: com.google.vr.vrcore.controller.api.nano.a$a, reason: collision with other inner class name */
    public static final class C1417a extends w6<C1417a> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C1418a f130036c;

        /* JADX INFO: renamed from: com.google.vr.vrcore.controller.api.nano.a$a$a, reason: collision with other inner class name */
        public static final class C1418a extends w6<C1418a> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f130037c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f130038d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f130039e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f130040f;

            public C1418a() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                if ((this.f130037c & 1) != 0) {
                    iB += u6.r(1, this.f130038d);
                }
                if ((this.f130037c & 2) != 0) {
                    iB += u6.r(2, this.f130039e);
                }
                return (this.f130037c & 4) != 0 ? iB + u6.r(3, this.f130040f) : iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                if ((this.f130037c & 1) != 0) {
                    u6Var.i(1, this.f130038d);
                }
                if ((this.f130037c & 2) != 0) {
                    u6Var.i(2, this.f130039e);
                }
                if ((this.f130037c & 4) != 0) {
                    u6Var.i(3, this.f130040f);
                }
                super.k(u6Var);
            }

            public final C1418a p() {
                this.f130037c = 0;
                this.f130038d = 0;
                this.f130039e = 0;
                this.f130040f = 0;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final C1418a l() {
                try {
                    return (C1418a) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final C1418a e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 8) {
                        this.f130038d = t6Var.g();
                        this.f130037c |= 1;
                    } else if (iA == 16) {
                        this.f130039e = t6Var.g();
                        this.f130037c |= 2;
                    } else if (iA == 24) {
                        this.f130040f = t6Var.g();
                        this.f130037c |= 4;
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }

            public final C1418a s(int i10) {
                this.f130037c |= 4;
                this.f130040f = i10;
                return this;
            }

            public final C1418a t(int i10) {
                this.f130037c |= 1;
                this.f130038d = i10;
                return this;
            }

            public final C1418a u(int i10) {
                this.f130037c |= 2;
                this.f130039e = i10;
                return this;
            }
        }

        public C1417a() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            C1418a c1418a = this.f130036c;
            return c1418a != null ? iB + u6.t(1, c1418a) : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            C1418a c1418a = this.f130036c;
            if (c1418a != null) {
                u6Var.l(1, c1418a);
            }
            super.k(u6Var);
        }

        public final C1417a p() {
            this.f130036c = null;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final C1417a l() {
            try {
                C1417a c1417a = (C1417a) super.l();
                C1418a c1418a = this.f130036c;
                if (c1418a != null) {
                    c1417a.f130036c = c1418a.l();
                }
                return c1417a;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final C1417a e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 10) {
                    if (this.f130036c == null) {
                        this.f130036c = new C1418a();
                    }
                    t6Var.e(this.f130036c);
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }
}
