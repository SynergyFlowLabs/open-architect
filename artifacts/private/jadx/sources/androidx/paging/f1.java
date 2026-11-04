package androidx.paging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f1 f71862a = new f1();

    @SourceDebugExtension({"SMAP\nPlaceholderPaddedListDiffHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback\n*L\n1#1,532:1\n211#1:533\n211#1:534\n211#1:535\n211#1:536\n211#1:537\n211#1:538\n211#1:539\n211#1:540\n211#1:541\n211#1:542\n211#1:543\n211#1:544\n*S KotlinDebug\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback\n*L\n294#1:533\n316#1:534\n323#1:535\n343#1:536\n350#1:537\n366#1:538\n391#1:539\n396#1:540\n427#1:541\n434#1:542\n440#1:543\n444#1:544\n*E\n"})
    private static final class a<T> implements androidx.recyclerview.widget.v {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final C0653a f71863i = new C0653a(null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f71864j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f71865k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f71866l = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final l2<T> f71867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final l2<T> f71868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.recyclerview.widget.v f71869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f71870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f71871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f71872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f71873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f71874h;

        /* JADX INFO: renamed from: androidx.paging.f1$a$a, reason: collision with other inner class name */
        public static final class C0653a {
            public /* synthetic */ C0653a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0653a() {
            }
        }

        public a(@NotNull l2<T> oldList, @NotNull l2<T> newList, @NotNull androidx.recyclerview.widget.v callback) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f71867a = oldList;
            this.f71868b = newList;
            this.f71869c = callback;
            this.f71870d = oldList.i();
            this.f71871e = oldList.k();
            this.f71872f = oldList.c();
            this.f71873g = 1;
            this.f71874h = 1;
        }

        private final boolean e(int i10, int i11) {
            if (i10 < this.f71872f || this.f71874h == 2) {
                return false;
            }
            int iMin = Math.min(i11, this.f71871e);
            if (iMin > 0) {
                this.f71874h = 3;
                this.f71869c.a(this.f71870d + i10, iMin, y.PLACEHOLDER_TO_ITEM);
                this.f71871e -= iMin;
            }
            int i12 = i11 - iMin;
            if (i12 <= 0) {
                return true;
            }
            this.f71869c.b(i10 + iMin + this.f71870d, i12);
            return true;
        }

        private final boolean f(int i10, int i11) {
            if (i10 > 0 || this.f71873g == 2) {
                return false;
            }
            int iMin = Math.min(i11, this.f71870d);
            if (iMin > 0) {
                this.f71873g = 3;
                this.f71869c.a((0 - iMin) + this.f71870d, iMin, y.PLACEHOLDER_TO_ITEM);
                this.f71870d -= iMin;
            }
            int i12 = i11 - iMin;
            if (i12 > 0) {
                this.f71869c.b(this.f71870d, i12);
            }
            return true;
        }

        private final boolean g(int i10, int i11) {
            if (i10 + i11 >= this.f71872f && this.f71874h != 3) {
                int iU = kotlin.ranges.r.u(Math.min(this.f71868b.k() - this.f71871e, i11), 0);
                int i12 = i11 - iU;
                if (iU > 0) {
                    this.f71874h = 2;
                    this.f71869c.a(this.f71870d + i10, iU, y.ITEM_TO_PLACEHOLDER);
                    this.f71871e += iU;
                }
                if (i12 > 0) {
                    this.f71869c.c(i10 + iU + this.f71870d, i12);
                }
                return true;
            }
            return false;
        }

        private final boolean h(int i10, int i11) {
            if (i10 > 0 || this.f71873g == 3) {
                return false;
            }
            int iU = kotlin.ranges.r.u(Math.min(this.f71868b.i() - this.f71870d, i11), 0);
            int i12 = i11 - iU;
            if (i12 > 0) {
                this.f71869c.c(this.f71870d, i12);
            }
            if (iU <= 0) {
                return true;
            }
            this.f71873g = 2;
            this.f71869c.a(this.f71870d, iU, y.ITEM_TO_PLACEHOLDER);
            this.f71870d += iU;
            return true;
        }

        private final void i() {
            int iMin = Math.min(this.f71867a.i(), this.f71870d);
            int i10 = this.f71868b.i() - this.f71870d;
            if (i10 > 0) {
                if (iMin > 0) {
                    this.f71869c.a(0, iMin, y.PLACEHOLDER_POSITION_CHANGE);
                }
                this.f71869c.b(0, i10);
            } else if (i10 < 0) {
                this.f71869c.c(0, -i10);
                int i11 = iMin + i10;
                if (i11 > 0) {
                    this.f71869c.a(0, i11, y.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.f71870d = this.f71868b.i();
        }

        private final void k() {
            int iMin = Math.min(this.f71867a.k(), this.f71871e);
            int iK = this.f71868b.k();
            int i10 = this.f71871e;
            int i11 = iK - i10;
            int i12 = this.f71870d + this.f71872f + i10;
            int i13 = i12 - iMin;
            boolean z10 = i13 != this.f71867a.getSize() - iMin;
            if (i11 > 0) {
                this.f71869c.b(i12, i11);
            } else if (i11 < 0) {
                this.f71869c.c(i12 + i11, -i11);
                iMin += i11;
            }
            if (iMin > 0 && z10) {
                this.f71869c.a(i13, iMin, y.PLACEHOLDER_POSITION_CHANGE);
            }
            this.f71871e = this.f71868b.k();
        }

        private final int l(int i10) {
            return i10 + this.f71870d;
        }

        @Override // androidx.recyclerview.widget.v
        public void a(int i10, int i11, @Nullable Object obj) {
            this.f71869c.a(i10 + this.f71870d, i11, obj);
        }

        @Override // androidx.recyclerview.widget.v
        public void b(int i10, int i11) {
            if (!e(i10, i11) && !f(i10, i11)) {
                this.f71869c.b(i10 + this.f71870d, i11);
            }
            this.f71872f += i11;
        }

        @Override // androidx.recyclerview.widget.v
        public void c(int i10, int i11) {
            if (!g(i10, i11) && !h(i10, i11)) {
                this.f71869c.c(i10 + this.f71870d, i11);
            }
            this.f71872f -= i11;
        }

        @Override // androidx.recyclerview.widget.v
        public void d(int i10, int i11) {
            androidx.recyclerview.widget.v vVar = this.f71869c;
            int i12 = this.f71870d;
            vVar.d(i10 + i12, i11 + i12);
        }

        public final void j() {
            i();
            k();
        }
    }

    private f1() {
    }

    public final <T> void a(@NotNull l2<T> oldList, @NotNull l2<T> newList, @NotNull androidx.recyclerview.widget.v callback, @NotNull k2 diffResult) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        a aVar = new a(oldList, newList, callback);
        diffResult.a().d(aVar);
        aVar.j();
    }
}
