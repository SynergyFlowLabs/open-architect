package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class b0 extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f254427c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CatalogSearchSuggestionsView f254428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CatalogSearchRecentsView f254429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(com.planner5d.library.f.m.f168743k6, (ViewGroup) this, true);
        setOrientation(1);
        this.f254428a = (CatalogSearchSuggestionsView) findViewById(com.planner5d.library.f.j.It);
        this.f254429b = (CatalogSearchRecentsView) findViewById(com.planner5d.library.f.j.Pp);
    }

    @NotNull
    public final CatalogSearchRecentsView getRecentsView() {
        return this.f254429b;
    }

    @NotNull
    public final CatalogSearchSuggestionsView getSuggestionsView() {
        return this.f254428a;
    }
}
