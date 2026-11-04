package coil.compose;

import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.View;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.platform.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,475:1\n26#2,3:476\n30#2:486\n1116#3,6:479\n74#4:485\n1#5:487\n159#6:488\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n*L\n201#1:476,3\n201#1:486\n205#1:479,6\n210#1:485\n463#1:488\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f87048a = new a();

    public static final class a implements coil.transition.d {
        a() {
        }

        public Void e() {
            throw new UnsupportedOperationException();
        }

        @Override // coil.transition.d
        public Drawable f() {
            return null;
        }

        @Override // coil.transition.d
        public /* bridge */ /* synthetic */ View getView() {
            return (View) e();
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final AsyncImagePainter c(@Nullable Object obj, @NotNull coil.j jVar, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function2, @Nullable androidx.compose.ui.layout.l lVar, int i10, @Nullable m mVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(1645646697);
        if ((i12 & 4) != 0) {
            function1 = AsyncImagePainter.Z.a();
        }
        if ((i12 & 8) != 0) {
            function2 = null;
        }
        if ((i12 & 16) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.i();
        }
        if ((i12 & 32) != 0) {
            i10 = androidx.compose.ui.graphics.drawscope.f.H.b();
        }
        if ((i12 & 64) != 0) {
            mVar = n.a();
        }
        int i13 = i10;
        androidx.compose.ui.layout.l lVar2 = lVar;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function3 = function1;
        AsyncImagePainter asyncImagePainterG = g(new h(obj, mVar, jVar), function3, function2, lVar2, i13, c0Var, (i11 >> 3) & 65520);
        c0Var.w0();
        return asyncImagePainterG;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final AsyncImagePainter d(@Nullable Object obj, @NotNull coil.j jVar, @Nullable androidx.compose.ui.graphics.painter.b bVar, @Nullable androidx.compose.ui.graphics.painter.b bVar2, @Nullable androidx.compose.ui.graphics.painter.b bVar3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function2, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function3, @Nullable androidx.compose.ui.layout.l lVar, int i10, @Nullable m mVar, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12, int i13) {
        c0Var.h0(-79978785);
        if ((i13 & 4) != 0) {
            bVar = null;
        }
        if ((i13 & 8) != 0) {
            bVar2 = null;
        }
        if ((i13 & 16) != 0) {
            bVar3 = bVar2;
        }
        AsyncImagePainter asyncImagePainterG = g(new h(obj, (i13 & 1024) != 0 ? n.a() : mVar, jVar), g0.s(bVar, bVar2, bVar3), g0.k((i13 & 32) != 0 ? null : function1, (i13 & 64) != 0 ? null : function2, (i13 & 128) == 0 ? function3 : null), (i13 & 256) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar, (i13 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, c0Var, (i11 >> 15) & 64512);
        c0Var.w0();
        return asyncImagePainterG;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter e(Object obj, coil.j jVar, androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.graphics.painter.b bVar2, androidx.compose.ui.graphics.painter.b bVar3, Function1 function1, Function1 function2, Function1 function3, androidx.compose.ui.layout.l lVar, int i10, androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(2140758544);
        if ((i12 & 4) != 0) {
            bVar = null;
        }
        if ((i12 & 8) != 0) {
            bVar2 = null;
        }
        if ((i12 & 16) != 0) {
            bVar3 = bVar2;
        }
        AsyncImagePainter asyncImagePainterG = g(new h(obj, n.a(), jVar), g0.s(bVar, bVar2, bVar3), g0.k((i12 & 32) != 0 ? null : function1, (i12 & 64) != 0 ? null : function2, (i12 & 128) == 0 ? function3 : null), (i12 & 256) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar, (i12 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10, c0Var, (i11 >> 15) & 64512);
        c0Var.w0();
        return asyncImagePainterG;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter f(Object obj, coil.j jVar, Function1 function1, Function1 function2, androidx.compose.ui.layout.l lVar, int i10, androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        c0Var.h0(-2020614074);
        if ((i12 & 4) != 0) {
            function1 = AsyncImagePainter.Z.a();
        }
        Function1 function3 = function1;
        if ((i12 & 8) != 0) {
            function2 = null;
        }
        Function1 function4 = function2;
        if ((i12 & 16) != 0) {
            lVar = androidx.compose.ui.layout.l.f39405a.i();
        }
        androidx.compose.ui.layout.l lVar2 = lVar;
        if ((i12 & 32) != 0) {
            i10 = androidx.compose.ui.graphics.drawscope.f.H.b();
        }
        AsyncImagePainter asyncImagePainterG = g(new h(obj, n.a(), jVar), function3, function4, lVar2, i10, c0Var, (i11 >> 3) & 65520);
        c0Var.w0();
        return asyncImagePainterG;
    }

    @androidx.compose.runtime.o
    private static final AsyncImagePainter g(h hVar, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function2, androidx.compose.ui.layout.l lVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        c0Var.h0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            coil.request.i iVarM = g0.m(hVar.b(), c0Var, 8);
            k(iVarM);
            c0Var.h0(1094691773);
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new AsyncImagePainter(iVarM, hVar.a());
                c0Var.Y(objI0);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objI0;
            c0Var.w0();
            asyncImagePainter.T(function1);
            asyncImagePainter.O(function2);
            asyncImagePainter.L(lVar);
            asyncImagePainter.M(i10);
            asyncImagePainter.Q(((Boolean) c0Var.W(s2.a())).booleanValue());
            asyncImagePainter.N(hVar.a());
            asyncImagePainter.R(iVarM);
            asyncImagePainter.i();
            c0Var.w0();
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.size.i h(long j10) {
        if (j10 == n0.n.f332724b.a()) {
            return coil.size.i.f87783d;
        }
        if (!g0.j(j10)) {
            return null;
        }
        float fT = n0.n.t(j10);
        coil.size.c cVarA = (Float.isInfinite(fT) || Float.isNaN(fT)) ? coil.size.c.b.f87768a : coil.size.a.a(kotlin.math.b.L0(n0.n.t(j10)));
        float fM = n0.n.m(j10);
        return new coil.size.i(cVarA, (Float.isInfinite(fM) || Float.isNaN(fM)) ? coil.size.c.b.f87768a : coil.size.a.a(kotlin.math.b.L0(n0.n.m(j10))));
    }

    private static final Void i(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void j(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return i(str, str2);
    }

    private static final void k(coil.request.i iVar) {
        Object objM = iVar.m();
        if (objM instanceof coil.request.i.a) {
            i("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new kotlin.a0();
        }
        if (objM instanceof t1) {
            j("ImageBitmap", null, 2, null);
            throw new kotlin.a0();
        }
        if (objM instanceof androidx.compose.ui.graphics.vector.d) {
            j("ImageVector", null, 2, null);
            throw new kotlin.a0();
        }
        if (objM instanceof androidx.compose.ui.graphics.painter.b) {
            j("Painter", null, 2, null);
            throw new kotlin.a0();
        }
        if (iVar.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
