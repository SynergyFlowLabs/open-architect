package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 2)
public final class h<T> extends c1<List<? extends T>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f180705n = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final g<T> f180706m;

    public h(@NotNull g<T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f180706m = collection;
        u();
    }

    private final void u() {
        r(this.f180706m.e());
    }

    public final void s(T t10) {
        this.f180706m.c(t10);
        u();
    }

    public final void t(T t10) {
        this.f180706m.j(t10);
        u();
    }

    public final void v(T t10) {
        List list = (List) f();
        if (list == null || !list.contains(t10)) {
            s(t10);
        } else {
            t(t10);
        }
    }
}
