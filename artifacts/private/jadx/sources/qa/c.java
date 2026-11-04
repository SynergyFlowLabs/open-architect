package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.helper.imagechooser.m;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f350290c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f350291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String[] f350292b;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream e(Context context, Uri uri) throws IOException {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            Intrinsics.checkNotNull(inputStreamOpenInputStream);
            return inputStreamOpenInputStream;
        } catch (Exception e10) {
            throw new IOException(e10);
        }
    }

    @Override // qa.e
    public boolean a() {
        return this.f350291a;
    }

    @Override // qa.e
    @m1
    @Nullable
    public Bitmap b(@NotNull final Context context, @NotNull final Uri input, @NotNull m options) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(options, "options");
        td.a.InterfaceC2511a interfaceC2511a = new td.a.InterfaceC2511a() { // from class: qa.b
            @Override // td.a.InterfaceC2511a
            public final InputStream a() {
                return c.e(context, input);
            }
        };
        td.a aVar = td.a.f380845a;
        Bitmap bitmapV = aVar.v(options.c(), options.c(), interfaceC2511a);
        if (bitmapV == null) {
            return null;
        }
        return aVar.r(bitmapV, interfaceC2511a);
    }

    @Override // qa.e
    @NotNull
    public String[] c() {
        return this.f350292b;
    }

    public c(boolean z10, @NotNull String[] mimeTypes) {
        Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
        this.f350291a = z10;
        this.f350292b = mimeTypes;
    }

    public /* synthetic */ c(boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? new String[]{"image/*"} : strArr);
    }
}
