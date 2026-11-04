package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(api = 26)
final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o1 f41681a = new o1();

    private o1() {
    }

    @androidx.annotation.w0(26)
    @androidx.compose.ui.text.v
    private final FontVariationAxis[] d(u0.e eVar, Context context) {
        androidx.compose.ui.unit.d dVarA;
        if (context != null) {
            dVarA = androidx.compose.ui.unit.a.a(context);
        } else {
            if (eVar.a()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            dVarA = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
        }
        return f1.d(eVar, dVarA, f1.c(context));
    }

    @androidx.compose.ui.text.v
    @Nullable
    public final Typeface a(@NotNull AssetManager assetManager, @NotNull String str, @Nullable Context context, @NotNull u0.e eVar) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(d(eVar, context)).build();
    }

    @androidx.compose.ui.text.v
    @Nullable
    public final Typeface b(@NotNull File file, @Nullable Context context, @NotNull u0.e eVar) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(d(eVar, context)).build();
    }

    @androidx.compose.ui.text.v
    @Nullable
    public final Typeface c(@NotNull ParcelFileDescriptor parcelFileDescriptor, @Nullable Context context, @NotNull u0.e eVar) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(d(eVar, context)).build();
    }
}
