package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<String> f51614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List<BackStackRecordState> f51615b;

    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f51614a = list;
        this.f51615b = list2;
    }

    @NonNull
    List<androidx.fragment.app.a> a(@NonNull FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap map2 = new HashMap(this.f51614a.size());
        for (String str : this.f51614a) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleC = fragmentManager.M0().C(str, null);
                if (bundleC != null) {
                    ClassLoader classLoader = fragmentManager.O0().f().getClassLoader();
                    Fragment fragmentA = ((FragmentState) bundleC.getParcelable("state")).a(fragmentManager.L0(), classLoader);
                    fragmentA.mSavedFragmentState = bundleC;
                    if (bundleC.getBundle("savedInstanceState") == null) {
                        fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleC.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentA.setArguments(bundle);
                    map2.put(fragmentA.mWho, fragmentA);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackRecordState> it = this.f51615b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeStringList(this.f51614a);
        parcel.writeTypedList(this.f51615b);
    }

    BackStackState(@NonNull Parcel parcel) {
        this.f51614a = parcel.createStringArrayList();
        this.f51615b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
