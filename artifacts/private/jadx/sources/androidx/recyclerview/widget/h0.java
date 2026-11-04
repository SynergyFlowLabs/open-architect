package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.b1;

/* JADX INFO: loaded from: classes3.dex */
interface h0 {

    public static class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f74256a = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.h0$a$a, reason: collision with other inner class name */
        class C0730a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b1<Long> f74257a = new b1<>();

            C0730a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j10) {
                Long lG = this.f74257a.g(j10);
                if (lG == null) {
                    lG = Long.valueOf(a.this.b());
                    this.f74257a.n(j10, lG);
                }
                return lG.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @NonNull
        public d a() {
            return new C0730a();
        }

        long b() {
            long j10 = this.f74256a;
            this.f74256a = 1 + j10;
            return j10;
        }
    }

    public static class b implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f74259a = new a();

        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j10) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @NonNull
        public d a() {
            return this.f74259a;
        }
    }

    public static class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f74261a = new a();

        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.h0.d
            public long a(long j10) {
                return j10;
            }
        }

        @Override // androidx.recyclerview.widget.h0
        @NonNull
        public d a() {
            return this.f74261a;
        }
    }

    public interface d {
        long a(long j10);
    }

    @NonNull
    d a();
}
