package androidx.compose.ui.node;

import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,686:1\n57#2,4:687\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n394#1:687,4\n*E\n"})
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40051a = 16777215;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40052b = -16777216;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f40053c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f40054d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f40055e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f40056f = 3;

    public static final void a(int i10, int i11) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return;
        }
        s0.a.i("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
    }
}
