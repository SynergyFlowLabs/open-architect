package com.planner5d.library.widget.listitem;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.widget.ProfileIconView;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f258257d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ProfileIconView f258258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.d.C1663d f258259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f258260c;

    public static final class a implements td.a.InterfaceC2511a {
        a() {
        }

        @Override // td.a.InterfaceC2511a
        public InputStream a() {
            InputStream inputStreamOpenRawResource = j.this.f258258a.getResources().openRawResource(com.planner5d.library.f.h.f167806tg);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            return inputStreamOpenRawResource;
        }
    }

    public j(@NotNull ProfileIconView destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f258258a = destination;
    }

    public final void b(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        c(bitmapTargetManager);
        int imageSize = (int) this.f258258a.getImageSize();
        this.f258258a.setImageBitmap(td.a.f380845a.v(imageSize, imageSize, new a()));
        if (bitmapTargetManager.b() || str == null) {
            return;
        }
        com.planner5d.library.services.bitmaploader.target.a aVarE = com.planner5d.library.widget.bitmaptarget.a.e(this.f258258a, bitmapTargetManager);
        this.f258260c = aVarE;
        this.f258259b = imageManager.a(0, str, imageSize, imageSize, aVarE, -3L, null);
    }

    public final void c(@NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager) {
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        com.planner5d.library.services.bitmaploader.d.C1663d c1663d = this.f258259b;
        if (c1663d != null) {
            c1663d.a();
            this.f258259b = null;
        }
        com.planner5d.library.services.bitmaploader.target.a aVar = this.f258260c;
        if (aVar != null) {
            bitmapTargetManager.d(aVar);
            this.f258260c = null;
        }
        this.f258258a.setImageBitmap((Bitmap) null);
    }
}
