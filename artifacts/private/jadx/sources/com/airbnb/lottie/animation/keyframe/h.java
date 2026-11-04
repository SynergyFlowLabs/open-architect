package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<com.airbnb.lottie.model.content.o, Path>> f88106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a<Integer, Integer>> f88107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.i> f88108c;

    public h(List<com.airbnb.lottie.model.content.i> list) {
        this.f88108c = list;
        this.f88106a = new ArrayList(list.size());
        this.f88107b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f88106a.add(list.get(i10).b().a());
            this.f88107b.add(list.get(i10).c().a());
        }
    }

    public List<a<com.airbnb.lottie.model.content.o, Path>> a() {
        return this.f88106a;
    }

    public List<com.airbnb.lottie.model.content.i> b() {
        return this.f88108c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f88107b;
    }
}
