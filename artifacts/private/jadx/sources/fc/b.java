package fc;

import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.m1;
import com.planner5d.library.services.bitmaploader.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    @Nullable
    d.C1663d a(@Nullable String str, int i10, int i11, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, long j10);

    @m1
    void b(@Nullable String str, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar);

    @NotNull
    Bitmap c();

    @m1
    @Nullable
    Pair<String, Integer> d(@Nullable String str);
}
