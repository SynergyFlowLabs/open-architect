package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f63218d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63221c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f63222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f63223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f63224c;

        public b() {
        }

        public j d() {
            if (this.f63222a || !(this.f63223b || this.f63224c)) {
                return new j(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        @z7.a
        public b e(boolean z10) {
            this.f63222a = z10;
            return this;
        }

        @z7.a
        public b f(boolean z10) {
            this.f63223b = z10;
            return this;
        }

        @z7.a
        public b g(boolean z10) {
            this.f63224c = z10;
            return this;
        }

        public b(j jVar) {
            this.f63222a = jVar.f63219a;
            this.f63223b = jVar.f63220b;
            this.f63224c = jVar.f63221c;
        }
    }

    public b a() {
        return new b(this);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f63219a == jVar.f63219a && this.f63220b == jVar.f63220b && this.f63221c == jVar.f63221c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f63219a ? 1 : 0) << 2) + ((this.f63220b ? 1 : 0) << 1) + (this.f63221c ? 1 : 0);
    }

    private j(b bVar) {
        this.f63219a = bVar.f63222a;
        this.f63220b = bVar.f63223b;
        this.f63221c = bVar.f63224c;
    }
}
