package com.planner5d.library.widget.colorpicker;

import com.planner5d.library.services.utility.p0;
import dagger.internal.e;
import dagger.internal.j;
import dagger.internal.r;
import fg.g;
import ij.c;

/* JADX INFO: loaded from: classes12.dex */
@r
@e
public final class b implements g<ColorPickerCompact> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c<p0> f254241a;

    public b(c<p0> cVar) {
        this.f254241a = cVar;
    }

    public static g<ColorPickerCompact> a(c<p0> cVar) {
        return new b(cVar);
    }

    @j("com.planner5d.library.widget.colorpicker.ColorPickerCompact.formatter")
    public static void b(ColorPickerCompact colorPickerCompact, p0 p0Var) {
        colorPickerCompact.f254214a = p0Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ColorPickerCompact colorPickerCompact) {
        b(colorPickerCompact, this.f254241a.get());
    }
}
