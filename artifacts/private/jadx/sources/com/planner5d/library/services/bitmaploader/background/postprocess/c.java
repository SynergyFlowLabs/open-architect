package com.planner5d.library.services.bitmaploader.background.postprocess;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i;
import com.planner5d.library.services.utility.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {
    public c(int i10, int i11, float f10) {
        this(new i().f(r.width, i10).f(r.height, i11).e(r.radius, f10).a());
    }

    @Override // com.planner5d.library.services.bitmaploader.background.postprocess.a
    @Nullable
    public Bitmap b(@NotNull Context context, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        j jVar = this.f224095a;
        r rVar = r.width;
        if (jVar.c(rVar, 0) > 0) {
            j jVar2 = this.f224095a;
            r rVar2 = r.height;
            if (jVar2.c(rVar2, 0) > 0) {
                return td.b.f380853a.a(context, this.f224095a.b(r.radius, 1.0f), 1, bitmap, Integer.valueOf(this.f224095a.c(rVar, 0)), Integer.valueOf(this.f224095a.c(rVar2, 0)));
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Bundle bundle) {
        super(bundle);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }
}
