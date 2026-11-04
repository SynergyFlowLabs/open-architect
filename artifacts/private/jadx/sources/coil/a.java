package coil;

import android.content.Context;
import android.widget.ImageView;
import coil.util.p;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,114:1\n24#1:115\n59#1,6:116\n24#1:122\n59#1,6:123\n71#1,2:129\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions\n*L\n56#1:115\n92#1:116,6\n90#1:122\n92#1:123,6\n102#1:129,2\n*E\n"})
@oj.i(name = "-SingletonExtensions")
public final class a {

    /* JADX INFO: renamed from: coil.a$a, reason: collision with other inner class name */
    public static final class C0807a implements Function1<coil.request.i.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0807a f86929a = new C0807a();

        public final void c(coil.request.i.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(coil.request.i.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public static final class b implements Function1<coil.request.i.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f86930a = new b();

        public final void c(coil.request.i.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(coil.request.i.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    @kotlin.l(level = n.ERROR, message = "Migrate to 'dispose'.", replaceWith = @b1(expression = "dispose()", imports = {"coil.dispose"}))
    public static final void a(@NotNull ImageView imageView) {
        p.b(imageView);
    }

    public static final void b(@NotNull ImageView imageView) {
        p.b(imageView);
    }

    @NotNull
    public static final j c(@NotNull Context context) {
        return coil.b.c(context);
    }

    @Nullable
    public static final coil.request.j d(@NotNull ImageView imageView) {
        return p.c(imageView);
    }

    @kotlin.l(level = n.ERROR, message = "Migrate to 'result'.", replaceWith = @b1(expression = "result", imports = {"coil.result"}))
    public static /* synthetic */ void e(ImageView imageView) {
    }

    @Nullable
    public static final coil.request.j f(@NotNull ImageView imageView) {
        return p.c(imageView);
    }

    @NotNull
    public static final coil.request.e g(@NotNull ImageView imageView, @Nullable Object obj, @NotNull j jVar, @NotNull Function1<? super coil.request.i.a, Unit> function1) {
        coil.request.i.a aVarL0 = new coil.request.i.a(imageView.getContext()).j(obj).l0(imageView);
        function1.invoke(aVarL0);
        return jVar.c(aVarL0.f());
    }

    public static /* synthetic */ coil.request.e h(ImageView imageView, Object obj, j jVar, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            jVar = coil.b.c(imageView.getContext());
        }
        if ((i10 & 4) != 0) {
            function1 = C0807a.f86929a;
        }
        coil.request.i.a aVarL0 = new coil.request.i.a(imageView.getContext()).j(obj).l0(imageView);
        function1.invoke(aVarL0);
        return jVar.c(aVarL0.f());
    }

    @kotlin.l(level = n.ERROR, message = "Migrate to 'load'.", replaceWith = @b1(expression = "load(data, imageLoader, builder)", imports = {"coil.imageLoader", "coil.load"}))
    @NotNull
    public static final coil.request.e i(@NotNull ImageView imageView, @Nullable Object obj, @NotNull j jVar, @NotNull Function1<? super coil.request.i.a, Unit> function1) {
        coil.request.i.a aVarL0 = new coil.request.i.a(imageView.getContext()).j(obj).l0(imageView);
        function1.invoke(aVarL0);
        return jVar.c(aVarL0.f());
    }

    public static /* synthetic */ coil.request.e j(ImageView imageView, Object obj, j jVar, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            jVar = coil.b.c(imageView.getContext());
        }
        if ((i10 & 4) != 0) {
            function1 = b.f86930a;
        }
        coil.request.i.a aVarL0 = new coil.request.i.a(imageView.getContext()).j(obj).l0(imageView);
        function1.invoke(aVarL0);
        return jVar.c(aVarL0.f());
    }
}
