package c6;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.h;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<h> f82528a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<h, Integer> f82529b;

    static {
        HashMap<h, Integer> map = new HashMap<>();
        f82529b = map;
        map.put(h.DEFAULT, 0);
        f82529b.put(h.VERY_LOW, 1);
        f82529b.put(h.HIGHEST, 2);
        for (h hVar : f82529b.keySet()) {
            f82528a.append(f82529b.get(hVar).intValue(), hVar);
        }
    }

    public static int a(@NonNull h hVar) {
        Integer num = f82529b.get(hVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + hVar);
    }

    @NonNull
    public static h b(int i10) {
        h hVar = f82528a.get(i10);
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
