package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.b1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f68308a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f68309b = "d";

    public d a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new d(androidx.media3.common.util.i.d(new androidx.media3.common.text.b(), (ArrayList) androidx.media3.common.util.a.g(bundle.getParcelableArrayList(f68308a))), j10, bundle.getLong("d"));
    }
}
