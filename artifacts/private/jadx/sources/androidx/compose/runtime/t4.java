package androidx.compose.runtime;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImplKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,442:1\n25#2,5:443\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImplKt\n*L\n77#1:443,5\n*E\n"})
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f36646a = 306783378;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f36647b = 613566756;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f36648c = -920350135;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f36649d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f36650e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f36651f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f36652g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f36653h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f36654i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f36655j = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f36656k = 128;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f36657l = 256;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f36658m = 512;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f36659n = 1024;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final Object f36660o = new Object();

    @kotlin.a1
    public static final int a(int i10) {
        int i11 = f36646a & i10;
        int i12 = f36647b & i10;
        return (i10 & f36648c) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
