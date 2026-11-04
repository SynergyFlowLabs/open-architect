package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.annotation.b1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.b4;
import java.util.WeakHashMap;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.ui.text.x
@w0(parameters = 0)
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nURLSpanCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,76:1\n381#2,7:77\n381#2,7:84\n381#2,7:91\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n56#1:77,7\n59#1:84,7\n66#1:91,7\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f42071d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<b4, URLSpan> f42072a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0.b>, URLSpan> f42073b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0>, u> f42074c = new WeakHashMap<>();

    @Nullable
    public final ClickableSpan a(@NotNull androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0> eVar) {
        WeakHashMap<androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0>, u> weakHashMap = this.f42074c;
        u uVar = weakHashMap.get(eVar);
        if (uVar == null) {
            uVar = new u(eVar.h());
            weakHashMap.put(eVar, uVar);
        }
        return uVar;
    }

    @NotNull
    public final URLSpan b(@NotNull androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0.b> eVar) {
        WeakHashMap<androidx.compose.ui.text.f.e<androidx.compose.ui.text.b0.b>, URLSpan> weakHashMap = this.f42073b;
        URLSpan uRLSpan = weakHashMap.get(eVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(eVar.h().e());
            weakHashMap.put(eVar, uRLSpan);
        }
        return uRLSpan;
    }

    @NotNull
    public final URLSpan c(@NotNull b4 b4Var) {
        WeakHashMap<b4, URLSpan> weakHashMap = this.f42072a;
        URLSpan uRLSpan = weakHashMap.get(b4Var);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(b4Var.a());
            weakHashMap.put(b4Var, uRLSpan);
        }
        return uRLSpan;
    }
}
