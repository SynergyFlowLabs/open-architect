package androidx.compose.ui.layout;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nContentScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n156#1:161\n159#1:165\n156#1:169\n159#1:173\n57#2:162\n61#2:166\n57#2:170\n61#2:174\n57#2:177\n61#2:180\n60#3:163\n70#3:167\n60#3:171\n70#3:175\n60#3:178\n70#3:181\n22#4:164\n22#4:168\n22#4:172\n22#4:176\n22#4:179\n22#4:182\n*S KotlinDebug\n*F\n+ 1 ContentScale.kt\nandroidx/compose/ui/layout/ContentScaleKt\n*L\n144#1:161\n145#1:165\n150#1:169\n151#1:173\n144#1:162\n145#1:166\n150#1:170\n151#1:174\n156#1:177\n159#1:180\n144#1:163\n145#1:167\n150#1:171\n151#1:175\n156#1:178\n159#1:181\n144#1:164\n145#1:168\n150#1:172\n151#1:176\n156#1:179\n159#1:182\n*E\n"})
public final class m {
    private static final float c(long j10, long j11) {
        return Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(long j10, long j11) {
        return Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(long j10, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)));
    }

    private static final float f(long j10, long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
    }
}
