package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import com.rabbitmq.client.k0;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDragAndDrop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,64:1\n30#2:65\n53#3,3:66\n*S KotlinDebug\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n*L\n63#1:65\n63#1:66,3\n*E\n"})
public final class l {
    public static final long a(@NotNull b bVar) {
        float x10 = bVar.a().getX();
        float y10 = bVar.a().getY();
        return n0.g.g((((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & k0.f265952a));
    }

    @NotNull
    public static final Set<String> b(@NotNull b bVar) {
        ClipDescription clipDescription = bVar.a().getClipDescription();
        if (clipDescription == null) {
            return SetsKt.emptySet();
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i10 = 0; i10 < mimeTypeCount; i10++) {
            setCreateSetBuilder.add(clipDescription.getMimeType(i10));
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    @NotNull
    public static final DragEvent c(@NotNull b bVar) {
        return bVar.a();
    }
}
