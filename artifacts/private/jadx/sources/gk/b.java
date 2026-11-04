package gk;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static final /* synthetic */ <T extends Parcelable> Parcelable.Creator<T> a() throws IllegalAccessException {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        Object obj = Parcelable.class.getDeclaredField("CREATOR").get(null);
        Parcelable.Creator<T> creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : null;
        if (creator != null) {
            return creator;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not access CREATOR field in class ");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        sb2.append(j1.d(Parcelable.class).Q());
        throw new IllegalArgumentException(sb2.toString());
    }
}
