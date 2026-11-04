package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.imagechooser.m;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class a extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f350285f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String[] f350286d = {"*/*"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f350287e;

    @Override // qa.f, qa.e
    public boolean a() {
        return this.f350287e;
    }

    @Override // qa.f, qa.e
    @m1
    @Nullable
    public Bitmap b(@NotNull Context context, @NotNull Uri input, @NotNull m options) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(options, "options");
        String lastPathSegment = input.getLastPathSegment();
        if (lastPathSegment != null) {
            String lowerCase = lastPathSegment.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null && StringsKt.V2(lowerCase, "pdf", false, 2, null)) {
                super.b(context, input, options);
            }
        }
        return null;
    }

    @Override // qa.f, qa.e
    @NotNull
    public String[] c() {
        return this.f350286d;
    }
}
