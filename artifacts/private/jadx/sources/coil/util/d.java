package coil.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.annotation.n1;
import androidx.lifecycle.o0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,83:1\n1#2:84\n31#3:85\n*S KotlinDebug\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n*L\n78#1:85\n*E\n"})
@oj.i(name = "-Contexts")
public final class d {
    @NotNull
    public static final Drawable a(@NotNull Context context, @androidx.annotation.v int i10) {
        Drawable drawableB = j.a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    @NotNull
    public static final Drawable b(@NotNull Resources resources, @androidx.annotation.v int i10, @Nullable Resources.Theme theme) {
        Drawable drawableG = androidx.core.content.res.i.g(resources, i10, theme);
        if (drawableG != null) {
            return drawableG;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    @Nullable
    public static final androidx.lifecycle.c0 c(@Nullable Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof o0)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((o0) baseContext).getLifecycle();
    }

    @NotNull
    public static final Drawable d(@NotNull Context context, @NotNull Resources resources, @n1 @androidx.annotation.v int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return b(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(@NotNull Context context, @NotNull String str) {
        return androidx.core.content.d.a(context, str) == 0;
    }

    public static final /* synthetic */ <T> T f(Context context) {
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        T t10 = (T) androidx.core.content.d.s(context, Object.class);
        Intrinsics.checkNotNull(t10);
        return t10;
    }
}
