package app.rive.runtime.kotlin.core;

import android.content.Context;
import android.graphics.RectF;
import app.rive.runtime.kotlin.fonts.FontHelper;
import app.rive.runtime.kotlin.fonts.Fonts;
import app.rive.runtime.kotlin.fonts.NativeFontHelper;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Rive {

    @NotNull
    private static final String RIVE_ANDROID = "rive-android";

    @NotNull
    public static final Rive INSTANCE = new Rive();

    @NotNull
    private static RendererType defaultRendererType = RendererType.Rive;

    private Rive() {
    }

    public static /* synthetic */ RectF calculateRequiredBounds$default(Rive rive, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        return rive.calculateRequiredBounds(fit, alignment, rectF, rectF2, f10);
    }

    private final native void cppCalculateRequiredBounds(Fit fit, Alignment alignment, RectF rectF, RectF rectF2, RectF rectF3, float f10);

    private final native void cppInitialize();

    public static /* synthetic */ void init$default(Rive rive, Context context, RendererType rendererType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rendererType = RendererType.Rive;
        }
        rive.init(context, rendererType);
    }

    public static /* synthetic */ boolean setFallbackFont$default(Rive rive, Fonts.FontOpts fontOpts, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fontOpts = null;
        }
        return rive.setFallbackFont(fontOpts);
    }

    @NotNull
    public final RectF calculateRequiredBounds(@NotNull Fit fit, @NotNull Alignment alignment, @NotNull RectF availableBounds, @NotNull RectF artboardBounds, float f10) {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(availableBounds, "availableBounds");
        Intrinsics.checkNotNullParameter(artboardBounds, "artboardBounds");
        RectF rectF = new RectF();
        cppCalculateRequiredBounds(fit, alignment, availableBounds, artboardBounds, rectF, f10);
        return rectF;
    }

    @NotNull
    public final RendererType getDefaultRendererType() {
        return defaultRendererType;
    }

    public final void init(@NotNull Context context, @NotNull RendererType defaultRenderer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultRenderer, "defaultRenderer");
        com.getkeepsafe.relinker.e.b(context, RIVE_ANDROID);
        defaultRendererType = defaultRenderer;
        initializeCppEnvironment();
    }

    public final void initializeCppEnvironment() {
        cppInitialize();
    }

    @l(level = n.WARNING, message = "Prefer defining a `FontFallbackStrategy` instead")
    public final boolean setFallbackFont(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(byteArray);
    }

    @l(level = n.WARNING, message = "Prefer defining a `FontFallbackStrategy` instead")
    public final boolean setFallbackFont(@Nullable Fonts.FontOpts fontOpts) {
        byte[] fallbackFontBytes = FontHelper.Companion.getFallbackFontBytes(fontOpts);
        if (fallbackFontBytes != null) {
            return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(fallbackFontBytes);
        }
        return false;
    }
}
