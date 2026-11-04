package com.airbnb.lottie;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    final com.airbnb.lottie.network.f f88183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    final com.airbnb.lottie.network.e f88184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f88185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f88186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f88187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.airbnb.lottie.a f88188f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private com.airbnb.lottie.network.f f88189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private com.airbnb.lottie.network.e f88190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f88191c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f88192d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f88193e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.airbnb.lottie.a f88194f = com.airbnb.lottie.a.AUTOMATIC;

        class a implements com.airbnb.lottie.network.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f88195a;

            a(File file) {
                this.f88195a = file;
            }

            @Override // com.airbnb.lottie.network.e
            @NonNull
            public File a() {
                if (this.f88195a.isDirectory()) {
                    return this.f88195a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* JADX INFO: renamed from: com.airbnb.lottie.d0$b$b, reason: collision with other inner class name */
        class C0826b implements com.airbnb.lottie.network.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.airbnb.lottie.network.e f88197a;

            C0826b(com.airbnb.lottie.network.e eVar) {
                this.f88197a = eVar;
            }

            @Override // com.airbnb.lottie.network.e
            @NonNull
            public File a() {
                File fileA = this.f88197a.a();
                if (fileA.isDirectory()) {
                    return fileA;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public d0 a() {
            return new d0(this.f88189a, this.f88190b, this.f88191c, this.f88192d, this.f88193e, this.f88194f);
        }

        @NonNull
        public b b(com.airbnb.lottie.a aVar) {
            this.f88194f = aVar;
            return this;
        }

        @NonNull
        public b c(boolean z10) {
            this.f88193e = z10;
            return this;
        }

        @NonNull
        public b d(boolean z10) {
            this.f88192d = z10;
            return this;
        }

        @NonNull
        public b e(boolean z10) {
            this.f88191c = z10;
            return this;
        }

        @NonNull
        public b f(@NonNull File file) {
            if (this.f88190b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f88190b = new a(file);
            return this;
        }

        @NonNull
        public b g(@NonNull com.airbnb.lottie.network.e eVar) {
            if (this.f88190b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f88190b = new C0826b(eVar);
            return this;
        }

        @NonNull
        public b h(@NonNull com.airbnb.lottie.network.f fVar) {
            this.f88189a = fVar;
            return this;
        }
    }

    private d0(@androidx.annotation.p0 com.airbnb.lottie.network.f fVar, @androidx.annotation.p0 com.airbnb.lottie.network.e eVar, boolean z10, boolean z11, boolean z12, com.airbnb.lottie.a aVar) {
        this.f88183a = fVar;
        this.f88184b = eVar;
        this.f88185c = z10;
        this.f88186d = z11;
        this.f88187e = z12;
        this.f88188f = aVar;
    }
}
