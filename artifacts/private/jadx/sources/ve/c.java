package ve;

import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.model.p;
import com.planner5d.library.services.bitmaploader.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class c implements fc.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f385748d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k5 f385749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f385750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f385751c;

    public c(@NotNull k5 textureManager, @NotNull s0 globalSettingsManager, @NotNull y0 imageManager) {
        Intrinsics.checkNotNullParameter(textureManager, "textureManager");
        Intrinsics.checkNotNullParameter(globalSettingsManager, "globalSettingsManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        this.f385749a = textureManager;
        this.f385750b = globalSettingsManager;
        this.f385751c = imageManager;
    }

    @Override // fc.b
    @Nullable
    public d.C1663d a(@Nullable String str, int i10, int i11, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar, long j10) {
        return this.f385751c.d(str, i10, i11, aVar, j10);
    }

    @Override // fc.b
    @m1
    public void b(@Nullable String str, @Nullable com.planner5d.library.services.bitmaploader.target.a aVar) {
        this.f385749a.v(str, p.a.diffuse, this.f385750b.c(), aVar);
    }

    @Override // fc.b
    @NotNull
    public Bitmap c() {
        Bitmap bitmapA = this.f385749a.A();
        Intrinsics.checkNotNullExpressionValue(bitmapA, "getFallbackTexture(...)");
        return bitmapA;
    }

    @Override // fc.b
    @Nullable
    public Pair<String, Integer> d(@Nullable String str) {
        return this.f385749a.F(str);
    }
}
