package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(androidx.versionedparcelable.e parcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f52706q = (AudioAttributes) parcel.W(audioAttributesImplApi26.f52706q, 1);
        audioAttributesImplApi26.f52707r = parcel.M(audioAttributesImplApi26.f52707r, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 obj, androidx.versionedparcelable.e parcel) {
        parcel.j0(false, false);
        parcel.X0(obj.f52706q, 1);
        parcel.M0(obj.f52707r, 2);
    }
}
