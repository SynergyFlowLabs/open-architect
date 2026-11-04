package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV21\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV21\n*L\n114#1:221\n114#1:223\n114#1:222\n114#1:224\n*E\n"})
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f37991a = new j();

    private j() {
    }

    @Override // androidx.compose.ui.graphics.layer.i
    @Nullable
    public Object a(@NotNull c cVar, @NotNull kotlin.coroutines.d<? super Bitmap> dVar) {
        long jF = cVar.F();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (jF >> 32), (int) (jF & k0.f265952a), Bitmap.Config.ARGB_8888);
        cVar.h(androidx.compose.ui.graphics.c.b(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
