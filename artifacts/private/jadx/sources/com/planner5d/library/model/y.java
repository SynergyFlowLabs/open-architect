package com.planner5d.library.model;

import com.planner5d.library.model.manager.k5;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class y implements k5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f222849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f222852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f222853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f222854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f222855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f222856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.planner5d.library.engine.rendering.util.i f222857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.planner5d.library.engine.rendering.util.f f222858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f222859k;

    public y(String str) {
        this(str, -1);
    }

    public static String b(y yVar) {
        if (yVar == null) {
            return null;
        }
        return c(yVar.f222851c);
    }

    public static String c(String str) {
        if (str == null) {
            int i10 = 5 << 0;
            return null;
        }
        int iIndexOf = str.indexOf(".");
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    public float a() {
        return this.f222854f.floatValue() / 100.0f;
    }

    public float d() {
        Float f10 = this.f222853e;
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public float e() {
        Float f10 = this.f222852d;
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        String str = this.f222851c;
        if (str == null && yVar.f222851c == null) {
            return true;
        }
        return str != null && b(this).equals(b(yVar));
    }

    public float f() {
        Float f10 = this.f222852d;
        float fFloatValue = f10 == null ? 1.0f : f10.floatValue();
        float f11 = this.f222859k;
        if (fFloatValue == 0.0f) {
            fFloatValue = 0.01f;
        }
        return f11 * fFloatValue;
    }

    public float g() {
        return this.f222855g.floatValue() / 100.0f;
    }

    public com.planner5d.library.engine.rendering.util.g h(float f10) {
        float f11 = f();
        Float f12 = this.f222853e;
        return new com.planner5d.library.engine.rendering.util.g(f11, f12 == null ? null : Float.valueOf(f12.floatValue() * f10), new com.planner5d.library.engine.rendering.util.j(this.f222857i, this.f222858j), a(), g());
    }

    public y(String str, int i10) {
        this(str, i10, 1.0f, (String) null, false);
    }

    public y(String str, int i10, float f10, String str2, boolean z10) {
        this(str, i10, f10, str2, null, null, 0.0f, 0.0f, z10, com.planner5d.library.engine.rendering.util.i.RepeatXY, com.planner5d.library.engine.rendering.util.f.Center);
    }

    private y(String str, int i10, float f10, String str2, Float f11, Float f12, float f13, float f14, boolean z10, com.planner5d.library.engine.rendering.util.i iVar, com.planner5d.library.engine.rendering.util.f fVar) {
        this.f222851c = str;
        this.f222849a = i10;
        this.f222859k = f10;
        this.f222852d = f11;
        this.f222853e = f12;
        this.f222850b = str2;
        this.f222854f = Float.valueOf(f13);
        this.f222855g = Float.valueOf(f14);
        this.f222856h = z10;
        this.f222857i = iVar;
        this.f222858j = fVar;
    }

    public y(y yVar) {
        this(yVar, yVar.f222852d, yVar.f222853e);
    }

    public y(y yVar, Float f10, Float f11) {
        this(yVar.f222851c, yVar.f222849a, yVar.f222859k, yVar.f222850b, f10, f11, yVar.f222854f.floatValue(), yVar.f222855g.floatValue(), yVar.f222856h, yVar.f222857i, yVar.f222858j);
    }

    public y(y yVar, Float f10, Float f11, com.planner5d.library.engine.rendering.util.i iVar, com.planner5d.library.engine.rendering.util.f fVar) {
        this(yVar.f222851c, yVar.f222849a, yVar.f222859k, yVar.f222850b, f10, f11, yVar.f222854f.floatValue(), yVar.f222855g.floatValue(), yVar.f222856h, iVar, fVar);
    }

    public y(y yVar, Float f10, Float f11, com.planner5d.library.engine.rendering.util.i iVar, com.planner5d.library.engine.rendering.util.f fVar, Float f12, Float f13) {
        this(yVar.f222851c, yVar.f222849a, yVar.f222859k, yVar.f222850b, f10, f11, f12.floatValue(), f13.floatValue(), yVar.f222856h, iVar, fVar);
    }

    public y(float f10, float f11, y yVar) {
        this(yVar.f222851c, yVar.f222849a, yVar.f222859k, yVar.f222850b, yVar.f222852d, yVar.f222853e, f10, f11, yVar.f222856h, yVar.f222857i, yVar.f222858j);
    }

    public y(List<Float> list, y yVar) {
        this(yVar.f222851c, yVar.f222849a, yVar.f222859k, yVar.f222850b, yVar.f222852d, yVar.f222853e, list == null ? 0.0f : list.get(0).floatValue(), list != null ? list.get(1).floatValue() : 0.0f, yVar.f222856h, yVar.f222857i, yVar.f222858j);
    }
}
