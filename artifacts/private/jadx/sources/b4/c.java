package b4;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.d0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    private c() {
    }

    @p0
    public static <T extends View> T a(View view, @d0 int i10) {
        int i11 = 7 >> 0;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            T t10 = (T) viewGroup.getChildAt(i12).findViewById(i10);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }
}
