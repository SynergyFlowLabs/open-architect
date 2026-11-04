package com.planner5d.library.widget.drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.l;
import androidx.annotation.v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface d {

    public static final class a {
        public static /* synthetic */ Drawable a(d dVar, Context context, int i10, Integer num, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: vector");
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            return dVar.a(context, i10, num);
        }
    }

    @Nullable
    Drawable a(@Nullable Context context, @v int i10, @l @Nullable Integer num);
}
