package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.request.n;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBitmapFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFetcher.kt\ncoil/fetch/BitmapFetcher\n+ 2 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,29:1\n50#2:30\n28#3:31\n*S KotlinDebug\n*F\n+ 1 BitmapFetcher.kt\ncoil/fetch/BitmapFetcher\n*L\n16#1:30\n16#1:31\n*E\n"})
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bitmap f87345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f87346b;

    public static final class a implements h.a<Bitmap> {
        @Override // coil.fetch.h.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(@NotNull Bitmap bitmap, @NotNull n nVar, @NotNull coil.j jVar) {
            return new b(bitmap, nVar);
        }
    }

    public b(@NotNull Bitmap bitmap, @NotNull n nVar) {
        this.f87345a = bitmap;
        this.f87346b = nVar;
    }

    @Override // coil.fetch.h
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        return new f(new BitmapDrawable(this.f87346b.g().getResources(), this.f87345a), false, coil.decode.e.MEMORY);
    }
}
