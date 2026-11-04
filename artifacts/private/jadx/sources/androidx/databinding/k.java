package androidx.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public abstract class k {
    @NonNull
    public List<k> a() {
        return Collections.EMPTY_LIST;
    }

    public abstract String b(int i10);

    public abstract e0 c(l lVar, View view, int i10);

    public abstract e0 d(l lVar, View[] viewArr, int i10);

    public abstract int e(String str);
}
