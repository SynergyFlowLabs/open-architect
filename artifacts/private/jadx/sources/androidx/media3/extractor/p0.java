package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface p0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f68280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0 f68281b;

        public a(q0 q0Var) {
            this(q0Var, q0Var);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f68280a.equals(aVar.f68280a) && this.f68281b.equals(aVar.f68281b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f68280a.hashCode() * 31) + this.f68281b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f68280a);
            if (this.f68280a.equals(this.f68281b)) {
                str = "";
            } else {
                str = ", " + this.f68281b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(q0 q0Var, q0 q0Var2) {
            this.f68280a = (q0) androidx.media3.common.util.a.g(q0Var);
            this.f68281b = (q0) androidx.media3.common.util.a.g(q0Var2);
        }
    }

    public static class b implements p0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f68282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f68283e;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // androidx.media3.extractor.p0
        public long Q1() {
            return this.f68282d;
        }

        @Override // androidx.media3.extractor.p0
        public a R1(long j10) {
            return this.f68283e;
        }

        @Override // androidx.media3.extractor.p0
        public boolean S1() {
            return false;
        }

        public b(long j10, long j11) {
            this.f68282d = j10;
            this.f68283e = new a(j11 == 0 ? q0.f68288c : new q0(0L, j11));
        }
    }

    long Q1();

    a R1(long j10);

    boolean S1();
}
