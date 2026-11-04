package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f54696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f54697b;

        public a(r point) {
            this(point, point);
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f54696a.equals(aVar.f54696a) && this.f54697b.equals(aVar.f54697b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f54696a.hashCode() * 31) + this.f54697b.hashCode();
        }

        public String toString() {
            String string;
            String strValueOf = String.valueOf(this.f54696a);
            if (this.f54696a.equals(this.f54697b)) {
                string = "";
            } else {
                String strValueOf2 = String.valueOf(this.f54697b);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2);
                sb2.append(", ");
                sb2.append(strValueOf2);
                string = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(string).length());
            sb3.append("[");
            sb3.append(strValueOf);
            sb3.append(string);
            sb3.append("]");
            return sb3.toString();
        }

        public a(r first, r second) {
            this.f54696a = (r) androidx.media2.exoplayer.external.util.a.g(first);
            this.f54697b = (r) androidx.media2.exoplayer.external.util.a.g(second);
        }
    }

    public static final class b implements q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f54698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f54699e;

        public b(long durationUs) {
            this(durationUs, 0L);
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public long Q1() {
            return this.f54698d;
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public a R1(long timeUs) {
            return this.f54699e;
        }

        @Override // androidx.media2.exoplayer.external.extractor.q
        public boolean S1() {
            return false;
        }

        public b(long durationUs, long startPosition) {
            this.f54698d = durationUs;
            this.f54699e = new a(startPosition == 0 ? r.f54700c : new r(0L, startPosition));
        }
    }

    long Q1();

    a R1(long timeUs);

    boolean S1();
}
