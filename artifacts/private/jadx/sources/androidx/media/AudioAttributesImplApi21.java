package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
@b1({b1.a.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public AudioAttributes f52706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f52707r;

    @b1({b1.a.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f52707r = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int I() {
        return this.f52706q.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int Z4() {
        return this.f52706q.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a5() {
        int i10 = this.f52707r;
        return i10 != -1 ? i10 : AudioAttributesCompat.f(false, I(), Z4());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b5() {
        return this.f52707r;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c5() {
        return AudioAttributesCompat.f(true, I(), Z4());
    }

    @Override // androidx.media.AudioAttributesImpl
    @p0
    public Object e() {
        return this.f52706q;
    }

    public boolean equals(Object o10) {
        if (o10 instanceof AudioAttributesImplApi21) {
            return this.f52706q.equals(((AudioAttributesImplApi21) o10).f52706q);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f52706q.getContentType();
    }

    public int hashCode() {
        return this.f52706q.hashCode();
    }

    @NonNull
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f52706q;
    }

    @w0(21)
    static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AudioAttributes.Builder f52708a;

        a() {
            this.f52708a = new AudioAttributes.Builder();
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f52708a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a c(int contentType) {
            this.f52708a.setContentType(contentType);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a v(int flags) {
            this.f52708a.setFlags(flags);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(int streamType) {
            this.f52708a.setLegacyStreamType(streamType);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(int usage) {
            if (usage == 16) {
                usage = 12;
            }
            this.f52708a.setUsage(usage);
            return this;
        }

        a(Object aa2) {
            this.f52708a = new AudioAttributes.Builder((AudioAttributes) aa2);
        }
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int explicitLegacyStream) {
        this.f52706q = audioAttributes;
        this.f52707r = explicitLegacyStream;
    }
}
