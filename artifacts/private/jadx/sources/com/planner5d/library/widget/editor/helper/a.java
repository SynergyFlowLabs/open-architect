package com.planner5d.library.widget.editor.helper;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nApplyInsetsListenerContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplyInsetsListenerContainer.kt\ncom/planner5d/library/widget/editor/helper/ApplyInsetsListenerContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1863#2,2:32\n*S KotlinDebug\n*F\n+ 1 ApplyInsetsListenerContainer.kt\ncom/planner5d/library/widget/editor/helper/ApplyInsetsListenerContainer\n*L\n25#1:32,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f256176c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Pair<View, androidx.core.view.b1>> f256177a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f256178b;

    @androidx.annotation.l0
    public final void a(@NotNull View view, @NotNull androidx.core.view.b1 listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f256178b) {
            com.planner5d.library.application.b.f142455c.a().d().b("apply_insets", "register_after_finalize", null);
        }
        androidx.core.view.u1.j2(view, listener);
        this.f256177a.add(new Pair<>(view, listener));
    }

    @androidx.annotation.l0
    public final void b() {
        Iterator<T> it = this.f256177a.iterator();
        while (it.hasNext()) {
            androidx.core.view.u1.j2((View) ((Pair) it.next()).getFirst(), null);
        }
        this.f256177a.clear();
        this.f256178b = true;
    }
}
