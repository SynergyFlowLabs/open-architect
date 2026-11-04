package android.support.v4.media;

import androidx.annotation.b1;
import androidx.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public final class AudioAttributesImplApi21Parcelizer extends androidx.media.AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(e parcel) {
        return androidx.media.AudioAttributesImplApi21Parcelizer.read(parcel);
    }

    public static void write(AudioAttributesImplApi21 obj, e parcel) {
        androidx.media.AudioAttributesImplApi21Parcelizer.write(obj, parcel);
    }
}
