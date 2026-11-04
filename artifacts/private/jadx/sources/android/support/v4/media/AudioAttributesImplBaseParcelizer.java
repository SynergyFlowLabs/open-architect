package android.support.v4.media;

import androidx.annotation.b1;
import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.e;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY})
public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(e parcel) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(parcel);
    }

    public static void write(AudioAttributesImplBase obj, e parcel) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(obj, parcel);
    }
}
