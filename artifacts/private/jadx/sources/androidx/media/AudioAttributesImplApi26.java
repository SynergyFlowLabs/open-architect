package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(26)
@b1({b1.a.LIBRARY})
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    @w0(26)
    static class a extends AudioAttributesImplApi21.a {
        a() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f52708a.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(int usage) {
            this.f52708a.setUsage(usage);
            return this;
        }

        a(Object aa2) {
            super(aa2);
        }
    }

    @b1({b1.a.LIBRARY})
    public AudioAttributesImplApi26() {
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int c5() {
        return this.f52706q.getVolumeControlStream();
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
