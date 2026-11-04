package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i {
    private i() {
    }

    public static HashMap<String, String> a(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static n6<String, String> b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? n6.q() : n6.g(a(bundle));
    }

    public static void c(@androidx.annotation.p0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) k1.o(i.class.getClassLoader()));
        }
    }

    public static <T> l6<T> d(com.google.common.base.t<Bundle, T> tVar, List<Bundle> list) {
        l6.a aVarS = l6.s();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarS.a(tVar.apply((Bundle) a.g(list.get(i10))));
        }
        return aVarS.e();
    }

    public static <T> SparseArray<T> e(com.google.common.base.t<Bundle, T> tVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), tVar.apply(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> g(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> i(Collection<T> collection, com.google.common.base.t<T, Bundle> tVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(tVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> l6<Bundle> j(List<T> list, com.google.common.base.t<T, Bundle> tVar) {
        l6.a aVarS = l6.s();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarS.a(tVar.apply(list.get(i10)));
        }
        return aVarS.e();
    }

    public static <T> SparseArray<Bundle> k(SparseArray<T> sparseArray, com.google.common.base.t<T, Bundle> tVar) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), tVar.apply(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
