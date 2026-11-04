package androidx.activity.result;

import androidx.annotation.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    @NotNull
    public static final m a(long j10, @NotNull g.b.j.g mediaType, @g0(from = 2) int i10, boolean z10, @NotNull g.b.j.AbstractC1906b defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new m.a().e(mediaType).d(i10).f(z10).c(defaultTab).b(j10).a();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ m b(g.b.j.g mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new m.a().e(mediaType).a();
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ m c(g.b.j.g mediaType, @g0(from = 2) int i10) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new m.a().e(mediaType).d(i10).a();
    }

    @NotNull
    public static final m d(@NotNull g.b.j.g mediaType, @g0(from = 2) int i10, boolean z10, @NotNull g.b.j.AbstractC1906b defaultTab) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
        return new m.a().e(mediaType).d(i10).f(z10).c(defaultTab).a();
    }

    public static /* synthetic */ m e(long j10, g.b.j.g gVar, int i10, boolean z10, g.b.j.AbstractC1906b abstractC1906b, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            gVar = g.b.j.c.f275339a;
        }
        g.b.j.g gVar2 = gVar;
        if ((i11 & 4) != 0) {
            i10 = g.b.i.f275325b.a();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            abstractC1906b = g.b.j.AbstractC1906b.C1907b.f275337a;
        }
        return a(j10, gVar2, i12, z11, abstractC1906b);
    }

    public static /* synthetic */ m f(g.b.j.g gVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = g.b.j.c.f275339a;
        }
        if ((i11 & 2) != 0) {
            i10 = g.b.i.f275325b.a();
        }
        return c(gVar, i10);
    }

    public static /* synthetic */ m g(g.b.j.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = g.b.j.c.f275339a;
        }
        return b(gVar);
    }

    public static /* synthetic */ m h(g.b.j.g gVar, int i10, boolean z10, g.b.j.AbstractC1906b abstractC1906b, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = g.b.j.c.f275339a;
        }
        if ((i11 & 2) != 0) {
            i10 = g.b.i.f275325b.a();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            abstractC1906b = g.b.j.AbstractC1906b.C1907b.f275337a;
        }
        return d(gVar, i10, z10, abstractC1906b);
    }
}
