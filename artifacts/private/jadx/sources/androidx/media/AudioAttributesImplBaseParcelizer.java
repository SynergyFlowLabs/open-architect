package androidx.media;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.e parcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f52709q = parcel.M(audioAttributesImplBase.f52709q, 1);
        audioAttributesImplBase.f52710r = parcel.M(audioAttributesImplBase.f52710r, 2);
        audioAttributesImplBase.f52711s = parcel.M(audioAttributesImplBase.f52711s, 3);
        audioAttributesImplBase.f52712t = parcel.M(audioAttributesImplBase.f52712t, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase obj, androidx.versionedparcelable.e parcel) {
        parcel.j0(false, false);
        parcel.M0(obj.f52709q, 1);
        parcel.M0(obj.f52710r, 2);
        parcel.M0(obj.f52711s, 3);
        int i10 = 2 >> 4;
        parcel.M0(obj.f52712t, 4);
    }
}
