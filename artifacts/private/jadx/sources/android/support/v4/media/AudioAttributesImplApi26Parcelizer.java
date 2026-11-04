package android.support.v4.media;

import androidx.annotation.b1;
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public final class AudioAttributesImplApi26Parcelizer extends androidx.media.AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(e parcel) {
        return androidx.media.AudioAttributesImplApi26Parcelizer.read(parcel);
    }

    public static void write(AudioAttributesImplApi26 obj, e parcel) {
        androidx.media.AudioAttributesImplApi26Parcelizer.write(obj, parcel);
    }
}
