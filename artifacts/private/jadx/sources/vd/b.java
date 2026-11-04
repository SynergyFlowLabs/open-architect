package vd;

import androidx.annotation.f1;
import androidx.annotation.v;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.f;
import com.planner5d.library.model.manager.statistics.events.b4;

/* JADX INFO: loaded from: classes10.dex */
public enum b {
    PRO4K(5, 3840, 2160, true, b4.e.pro4k.name(), Integer.valueOf(f.h.Sg), Integer.valueOf(f.s.Ez), Integer.valueOf(f.s.Iu), 32),
    HD(4, 1280, 720, true, b4.e.hd.name(), Integer.valueOf(f.h.Ug), Integer.valueOf(f.s.Gz), Integer.valueOf(f.s.f169421sd), 32),
    DRAFT(2, 640, CropImageOptions.S3, true, b4.e.draft.name(), Integer.valueOf(f.h.Tg), Integer.valueOf(f.s.Fz), Integer.valueOf(f.s.Cn), 32),
    NO_RENDER(1, 0, 0, false, "screenshot", null, null, null, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f385730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f385731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f385732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f385733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f385734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b4.e f385735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @v
    private final Integer f385736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @f1
    private final Integer f385737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f1
    private final Integer f385738i;

    b(int i10, int i11, int i12, @v boolean z10, @f1 String str, @f1 Integer num, Integer num2, Integer num3, int i13) {
        this.f385730a = i10;
        this.f385731b = i11;
        this.f385732c = i12;
        this.f385733d = z10;
        this.f385736g = num;
        this.f385737h = num2;
        this.f385738i = num3;
        this.f385734e = i13;
        this.f385735f = b4.e.valueOf(str);
    }

    public static b l(int i10) {
        b bVar = PRO4K;
        if (i10 == bVar.f385730a) {
            return bVar;
        }
        b bVar2 = HD;
        if (i10 == bVar2.f385730a) {
            return bVar2;
        }
        b bVar3 = DRAFT;
        return i10 == bVar3.f385730a ? bVar3 : NO_RENDER;
    }

    @f1
    public Integer n() {
        return this.f385738i;
    }

    @v
    public Integer o() {
        return this.f385736g;
    }

    @f1
    public Integer p() {
        return this.f385737h;
    }

    public boolean q() {
        return this != DRAFT;
    }
}
