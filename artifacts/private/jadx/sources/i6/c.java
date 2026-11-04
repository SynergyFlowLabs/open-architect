package i6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.common.m;
import java.util.ArrayList;
import java.util.Iterator;
import rx.internal.operators.OperatorReplay;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class c {
    private c() {
    }

    @NonNull
    @g6.a
    public static <T extends SafeParcelable> T a(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        w.r(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }

    @p0
    @g6.a
    public static <T extends SafeParcelable> T b(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }

    @NonNull
    @g6.a
    public static <T extends SafeParcelable> T c(@NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return (T) a(com.google.android.gms.common.util.c.b(str), creator);
    }

    @p0
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> d(@NonNull Bundle bundle, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        OperatorReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            unboundedReplayBuffer.add(a((byte[]) arrayList.get(i10), creator));
        }
        return unboundedReplayBuffer;
    }

    @p0
    @g6.a
    public static <T extends SafeParcelable> ArrayList<T> e(@NonNull Bundle bundle, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return f(bundle.getByteArray(str), creator);
    }

    @p0
    @g6.a
    public static <T extends SafeParcelable> ArrayList<T> f(@p0 byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            parcelObtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            parcelObtain.recycle();
        }
    }

    @p0
    @g6.a
    @Deprecated
    public static <T extends SafeParcelable> ArrayList<T> g(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            int i10 = 3 ^ 0;
            return null;
        }
        OperatorReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            unboundedReplayBuffer.add(a((byte[]) arrayList.get(i11), creator));
        }
        return unboundedReplayBuffer;
    }

    @p0
    @g6.a
    public static <T extends SafeParcelable> ArrayList<T> h(@NonNull Intent intent, @NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return f(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends SafeParcelable> void i(@NonNull Iterable<T> iterable, @NonNull Bundle bundle, @NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(n(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    @g6.a
    public static <T extends SafeParcelable> void j(@NonNull Iterable<T> iterable, @NonNull Bundle bundle, @NonNull String str) {
        bundle.putByteArray(str, k(iterable));
    }

    @NonNull
    @g6.a
    public static <T extends SafeParcelable> byte[] k(@NonNull Iterable<T> iterable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeTypedList(m.u(iterable));
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @g6.a
    @Deprecated
    public static <T extends SafeParcelable> void l(@NonNull Iterable<T> iterable, @NonNull Intent intent, @NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(n(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @g6.a
    public static <T extends SafeParcelable> void m(@NonNull Iterable<T> iterable, @NonNull Intent intent, @NonNull String str) {
        intent.putExtra(str, k(iterable));
    }

    @NonNull
    @g6.a
    public static <T extends SafeParcelable> byte[] n(@NonNull T t10) {
        Parcel parcelObtain = Parcel.obtain();
        t10.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    @g6.a
    public static <T extends SafeParcelable> void o(@NonNull T t10, @NonNull Intent intent, @NonNull String str) {
        intent.putExtra(str, n(t10));
    }

    @NonNull
    @g6.a
    public static <T extends SafeParcelable> String p(@NonNull T t10) {
        return com.google.android.gms.common.util.c.e(n(t10));
    }
}
