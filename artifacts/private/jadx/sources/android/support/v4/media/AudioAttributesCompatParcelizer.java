package android.support.v4.media;

import androidx.annotation.b1;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e parcel) {
        return androidx.media.AudioAttributesCompatParcelizer.read(parcel);
    }

    public static void write(AudioAttributesCompat obj, e parcel) {
        androidx.media.AudioAttributesCompatParcelizer.write(obj, parcel);
    }
}
