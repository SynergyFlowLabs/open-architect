package com.planner5d.library.widget.editor.editor3d.model.builder;

import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.ItemPr;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f255632g = 50.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f255633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f255634i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.math.m f255635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.planner5d.library.math.m f255636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.planner5d.library.math.m f255637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.math.m f255638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dc.h f255639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ItemMaterial[] f255640f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f255641a;

        static {
            int[] iArr = new int[EnumC1729b.values().length];
            f255641a = iArr;
            try {
                iArr[EnumC1729b.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f255641a[EnumC1729b.bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f255641a[EnumC1729b.left.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f255641a[EnumC1729b.right.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f255641a[EnumC1729b.front.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f255641a[EnumC1729b.back.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.widget.editor.editor3d.model.builder.b$b, reason: collision with other inner class name */
    private enum EnumC1729b {
        top(0),
        bottom(1),
        left(2),
        right(3),
        front(4),
        back(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f255649a;

        EnumC1729b(int i10) {
            this.f255649a = i10;
        }
    }

    static {
        float fD = gc.d.d(50.0f);
        f255633h = fD;
        f255634i = fD + gc.d.d(1.0f);
    }

    public b(ItemPr itemPr, com.planner5d.library.math.m mVar, dc.h hVar) {
        com.planner5d.library.math.m mVar2 = new com.planner5d.library.math.m(1.0f, 1.0f, 1.0f);
        this.f255635a = mVar2;
        com.planner5d.library.math.m mVar3 = new com.planner5d.library.math.m(-1.0f, -1.0f, -1.0f);
        this.f255636b = mVar3;
        this.f255637c = new com.planner5d.library.math.m(1.0f, 1.0f, 1.0f);
        this.f255638d = new com.planner5d.library.math.m(-1.0f, -1.0f, -1.0f);
        this.f255639e = hVar;
        if (itemPr != null) {
            this.f255640f = itemPr.getMaterials();
            mVar2.A0(mVar).v0(100.0f / itemPr.textureMapping);
        } else {
            this.f255640f = null;
        }
        mVar2.v0(0.5f);
        mVar3.A0(mVar2).v0(-1.0f);
    }

    private void b(EnumC1729b enumC1729b, com.planner5d.library.math.m mVar, com.planner5d.library.math.m mVar2) {
        switch (a.f255641a[enumC1729b.ordinal()]) {
            case 1:
                dc.h hVar = this.f255639e;
                float f10 = f255633h;
                float f11 = mVar.f180482a;
                float f12 = mVar2.f180483b;
                float f13 = mVar.f180483b;
                float f14 = mVar2.f180482a;
                hVar.a(f10, f10, f10, f11, f12, f10, f10, -f10, f11, f13, -f10, f10, -f10, f14, f13, -f10, f10, f10, f14, f12, 0.0f, f255634i, 0.0f, enumC1729b.f255649a, enumC1729b.name());
                break;
            case 2:
                dc.h hVar2 = this.f255639e;
                float f15 = f255633h;
                float f16 = mVar2.f180482a;
                float f17 = mVar.f180483b;
                float f18 = mVar.f180482a;
                float f19 = mVar2.f180483b;
                hVar2.a(-f15, -f15, -f15, f16, f17, f15, -f15, -f15, f18, f17, f15, -f15, f15, f18, f19, -f15, -f15, f15, f16, f19, 0.0f, -f255634i, 0.0f, enumC1729b.f255649a, enumC1729b.name());
                break;
            case 3:
                dc.h hVar3 = this.f255639e;
                float f20 = f255633h;
                float f21 = mVar.f180483b;
                float f22 = mVar2.f180484c;
                float f23 = mVar.f180484c;
                float f24 = mVar2.f180483b;
                hVar3.a(-f20, f20, -f20, f21, f22, -f20, -f20, -f20, f21, f23, -f20, -f20, f20, f24, f23, -f20, f20, f20, f24, f22, -f255634i, 0.0f, 0.0f, enumC1729b.f255649a, enumC1729b.name());
                break;
            case 4:
                dc.h hVar4 = this.f255639e;
                float f25 = f255633h;
                float f26 = mVar2.f180483b;
                float f27 = mVar.f180484c;
                float f28 = mVar.f180483b;
                float f29 = mVar2.f180484c;
                hVar4.a(f25, -f25, f25, f26, f27, f25, -f25, -f25, f28, f27, f25, f25, -f25, f28, f29, f25, f25, f25, f26, f29, f255634i, 0.0f, 0.0f, enumC1729b.f255649a, enumC1729b.name());
                break;
            case 5:
                dc.h hVar5 = this.f255639e;
                float f30 = f255633h;
                float f31 = mVar2.f180482a;
                float f32 = mVar.f180484c;
                float f33 = mVar.f180482a;
                float f34 = mVar2.f180484c;
                hVar5.a(-f30, -f30, f30, f31, f32, f30, -f30, f30, f33, f32, f30, f30, f30, f33, f34, -f30, f30, f30, f31, f34, 0.0f, 0.0f, f255634i, enumC1729b.f255649a, enumC1729b.name());
                break;
            case 6:
                dc.h hVar6 = this.f255639e;
                float f35 = f255633h;
                float f36 = mVar.f180482a;
                float f37 = mVar2.f180484c;
                float f38 = mVar.f180484c;
                float f39 = mVar2.f180482a;
                hVar6.a(f35, f35, -f35, f36, f37, f35, -f35, -f35, f36, f38, -f35, -f35, -f35, f39, f38, -f35, f35, -f35, f39, f37, 0.0f, 0.0f, -f255634i, enumC1729b.f255649a, enumC1729b.name());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public void a() {
        ItemMaterial itemMaterial;
        com.planner5d.library.model.y yVar;
        for (EnumC1729b enumC1729b : EnumC1729b.values()) {
            ItemMaterial[] itemMaterialArr = this.f255640f;
            if (itemMaterialArr == null || (itemMaterial = itemMaterialArr[enumC1729b.f255649a]) == null || (yVar = itemMaterial.texture) == null) {
                b(enumC1729b, this.f255635a, this.f255636b);
            } else if (yVar.f222857i == com.planner5d.library.engine.rendering.util.i.NoRepeat) {
                this.f255637c.y0(1.0f, 1.0f, 1.0f);
                this.f255638d.y0(0.0f, 0.0f, 0.0f);
                b(enumC1729b, this.f255637c, this.f255638d);
            } else if (yVar.f222858j == com.planner5d.library.engine.rendering.util.f.BottomLeft) {
                this.f255637c.A0(this.f255635a).v0(2.0f);
                this.f255638d.y0(0.0f, 0.0f, 0.0f);
                b(enumC1729b, this.f255637c, this.f255638d);
            } else {
                b(enumC1729b, this.f255635a, this.f255636b);
            }
        }
    }
}
