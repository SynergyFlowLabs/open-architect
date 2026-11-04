package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<v> f87942a = new ArrayList();

    void a(v vVar) {
        this.f87942a.add(vVar);
    }

    public void b(Path path) {
        for (int size = this.f87942a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.utils.j.b(path, this.f87942a.get(size));
        }
    }
}
