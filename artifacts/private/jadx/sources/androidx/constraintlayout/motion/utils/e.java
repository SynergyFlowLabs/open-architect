package androidx.constraintlayout.motion.utils;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44970e;

    public void a(View view) {
        this.f44967b = view.getLeft();
        this.f44968c = view.getTop();
        this.f44969d = view.getRight();
        this.f44970e = view.getBottom();
        this.f44966a = view.getRotation();
    }

    public int b() {
        return this.f44970e - this.f44968c;
    }

    public int c() {
        return this.f44969d - this.f44967b;
    }
}
