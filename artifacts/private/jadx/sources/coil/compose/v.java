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
@SourceDebugExtension({"SMAP\nSingletonImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,108:1\n74#2:109\n74#2:110\n*S KotlinDebug\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n*L\n54#1:109\n76#1:110\n*E\n"})
public final class v {
    @androidx.compose.runtime.o
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter a(@NotNull coil.request.i iVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(2091320589);
        boolean z10 = false & false;
        AsyncImagePainter asyncImagePainterB = u.b(iVar, null, null, null, 0, null, c0Var, 8, 62);
        c0Var.w0();
        return asyncImagePainterB;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter b(@NotNull coil.request.i iVar, @NotNull Function2<? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, ? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, Boolean> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(-2003443841);
        int i11 = 0 << 0;
        AsyncImagePainter asyncImagePainterB = u.b(iVar, null, null, null, 0, null, c0Var, 8, 62);
        c0Var.w0();
        return asyncImagePainterB;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter c(@Nullable Object obj, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(1998134191);
        AsyncImagePainter asyncImagePainterB = u.b(obj, null, null, null, 0, null, c0Var, 8, 62);
        c0Var.w0();
        return asyncImagePainterB;
    }

    @androidx.compose.runtime.o
    @kotlin.l(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter d(@Nullable Object obj, @NotNull Function1<? super coil.request.i.a, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(309201794);
        coil.request.i.a aVarJ = new coil.request.i.a((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).j(obj);
        function1.invoke(aVarJ);
        AsyncImagePainter asyncImagePainterB = u.b(aVarJ.f(), null, null, null, 0, null, c0Var, 8, 62);
        c0Var.w0();
        return asyncImagePainterB;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @NotNull
    public static final AsyncImagePainter e(@Nullable Object obj, @NotNull Function2<? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, ? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, Boolean> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(2090701729);
        AsyncImagePainter asyncImagePainterB = u.b(obj, null, null, null, 0, null, c0Var, 8, 62);
        c0Var.w0();
        return asyncImagePainterB;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @b1(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @NotNull
    public static final AsyncImagePainter f(@Nullable Object obj, @NotNull Function2<? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, ? super n1<? extends AsyncImagePainter.State, coil.request.i, n0.n>, Boolean> function2, @NotNull Function1<? super coil.request.i.a, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        c0Var.h0(305839348);
        coil.request.i.a aVarJ = new coil.request.i.a((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).j(obj);
        function1.invoke(aVarJ);
        AsyncImagePainter asyncImagePainterB = u.b(aVarJ.f(), null, null, null, 0, null, c0Var, 8, 62);
        c0Var.w0();
        return asyncImagePainterB;
    }
}
