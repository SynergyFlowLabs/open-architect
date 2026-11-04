package coil.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter a(Object obj, Function1 function1, Function1 function2, androidx.compose.ui.layout.l lVar, int i10, androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(-1494234083);
        if ((i12 & 2) != 0) {
            function1 = AsyncImagePainter.Z.a();
        }
        Function1 function3 = function1;
        if ((i12 & 4) != 0) {
            function2 = null;
        }
        Function1 function4 = function2;
        if ((i12 & 8) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.i();
        }
        androidx.compose.ui.layout.l lVar2 = lVar;
        if ((i12 & 16) != 0) {
            i10 = androidx.compose.ui.graphics.drawscope.f.H.b();
        }
        int i13 = i11 << 3;
        AsyncImagePainter asyncImagePainterC = g.c(obj, p.h(r.a(), c0Var, 6), function3, function4, lVar2, i10, null, c0Var, (i13 & 896) | 72 | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 64);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final AsyncImagePainter b(@Nullable Object obj, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function2, @Nullable androidx.compose.ui.layout.l lVar, int i10, @Nullable m mVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(236159766);
        if ((i12 & 2) != 0) {
            function1 = AsyncImagePainter.Z.a();
        }
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function3 = function1;
        if ((i12 & 4) != 0) {
            function2 = null;
        }
        Function1<? super AsyncImagePainter.State, Unit> function4 = function2;
        if ((i12 & 8) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.i();
        }
        androidx.compose.ui.layout.l lVar2 = lVar;
        if ((i12 & 16) != 0) {
            i10 = androidx.compose.ui.graphics.drawscope.f.H.b();
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            mVar = n.a();
        }
        int i14 = i11 << 3;
        AsyncImagePainter asyncImagePainterC = g.c(obj, p.h(r.a(), c0Var, 6), function3, function4, lVar2, i13, mVar, c0Var, (i14 & 896) | 72 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final AsyncImagePainter c(@Nullable Object obj, @Nullable androidx.compose.ui.graphics.painter.b bVar, @Nullable androidx.compose.ui.graphics.painter.b bVar2, @Nullable androidx.compose.ui.graphics.painter.b bVar3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function2, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function3, @Nullable androidx.compose.ui.layout.l lVar, int i10, @Nullable m mVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(1445305568);
        androidx.compose.ui.graphics.painter.b bVar4 = (i12 & 2) != 0 ? null : bVar;
        androidx.compose.ui.graphics.painter.b bVar5 = (i12 & 4) != 0 ? null : bVar2;
        int i13 = i11 << 3;
        AsyncImagePainter asyncImagePainterD = g.d(obj, p.h(r.a(), c0Var, 6), bVar4, bVar5, (i12 & 8) != 0 ? bVar5 : bVar3, (i12 & 16) != 0 ? null : function1, (i12 & 32) != 0 ? null : function2, (i12 & 64) != 0 ? null : function3, (i12 & 128) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar, (i12 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, (i12 & 512) != 0 ? n.a() : mVar, c0Var, (458752 & i13) | 37448 | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), (i11 >> 27) & 14, 0);
        c0Var.w0();
        return asyncImagePainterD;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter d(Object obj, androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, androidx.compose.ui.graphics.painter.b bVar3, Function1 function1, Function1 function2, Function1 function3, androidx.compose.ui.layout.l lVar, int i10, androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(533921043);
        androidx.compose.ui.graphics.painter.b bVar4 = (i12 & 2) != 0 ? null : bVar;
        androidx.compose.ui.graphics.painter.b bVar5 = (i12 & 4) != 0 ? null : bVar2;
        int i13 = i11 << 3;
        AsyncImagePainter asyncImagePainterD = g.d(obj, p.h(r.a(), c0Var, 6), bVar4, bVar5, (i12 & 8) != 0 ? bVar5 : bVar3, (i12 & 16) != 0 ? null : function1, (i12 & 32) != 0 ? null : function2, (i12 & 64) != 0 ? null : function3, (i12 & 128) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar, (i12 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, null, c0Var, (458752 & i13) | 37448 | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), 0, 1024);
        c0Var.w0();
        return asyncImagePainterD;
    }
}
