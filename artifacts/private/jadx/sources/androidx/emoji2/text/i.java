package androidx.emoji2.text;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class i {

    @w0(34)
    private static class a {
        private a() {
        }

        @NonNull
        @u
        static Set<int[]> a() {
            return b.a();
        }
    }

    private static class b {
        private b() {
        }

        @NonNull
        @e.a({"BanUncheckedReflection"})
        static Set<int[]> a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        set = Collections.EMPTY_SET;
                        break;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    private i() {
    }

    @NonNull
    static Set<int[]> a() {
        return Build.VERSION.SDK_INT >= 34 ? a.a() : b.a();
    }
}
