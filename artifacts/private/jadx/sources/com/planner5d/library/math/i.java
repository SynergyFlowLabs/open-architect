package com.planner5d.library.math;

import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f180478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final h f180479b;

    static {
        i iVar = new i();
        f180478a = iVar;
        f180479b = new h(iVar);
    }

    private i() {
    }

    @Override // com.planner5d.library.math.h.a
    @NotNull
    public float[] a(@NotNull float[][] contours) {
        Intrinsics.checkNotNullParameter(contours, "contours");
        ArrayList arrayList = new ArrayList();
        for (float[] fArr : contours) {
            CollectionsKt.addAll(arrayList, ArraysKt.toTypedArray(fArr));
        }
        return CollectionsKt.toFloatArray(arrayList);
    }

    @NotNull
    public final h b() {
        return f180479b;
    }
}
