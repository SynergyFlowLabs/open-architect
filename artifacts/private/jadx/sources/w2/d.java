package w2;

import androidx.lifecycle.f2;
import androidx.lifecycle.j2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements j2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d f385876b = new d();

    private d() {
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends f2> T a(@NotNull kotlin.reflect.d<T> modelClass, @NotNull v2.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) e.f385877a.a(oj.b.e(modelClass));
    }
}
