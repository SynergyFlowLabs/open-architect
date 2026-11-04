package com.planner5d.library.widget.bitmaptarget;

import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.services.bitmaploader.target.m;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f249611a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f249612b = 0;

    private a() {
    }

    @j
    @n
    @NotNull
    public static final com.planner5d.library.services.bitmaploader.target.a a(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        return g(imageView, null, null, 3, null);
    }

    @n
    @NotNull
    public static final com.planner5d.library.services.bitmaploader.target.a b(@NotNull ImageView imageView, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        c cVar = new c(imageView, null, null, 6, null);
        if (hVar != null) {
            hVar.c(cVar);
        }
        return cVar;
    }

    @j
    @n
    @NotNull
    public static final com.planner5d.library.services.bitmaploader.target.a c(@NotNull ImageView imageView, @Nullable com.planner5d.library.widget.drawable.h.b bVar) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        return g(imageView, bVar, null, 2, null);
    }

    @j
    @n
    @NotNull
    public static final com.planner5d.library.services.bitmaploader.target.a d(@NotNull ImageView imageView, @Nullable com.planner5d.library.widget.drawable.h.b bVar, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        boolean z10 = true;
        c cVar = new c(imageView, bVar, null, 4, null);
        if (hVar != null) {
            hVar.c(cVar);
        }
        return cVar;
    }

    @n
    @NotNull
    public static final com.planner5d.library.services.bitmaploader.target.a e(@NotNull m mVar, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        b bVar = new b(mVar);
        if (hVar != null) {
            hVar.c(bVar);
        }
        return bVar;
    }

    public static /* synthetic */ com.planner5d.library.services.bitmaploader.target.a f(ImageView imageView, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = null;
        }
        return b(imageView, hVar);
    }

    public static /* synthetic */ com.planner5d.library.services.bitmaploader.target.a g(ImageView imageView, com.planner5d.library.widget.drawable.h.b bVar, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = null;
        }
        if ((i10 & 2) != 0) {
            hVar = null;
        }
        return d(imageView, bVar, hVar);
    }

    public static /* synthetic */ com.planner5d.library.services.bitmaploader.target.a h(m mVar, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = null;
        }
        return e(mVar, hVar);
    }
}
