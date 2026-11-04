package com.planner5d.library.widget.editor.editor2d.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f254891a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Matrix f254892b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.planner5d.library.widget.editor.projectresources.viewoptions.b f254893c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f254894d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f254895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Typeface f254896f;

    public d(Context context) {
        this.f254896f = androidx.core.content.res.i.j(context, com.planner5d.library.f.i.f167926e);
    }

    public Typeface a() {
        return this.f254896f;
    }

    public d b(@NonNull Canvas canvas, @NonNull Matrix matrix, @NonNull com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, float f10, boolean z10) {
        this.f254891a = canvas;
        this.f254892b.set(matrix);
        this.f254893c = bVar;
        this.f254894d = f10;
        this.f254895e = z10;
        return this;
    }
}
