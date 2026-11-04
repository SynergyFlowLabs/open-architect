package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(androidx.versionedparcelable.e parcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f52706q = (AudioAttributes) parcel.W(audioAttributesImplApi21.f52706q, 1);
        audioAttributesImplApi21.f52707r = parcel.M(audioAttributesImplApi21.f52707r, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 obj, androidx.versionedparcelable.e parcel) {
        parcel.j0(false, false);
        parcel.X0(obj.f52706q, 1);
        parcel.M0(obj.f52707r, 2);
    }
}
