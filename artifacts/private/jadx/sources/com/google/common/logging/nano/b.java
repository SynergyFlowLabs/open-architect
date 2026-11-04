package com.google.common.logging.nano;

import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    public static final class a extends w6<a> implements Cloneable {

        /* JADX INFO: renamed from: com.google.common.logging.nano.b$a$a, reason: collision with other inner class name */
        public static final class C1105a extends w6<C1105a> implements Cloneable {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f119383c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public String f119384d;

            public C1105a() {
                p();
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            protected final int b() {
                int iB = super.b();
                String str = this.f119383c;
                if (str != null) {
                    iB += u6.u(1, str);
                }
                String str2 = this.f119384d;
                if (str2 != null) {
                    iB += u6.u(2, str2);
                }
                return iB;
            }

            @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
            public final void k(u6 u6Var) throws IOException {
                String str = this.f119383c;
                if (str != null) {
                    u6Var.m(1, str);
                }
                String str2 = this.f119384d;
                if (str2 != null) {
                    u6Var.m(2, str2);
                }
                super.k(u6Var);
            }

            public final C1105a p() {
                this.f119383c = null;
                this.f119384d = null;
                this.f129659b = null;
                this.f127766a = -1;
                return this;
            }

            @Override // com.google.vr.sdk.deps.w6
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final C1105a l() {
                try {
                    return (C1105a) super.l();
                } catch (CloneNotSupportedException e10) {
                    throw new AssertionError(e10);
                }
            }

            @Override // com.google.vr.sdk.deps.c7
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final C1105a e(t6 t6Var) throws IOException {
                while (true) {
                    int iA = t6Var.a();
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 10) {
                        this.f119383c = t6Var.l();
                    } else if (iA == 18) {
                        this.f119384d = t6Var.l();
                    } else if (!super.n(t6Var, iA)) {
                        break;
                    }
                }
                return this;
            }
        }

        public a() {
            p();
        }

        public final a p() {
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final a l() {
            try {
                return (a) super.l();
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final a e(t6 t6Var) throws IOException {
            int iA;
            do {
                iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
            } while (super.n(t6Var, iA));
            return this;
        }
    }
}
