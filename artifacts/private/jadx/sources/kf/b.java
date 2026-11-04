package kf;

import com.planner5d.library.math.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c> f312187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<d> f312188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<a> f312189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final k f312190d;

    public b(@NotNull List<c> walls, @NotNull List<d> constraints, @NotNull List<a> windowsAndDoors) {
        Intrinsics.checkNotNullParameter(walls, "walls");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(windowsAndDoors, "windowsAndDoors");
        this.f312187a = walls;
        this.f312188b = constraints;
        this.f312189c = windowsAndDoors;
        this.f312190d = new k();
        a();
    }

    private final void a() {
        c cVarF;
        for (d dVar : this.f312188b) {
            c cVarE = e(dVar);
            if (cVarE != null && (cVarF = f(cVarE)) != null) {
                Pair<Integer, Integer> pairB = b(cVarE, cVarF);
                dVar.l(cVarE, cVarF, pairB.getFirst().intValue() <= pairB.getSecond().intValue());
            }
        }
    }

    private final Pair<Integer, Integer> b(c cVar, c cVar2) {
        int i10 = 0;
        c cVarJ = cVar;
        int i11 = 0;
        while (!Intrinsics.areEqual(cVarJ, cVar2)) {
            i11++;
            cVarJ = j(cVarJ);
        }
        while (!Intrinsics.areEqual(cVar, cVar2)) {
            i10++;
            cVar = k(cVar);
        }
        return TuplesKt.to(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private final c j(c cVar) {
        for (c cVar2 : this.f312187a) {
            if (Intrinsics.areEqual(cVar2.e(), cVar.c())) {
                return cVar2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final c k(c cVar) {
        for (c cVar2 : this.f312187a) {
            if (Intrinsics.areEqual(cVar2.c(), cVar.e())) {
                return cVar2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public final Set<c> c(@NotNull c wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : this.f312187a) {
            if (cVar.b().x(wall.b())) {
                linkedHashSet.add(cVar);
            }
            linkedHashSet.remove(wall);
        }
        return linkedHashSet;
    }

    @NotNull
    public final List<d> d() {
        return this.f312188b;
    }

    @Nullable
    public final c e(@NotNull d constraint) {
        Intrinsics.checkNotNullParameter(constraint, "constraint");
        return (c) CollectionsKt.firstOrNull(CollectionsKt.intersect(g(constraint.g()), g(constraint.h())));
    }

    @Nullable
    public final c f(@NotNull c wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        Object next = null;
        if (!Intrinsics.areEqual(wall.b(), this.f312190d.U(0.0f, 1.0f)) && !Intrinsics.areEqual(wall.b(), this.f312190d.U(0.0f, -1.0f))) {
            Iterator<T> it = c(wall).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    c cVar = (c) next;
                    float fA = hf.a.f285791a.a(wall.e().f180480a, wall.c().f180480a, cVar.e().f180480a, cVar.c().f180480a);
                    do {
                        Object next2 = it.next();
                        c cVar2 = (c) next2;
                        float fA2 = hf.a.f285791a.a(wall.e().f180480a, wall.c().f180480a, cVar2.e().f180480a, cVar2.c().f180480a);
                        if (Float.compare(fA, fA2) < 0) {
                            next = next2;
                            fA = fA2;
                        }
                    } while (it.hasNext());
                }
            }
            return (c) next;
        }
        Iterator<T> it2 = c(wall).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                c cVar3 = (c) next;
                float fA3 = hf.a.f285791a.a(wall.e().f180481b, wall.c().f180481b, cVar3.e().f180481b, cVar3.c().f180481b);
                do {
                    Object next3 = it2.next();
                    c cVar4 = (c) next3;
                    float fA4 = hf.a.f285791a.a(wall.e().f180481b, wall.c().f180481b, cVar4.e().f180481b, cVar4.c().f180481b);
                    if (Float.compare(fA3, fA4) < 0) {
                        next = next3;
                        fA3 = fA4;
                    }
                } while (it2.hasNext());
            }
        }
        return (c) next;
    }

    @NotNull
    public final Set<c> g(@NotNull c wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : this.f312187a) {
            if (cVar.g(wall.e()) || cVar.g(wall.c())) {
                linkedHashSet.add(cVar);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public final List<c> h() {
        return this.f312187a;
    }

    @NotNull
    public final List<a> i() {
        return this.f312189c;
    }
}
