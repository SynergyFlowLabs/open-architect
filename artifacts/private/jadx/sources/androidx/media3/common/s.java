package androidx.media3.common;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f61289a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f61290a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f61291b;

        @z7.a
        public b a(int i10) {
            androidx.media3.common.util.a.i(!this.f61291b);
            this.f61290a.append(i10, true);
            return this;
        }

        @z7.a
        public b b(s sVar) {
            for (int i10 = 0; i10 < sVar.d(); i10++) {
                a(sVar.c(i10));
            }
            return this;
        }

        @z7.a
        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        @z7.a
        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public s e() {
            androidx.media3.common.util.a.i(!this.f61291b);
            this.f61291b = true;
            return new s(this.f61290a);
        }

        @z7.a
        public b f(int i10) {
            androidx.media3.common.util.a.i(!this.f61291b);
            this.f61290a.delete(i10);
            return this;
        }

        @z7.a
        public b g(int... iArr) {
            for (int i10 : iArr) {
                f(i10);
            }
            return this;
        }

        @z7.a
        public b h(int i10, boolean z10) {
            if (z10) {
                this = f(i10);
            }
            return this;
        }
    }

    public boolean a(int i10) {
        return this.f61289a.get(i10);
    }

    public boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (a(i10)) {
                return true;
            }
        }
        return false;
    }

    public int c(int i10) {
        androidx.media3.common.util.a.c(i10, 0, d());
        return this.f61289a.keyAt(i10);
    }

    public int d() {
        return this.f61289a.size();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (androidx.media3.common.util.k1.f61540a >= 24) {
            return this.f61289a.equals(sVar.f61289a);
        }
        if (d() != sVar.d()) {
            return false;
        }
        for (int i10 = 0; i10 < d(); i10++) {
            if (c(i10) != sVar.c(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (androidx.media3.common.util.k1.f61540a >= 24) {
            return this.f61289a.hashCode();
        }
        int iD = d();
        for (int i10 = 0; i10 < d(); i10++) {
            iD = (iD * 31) + c(i10);
        }
        return iD;
    }

    private s(SparseBooleanArray sparseBooleanArray) {
        this.f61289a = sparseBooleanArray;
    }
}
