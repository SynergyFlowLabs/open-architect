package androidx.media;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.e parcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f52700q = (AudioAttributesImpl) parcel.h0(audioAttributesCompat.f52700q, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat obj, androidx.versionedparcelable.e parcel) {
        parcel.j0(false, false);
        parcel.m1(obj.f52700q, 1);
    }
}
