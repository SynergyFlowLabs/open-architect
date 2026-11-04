package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, f2> f52433a = new LinkedHashMap();

    public final void a() {
        Iterator<f2> it = this.f52433a.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.f52433a.clear();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @Nullable
    public final f2 b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f52433a.get(key);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final Set<String> c() {
        return new HashSet(this.f52433a.keySet());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final void d(@NotNull String key, @NotNull f2 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        f2 f2VarPut = this.f52433a.put(key, viewModel);
        if (f2VarPut != null) {
            f2VarPut.clear$lifecycle_viewmodel_release();
        }
    }
}
