package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f124797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f124798b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f124799a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f124800b = com.google.firebase.remoteconfig.internal.n.f124564j;

        @NonNull
        public x c() {
            return new x(this);
        }

        public long d() {
            return this.f124799a;
        }

        public long e() {
            return this.f124800b;
        }

        @NonNull
        public b f(long j10) throws IllegalArgumentException {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f124799a = j10;
            return this;
        }

        @NonNull
        public b g(long j10) {
            if (j10 >= 0) {
                this.f124800b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f124797a;
    }

    public long b() {
        return this.f124798b;
    }

    @NonNull
    public b c() {
        b bVar = new b();
        bVar.f(a());
        bVar.g(b());
        return bVar;
    }

    private x(b bVar) {
        this.f124797a = bVar.f124799a;
        this.f124798b = bVar.f124800b;
    }
}
