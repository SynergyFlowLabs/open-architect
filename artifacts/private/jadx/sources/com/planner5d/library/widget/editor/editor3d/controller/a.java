package com.planner5d.library.widget.editor.editor3d.controller;

import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class a extends com.planner5d.library.engine.input.g implements com.planner5d.library.widget.event.directional.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f255409d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f255410e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f255411f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f255412g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f255413h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f255414i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f255415j = 7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f255416k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f255417l = 9;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f255418m = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<float[]> f255419a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<float[]> f255420b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f255421c;

    public a(f fVar) {
        this.f255421c = fVar;
    }

    private void t(float... fArr) {
        synchronized (this.f255419a) {
            this.f255419a.add(fArr);
        }
    }

    private void v(float[] fArr) {
        switch ((int) fArr[0]) {
            case 1:
                this.f255421c.r((int) fArr[1]);
                break;
            case 2:
                this.f255421c.p((int) fArr[1]);
                break;
            case 3:
                this.f255421c.s((char) fArr[1]);
                break;
            case 4:
                this.f255421c.d((int) fArr[1], (int) fArr[2], (int) fArr[3], (int) fArr[4]);
                break;
            case 5:
                this.f255421c.c((int) fArr[1], (int) fArr[2], (int) fArr[3], (int) fArr[4]);
                break;
            case 6:
                this.f255421c.k((int) fArr[1], (int) fArr[2], (int) fArr[3]);
                break;
            case 7:
                this.f255421c.n((int) fArr[1], (int) fArr[2]);
                break;
            case 8:
                this.f255421c.l((int) fArr[1]);
                break;
            case 9:
                this.f255421c.q(new k(fArr[1], fArr[2]), new k(fArr[3], fArr[4]));
                break;
            case 10:
                this.f255421c.g(fArr[1]);
                break;
        }
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean c(int i10, int i11, int i12, int i13) {
        int i14 = 5 & 0;
        t(5.0f, i10, i11, i12, i13);
        return false;
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean d(int i10, int i11, int i12, int i13) {
        t(4.0f, i10, i11, i12, i13);
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void g(double d10) {
        t(10.0f, (float) d10);
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean k(int i10, int i11, int i12) {
        t(6.0f, i10, i11, i12);
        return false;
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean l(int i10) {
        t(8.0f, i10);
        return false;
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean n(int i10, int i11) {
        t(7.0f, i10, i11);
        return false;
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean p(int i10) {
        t(2.0f, i10);
        return false;
    }

    @Override // com.planner5d.library.widget.event.directional.i
    public void q(k kVar, k kVar2) {
        t(9.0f, kVar.f180480a, kVar.f180481b, kVar2.f180480a, kVar2.f180481b);
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean r(int i10) {
        t(1.0f, i10);
        return false;
    }

    @Override // com.planner5d.library.engine.input.g, com.planner5d.library.engine.l
    public boolean s(char c10) {
        t(3.0f, c10);
        return false;
    }

    public void w() {
        synchronized (this.f255419a) {
            try {
                if (this.f255419a.isEmpty()) {
                    return;
                }
                this.f255420b.clear();
                this.f255420b.addAll(this.f255419a);
                this.f255419a.clear();
                Iterator<float[]> it = this.f255420b.iterator();
                while (it.hasNext()) {
                    v(it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
