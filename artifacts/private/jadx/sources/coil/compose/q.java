package coil.compose;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n74#2:127\n74#2:128\n*S KotlinDebug\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n*L\n67#1:127\n91#1:128\n*E\n"})
public final class q {
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "AsyncImagePainter", imports = {"coil.compose.AsyncImagePainter"}))
    public static /* synthetic */ void a() {
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter b(@NotNull coil.request.i iVar, @NotNull coil.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(-2028135656);
        int i11 = 0 >> 0;
        AsyncImagePainter asyncImagePainterC = g.c(iVar, jVar, null, null, null, 0, null, c0Var, 72, 124);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter c(@NotNull coil.request.i iVar, @NotNull coil.j jVar, @NotNull Function2<? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, ? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, Boolean> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(-2123088410);
        AsyncImagePainter asyncImagePainterC = g.c(iVar, jVar, null, null, null, 0, null, c0Var, 72, 124);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter d(@Nullable Object obj, @NotNull coil.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(699722038);
        AsyncImagePainter asyncImagePainterC = g.c(obj, jVar, null, null, null, 0, null, c0Var, 72, 124);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter e(@Nullable Object obj, @NotNull coil.j jVar, @NotNull Function1<? super coil.request.i.a, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(1750824323);
        coil.request.i.a aVarJ = new coil.request.i.a((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).j(obj);
        function1.invoke(aVarJ);
        AsyncImagePainter asyncImagePainterC = g.c(aVarJ.f(), jVar, null, null, null, 0, null, c0Var, 72, 124);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter f(@Nullable Object obj, @NotNull coil.j jVar, @NotNull Function2<? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, ? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, Boolean> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(-1913684348);
        AsyncImagePainter asyncImagePainterC = g.c(obj, jVar, null, null, null, 0, null, c0Var, 72, 124);
        c0Var.w0();
        return asyncImagePainterC;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter g(@Nullable Object obj, @NotNull coil.j jVar, @NotNull Function2<? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, ? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, Boolean> function2, @NotNull Function1<? super coil.request.i.a, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(-976338607);
        coil.request.i.a aVarJ = new coil.request.i.a((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).j(obj);
        function1.invoke(aVarJ);
        AsyncImagePainter asyncImagePainterC = g.c(aVarJ.f(), jVar, null, null, null, 0, null, c0Var, 72, 124);
        c0Var.w0();
        return asyncImagePainterC;
    }
}
