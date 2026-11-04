package androidx.compose.material;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,608:1\n113#2:609\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n*L\n490#1:609\n*E\n"})
public final class oc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f24064c = 0.24f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24066e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final oc f24062a = new oc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24063b = androidx.compose.ui.unit.h.r(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.q2<Float> f24065d = new androidx.compose.animation.core.q2<>(1.0f, 50.0f, Float.valueOf(0.001f));

    static {
        int i10 = 4 >> 4;
    }

    private oc() {
    }

    @NotNull
    public final androidx.compose.animation.core.q2<Float> a() {
        return f24065d;
    }

    public final float b() {
        return f24063b;
    }
}
