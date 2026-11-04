package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.v;
import androidx.annotation.x;
import coil.memory.MemoryCache;
import coil.util.a0;
import coil.util.w;
import coil.util.z;
import kotlin.Unit;
import kotlin.b1;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n;
import kotlinx.coroutines.n0;
import okhttp3.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface j {
    @Nullable
    coil.disk.a a();

    @NotNull
    coil.request.c b();

    @NotNull
    coil.request.e c(@NotNull coil.request.i iVar);

    @Nullable
    Object d(@NotNull coil.request.i iVar, @NotNull kotlin.coroutines.d<? super coil.request.j> dVar);

    @NotNull
    a e();

    @Nullable
    MemoryCache f();

    @NotNull
    c getComponents();

    void shutdown();

    @SourceDebugExtension({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f87483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private coil.request.c f87484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private f0<? extends MemoryCache> f87485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private f0<? extends coil.disk.a> f87486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private f0<? extends okhttp3.e.a> f87487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private d.InterfaceC0813d f87488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private c f87489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private w f87490h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private z f87491i;

        public a(@NotNull Context context) {
            this.f87483a = context.getApplicationContext();
            this.f87484b = coil.util.k.b();
            this.f87485c = null;
            this.f87486d = null;
            this.f87487e = null;
            this.f87488f = null;
            this.f87489g = null;
            this.f87490h = new w(false, false, false, 0, null, 31, null);
            this.f87491i = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d F(d dVar, coil.request.i iVar) {
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemoryCache m(a aVar) {
            return new MemoryCache.a(aVar.f87483a).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final coil.disk.a n(a aVar) {
            return a0.f87806a.a(aVar.f87483a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 o() {
            return new b0();
        }

        @NotNull
        public final a A(@NotNull coil.request.b bVar) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : bVar, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a B(@NotNull n0 n0Var) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : n0Var, (24575 & 4) != 0 ? cVar.f87618c : n0Var, (24575 & 8) != 0 ? cVar.f87619d : n0Var, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a C(@v int i10) {
            return D(coil.util.d.a(this.f87483a, i10));
        }

        @NotNull
        public final a D(@Nullable Drawable drawable) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : drawable != null ? drawable.mutate() : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a E(@NotNull final d dVar) {
            return G(new d.InterfaceC0813d() { // from class: coil.i
                @Override // coil.d.InterfaceC0813d
                public final d b(coil.request.i iVar) {
                    return j.a.F(dVar, iVar);
                }
            });
        }

        @NotNull
        public final a G(@NotNull d.InterfaceC0813d interfaceC0813d) {
            this.f87488f = interfaceC0813d;
            return this;
        }

        @NotNull
        public final a H(@v int i10) {
            return I(coil.util.d.a(this.f87483a, i10));
        }

        @NotNull
        public final a I(@Nullable Drawable drawable) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : drawable != null ? drawable.mutate() : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a J(@NotNull n0 n0Var) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : n0Var, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a K(@NotNull n0 n0Var) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : n0Var, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @kotlin.l(level = n.ERROR, message = "Migrate to 'interceptorDispatcher'.", replaceWith = @b1(expression = "interceptorDispatcher(if (enable) Dispatchers.Main.immediate else Dispatchers.IO)", imports = {"kotlinx.coroutines.Dispatchers"}))
        @NotNull
        public final a L(boolean z10) {
            coil.util.l.K();
            throw new kotlin.a0();
        }

        @NotNull
        public final a M(@Nullable z zVar) {
            this.f87491i = zVar;
            return this;
        }

        @NotNull
        public final a N(@Nullable MemoryCache memoryCache) {
            this.f87485c = g0.e(memoryCache);
            return this;
        }

        @NotNull
        public final a O(@NotNull Function0<? extends MemoryCache> function0) {
            this.f87485c = g0.c(function0);
            return this;
        }

        @NotNull
        public final a P(@NotNull coil.request.b bVar) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : bVar, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a Q(@NotNull coil.request.b bVar) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : bVar);
            return this;
        }

        @NotNull
        public final a R(boolean z10) {
            this.f87490h = w.b(this.f87490h, false, z10, false, 0, null, 29, null);
            return this;
        }

        @NotNull
        public final a S(@NotNull Function0<? extends b0> function0) {
            return p(function0);
        }

        @NotNull
        public final a T(@NotNull b0 b0Var) {
            return q(b0Var);
        }

        @NotNull
        public final a U(@v int i10) {
            return V(coil.util.d.a(this.f87483a, i10));
        }

        @NotNull
        public final a V(@Nullable Drawable drawable) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : drawable != null ? drawable.mutate() : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a W(@NotNull coil.size.e eVar) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : eVar, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a X(boolean z10) {
            this.f87490h = w.b(this.f87490h, false, false, z10, 0, null, 27, null);
            return this;
        }

        @kotlin.l(level = n.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @b1(expression = "memoryCache { MemoryCache.Builder(context).weakReferencesEnabled(enable).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final a Y(boolean z10) {
            coil.util.l.K();
            throw new kotlin.a0();
        }

        @NotNull
        public final a Z(@NotNull n0 n0Var) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : n0Var, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @kotlin.l(level = n.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @b1(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final a a0(@NotNull coil.transition.c cVar) {
            coil.util.l.K();
            throw new kotlin.a0();
        }

        @NotNull
        public final a b0(@NotNull coil.transition.c.a aVar) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : aVar, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a e(boolean z10) {
            this.f87490h = w.b(this.f87490h, z10, false, false, 0, null, 30, null);
            return this;
        }

        @NotNull
        public final a f(boolean z10) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : z10, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a g(boolean z10) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : z10, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @kotlin.l(level = n.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @b1(expression = "memoryCache { MemoryCache.Builder(context).maxSizePercent(percent).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final a h(@x(from = 0.0d, to = 1.0d) double d10) {
            coil.util.l.K();
            throw new kotlin.a0();
        }

        @NotNull
        public final a i(@NotNull Bitmap.Config config) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : null, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : config, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a j(@NotNull coil.decode.k kVar) {
            this.f87490h = w.b(this.f87490h, false, false, false, 0, kVar, 15, null);
            return this;
        }

        @NotNull
        public final a k(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("maxParallelism must be > 0.");
            }
            int i11 = 2 >> 0;
            this.f87490h = w.b(this.f87490h, false, false, false, i10, null, 23, null);
            return this;
        }

        @NotNull
        public final j l() {
            Context context = this.f87483a;
            coil.request.c cVar = this.f87484b;
            f0<? extends MemoryCache> f0VarC = this.f87485c;
            if (f0VarC == null) {
                f0VarC = g0.c(new Function0() { // from class: coil.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.a.m(this.f87342a);
                    }
                });
            }
            f0<? extends coil.disk.a> f0VarC2 = this.f87486d;
            if (f0VarC2 == null) {
                f0VarC2 = g0.c(new Function0() { // from class: coil.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.a.n(this.f87391a);
                    }
                });
            }
            f0<? extends okhttp3.e.a> f0VarC3 = this.f87487e;
            if (f0VarC3 == null) {
                f0VarC3 = g0.c(new Function0() { // from class: coil.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.a.o();
                    }
                });
            }
            d.InterfaceC0813d interfaceC0813d = this.f87488f;
            if (interfaceC0813d == null) {
                interfaceC0813d = d.InterfaceC0813d.f87120b;
            }
            c cVar2 = this.f87489g;
            if (cVar2 == null) {
                cVar2 = new c();
            }
            return new m(context, cVar, f0VarC, f0VarC2, f0VarC3, interfaceC0813d, cVar2, this.f87490h, this.f87491i);
        }

        @NotNull
        public final a p(@NotNull Function0<? extends okhttp3.e.a> function0) {
            this.f87487e = g0.c(function0);
            return this;
        }

        @NotNull
        public final a q(@NotNull okhttp3.e.a aVar) {
            this.f87487e = g0.e(aVar);
            return this;
        }

        @kotlin.l(level = n.ERROR, message = "Replace with 'components'.", replaceWith = @b1(expression = "components(registry)", imports = {}))
        @NotNull
        public final a r(@NotNull c cVar) {
            coil.util.l.K();
            throw new kotlin.a0();
        }

        @kotlin.l(level = n.ERROR, message = "Replace with 'components'.", replaceWith = @b1(expression = "components(builder)", imports = {}))
        public final /* synthetic */ a s(Function1 function1) {
            coil.util.l.K();
            throw new kotlin.a0();
        }

        @NotNull
        public final a t(@NotNull c cVar) {
            this.f87489g = cVar;
            return this;
        }

        public final /* synthetic */ a u(Function1<? super c.a, Unit> function1) {
            c.a aVar = new c.a();
            function1.invoke(aVar);
            return t(aVar.i());
        }

        @NotNull
        public final a v(int i10) {
            coil.transition.c.a c0822a;
            if (i10 > 0) {
                c0822a = new coil.transition.a.C0822a(i10, false, 2, null);
            } else {
                c0822a = coil.transition.c.a.f87804b;
            }
            b0(c0822a);
            return this;
        }

        @NotNull
        public final a w(boolean z10) {
            return v(z10 ? 100 : 0);
        }

        @NotNull
        public final a x(@NotNull n0 n0Var) {
            coil.request.c cVar = this.f87484b;
            this.f87484b = cVar.a((24575 & 1) != 0 ? cVar.f87616a : null, (24575 & 2) != 0 ? cVar.f87617b : null, (24575 & 4) != 0 ? cVar.f87618c : n0Var, (24575 & 8) != 0 ? cVar.f87619d : null, (24575 & 16) != 0 ? cVar.f87620e : null, (24575 & 32) != 0 ? cVar.f87621f : null, (24575 & 64) != 0 ? cVar.f87622g : null, (24575 & 128) != 0 ? cVar.f87623h : false, (24575 & 256) != 0 ? cVar.f87624i : false, (24575 & 512) != 0 ? cVar.f87625j : null, (24575 & 1024) != 0 ? cVar.f87626k : null, (24575 & 2048) != 0 ? cVar.f87627l : null, (24575 & 4096) != 0 ? cVar.f87628m : null, (24575 & 8192) != 0 ? cVar.f87629n : null, (24575 & 16384) != 0 ? cVar.f87630o : null);
            return this;
        }

        @NotNull
        public final a y(@Nullable coil.disk.a aVar) {
            this.f87486d = g0.e(aVar);
            return this;
        }

        @NotNull
        public final a z(@NotNull Function0<? extends coil.disk.a> function0) {
            this.f87486d = g0.c(function0);
            return this;
        }

        public a(@NotNull m mVar) {
            this.f87483a = mVar.l().getApplicationContext();
            this.f87484b = mVar.b();
            this.f87485c = mVar.r();
            this.f87486d = mVar.n();
            this.f87487e = mVar.j();
            this.f87488f = mVar.o();
            this.f87489g = mVar.k();
            this.f87490h = mVar.s();
            this.f87491i = mVar.p();
        }
    }
}
