package tb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f376257d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f376258e = 1.1f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f376259a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f376260b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f376261c = new c();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final ub.b b(com.planner5d.library.math.d dVar, List<? extends n> list) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ub.b bVarC = c(dVar, (n) it.next());
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return e(arrayList);
    }

    private final ub.b c(com.planner5d.library.math.d dVar, n nVar) throws Exception {
        if (nVar instanceof e) {
            return this.f376259a.a(dVar, (e) nVar);
        }
        if (nVar instanceof f) {
            return this.f376259a.b(dVar, (f) nVar);
        }
        throw new Exception("Unknown cast target type");
    }

    private final List<ub.b> d(List<com.planner5d.library.math.d> list, List<? extends n> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ub.b bVarB = b((com.planner5d.library.math.d) it.next(), list2);
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        return arrayList;
    }

    private final ub.b e(List<ub.b> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fI = ((ub.b) next).i();
                do {
                    Object next2 = it.next();
                    float fI2 = ((ub.b) next2).i();
                    if (Float.compare(fI, fI2) > 0) {
                        next = next2;
                        fI = fI2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (ub.b) obj;
    }

    private final boolean f(pb.c cVar) {
        return com.planner5d.library.math.j.f(((float) ((((double) cVar.a()) % 1.5707963267948966d) / 3.141592653589793d)) * 180, 0.0f, f376258e);
    }

    @NotNull
    public final List<ub.b> a(@NotNull pb.c rect, @NotNull List<? extends n> targets) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(targets, "targets");
        ub.c cVar = new ub.c();
        if (f(rect)) {
            cVar.a(d(this.f376260b.b(rect), targets));
        } else {
            cVar.a(cVar.c(d(this.f376261c.a(rect), targets)));
            cVar.d(d(this.f376260b.b(rect), targets));
        }
        return cVar.b();
    }
}
