package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(29)
@SourceDebugExtension({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,190:1\n136#2:191\n57#3:192\n61#3:195\n60#4:193\n70#4:196\n22#5:194\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n154#1:191\n155#1:192\n155#1:195\n155#1:193\n155#1:196\n155#1:194\n*E\n"})
public final class f4 implements d4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final f4 f14254b = new f4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f14255c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14256d = 0;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    @androidx.annotation.w0(29)
    @SourceDebugExtension({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,190:1\n273#2:191\n65#3:192\n69#3:195\n65#3:197\n69#3:200\n60#4:193\n70#4:196\n60#4:198\n70#4:201\n22#5:194\n22#5:199\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl\n*L\n181#1:191\n182#1:192\n182#1:195\n185#1:197\n185#1:200\n182#1:193\n182#1:196\n185#1:198\n185#1:201\n182#1:194\n185#1:199\n*E\n"})
    public static final class a extends e4.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14257c = 8;

        public a(@NotNull Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.e4.a, androidx.compose.foundation.c4
        public void b(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                d().setZoom(f10);
            }
            if ((9223372034707292159L & j11) != n0.d.f332689d) {
                d().show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)));
            } else {
                d().show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
            }
        }
    }

    private f4() {
    }

    @Override // androidx.compose.foundation.d4
    public boolean b() {
        return f14255c;
    }

    @Override // androidx.compose.foundation.d4
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@NotNull View view, boolean z10, long j10, float f10, float f11, boolean z11, @NotNull androidx.compose.ui.unit.d dVar, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jK4 = dVar.k4(j10);
        float fS7 = dVar.S7(f10);
        float fS8 = dVar.S7(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jK4 != n0.d.f332689d) {
            builder.setSize(kotlin.math.b.L0(Float.intBitsToFloat((int) (jK4 >> 32))), kotlin.math.b.L0(Float.intBitsToFloat((int) (jK4 & com.rabbitmq.client.k0.f265952a))));
        }
        if (!Float.isNaN(fS7)) {
            builder.setCornerRadius(fS7);
        }
        if (!Float.isNaN(fS8)) {
            builder.setElevation(fS8);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
