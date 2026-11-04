package coil.compose;

import android.content.Context;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.n4;
import androidx.compose.runtime.p4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.b1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@oj.g
@kotlin.l(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it's not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it's recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.")
@SourceDebugExtension({"SMAP\nLocalImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,55:1\n74#2:56\n24#3:57\n*S KotlinDebug\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n*L\n50#1:56\n50#1:57\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m4<coil.j> f87069a;

    private /* synthetic */ p(m4 m4Var) {
        this.f87069a = m4Var;
    }

    public static final /* synthetic */ p b(m4 m4Var) {
        return new p(m4Var);
    }

    @NotNull
    public static m4<coil.j> c(@NotNull m4<coil.j> m4Var) {
        return m4Var;
    }

    public static /* synthetic */ m4 d(m4 m4Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            m4Var = a1.m(new Function0() { // from class: coil.compose.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.e();
                }
            });
        }
        return c(m4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.j e() {
        return null;
    }

    public static boolean f(m4<coil.j> m4Var, Object obj) {
        return (obj instanceof p) && Intrinsics.areEqual(m4Var, ((p) obj).m());
    }

    public static final boolean g(m4<coil.j> m4Var, m4<coil.j> m4Var2) {
        return Intrinsics.areEqual(m4Var, m4Var2);
    }

    @NotNull
    @androidx.compose.runtime.o
    @p4
    @oj.i(name = "getCurrent")
    public static final coil.j h(m4<coil.j> m4Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        coil.j jVarC = (coil.j) c0Var.W(m4Var);
        if (jVarC == null) {
            jVarC = coil.b.c((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()));
        }
        return jVarC;
    }

    @kotlin.l(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it's not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it's recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.", replaceWith = @b1(expression = "LocalContext.current.imageLoader", imports = {"androidx.compose.ui.platform.LocalContext", "coil.imageLoader"}))
    public static /* synthetic */ void i() {
    }

    public static int j(m4<coil.j> m4Var) {
        return m4Var.hashCode();
    }

    @kotlin.l(message = "Implement `ImageLoaderFactory` in your `android.app.Application` class.")
    @NotNull
    public static final n4<coil.j> k(m4<coil.j> m4Var, @NotNull coil.j jVar) {
        return m4Var.f(jVar);
    }

    public static String l(m4<coil.j> m4Var) {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + m4Var + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f87069a, obj);
    }

    public int hashCode() {
        return j(this.f87069a);
    }

    public final /* synthetic */ m4 m() {
        return this.f87069a;
    }

    public String toString() {
        return l(this.f87069a);
    }
}
