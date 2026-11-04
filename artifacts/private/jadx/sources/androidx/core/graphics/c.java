package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    @w0(29)
    static class a {
        private a() {
        }

        static ColorFilter a(int i10, Object obj) {
            return new BlendModeColorFilter(i10, (BlendMode) obj);
        }
    }

    private c() {
    }

    @p0
    public static ColorFilter a(int i10, @NonNull d dVar) {
        Object objA = e.b.a(dVar);
        if (objA != null) {
            return a.a(i10, objA);
        }
        return null;
    }
}
