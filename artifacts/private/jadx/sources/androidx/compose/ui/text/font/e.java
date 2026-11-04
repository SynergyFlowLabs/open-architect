package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.k7;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "AndroidFontKt")
public final class e {
    @k7
    @androidx.annotation.w0(26)
    @NotNull
    public static final x a(@NotNull ParcelFileDescriptor parcelFileDescriptor, @NotNull v0 v0Var, int i10, @NotNull u0.e eVar) {
        return new b(parcelFileDescriptor, v0Var, i10, eVar, null);
    }

    @k7
    @NotNull
    public static final x b(@NotNull File file, @NotNull v0 v0Var, int i10, @NotNull u0.e eVar) {
        return new c(file, v0Var, i10, eVar, null);
    }

    public static /* synthetic */ x c(ParcelFileDescriptor parcelFileDescriptor, v0 v0Var, int i10, u0.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i11 & 4) != 0) {
            i10 = q0.f41690b.c();
        }
        if ((i11 & 8) != 0) {
            eVar = u0.f41723a.b(v0Var, i10, new u0.a[0]);
        }
        return a(parcelFileDescriptor, v0Var, i10, eVar);
    }

    public static /* synthetic */ x d(File file, v0 v0Var, int i10, u0.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i11 & 4) != 0) {
            i10 = q0.f41690b.c();
        }
        if ((i11 & 8) != 0) {
            eVar = u0.f41723a.b(v0Var, i10, new u0.a[0]);
        }
        return b(file, v0Var, i10, eVar);
    }

    @k7
    @NotNull
    public static final x e(@NotNull String str, @NotNull AssetManager assetManager, @NotNull v0 v0Var, int i10, @NotNull u0.e eVar) {
        return new a(assetManager, str, v0Var, i10, eVar, null);
    }

    public static /* synthetic */ x f(String str, AssetManager assetManager, v0 v0Var, int i10, u0.e eVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i11 & 8) != 0) {
            i10 = q0.f41690b.c();
        }
        if ((i11 & 16) != 0) {
            eVar = u0.f41723a.b(v0Var, i10, new u0.a[0]);
        }
        return e(str, assetManager, v0Var, i10, eVar);
    }

    private static final void g() {
    }
}
