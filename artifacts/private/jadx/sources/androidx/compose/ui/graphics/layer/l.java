package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.w0;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f38002a = new l();

    @SourceDebugExtension({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture\n*L\n64#1:221\n66#1:223\n64#1:222\n66#1:224\n*E\n"})
    private static final class a extends Picture {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f38003a;

        public a(@NotNull c cVar) {
            this.f38003a = cVar;
        }

        @NotNull
        public final c a() {
            return this.f38003a;
        }

        @Override // android.graphics.Picture
        @NotNull
        public Canvas beginRecording(int i10, int i11) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public void draw(@NotNull Canvas canvas) {
            this.f38003a.h(androidx.compose.ui.graphics.c.b(canvas), null);
        }

        @Override // android.graphics.Picture
        public void endRecording() {
        }

        @Override // android.graphics.Picture
        public int getHeight() {
            return (int) (this.f38003a.F() & k0.f265952a);
        }

        @Override // android.graphics.Picture
        public int getWidth() {
            return (int) (this.f38003a.F() >> 32);
        }

        @Override // android.graphics.Picture
        public boolean requiresHardwareAcceleration() {
            return true;
        }
    }

    private l() {
    }

    @Override // androidx.compose.ui.graphics.layer.i
    @Nullable
    public Object a(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Bitmap> dVar) {
        return Bitmap.createBitmap(new a(cVar));
    }
}
