package org.threeten.bp.zone;

import androidx.constraintlayout.core.motion.utils.v;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.s;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    static final class a extends g implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f340534b = -8733721350312276297L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f340535a;

        a(s sVar) {
            this.f340535a = sVar;
        }

        @Override // org.threeten.bp.zone.g
        public org.threeten.bp.e a(org.threeten.bp.f fVar) {
            return org.threeten.bp.e.f340012c;
        }

        @Override // org.threeten.bp.zone.g
        public s b(org.threeten.bp.f fVar) {
            return this.f340535a;
        }

        @Override // org.threeten.bp.zone.g
        public s c(org.threeten.bp.h hVar) {
            return this.f340535a;
        }

        @Override // org.threeten.bp.zone.g
        public s d(org.threeten.bp.f fVar) {
            return this.f340535a;
        }

        @Override // org.threeten.bp.zone.g
        public e e(org.threeten.bp.h hVar) {
            return null;
        }

        @Override // org.threeten.bp.zone.g
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f340535a.equals(((a) obj).f340535a);
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.j() && this.f340535a.equals(bVar.b(org.threeten.bp.f.f340021c))) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.threeten.bp.zone.g
        public List<f> f() {
            return Collections.EMPTY_LIST;
        }

        @Override // org.threeten.bp.zone.g
        public List<e> g() {
            return Collections.EMPTY_LIST;
        }

        @Override // org.threeten.bp.zone.g
        public List<s> h(org.threeten.bp.h hVar) {
            return Collections.singletonList(this.f340535a);
        }

        @Override // org.threeten.bp.zone.g
        public int hashCode() {
            return ((this.f340535a.hashCode() + 31) ^ (this.f340535a.hashCode() + 31)) ^ 1;
        }

        @Override // org.threeten.bp.zone.g
        public boolean i(org.threeten.bp.f fVar) {
            return false;
        }

        @Override // org.threeten.bp.zone.g
        public boolean j() {
            return true;
        }

        @Override // org.threeten.bp.zone.g
        public boolean k(org.threeten.bp.h hVar, s sVar) {
            return this.f340535a.equals(sVar);
        }

        @Override // org.threeten.bp.zone.g
        public e l(org.threeten.bp.f fVar) {
            return null;
        }

        @Override // org.threeten.bp.zone.g
        public e o(org.threeten.bp.f fVar) {
            return null;
        }

        public String toString() {
            return "FixedRules:" + this.f340535a;
        }
    }

    g() {
    }

    public static g m(s sVar) {
        cn.d.j(sVar, v.c.R);
        return new a(sVar);
    }

    public static g n(s sVar, s sVar2, List<e> list, List<e> list2, List<f> list3) {
        cn.d.j(sVar, "baseStandardOffset");
        cn.d.j(sVar2, "baseWallOffset");
        cn.d.j(list, "standardOffsetTransitionList");
        cn.d.j(list2, "transitionList");
        cn.d.j(list3, "lastRules");
        return new b(sVar, sVar2, list, list2, list3);
    }

    public abstract org.threeten.bp.e a(org.threeten.bp.f fVar);

    public abstract s b(org.threeten.bp.f fVar);

    public abstract s c(org.threeten.bp.h hVar);

    public abstract s d(org.threeten.bp.f fVar);

    public abstract e e(org.threeten.bp.h hVar);

    public abstract boolean equals(Object obj);

    public abstract List<f> f();

    public abstract List<e> g();

    public abstract List<s> h(org.threeten.bp.h hVar);

    public abstract int hashCode();

    public abstract boolean i(org.threeten.bp.f fVar);

    public abstract boolean j();

    public abstract boolean k(org.threeten.bp.h hVar, s sVar);

    public abstract e l(org.threeten.bp.f fVar);

    public abstract e o(org.threeten.bp.f fVar);
}
