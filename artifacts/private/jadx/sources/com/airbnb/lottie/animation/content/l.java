package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
@e.b(19)
public class l implements n, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f88010d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.j f88012f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f88007a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f88008b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f88009c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<n> f88011e = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88013a;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.j.a.values().length];
            f88013a = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88013a[com.airbnb.lottie.model.content.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88013a[com.airbnb.lottie.model.content.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88013a[com.airbnb.lottie.model.content.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88013a[com.airbnb.lottie.model.content.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(com.airbnb.lottie.model.content.j jVar) {
        this.f88010d = jVar.c();
        this.f88012f = jVar;
    }

    private void d() {
        for (int i10 = 0; i10 < this.f88011e.size(); i10++) {
            this.f88009c.addPath(this.f88011e.get(i10).S());
        }
    }

    @e.b(19)
    private void g(Path.Op op) {
        this.f88008b.reset();
        this.f88007a.reset();
        for (int size = this.f88011e.size() - 1; size >= 1; size--) {
            n nVar = this.f88011e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> listK = dVar.k();
                for (int size2 = listK.size() - 1; size2 >= 0; size2--) {
                    Path pathS = listK.get(size2).S();
                    pathS.transform(dVar.l());
                    this.f88008b.addPath(pathS);
                }
            } else {
                this.f88008b.addPath(nVar.S());
            }
        }
        n nVar2 = this.f88011e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> listK2 = dVar2.k();
            for (int i10 = 0; i10 < listK2.size(); i10++) {
                Path pathS2 = listK2.get(i10).S();
                pathS2.transform(dVar2.l());
                this.f88007a.addPath(pathS2);
            }
        } else {
            this.f88007a.set(nVar2.S());
        }
        this.f88009c.op(this.f88007a, this.f88008b, op);
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path S() {
        this.f88009c.reset();
        if (this.f88012f.d()) {
            return this.f88009c;
        }
        int i10 = a.f88013a[this.f88012f.b().ordinal()];
        if (i10 == 1) {
            d();
        } else if (i10 == 2) {
            g(Path.Op.UNION);
        } else if (i10 == 3) {
            g(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            g(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            g(Path.Op.XOR);
        }
        return this.f88009c;
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void b(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof n) {
                this.f88011e.add((n) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void e(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f88011e.size(); i10++) {
            this.f88011e.get(i10).e(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f88010d;
    }
}
