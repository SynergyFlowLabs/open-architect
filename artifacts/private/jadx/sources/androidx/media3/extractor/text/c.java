package androidx.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.util.b1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c {
    public byte[] a(List<androidx.media3.common.text.a> list, long j10) {
        ArrayList<Bundle> arrayListI = androidx.media3.common.util.i.i(list, new com.google.common.base.t() { // from class: androidx.media3.extractor.text.b
            @Override // com.google.common.base.t
            public final Object apply(Object obj) {
                return ((androidx.media3.common.text.a) obj).f();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListI);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
