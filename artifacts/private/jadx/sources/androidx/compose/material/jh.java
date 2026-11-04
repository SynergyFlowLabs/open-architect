package androidx.compose.material;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@kotlin.l(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,881:1\n113#2:882\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n801#1:882\n*E\n"})
public final class jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final jh f23346a = new jh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.q2<Float> f23347b = new androidx.compose.animation.core.q2<>(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f23348c = androidx.compose.ui.unit.h.r(125);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f23349d = 20.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f23350e = 10.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23351f = 0;

    private jh() {
    }

    public static /* synthetic */ sd d(jh jhVar, Set set, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 10.0f;
        }
        return jhVar.c(set, f10, f11);
    }

    @NotNull
    public final androidx.compose.animation.core.q2<Float> a() {
        return f23347b;
    }

    public final float b() {
        return f23348c;
    }

    @Nullable
    public final sd c(@NotNull Set<Float> set, float f10, float f11) {
        if (set.size() <= 1) {
            return null;
        }
        Set<Float> set2 = set;
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) set2);
        Intrinsics.checkNotNull(fMaxOrNull);
        float fFloatValue = fMaxOrNull.floatValue();
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) set2);
        Intrinsics.checkNotNull(fMinOrNull);
        return new sd(fFloatValue - fMinOrNull.floatValue(), f10, f11);
    }
}
