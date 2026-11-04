package nb;

import android.content.Context;
import android.graphics.Bitmap;
import com.planner5d.library.database.model.AutoStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface g {
    @Nullable
    Object a(@NotNull Context context, @Nullable Bitmap bitmap, @NotNull Function1<? super Long, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Nullable
    Object b(@NotNull Context context, @NotNull AutoStyle autoStyle, @NotNull byte[] bArr, @NotNull kotlin.coroutines.d<? super String> dVar);
}
