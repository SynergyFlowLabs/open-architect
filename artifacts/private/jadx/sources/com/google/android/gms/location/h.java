package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.location.zzek;

/* JADX INFO: loaded from: classes4.dex */
public interface h {

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final int f109651a2 = 1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final int f109652b2 = 2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final int f109653c2 = 4;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final long f109654d2 = -1;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private double f109659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private double f109660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f109661g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f109655a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @c
        private int f109656b = 3;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f109657c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private short f109658d = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f109662h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f109663i = -1;

        public a() {
            int i10 = (0 & 0) >> 3;
        }

        @NonNull
        public h a() {
            if (this.f109655a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i10 = this.f109656b;
            if (i10 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i10 & 4) != 0 && this.f109663i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.f109657c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f109658d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f109662h >= 0) {
                return new zzek(this.f109655a, this.f109656b, (short) 1, this.f109659e, this.f109660f, this.f109661g, this.f109657c, this.f109662h, this.f109663i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @NonNull
        public a b(@androidx.annotation.x(from = -90.0d, to = 90.0d) double d10, @androidx.annotation.x(from = -180.0d, to = 180.0d) double d11, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
            boolean z10 = d10 >= -90.0d && d10 <= 90.0d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 18);
            sb2.append("Invalid latitude: ");
            sb2.append(d10);
            com.google.android.gms.common.internal.w.b(z10, sb2.toString());
            boolean z11 = d11 >= -180.0d && d11 <= 180.0d;
            StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 19);
            sb3.append("Invalid longitude: ");
            sb3.append(d11);
            com.google.android.gms.common.internal.w.b(z11, sb3.toString());
            boolean z12 = f10 > 0.0f;
            StringBuilder sb4 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb4.append("Invalid radius: ");
            sb4.append(f10);
            com.google.android.gms.common.internal.w.b(z12, sb4.toString());
            this.f109658d = (short) 1;
            this.f109659e = d10;
            this.f109660f = d11;
            this.f109661g = f10;
            return this;
        }

        @NonNull
        public a c(long j10) {
            if (j10 < 0) {
                this.f109657c = -1L;
                return this;
            }
            this.f109657c = com.google.android.gms.common.util.k.d().b() + j10;
            return this;
        }

        @NonNull
        public a d(int i10) {
            this.f109663i = i10;
            return this;
        }

        @NonNull
        public a e(@androidx.annotation.g0(from = 0) int i10) {
            this.f109662h = i10;
            return this;
        }

        @NonNull
        public a f(@NonNull String str) {
            this.f109655a = (String) com.google.android.gms.common.internal.w.s(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public a g(@c int i10) {
            this.f109656b = i10;
            return this;
        }
    }

    public @interface b {
    }

    public @interface c {
    }

    double A5();

    int A6();

    long D6();

    float R();

    @NonNull
    String w2();

    double w6();

    @c
    int x6();

    int y6();
}
