package coil;

import android.graphics.Bitmap;
import androidx.annotation.l0;
import androidx.annotation.m1;
import coil.request.n;
import coil.request.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends coil.request.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f87116a = b.f87118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final d f87117b = new a();

    public static final class a implements d {
        a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f87118a = new b();

        private b() {
        }
    }

    public static final class c {
        @m1
        @Deprecated
        public static void a(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.decode.h hVar, @NotNull n nVar, @Nullable coil.decode.f fVar) {
            d.super.u(iVar, hVar, nVar, fVar);
        }

        @m1
        @Deprecated
        public static void b(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.decode.h hVar, @NotNull n nVar) {
            d.super.G(iVar, hVar, nVar);
        }

        @m1
        @Deprecated
        public static void c(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.fetch.h hVar, @NotNull n nVar, @Nullable coil.fetch.g gVar) {
            d.super.d(iVar, hVar, nVar, gVar);
        }

        @m1
        @Deprecated
        public static void d(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.fetch.h hVar, @NotNull n nVar) {
            d.super.f(iVar, hVar, nVar);
        }

        @l0
        @Deprecated
        public static void e(@NotNull d dVar, @NotNull coil.request.i iVar, @Nullable String str) {
            d.super.a(iVar, str);
        }

        @l0
        @Deprecated
        public static void f(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull Object obj) {
            d.super.i(iVar, obj);
        }

        @l0
        @Deprecated
        public static void g(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull Object obj) {
            d.super.e(iVar, obj);
        }

        @l0
        @Deprecated
        public static void h(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull Object obj) {
            d.super.t(iVar, obj);
        }

        @l0
        @Deprecated
        public static void i(@NotNull d dVar, @NotNull coil.request.i iVar) {
            d.super.onCancel(iVar);
        }

        @l0
        @Deprecated
        public static void j(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.request.f fVar) {
            d.super.onError(iVar, fVar);
        }

        @l0
        @Deprecated
        public static void k(@NotNull d dVar, @NotNull coil.request.i iVar) {
            d.super.onStart(iVar);
        }

        @l0
        @Deprecated
        public static void l(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull r rVar) {
            d.super.onSuccess(iVar, rVar);
        }

        @l0
        @Deprecated
        public static void m(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.size.i iVar2) {
            d.super.x(iVar, iVar2);
        }

        @l0
        @Deprecated
        public static void n(@NotNull d dVar, @NotNull coil.request.i iVar) {
            d.super.I(iVar);
        }

        @m1
        @Deprecated
        public static void o(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull Bitmap bitmap) {
            d.super.E(iVar, bitmap);
        }

        @m1
        @Deprecated
        public static void p(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull Bitmap bitmap) {
            d.super.v(iVar, bitmap);
        }

        @l0
        @Deprecated
        public static void q(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.transition.c cVar) {
            d.super.n(iVar, cVar);
        }

        @l0
        @Deprecated
        public static void r(@NotNull d dVar, @NotNull coil.request.i iVar, @NotNull coil.transition.c cVar) {
            d.super.j(iVar, cVar);
        }
    }

    /* JADX INFO: renamed from: coil.d$d, reason: collision with other inner class name */
    public interface InterfaceC0813d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f87119a = a.f87121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        @NotNull
        public static final InterfaceC0813d f87120b = new InterfaceC0813d() { // from class: coil.e
            @Override // coil.d.InterfaceC0813d
            public final d b(coil.request.i iVar) {
                return d.InterfaceC0813d.c(iVar);
            }
        };

        /* JADX INFO: renamed from: coil.d$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f87121a = new a();

            private a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        static d c(coil.request.i iVar) {
            return d.f87117b;
        }

        @NotNull
        d b(@NotNull coil.request.i iVar);
    }

    @m1
    default void E(@NotNull coil.request.i iVar, @NotNull Bitmap bitmap) {
    }

    @m1
    default void G(@NotNull coil.request.i iVar, @NotNull coil.decode.h hVar, @NotNull n nVar) {
    }

    @l0
    default void I(@NotNull coil.request.i iVar) {
    }

    @l0
    default void a(@NotNull coil.request.i iVar, @Nullable String str) {
    }

    @m1
    default void d(@NotNull coil.request.i iVar, @NotNull coil.fetch.h hVar, @NotNull n nVar, @Nullable coil.fetch.g gVar) {
    }

    @l0
    default void e(@NotNull coil.request.i iVar, @NotNull Object obj) {
    }

    @m1
    default void f(@NotNull coil.request.i iVar, @NotNull coil.fetch.h hVar, @NotNull n nVar) {
    }

    @l0
    default void i(@NotNull coil.request.i iVar, @NotNull Object obj) {
    }

    @l0
    default void j(@NotNull coil.request.i iVar, @NotNull coil.transition.c cVar) {
    }

    @l0
    default void n(@NotNull coil.request.i iVar, @NotNull coil.transition.c cVar) {
    }

    @Override // coil.request.i.b
    @l0
    default void onCancel(@NotNull coil.request.i iVar) {
    }

    @Override // coil.request.i.b
    @l0
    default void onError(@NotNull coil.request.i iVar, @NotNull coil.request.f fVar) {
    }

    @Override // coil.request.i.b
    @l0
    default void onStart(@NotNull coil.request.i iVar) {
    }

    @Override // coil.request.i.b
    @l0
    default void onSuccess(@NotNull coil.request.i iVar, @NotNull r rVar) {
    }

    @l0
    default void t(@NotNull coil.request.i iVar, @NotNull Object obj) {
    }

    @m1
    default void u(@NotNull coil.request.i iVar, @NotNull coil.decode.h hVar, @NotNull n nVar, @Nullable coil.decode.f fVar) {
    }

    @m1
    default void v(@NotNull coil.request.i iVar, @NotNull Bitmap bitmap) {
    }

    @l0
    default void x(@NotNull coil.request.i iVar, @NotNull coil.size.i iVar2) {
    }
}
