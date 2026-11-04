package androidx.graphics.path;

import android.graphics.PointF;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n26#2:140\n*S KotlinDebug\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n*L\n130#1:139\n137#1:140\n*E\n"})
@i(name = "PathSegmentUtilities")
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final e f52108a = new e(e.a.Done, new PointF[0], 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final e f52109b = new e(e.a.Close, new PointF[0], 0.0f);

    @NotNull
    public static final e a() {
        return f52109b;
    }

    @NotNull
    public static final e b() {
        return f52108a;
    }
}
