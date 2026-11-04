package com.google.vr.sdk.proto.nano;

import com.google.vr.sdk.deps.t6;
import com.google.vr.sdk.deps.u6;
import com.google.vr.sdk.deps.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    public static final class a extends w6<a> implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f129940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public com.google.common.logging.nano.a.C1088a.m f129941d;

        public a() {
            p();
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        protected final int b() {
            int iB = super.b();
            String str = this.f129940c;
            if (str != null) {
                iB += u6.u(1, str);
            }
            com.google.common.logging.nano.a.C1088a.m mVar = this.f129941d;
            return mVar != null ? iB + u6.t(2, mVar) : iB;
        }

        @Override // com.google.vr.sdk.deps.w6, com.google.vr.sdk.deps.c7
        public final void k(u6 u6Var) throws IOException {
            String str = this.f129940c;
            if (str != null) {
                u6Var.m(1, str);
            }
            com.google.common.logging.nano.a.C1088a.m mVar = this.f129941d;
            if (mVar != null) {
                u6Var.l(2, mVar);
            }
            super.k(u6Var);
        }

        public final a p() {
            this.f129940c = null;
            this.f129941d = null;
            this.f129659b = null;
            this.f127766a = -1;
            return this;
        }

        @Override // com.google.vr.sdk.deps.w6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final a l() {
            try {
                a aVar = (a) super.l();
                com.google.common.logging.nano.a.C1088a.m mVar = this.f129941d;
                if (mVar != null) {
                    aVar.f129941d = mVar.l();
                }
                return aVar;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.vr.sdk.deps.c7
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final a e(t6 t6Var) throws IOException {
            while (true) {
                int iA = t6Var.a();
                if (iA == 0) {
                    break;
                }
                if (iA == 10) {
                    this.f129940c = t6Var.l();
                } else if (iA == 18) {
                    if (this.f129941d == null) {
                        this.f129941d = new com.google.common.logging.nano.a.C1088a.m();
                    }
                    t6Var.e(this.f129941d);
                } else if (!super.n(t6Var, iA)) {
                    break;
                }
            }
            return this;
        }
    }
}
