package androidx.media2.exoplayer.external.audio;

import android.media.AudioAttributes;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f53273e = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private AudioAttributes f53277d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53278a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53279b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53280c = 1;

        public c a() {
            return new c(this.f53278a, this.f53279b, this.f53280c);
        }

        public b b(int contentType) {
            this.f53278a = contentType;
            return this;
        }

        public b c(int flags) {
            this.f53279b = flags;
            return this;
        }

        public b d(int usage) {
            this.f53280c = usage;
            return this;
        }
    }

    @e.b(21)
    public AudioAttributes a() {
        if (this.f53277d == null) {
            this.f53277d = new AudioAttributes.Builder().setContentType(this.f53274a).setFlags(this.f53275b).setUsage(this.f53276c).build();
        }
        return this.f53277d;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f53274a == cVar.f53274a && this.f53275b == cVar.f53275b && this.f53276c == cVar.f53276c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f53274a) * 31) + this.f53275b) * 31) + this.f53276c;
    }

    private c(int contentType, int flags, int usage) {
        this.f53274a = contentType;
        this.f53275b = flags;
        this.f53276c = usage;
    }
}
