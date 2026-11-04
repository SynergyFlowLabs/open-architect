package com.planner5d.library.widget.event.directional;

import com.planner5d.library.widget.VirtualJoystickView;

/* JADX INFO: loaded from: classes8.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f258177a = {0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VirtualJoystickView f258178b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VirtualJoystickView f258179c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VirtualJoystickView.a[] f258180d = {new VirtualJoystickView.a() { // from class: com.planner5d.library.widget.event.directional.j
        @Override // com.planner5d.library.widget.VirtualJoystickView.a
        public final void onMove(int i10, int i11) {
            this.f258175a.c(i10, i11);
        }
    }, new VirtualJoystickView.a() { // from class: com.planner5d.library.widget.event.directional.k
        @Override // com.planner5d.library.widget.VirtualJoystickView.a
        public final void onMove(int i10, int i11) {
            this.f258176a.d(i10, i11);
        }
    }};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f258181e;

    l(a aVar) {
        this.f258181e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i10, int i11) {
        e(0, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i10, int i11) {
        e(1, i10, i11);
    }

    private void e(int i10, int i11, int i12) {
        int[] iArr = this.f258177a;
        int i13 = i10 * 2;
        iArr[i13] = i11;
        iArr[i13 + 1] = i12;
        this.f258181e.f(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    private VirtualJoystickView g(VirtualJoystickView virtualJoystickView, VirtualJoystickView virtualJoystickView2, int i10) {
        if (virtualJoystickView2 != null && virtualJoystickView != virtualJoystickView2) {
            e(i10, 0, 0);
            virtualJoystickView2.setOnMoveListener(null);
        }
        if (virtualJoystickView != null) {
            virtualJoystickView.setOnMoveListener(this.f258180d[i10]);
        }
        return virtualJoystickView;
    }

    public void f(com.planner5d.library.widget.editor.a.d dVar, VirtualJoystickView virtualJoystickView) {
        if (dVar == com.planner5d.library.widget.editor.a.d.Left) {
            this.f258178b = g(virtualJoystickView, this.f258178b, 0);
        } else if (dVar == com.planner5d.library.widget.editor.a.d.Right) {
            this.f258179c = g(virtualJoystickView, this.f258179c, 1);
        }
    }
}
