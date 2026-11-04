package com.planner5d.library.widget.editor.catalog.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.w;
import com.planner5d.library.widget.editor.helper.a2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 1)
public final class c extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f254392k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function1<FrameLayout, Unit> f254393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Context context, @NotNull a2 helperEditorDragItem, @NotNull w coroutineExecutor, @NotNull Function1<? super FrameLayout, Unit> onSearchViewCreated) {
        super(context, helperEditorDragItem, coroutineExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helperEditorDragItem, "helperEditorDragItem");
        Intrinsics.checkNotNullParameter(coroutineExecutor, "coroutineExecutor");
        Intrinsics.checkNotNullParameter(onSearchViewCreated, "onSearchViewCreated");
        this.f254393j = onSearchViewCreated;
    }

    @Override // com.planner5d.library.widget.editor.catalog.adapter.b, androidx.viewpager.widget.a
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int i10) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (c(i10).getId() != -1) {
            return super.instantiateItem(container, i10);
        }
        FrameLayout frameLayout = new FrameLayout(container.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setTag(Integer.valueOf(i10));
        this.f254393j.invoke(frameLayout);
        container.addView(frameLayout);
        return Integer.valueOf(i10);
    }
}
