package com.planner5d.library.math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import klipper.q;
import klipper.z;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f180474a = new f();

    static final class a extends l0 implements Function1<klipper.b, List<? extends float[]>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<float[]> f180475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<float[]> list) {
            super(1);
            this.f180475a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<float[]> invoke(@NotNull klipper.b clipper) {
            Intrinsics.checkNotNullParameter(clipper, "$this$clipper");
            List<List<klipper.k>> listF = q.f(new List[0]);
            List<List<klipper.k>> listF2 = q.f(new List[0]);
            listF2.add(j.e((float[]) CollectionsKt.first((List) this.f180475a)));
            int size = this.f180475a.size();
            int i10 = 1;
            while (i10 < size) {
                clipper.c();
                clipper.b(listF2, z.Subject, true);
                clipper.a(j.e(this.f180475a.get(i10)), z.Clip, true);
                klipper.b bVar = clipper;
                klipper.b.f0(bVar, klipper.a.Union, listF, null, 4, null);
                listF2.clear();
                listF2.addAll(listF);
                i10++;
                clipper = bVar;
            }
            List<List<klipper.k>> list = listF2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j.d((List) it.next()));
            }
            return arrayList;
        }
    }

    private f() {
    }

    @Override // com.planner5d.library.math.e
    @NotNull
    public List<float[]> a(@NotNull List<float[]> rectangles) {
        Intrinsics.checkNotNullParameter(rectangles, "rectangles");
        return rectangles.size() <= 1 ? rectangles : (List) j.c(new a(rectangles));
    }
}
