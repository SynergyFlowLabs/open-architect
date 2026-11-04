package coil.fetch;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.request.n;
import coil.util.s;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDrawableFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableFetcher.kt\ncoil/fetch/DrawableFetcher\n+ 2 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,42:1\n50#2:43\n28#3:44\n*S KotlinDebug\n*F\n+ 1 DrawableFetcher.kt\ncoil/fetch/DrawableFetcher\n*L\n26#1:43\n26#1:44\n*E\n"})
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f87351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87352b;

    public static final class a implements h.a<Drawable> {
        @Override // coil.fetch.h.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Drawable drawable, @NotNull n nVar, @NotNull coil.j jVar) {
            return new e(drawable, nVar);
        }
    }

    public e(@NotNull Drawable drawable, @NotNull n nVar) {
        this.f87351a = drawable;
        this.f87352b = nVar;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        Drawable bitmapDrawable;
        boolean zD = coil.util.l.D(this.f87351a);
        if (zD) {
            bitmapDrawable = new BitmapDrawable(this.f87352b.g().getResources(), s.f87858a.a(this.f87351a, this.f87352b.f(), this.f87352b.p(), this.f87352b.o(), this.f87352b.c()));
        } else {
            bitmapDrawable = this.f87351a;
        }
        return new f(bitmapDrawable, zD, coil.decode.e.MEMORY);
    }
}
