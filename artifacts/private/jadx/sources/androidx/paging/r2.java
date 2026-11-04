package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends q1.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f72551b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f72552c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f72553d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f72554e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Integer> f72555a = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.paging.q1.c
    public void a(int i10, int i11) {
        this.f72555a.add(0);
        this.f72555a.add(Integer.valueOf(i10));
        this.f72555a.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.q1.c
    public void b(int i10, int i11) {
        this.f72555a.add(1);
        this.f72555a.add(Integer.valueOf(i10));
        this.f72555a.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.q1.c
    public void c(int i10, int i11) {
        this.f72555a.add(2);
        this.f72555a.add(Integer.valueOf(i10));
        this.f72555a.add(Integer.valueOf(i11));
    }

    public final void d(@NotNull q1.c other) {
        Intrinsics.checkNotNullParameter(other, "other");
        kotlin.ranges.j jVarB1 = kotlin.ranges.r.B1(kotlin.ranges.r.W1(0, this.f72555a.size()), 3);
        int iL = jVarB1.l();
        int iM = jVarB1.m();
        int iN = jVarB1.n();
        if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
            while (true) {
                int iIntValue = this.f72555a.get(iL).intValue();
                if (iIntValue == 0) {
                    other.a(this.f72555a.get(iL + 1).intValue(), this.f72555a.get(iL + 2).intValue());
                } else if (iIntValue == 1) {
                    other.b(this.f72555a.get(iL + 1).intValue(), this.f72555a.get(iL + 2).intValue());
                } else {
                    if (iIntValue != 2) {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                    other.c(this.f72555a.get(iL + 1).intValue(), this.f72555a.get(iL + 2).intValue());
                }
                if (iL == iM) {
                    break;
                } else {
                    iL += iN;
                }
            }
        }
        this.f72555a.clear();
    }
}
