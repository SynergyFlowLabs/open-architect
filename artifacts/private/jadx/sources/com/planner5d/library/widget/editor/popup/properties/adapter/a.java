package com.planner5d.library.widget.editor.popup.properties.adapter;

import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257928b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b<S>> f257929a = new ArrayList();

    @NotNull
    public final a<S> a(S s10) {
        int i10 = 1 << 0;
        this.f257929a.add(new b<>(s10, null, false, false, false, 28, null));
        return this;
    }

    @NotNull
    public final a<S> b(@NotNull String title, @NotNull S[] sources) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sources, "sources");
        int length = sources.length;
        int i10 = 0;
        while (i10 < length) {
            this.f257929a.add(new b<>(sources[i10], i10 == 0 ? title : null, i10 == sources.length, false, false, 24, null));
            i10++;
        }
        return this;
    }

    @NotNull
    public final a<S> c(@NotNull S[] sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        int length = sources.length;
        for (int i10 = 0; i10 < length; i10++) {
            List<b<S>> list = this.f257929a;
            S s10 = sources[i10];
            boolean z10 = true;
            if (i10 != sources.length - 1) {
                z10 = false;
            }
            int i11 = 0 << 0;
            list.add(new b<>(s10, null, z10, false, false, 24, null));
        }
        return this;
    }

    @NotNull
    public final a<S> d(@NotNull String[] titles, @NotNull S[] sources) {
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(sources, "sources");
        int length = sources.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0 >> 0;
            this.f257929a.add(new b<>(sources[i10], titles[i10], false, false, false, 28, null));
        }
        return this;
    }

    @NotNull
    public final List<b<S>> e() {
        return this.f257929a;
    }
}
