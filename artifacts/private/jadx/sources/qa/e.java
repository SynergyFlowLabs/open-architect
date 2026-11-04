package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.m1;
import com.planner5d.library.activity.helper.imagechooser.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface e {
    boolean a();

    @m1
    @Nullable
    Bitmap b(@NotNull Context context, @NotNull Uri uri, @NotNull m mVar) throws Exception;

    @NotNull
    String[] c();
}
