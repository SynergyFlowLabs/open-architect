package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.w0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,152:1\n13579#2,2:153\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n34#1:153,2\n*E\n"})
public final class c0 {
    @w0(21)
    @NotNull
    public static final PersistableBundle a() {
        return a0.a(0);
    }

    @w0(21)
    @NotNull
    public static final PersistableBundle b(@NotNull Pair<String, ? extends Object>... pairArr) {
        PersistableBundle persistableBundleA = a0.a(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            a0.b(persistableBundleA, pair.component1(), pair.component2());
        }
        return persistableBundleA;
    }

    @w0(21)
    @NotNull
    public static final PersistableBundle c(@NotNull Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleA = a0.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            a0.b(persistableBundleA, entry.getKey(), entry.getValue());
        }
        return persistableBundleA;
    }
}
