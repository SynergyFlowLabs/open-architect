package com.planner5d.library.aichat.view.widget;

import android.content.res.Resources;
import android.util.AttributeSet;
import com.planner5d.library.widget.c1;
import com.planner5d.library.widget.preloader.shimmer.ShimmerDrawableAutoStart;
import com.planner5d.library.widget.preloader.shimmer.c;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public final class ShimmerDrawableAiChat extends ShimmerDrawableAutoStart {
    @Override // com.planner5d.library.widget.preloader.shimmer.ShimmerDrawable, android.graphics.drawable.Drawable
    public void inflate(@NotNull Resources resources, @NotNull XmlPullParser parser, @NotNull AttributeSet attrs, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.inflate(resources, parser, attrs, theme);
        configure(resources, new c(resources, resources.getInteger(c1.j.f252069d)));
    }
}
